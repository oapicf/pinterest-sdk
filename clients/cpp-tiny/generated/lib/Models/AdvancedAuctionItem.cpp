

#include "AdvancedAuctionItem.h"

using namespace Tiny;

AdvancedAuctionItem::AdvancedAuctionItem()
{
	bid_options = AdvancedAuctionBidOptions();
	country = Country();
	item_id = std::string();
	language = Language();
}

AdvancedAuctionItem::AdvancedAuctionItem(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvancedAuctionItem::~AdvancedAuctionItem()
{

}

void
AdvancedAuctionItem::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bid_optionsKey = "bid_options";

    if(object.has_key(bid_optionsKey))
    {
        bourne::json value = object[bid_optionsKey];




        AdvancedAuctionBidOptions* obj = &bid_options;
		obj->fromJson(value.dump());

    }

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
AdvancedAuctionItem::toJson()
{
    bourne::json object = bourne::json::object();






	object["bid_options"] = getBidOptions().toJson();






	object["country"] = getCountry().toJson();





    object["item_id"] = getItemId();







	object["language"] = getLanguage().toJson();


    return object;

}

AdvancedAuctionBidOptions
AdvancedAuctionItem::getBidOptions()
{
	return bid_options;
}

void
AdvancedAuctionItem::setBidOptions(AdvancedAuctionBidOptions bid_options)
{
	this->bid_options = bid_options;
}

Country
AdvancedAuctionItem::getCountry()
{
	return country;
}

void
AdvancedAuctionItem::setCountry(Country country)
{
	this->country = country;
}

std::string
AdvancedAuctionItem::getItemId()
{
	return item_id;
}

void
AdvancedAuctionItem::setItemId(std::string item_id)
{
	this->item_id = item_id;
}

Language
AdvancedAuctionItem::getLanguage()
{
	return language;
}

void
AdvancedAuctionItem::setLanguage(Language language)
{
	this->language = language;
}



