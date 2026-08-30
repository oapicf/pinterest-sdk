

#include "Advertiser_defined_events_create_200_response.h"

using namespace Tiny;

Advertiser_defined_events_create_200_response::Advertiser_defined_events_create_200_response()
{
	items = std::list<AdvertiserDefinedEventProcessingRecord>();
}

Advertiser_defined_events_create_200_response::Advertiser_defined_events_create_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Advertiser_defined_events_create_200_response::~Advertiser_defined_events_create_200_response()
{

}

void
Advertiser_defined_events_create_200_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<AdvertiserDefinedEventProcessingRecord> items_list;
        AdvertiserDefinedEventProcessingRecord element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
Advertiser_defined_events_create_200_response::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AdvertiserDefinedEventProcessingRecord> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        AdvertiserDefinedEventProcessingRecord obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<AdvertiserDefinedEventProcessingRecord>
Advertiser_defined_events_create_200_response::getItems()
{
	return items;
}

void
Advertiser_defined_events_create_200_response::setItems(std::list<AdvertiserDefinedEventProcessingRecord> items)
{
	this->items = items;
}



