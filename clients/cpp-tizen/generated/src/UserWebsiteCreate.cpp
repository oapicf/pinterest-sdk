#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UserWebsiteCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UserWebsiteCreate::UserWebsiteCreate()
{
	//__init();
}

UserWebsiteCreate::~UserWebsiteCreate()
{
	//__cleanup();
}

void
UserWebsiteCreate::__init()
{
	//verification_method = null;
	//website = std::string();
}

void
UserWebsiteCreate::__cleanup()
{
	//if(verification_method != NULL) {
	//
	//delete verification_method;
	//verification_method = NULL;
	//}
	//if(website != NULL) {
	//
	//delete website;
	//website = NULL;
	//}
	//
}

void
UserWebsiteCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *verification_methodKey = "verification_method";
	node = json_object_get_member(pJsonObject, verification_methodKey);
	if (node !=NULL) {
	

		if (isprimitive("WebsiteVerificationMethod")) {
			jsonToValue(&verification_method, node, "WebsiteVerificationMethod", "WebsiteVerificationMethod");
		} else {
			
			WebsiteVerificationMethod* obj = static_cast<WebsiteVerificationMethod*> (&verification_method);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *websiteKey = "website";
	node = json_object_get_member(pJsonObject, websiteKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&website, node, "std::string", "");
		} else {
			
		}
	}
}

UserWebsiteCreate::UserWebsiteCreate(char* json)
{
	this->fromJson(json);
}

char*
UserWebsiteCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("WebsiteVerificationMethod")) {
		WebsiteVerificationMethod obj = getVerificationMethod();
		node = converttoJson(&obj, "WebsiteVerificationMethod", "");
	}
	else {
		
		WebsiteVerificationMethod obj = static_cast<WebsiteVerificationMethod> (getVerificationMethod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *verification_methodKey = "verification_method";
	json_object_set_member(pJsonObject, verification_methodKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getWebsite();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *websiteKey = "website";
	json_object_set_member(pJsonObject, websiteKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

WebsiteVerificationMethod
UserWebsiteCreate::getVerificationMethod()
{
	return verification_method;
}

void
UserWebsiteCreate::setVerificationMethod(WebsiteVerificationMethod  verification_method)
{
	this->verification_method = verification_method;
}

std::string
UserWebsiteCreate::getWebsite()
{
	return website;
}

void
UserWebsiteCreate::setWebsite(std::string  website)
{
	this->website = website;
}


