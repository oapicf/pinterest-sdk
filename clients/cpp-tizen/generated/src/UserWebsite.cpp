#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UserWebsite.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UserWebsite::UserWebsite()
{
	//__init();
}

UserWebsite::~UserWebsite()
{
	//__cleanup();
}

void
UserWebsite::__init()
{
	//status = std::string();
	//verified_at = std::string();
	//website = std::string();
}

void
UserWebsite::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(verified_at != NULL) {
	//
	//delete verified_at;
	//verified_at = NULL;
	//}
	//if(website != NULL) {
	//
	//delete website;
	//website = NULL;
	//}
	//
}

void
UserWebsite::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *verified_atKey = "verified_at";
	node = json_object_get_member(pJsonObject, verified_atKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&verified_at, node, "std::string", "");
		} else {
			
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

UserWebsite::UserWebsite(char* json)
{
	this->fromJson(json);
}

char*
UserWebsite::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVerifiedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *verified_atKey = "verified_at";
	json_object_set_member(pJsonObject, verified_atKey, node);
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

std::string
UserWebsite::getStatus()
{
	return status;
}

void
UserWebsite::setStatus(std::string  status)
{
	this->status = status;
}

std::string
UserWebsite::getVerifiedAt()
{
	return verified_at;
}

void
UserWebsite::setVerifiedAt(std::string  verified_at)
{
	this->verified_at = verified_at;
}

std::string
UserWebsite::getWebsite()
{
	return website;
}

void
UserWebsite::setWebsite(std::string  website)
{
	this->website = website;
}


