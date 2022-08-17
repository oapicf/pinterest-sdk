#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Board.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Board::Board()
{
	//__init();
}

Board::~Board()
{
	//__cleanup();
}

void
Board::__init()
{
	//id = std::string();
	//name = std::string();
	//description = std::string();
	//owner = new Board_owner();
	//privacy = std::string();
}

void
Board::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
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
	//if(owner != NULL) {
	//
	//delete owner;
	//owner = NULL;
	//}
	//if(privacy != NULL) {
	//
	//delete privacy;
	//privacy = NULL;
	//}
	//
}

void
Board::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
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
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ownerKey = "owner";
	node = json_object_get_member(pJsonObject, ownerKey);
	if (node !=NULL) {
	

		if (isprimitive("Board_owner")) {
			jsonToValue(&owner, node, "Board_owner", "Board_owner");
		} else {
			
			Board_owner* obj = static_cast<Board_owner*> (&owner);
			obj->fromJson(json_to_string(node, false));
			
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

Board::Board(char* json)
{
	this->fromJson(json);
}

char*
Board::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
	if (isprimitive("Board_owner")) {
		Board_owner obj = getOwner();
		node = converttoJson(&obj, "Board_owner", "");
	}
	else {
		
		Board_owner obj = static_cast<Board_owner> (getOwner());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ownerKey = "owner";
	json_object_set_member(pJsonObject, ownerKey, node);
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
Board::getId()
{
	return id;
}

void
Board::setId(std::string  id)
{
	this->id = id;
}

std::string
Board::getName()
{
	return name;
}

void
Board::setName(std::string  name)
{
	this->name = name;
}

std::string
Board::getDescription()
{
	return description;
}

void
Board::setDescription(std::string  description)
{
	this->description = description;
}

Board_owner
Board::getOwner()
{
	return owner;
}

void
Board::setOwner(Board_owner  owner)
{
	this->owner = owner;
}

std::string
Board::getPrivacy()
{
	return privacy;
}

void
Board::setPrivacy(std::string  privacy)
{
	this->privacy = privacy;
}


