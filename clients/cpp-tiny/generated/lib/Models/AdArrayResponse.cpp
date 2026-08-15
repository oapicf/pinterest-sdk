

#include "AdArrayResponse.h"

using namespace Tiny;

AdArrayResponse::AdArrayResponse()
{
	items = std::list<AdArrayResponseElement>();
}

AdArrayResponse::AdArrayResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdArrayResponse::~AdArrayResponse()
{

}

void
AdArrayResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<AdArrayResponseElement> items_list;
        AdArrayResponseElement element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
AdArrayResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AdArrayResponseElement> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        AdArrayResponseElement obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<AdArrayResponseElement>
AdArrayResponse::getItems()
{
	return items;
}

void
AdArrayResponse::setItems(std::list <AdArrayResponseElement> items)
{
	this->items = items;
}



