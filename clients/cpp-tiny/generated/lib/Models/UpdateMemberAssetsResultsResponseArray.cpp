

#include "UpdateMemberAssetsResultsResponseArray.h"

using namespace Tiny;

UpdateMemberAssetsResultsResponseArray::UpdateMemberAssetsResultsResponseArray()
{
	items = std::list<UpdateMemberAssetsResultsResponseArray_items_inner>();
}

UpdateMemberAssetsResultsResponseArray::UpdateMemberAssetsResultsResponseArray(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateMemberAssetsResultsResponseArray::~UpdateMemberAssetsResultsResponseArray()
{

}

void
UpdateMemberAssetsResultsResponseArray::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<UpdateMemberAssetsResultsResponseArray_items_inner> items_list;
        UpdateMemberAssetsResultsResponseArray_items_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
UpdateMemberAssetsResultsResponseArray::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<UpdateMemberAssetsResultsResponseArray_items_inner> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        UpdateMemberAssetsResultsResponseArray_items_inner obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<UpdateMemberAssetsResultsResponseArray_items_inner>
UpdateMemberAssetsResultsResponseArray::getItems()
{
	return items;
}

void
UpdateMemberAssetsResultsResponseArray::setItems(std::list <UpdateMemberAssetsResultsResponseArray_items_inner> items)
{
	this->items = items;
}



