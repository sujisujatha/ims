package in.javahome.ims.service;

import in.javahome.ims.pojo.EnquiryModel;
import in.javahome.ims.response.EnquiriesResponse;
import in.javahome.ims.response.Response;

public interface IEnquiryService {
	public Response saveEnquiry(EnquiryModel enquiry);
	public EnquiriesResponse findAllEnquiries();
	public EnquiriesResponse findAllEnquiriesByCourseId(int courseId);
}
