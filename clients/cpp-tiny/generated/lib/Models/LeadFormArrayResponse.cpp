

#include "LeadFormArrayResponse.h"

using namespace Tiny;

LeadFormArrayResponse::LeadFormArrayResponse()
{
	items = std::list<LeadFormArrayResponse_items_inner>();
}

LeadFormArrayResponse::LeadFormArrayResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadFormArrayResponse::~LeadFormArrayResponse()
{

}

void
LeadFormArrayResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<LeadFormArrayResponse_items_inner> items_list;
        LeadFormArrayResponse_items_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
LeadFormArrayResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<LeadFormArrayResponse_items_inner> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        LeadFormArrayResponse_items_inner obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<LeadFormArrayResponse_items_inner>
LeadFormArrayResponse::getItems()
{
	return items;
}

void
LeadFormArrayResponse::setItems(std::list <LeadFormArrayResponse_items_inner> items)
{
	this->items = items;
}



