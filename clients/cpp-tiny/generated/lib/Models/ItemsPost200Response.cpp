

#include "Items_post_200_response.h"

using namespace Tiny;

Items_post_200_response::Items_post_200_response()
{
	items = std::list<ItemResponse>();
}

Items_post_200_response::Items_post_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Items_post_200_response::~Items_post_200_response()
{

}

void
Items_post_200_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<ItemResponse> items_list;
        ItemResponse element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
Items_post_200_response::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ItemResponse> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        ItemResponse obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<ItemResponse>
Items_post_200_response::getItems()
{
	return items;
}

void
Items_post_200_response::setItems(std::list<ItemResponse> items)
{
	this->items = items;
}



