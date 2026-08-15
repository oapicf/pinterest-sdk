

#include "OrderLinesArrayResponse.h"

using namespace Tiny;

OrderLinesArrayResponse::OrderLinesArrayResponse()
{
	items = std::list<OrderLines>();
}

OrderLinesArrayResponse::OrderLinesArrayResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrderLinesArrayResponse::~OrderLinesArrayResponse()
{

}

void
OrderLinesArrayResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<OrderLines> items_list;
        OrderLines element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
OrderLinesArrayResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<OrderLines> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        OrderLines obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<OrderLines>
OrderLinesArrayResponse::getItems()
{
	return items;
}

void
OrderLinesArrayResponse::setItems(std::list <OrderLines> items)
{
	this->items = items;
}



