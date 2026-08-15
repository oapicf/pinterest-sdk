

#include "TopPinsAnalyticsResponse.h"

using namespace Tiny;

TopPinsAnalyticsResponse::TopPinsAnalyticsResponse()
{
	date_availability = TopPinsAnalyticsResponse_date_availability();
	pins = std::list<TopPinsAnalyticsResponse_pins_inner>();
	sort_by = std::string();
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




        TopPinsAnalyticsResponse_date_availability* obj = &date_availability;
		obj->fromJson(value.dump());

    }

    const char *pinsKey = "pins";

    if(object.has_key(pinsKey))
    {
        bourne::json value = object[pinsKey];


        std::list<TopPinsAnalyticsResponse_pins_inner> pins_list;
        TopPinsAnalyticsResponse_pins_inner element;
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



        jsonToValue(&sort_by, value, "std::string");


    }


}

bourne::json
TopPinsAnalyticsResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["date_availability"] = getDateAvailability().toJson();




    std::list<TopPinsAnalyticsResponse_pins_inner> pins_list = getPins();
    bourne::json pins_arr = bourne::json::array();

    for(auto& var : pins_list)
    {
        TopPinsAnalyticsResponse_pins_inner obj = var;
        pins_arr.append(obj.toJson());
    }
    object["pins"] = pins_arr;







    object["sort_by"] = getSortBy();



    return object;

}

TopPinsAnalyticsResponse_date_availability
TopPinsAnalyticsResponse::getDateAvailability()
{
	return date_availability;
}

void
TopPinsAnalyticsResponse::setDateAvailability(TopPinsAnalyticsResponse_date_availability  date_availability)
{
	this->date_availability = date_availability;
}

std::list<TopPinsAnalyticsResponse_pins_inner>
TopPinsAnalyticsResponse::getPins()
{
	return pins;
}

void
TopPinsAnalyticsResponse::setPins(std::list <TopPinsAnalyticsResponse_pins_inner> pins)
{
	this->pins = pins;
}

std::string
TopPinsAnalyticsResponse::getSortBy()
{
	return sort_by;
}

void
TopPinsAnalyticsResponse::setSortBy(std::string  sort_by)
{
	this->sort_by = sort_by;
}



