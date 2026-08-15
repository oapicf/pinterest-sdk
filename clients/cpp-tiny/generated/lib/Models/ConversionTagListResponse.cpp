

#include "ConversionTagListResponse.h"

using namespace Tiny;

ConversionTagListResponse::ConversionTagListResponse()
{
	items = std::list<ConversionTag>();
}

ConversionTagListResponse::ConversionTagListResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ConversionTagListResponse::~ConversionTagListResponse()
{

}

void
ConversionTagListResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<ConversionTag> items_list;
        ConversionTag element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
ConversionTagListResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<ConversionTag> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        ConversionTag obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<ConversionTag>
ConversionTagListResponse::getItems()
{
	return items;
}

void
ConversionTagListResponse::setItems(std::list <ConversionTag> items)
{
	this->items = items;
}



