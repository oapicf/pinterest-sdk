

#include "Board.h"

using namespace Tiny;

Board::Board()
{
	board_pins_modified_at = std::string();
	collaborator_count = int(0);
	created_at = std::string();
	description = std::string();
	follower_count = int(0);
	id = std::string();
	is_ads_only = bool(false);
	media = null;
	name = std::string();
	owner = null;
	pin_count = int(0);
	privacy = null;
}

Board::Board(std::string jsonString)
{
	this->fromJson(jsonString);
}

Board::~Board()
{

}

void
Board::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *board_pins_modified_atKey = "board_pins_modified_at";

    if(object.has_key(board_pins_modified_atKey))
    {
        bourne::json value = object[board_pins_modified_atKey];



        jsonToValue(&board_pins_modified_at, value, "std::string");


    }

    const char *collaborator_countKey = "collaborator_count";

    if(object.has_key(collaborator_countKey))
    {
        bourne::json value = object[collaborator_countKey];



        jsonToValue(&collaborator_count, value, "int");


    }

    const char *created_atKey = "created_at";

    if(object.has_key(created_atKey))
    {
        bourne::json value = object[created_atKey];



        jsonToValue(&created_at, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *follower_countKey = "follower_count";

    if(object.has_key(follower_countKey))
    {
        bourne::json value = object[follower_countKey];



        jsonToValue(&follower_count, value, "int");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *is_ads_onlyKey = "is_ads_only";

    if(object.has_key(is_ads_onlyKey))
    {
        bourne::json value = object[is_ads_onlyKey];



        jsonToValue(&is_ads_only, value, "bool");


    }

    const char *mediaKey = "media";

    if(object.has_key(mediaKey))
    {
        bourne::json value = object[mediaKey];




        BoardMedia* obj = &media;
		obj->fromJson(value.dump());

    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *ownerKey = "owner";

    if(object.has_key(ownerKey))
    {
        bourne::json value = object[ownerKey];




        BoardOwner* obj = &owner;
		obj->fromJson(value.dump());

    }

    const char *pin_countKey = "pin_count";

    if(object.has_key(pin_countKey))
    {
        bourne::json value = object[pin_countKey];



        jsonToValue(&pin_count, value, "int");


    }

    const char *privacyKey = "privacy";

    if(object.has_key(privacyKey))
    {
        bourne::json value = object[privacyKey];




        BoardPrivacy* obj = &privacy;
		obj->fromJson(value.dump());

    }


}

bourne::json
Board::toJson()
{
    bourne::json object = bourne::json::object();





    object["board_pins_modified_at"] = getBoardPinsModifiedAt();






    object["collaborator_count"] = getCollaboratorCount();






    object["created_at"] = getCreatedAt();






    object["description"] = getDescription();






    object["follower_count"] = getFollowerCount();






    object["id"] = getId();






    object["is_ads_only"] = isIsAdsOnly();







	object["media"] = getMedia().toJson();





    object["name"] = getName();







	object["owner"] = getOwner().toJson();





    object["pin_count"] = getPinCount();







	object["privacy"] = getPrivacy().toJson();


    return object;

}

std::string
Board::getBoardPinsModifiedAt()
{
	return board_pins_modified_at;
}

void
Board::setBoardPinsModifiedAt(std::string board_pins_modified_at)
{
	this->board_pins_modified_at = board_pins_modified_at;
}

int
Board::getCollaboratorCount()
{
	return collaborator_count;
}

void
Board::setCollaboratorCount(int collaborator_count)
{
	this->collaborator_count = collaborator_count;
}

std::string
Board::getCreatedAt()
{
	return created_at;
}

void
Board::setCreatedAt(std::string created_at)
{
	this->created_at = created_at;
}

std::string
Board::getDescription()
{
	return description;
}

void
Board::setDescription(std::string description)
{
	this->description = description;
}

int
Board::getFollowerCount()
{
	return follower_count;
}

void
Board::setFollowerCount(int follower_count)
{
	this->follower_count = follower_count;
}

std::string
Board::getId()
{
	return id;
}

void
Board::setId(std::string id)
{
	this->id = id;
}

bool
Board::isIsAdsOnly()
{
	return is_ads_only;
}

void
Board::setIsAdsOnly(bool is_ads_only)
{
	this->is_ads_only = is_ads_only;
}

BoardMedia
Board::getMedia()
{
	return media;
}

void
Board::setMedia(BoardMedia media)
{
	this->media = media;
}

std::string
Board::getName()
{
	return name;
}

void
Board::setName(std::string name)
{
	this->name = name;
}

BoardOwner
Board::getOwner()
{
	return owner;
}

void
Board::setOwner(BoardOwner owner)
{
	this->owner = owner;
}

int
Board::getPinCount()
{
	return pin_count;
}

void
Board::setPinCount(int pin_count)
{
	this->pin_count = pin_count;
}

BoardPrivacy
Board::getPrivacy()
{
	return privacy;
}

void
Board::setPrivacy(BoardPrivacy privacy)
{
	this->privacy = privacy;
}



