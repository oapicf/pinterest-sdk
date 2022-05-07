#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MediaUpload_allOf_upload_parameters.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MediaUpload_allOf_upload_parameters::MediaUpload_allOf_upload_parameters()
{
	//__init();
}

MediaUpload_allOf_upload_parameters::~MediaUpload_allOf_upload_parameters()
{
	//__cleanup();
}

void
MediaUpload_allOf_upload_parameters::__init()
{
	//xamzdate = std::string();
	//xamzsignature = std::string();
	//xamzsecuritytoken = std::string();
	//xamzalgorithm = std::string();
	//key = std::string();
	//policy = std::string();
	//xamzcredential = std::string();
	//contentType = std::string();
}

void
MediaUpload_allOf_upload_parameters::__cleanup()
{
	//if(xamzdate != NULL) {
	//
	//delete xamzdate;
	//xamzdate = NULL;
	//}
	//if(xamzsignature != NULL) {
	//
	//delete xamzsignature;
	//xamzsignature = NULL;
	//}
	//if(xamzsecuritytoken != NULL) {
	//
	//delete xamzsecuritytoken;
	//xamzsecuritytoken = NULL;
	//}
	//if(xamzalgorithm != NULL) {
	//
	//delete xamzalgorithm;
	//xamzalgorithm = NULL;
	//}
	//if(key != NULL) {
	//
	//delete key;
	//key = NULL;
	//}
	//if(policy != NULL) {
	//
	//delete policy;
	//policy = NULL;
	//}
	//if(xamzcredential != NULL) {
	//
	//delete xamzcredential;
	//xamzcredential = NULL;
	//}
	//if(contentType != NULL) {
	//
	//delete contentType;
	//contentType = NULL;
	//}
	//
}

void
MediaUpload_allOf_upload_parameters::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *xamzdateKey = "x-amz-date";
	node = json_object_get_member(pJsonObject, xamzdateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&xamzdate, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *xamzsignatureKey = "x-amz-signature";
	node = json_object_get_member(pJsonObject, xamzsignatureKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&xamzsignature, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *xamzsecuritytokenKey = "x-amz-security-token";
	node = json_object_get_member(pJsonObject, xamzsecuritytokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&xamzsecuritytoken, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *xamzalgorithmKey = "x-amz-algorithm";
	node = json_object_get_member(pJsonObject, xamzalgorithmKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&xamzalgorithm, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *keyKey = "key";
	node = json_object_get_member(pJsonObject, keyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&key, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *policyKey = "policy";
	node = json_object_get_member(pJsonObject, policyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&policy, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *xamzcredentialKey = "x-amz-credential";
	node = json_object_get_member(pJsonObject, xamzcredentialKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&xamzcredential, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *contentTypeKey = "Content-Type";
	node = json_object_get_member(pJsonObject, contentTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&contentType, node, "std::string", "");
		} else {
			
		}
	}
}

MediaUpload_allOf_upload_parameters::MediaUpload_allOf_upload_parameters(char* json)
{
	this->fromJson(json);
}

char*
MediaUpload_allOf_upload_parameters::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getXamzdate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *xamzdateKey = "x-amz-date";
	json_object_set_member(pJsonObject, xamzdateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getXamzsignature();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *xamzsignatureKey = "x-amz-signature";
	json_object_set_member(pJsonObject, xamzsignatureKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getXamzsecuritytoken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *xamzsecuritytokenKey = "x-amz-security-token";
	json_object_set_member(pJsonObject, xamzsecuritytokenKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getXamzalgorithm();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *xamzalgorithmKey = "x-amz-algorithm";
	json_object_set_member(pJsonObject, xamzalgorithmKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getKey();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *keyKey = "key";
	json_object_set_member(pJsonObject, keyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPolicy();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *policyKey = "policy";
	json_object_set_member(pJsonObject, policyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getXamzcredential();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *xamzcredentialKey = "x-amz-credential";
	json_object_set_member(pJsonObject, xamzcredentialKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getContentType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *contentTypeKey = "Content-Type";
	json_object_set_member(pJsonObject, contentTypeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MediaUpload_allOf_upload_parameters::getXamzdate()
{
	return xamzdate;
}

void
MediaUpload_allOf_upload_parameters::setXamzdate(std::string  xamzdate)
{
	this->xamzdate = xamzdate;
}

std::string
MediaUpload_allOf_upload_parameters::getXamzsignature()
{
	return xamzsignature;
}

void
MediaUpload_allOf_upload_parameters::setXamzsignature(std::string  xamzsignature)
{
	this->xamzsignature = xamzsignature;
}

std::string
MediaUpload_allOf_upload_parameters::getXamzsecuritytoken()
{
	return xamzsecuritytoken;
}

void
MediaUpload_allOf_upload_parameters::setXamzsecuritytoken(std::string  xamzsecuritytoken)
{
	this->xamzsecuritytoken = xamzsecuritytoken;
}

std::string
MediaUpload_allOf_upload_parameters::getXamzalgorithm()
{
	return xamzalgorithm;
}

void
MediaUpload_allOf_upload_parameters::setXamzalgorithm(std::string  xamzalgorithm)
{
	this->xamzalgorithm = xamzalgorithm;
}

std::string
MediaUpload_allOf_upload_parameters::getKey()
{
	return key;
}

void
MediaUpload_allOf_upload_parameters::setKey(std::string  key)
{
	this->key = key;
}

std::string
MediaUpload_allOf_upload_parameters::getPolicy()
{
	return policy;
}

void
MediaUpload_allOf_upload_parameters::setPolicy(std::string  policy)
{
	this->policy = policy;
}

std::string
MediaUpload_allOf_upload_parameters::getXamzcredential()
{
	return xamzcredential;
}

void
MediaUpload_allOf_upload_parameters::setXamzcredential(std::string  xamzcredential)
{
	this->xamzcredential = xamzcredential;
}

std::string
MediaUpload_allOf_upload_parameters::getContentType()
{
	return contentType;
}

void
MediaUpload_allOf_upload_parameters::setContentType(std::string  contentType)
{
	this->contentType = contentType;
}


