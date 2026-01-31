#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BoardCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BoardCreate::BoardCreate()
{
	//__init();
}

BoardCreate::~BoardCreate()
{
	//__cleanup();
}

void
BoardCreate::__init()
{
	//description = std::string();
	//is_ads_only = bool(false);
	//name = std::string();
	//privacy = null;
}

void
BoardCreate::__cleanup()
{
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(is_ads_only != NULL) {
	//
	//delete is_ads_only;
	//is_ads_only = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(privacy != NULL) {
	//
	//delete privacy;
	//privacy = NULL;
	//}
	//
}

void
BoardCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_ads_onlyKey = "is_ads_only";
	node = json_object_get_member(pJsonObject, is_ads_onlyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_ads_only, node, "bool", "");
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
	const gchar *privacyKey = "privacy";
	node = json_object_get_member(pJsonObject, privacyKey);
	if (node !=NULL) {
	

		if (isprimitive("BoardPrivacy")) {
			jsonToValue(&privacy, node, "BoardPrivacy", "BoardPrivacy");
		} else {
			
			BoardPrivacy* obj = static_cast<BoardPrivacy*> (&privacy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BoardCreate::BoardCreate(char* json)
{
	this->fromJson(json);
}

char*
BoardCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsAdsOnly();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_ads_onlyKey = "is_ads_only";
	json_object_set_member(pJsonObject, is_ads_onlyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("BoardPrivacy")) {
		BoardPrivacy obj = getPrivacy();
		node = converttoJson(&obj, "BoardPrivacy", "");
	}
	else {
		
		BoardPrivacy obj = static_cast<BoardPrivacy> (getPrivacy());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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
BoardCreate::getDescription()
{
	return description;
}

void
BoardCreate::setDescription(std::string  description)
{
	this->description = description;
}

bool
BoardCreate::getIsAdsOnly()
{
	return is_ads_only;
}

void
BoardCreate::setIsAdsOnly(bool  is_ads_only)
{
	this->is_ads_only = is_ads_only;
}

std::string
BoardCreate::getName()
{
	return name;
}

void
BoardCreate::setName(std::string  name)
{
	this->name = name;
}

BoardPrivacy
BoardCreate::getPrivacy()
{
	return privacy;
}

void
BoardCreate::setPrivacy(BoardPrivacy  privacy)
{
	this->privacy = privacy;
}


