#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomerListUploadCreateResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomerListUploadCreateResponse::CustomerListUploadCreateResponse()
{
	//__init();
}

CustomerListUploadCreateResponse::~CustomerListUploadCreateResponse()
{
	//__cleanup();
}

void
CustomerListUploadCreateResponse::__init()
{
	//customer_list_upload = null;
	//s3_multipart_upload_data = null;
}

void
CustomerListUploadCreateResponse::__cleanup()
{
	//if(customer_list_upload != NULL) {
	//
	//delete customer_list_upload;
	//customer_list_upload = NULL;
	//}
	//if(s3_multipart_upload_data != NULL) {
	//
	//delete s3_multipart_upload_data;
	//s3_multipart_upload_data = NULL;
	//}
	//
}

void
CustomerListUploadCreateResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *customer_list_uploadKey = "customer_list_upload";
	node = json_object_get_member(pJsonObject, customer_list_uploadKey);
	if (node !=NULL) {
	

		if (isprimitive("CustomerListUpload")) {
			jsonToValue(&customer_list_upload, node, "CustomerListUpload", "CustomerListUpload");
		} else {
			
			CustomerListUpload* obj = static_cast<CustomerListUpload*> (&customer_list_upload);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *s3_multipart_upload_dataKey = "s3_multipart_upload_data";
	node = json_object_get_member(pJsonObject, s3_multipart_upload_dataKey);
	if (node !=NULL) {
	

		if (isprimitive("S3MultipartUploadData")) {
			jsonToValue(&s3_multipart_upload_data, node, "S3MultipartUploadData", "S3MultipartUploadData");
		} else {
			
			S3MultipartUploadData* obj = static_cast<S3MultipartUploadData*> (&s3_multipart_upload_data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CustomerListUploadCreateResponse::CustomerListUploadCreateResponse(char* json)
{
	this->fromJson(json);
}

char*
CustomerListUploadCreateResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CustomerListUpload")) {
		CustomerListUpload obj = getCustomerListUpload();
		node = converttoJson(&obj, "CustomerListUpload", "");
	}
	else {
		
		CustomerListUpload obj = static_cast<CustomerListUpload> (getCustomerListUpload());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *customer_list_uploadKey = "customer_list_upload";
	json_object_set_member(pJsonObject, customer_list_uploadKey, node);
	if (isprimitive("S3MultipartUploadData")) {
		S3MultipartUploadData obj = getS3MultipartUploadData();
		node = converttoJson(&obj, "S3MultipartUploadData", "");
	}
	else {
		
		S3MultipartUploadData obj = static_cast<S3MultipartUploadData> (getS3MultipartUploadData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *s3_multipart_upload_dataKey = "s3_multipart_upload_data";
	json_object_set_member(pJsonObject, s3_multipart_upload_dataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CustomerListUpload
CustomerListUploadCreateResponse::getCustomerListUpload()
{
	return customer_list_upload;
}

void
CustomerListUploadCreateResponse::setCustomerListUpload(CustomerListUpload  customer_list_upload)
{
	this->customer_list_upload = customer_list_upload;
}

S3MultipartUploadData
CustomerListUploadCreateResponse::getS3MultipartUploadData()
{
	return s3_multipart_upload_data;
}

void
CustomerListUploadCreateResponse::setS3MultipartUploadData(S3MultipartUploadData  s3_multipart_upload_data)
{
	this->s3_multipart_upload_data = s3_multipart_upload_data;
}


