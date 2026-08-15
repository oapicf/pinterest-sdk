

#include "UpdatePartnerResultsResponseArray.h"

using namespace Tiny;

UpdatePartnerResultsResponseArray::UpdatePartnerResultsResponseArray()
{
	items = std::list<UpdatePartnerResultsResponseArray_items_inner>();
}

UpdatePartnerResultsResponseArray::UpdatePartnerResultsResponseArray(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatePartnerResultsResponseArray::~UpdatePartnerResultsResponseArray()
{

}

void
UpdatePartnerResultsResponseArray::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<UpdatePartnerResultsResponseArray_items_inner> items_list;
        UpdatePartnerResultsResponseArray_items_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
UpdatePartnerResultsResponseArray::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<UpdatePartnerResultsResponseArray_items_inner> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        UpdatePartnerResultsResponseArray_items_inner obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<UpdatePartnerResultsResponseArray_items_inner>
UpdatePartnerResultsResponseArray::getItems()
{
	return items;
}

void
UpdatePartnerResultsResponseArray::setItems(std::list <UpdatePartnerResultsResponseArray_items_inner> items)
{
	this->items = items;
}



