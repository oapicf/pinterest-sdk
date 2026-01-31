#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionMSOTEvents.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionMSOTEvents::ConversionMSOTEvents()
{
	//__init();
}

ConversionMSOTEvents::~ConversionMSOTEvents()
{
	//__cleanup();
}

void
ConversionMSOTEvents::__init()
{
	//new std::list()std::list> action_timestamps;
	//ad_group_id = std::string();
	//attribution_model = std::string();
	//attribution_scope = std::string();
	//attribution_score = double(0);
	//campaign_id = std::string();
	//currency = null;
	//event_id = std::string();
	//event_name = std::string();
	//event_timestamp = long(0);
	//total_event_touchpoints = int(0);
	//total_events = int(0);
	//value = double(0);
}

void
ConversionMSOTEvents::__cleanup()
{
	//if(action_timestamps != NULL) {
	//action_timestamps.RemoveAll(true);
	//delete action_timestamps;
	//action_timestamps = NULL;
	//}
	//if(ad_group_id != NULL) {
	//
	//delete ad_group_id;
	//ad_group_id = NULL;
	//}
	//if(attribution_model != NULL) {
	//
	//delete attribution_model;
	//attribution_model = NULL;
	//}
	//if(attribution_scope != NULL) {
	//
	//delete attribution_scope;
	//attribution_scope = NULL;
	//}
	//if(attribution_score != NULL) {
	//
	//delete attribution_score;
	//attribution_score = NULL;
	//}
	//if(campaign_id != NULL) {
	//
	//delete campaign_id;
	//campaign_id = NULL;
	//}
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//if(event_id != NULL) {
	//
	//delete event_id;
	//event_id = NULL;
	//}
	//if(event_name != NULL) {
	//
	//delete event_name;
	//event_name = NULL;
	//}
	//if(event_timestamp != NULL) {
	//
	//delete event_timestamp;
	//event_timestamp = NULL;
	//}
	//if(total_event_touchpoints != NULL) {
	//
	//delete total_event_touchpoints;
	//total_event_touchpoints = NULL;
	//}
	//if(total_events != NULL) {
	//
	//delete total_events;
	//total_events = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//
}

void
ConversionMSOTEvents::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *action_timestampsKey = "action_timestamps";
	node = json_object_get_member(pJsonObject, action_timestampsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<long long> new_list;
			long long inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("long long")) {
					jsonToValue(&inst, temp_json, "long long", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			action_timestamps = new_list;
		}
		
	}
	const gchar *ad_group_idKey = "ad_group_id";
	node = json_object_get_member(pJsonObject, ad_group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_group_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *attribution_modelKey = "attribution_model";
	node = json_object_get_member(pJsonObject, attribution_modelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&attribution_model, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *attribution_scopeKey = "attribution_scope";
	node = json_object_get_member(pJsonObject, attribution_scopeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&attribution_scope, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *attribution_scoreKey = "attribution_score";
	node = json_object_get_member(pJsonObject, attribution_scoreKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&attribution_score, node, "double", "");
		} else {
			
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
	const gchar *currencyKey = "currency";
	node = json_object_get_member(pJsonObject, currencyKey);
	if (node !=NULL) {
	

		if (isprimitive("Currency")) {
			jsonToValue(&currency, node, "Currency", "Currency");
		} else {
			
			Currency* obj = static_cast<Currency*> (&currency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *event_idKey = "event_id";
	node = json_object_get_member(pJsonObject, event_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&event_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *event_nameKey = "event_name";
	node = json_object_get_member(pJsonObject, event_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&event_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *event_timestampKey = "event_timestamp";
	node = json_object_get_member(pJsonObject, event_timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&event_timestamp, node, "long long", "");
		} else {
			
		}
	}
	const gchar *total_event_touchpointsKey = "total_event_touchpoints";
	node = json_object_get_member(pJsonObject, total_event_touchpointsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&total_event_touchpoints, node, "int", "");
		} else {
			
		}
	}
	const gchar *total_eventsKey = "total_events";
	node = json_object_get_member(pJsonObject, total_eventsKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&total_events, node, "int", "");
		} else {
			
		}
	}
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("double")) {
			jsonToValue(&value, node, "double", "");
		} else {
			
		}
	}
}

ConversionMSOTEvents::ConversionMSOTEvents(char* json)
{
	this->fromJson(json);
}

