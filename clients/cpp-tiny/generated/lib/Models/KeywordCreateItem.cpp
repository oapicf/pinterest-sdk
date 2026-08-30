

#include "KeywordCreateItem.h"

using namespace Tiny;

KeywordCreateItem::KeywordCreateItem()
{
	bid = int(0);
	match_type = null;
	value = std::string();
}

KeywordCreateItem::KeywordCreateItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

KeywordCreateItem::~KeywordCreateItem()
{

}

void
KeywordCreateItem::fromJson(std::string jsonObj)
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
KeywordCreateItem::toJson()
{
    bourne::json object = bourne::json::object();





    object["bid"] = getBid();







	object["match_type"] = getMatchType().toJson();





    object["value"] = getValue();



    return object;

}

int
KeywordCreateItem::getBid()
{
	return bid;
}

void
KeywordCreateItem::setBid(int bid)
{
	this->bid = bid;
}

MatchType
KeywordCreateItem::getMatchType()
{
	return match_type;
}

void
KeywordCreateItem::setMatchType(MatchType match_type)
{
	this->match_type = match_type;
}

std::string
KeywordCreateItem::getValue()
{
	return value;
}

void
KeywordCreateItem::setValue(std::string value)
{
	this->value = value;
}



