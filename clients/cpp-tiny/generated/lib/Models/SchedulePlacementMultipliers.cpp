

#include "SchedulePlacementMultipliers.h"

using namespace Tiny;

SchedulePlacementMultipliers::SchedulePlacementMultipliers()
{
	browse = float(0);
	related_pins = float(0);
	search = float(0);
}

SchedulePlacementMultipliers::SchedulePlacementMultipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

SchedulePlacementMultipliers::~SchedulePlacementMultipliers()
{

}

void
SchedulePlacementMultipliers::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *browseKey = "browse";

    if(object.has_key(browseKey))
    {
        bourne::json value = object[browseKey];



        jsonToValue(&browse, value, "double");


    }

    const char *related_pinsKey = "related_pins";

    if(object.has_key(related_pinsKey))
    {
        bourne::json value = object[related_pinsKey];



        jsonToValue(&related_pins, value, "double");


    }

    const char *searchKey = "search";

    if(object.has_key(searchKey))
    {
        bourne::json value = object[searchKey];



        jsonToValue(&search, value, "double");


    }


}

bourne::json
SchedulePlacementMultipliers::toJson()
{
    bourne::json object = bourne::json::object();





    object["browse"] = getBrowse();






    object["related_pins"] = getRelatedPins();






    object["search"] = getSearch();



    return object;

}

double
SchedulePlacementMultipliers::getBrowse()
{
	return browse;
}

void
SchedulePlacementMultipliers::setBrowse(double browse)
{
	this->browse = browse;
}

double
SchedulePlacementMultipliers::getRelatedPins()
{
	return related_pins;
}

void
SchedulePlacementMultipliers::setRelatedPins(double related_pins)
{
	this->related_pins = related_pins;
}

double
SchedulePlacementMultipliers::getSearch()
{
	return search;
}

void
SchedulePlacementMultipliers::setSearch(double search)
{
	this->search = search;
}



