#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignCreateCommon_allOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignCreateCommon_allOf::CampaignCreateCommon_allOf()
{
	//__init();
}

CampaignCreateCommon_allOf::~CampaignCreateCommon_allOf()
{
	//__cleanup();
}

void
CampaignCreateCommon_allOf::__init()
{
	//status = std::string();
	//is_campaign_budget_optimization = bool(false);
	//is_flexible_daily_budgets = bool(false);
	//default_ad_group_budget_in_micro_currency = int(0);
	//is_automated_campaign = bool(false);
}

void
CampaignCreateCommon_allOf::__cleanup()
{
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(is_campaign_budget_optimization != NULL) {
	//
	//delete is_campaign_budget_optimization;
	//is_campaign_budget_optimization = NULL;
	//}
	//if(is_flexible_daily_budgets != NULL) {
	//
	//delete is_flexible_daily_budgets;
	//is_flexible_daily_budgets = NULL;
	//}
	//if(default_ad_group_budget_in_micro_currency != NULL) {
	//
	//delete default_ad_group_budget_in_micro_currency;
	//default_ad_group_budget_in_micro_currency = NULL;
	//}
	//if(is_automated_campaign != NULL) {
	//
	//delete is_automated_campaign;
	//is_automated_campaign = NULL;
	//}
	//
}

void
CampaignCreateCommon_allOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("EntityStatus")) {
			jsonToValue(&status, node, "EntityStatus", "EntityStatus");
		} else {
			
		}
	}
	const gchar *is_campaign_budget_optimizationKey = "is_campaign_budget_optimization";
	node = json_object_get_member(pJsonObject, is_campaign_budget_optimizationKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_campaign_budget_optimization, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_flexible_daily_budgetsKey = "is_flexible_daily_budgets";
	node = json_object_get_member(pJsonObject, is_flexible_daily_budgetsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_flexible_daily_budgets, node, "bool", "");
		} else {
			
		}
	}
	const gchar *default_ad_group_budget_in_micro_currencyKey = "default_ad_group_budget_in_micro_currency";
	node = json_object_get_member(pJsonObject, default_ad_group_budget_in_micro_currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&default_ad_group_budget_in_micro_currency, node, "int", "");
		} else {
			
		}
	}
	const gchar *is_automated_campaignKey = "is_automated_campaign";
	node = json_object_get_member(pJsonObject, is_automated_campaignKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_automated_campaign, node, "bool", "");
		} else {
			
		}
	}
}

CampaignCreateCommon_allOf::CampaignCreateCommon_allOf(char* json)
{
	this->fromJson(json);
}

char*
CampaignCreateCommon_allOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("EntityStatus")) {
		EntityStatus obj = getStatus();
		node = converttoJson(&obj, "EntityStatus", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsCampaignBudgetOptimization();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_campaign_budget_optimizationKey = "is_campaign_budget_optimization";
	json_object_set_member(pJsonObject, is_campaign_budget_optimizationKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsFlexibleDailyBudgets();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_flexible_daily_budgetsKey = "is_flexible_daily_budgets";
	json_object_set_member(pJsonObject, is_flexible_daily_budgetsKey, node);
	if (isprimitive("int")) {
		int obj = getDefaultAdGroupBudgetInMicroCurrency();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *default_ad_group_budget_in_micro_currencyKey = "default_ad_group_budget_in_micro_currency";
	json_object_set_member(pJsonObject, default_ad_group_budget_in_micro_currencyKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsAutomatedCampaign();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_automated_campaignKey = "is_automated_campaign";
	json_object_set_member(pJsonObject, is_automated_campaignKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

EntityStatus
CampaignCreateCommon_allOf::getStatus()
{
	return status;
}

void
CampaignCreateCommon_allOf::setStatus(EntityStatus  status)
{
	this->status = status;
}

bool
CampaignCreateCommon_allOf::getIsCampaignBudgetOptimization()
{
	return is_campaign_budget_optimization;
}

void
CampaignCreateCommon_allOf::setIsCampaignBudgetOptimization(bool  is_campaign_budget_optimization)
{
	this->is_campaign_budget_optimization = is_campaign_budget_optimization;
}

bool
CampaignCreateCommon_allOf::getIsFlexibleDailyBudgets()
{
	return is_flexible_daily_budgets;
}

void
CampaignCreateCommon_allOf::setIsFlexibleDailyBudgets(bool  is_flexible_daily_budgets)
{
	this->is_flexible_daily_budgets = is_flexible_daily_budgets;
}

int
CampaignCreateCommon_allOf::getDefaultAdGroupBudgetInMicroCurrency()
{
	return default_ad_group_budget_in_micro_currency;
}

void
CampaignCreateCommon_allOf::setDefaultAdGroupBudgetInMicroCurrency(int  default_ad_group_budget_in_micro_currency)
{
	this->default_ad_group_budget_in_micro_currency = default_ad_group_budget_in_micro_currency;
}

bool
CampaignCreateCommon_allOf::getIsAutomatedCampaign()
{
	return is_automated_campaign;
}

void
CampaignCreateCommon_allOf::setIsAutomatedCampaign(bool  is_automated_campaign)
{
	this->is_automated_campaign = is_automated_campaign;
}


