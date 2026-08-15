

#include "AudienceDefinitionScope.h"

using namespace Tiny;

AudienceDefinitionScope::AudienceDefinitionScope()
{
	scope = std::string();
}

AudienceDefinitionScope::AudienceDefinitionScope(std::string jsonString)
{
	this->fromJson(jsonString);
}

AudienceDefinitionScope::~AudienceDefinitionScope()
{

}

void
AudienceDefinitionScope::fromJson(std::string jsonObj)
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
AudienceDefinitionScope::toJson()
{
    bourne::json object = bourne::json::object();





    object["scope"] = getScope();



    return object;

}

std::string
AudienceDefinitionScope::getScope()
{
	return scope;
}

void
AudienceDefinitionScope::setScope(std::string  scope)
{
	this->scope = scope;
}



