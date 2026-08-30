

#include "BulkDownloadCampaignFilter.h"

using namespace Tiny;

BulkDownloadCampaignFilter::BulkDownloadCampaignFilter()
{
	campaign_status = std::list<SummaryStatus>();
	end_time = std::string();
	name = std::string();
	objective_type = std::list<ConversionObjectiveType>();
	start_time = std::string();
}

BulkDownloadCampaignFilter::BulkDownloadCampaignFilter(std::string jsonString)
{
	this->fromJson(jsonString);
}

BulkDownloadCampaignFilter::~BulkDownloadCampaignFilter()
{

}

void
BulkDownloadCampaignFilter::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *campaign_statusKey = "campaign_status";

    if(object.has_key(campaign_statusKey))
    {
        bourne::json value = object[campaign_statusKey];


        std::list<SummaryStatus> campaign_status_list;
        SummaryStatus element;
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


        std::list<ConversionObjectiveType> objective_type_list;
        ConversionObjectiveType element;
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
BulkDownloadCampaignFilter::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<SummaryStatus> campaign_status_list = getCampaignStatus();
    bourne::json campaign_status_arr = bourne::json::array();

    for(auto& var : campaign_status_list)
    {
        SummaryStatus obj = var;
        campaign_status_arr.append(obj.toJson());
    }
    object["campaign_status"] = campaign_status_arr;







    object["end_time"] = getEndTime();






    object["name"] = getName();





    std::list<ConversionObjectiveType> objective_type_list = getObjectiveType();
    bourne::json objective_type_arr = bourne::json::array();

    for(auto& var : objective_type_list)
    {
        ConversionObjectiveType obj = var;
        objective_type_arr.append(obj.toJson());
    }
    object["objective_type"] = objective_type_arr;







    object["start_time"] = getStartTime();



    return object;

}

std::list<SummaryStatus>
BulkDownloadCampaignFilter::getCampaignStatus()
{
	return campaign_status;
}

void
BulkDownloadCampaignFilter::setCampaignStatus(std::list<SummaryStatus> campaign_status)
{
	this->campaign_status = campaign_status;
}

std::string
BulkDownloadCampaignFilter::getEndTime()
{
	return end_time;
}

void
BulkDownloadCampaignFilter::setEndTime(std::string end_time)
{
	this->end_time = end_time;
}

std::string
BulkDownloadCampaignFilter::getName()
{
	return name;
}

void
BulkDownloadCampaignFilter::setName(std::string name)
{
	this->name = name;
}

std::list<ConversionObjectiveType>
BulkDownloadCampaignFilter::getObjectiveType()
{
	return objective_type;
}

void
BulkDownloadCampaignFilter::setObjectiveType(std::list<ConversionObjectiveType> objective_type)
{
	this->objective_type = objective_type;
}

std::string
BulkDownloadCampaignFilter::getStartTime()
{
	return start_time;
}

void
BulkDownloadCampaignFilter::setStartTime(std::string start_time)
{
	this->start_time = start_time;
}



