

#include "CampaignUpdateResponse.h"

using namespace Tiny;

CampaignUpdateResponse::CampaignUpdateResponse()
{
	items = std::list<CampaignCreateResponseItem>();
}

CampaignUpdateResponse::CampaignUpdateResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignUpdateResponse::~CampaignUpdateResponse()
{

}

void
CampaignUpdateResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *itemsKey = "items";

    if(object.has_key(itemsKey))
    {
        bourne::json value = object[itemsKey];


        std::list<CampaignCreateResponseItem> items_list;
        CampaignCreateResponseItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            items_list.push_back(element);
        }
        items = items_list;


    }


}

bourne::json
CampaignUpdateResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CampaignCreateResponseItem> items_list = getItems();
    bourne::json items_arr = bourne::json::array();

    for(auto& var : items_list)
    {
        CampaignCreateResponseItem obj = var;
        items_arr.append(obj.toJson());
    }
    object["items"] = items_arr;




    return object;

}

std::list<CampaignCreateResponseItem>
CampaignUpdateResponse::getItems()
{
	return items;
}

void
CampaignUpdateResponse::setItems(std::list <CampaignCreateResponseItem> items)
{
	this->items = items;
}



