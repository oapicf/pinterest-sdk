

#include "CampaignCreateRequestAllOf1.h"

using namespace Tiny;

CampaignCreateRequestAllOf1::CampaignCreateRequestAllOf1()
{
	bid_options = CampaignBidOptionsCreate();
	intended_promotion_type = IntendedPromotionType();
	is_automated_campaign = null;
	is_campaign_budget_optimization = null;
	is_flexible_daily_budgets = null;
	is_ltv_optimized = bool(false);
	is_performance_plus = bool(false);
	is_top_of_search = bool(false);
	objective_type = ObjectiveType();
	status = null;
}

CampaignCreateRequestAllOf1::CampaignCreateRequestAllOf1(std::string jsonString)
{
	this->fromJson(jsonString);
}

CampaignCreateRequestAllOf1::~CampaignCreateRequestAllOf1()
{

}

void
CampaignCreateRequestAllOf1::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *bid_optionsKey = "bid_options";

    if(object.has_key(bid_optionsKey))
    {
        bourne::json value = object[bid_optionsKey];




        CampaignBidOptionsCreate* obj = &bid_options;
		obj->fromJson(value.dump());

    }

    const char *intended_promotion_typeKey = "intended_promotion_type";

    if(object.has_key(intended_promotion_typeKey))
    {
        bourne::json value = object[intended_promotion_typeKey];




        IntendedPromotionType* obj = &intended_promotion_type;
		obj->fromJson(value.dump());

    }

    const char *is_automated_campaignKey = "is_automated_campaign";

    if(object.has_key(is_automated_campaignKey))
    {
        bourne::json value = object[is_automated_campaignKey];



        jsonToValue(&is_automated_campaign, value, "bool");


    }

    const char *is_campaign_budget_optimizationKey = "is_campaign_budget_optimization";

    if(object.has_key(is_campaign_budget_optimizationKey))
    {
        bourne::json value = object[is_campaign_budget_optimizationKey];



        jsonToValue(&is_campaign_budget_optimization, value, "bool");


    }

    const char *is_flexible_daily_budgetsKey = "is_flexible_daily_budgets";

    if(object.has_key(is_flexible_daily_budgetsKey))
    {
        bourne::json value = object[is_flexible_daily_budgetsKey];



        jsonToValue(&is_flexible_daily_budgets, value, "bool");


    }

    const char *is_ltv_optimizedKey = "is_ltv_optimized";

    if(object.has_key(is_ltv_optimizedKey))
    {
        bourne::json value = object[is_ltv_optimizedKey];



        jsonToValue(&is_ltv_optimized, value, "bool");


    }

    const char *is_performance_plusKey = "is_performance_plus";

    if(object.has_key(is_performance_plusKey))
    {
        bourne::json value = object[is_performance_plusKey];



        jsonToValue(&is_performance_plus, value, "bool");


    }

    const char *is_top_of_searchKey = "is_top_of_search";

    if(object.has_key(is_top_of_searchKey))
    {
        bourne::json value = object[is_top_of_searchKey];



        jsonToValue(&is_top_of_search, value, "bool");


    }

    const char *objective_typeKey = "objective_type";

    if(object.has_key(objective_typeKey))
    {
        bourne::json value = object[objective_typeKey];




        ObjectiveType* obj = &objective_type;
		obj->fromJson(value.dump());

    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        EntityStatus* obj = &status;
		obj->fromJson(value.dump());

    }


}

bourne::json
CampaignCreateRequestAllOf1::toJson()
{
    bourne::json object = bourne::json::object();






	object["bid_options"] = getBidOptions().toJson();






	object["intended_promotion_type"] = getIntendedPromotionType().toJson();





    object["is_automated_campaign"] = isIsAutomatedCampaign();






    object["is_campaign_budget_optimization"] = isIsCampaignBudgetOptimization();






    object["is_flexible_daily_budgets"] = isIsFlexibleDailyBudgets();






    object["is_ltv_optimized"] = isIsLtvOptimized();






    object["is_performance_plus"] = isIsPerformancePlus();






    object["is_top_of_search"] = isIsTopOfSearch();







	object["objective_type"] = getObjectiveType().toJson();






	object["status"] = getStatus().toJson();


    return object;

}

CampaignBidOptionsCreate
CampaignCreateRequestAllOf1::getBidOptions()
{
	return bid_options;
}

void
CampaignCreateRequestAllOf1::setBidOptions(CampaignBidOptionsCreate bid_options)
{
	this->bid_options = bid_options;
}

IntendedPromotionType
CampaignCreateRequestAllOf1::getIntendedPromotionType()
{
	return intended_promotion_type;
}

void
CampaignCreateRequestAllOf1::setIntendedPromotionType(IntendedPromotionType intended_promotion_type)
{
	this->intended_promotion_type = intended_promotion_type;
}

bool
CampaignCreateRequestAllOf1::isIsAutomatedCampaign()
{
	return is_automated_campaign;
}

void
CampaignCreateRequestAllOf1::setIsAutomatedCampaign(bool is_automated_campaign)
{
	this->is_automated_campaign = is_automated_campaign;
}

bool
CampaignCreateRequestAllOf1::isIsCampaignBudgetOptimization()
{
	return is_campaign_budget_optimization;
}

void
CampaignCreateRequestAllOf1::setIsCampaignBudgetOptimization(bool is_campaign_budget_optimization)
{
	this->is_campaign_budget_optimization = is_campaign_budget_optimization;
}

bool
CampaignCreateRequestAllOf1::isIsFlexibleDailyBudgets()
{
	return is_flexible_daily_budgets;
}

void
CampaignCreateRequestAllOf1::setIsFlexibleDailyBudgets(bool is_flexible_daily_budgets)
{
	this->is_flexible_daily_budgets = is_flexible_daily_budgets;
}

bool
CampaignCreateRequestAllOf1::isIsLtvOptimized()
{
	return is_ltv_optimized;
}

void
CampaignCreateRequestAllOf1::setIsLtvOptimized(bool is_ltv_optimized)
{
	this->is_ltv_optimized = is_ltv_optimized;
}

bool
CampaignCreateRequestAllOf1::isIsPerformancePlus()
{
	return is_performance_plus;
}

void
CampaignCreateRequestAllOf1::setIsPerformancePlus(bool is_performance_plus)
{
	this->is_performance_plus = is_performance_plus;
}

bool
CampaignCreateRequestAllOf1::isIsTopOfSearch()
{
	return is_top_of_search;
}

void
CampaignCreateRequestAllOf1::setIsTopOfSearch(bool is_top_of_search)
{
	this->is_top_of_search = is_top_of_search;
}

ObjectiveType
CampaignCreateRequestAllOf1::getObjectiveType()
{
	return objective_type;
}

void
CampaignCreateRequestAllOf1::setObjectiveType(ObjectiveType objective_type)
{
	this->objective_type = objective_type;
}

EntityStatus
CampaignCreateRequestAllOf1::getStatus()
{
	return status;
}

void
CampaignCreateRequestAllOf1::setStatus(EntityStatus status)
{
	this->status = status;
}



