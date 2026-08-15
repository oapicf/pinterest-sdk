

#include "AudienceDefinitionType.h"

using namespace Tiny;

AudienceDefinitionType::AudienceDefinitionType()
{
	scope = std::string();
}

AudienceDefinitionType::AudienceDefinitionType(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceDefinitionType::~AudienceDefinitionType()
{

}

void
AudienceDefinitionType::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *scopeKey = "scope";

    if(object.has_key(scopeKey))
    {
        bourne::json value = object[scopeKey];



        jsonToValue(&scope, value, "std::string");


    }


}

bourne::json
AudienceDefinitionType::toJson()
{
    bourne::json object = bourne::json::object();





    object["scope"] = getScope();



    return object;

}

std::string
AudienceDefinitionType::getScope()
{
	return scope;
}

void
AudienceDefinitionType::setScope(std::string  scope)
{
	this->scope = scope;
}



