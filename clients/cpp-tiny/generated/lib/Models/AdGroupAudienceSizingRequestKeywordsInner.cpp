

#include "AdGroupAudienceSizingRequest_keywords_inner.h"

using namespace Tiny;

AdGroupAudienceSizingRequest_keywords_inner::AdGroupAudienceSizingRequest_keywords_inner()
{
	match_type = MatchTypeResponse();
	value = std::string();
}

AdGroupAudienceSizingRequest_keywords_inner::AdGroupAudienceSizingRequest_keywords_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupAudienceSizingRequest_keywords_inner::~AdGroupAudienceSizingRequest_keywords_inner()
{

}

void
AdGroupAudienceSizingRequest_keywords_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *match_typeKey = "match_type";

    if(object.has_key(match_typeKey))
    {
        bourne::json value = object[match_typeKey];




        MatchTypeResponse* obj = &match_type;
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
AdGroupAudienceSizingRequest_keywords_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["match_type"] = getMatchType().toJson();





    object["value"] = getValue();



    return object;

}

MatchTypeResponse
AdGroupAudienceSizingRequest_keywords_inner::getMatchType()
{
	return match_type;
}

void
AdGroupAudienceSizingRequest_keywords_inner::setMatchType(MatchTypeResponse  match_type)
{
	this->match_type = match_type;
}

std::string
AdGroupAudienceSizingRequest_keywords_inner::getValue()
{
	return value;
}

void
AdGroupAudienceSizingRequest_keywords_inner::setValue(std::string  value)
{
	this->value = value;
}



