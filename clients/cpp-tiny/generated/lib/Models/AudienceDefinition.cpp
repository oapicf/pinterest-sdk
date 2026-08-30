

#include "AudienceDefinition.h"

using namespace Tiny;

AudienceDefinition::AudienceDefinition()
{
	date = std::string();
	scope = std::string();
	type = std::string();
}

AudienceDefinition::AudienceDefinition(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceDefinition::~AudienceDefinition()
{

}

void
AudienceDefinition::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dateKey = "date";

    if(object.has_key(dateKey))
    {
        bourne::json value = object[dateKey];



        jsonToValue(&date, value, "std::string");


    }

    const char *scopeKey = "scope";

    if(object.has_key(scopeKey))
    {
        bourne::json value = object[scopeKey];



        jsonToValue(&scope, value, "std::string");


    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];



        jsonToValue(&type, value, "std::string");


    }


}

bourne::json
AudienceDefinition::toJson()
{
    bourne::json object = bourne::json::object();





    object["date"] = getDate();






    object["scope"] = getScope();






    object["type"] = getType();



    return object;

}

std::string
AudienceDefinition::getDate()
{
	return date;
}

void
AudienceDefinition::setDate(std::string date)
{
	this->date = date;
}

std::string
AudienceDefinition::getScope()
{
	return scope;
}

void
AudienceDefinition::setScope(std::string scope)
{
	this->scope = scope;
}

std::string
AudienceDefinition::getType()
{
	return type;
}

void
AudienceDefinition::setType(std::string type)
{
	this->type = type;
}



