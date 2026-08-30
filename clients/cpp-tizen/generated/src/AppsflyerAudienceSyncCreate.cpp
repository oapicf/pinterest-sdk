#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AppsflyerAudienceSyncCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AppsflyerAudienceSyncCreate::AppsflyerAudienceSyncCreate()
{
	//__init();
}

AppsflyerAudienceSyncCreate::~AppsflyerAudienceSyncCreate()
{
	//__cleanup();
}

void
AppsflyerAudienceSyncCreate::__init()
{
	//container_id = std::string();
	//url_adid_sha256 = std::string();
	//url_email_sha256 = std::string();
}

void
AppsflyerAudienceSyncCreate::__cleanup()
{
	//if(container_id != NULL) {
	//
	//delete container_id;
	//container_id = NULL;
	//}
	//if(url_adid_sha256 != NULL) {
	//
	//delete url_adid_sha256;
	//url_adid_sha256 = NULL;
	//}
	//if(url_email_sha256 != NULL) {
	//
	//delete url_email_sha256;
	//url_email_sha256 = NULL;
	//}
	//
}

void
AppsflyerAudienceSyncCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *container_idKey = "container_id";
	node = json_object_get_member(pJsonObject, container_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&container_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *url_adid_sha256Key = "url_adid_sha256";
	node = json_object_get_member(pJsonObject, url_adid_sha256Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url_adid_sha256, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *url_email_sha256Key = "url_email_sha256";
	node = json_object_get_member(pJsonObject, url_email_sha256Key);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url_email_sha256, node, "std::string", "");
		} else {
			
		}
	}
}

AppsflyerAudienceSyncCreate::AppsflyerAudienceSyncCreate(char* json)
{
	this->fromJson(json);
}

char*
AppsflyerAudienceSyncCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getContainerId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *container_idKey = "container_id";
	json_object_set_member(pJsonObject, container_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrlAdidSha256();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *url_adid_sha256Key = "url_adid_sha256";
	json_object_set_member(pJsonObject, url_adid_sha256Key, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrlEmailSha256();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *url_email_sha256Key = "url_email_sha256";
	json_object_set_member(pJsonObject, url_email_sha256Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AppsflyerAudienceSyncCreate::getContainerId()
{
	return container_id;
}

void
AppsflyerAudienceSyncCreate::setContainerId(std::string  container_id)
{
	this->container_id = container_id;
}

std::string
AppsflyerAudienceSyncCreate::getUrlAdidSha256()
{
	return url_adid_sha256;
}

void
AppsflyerAudienceSyncCreate::setUrlAdidSha256(std::string  url_adid_sha256)
{
	this->url_adid_sha256 = url_adid_sha256;
}

std::string
AppsflyerAudienceSyncCreate::getUrlEmailSha256()
{
	return url_email_sha256;
}

void
AppsflyerAudienceSyncCreate::setUrlEmailSha256(std::string  url_email_sha256)
{
	this->url_email_sha256 = url_email_sha256;
}


