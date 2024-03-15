#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UserWebsiteVerifyRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UserWebsiteVerifyRequest::UserWebsiteVerifyRequest()
{
	//__init();
}

UserWebsiteVerifyRequest::~UserWebsiteVerifyRequest()
{
	//__cleanup();
}

void
UserWebsiteVerifyRequest::__init()
{
	//website = std::string();
	//verification_method = std::string();
}

void
UserWebsiteVerifyRequest::__cleanup()
{
	//if(website != NULL) {
	//
	//delete website;
	//website = NULL;
	//}
	//if(verification_method != NULL) {
	//
	//delete verification_method;
	//verification_method = NULL;
	//}
	//
}

void
UserWebsiteVerifyRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *websiteKey = "website";
	node = json_object_get_member(pJsonObject, websiteKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&website, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *verification_methodKey = "verification_method";
	node = json_object_get_member(pJsonObject, verification_methodKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&verification_method, node, "std::string", "");
		} else {
			
		}
	}
}

UserWebsiteVerifyRequest::UserWebsiteVerifyRequest(char* json)
{
	this->fromJson(json);
}

char*
UserWebsiteVerifyRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getWebsite();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *websiteKey = "website";
	json_object_set_member(pJsonObject, websiteKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVerificationMethod();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *verification_methodKey = "verification_method";
	json_object_set_member(pJsonObject, verification_methodKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UserWebsiteVerifyRequest::getWebsite()
{
	return website;
}

void
UserWebsiteVerifyRequest::setWebsite(std::string  website)
{
	this->website = website;
}

std::string
UserWebsiteVerifyRequest::getVerificationMethod()
{
	return verification_method;
}

void
UserWebsiteVerifyRequest::setVerificationMethod(std::string  verification_method)
{
	this->verification_method = verification_method;
}


