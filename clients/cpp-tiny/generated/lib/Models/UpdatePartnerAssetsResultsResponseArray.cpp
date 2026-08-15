

#include "UpdatePartnerAssetsResultsResponseArray.h"

using namespace Tiny;

UpdatePartnerAssetsResultsResponseArray::UpdatePartnerAssetsResultsResponseArray()
{
	items = std::list<UpdatePartnerAssetsResult>();
}

UpdatePartnerAssetsResultsResponseArray::UpdatePartnerAssetsResultsResponseArray(std::string jsonString)
{
	this->fromJson(jsonString);
}

UpdatePartnerAssetsResultsResponseArray::~UpdatePartnerAssetsResultsResponseArray()
{

}

void
UpdatePartnerAssetsResultsResponseArray::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<UpdatePartnerAssetsResult> items_list;
        UpdatePartnerAssetsResult element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
UpdatePartnerAssetsResultsResponseArray::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<UpdatePartnerAssetsResult> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        UpdatePartnerAssetsResult obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<UpdatePartnerAssetsResult>
UpdatePartnerAssetsResultsResponseArray::getItems()
{
	return items;
}

void
UpdatePartnerAssetsResultsResponseArray::setItems(std::list <UpdatePartnerAssetsResult> items)
{
	this->items = items;
}



