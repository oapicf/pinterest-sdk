#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupUpdateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupUpdateRequest::AdGroupUpdateRequest()
{
	//__init();
}

AdGroupUpdateRequest::~AdGroupUpdateRequest()
{
	//__cleanup();
}

void
AdGroupUpdateRequest::__init()
{
	//name = std::string();
	//status = std::string();
	//budget_in_micro_currency = int(0);
	//bid_in_micro_currency = int(0);
	//optimization_goal_metadata = new AdGroupCommon_optimization_goal_metadata();
	//budget_type = std::string();
	//start_time = int(0);
	//end_time = int(0);
	//targeting_spec = new TargetingSpec();
	//lifetime_frequency_cap = int(0);
	//tracking_urls = new AdGroupCommon_tracking_urls();
	//auto_targeting_enabled = bool(false);
	//placement_group = std::string();
	//pacing_delivery_type = std::string();
	//campaign_id = std::string();
	//billable_event = new ActionType();
	//bid_strategy_type = std::string();
	//id = std::string();
}

void
AdGroupUpdateRequest::__cleanup()
{
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
	//if(budget_in_micro_currency != NULL) {
	//
	//delete budget_in_micro_currency;
	//budget_in_micro_currency = NULL;
	//}
	//if(bid_in_micro_currency != NULL) {
	//
	//delete bid_in_micro_currency;
	//bid_in_micro_currency = NULL;
	//}
	//if(optimization_goal_metadata != NULL) {
	//
	//delete optimization_goal_metadata;
	//optimization_goal_metadata = NULL;
	//}
	//if(budget_type != NULL) {
	//
	//delete budget_type;
	//budget_type = NULL;
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
	//if(targeting_spec != NULL) {
	//
	//delete targeting_spec;
	//targeting_spec = NULL;
	//}
	//if(lifetime_frequency_cap != NULL) {
	//
	//delete lifetime_frequency_cap;
	//lifetime_frequency_cap = NULL;
	//}
	//if(tracking_urls != NULL) {
	//
	//delete tracking_urls;
	//tracking_urls = NULL;
	//}
	//if(auto_targeting_enabled != NULL) {
	//
	//delete auto_targeting_enabled;
	//auto_targeting_enabled = NULL;
	//}
	//if(placement_group != NULL) {
	//
	//delete placement_group;
	//placement_group = NULL;
	//}
	//if(pacing_delivery_type != NULL) {
	//
	//delete pacing_delivery_type;
	//pacing_delivery_type = NULL;
	//}
	//if(campaign_id != NULL) {
	//
	//delete campaign_id;
	//campaign_id = NULL;
	//}
	//if(billable_event != NULL) {
	//
	//delete billable_event;
	//billable_event = NULL;
	//}
	//if(bid_strategy_type != NULL) {
	//
	//delete bid_strategy_type;
	//bid_strategy_type = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
AdGroupUpdateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *budget_in_micro_currencyKey = "budget_in_micro_currency";
	node = json_object_get_member(pJsonObject, budget_in_micro_currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&budget_in_micro_currency, node, "int", "");
		} else {
			
		}
	}
	const gchar *bid_in_micro_currencyKey = "bid_in_micro_currency";
	node = json_object_get_member(pJsonObject, bid_in_micro_currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&bid_in_micro_currency, node, "int", "");
		} else {
			
		}
	}
	const gchar *optimization_goal_metadataKey = "optimization_goal_metadata";
	node = json_object_get_member(pJsonObject, optimization_goal_metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("AdGroupCommon_optimization_goal_metadata")) {
			jsonToValue(&optimization_goal_metadata, node, "AdGroupCommon_optimization_goal_metadata", "AdGroupCommon_optimization_goal_metadata");
		} else {
			
			AdGroupCommon_optimization_goal_metadata* obj = static_cast<AdGroupCommon_optimization_goal_metadata*> (&optimization_goal_metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *budget_typeKey = "budget_type";
	node = json_object_get_member(pJsonObject, budget_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("BudgetType")) {
			jsonToValue(&budget_type, node, "BudgetType", "BudgetType");
		} else {
			
			BudgetType* obj = static_cast<BudgetType*> (&budget_type);
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
	const gchar *targeting_specKey = "targeting_spec";
	node = json_object_get_member(pJsonObject, targeting_specKey);
	if (node !=NULL) {
	

		if (isprimitive("TargetingSpec")) {
			jsonToValue(&targeting_spec, node, "TargetingSpec", "TargetingSpec");
		} else {
			
			TargetingSpec* obj = static_cast<TargetingSpec*> (&targeting_spec);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *lifetime_frequency_capKey = "lifetime_frequency_cap";
	node = json_object_get_member(pJsonObject, lifetime_frequency_capKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&lifetime_frequency_cap, node, "int", "");
		} else {
			
		}
	}
	const gchar *tracking_urlsKey = "tracking_urls";
	node = json_object_get_member(pJsonObject, tracking_urlsKey);
	if (node !=NULL) {
	

		if (isprimitive("AdGroupCommon_tracking_urls")) {
			jsonToValue(&tracking_urls, node, "AdGroupCommon_tracking_urls", "AdGroupCommon_tracking_urls");
		} else {
			
			AdGroupCommon_tracking_urls* obj = static_cast<AdGroupCommon_tracking_urls*> (&tracking_urls);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *auto_targeting_enabledKey = "auto_targeting_enabled";
	node = json_object_get_member(pJsonObject, auto_targeting_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&auto_targeting_enabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *placement_groupKey = "placement_group";
	node = json_object_get_member(pJsonObject, placement_groupKey);
	if (node !=NULL) {
	

		if (isprimitive("PlacementGroupType")) {
			jsonToValue(&placement_group, node, "PlacementGroupType", "PlacementGroupType");
		} else {
			
			PlacementGroupType* obj = static_cast<PlacementGroupType*> (&placement_group);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pacing_delivery_typeKey = "pacing_delivery_type";
	node = json_object_get_member(pJsonObject, pacing_delivery_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("PacingDeliveryType")) {
			jsonToValue(&pacing_delivery_type, node, "PacingDeliveryType", "PacingDeliveryType");
		} else {
			
			PacingDeliveryType* obj = static_cast<PacingDeliveryType*> (&pacing_delivery_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *campaign_idKey = "campaign_id";
	node = json_object_get_member(pJsonObject, campaign_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&campaign_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *billable_eventKey = "billable_event";
	node = json_object_get_member(pJsonObject, billable_eventKey);
	if (node !=NULL) {
	

		if (isprimitive("ActionType")) {
			jsonToValue(&billable_event, node, "ActionType", "ActionType");
		} else {
			
			ActionType* obj = static_cast<ActionType*> (&billable_event);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *bid_strategy_typeKey = "bid_strategy_type";
	node = json_object_get_member(pJsonObject, bid_strategy_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&bid_strategy_type, node, "std::string", "");
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
}

AdGroupUpdateRequest::AdGroupUpdateRequest(char* json)
{
	this->fromJson(json);
}

char*
AdGroupUpdateRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
		int obj = getBudgetInMicroCurrency();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *budget_in_micro_currencyKey = "budget_in_micro_currency";
	json_object_set_member(pJsonObject, budget_in_micro_currencyKey, node);
	if (isprimitive("int")) {
		int obj = getBidInMicroCurrency();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *bid_in_micro_currencyKey = "bid_in_micro_currency";
	json_object_set_member(pJsonObject, bid_in_micro_currencyKey, node);
	if (isprimitive("AdGroupCommon_optimization_goal_metadata")) {
		AdGroupCommon_optimization_goal_metadata obj = getOptimizationGoalMetadata();
		node = converttoJson(&obj, "AdGroupCommon_optimization_goal_metadata", "");
	}
	else {
		
		AdGroupCommon_optimization_goal_metadata obj = static_cast<AdGroupCommon_optimization_goal_metadata> (getOptimizationGoalMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *optimization_goal_metadataKey = "optimization_goal_metadata";
	json_object_set_member(pJsonObject, optimization_goal_metadataKey, node);
	if (isprimitive("BudgetType")) {
		BudgetType obj = getBudgetType();
		node = converttoJson(&obj, "BudgetType", "");
	}
	else {
		
		BudgetType obj = static_cast<BudgetType> (getBudgetType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *budget_typeKey = "budget_type";
	json_object_set_member(pJsonObject, budget_typeKey, node);
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
	if (isprimitive("TargetingSpec")) {
		TargetingSpec obj = getTargetingSpec();
		node = converttoJson(&obj, "TargetingSpec", "");
	}
	else {
		
		TargetingSpec obj = static_cast<TargetingSpec> (getTargetingSpec());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *targeting_specKey = "targeting_spec";
	json_object_set_member(pJsonObject, targeting_specKey, node);
	if (isprimitive("int")) {
		int obj = getLifetimeFrequencyCap();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *lifetime_frequency_capKey = "lifetime_frequency_cap";
	json_object_set_member(pJsonObject, lifetime_frequency_capKey, node);
	if (isprimitive("AdGroupCommon_tracking_urls")) {
		AdGroupCommon_tracking_urls obj = getTrackingUrls();
		node = converttoJson(&obj, "AdGroupCommon_tracking_urls", "");
	}
	else {
		
		AdGroupCommon_tracking_urls obj = static_cast<AdGroupCommon_tracking_urls> (getTrackingUrls());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tracking_urlsKey = "tracking_urls";
	json_object_set_member(pJsonObject, tracking_urlsKey, node);
	if (isprimitive("bool")) {
		bool obj = getAutoTargetingEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *auto_targeting_enabledKey = "auto_targeting_enabled";
	json_object_set_member(pJsonObject, auto_targeting_enabledKey, node);
	if (isprimitive("PlacementGroupType")) {
		PlacementGroupType obj = getPlacementGroup();
		node = converttoJson(&obj, "PlacementGroupType", "");
	}
	else {
		
		PlacementGroupType obj = static_cast<PlacementGroupType> (getPlacementGroup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *placement_groupKey = "placement_group";
	json_object_set_member(pJsonObject, placement_groupKey, node);
	if (isprimitive("PacingDeliveryType")) {
		PacingDeliveryType obj = getPacingDeliveryType();
		node = converttoJson(&obj, "PacingDeliveryType", "");
	}
	else {
		
		PacingDeliveryType obj = static_cast<PacingDeliveryType> (getPacingDeliveryType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pacing_delivery_typeKey = "pacing_delivery_type";
	json_object_set_member(pJsonObject, pacing_delivery_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCampaignId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *campaign_idKey = "campaign_id";
	json_object_set_member(pJsonObject, campaign_idKey, node);
	if (isprimitive("ActionType")) {
		ActionType obj = getBillableEvent();
		node = converttoJson(&obj, "ActionType", "");
	}
	else {
		
		ActionType obj = static_cast<ActionType> (getBillableEvent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *billable_eventKey = "billable_event";
	json_object_set_member(pJsonObject, billable_eventKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getBidStrategyType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *bid_strategy_typeKey = "bid_strategy_type";
	json_object_set_member(pJsonObject, bid_strategy_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdGroupUpdateRequest::getName()
{
	return name;
}

void
AdGroupUpdateRequest::setName(std::string  name)
{
	this->name = name;
}

EntityStatus
AdGroupUpdateRequest::getStatus()
{
	return status;
}

void
AdGroupUpdateRequest::setStatus(EntityStatus  status)
{
	this->status = status;
}

int
AdGroupUpdateRequest::getBudgetInMicroCurrency()
{
	return budget_in_micro_currency;
}

void
AdGroupUpdateRequest::setBudgetInMicroCurrency(int  budget_in_micro_currency)
{
	this->budget_in_micro_currency = budget_in_micro_currency;
}

int
AdGroupUpdateRequest::getBidInMicroCurrency()
{
	return bid_in_micro_currency;
}

void
AdGroupUpdateRequest::setBidInMicroCurrency(int  bid_in_micro_currency)
{
	this->bid_in_micro_currency = bid_in_micro_currency;
}

AdGroupCommon_optimization_goal_metadata
AdGroupUpdateRequest::getOptimizationGoalMetadata()
{
	return optimization_goal_metadata;
}

void
AdGroupUpdateRequest::setOptimizationGoalMetadata(AdGroupCommon_optimization_goal_metadata  optimization_goal_metadata)
{
	this->optimization_goal_metadata = optimization_goal_metadata;
}

BudgetType
AdGroupUpdateRequest::getBudgetType()
{
	return budget_type;
}

void
AdGroupUpdateRequest::setBudgetType(BudgetType  budget_type)
{
	this->budget_type = budget_type;
}

int
AdGroupUpdateRequest::getStartTime()
{
	return start_time;
}

void
AdGroupUpdateRequest::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

int
AdGroupUpdateRequest::getEndTime()
{
	return end_time;
}

void
AdGroupUpdateRequest::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

TargetingSpec
AdGroupUpdateRequest::getTargetingSpec()
{
	return targeting_spec;
}

void
AdGroupUpdateRequest::setTargetingSpec(TargetingSpec  targeting_spec)
{
	this->targeting_spec = targeting_spec;
}

int
AdGroupUpdateRequest::getLifetimeFrequencyCap()
{
	return lifetime_frequency_cap;
}

void
AdGroupUpdateRequest::setLifetimeFrequencyCap(int  lifetime_frequency_cap)
{
	this->lifetime_frequency_cap = lifetime_frequency_cap;
}

AdGroupCommon_tracking_urls
AdGroupUpdateRequest::getTrackingUrls()
{
	return tracking_urls;
}

void
AdGroupUpdateRequest::setTrackingUrls(AdGroupCommon_tracking_urls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

bool
AdGroupUpdateRequest::getAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
AdGroupUpdateRequest::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

PlacementGroupType
AdGroupUpdateRequest::getPlacementGroup()
{
	return placement_group;
}

void
AdGroupUpdateRequest::setPlacementGroup(PlacementGroupType  placement_group)
{
	this->placement_group = placement_group;
}

PacingDeliveryType
AdGroupUpdateRequest::getPacingDeliveryType()
{
	return pacing_delivery_type;
}

void
AdGroupUpdateRequest::setPacingDeliveryType(PacingDeliveryType  pacing_delivery_type)
{
	this->pacing_delivery_type = pacing_delivery_type;
}

std::string
AdGroupUpdateRequest::getCampaignId()
{
	return campaign_id;
}

void
AdGroupUpdateRequest::setCampaignId(std::string  campaign_id)
{
	this->campaign_id = campaign_id;
}

ActionType
AdGroupUpdateRequest::getBillableEvent()
{
	return billable_event;
}

void
AdGroupUpdateRequest::setBillableEvent(ActionType  billable_event)
{
	this->billable_event = billable_event;
}

std::string
AdGroupUpdateRequest::getBidStrategyType()
{
	return bid_strategy_type;
}

void
AdGroupUpdateRequest::setBidStrategyType(std::string  bid_strategy_type)
{
	this->bid_strategy_type = bid_strategy_type;
}

std::string
AdGroupUpdateRequest::getId()
{
	return id;
}

void
AdGroupUpdateRequest::setId(std::string  id)
{
	this->id = id;
}


