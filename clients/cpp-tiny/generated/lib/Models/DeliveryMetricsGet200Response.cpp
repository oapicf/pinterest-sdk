

#include "Delivery_metrics_get_200_response.h"

using namespace Tiny;

Delivery_metrics_get_200_response::Delivery_metrics_get_200_response()
{
	items = std::list<DeliveryMetricsResponseItemsItems>();
}

Delivery_metrics_get_200_response::Delivery_metrics_get_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Delivery_metrics_get_200_response::~Delivery_metrics_get_200_response()
{

}

void
Delivery_metrics_get_200_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<DeliveryMetricsResponseItemsItems> items_list;
        DeliveryMetricsResponseItemsItems element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
Delivery_metrics_get_200_response::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<DeliveryMetricsResponseItemsItems> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        DeliveryMetricsResponseItemsItems obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<DeliveryMetricsResponseItemsItems>
Delivery_metrics_get_200_response::getItems()
{
	return items;
}

void
Delivery_metrics_get_200_response::setItems(std::list<DeliveryMetricsResponseItemsItems> items)
{
	this->items = items;
}



