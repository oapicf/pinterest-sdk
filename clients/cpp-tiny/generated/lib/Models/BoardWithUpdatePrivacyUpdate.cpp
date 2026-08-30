

#include "BoardWithUpdatePrivacyUpdate.h"

using namespace Tiny;

BoardWithUpdatePrivacyUpdate::BoardWithUpdatePrivacyUpdate()
{
	description = std::string();
	name = std::string();
	privacy = BoardUpdatePrivacy();
}

BoardWithUpdatePrivacyUpdate::BoardWithUpdatePrivacyUpdate(std::string jsonString)
{
	this->fromJson(jsonString);
}

BoardWithUpdatePrivacyUpdate::~BoardWithUpdatePrivacyUpdate()
{

}

void
BoardWithUpdatePrivacyUpdate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


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
BoardWithUpdatePrivacyUpdate::toJson()
{
    bourne::json object = bourne::json::object();





    object["description"] = getDescription();






    object["name"] = getName();







	object["privacy"] = getPrivacy().toJson();


    return object;

}

std::string
BoardWithUpdatePrivacyUpdate::getDescription()
{
	return description;
}

void
BoardWithUpdatePrivacyUpdate::setDescription(std::string description)
{
	this->description = description;
}

std::string
BoardWithUpdatePrivacyUpdate::getName()
{
	return name;
}

void
BoardWithUpdatePrivacyUpdate::setName(std::string name)
{
	this->name = name;
}

BoardUpdatePrivacy
BoardWithUpdatePrivacyUpdate::getPrivacy()
{
	return privacy;
}

void
BoardWithUpdatePrivacyUpdate::setPrivacy(BoardUpdatePrivacy privacy)
{
	this->privacy = privacy;
}



