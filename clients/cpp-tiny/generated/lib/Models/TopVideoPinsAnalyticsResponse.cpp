

#include "TopVideoPinsAnalyticsResponse.h"

using namespace Tiny;

TopVideoPinsAnalyticsResponse::TopVideoPinsAnalyticsResponse()
{
	date_availability = TopVideoPinsAnalyticsResponseDateAvailability();
	pins = std::list<TopVideoPinsAnalyticsResponsePinsItems>();
	sort_by = TopVideoPinsSortBy();
}

TopVideoPinsAnalyticsResponse::TopVideoPinsAnalyticsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

TopVideoPinsAnalyticsResponse::~TopVideoPinsAnalyticsResponse()
{

}

void
TopVideoPinsAnalyticsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *date_availabilityKey = "date_availability";

    if(object.has_key(date_availabilityKey))
    {
        bourne::json value = object[date_availabilityKey];




        TopVideoPinsAnalyticsResponseDateAvailability* obj = &date_availability;
		obj->fromJson(value.dump());

    }

    const char *pinsKey = "pins";

    if(object.has_key(pinsKey))
    {
        bourne::json value = object[pinsKey];


        std::list<TopVideoPinsAnalyticsResponsePinsItems> pins_list;
        TopVideoPinsAnalyticsResponsePinsItems element;
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




        TopVideoPinsSortBy* obj = &sort_by;
		obj->fromJson(value.dump());

    }


}

bourne::json
TopVideoPinsAnalyticsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["date_availability"] = getDateAvailability().toJson();




    std::list<TopVideoPinsAnalyticsResponsePinsItems> pins_list = getPins();
    bourne::json pins_arr = bourne::json::array();

    for(auto& var : pins_list)
    {
        TopVideoPinsAnalyticsResponsePinsItems obj = var;
        pins_arr.append(obj.toJson());
    }
    object["pins"] = pins_arr;








	object["sort_by"] = getSortBy().toJson();


    return object;

}

TopVideoPinsAnalyticsResponseDateAvailability
TopVideoPinsAnalyticsResponse::getDateAvailability()
{
	return date_availability;
}

void
TopVideoPinsAnalyticsResponse::setDateAvailability(TopVideoPinsAnalyticsResponseDateAvailability date_availability)
{
	this->date_availability = date_availability;
}

std::list<TopVideoPinsAnalyticsResponsePinsItems>
TopVideoPinsAnalyticsResponse::getPins()
{
	return pins;
}

void
TopVideoPinsAnalyticsResponse::setPins(std::list<TopVideoPinsAnalyticsResponsePinsItems> pins)
{
	this->pins = pins;
}

TopVideoPinsSortBy
TopVideoPinsAnalyticsResponse::getSortBy()
{
	return sort_by;
}

void
TopVideoPinsAnalyticsResponse::setSortBy(TopVideoPinsSortBy sort_by)
{
	this->sort_by = sort_by;
}



