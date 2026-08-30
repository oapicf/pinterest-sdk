

#include "AdvertiserDefinedEventsCreateRequest.h"

using namespace Tiny;

AdvertiserDefinedEventsCreateRequest::AdvertiserDefinedEventsCreateRequest()
{
	items = std::list<AdvertiserDefinedEventInput>();
}

AdvertiserDefinedEventsCreateRequest::AdvertiserDefinedEventsCreateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdvertiserDefinedEventsCreateRequest::~AdvertiserDefinedEventsCreateRequest()
{

}

void
AdvertiserDefinedEventsCreateRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<AdvertiserDefinedEventInput> items_list;
        AdvertiserDefinedEventInput element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
AdvertiserDefinedEventsCreateRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AdvertiserDefinedEventInput> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        AdvertiserDefinedEventInput obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<AdvertiserDefinedEventInput>
AdvertiserDefinedEventsCreateRequest::getItems()
{
	return items;
}

void
AdvertiserDefinedEventsCreateRequest::setItems(std::list<AdvertiserDefinedEventInput> items)
{
	this->items = items;
}



