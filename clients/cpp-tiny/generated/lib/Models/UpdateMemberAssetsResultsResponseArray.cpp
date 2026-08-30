

#include "UpdateMemberAssetsResultsResponseArray.h"

using namespace Tiny;

UpdateMemberAssetsResultsResponseArray::UpdateMemberAssetsResultsResponseArray()
{
	items = std::list<UpdateMemberAssetResultItem>();
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


        std::list<UpdateMemberAssetResultItem> items_list;
        UpdateMemberAssetResultItem element;
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




    std::list<UpdateMemberAssetResultItem> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        UpdateMemberAssetResultItem obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<UpdateMemberAssetResultItem>
UpdateMemberAssetsResultsResponseArray::getItems()
{
	return items;
}

void
UpdateMemberAssetsResultsResponseArray::setItems(std::list<UpdateMemberAssetResultItem> items)
{
	this->items = items;
}



