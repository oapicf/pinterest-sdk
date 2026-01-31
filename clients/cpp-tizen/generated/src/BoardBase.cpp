#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BoardBase.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BoardBase::BoardBase()
{
	//__init();
}

BoardBase::~BoardBase()
{
	//__cleanup();
}

void
BoardBase::__init()
{
	//board_pins_modified_at = null;
	//collaborator_count = int(0);
	//created_at = null;
	//description = std::string();
	//follower_count = int(0);
	//id = std::string();
	//is_ads_only = bool(false);
	//media = null;
	//name = std::string();
	//owner = null;
	//pin_count = int(0);
}

void
BoardBase::__cleanup()
{
	//if(board_pins_modified_at != NULL) {
	//
	//delete board_pins_modified_at;
	//board_pins_modified_at = NULL;
	//}
	//if(collaborator_count != NULL) {
	//
	//delete collaborator_count;
	//collaborator_count = NULL;
	//}
	//if(created_at != NULL) {
	//
	//delete created_at;
	//created_at = NULL;
	//}
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(follower_count != NULL) {
	//
	//delete follower_count;
	//follower_count = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(is_ads_only != NULL) {
	//
	//delete is_ads_only;
	//is_ads_only = NULL;
	//}
	//if(media != NULL) {
	//
	//delete media;
	//media = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(owner != NULL) {
	//
	//delete owner;
	//owner = NULL;
	//}
	//if(pin_count != NULL) {
	//
	//delete pin_count;
	//pin_count = NULL;
	//}
	//
}

void
BoardBase::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *board_pins_modified_atKey = "board_pins_modified_at";
	node = json_object_get_member(pJsonObject, board_pins_modified_atKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&board_pins_modified_at, node, "std::string", "");
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
	const gchar *created_atKey = "created_at";
	node = json_object_get_member(pJsonObject, created_atKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&created_at, node, "std::string", "");
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
	const gchar *follower_countKey = "follower_count";
	node = json_object_get_member(pJsonObject, follower_countKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&follower_count, node, "int", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
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
	const gchar *mediaKey = "media";
	node = json_object_get_member(pJsonObject, mediaKey);
	if (node !=NULL) {
	

		if (isprimitive("BoardMedia")) {
			jsonToValue(&media, node, "BoardMedia", "BoardMedia");
		} else {
			
			BoardMedia* obj = static_cast<BoardMedia*> (&media);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *ownerKey = "owner";
	node = json_object_get_member(pJsonObject, ownerKey);
	if (node !=NULL) {
	

		if (isprimitive("BoardOwner")) {
			jsonToValue(&owner, node, "BoardOwner", "BoardOwner");
		} else {
			
			BoardOwner* obj = static_cast<BoardOwner*> (&owner);
			obj->fromJson(json_to_string(node, false));
			
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
}

BoardBase::BoardBase(char* json)
{
	this->fromJson(json);
}

char*
BoardBase::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getBoardPinsModifiedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *board_pins_modified_atKey = "board_pins_modified_at";
	json_object_set_member(pJsonObject, board_pins_modified_atKey, node);
	if (isprimitive("int")) {
		int obj = getCollaboratorCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *collaborator_countKey = "collaborator_count";
	json_object_set_member(pJsonObject, collaborator_countKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreatedAt();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *created_atKey = "created_at";
	json_object_set_member(pJsonObject, created_atKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("int")) {
		int obj = getFollowerCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *follower_countKey = "follower_count";
	json_object_set_member(pJsonObject, follower_countKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsAdsOnly();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_ads_onlyKey = "is_ads_only";
	json_object_set_member(pJsonObject, is_ads_onlyKey, node);
	if (isprimitive("BoardMedia")) {
		BoardMedia obj = getMedia();
		node = converttoJson(&obj, "BoardMedia", "");
	}
	else {
		
		BoardMedia obj = static_cast<BoardMedia> (getMedia());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *mediaKey = "media";
	json_object_set_member(pJsonObject, mediaKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("BoardOwner")) {
		BoardOwner obj = getOwner();
		node = converttoJson(&obj, "BoardOwner", "");
	}
	else {
		
		BoardOwner obj = static_cast<BoardOwner> (getOwner());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ownerKey = "owner";
	json_object_set_member(pJsonObject, ownerKey, node);
	if (isprimitive("int")) {
		int obj = getPinCount();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *pin_countKey = "pin_count";
	json_object_set_member(pJsonObject, pin_countKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BoardBase::getBoardPinsModifiedAt()
{
	return board_pins_modified_at;
}

void
BoardBase::setBoardPinsModifiedAt(std::string  board_pins_modified_at)
{
	this->board_pins_modified_at = board_pins_modified_at;
}

int
BoardBase::getCollaboratorCount()
{
	return collaborator_count;
}

void
BoardBase::setCollaboratorCount(int  collaborator_count)
{
	this->collaborator_count = collaborator_count;
}

std::string
BoardBase::getCreatedAt()
{
	return created_at;
}

void
BoardBase::setCreatedAt(std::string  created_at)
{
	this->created_at = created_at;
}

std::string
BoardBase::getDescription()
{
	return description;
}

void
BoardBase::setDescription(std::string  description)
{
	this->description = description;
}

int
BoardBase::getFollowerCount()
{
	return follower_count;
}

void
BoardBase::setFollowerCount(int  follower_count)
{
	this->follower_count = follower_count;
}

std::string
BoardBase::getId()
{
	return id;
}

void
BoardBase::setId(std::string  id)
{
	this->id = id;
}

bool
BoardBase::getIsAdsOnly()
{
	return is_ads_only;
}

void
BoardBase::setIsAdsOnly(bool  is_ads_only)
{
	this->is_ads_only = is_ads_only;
}

BoardMedia
BoardBase::getMedia()
{
	return media;
}

void
BoardBase::setMedia(BoardMedia  media)
{
	this->media = media;
}

std::string
BoardBase::getName()
{
	return name;
}

void
BoardBase::setName(std::string  name)
{
	this->name = name;
}

BoardOwner
BoardBase::getOwner()
{
	return owner;
}

void
BoardBase::setOwner(BoardOwner  owner)
{
	this->owner = owner;
}

int
BoardBase::getPinCount()
{
	return pin_count;
}

void
BoardBase::setPinCount(int  pin_count)
{
	this->pin_count = pin_count;
}


