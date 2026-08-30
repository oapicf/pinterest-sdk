#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignBatchUpdateItem.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignBatchUpdateItem::CampaignBatchUpdateItem()
{
	//__init();
}

CampaignBatchUpdateItem::~CampaignBatchUpdateItem()
{
	//__cleanup();
}

void
CampaignBatchUpdateItem::__init()
{
	//ad_account_id = std::string();
	//app_id = std::string();
	//app_platform = null;
	//bid_options = null;
	//daily_spend_cap = int(0);
	//default_ad_group_budget_in_micro_currency = int(0);
	//end_time = int(0);
	//id = std::string();
	//intended_promotion_type = new IntendedPromotionType();
	//is_automated_campaign = bool(false);
	//is_campaign_budget_optimization = bool(false);
	//is_flexible_daily_budgets = bool(false);
	//is_ltv_optimized = bool(false);
	//is_performance_plus = bool(false);
	//is_top_of_search = bool(false);
	//lifetime_spend_cap = int(0);
	//name = std::string();
	//objective_type = new ConversionObjectiveType();
	//order_line_id = std::string();
	//performance_plus_campaign_settings = null;
	//start_time = int(0);
	//status = new EntityStatus();
	//tracking_urls = null;
}

void
CampaignBatchUpdateItem::__cleanup()
{
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(app_id != NULL) {
	//
	//delete app_id;
	//app_id = NULL;
	//}
	//if(app_platform != NULL) {
	//
	//delete app_platform;
	//app_platform = NULL;
	//}
	//if(bid_options != NULL) {
	//
	//delete bid_options;
	//bid_options = NULL;
	//}
	//if(daily_spend_cap != NULL) {
	//
	//delete daily_spend_cap;
	//daily_spend_cap = NULL;
	//}
	//if(default_ad_group_budget_in_micro_currency != NULL) {
	//
	//delete default_ad_group_budget_in_micro_currency;
	//default_ad_group_budget_in_micro_currency = NULL;
	//}
	//if(end_time != NULL) {
	//
	//delete end_time;
	//end_time = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
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
	//if(lifetime_spend_cap != NULL) {
	//
	//delete lifetime_spend_cap;
	//lifetime_spend_cap = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(objective_type != NULL) {
	//
	//delete objective_type;
	//objective_type = NULL;
	//}
	//if(order_line_id != NULL) {
	//
	//delete order_line_id;
	//order_line_id = NULL;
	//}
	//if(performance_plus_campaign_settings != NULL) {
	//
	//delete performance_plus_campaign_settings;
	//performance_plus_campaign_settings = NULL;
	//}
	//if(start_time != NULL) {
	//
	//delete start_time;
	//start_time = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(tracking_urls != NULL) {
	//
	//delete tracking_urls;
	//tracking_urls = NULL;
	//}
	//
}

void
CampaignBatchUpdateItem::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_account_idKey = "ad_account_id";
	node = json_object_get_member(pJsonObject, ad_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_account_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *app_idKey = "app_id";
	node = json_object_get_member(pJsonObject, app_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&app_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *app_platformKey = "app_platform";
	node = json_object_get_member(pJsonObject, app_platformKey);
	if (node !=NULL) {
	

		if (isprimitive("MobileAppPlatform")) {
			jsonToValue(&app_platform, node, "MobileAppPlatform", "MobileAppPlatform");
		} else {
			
			MobileAppPlatform* obj = static_cast<MobileAppPlatform*> (&app_platform);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *bid_optionsKey = "bid_options";
	node = json_object_get_member(pJsonObject, bid_optionsKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignBidOptionsUpdate")) {
			jsonToValue(&bid_options, node, "CampaignBidOptionsUpdate", "CampaignBidOptionsUpdate");
		} else {
			
			CampaignBidOptionsUpdate* obj = static_cast<CampaignBidOptionsUpdate*> (&bid_options);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *daily_spend_capKey = "daily_spend_cap";
	node = json_object_get_member(pJsonObject, daily_spend_capKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&daily_spend_cap, node, "int", "");
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
	const gchar *end_timeKey = "end_time";
	node = json_object_get_member(pJsonObject, end_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&end_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
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
	const gchar *lifetime_spend_capKey = "lifetime_spend_cap";
	node = json_object_get_member(pJsonObject, lifetime_spend_capKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lifetime_spend_cap, node, "int", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *objective_typeKey = "objective_type";
	node = json_object_get_member(pJsonObject, objective_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionObjectiveType")) {
			jsonToValue(&objective_type, node, "ConversionObjectiveType", "ConversionObjectiveType");
		} else {
			
			ConversionObjectiveType* obj = static_cast<ConversionObjectiveType*> (&objective_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *order_line_idKey = "order_line_id";
	node = json_object_get_member(pJsonObject, order_line_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&order_line_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *performance_plus_campaign_settingsKey = "performance_plus_campaign_settings";
	node = json_object_get_member(pJsonObject, performance_plus_campaign_settingsKey);
	if (node !=NULL) {
	

		if (isprimitive("PerformancePlusCampaignSettings")) {
			jsonToValue(&performance_plus_campaign_settings, node, "PerformancePlusCampaignSettings", "PerformancePlusCampaignSettings");
		} else {
			
			PerformancePlusCampaignSettings* obj = static_cast<PerformancePlusCampaignSettings*> (&performance_plus_campaign_settings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *start_timeKey = "start_time";
	node = json_object_get_member(pJsonObject, start_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&start_time, node, "int", "");
		} else {
			
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
	const gchar *tracking_urlsKey = "tracking_urls";
	node = json_object_get_member(pJsonObject, tracking_urlsKey);
	if (node !=NULL) {
	

		if (isprimitive("TrackingUrls")) {
			jsonToValue(&tracking_urls, node, "TrackingUrls", "TrackingUrls");
		} else {
			
			TrackingUrls* obj = static_cast<TrackingUrls*> (&tracking_urls);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CampaignBatchUpdateItem::CampaignBatchUpdateItem(char* json)
{
	this->fromJson(json);
}

char*
CampaignBatchUpdateItem::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAppId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *app_idKey = "app_id";
	json_object_set_member(pJsonObject, app_idKey, node);
	if (isprimitive("MobileAppPlatform")) {
		MobileAppPlatform obj = getAppPlatform();
		node = converttoJson(&obj, "MobileAppPlatform", "");
	}
	else {
		
		MobileAppPlatform obj = static_cast<MobileAppPlatform> (getAppPlatform());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *app_platformKey = "app_platform";
	json_object_set_member(pJsonObject, app_platformKey, node);
	if (isprimitive("CampaignBidOptionsUpdate")) {
		CampaignBidOptionsUpdate obj = getBidOptions();
		node = converttoJson(&obj, "CampaignBidOptionsUpdate", "");
	}
	else {
		
		CampaignBidOptionsUpdate obj = static_cast<CampaignBidOptionsUpdate> (getBidOptions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bid_optionsKey = "bid_options";
	json_object_set_member(pJsonObject, bid_optionsKey, node);
	if (isprimitive("int")) {
		int obj = getDailySpendCap();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *daily_spend_capKey = "daily_spend_cap";
	json_object_set_member(pJsonObject, daily_spend_capKey, node);
	if (isprimitive("int")) {
		int obj = getDefaultAdGroupBudgetInMicroCurrency();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *default_ad_group_budget_in_micro_currencyKey = "default_ad_group_budget_in_micro_currency";
	json_object_set_member(pJsonObject, default_ad_group_budget_in_micro_currencyKey, node);
	if (isprimitive("int")) {
		int obj = getEndTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *end_timeKey = "end_time";
	json_object_set_member(pJsonObject, end_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
	if (isprimitive("int")) {
		int obj = getLifetimeSpendCap();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lifetime_spend_capKey = "lifetime_spend_cap";
	json_object_set_member(pJsonObject, lifetime_spend_capKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("ConversionObjectiveType")) {
		ConversionObjectiveType obj = getObjectiveType();
		node = converttoJson(&obj, "ConversionObjectiveType", "");
	}
	else {
		
		ConversionObjectiveType obj = static_cast<ConversionObjectiveType> (getObjectiveType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *objective_typeKey = "objective_type";
	json_object_set_member(pJsonObject, objective_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrderLineId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *order_line_idKey = "order_line_id";
	json_object_set_member(pJsonObject, order_line_idKey, node);
	if (isprimitive("PerformancePlusCampaignSettings")) {
		PerformancePlusCampaignSettings obj = getPerformancePlusCampaignSettings();
		node = converttoJson(&obj, "PerformancePlusCampaignSettings", "");
	}
	else {
		
		PerformancePlusCampaignSettings obj = static_cast<PerformancePlusCampaignSettings> (getPerformancePlusCampaignSettings());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *performance_plus_campaign_settingsKey = "performance_plus_campaign_settings";
	json_object_set_member(pJsonObject, performance_plus_campaign_settingsKey, node);
	if (isprimitive("int")) {
		int obj = getStartTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *start_timeKey = "start_time";
	json_object_set_member(pJsonObject, start_timeKey, node);
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
	if (isprimitive("TrackingUrls")) {
		TrackingUrls obj = getTrackingUrls();
		node = converttoJson(&obj, "TrackingUrls", "");
	}
	else {
		
		TrackingUrls obj = static_cast<TrackingUrls> (getTrackingUrls());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tracking_urlsKey = "tracking_urls";
	json_object_set_member(pJsonObject, tracking_urlsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CampaignBatchUpdateItem::getAdAccountId()
{
	return ad_account_id;
}

void
CampaignBatchUpdateItem::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
CampaignBatchUpdateItem::getAppId()
{
	return app_id;
}

void
CampaignBatchUpdateItem::setAppId(std::string  app_id)
{
	this->app_id = app_id;
}

MobileAppPlatform
CampaignBatchUpdateItem::getAppPlatform()
{
	return app_platform;
}

void
CampaignBatchUpdateItem::setAppPlatform(MobileAppPlatform  app_platform)
{
	this->app_platform = app_platform;
}

CampaignBidOptionsUpdate
CampaignBatchUpdateItem::getBidOptions()
{
	return bid_options;
}

void
CampaignBatchUpdateItem::setBidOptions(CampaignBidOptionsUpdate  bid_options)
{
	this->bid_options = bid_options;
}

int
CampaignBatchUpdateItem::getDailySpendCap()
{
	return daily_spend_cap;
}

void
CampaignBatchUpdateItem::setDailySpendCap(int  daily_spend_cap)
{
	this->daily_spend_cap = daily_spend_cap;
}

int
CampaignBatchUpdateItem::getDefaultAdGroupBudgetInMicroCurrency()
{
	return default_ad_group_budget_in_micro_currency;
}

void
CampaignBatchUpdateItem::setDefaultAdGroupBudgetInMicroCurrency(int  default_ad_group_budget_in_micro_currency)
{
	this->default_ad_group_budget_in_micro_currency = default_ad_group_budget_in_micro_currency;
}

int
CampaignBatchUpdateItem::getEndTime()
{
	return end_time;
}

void
CampaignBatchUpdateItem::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

std::string
CampaignBatchUpdateItem::getId()
{
	return id;
}

void
CampaignBatchUpdateItem::setId(std::string  id)
{
	this->id = id;
}

IntendedPromotionType
CampaignBatchUpdateItem::getIntendedPromotionType()
{
	return intended_promotion_type;
}

void
CampaignBatchUpdateItem::setIntendedPromotionType(IntendedPromotionType  intended_promotion_type)
{
	this->intended_promotion_type = intended_promotion_type;
}

bool
CampaignBatchUpdateItem::getIsAutomatedCampaign()
{
	return is_automated_campaign;
}

void
CampaignBatchUpdateItem::setIsAutomatedCampaign(bool  is_automated_campaign)
{
	this->is_automated_campaign = is_automated_campaign;
}

bool
CampaignBatchUpdateItem::getIsCampaignBudgetOptimization()
{
	return is_campaign_budget_optimization;
}

void
CampaignBatchUpdateItem::setIsCampaignBudgetOptimization(bool  is_campaign_budget_optimization)
{
	this->is_campaign_budget_optimization = is_campaign_budget_optimization;
}

bool
CampaignBatchUpdateItem::getIsFlexibleDailyBudgets()
{
	return is_flexible_daily_budgets;
}

void
CampaignBatchUpdateItem::setIsFlexibleDailyBudgets(bool  is_flexible_daily_budgets)
{
	this->is_flexible_daily_budgets = is_flexible_daily_budgets;
}

bool
CampaignBatchUpdateItem::getIsLtvOptimized()
{
	return is_ltv_optimized;
}

void
CampaignBatchUpdateItem::setIsLtvOptimized(bool  is_ltv_optimized)
{
	this->is_ltv_optimized = is_ltv_optimized;
}

bool
CampaignBatchUpdateItem::getIsPerformancePlus()
{
	return is_performance_plus;
}

void
CampaignBatchUpdateItem::setIsPerformancePlus(bool  is_performance_plus)
{
	this->is_performance_plus = is_performance_plus;
}

bool
CampaignBatchUpdateItem::getIsTopOfSearch()
{
	return is_top_of_search;
}

void
CampaignBatchUpdateItem::setIsTopOfSearch(bool  is_top_of_search)
{
	this->is_top_of_search = is_top_of_search;
}

int
CampaignBatchUpdateItem::getLifetimeSpendCap()
{
	return lifetime_spend_cap;
}

void
CampaignBatchUpdateItem::setLifetimeSpendCap(int  lifetime_spend_cap)
{
	this->lifetime_spend_cap = lifetime_spend_cap;
}

std::string
CampaignBatchUpdateItem::getName()
{
	return name;
}

void
CampaignBatchUpdateItem::setName(std::string  name)
{
	this->name = name;
}

ConversionObjectiveType
CampaignBatchUpdateItem::getObjectiveType()
{
	return objective_type;
}

void
CampaignBatchUpdateItem::setObjectiveType(ConversionObjectiveType  objective_type)
{
	this->objective_type = objective_type;
}

std::string
CampaignBatchUpdateItem::getOrderLineId()
{
	return order_line_id;
}

void
CampaignBatchUpdateItem::setOrderLineId(std::string  order_line_id)
{
	this->order_line_id = order_line_id;
}

PerformancePlusCampaignSettings
CampaignBatchUpdateItem::getPerformancePlusCampaignSettings()
{
	return performance_plus_campaign_settings;
}

void
CampaignBatchUpdateItem::setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings  performance_plus_campaign_settings)
{
	this->performance_plus_campaign_settings = performance_plus_campaign_settings;
}

int
CampaignBatchUpdateItem::getStartTime()
{
	return start_time;
}

void
CampaignBatchUpdateItem::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

EntityStatus
CampaignBatchUpdateItem::getStatus()
{
	return status;
}

void
CampaignBatchUpdateItem::setStatus(EntityStatus  status)
{
	this->status = status;
}

TrackingUrls
CampaignBatchUpdateItem::getTrackingUrls()
{
	return tracking_urls;
}

void
CampaignBatchUpdateItem::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}


