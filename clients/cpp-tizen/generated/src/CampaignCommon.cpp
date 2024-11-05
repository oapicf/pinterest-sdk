#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignCommon.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignCommon::CampaignCommon()
{
	//__init();
}

CampaignCommon::~CampaignCommon()
{
	//__cleanup();
}

void
CampaignCommon::__init()
{
	//ad_account_id = std::string();
	//name = std::string();
	//status = std::string();
	//lifetime_spend_cap = int(0);
	//daily_spend_cap = int(0);
	//order_line_id = std::string();
	//tracking_urls = null;
	//start_time = int(0);
	//end_time = int(0);
	//is_flexible_daily_budgets = bool(false);
}

void
CampaignCommon::__cleanup()
{
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(lifetime_spend_cap != NULL) {
	//
	//delete lifetime_spend_cap;
	//lifetime_spend_cap = NULL;
	//}
	//if(daily_spend_cap != NULL) {
	//
	//delete daily_spend_cap;
	//daily_spend_cap = NULL;
	//}
	//if(order_line_id != NULL) {
	//
	//delete order_line_id;
	//order_line_id = NULL;
	//}
	//if(tracking_urls != NULL) {
	//
	//delete tracking_urls;
	//tracking_urls = NULL;
	//}
	//if(start_time != NULL) {
	//
	//delete start_time;
	//start_time = NULL;
	//}
	//if(end_time != NULL) {
	//
	//delete end_time;
	//end_time = NULL;
	//}
	//if(is_flexible_daily_budgets != NULL) {
	//
	//delete is_flexible_daily_budgets;
	//is_flexible_daily_budgets = NULL;
	//}
	//
}

void
CampaignCommon::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
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
	const gchar *lifetime_spend_capKey = "lifetime_spend_cap";
	node = json_object_get_member(pJsonObject, lifetime_spend_capKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lifetime_spend_cap, node, "int", "");
		} else {
			
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
	const gchar *order_line_idKey = "order_line_id";
	node = json_object_get_member(pJsonObject, order_line_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&order_line_id, node, "std::string", "");
		} else {
			
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
	const gchar *start_timeKey = "start_time";
	node = json_object_get_member(pJsonObject, start_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&start_time, node, "int", "");
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
	const gchar *is_flexible_daily_budgetsKey = "is_flexible_daily_budgets";
	node = json_object_get_member(pJsonObject, is_flexible_daily_budgetsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_flexible_daily_budgets, node, "bool", "");
		} else {
			
		}
	}
}

CampaignCommon::CampaignCommon(char* json)
{
	this->fromJson(json);
}

char*
CampaignCommon::toJson()
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
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
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
	if (isprimitive("int")) {
		int obj = getLifetimeSpendCap();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lifetime_spend_capKey = "lifetime_spend_cap";
	json_object_set_member(pJsonObject, lifetime_spend_capKey, node);
	if (isprimitive("int")) {
		int obj = getDailySpendCap();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *daily_spend_capKey = "daily_spend_cap";
	json_object_set_member(pJsonObject, daily_spend_capKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOrderLineId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *order_line_idKey = "order_line_id";
	json_object_set_member(pJsonObject, order_line_idKey, node);
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
	if (isprimitive("int")) {
		int obj = getStartTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *start_timeKey = "start_time";
	json_object_set_member(pJsonObject, start_timeKey, node);
	if (isprimitive("int")) {
		int obj = getEndTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *end_timeKey = "end_time";
	json_object_set_member(pJsonObject, end_timeKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsFlexibleDailyBudgets();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_flexible_daily_budgetsKey = "is_flexible_daily_budgets";
	json_object_set_member(pJsonObject, is_flexible_daily_budgetsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CampaignCommon::getAdAccountId()
{
	return ad_account_id;
}

void
CampaignCommon::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
CampaignCommon::getName()
{
	return name;
}

void
CampaignCommon::setName(std::string  name)
{
	this->name = name;
}

EntityStatus
CampaignCommon::getStatus()
{
	return status;
}

void
CampaignCommon::setStatus(EntityStatus  status)
{
	this->status = status;
}

int
CampaignCommon::getLifetimeSpendCap()
{
	return lifetime_spend_cap;
}

void
CampaignCommon::setLifetimeSpendCap(int  lifetime_spend_cap)
{
	this->lifetime_spend_cap = lifetime_spend_cap;
}

int
CampaignCommon::getDailySpendCap()
{
	return daily_spend_cap;
}

void
CampaignCommon::setDailySpendCap(int  daily_spend_cap)
{
	this->daily_spend_cap = daily_spend_cap;
}

std::string
CampaignCommon::getOrderLineId()
{
	return order_line_id;
}

void
CampaignCommon::setOrderLineId(std::string  order_line_id)
{
	this->order_line_id = order_line_id;
}

TrackingUrls
CampaignCommon::getTrackingUrls()
{
	return tracking_urls;
}

void
CampaignCommon::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

int
CampaignCommon::getStartTime()
{
	return start_time;
}

void
CampaignCommon::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

int
CampaignCommon::getEndTime()
{
	return end_time;
}

void
CampaignCommon::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

bool
CampaignCommon::getIsFlexibleDailyBudgets()
{
	return is_flexible_daily_budgets;
}

void
CampaignCommon::setIsFlexibleDailyBudgets(bool  is_flexible_daily_budgets)
{
	this->is_flexible_daily_budgets = is_flexible_daily_budgets;
}


