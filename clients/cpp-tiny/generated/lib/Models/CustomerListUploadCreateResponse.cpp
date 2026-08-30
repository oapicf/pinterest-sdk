

#include "CustomerListUploadCreateResponse.h"

using namespace Tiny;

CustomerListUploadCreateResponse::CustomerListUploadCreateResponse()
{
	customer_list_upload = null;
	s3_multipart_upload_data = null;
}

CustomerListUploadCreateResponse::CustomerListUploadCreateResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CustomerListUploadCreateResponse::~CustomerListUploadCreateResponse()
{

}

void
CustomerListUploadCreateResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *customer_list_uploadKey = "customer_list_upload";

    if(object.has_key(customer_list_uploadKey))
    {
        bourne::json value = object[customer_list_uploadKey];




        CustomerListUpload* obj = &customer_list_upload;
		obj->fromJson(value.dump());

    }

    const char *s3_multipart_upload_dataKey = "s3_multipart_upload_data";

    if(object.has_key(s3_multipart_upload_dataKey))
    {
        bourne::json value = object[s3_multipart_upload_dataKey];




        S3MultipartUploadData* obj = &s3_multipart_upload_data;
		obj->fromJson(value.dump());

    }


}

bourne::json
CustomerListUploadCreateResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["customer_list_upload"] = getCustomerListUpload().toJson();






	object["s3_multipart_upload_data"] = getS3MultipartUploadData().toJson();


    return object;

}

CustomerListUpload
CustomerListUploadCreateResponse::getCustomerListUpload()
{
	return customer_list_upload;
}

void
CustomerListUploadCreateResponse::setCustomerListUpload(CustomerListUpload customer_list_upload)
{
	this->customer_list_upload = customer_list_upload;
}

S3MultipartUploadData
CustomerListUploadCreateResponse::getS3MultipartUploadData()
{
	return s3_multipart_upload_data;
}

void
CustomerListUploadCreateResponse::setS3MultipartUploadData(S3MultipartUploadData s3_multipart_upload_data)
{
	this->s3_multipart_upload_data = s3_multipart_upload_data;
}



