

#include "UpdateMemberResultsResponseArray.h"

using namespace Tiny;

UpdateMemberResultsResponseArray::UpdateMemberResultsResponseArray()
{
	items = std::list<UpdateMemberResult>();
}

UpdateMemberResultsResponseArray::UpdateMemberResultsResponseArray(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdateMemberResultsResponseArray::~UpdateMemberResultsResponseArray()
{

}

void
UpdateMemberResultsResponseArray::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<UpdateMemberResult> items_list;
        UpdateMemberResult element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
UpdateMemberResultsResponseArray::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<UpdateMemberResult> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        UpdateMemberResult obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<UpdateMemberResult>
UpdateMemberResultsResponseArray::getItems()
{
	return items;
}

void
UpdateMemberResultsResponseArray::setItems(std::list <UpdateMemberResult> items)
{
	this->items = items;
}



