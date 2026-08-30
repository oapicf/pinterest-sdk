

#include "Ad_groups_create_200_response.h"

using namespace Tiny;

Ad_groups_create_200_response::Ad_groups_create_200_response()
{
	items = std::list<Ad_groups_create_200_response_items_inner>();
}

Ad_groups_create_200_response::Ad_groups_create_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Ad_groups_create_200_response::~Ad_groups_create_200_response()
{

}

void
Ad_groups_create_200_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<Ad_groups_create_200_response_items_inner> items_list;
        Ad_groups_create_200_response_items_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
Ad_groups_create_200_response::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<Ad_groups_create_200_response_items_inner> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        Ad_groups_create_200_response_items_inner obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<Ad_groups_create_200_response_items_inner>
Ad_groups_create_200_response::getItems()
{
	return items;
}

void
Ad_groups_create_200_response::setItems(std::list<Ad_groups_create_200_response_items_inner> items)
{
	this->items = items;
}



