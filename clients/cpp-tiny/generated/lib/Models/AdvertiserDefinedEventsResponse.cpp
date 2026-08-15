

#include "AdvertiserDefinedEventsResponse.h"

using namespace Tiny;

AdvertiserDefinedEventsResponse::AdvertiserDefinedEventsResponse()
{
	items = std::list<AdvertiserDefinedEvent>();
}

AdvertiserDefinedEventsResponse::AdvertiserDefinedEventsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvertiserDefinedEventsResponse::~AdvertiserDefinedEventsResponse()
{

}

void
AdvertiserDefinedEventsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<AdvertiserDefinedEvent> items_list;
        AdvertiserDefinedEvent element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
AdvertiserDefinedEventsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AdvertiserDefinedEvent> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        AdvertiserDefinedEvent obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<AdvertiserDefinedEvent>
AdvertiserDefinedEventsResponse::getItems()
{
	return items;
}

void
AdvertiserDefinedEventsResponse::setItems(std::list <AdvertiserDefinedEvent> items)
{
	this->items = items;
}



