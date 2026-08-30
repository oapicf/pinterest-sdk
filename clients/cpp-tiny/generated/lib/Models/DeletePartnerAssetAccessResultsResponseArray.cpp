

#include "DeletePartnerAssetAccessResultsResponseArray.h"

using namespace Tiny;

DeletePartnerAssetAccessResultsResponseArray::DeletePartnerAssetAccessResultsResponseArray()
{
	items = std::list<DeletePartnerAssetAccessResult>();
}

DeletePartnerAssetAccessResultsResponseArray::DeletePartnerAssetAccessResultsResponseArray(std::string jsonString)
{
	this->fromJson(jsonString);
}

DeletePartnerAssetAccessResultsResponseArray::~DeletePartnerAssetAccessResultsResponseArray()
{

}

void
DeletePartnerAssetAccessResultsResponseArray::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<DeletePartnerAssetAccessResult> items_list;
        DeletePartnerAssetAccessResult element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
DeletePartnerAssetAccessResultsResponseArray::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<DeletePartnerAssetAccessResult> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        DeletePartnerAssetAccessResult obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<DeletePartnerAssetAccessResult>
DeletePartnerAssetAccessResultsResponseArray::getItems()
{
	return items;
}

void
DeletePartnerAssetAccessResultsResponseArray::setItems(std::list<DeletePartnerAssetAccessResult> items)
{
	this->items = items;
}



