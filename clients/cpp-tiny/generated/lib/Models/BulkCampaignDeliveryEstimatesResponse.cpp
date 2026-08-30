

#include "BulkCampaignDeliveryEstimatesResponse.h"

using namespace Tiny;

BulkCampaignDeliveryEstimatesResponse::BulkCampaignDeliveryEstimatesResponse()
{
	data = std::list<BulkCampaignDeliveryEstimatesItem>();
}

BulkCampaignDeliveryEstimatesResponse::BulkCampaignDeliveryEstimatesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkCampaignDeliveryEstimatesResponse::~BulkCampaignDeliveryEstimatesResponse()
{

}

void
BulkCampaignDeliveryEstimatesResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];


        std::list<BulkCampaignDeliveryEstimatesItem> data_list;
        BulkCampaignDeliveryEstimatesItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            data_list.push_back(element);
        }
        data = data_list;


    }


}

bourne::json
BulkCampaignDeliveryEstimatesResponse::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<BulkCampaignDeliveryEstimatesItem> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        BulkCampaignDeliveryEstimatesItem obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;




    return object;

}

std::list<BulkCampaignDeliveryEstimatesItem>
BulkCampaignDeliveryEstimatesResponse::getData()
{
	return data;
}

void
BulkCampaignDeliveryEstimatesResponse::setData(std::list<BulkCampaignDeliveryEstimatesItem> data)
{
	this->data = data;
}



