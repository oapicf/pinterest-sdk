

#include "CampaignBidOptionsUpdateMaskItems.h"

using namespace Tiny;

CampaignBidOptionsUpdateMaskItems::CampaignBidOptionsUpdateMaskItems()
{
}

CampaignBidOptionsUpdateMaskItems::CampaignBidOptionsUpdateMaskItems(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignBidOptionsUpdateMaskItems::~CampaignBidOptionsUpdateMaskItems()
{

}

void
CampaignBidOptionsUpdateMaskItems::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);


}

bourne::json
CampaignBidOptionsUpdateMaskItems::toJson()
{
    bourne::json object = bourne::json::object();


    return object;

}



