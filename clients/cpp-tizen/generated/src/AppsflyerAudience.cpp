#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AppsflyerAudience.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AppsflyerAudience::AppsflyerAudience()
{
	//__init();
}

AppsflyerAudience::~AppsflyerAudience()
{
	//__cleanup();
}

void
AppsflyerAudience::__init()
{
	//container_id = std::string();
	//name = std::string();
	//platform = null;
}

void
AppsflyerAudience::__cleanup()
{
	//if(container_id != NULL) {
	//
	//delete container_id;
	//container_id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(platform != NULL) {
	//
	//delete platform;
	//platform = NULL;
	//}
	//
}

void
AppsflyerAudience::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *platformKey = "platform";
	node = json_object_get_member(pJsonObject, platformKey);
	if (node !=NULL) {
	

		if (isprimitive("AppsflyerPlatform")) {
			jsonToValue(&platform, node, "AppsflyerPlatform", "AppsflyerPlatform");
		} else {
			
			AppsflyerPlatform* obj = static_cast<AppsflyerPlatform*> (&platform);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AppsflyerAudience::AppsflyerAudience(char* json)
{
	this->fromJson(json);
}

char*
AppsflyerAudience::toJson()
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
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("AppsflyerPlatform")) {
		AppsflyerPlatform obj = getPlatform();
		node = converttoJson(&obj, "AppsflyerPlatform", "");
	}
	else {
		
		AppsflyerPlatform obj = static_cast<AppsflyerPlatform> (getPlatform());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *platformKey = "platform";
	json_object_set_member(pJsonObject, platformKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AppsflyerAudience::getContainerId()
{
	return container_id;
}

void
AppsflyerAudience::setContainerId(std::string  container_id)
{
	this->container_id = container_id;
}

std::string
AppsflyerAudience::getName()
{
	return name;
}

void
AppsflyerAudience::setName(std::string  name)
{
	this->name = name;
}

AppsflyerPlatform
AppsflyerAudience::getPlatform()
{
	return platform;
}

void
AppsflyerAudience::setPlatform(AppsflyerPlatform  platform)
{
	this->platform = platform;
}


