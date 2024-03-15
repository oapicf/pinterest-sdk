#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UserWebsiteSummary.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UserWebsiteSummary::UserWebsiteSummary()
{
	//__init();
}

UserWebsiteSummary::~UserWebsiteSummary()
{
	//__cleanup();
}

void
UserWebsiteSummary::__init()
{
	//website = std::string();
	//status = std::string();
	//verified_at = std::string();
}

void
UserWebsiteSummary::__cleanup()
{
	//if(website != NULL) {
	//
	//delete website;
	//website = NULL;
	//}
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
	//
}

void
UserWebsiteSummary::fromJson(char* jsonStr)
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
}

UserWebsiteSummary::UserWebsiteSummary(char* json)
{
	this->fromJson(json);
}

char*
UserWebsiteSummary::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UserWebsiteSummary::getWebsite()
{
	return website;
}

void
UserWebsiteSummary::setWebsite(std::string  website)
{
	this->website = website;
}

std::string
UserWebsiteSummary::getStatus()
{
	return status;
}

void
UserWebsiteSummary::setStatus(std::string  status)
{
	this->status = status;
}

std::string
UserWebsiteSummary::getVerifiedAt()
{
	return verified_at;
}

void
UserWebsiteSummary::setVerifiedAt(std::string  verified_at)
{
	this->verified_at = verified_at;
}


