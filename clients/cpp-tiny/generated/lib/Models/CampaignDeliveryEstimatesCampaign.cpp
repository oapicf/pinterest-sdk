

#include "CampaignDeliveryEstimatesCampaign.h"

using namespace Tiny;

CampaignDeliveryEstimatesCampaign::CampaignDeliveryEstimatesCampaign()
{
	ad_groups = std::list<AdGroupDeliveryEstimates>();
	budget_duration_type = null;
	daily_spend_cap = int(0);
	end_date = std::string();
	lifetime_spend_cap = int(0);
	objective_type = DeliveryEstimateObjectiveType();
	start_date = std::string();
}

CampaignDeliveryEstimatesCampaign::CampaignDeliveryEstimatesCampaign(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignDeliveryEstimatesCampaign::~CampaignDeliveryEstimatesCampaign()
{

}

void
CampaignDeliveryEstimatesCampaign::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ad_groupsKey = "ad_groups";

    if(object.has_key(ad_groupsKey))
    {
        bourne::json value = object[ad_groupsKey];


        std::list<AdGroupDeliveryEstimates> ad_groups_list;
        AdGroupDeliveryEstimates element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            ad_groups_list.push_back(element);
        }
        ad_groups = ad_groups_list;


    }

    const char *budget_duration_typeKey = "budget_duration_type";

    if(object.has_key(budget_duration_typeKey))
    {
        bourne::json value = object[budget_duration_typeKey];




        BudgetDurationType* obj = &budget_duration_type;
		obj->fromJson(value.dump());

    }

    const char *daily_spend_capKey = "daily_spend_cap";

    if(object.has_key(daily_spend_capKey))
    {
        bourne::json value = object[daily_spend_capKey];



        jsonToValue(&daily_spend_cap, value, "int");


    }

    const char *end_dateKey = "end_date";

    if(object.has_key(end_dateKey))
    {
        bourne::json value = object[end_dateKey];



        jsonToValue(&end_date, value, "std::string");


    }

    const char *lifetime_spend_capKey = "lifetime_spend_cap";

    if(object.has_key(lifetime_spend_capKey))
    {
        bourne::json value = object[lifetime_spend_capKey];



        jsonToValue(&lifetime_spend_cap, value, "int");


    }

    const char *objective_typeKey = "objective_type";

    if(object.has_key(objective_typeKey))
    {
        bourne::json value = object[objective_typeKey];




        DeliveryEstimateObjectiveType* obj = &objective_type;
		obj->fromJson(value.dump());

    }

    const char *start_dateKey = "start_date";

    if(object.has_key(start_dateKey))
    {
        bourne::json value = object[start_dateKey];



        jsonToValue(&start_date, value, "std::string");


    }


}

bourne::json
CampaignDeliveryEstimatesCampaign::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<AdGroupDeliveryEstimates> ad_groups_list = getAdGroups();
    bourne::json ad_groups_arr = bourne::json::array();

    for(auto& var : ad_groups_list)
    {
        AdGroupDeliveryEstimates obj = var;
        ad_groups_arr.append(obj.toJson());
    }
    object["ad_groups"] = ad_groups_arr;








	object["budget_duration_type"] = getBudgetDurationType().toJson();





    object["daily_spend_cap"] = getDailySpendCap();






    object["end_date"] = getEndDate();






    object["lifetime_spend_cap"] = getLifetimeSpendCap();







	object["objective_type"] = getObjectiveType().toJson();





    object["start_date"] = getStartDate();



    return object;

}

std::list<AdGroupDeliveryEstimates>
CampaignDeliveryEstimatesCampaign::getAdGroups()
{
	return ad_groups;
}

void
CampaignDeliveryEstimatesCampaign::setAdGroups(std::list<AdGroupDeliveryEstimates> ad_groups)
{
	this->ad_groups = ad_groups;
}

BudgetDurationType
CampaignDeliveryEstimatesCampaign::getBudgetDurationType()
{
	return budget_duration_type;
}

void
CampaignDeliveryEstimatesCampaign::setBudgetDurationType(BudgetDurationType budget_duration_type)
{
	this->budget_duration_type = budget_duration_type;
}

int
CampaignDeliveryEstimatesCampaign::getDailySpendCap()
{
	return daily_spend_cap;
}

void
CampaignDeliveryEstimatesCampaign::setDailySpendCap(int daily_spend_cap)
{
	this->daily_spend_cap = daily_spend_cap;
}

std::string
CampaignDeliveryEstimatesCampaign::getEndDate()
{
	return end_date;
}

void
CampaignDeliveryEstimatesCampaign::setEndDate(std::string end_date)
{
	this->end_date = end_date;
}

int
CampaignDeliveryEstimatesCampaign::getLifetimeSpendCap()
{
	return lifetime_spend_cap;
}

void
CampaignDeliveryEstimatesCampaign::setLifetimeSpendCap(int lifetime_spend_cap)
{
	this->lifetime_spend_cap = lifetime_spend_cap;
}

DeliveryEstimateObjectiveType
CampaignDeliveryEstimatesCampaign::getObjectiveType()
{
	return objective_type;
}

void
CampaignDeliveryEstimatesCampaign::setObjectiveType(DeliveryEstimateObjectiveType objective_type)
{
	this->objective_type = objective_type;
}

std::string
CampaignDeliveryEstimatesCampaign::getStartDate()
{
	return start_date;
}

void
CampaignDeliveryEstimatesCampaign::setStartDate(std::string start_date)
{
	this->start_date = start_date;
}



