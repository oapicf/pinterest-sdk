

#include "AdvancedAuctionKey.h"

using namespace Tiny;

AdvancedAuctionKey::AdvancedAuctionKey()
{
	country = Country();
	item_id = std::string();
	language = Language();
}

AdvancedAuctionKey::AdvancedAuctionKey(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvancedAuctionKey::~AdvancedAuctionKey()
{

}

void
AdvancedAuctionKey::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countryKey = "country";

    if(object.has_key(countryKey))
    {
        bourne::json value = object[countryKey];




        Country* obj = &country;
		obj->fromJson(value.dump());

    }

    const char *item_idKey = "item_id";

    if(object.has_key(item_idKey))
    {
        bourne::json value = object[item_idKey];



        jsonToValue(&item_id, value, "std::string");


    }

    const char *languageKey = "language";

    if(object.has_key(languageKey))
    {
        bourne::json value = object[languageKey];




        Language* obj = &language;
		obj->fromJson(value.dump());

    }


}

bourne::json
AdvancedAuctionKey::toJson()
{
    bourne::json object = bourne::json::object();






	object["country"] = getCountry().toJson();





    object["item_id"] = getItemId();







	object["language"] = getLanguage().toJson();


    return object;

}

Country
AdvancedAuctionKey::getCountry()
{
	return country;
}

void
AdvancedAuctionKey::setCountry(Country  country)
{
	this->country = country;
}

std::string
AdvancedAuctionKey::getItemId()
{
	return item_id;
}

void
AdvancedAuctionKey::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

Language
AdvancedAuctionKey::getLanguage()
{
	return language;
}

void
AdvancedAuctionKey::setLanguage(Language  language)
{
	this->language = language;
}



