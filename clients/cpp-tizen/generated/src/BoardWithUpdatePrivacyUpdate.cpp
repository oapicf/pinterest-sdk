#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BoardWithUpdatePrivacyUpdate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BoardWithUpdatePrivacyUpdate::BoardWithUpdatePrivacyUpdate()
{
	//__init();
}

BoardWithUpdatePrivacyUpdate::~BoardWithUpdatePrivacyUpdate()
{
	//__cleanup();
}

void
BoardWithUpdatePrivacyUpdate::__init()
{
	//description = std::string();
	//name = std::string();
	//privacy = new BoardUpdatePrivacy();
}

void
BoardWithUpdatePrivacyUpdate::__cleanup()
{
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
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
BoardWithUpdatePrivacyUpdate::fromJson(char* jsonStr)
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
	

		if (isprimitive("BoardUpdatePrivacy")) {
			jsonToValue(&privacy, node, "BoardUpdatePrivacy", "BoardUpdatePrivacy");
		} else {
			
			BoardUpdatePrivacy* obj = static_cast<BoardUpdatePrivacy*> (&privacy);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BoardWithUpdatePrivacyUpdate::BoardWithUpdatePrivacyUpdate(char* json)
{
	this->fromJson(json);
}

char*
BoardWithUpdatePrivacyUpdate::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("BoardUpdatePrivacy")) {
		BoardUpdatePrivacy obj = getPrivacy();
		node = converttoJson(&obj, "BoardUpdatePrivacy", "");
	}
	else {
		
		BoardUpdatePrivacy obj = static_cast<BoardUpdatePrivacy> (getPrivacy());
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
BoardWithUpdatePrivacyUpdate::getDescription()
{
	return description;
}

void
BoardWithUpdatePrivacyUpdate::setDescription(std::string  description)
{
	this->description = description;
}

std::string
BoardWithUpdatePrivacyUpdate::getName()
{
	return name;
}

void
BoardWithUpdatePrivacyUpdate::setName(std::string  name)
{
	this->name = name;
}

BoardUpdatePrivacy
BoardWithUpdatePrivacyUpdate::getPrivacy()
{
	return privacy;
}

void
BoardWithUpdatePrivacyUpdate::setPrivacy(BoardUpdatePrivacy  privacy)
{
	this->privacy = privacy;
}


