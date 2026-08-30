

#include "BoardWithUpdatePrivacy.h"

using namespace Tiny;

BoardWithUpdatePrivacy::BoardWithUpdatePrivacy()
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
	privacy = BoardUpdatePrivacy();
}

BoardWithUpdatePrivacy::BoardWithUpdatePrivacy(std::string jsonString)
{
	this->fromJson(jsonString);
}

BoardWithUpdatePrivacy::~BoardWithUpdatePrivacy()
{

}

void
BoardWithUpdatePrivacy::fromJson(std::string jsonObj)
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




        BoardUpdatePrivacy* obj = &privacy;
		obj->fromJson(value.dump());

    }


}

bourne::json
BoardWithUpdatePrivacy::toJson()
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
BoardWithUpdatePrivacy::getBoardPinsModifiedAt()
{
	return board_pins_modified_at;
}

void
BoardWithUpdatePrivacy::setBoardPinsModifiedAt(std::string board_pins_modified_at)
{
	this->board_pins_modified_at = board_pins_modified_at;
}

int
BoardWithUpdatePrivacy::getCollaboratorCount()
{
	return collaborator_count;
}

void
BoardWithUpdatePrivacy::setCollaboratorCount(int collaborator_count)
{
	this->collaborator_count = collaborator_count;
}

std::string
BoardWithUpdatePrivacy::getCreatedAt()
{
	return created_at;
}

void
BoardWithUpdatePrivacy::setCreatedAt(std::string created_at)
{
	this->created_at = created_at;
}

std::string
BoardWithUpdatePrivacy::getDescription()
{
	return description;
}

void
BoardWithUpdatePrivacy::setDescription(std::string description)
{
	this->description = description;
}

int
BoardWithUpdatePrivacy::getFollowerCount()
{
	return follower_count;
}

void
BoardWithUpdatePrivacy::setFollowerCount(int follower_count)
{
	this->follower_count = follower_count;
}

std::string
BoardWithUpdatePrivacy::getId()
{
	return id;
}

void
BoardWithUpdatePrivacy::setId(std::string id)
{
	this->id = id;
}

bool
BoardWithUpdatePrivacy::isIsAdsOnly()
{
	return is_ads_only;
}

void
BoardWithUpdatePrivacy::setIsAdsOnly(bool is_ads_only)
{
	this->is_ads_only = is_ads_only;
}

BoardMedia
BoardWithUpdatePrivacy::getMedia()
{
	return media;
}

void
BoardWithUpdatePrivacy::setMedia(BoardMedia media)
{
	this->media = media;
}

std::string
BoardWithUpdatePrivacy::getName()
{
	return name;
}

void
BoardWithUpdatePrivacy::setName(std::string name)
{
	this->name = name;
}

BoardOwner
BoardWithUpdatePrivacy::getOwner()
{
	return owner;
}

void
BoardWithUpdatePrivacy::setOwner(BoardOwner owner)
{
	this->owner = owner;
}

int
BoardWithUpdatePrivacy::getPinCount()
{
	return pin_count;
}

void
BoardWithUpdatePrivacy::setPinCount(int pin_count)
{
	this->pin_count = pin_count;
}

BoardUpdatePrivacy
BoardWithUpdatePrivacy::getPrivacy()
{
	return privacy;
}

void
BoardWithUpdatePrivacy::setPrivacy(BoardUpdatePrivacy privacy)
{
	this->privacy = privacy;
}



