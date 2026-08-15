

#include "AdvancedAuctionItemsGetRecord.h"

using namespace Tiny;

AdvancedAuctionItemsGetRecord::AdvancedAuctionItemsGetRecord()
{
	country = Country();
	item_id = std::string();
	language = Language();
}

AdvancedAuctionItemsGetRecord::AdvancedAuctionItemsGetRecord(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvancedAuctionItemsGetRecord::~AdvancedAuctionItemsGetRecord()
{

}

void
AdvancedAuctionItemsGetRecord::fromJson(std::string jsonObj)
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
AdvancedAuctionItemsGetRecord::toJson()
{
    bourne::json object = bourne::json::object();






	object["country"] = getCountry().toJson();





    object["item_id"] = getItemId();







	object["language"] = getLanguage().toJson();


    return object;

}

Country
AdvancedAuctionItemsGetRecord::getCountry()
{
	return country;
}

void
AdvancedAuctionItemsGetRecord::setCountry(Country  country)
{
	this->country = country;
}

std::string
AdvancedAuctionItemsGetRecord::getItemId()
{
	return item_id;
}

void
AdvancedAuctionItemsGetRecord::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

Language
AdvancedAuctionItemsGetRecord::getLanguage()
{
	return language;
}

void
AdvancedAuctionItemsGetRecord::setLanguage(Language  language)
{
	this->language = language;
}



