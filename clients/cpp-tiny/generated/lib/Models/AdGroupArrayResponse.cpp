

#include "AdGroupArrayResponse.h"

using namespace Tiny;

AdGroupArrayResponse::AdGroupArrayResponse()
{
	items = std::list<AdGroupArrayResponseElement>();
}

AdGroupArrayResponse::AdGroupArrayResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

AdGroupArrayResponse::~AdGroupArrayResponse()
{

}

void
AdGroupArrayResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<AdGroupArrayResponseElement> items_list;
        AdGroupArrayResponseElement element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
AdGroupArrayResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AdGroupArrayResponseElement> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        AdGroupArrayResponseElement obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<AdGroupArrayResponseElement>
AdGroupArrayResponse::getItems()
{
	return items;
}

void
AdGroupArrayResponse::setItems(std::list <AdGroupArrayResponseElement> items)
{
	this->items = items;
}



