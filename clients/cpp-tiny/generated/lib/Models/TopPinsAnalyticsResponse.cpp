

#include "TopPinsAnalyticsResponse.h"

using namespace Tiny;

TopPinsAnalyticsResponse::TopPinsAnalyticsResponse()
{
	date_availability = TopPinsAnalyticsResponseDateAvailability();
	pins = std::list<TopPinsAnalyticsResponsePinsItems>();
	sort_by = TopPinsSortBy();
}

TopPinsAnalyticsResponse::TopPinsAnalyticsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

TopPinsAnalyticsResponse::~TopPinsAnalyticsResponse()
{

}

void
TopPinsAnalyticsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *date_availabilityKey = "date_availability";

    if(object.has_key(date_availabilityKey))
    {
        bourne::json value = object[date_availabilityKey];




        TopPinsAnalyticsResponseDateAvailability* obj = &date_availability;
		obj->fromJson(value.dump());

    }

    const char *pinsKey = "pins";

    if(object.has_key(pinsKey))
    {
        bourne::json value = object[pinsKey];


        std::list<TopPinsAnalyticsResponsePinsItems> pins_list;
        TopPinsAnalyticsResponsePinsItems element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pins_list.push_back(element);
        }
        pins = pins_list;


    }

    const char *sort_byKey = "sort_by";

    if(object.has_key(sort_byKey))
    {
        bourne::json value = object[sort_byKey];




        TopPinsSortBy* obj = &sort_by;
		obj->fromJson(value.dump());

    }


}

bourne::json
TopPinsAnalyticsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["date_availability"] = getDateAvailability().toJson();




    std::list<TopPinsAnalyticsResponsePinsItems> pins_list = getPins();
    bourne::json pins_arr = bourne::json::array();

    for(auto& var : pins_list)
    {
        TopPinsAnalyticsResponsePinsItems obj = var;
        pins_arr.append(obj.toJson());
    }
    object["pins"] = pins_arr;








	object["sort_by"] = getSortBy().toJson();


    return object;

}

TopPinsAnalyticsResponseDateAvailability
TopPinsAnalyticsResponse::getDateAvailability()
{
	return date_availability;
}

void
TopPinsAnalyticsResponse::setDateAvailability(TopPinsAnalyticsResponseDateAvailability date_availability)
{
	this->date_availability = date_availability;
}

std::list<TopPinsAnalyticsResponsePinsItems>
TopPinsAnalyticsResponse::getPins()
{
	return pins;
}

void
TopPinsAnalyticsResponse::setPins(std::list<TopPinsAnalyticsResponsePinsItems> pins)
{
	this->pins = pins;
}

TopPinsSortBy
TopPinsAnalyticsResponse::getSortBy()
{
	return sort_by;
}

void
TopPinsAnalyticsResponse::setSortBy(TopPinsSortBy sort_by)
{
	this->sort_by = sort_by;
}



