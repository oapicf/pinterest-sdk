

#include "BulkDownloadRequest_campaign_filter.h"

using namespace Tiny;

BulkDownloadRequest_campaign_filter::BulkDownloadRequest_campaign_filter()
{
	campaign_status = std::list<CampaignSummaryStatus>();
	end_time = std::string();
	name = std::string();
	objective_type = std::list<ObjectiveType>();
	start_time = std::string();
}

BulkDownloadRequest_campaign_filter::BulkDownloadRequest_campaign_filter(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkDownloadRequest_campaign_filter::~BulkDownloadRequest_campaign_filter()
{

}

void
BulkDownloadRequest_campaign_filter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaign_statusKey = "campaign_status";

    if(object.has_key(campaign_statusKey))
    {
        bourne::json value = object[campaign_statusKey];


        std::list<CampaignSummaryStatus> campaign_status_list;
        CampaignSummaryStatus element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            campaign_status_list.push_back(element);
        }
        campaign_status = campaign_status_list;


    }

    const char *end_timeKey = "end_time";

    if(object.has_key(end_timeKey))
    {
        bourne::json value = object[end_timeKey];



        jsonToValue(&end_time, value, "std::string");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *objective_typeKey = "objective_type";

    if(object.has_key(objective_typeKey))
    {
        bourne::json value = object[objective_typeKey];


        std::list<ObjectiveType> objective_type_list;
        ObjectiveType element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            objective_type_list.push_back(element);
        }
        objective_type = objective_type_list;


    }

    const char *start_timeKey = "start_time";

    if(object.has_key(start_timeKey))
    {
        bourne::json value = object[start_timeKey];



        jsonToValue(&start_time, value, "std::string");


    }


}

bourne::json
BulkDownloadRequest_campaign_filter::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<CampaignSummaryStatus> campaign_status_list = getCampaignStatus();
    bourne::json campaign_status_arr = bourne::json::array();

    for(auto& var : campaign_status_list)
    {
        CampaignSummaryStatus obj = var;
        campaign_status_arr.append(obj.toJson());
    }
    object["campaign_status"] = campaign_status_arr;







    object["end_time"] = getEndTime();






    object["name"] = getName();





    std::list<ObjectiveType> objective_type_list = getObjectiveType();
    bourne::json objective_type_arr = bourne::json::array();

    for(auto& var : objective_type_list)
    {
        ObjectiveType obj = var;
        objective_type_arr.append(obj.toJson());
    }
    object["objective_type"] = objective_type_arr;







    object["start_time"] = getStartTime();



    return object;

}

std::list<CampaignSummaryStatus>
BulkDownloadRequest_campaign_filter::getCampaignStatus()
{
	return campaign_status;
}

void
BulkDownloadRequest_campaign_filter::setCampaignStatus(std::list <CampaignSummaryStatus> campaign_status)
{
	this->campaign_status = campaign_status;
}

std::string
BulkDownloadRequest_campaign_filter::getEndTime()
{
	return end_time;
}

void
BulkDownloadRequest_campaign_filter::setEndTime(std::string  end_time)
{
	this->end_time = end_time;
}

std::string
BulkDownloadRequest_campaign_filter::getName()
{
	return name;
}

void
BulkDownloadRequest_campaign_filter::setName(std::string  name)
{
	this->name = name;
}

std::list<ObjectiveType>
BulkDownloadRequest_campaign_filter::getObjectiveType()
{
	return objective_type;
}

void
BulkDownloadRequest_campaign_filter::setObjectiveType(std::list <ObjectiveType> objective_type)
{
	this->objective_type = objective_type;
}

std::string
BulkDownloadRequest_campaign_filter::getStartTime()
{
	return start_time;
}

void
BulkDownloadRequest_campaign_filter::setStartTime(std::string  start_time)
{
	this->start_time = start_time;
}



