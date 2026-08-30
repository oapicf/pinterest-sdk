

#include "CampaignBatchWriteResponseModel.h"

using namespace Tiny;

CampaignBatchWriteResponseModel::CampaignBatchWriteResponseModel()
{
	items = std::list<CampaignBatchItem>();
}

CampaignBatchWriteResponseModel::CampaignBatchWriteResponseModel(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignBatchWriteResponseModel::~CampaignBatchWriteResponseModel()
{

}

void
CampaignBatchWriteResponseModel::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<CampaignBatchItem> items_list;
        CampaignBatchItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
CampaignBatchWriteResponseModel::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CampaignBatchItem> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        CampaignBatchItem obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<CampaignBatchItem>
CampaignBatchWriteResponseModel::getItems()
{
	return items;
}

void
CampaignBatchWriteResponseModel::setItems(std::list<CampaignBatchItem> items)
{
	this->items = items;
}



