#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignCreateRequestAllOf1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignCreateRequestAllOf1::CampaignCreateRequestAllOf1()
{
	//__init();
}

CampaignCreateRequestAllOf1::~CampaignCreateRequestAllOf1()
{
	//__cleanup();
}

void
CampaignCreateRequestAllOf1::__init()
{
	//bid_options = new CampaignBidOptionsCreate();
	//intended_promotion_type = new IntendedPromotionType();
	//is_automated_campaign = null;
	//is_campaign_budget_optimization = null;
	//is_flexible_daily_budgets = null;
	//is_ltv_optimized = bool(false);
	//is_performance_plus = bool(false);
	//is_top_of_search = bool(false);
	//objective_type = new ObjectiveType();
	//status = null;
}

void
CampaignCreateRequestAllOf1::__cleanup()
{
	//if(bid_options != NULL) {
	//
	//delete bid_options;
	//bid_options = NULL;
	//}
	//if(intended_promotion_type != NULL) {
	//
	//delete intended_promotion_type;
	//intended_promotion_type = NULL;
	//}
	//if(is_automated_campaign != NULL) {
	//
	//delete is_automated_campaign;
	//is_automated_campaign = NULL;
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
	//if(is_ltv_optimized != NULL) {
	//
	//delete is_ltv_optimized;
	//is_ltv_optimized = NULL;
	//}
	//if(is_performance_plus != NULL) {
	//
	//delete is_performance_plus;
	//is_performance_plus = NULL;
	//}
	//if(is_top_of_search != NULL) {
	//
	//delete is_top_of_search;
	//is_top_of_search = NULL;
	//}
	//if(objective_type != NULL) {
	//
	//delete objective_type;
	//objective_type = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
CampaignCreateRequestAllOf1::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *bid_optionsKey = "bid_options";
	node = json_object_get_member(pJsonObject, bid_optionsKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignBidOptionsCreate")) {
			jsonToValue(&bid_options, node, "CampaignBidOptionsCreate", "CampaignBidOptionsCreate");
		} else {
			
			CampaignBidOptionsCreate* obj = static_cast<CampaignBidOptionsCreate*> (&bid_options);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *intended_promotion_typeKey = "intended_promotion_type";
	node = json_object_get_member(pJsonObject, intended_promotion_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("IntendedPromotionType")) {
			jsonToValue(&intended_promotion_type, node, "IntendedPromotionType", "IntendedPromotionType");
		} else {
			
			IntendedPromotionType* obj = static_cast<IntendedPromotionType*> (&intended_promotion_type);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *is_ltv_optimizedKey = "is_ltv_optimized";
	node = json_object_get_member(pJsonObject, is_ltv_optimizedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_ltv_optimized, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_performance_plusKey = "is_performance_plus";
	node = json_object_get_member(pJsonObject, is_performance_plusKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_performance_plus, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_top_of_searchKey = "is_top_of_search";
	node = json_object_get_member(pJsonObject, is_top_of_searchKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_top_of_search, node, "bool", "");
		} else {
			
		}
	}
	const gchar *objective_typeKey = "objective_type";
	node = json_object_get_member(pJsonObject, objective_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ObjectiveType")) {
			jsonToValue(&objective_type, node, "ObjectiveType", "ObjectiveType");
		} else {
			
			ObjectiveType* obj = static_cast<ObjectiveType*> (&objective_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("EntityStatus")) {
			jsonToValue(&status, node, "EntityStatus", "EntityStatus");
		} else {
			
			EntityStatus* obj = static_cast<EntityStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CampaignCreateRequestAllOf1::CampaignCreateRequestAllOf1(char* json)
{
	this->fromJson(json);
}

char*
CampaignCreateRequestAllOf1::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CampaignBidOptionsCreate")) {
		CampaignBidOptionsCreate obj = getBidOptions();
		node = converttoJson(&obj, "CampaignBidOptionsCreate", "");
	}
	else {
		
		CampaignBidOptionsCreate obj = static_cast<CampaignBidOptionsCreate> (getBidOptions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bid_optionsKey = "bid_options";
	json_object_set_member(pJsonObject, bid_optionsKey, node);
	if (isprimitive("IntendedPromotionType")) {
		IntendedPromotionType obj = getIntendedPromotionType();
		node = converttoJson(&obj, "IntendedPromotionType", "");
	}
	else {
		
		IntendedPromotionType obj = static_cast<IntendedPromotionType> (getIntendedPromotionType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *intended_promotion_typeKey = "intended_promotion_type";
	json_object_set_member(pJsonObject, intended_promotion_typeKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsAutomatedCampaign();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_automated_campaignKey = "is_automated_campaign";
	json_object_set_member(pJsonObject, is_automated_campaignKey, node);
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
	if (isprimitive("bool")) {
		bool obj = getIsLtvOptimized();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_ltv_optimizedKey = "is_ltv_optimized";
	json_object_set_member(pJsonObject, is_ltv_optimizedKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsPerformancePlus();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_performance_plusKey = "is_performance_plus";
	json_object_set_member(pJsonObject, is_performance_plusKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsTopOfSearch();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_top_of_searchKey = "is_top_of_search";
	json_object_set_member(pJsonObject, is_top_of_searchKey, node);
	if (isprimitive("ObjectiveType")) {
		ObjectiveType obj = getObjectiveType();
		node = converttoJson(&obj, "ObjectiveType", "");
	}
	else {
		
		ObjectiveType obj = static_cast<ObjectiveType> (getObjectiveType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *objective_typeKey = "objective_type";
	json_object_set_member(pJsonObject, objective_typeKey, node);
	if (isprimitive("EntityStatus")) {
		EntityStatus obj = getStatus();
		node = converttoJson(&obj, "EntityStatus", "");
	}
	else {
		
		EntityStatus obj = static_cast<EntityStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CampaignBidOptionsCreate
CampaignCreateRequestAllOf1::getBidOptions()
{
	return bid_options;
}

void
CampaignCreateRequestAllOf1::setBidOptions(CampaignBidOptionsCreate  bid_options)
{
	this->bid_options = bid_options;
}

IntendedPromotionType
CampaignCreateRequestAllOf1::getIntendedPromotionType()
{
	return intended_promotion_type;
}

void
CampaignCreateRequestAllOf1::setIntendedPromotionType(IntendedPromotionType  intended_promotion_type)
{
	this->intended_promotion_type = intended_promotion_type;
}

bool
CampaignCreateRequestAllOf1::getIsAutomatedCampaign()
{
	return is_automated_campaign;
}

void
CampaignCreateRequestAllOf1::setIsAutomatedCampaign(bool  is_automated_campaign)
{
	this->is_automated_campaign = is_automated_campaign;
}

bool
CampaignCreateRequestAllOf1::getIsCampaignBudgetOptimization()
{
	return is_campaign_budget_optimization;
}

void
CampaignCreateRequestAllOf1::setIsCampaignBudgetOptimization(bool  is_campaign_budget_optimization)
{
	this->is_campaign_budget_optimization = is_campaign_budget_optimization;
}

bool
CampaignCreateRequestAllOf1::getIsFlexibleDailyBudgets()
{
	return is_flexible_daily_budgets;
}

void
CampaignCreateRequestAllOf1::setIsFlexibleDailyBudgets(bool  is_flexible_daily_budgets)
{
	this->is_flexible_daily_budgets = is_flexible_daily_budgets;
}

bool
CampaignCreateRequestAllOf1::getIsLtvOptimized()
{
	return is_ltv_optimized;
}

void
CampaignCreateRequestAllOf1::setIsLtvOptimized(bool  is_ltv_optimized)
{
	this->is_ltv_optimized = is_ltv_optimized;
}

bool
CampaignCreateRequestAllOf1::getIsPerformancePlus()
{
	return is_performance_plus;
}

void
CampaignCreateRequestAllOf1::setIsPerformancePlus(bool  is_performance_plus)
{
	this->is_performance_plus = is_performance_plus;
}

bool
CampaignCreateRequestAllOf1::getIsTopOfSearch()
{
	return is_top_of_search;
}

void
CampaignCreateRequestAllOf1::setIsTopOfSearch(bool  is_top_of_search)
{
	this->is_top_of_search = is_top_of_search;
}

ObjectiveType
CampaignCreateRequestAllOf1::getObjectiveType()
{
	return objective_type;
}

void
CampaignCreateRequestAllOf1::setObjectiveType(ObjectiveType  objective_type)
{
	this->objective_type = objective_type;
}

EntityStatus
CampaignCreateRequestAllOf1::getStatus()
{
	return status;
}

void
CampaignCreateRequestAllOf1::setStatus(EntityStatus  status)
{
	this->status = status;
}


