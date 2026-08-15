

#include "KeywordsCommon.h"

using namespace Tiny;

KeywordsCommon::KeywordsCommon()
{
	bid = int(0);
	match_type = MatchTypeResponse();
	value = std::string();
}

KeywordsCommon::KeywordsCommon(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeywordsCommon::~KeywordsCommon()
{

}

void
KeywordsCommon::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bidKey = "bid";

    if(object.has_key(bidKey))
    {
        bourne::json value = object[bidKey];



        jsonToValue(&bid, value, "int");


    }

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
KeywordsCommon::toJson()
{
    bourne::json object = bourne::json::object();





    object["bid"] = getBid();







	object["match_type"] = getMatchType().toJson();





    object["value"] = getValue();



    return object;

}

int
KeywordsCommon::getBid()
{
	return bid;
}

void
KeywordsCommon::setBid(int  bid)
{
	this->bid = bid;
}

MatchTypeResponse
KeywordsCommon::getMatchType()
{
	return match_type;
}

void
KeywordsCommon::setMatchType(MatchTypeResponse  match_type)
{
	this->match_type = match_type;
}

std::string
KeywordsCommon::getValue()
{
	return value;
}

void
KeywordsCommon::setValue(std::string  value)
{
	this->value = value;
}



