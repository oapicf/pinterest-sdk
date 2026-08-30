

#include "ScheduleBidOptions_placement_multipliers.h"

using namespace Tiny;

ScheduleBidOptions_placement_multipliers::ScheduleBidOptions_placement_multipliers()
{
	browse = float(0);
	related_pins = float(0);
	search = float(0);
}

ScheduleBidOptions_placement_multipliers::ScheduleBidOptions_placement_multipliers(std::string jsonString)
{
	this->fromJson(jsonString);
}

ScheduleBidOptions_placement_multipliers::~ScheduleBidOptions_placement_multipliers()
{

}

void
ScheduleBidOptions_placement_multipliers::fromJson(std::string jsonObj)
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
ScheduleBidOptions_placement_multipliers::toJson()
{
    bourne::json object = bourne::json::object();





    object["browse"] = getBrowse();






    object["related_pins"] = getRelatedPins();






    object["search"] = getSearch();



    return object;

}

double
ScheduleBidOptions_placement_multipliers::getBrowse()
{
	return browse;
}

void
ScheduleBidOptions_placement_multipliers::setBrowse(double browse)
{
	this->browse = browse;
}

double
ScheduleBidOptions_placement_multipliers::getRelatedPins()
{
	return related_pins;
}

void
ScheduleBidOptions_placement_multipliers::setRelatedPins(double related_pins)
{
	this->related_pins = related_pins;
}

double
ScheduleBidOptions_placement_multipliers::getSearch()
{
	return search;
}

void
ScheduleBidOptions_placement_multipliers::setSearch(double search)
{
	this->search = search;
}



