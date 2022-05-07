#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupResponse_allOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupResponse_allOf::AdGroupResponse_allOf()
{
	//__init();
}

AdGroupResponse_allOf::~AdGroupResponse_allOf()
{
	//__cleanup();
}

void
AdGroupResponse_allOf::__init()
{
	//name = std::string();
	//status = std::string();
	//budget_in_micro_currency = int(0);
	//bid_in_micro_currency = int(0);
	//budget_type = std::string();
	//start_time = int(0);
	//end_time = int(0);
	//new std::map()std::map> targeting_spec;
	//lifetime_frequency_cap = int(0);
	//tracking_urls = null;
	//auto_targeting_enabled = bool(false);
	//placement_group = std::string();
	//pacing_delivery_type = std::string();
	//conversion_learning_mode_type = std::string();
	//summary_status = std::string();
	//feed_profile_id = std::string();
}

void
AdGroupResponse_allOf::__cleanup()
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
	//targeting_spec.RemoveAll(true);
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
	//if(conversion_learning_mode_type != NULL) {
	//
	//delete conversion_learning_mode_type;
	//conversion_learning_mode_type = NULL;
	//}
	//if(summary_status != NULL) {
	//
	//delete summary_status;
	//summary_status = NULL;
	//}
	//if(feed_profile_id != NULL) {
	//
	//delete feed_profile_id;
	//feed_profile_id = NULL;
	//}
	//
}

void
AdGroupResponse_allOf::fromJson(char* jsonStr)
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
	const gchar *budget_typeKey = "budget_type";
	node = json_object_get_member(pJsonObject, budget_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&budget_type, node, "std::string", "");
		} else {
			
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
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			targeting_spec = new_map;
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
	

		if (isprimitive("TrackingUrls")) {
			jsonToValue(&tracking_urls, node, "TrackingUrls", "TrackingUrls");
		} else {
			
			TrackingUrls* obj = static_cast<TrackingUrls*> (&tracking_urls);
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
			
		}
	}
	const gchar *pacing_delivery_typeKey = "pacing_delivery_type";
	node = json_object_get_member(pJsonObject, pacing_delivery_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("PacingDeliveryType")) {
			jsonToValue(&pacing_delivery_type, node, "PacingDeliveryType", "PacingDeliveryType");
		} else {
			
		}
	}
	const gchar *conversion_learning_mode_typeKey = "conversion_learning_mode_type";
	node = json_object_get_member(pJsonObject, conversion_learning_mode_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&conversion_learning_mode_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *summary_statusKey = "summary_status";
	node = json_object_get_member(pJsonObject, summary_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("AdGroupSummaryStatus")) {
			jsonToValue(&summary_status, node, "AdGroupSummaryStatus", "AdGroupSummaryStatus");
		} else {
			
		}
	}
	const gchar *feed_profile_idKey = "feed_profile_id";
	node = json_object_get_member(pJsonObject, feed_profile_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&feed_profile_id, node, "std::string", "");
		} else {
			
		}
	}
}

AdGroupResponse_allOf::AdGroupResponse_allOf(char* json)
{
	this->fromJson(json);
}

