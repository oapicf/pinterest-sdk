

#include "BidOptionsPlacementMultipliers.h"

using namespace Tiny;

BidOptionsPlacementMultipliers::BidOptionsPlacementMultipliers()
{
	browse = float(0);
	related_pins = float(0);
	search = float(0);
}

BidOptionsPlacementMultipliers::BidOptionsPlacementMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

BidOptionsPlacementMultipliers::~BidOptionsPlacementMultipliers()
{

}

void
BidOptionsPlacementMultipliers::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *browseKey = "browse";

    if(object.has_key(browseKey))
    {
        bourne::json value = object[browseKey];



        jsonToValue(&browse, value, "long");


    }

    const char *related_pinsKey = "related_pins";

    if(object.has_key(related_pinsKey))
    {
        bourne::json value = object[related_pinsKey];



        jsonToValue(&related_pins, value, "long");


    }

    const char *searchKey = "search";

    if(object.has_key(searchKey))
    {
        bourne::json value = object[searchKey];



        jsonToValue(&search, value, "long");


    }


}

bourne::json
BidOptionsPlacementMultipliers::toJson()
{
    bourne::json object = bourne::json::object();





    object["browse"] = getBrowse();






    object["related_pins"] = getRelatedPins();






    object["search"] = getSearch();



    return object;

}

long
BidOptionsPlacementMultipliers::getBrowse()
{
	return browse;
}

void
BidOptionsPlacementMultipliers::setBrowse(long browse)
{
	this->browse = browse;
}

long
BidOptionsPlacementMultipliers::getRelatedPins()
{
	return related_pins;
}

void
BidOptionsPlacementMultipliers::setRelatedPins(long related_pins)
{
	this->related_pins = related_pins;
}

long
BidOptionsPlacementMultipliers::getSearch()
{
	return search;
}

void
BidOptionsPlacementMultipliers::setSearch(long search)
{
	this->search = search;
}



