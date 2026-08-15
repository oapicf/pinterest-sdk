

#include "BoardBase.h"

using namespace Tiny;

BoardBase::BoardBase()
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
}

BoardBase::BoardBase(std::string jsonString)
{
	this->fromJson(jsonString);
}

BoardBase::~BoardBase()
{

}

void
BoardBase::fromJson(std::string jsonObj)
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


}

bourne::json
BoardBase::toJson()
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



    return object;

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
BoardBase::isIsAdsOnly()
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



