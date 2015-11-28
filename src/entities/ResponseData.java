package entities;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "responseData")
public class ResponseData {
	
	private ListProductDetail listProductDetail ;
	private ListCompanyDetail listCompanyDetail ;
	private ListStockistDetail listStockistDetail ;
	public ListProductDetail getListProductDetail() {
		return listProductDetail;
	}
	public void setListProductDetail(ListProductDetail listProductDetail) {
		this.listProductDetail = listProductDetail;
	}
	public ListCompanyDetail getListCompanyDetail() {
		return listCompanyDetail;
	}
	public void setListCompanyDetail(ListCompanyDetail listCompanyDetail) {
		this.listCompanyDetail = listCompanyDetail;
	}
	public ListStockistDetail getListStockistDetail() {
		return listStockistDetail;
	}
	public void setListStockistDetail(ListStockistDetail listStockistDetail) {
		this.listStockistDetail = listStockistDetail;
	}

	
	
	

}
