

#include "AdGroupAudienceSizingKeyword.h"

using namespace Tiny;

AdGroupAudienceSizingKeyword::AdGroupAudienceSizingKeyword()
{
	match_type = MatchType();
	value = std::string();
}

AdGroupAudienceSizingKeyword::AdGroupAudienceSizingKeyword(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupAudienceSizingKeyword::~AdGroupAudienceSizingKeyword()
{

}

void
AdGroupAudienceSizingKeyword::fromJson(std::string jsonObj)
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
AdGroupAudienceSizingKeyword::toJson()
{
    bourne::json object = bourne::json::object();






	object["match_type"] = getMatchType().toJson();





    object["value"] = getValue();



    return object;

}

MatchType
AdGroupAudienceSizingKeyword::getMatchType()
{
	return match_type;
}

void
AdGroupAudienceSizingKeyword::setMatchType(MatchType match_type)
{
	this->match_type = match_type;
}

std::string
AdGroupAudienceSizingKeyword::getValue()
{
	return value;
}

void
AdGroupAudienceSizingKeyword::setValue(std::string value)
{
	this->value = value;
}



