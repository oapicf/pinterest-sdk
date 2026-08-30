#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DynamicTitlesUploadURL.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DynamicTitlesUploadURL::DynamicTitlesUploadURL()
{
	//__init();
}

DynamicTitlesUploadURL::~DynamicTitlesUploadURL()
{
	//__cleanup();
}

void
DynamicTitlesUploadURL::__init()
{
	//existing_filename = std::string();
	//request_id = std::string();
	//upload_url = std::string();
}

void
DynamicTitlesUploadURL::__cleanup()
{
	//if(existing_filename != NULL) {
	//
	//delete existing_filename;
	//existing_filename = NULL;
	//}
	//if(request_id != NULL) {
	//
	//delete request_id;
	//request_id = NULL;
	//}
	//if(upload_url != NULL) {
	//
	//delete upload_url;
	//upload_url = NULL;
	//}
	//
}

void
DynamicTitlesUploadURL::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *existing_filenameKey = "existing_filename";
	node = json_object_get_member(pJsonObject, existing_filenameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&existing_filename, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *request_idKey = "request_id";
	node = json_object_get_member(pJsonObject, request_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&request_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *upload_urlKey = "upload_url";
	node = json_object_get_member(pJsonObject, upload_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&upload_url, node, "std::string", "");
		} else {
			
		}
	}
}

DynamicTitlesUploadURL::DynamicTitlesUploadURL(char* json)
{
	this->fromJson(json);
}

char*
DynamicTitlesUploadURL::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getExistingFilename();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *existing_filenameKey = "existing_filename";
	json_object_set_member(pJsonObject, existing_filenameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRequestId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *request_idKey = "request_id";
	json_object_set_member(pJsonObject, request_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUploadUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *upload_urlKey = "upload_url";
	json_object_set_member(pJsonObject, upload_urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
DynamicTitlesUploadURL::getExistingFilename()
{
	return existing_filename;
}

void
DynamicTitlesUploadURL::setExistingFilename(std::string  existing_filename)
{
	this->existing_filename = existing_filename;
}

std::string
DynamicTitlesUploadURL::getRequestId()
{
	return request_id;
}

void
DynamicTitlesUploadURL::setRequestId(std::string  request_id)
{
	this->request_id = request_id;
}

std::string
DynamicTitlesUploadURL::getUploadUrl()
{
	return upload_url;
}

void
DynamicTitlesUploadURL::setUploadUrl(std::string  upload_url)
{
	this->upload_url = upload_url;
}


