

#include "CampaignCreateResponse.h"

using namespace Tiny;

CampaignCreateResponse::CampaignCreateResponse()
{
	items = std::list<CampaignCreateResponseItem>();
}

CampaignCreateResponse::CampaignCreateResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignCreateResponse::~CampaignCreateResponse()
{

}

void
CampaignCreateResponse::fromJson(std::string jsonObj)
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
CampaignCreateResponse::toJson()
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
CampaignCreateResponse::getItems()
{
	return items;
}

void
CampaignCreateResponse::setItems(std::list <CampaignCreateResponseItem> items)
{
	this->items = items;
}



