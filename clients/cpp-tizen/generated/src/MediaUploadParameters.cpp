#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MediaUploadParameters.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MediaUploadParameters::MediaUploadParameters()
{
	//__init();
}

MediaUploadParameters::~MediaUploadParameters()
{
	//__cleanup();
}

void
MediaUploadParameters::__init()
{
	//contentType = std::string();
	//key = std::string();
	//policy = std::string();
	//xamzalgorithm = std::string();
	//xamzcredential = std::string();
	//xamzdate = std::string();
	//xamzsecuritytoken = std::string();
	//xamzsignature = std::string();
}

void
MediaUploadParameters::__cleanup()
{
	//if(contentType != NULL) {
	//
	//delete contentType;
	//contentType = NULL;
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
	//if(xamzalgorithm != NULL) {
	//
	//delete xamzalgorithm;
	//xamzalgorithm = NULL;
	//}
	//if(xamzcredential != NULL) {
	//
	//delete xamzcredential;
	//xamzcredential = NULL;
	//}
	//if(xamzdate != NULL) {
	//
	//delete xamzdate;
	//xamzdate = NULL;
	//}
	//if(xamzsecuritytoken != NULL) {
	//
	//delete xamzsecuritytoken;
	//xamzsecuritytoken = NULL;
	//}
	//if(xamzsignature != NULL) {
	//
	//delete xamzsignature;
	//xamzsignature = NULL;
	//}
	//
}

void
MediaUploadParameters::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *contentTypeKey = "Content-Type";
	node = json_object_get_member(pJsonObject, contentTypeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&contentType, node, "std::string", "");
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
	const gchar *xamzalgorithmKey = "x-amz-algorithm";
	node = json_object_get_member(pJsonObject, xamzalgorithmKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&xamzalgorithm, node, "std::string", "");
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
	const gchar *xamzdateKey = "x-amz-date";
	node = json_object_get_member(pJsonObject, xamzdateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&xamzdate, node, "std::string", "");
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
	const gchar *xamzsignatureKey = "x-amz-signature";
	node = json_object_get_member(pJsonObject, xamzsignatureKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&xamzsignature, node, "std::string", "");
		} else {
			
		}
	}
}

MediaUploadParameters::MediaUploadParameters(char* json)
{
	this->fromJson(json);
}

char*
MediaUploadParameters::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getContentType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *contentTypeKey = "Content-Type";
	json_object_set_member(pJsonObject, contentTypeKey, node);
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
		std::string obj = getXamzalgorithm();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *xamzalgorithmKey = "x-amz-algorithm";
	json_object_set_member(pJsonObject, xamzalgorithmKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getXamzcredential();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *xamzcredentialKey = "x-amz-credential";
	json_object_set_member(pJsonObject, xamzcredentialKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getXamzdate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *xamzdateKey = "x-amz-date";
	json_object_set_member(pJsonObject, xamzdateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getXamzsecuritytoken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *xamzsecuritytokenKey = "x-amz-security-token";
	json_object_set_member(pJsonObject, xamzsecuritytokenKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getXamzsignature();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *xamzsignatureKey = "x-amz-signature";
	json_object_set_member(pJsonObject, xamzsignatureKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MediaUploadParameters::getContentType()
{
	return contentType;
}

void
MediaUploadParameters::setContentType(std::string  contentType)
{
	this->contentType = contentType;
}

std::string
MediaUploadParameters::getKey()
{
	return key;
}

void
MediaUploadParameters::setKey(std::string  key)
{
	this->key = key;
}

std::string
MediaUploadParameters::getPolicy()
{
	return policy;
}

void
MediaUploadParameters::setPolicy(std::string  policy)
{
	this->policy = policy;
}

std::string
MediaUploadParameters::getXamzalgorithm()
{
	return xamzalgorithm;
}

void
MediaUploadParameters::setXamzalgorithm(std::string  xamzalgorithm)
{
	this->xamzalgorithm = xamzalgorithm;
}

std::string
MediaUploadParameters::getXamzcredential()
{
	return xamzcredential;
}

void
MediaUploadParameters::setXamzcredential(std::string  xamzcredential)
{
	this->xamzcredential = xamzcredential;
}

std::string
MediaUploadParameters::getXamzdate()
{
	return xamzdate;
}

void
MediaUploadParameters::setXamzdate(std::string  xamzdate)
{
	this->xamzdate = xamzdate;
}

std::string
MediaUploadParameters::getXamzsecuritytoken()
{
	return xamzsecuritytoken;
}

void
MediaUploadParameters::setXamzsecuritytoken(std::string  xamzsecuritytoken)
{
	this->xamzsecuritytoken = xamzsecuritytoken;
}

std::string
MediaUploadParameters::getXamzsignature()
{
	return xamzsignature;
}

void
MediaUploadParameters::setXamzsignature(std::string  xamzsignature)
{
	this->xamzsignature = xamzsignature;
}


