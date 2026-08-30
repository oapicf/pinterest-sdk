

#include "Conversion_tags_list_200_response.h"

using namespace Tiny;

Conversion_tags_list_200_response::Conversion_tags_list_200_response()
{
	items = std::list<ConversionTag>();
}

Conversion_tags_list_200_response::Conversion_tags_list_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

Conversion_tags_list_200_response::~Conversion_tags_list_200_response()
{

}

void
Conversion_tags_list_200_response::fromJson(std::string jsonObj)
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
Conversion_tags_list_200_response::toJson()
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
Conversion_tags_list_200_response::getItems()
{
	return items;
}

void
Conversion_tags_list_200_response::setItems(std::list<ConversionTag> items)
{
	this->items = items;
}



