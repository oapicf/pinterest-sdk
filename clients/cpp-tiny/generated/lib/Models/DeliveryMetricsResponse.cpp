

#include "DeliveryMetricsResponse.h"

using namespace Tiny;

DeliveryMetricsResponse::DeliveryMetricsResponse()
{
	items = std::list<DeliveryMetricsResponse_items_inner>();
}

DeliveryMetricsResponse::DeliveryMetricsResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeliveryMetricsResponse::~DeliveryMetricsResponse()
{

}

void
DeliveryMetricsResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<DeliveryMetricsResponse_items_inner> items_list;
        DeliveryMetricsResponse_items_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
DeliveryMetricsResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<DeliveryMetricsResponse_items_inner> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        DeliveryMetricsResponse_items_inner obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<DeliveryMetricsResponse_items_inner>
DeliveryMetricsResponse::getItems()
{
	return items;
}

void
DeliveryMetricsResponse::setItems(std::list <DeliveryMetricsResponse_items_inner> items)
{
	this->items = items;
}



