

#include "DeletePartnerAssetsResultsResponseArray.h"

using namespace Tiny;

DeletePartnerAssetsResultsResponseArray::DeletePartnerAssetsResultsResponseArray()
{
	items = std::list<DeletePartnerAssetsResult>();
}

DeletePartnerAssetsResultsResponseArray::DeletePartnerAssetsResultsResponseArray(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeletePartnerAssetsResultsResponseArray::~DeletePartnerAssetsResultsResponseArray()
{

}

void
DeletePartnerAssetsResultsResponseArray::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<DeletePartnerAssetsResult> items_list;
        DeletePartnerAssetsResult element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
DeletePartnerAssetsResultsResponseArray::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<DeletePartnerAssetsResult> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        DeletePartnerAssetsResult obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<DeletePartnerAssetsResult>
DeletePartnerAssetsResultsResponseArray::getItems()
{
	return items;
}

void
DeletePartnerAssetsResultsResponseArray::setItems(std::list <DeletePartnerAssetsResult> items)
{
	this->items = items;
}



