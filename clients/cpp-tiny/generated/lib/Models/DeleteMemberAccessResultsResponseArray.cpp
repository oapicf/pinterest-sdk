

#include "DeleteMemberAccessResultsResponseArray.h"

using namespace Tiny;

DeleteMemberAccessResultsResponseArray::DeleteMemberAccessResultsResponseArray()
{
	items = std::list<DeleteMemberAccessResult>();
}

DeleteMemberAccessResultsResponseArray::DeleteMemberAccessResultsResponseArray(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeleteMemberAccessResultsResponseArray::~DeleteMemberAccessResultsResponseArray()
{

}

void
DeleteMemberAccessResultsResponseArray::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<DeleteMemberAccessResult> items_list;
        DeleteMemberAccessResult element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
DeleteMemberAccessResultsResponseArray::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<DeleteMemberAccessResult> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        DeleteMemberAccessResult obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<DeleteMemberAccessResult>
DeleteMemberAccessResultsResponseArray::getItems()
{
	return items;
}

void
DeleteMemberAccessResultsResponseArray::setItems(std::list<DeleteMemberAccessResult> items)
{
	this->items = items;
}



