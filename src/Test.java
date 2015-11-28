import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import entities.ResponseData;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a JaxBContext
        try {
        	//File responseDataFile = new File("D:/PharmacyProjectBkUp/BkUp/19April2015/PharmacyDemo/WebContent/WEB-INF/ResponseData/Cache/CachedData.xml");
        	//File responseDataFile = new File("../WebContent/WEB-INF/ResponseData/Cache/CachedData.xml");
        	File responseDataFile = new File("WEB-INF/../WebContent/WEB-INF/ResponseData/Cache/CachedData.xml");
        	ResponseData ResponseDataObj = null;
			JAXBContext jc = JAXBContext.newInstance(ResponseData.class);
			Unmarshaller unmarshaller = jc.createUnmarshaller();
/*			unmarshaller.setProperty(UnmarshallerProperties.MEDIA_TYPE,
					"application/json");*/
			
			ResponseDataObj = (ResponseData) unmarshaller
                    .unmarshal(new StringReader(readFileToString(
                    		responseDataFile, "UTF-8")));
			System.out.println("Done");
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
    public static String readFileToString(File fileToRead,
            String contentEncodingTobeUsed) {

        FileInputStream fis = null;
        FileChannel channel = null;
        ByteBuffer buf = null;
        String sb = null;
        try {

            fis = new FileInputStream(fileToRead);
            channel = fis.getChannel();
            buf = ByteBuffer.allocateDirect((int) channel.size());
            channel.read(buf);
            buf.rewind();
            sb = Charset.forName(contentEncodingTobeUsed).decode(buf)
                    .toString();
            buf.flip();
        } catch (Exception ioexception) {

        } finally {
            try {
                if(channel != null){
                    channel.close();
                }
                if(fis != null){
                    fis.close();
                }
            } catch(IOException e) {
                sb = fileToRead.getAbsolutePath();
            }
        }

        return sb;
    }

}
