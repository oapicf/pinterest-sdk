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
	//created_at = null;
	//board_pins_modified_at = null;
	//name = std::string();
	//description = std::string();
	//collaborator_count = int(0);
	//pin_count = int(0);
	//follower_count = int(0);
	//media = new Board_media();
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
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(board_pins_modified_at != NULL) {
	//
	//delete board_pins_modified_at;
	//board_pins_modified_at = NULL;
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
	//if(collaborator_count != NULL) {
	//
	//delete collaborator_count;
	//collaborator_count = NULL;
	//}
	//if(pin_count != NULL) {
	//
	//delete pin_count;
	//pin_count = NULL;
	//}
	//if(follower_count != NULL) {
	//
	//delete follower_count;
	//follower_count = NULL;
	//}
	//if(media != NULL) {
	//
	//delete media;
	//media = NULL;
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
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&created_at, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *board_pins_modified_atKey = "board_pins_modified_at";
	node = json_object_get_member(pJsonObject, board_pins_modified_atKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&board_pins_modified_at, node, "std::string", "");
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
	const gchar *collaborator_countKey = "collaborator_count";
	node = json_object_get_member(pJsonObject, collaborator_countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&collaborator_count, node, "int", "");
		} else {
			
		}
	}
	const gchar *pin_countKey = "pin_count";
	node = json_object_get_member(pJsonObject, pin_countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pin_count, node, "int", "");
		} else {
			
		}
	}
	const gchar *follower_countKey = "follower_count";
	node = json_object_get_member(pJsonObject, follower_countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&follower_count, node, "int", "");
		} else {
			
		}
	}
	const gchar *mediaKey = "media";
	node = json_object_get_member(pJsonObject, mediaKey);
	if (node !=NULL) {
	

		if (isprimitive("Board_media")) {
			jsonToValue(&media, node, "Board_media", "Board_media");
		} else {
			
			Board_media* obj = static_cast<Board_media*> (&media);
			obj->fromJson(json_to_string(node, false));
			
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
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBoardPinsModifiedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *board_pins_modified_atKey = "board_pins_modified_at";
	json_object_set_member(pJsonObject, board_pins_modified_atKey, node);
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
	if (isprimitive("int")) {
		int obj = getCollaboratorCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *collaborator_countKey = "collaborator_count";
	json_object_set_member(pJsonObject, collaborator_countKey, node);
	if (isprimitive("int")) {
		int obj = getPinCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pin_countKey = "pin_count";
	json_object_set_member(pJsonObject, pin_countKey, node);
	if (isprimitive("int")) {
		int obj = getFollowerCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *follower_countKey = "follower_count";
	json_object_set_member(pJsonObject, follower_countKey, node);
	if (isprimitive("Board_media")) {
		Board_media obj = getMedia();
		node = converttoJson(&obj, "Board_media", "");
	}
	else {
		
		Board_media obj = static_cast<Board_media> (getMedia());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mediaKey = "media";
	json_object_set_member(pJsonObject, mediaKey, node);
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
Board::getCreatedAt()
{
	return created_at;
}

void
Board::setCreatedAt(std::string  created_at)
{
	this->created_at = created_at;
}

std::string
Board::getBoardPinsModifiedAt()
{
	return board_pins_modified_at;
}

void
Board::setBoardPinsModifiedAt(std::string  board_pins_modified_at)
{
	this->board_pins_modified_at = board_pins_modified_at;
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

int
Board::getCollaboratorCount()
{
	return collaborator_count;
}

void
Board::setCollaboratorCount(int  collaborator_count)
{
	this->collaborator_count = collaborator_count;
}

int
Board::getPinCount()
{
	return pin_count;
}

void
Board::setPinCount(int  pin_count)
{
	this->pin_count = pin_count;
}

int
Board::getFollowerCount()
{
	return follower_count;
}

void
Board::setFollowerCount(int  follower_count)
{
	this->follower_count = follower_count;
}

Board_media
Board::getMedia()
{
	return media;
}

void
Board::setMedia(Board_media  media)
{
	this->media = media;
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


