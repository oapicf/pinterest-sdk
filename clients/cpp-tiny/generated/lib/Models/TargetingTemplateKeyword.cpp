

#include "TargetingTemplateKeyword.h"

using namespace Tiny;

TargetingTemplateKeyword::TargetingTemplateKeyword()
{
	match_type = MatchType();
	value = std::string();
}

TargetingTemplateKeyword::TargetingTemplateKeyword(std::string jsonString)
{
	this->fromJson(jsonString);
}

TargetingTemplateKeyword::~TargetingTemplateKeyword()
{

}

void
TargetingTemplateKeyword::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *match_typeKey = "match_type";

    if(object.has_key(match_typeKey))
    {
        bourne::json value = object[match_typeKey];




        MatchType* obj = &match_type;
		obj->fromJson(value.dump());

    }

    const char *valueKey = "value";

    if(object.has_key(valueKey))
    {
        bourne::json value = object[valueKey];



        jsonToValue(&value, value, "std::string");


    }


}

bourne::json
TargetingTemplateKeyword::toJson()
{
    bourne::json object = bourne::json::object();






	object["match_type"] = getMatchType().toJson();





    object["value"] = getValue();



    return object;

}

MatchType
TargetingTemplateKeyword::getMatchType()
{
	return match_type;
}

void
TargetingTemplateKeyword::setMatchType(MatchType match_type)
{
	this->match_type = match_type;
}

std::string
TargetingTemplateKeyword::getValue()
{
	return value;
}

void
TargetingTemplateKeyword::setValue(std::string value)
{
	this->value = value;
}



