#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UserWebsiteVerificationCode.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UserWebsiteVerificationCode::UserWebsiteVerificationCode()
{
	//__init();
}

UserWebsiteVerificationCode::~UserWebsiteVerificationCode()
{
	//__cleanup();
}

void
UserWebsiteVerificationCode::__init()
{
	//verification_code = std::string();
	//dns_txt_record = std::string();
	//metatag = std::string();
	//filename = std::string();
	//file_content = std::string();
}

void
UserWebsiteVerificationCode::__cleanup()
{
	//if(verification_code != NULL) {
	//
	//delete verification_code;
	//verification_code = NULL;
	//}
	//if(dns_txt_record != NULL) {
	//
	//delete dns_txt_record;
	//dns_txt_record = NULL;
	//}
	//if(metatag != NULL) {
	//
	//delete metatag;
	//metatag = NULL;
	//}
	//if(filename != NULL) {
	//
	//delete filename;
	//filename = NULL;
	//}
	//if(file_content != NULL) {
	//
	//delete file_content;
	//file_content = NULL;
	//}
	//
}

void
UserWebsiteVerificationCode::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *verification_codeKey = "verification_code";
	node = json_object_get_member(pJsonObject, verification_codeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&verification_code, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *dns_txt_recordKey = "dns_txt_record";
	node = json_object_get_member(pJsonObject, dns_txt_recordKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&dns_txt_record, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *metatagKey = "metatag";
	node = json_object_get_member(pJsonObject, metatagKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&metatag, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *filenameKey = "filename";
	node = json_object_get_member(pJsonObject, filenameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&filename, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *file_contentKey = "file_content";
	node = json_object_get_member(pJsonObject, file_contentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&file_content, node, "std::string", "");
		} else {
			
		}
	}
}

UserWebsiteVerificationCode::UserWebsiteVerificationCode(char* json)
{
	this->fromJson(json);
}

char*
UserWebsiteVerificationCode::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getVerificationCode();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *verification_codeKey = "verification_code";
	json_object_set_member(pJsonObject, verification_codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDnsTxtRecord();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *dns_txt_recordKey = "dns_txt_record";
	json_object_set_member(pJsonObject, dns_txt_recordKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMetatag();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *metatagKey = "metatag";
	json_object_set_member(pJsonObject, metatagKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFilename();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *filenameKey = "filename";
	json_object_set_member(pJsonObject, filenameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFileContent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *file_contentKey = "file_content";
	json_object_set_member(pJsonObject, file_contentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UserWebsiteVerificationCode::getVerificationCode()
{
	return verification_code;
}

void
UserWebsiteVerificationCode::setVerificationCode(std::string  verification_code)
{
	this->verification_code = verification_code;
}

std::string
UserWebsiteVerificationCode::getDnsTxtRecord()
{
	return dns_txt_record;
}

void
UserWebsiteVerificationCode::setDnsTxtRecord(std::string  dns_txt_record)
{
	this->dns_txt_record = dns_txt_record;
}

std::string
UserWebsiteVerificationCode::getMetatag()
{
	return metatag;
}

void
UserWebsiteVerificationCode::setMetatag(std::string  metatag)
{
	this->metatag = metatag;
}

std::string
UserWebsiteVerificationCode::getFilename()
{
	return filename;
}

void
UserWebsiteVerificationCode::setFilename(std::string  filename)
{
	this->filename = filename;
}

std::string
UserWebsiteVerificationCode::getFileContent()
{
	return file_content;
}

void
UserWebsiteVerificationCode::setFileContent(std::string  file_content)
{
	this->file_content = file_content;
}


