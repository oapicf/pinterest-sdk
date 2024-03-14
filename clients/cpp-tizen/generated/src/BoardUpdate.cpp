#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BoardUpdate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BoardUpdate::BoardUpdate()
{
	//__init();
}

BoardUpdate::~BoardUpdate()
{
	//__cleanup();
}

void
BoardUpdate::__init()
{
	//name = std::string();
	//description = std::string();
	//privacy = std::string();
}

void
BoardUpdate::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(privacy != NULL) {
	//
	//delete privacy;
	//privacy = NULL;
	//}
	//
}

void
BoardUpdate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *privacyKey = "privacy";
	node = json_object_get_member(pJsonObject, privacyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&privacy, node, "std::string", "");
		} else {
			
		}
	}
}

BoardUpdate::BoardUpdate(char* json)
{
	this->fromJson(json);
}

char*
BoardUpdate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPrivacy();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *privacyKey = "privacy";
	json_object_set_member(pJsonObject, privacyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BoardUpdate::getName()
{
	return name;
}

void
BoardUpdate::setName(std::string  name)
{
	this->name = name;
}

std::string
BoardUpdate::getDescription()
{
	return description;
}

void
BoardUpdate::setDescription(std::string  description)
{
	this->description = description;
}

std::string
BoardUpdate::getPrivacy()
{
	return privacy;
}

void
BoardUpdate::setPrivacy(std::string  privacy)
{
	this->privacy = privacy;
}


