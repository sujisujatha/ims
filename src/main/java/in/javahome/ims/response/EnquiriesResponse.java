package in.javahome.ims.response;

import in.javahome.ims.pojo.EnquiryModel;

import java.util.List;

public class EnquiriesResponse extends Response {
	
	private List<EnquiryModel> enquiries;

	public List<EnquiryModel> getEnquiries() {
		return enquiries;
	}

	public void setEnquiries(List<EnquiryModel> enquiries) {
		this.enquiries = enquiries;
	}
	

}