char*
AdGroupResponse_allOf::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getBudgetType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
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


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getTargetingSpec());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
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
		
	}
	const gchar *placement_groupKey = "placement_group";
	json_object_set_member(pJsonObject, placement_groupKey, node);
	if (isprimitive("PacingDeliveryType")) {
		PacingDeliveryType obj = getPacingDeliveryType();
		node = converttoJson(&obj, "PacingDeliveryType", "");
	}
	else {
		
	}
	const gchar *pacing_delivery_typeKey = "pacing_delivery_type";
	json_object_set_member(pJsonObject, pacing_delivery_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getConversionLearningModeType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *conversion_learning_mode_typeKey = "conversion_learning_mode_type";
	json_object_set_member(pJsonObject, conversion_learning_mode_typeKey, node);
	if (isprimitive("AdGroupSummaryStatus")) {
		AdGroupSummaryStatus obj = getSummaryStatus();
		node = converttoJson(&obj, "AdGroupSummaryStatus", "");
	}
	else {
		
	}
	const gchar *summary_statusKey = "summary_status";
	json_object_set_member(pJsonObject, summary_statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getFeedProfileId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *feed_profile_idKey = "feed_profile_id";
	json_object_set_member(pJsonObject, feed_profile_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdGroupResponse_allOf::getName()
{
	return name;
}

void
AdGroupResponse_allOf::setName(std::string  name)
{
	this->name = name;
}

EntityStatus
AdGroupResponse_allOf::getStatus()
{
	return status;
}

void
AdGroupResponse_allOf::setStatus(EntityStatus  status)
{
	this->status = status;
}

int
AdGroupResponse_allOf::getBudgetInMicroCurrency()
{
	return budget_in_micro_currency;
}

void
AdGroupResponse_allOf::setBudgetInMicroCurrency(int  budget_in_micro_currency)
{
	this->budget_in_micro_currency = budget_in_micro_currency;
}

int
AdGroupResponse_allOf::getBidInMicroCurrency()
{
	return bid_in_micro_currency;
}

void
AdGroupResponse_allOf::setBidInMicroCurrency(int  bid_in_micro_currency)
{
	this->bid_in_micro_currency = bid_in_micro_currency;
}

std::string
AdGroupResponse_allOf::getBudgetType()
{
	return budget_type;
}

void
AdGroupResponse_allOf::setBudgetType(std::string  budget_type)
{
	this->budget_type = budget_type;
}

int
AdGroupResponse_allOf::getStartTime()
{
	return start_time;
}

void
AdGroupResponse_allOf::setStartTime(int  start_time)
{
	this->start_time = start_time;
}

int
AdGroupResponse_allOf::getEndTime()
{
	return end_time;
}

void
AdGroupResponse_allOf::setEndTime(int  end_time)
{
	this->end_time = end_time;
}

std::map<string, string>
AdGroupResponse_allOf::getTargetingSpec()
{
	return targeting_spec;
}

void
AdGroupResponse_allOf::setTargetingSpec(std::map <string, string> targeting_spec)
{
	this->targeting_spec = targeting_spec;
}

int
AdGroupResponse_allOf::getLifetimeFrequencyCap()
{
	return lifetime_frequency_cap;
}

void
AdGroupResponse_allOf::setLifetimeFrequencyCap(int  lifetime_frequency_cap)
{
	this->lifetime_frequency_cap = lifetime_frequency_cap;
}

TrackingUrls
AdGroupResponse_allOf::getTrackingUrls()
{
	return tracking_urls;
}

void
AdGroupResponse_allOf::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

bool
AdGroupResponse_allOf::getAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
AdGroupResponse_allOf::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

PlacementGroupType
AdGroupResponse_allOf::getPlacementGroup()
{
	return placement_group;
}

void
AdGroupResponse_allOf::setPlacementGroup(PlacementGroupType  placement_group)
{
	this->placement_group = placement_group;
}

PacingDeliveryType
AdGroupResponse_allOf::getPacingDeliveryType()
{
	return pacing_delivery_type;
}

void
AdGroupResponse_allOf::setPacingDeliveryType(PacingDeliveryType  pacing_delivery_type)
{
	this->pacing_delivery_type = pacing_delivery_type;
}

std::string
AdGroupResponse_allOf::getConversionLearningModeType()
{
	return conversion_learning_mode_type;
}

void
AdGroupResponse_allOf::setConversionLearningModeType(std::string  conversion_learning_mode_type)
{
	this->conversion_learning_mode_type = conversion_learning_mode_type;
}

AdGroupSummaryStatus
AdGroupResponse_allOf::getSummaryStatus()
{
	return summary_status;
}

void
AdGroupResponse_allOf::setSummaryStatus(AdGroupSummaryStatus  summary_status)
{
	this->summary_status = summary_status;
}

std::string
AdGroupResponse_allOf::getFeedProfileId()
{
	return feed_profile_id;
}

void
AdGroupResponse_allOf::setFeedProfileId(std::string  feed_profile_id)
{
	this->feed_profile_id = feed_profile_id;
}