char*
ConversionMSOTEvents::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		list<long long> new_list = static_cast<list <long long> > (getActionTimestamps());
		node = converttoJson(&new_list, "long long", "array");
	} else {
		node = json_node_alloc();
		list<long long> new_list = static_cast<list <long long> > (getActionTimestamps());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *action_timestampsKey = "action_timestamps";
	json_object_set_member(pJsonObject, action_timestampsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdGroupId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_group_idKey = "ad_group_id";
	json_object_set_member(pJsonObject, ad_group_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAttributionModel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *attribution_modelKey = "attribution_model";
	json_object_set_member(pJsonObject, attribution_modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAttributionScope();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *attribution_scopeKey = "attribution_scope";
	json_object_set_member(pJsonObject, attribution_scopeKey, node);
	if (isprimitive("double")) {
		double obj = getAttributionScore();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *attribution_scoreKey = "attribution_score";
	json_object_set_member(pJsonObject, attribution_scoreKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCampaignId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *campaign_idKey = "campaign_id";
	json_object_set_member(pJsonObject, campaign_idKey, node);
	if (isprimitive("Currency")) {
		Currency obj = getCurrency();
		node = converttoJson(&obj, "Currency", "");
	}
	else {
		
		Currency obj = static_cast<Currency> (getCurrency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *currencyKey = "currency";
	json_object_set_member(pJsonObject, currencyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEventId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *event_idKey = "event_id";
	json_object_set_member(pJsonObject, event_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEventName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *event_nameKey = "event_name";
	json_object_set_member(pJsonObject, event_nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getEventTimestamp();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *event_timestampKey = "event_timestamp";
	json_object_set_member(pJsonObject, event_timestampKey, node);
	if (isprimitive("int")) {
		int obj = getTotalEventTouchpoints();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *total_event_touchpointsKey = "total_event_touchpoints";
	json_object_set_member(pJsonObject, total_event_touchpointsKey, node);
	if (isprimitive("int")) {
		int obj = getTotalEvents();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *total_eventsKey = "total_events";
	json_object_set_member(pJsonObject, total_eventsKey, node);
	if (isprimitive("double")) {
		double obj = getValue();
		node = converttoJson(&obj, "double", "");
	}
	else {
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<long long>
ConversionMSOTEvents::getActionTimestamps()
{
	return action_timestamps;
}

void
ConversionMSOTEvents::setActionTimestamps(std::list <long long> action_timestamps)
{
	this->action_timestamps = action_timestamps;
}

std::string
ConversionMSOTEvents::getAdGroupId()
{
	return ad_group_id;
}

void
ConversionMSOTEvents::setAdGroupId(std::string  ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

std::string
ConversionMSOTEvents::getAttributionModel()
{
	return attribution_model;
}

void
ConversionMSOTEvents::setAttributionModel(std::string  attribution_model)
{
	this->attribution_model = attribution_model;
}

std::string
ConversionMSOTEvents::getAttributionScope()
{
	return attribution_scope;
}

void
ConversionMSOTEvents::setAttributionScope(std::string  attribution_scope)
{
	this->attribution_scope = attribution_scope;
}

double
ConversionMSOTEvents::getAttributionScore()
{
	return attribution_score;
}

void
ConversionMSOTEvents::setAttributionScore(double  attribution_score)
{
	this->attribution_score = attribution_score;
}

std::string
ConversionMSOTEvents::getCampaignId()
{
	return campaign_id;
}

void
ConversionMSOTEvents::setCampaignId(std::string  campaign_id)
{
	this->campaign_id = campaign_id;
}

Currency
ConversionMSOTEvents::getCurrency()
{
	return currency;
}

void
ConversionMSOTEvents::setCurrency(Currency  currency)
{
	this->currency = currency;
}

std::string
ConversionMSOTEvents::getEventId()
{
	return event_id;
}

void
ConversionMSOTEvents::setEventId(std::string  event_id)
{
	this->event_id = event_id;
}

std::string
ConversionMSOTEvents::getEventName()
{
	return event_name;
}

void
ConversionMSOTEvents::setEventName(std::string  event_name)
{
	this->event_name = event_name;
}

long long
ConversionMSOTEvents::getEventTimestamp()
{
	return event_timestamp;
}

void
ConversionMSOTEvents::setEventTimestamp(long long  event_timestamp)
{
	this->event_timestamp = event_timestamp;
}

int
ConversionMSOTEvents::getTotalEventTouchpoints()
{
	return total_event_touchpoints;
}

void
ConversionMSOTEvents::setTotalEventTouchpoints(int  total_event_touchpoints)
{
	this->total_event_touchpoints = total_event_touchpoints;
}

int
ConversionMSOTEvents::getTotalEvents()
{
	return total_events;
}

void
ConversionMSOTEvents::setTotalEvents(int  total_events)
{
	this->total_events = total_events;
}

double
ConversionMSOTEvents::getValue()
{
	return value;
}

void
ConversionMSOTEvents::setValue(double  value)
{
	this->value = value;
}


