#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdAccountsAudienceRule.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdAccountsAudienceRule::AdAccountsAudienceRule()
{
	//__init();
}

AdAccountsAudienceRule::~AdAccountsAudienceRule()
{
	//__cleanup();
}

void
AdAccountsAudienceRule::__init()
{
	//ad_account_id = std::string();
	//new std::list()std::list> ad_id;
	//new std::list()std::list> campaign_id;
	//country = std::string();
	//customer_list_id = std::string();
	//new std::list()std::list> engagement_domain;
	//engagement_type = std::string();
	//engager_type = int(0);
	//event = std::string();
	//event_data = new EventData();
	//event_source = null;
	//ingestion_source = null;
	//new std::list()std::list> objective_type;
	//percentage = int(0);
	//new std::list()std::list> pin_id;
	//prefill = bool(false);
	//retention_days = int(0);
	//new std::list()std::list> seed_id;
	//new std::list()std::list> url;
	//visitor_source_id = std::string();
}

void
AdAccountsAudienceRule::__cleanup()
{
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(ad_id != NULL) {
	//ad_id.RemoveAll(true);
	//delete ad_id;
	//ad_id = NULL;
	//}
	//if(campaign_id != NULL) {
	//campaign_id.RemoveAll(true);
	//delete campaign_id;
	//campaign_id = NULL;
	//}
	//if(country != NULL) {
	//
	//delete country;
	//country = NULL;
	//}
	//if(customer_list_id != NULL) {
	//
	//delete customer_list_id;
	//customer_list_id = NULL;
	//}
	//if(engagement_domain != NULL) {
	//engagement_domain.RemoveAll(true);
	//delete engagement_domain;
	//engagement_domain = NULL;
	//}
	//if(engagement_type != NULL) {
	//
	//delete engagement_type;
	//engagement_type = NULL;
	//}
	//if(engager_type != NULL) {
	//
	//delete engager_type;
	//engager_type = NULL;
	//}
	//if(event != NULL) {
	//
	//delete event;
	//event = NULL;
	//}
	//if(event_data != NULL) {
	//
	//delete event_data;
	//event_data = NULL;
	//}
	//if(event_source != NULL) {
	//
	//delete event_source;
	//event_source = NULL;
	//}
	//if(ingestion_source != NULL) {
	//
	//delete ingestion_source;
	//ingestion_source = NULL;
	//}
	//if(objective_type != NULL) {
	//objective_type.RemoveAll(true);
	//delete objective_type;
	//objective_type = NULL;
	//}
	//if(percentage != NULL) {
	//
	//delete percentage;
	//percentage = NULL;
	//}
	//if(pin_id != NULL) {
	//pin_id.RemoveAll(true);
	//delete pin_id;
	//pin_id = NULL;
	//}
	//if(prefill != NULL) {
	//
	//delete prefill;
	//prefill = NULL;
	//}
	//if(retention_days != NULL) {
	//
	//delete retention_days;
	//retention_days = NULL;
	//}
	//if(seed_id != NULL) {
	//seed_id.RemoveAll(true);
	//delete seed_id;
	//seed_id = NULL;
	//}
	//if(url != NULL) {
	//url.RemoveAll(true);
	//delete url;
	//url = NULL;
	//}
	//if(visitor_source_id != NULL) {
	//
	//delete visitor_source_id;
	//visitor_source_id = NULL;
	//}
	//
}

void
AdAccountsAudienceRule::fromJson(char* jsonStr)
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
	const gchar *ad_idKey = "ad_id";
	node = json_object_get_member(pJsonObject, ad_idKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			ad_id = new_list;
		}
		
	}
	const gchar *campaign_idKey = "campaign_id";
	node = json_object_get_member(pJsonObject, campaign_idKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			campaign_id = new_list;
		}
		
	}
	const gchar *countryKey = "country";
	node = json_object_get_member(pJsonObject, countryKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&country, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *customer_list_idKey = "customer_list_id";
	node = json_object_get_member(pJsonObject, customer_list_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&customer_list_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *engagement_domainKey = "engagement_domain";
	node = json_object_get_member(pJsonObject, engagement_domainKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			engagement_domain = new_list;
		}
		
	}
	const gchar *engagement_typeKey = "engagement_type";
	node = json_object_get_member(pJsonObject, engagement_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&engagement_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *engager_typeKey = "engager_type";
	node = json_object_get_member(pJsonObject, engager_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&engager_type, node, "int", "");
		} else {
			
		}
	}
	const gchar *eventKey = "event";
	node = json_object_get_member(pJsonObject, eventKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&event, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *event_dataKey = "event_data";
	node = json_object_get_member(pJsonObject, event_dataKey);
	if (node !=NULL) {
	

		if (isprimitive("EventData")) {
			jsonToValue(&event_data, node, "EventData", "EventData");
		} else {
			
			EventData* obj = static_cast<EventData*> (&event_data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *event_sourceKey = "event_source";
	node = json_object_get_member(pJsonObject, event_sourceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&event_source, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&event_source);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ingestion_sourceKey = "ingestion_source";
	node = json_object_get_member(pJsonObject, ingestion_sourceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ingestion_source, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&ingestion_source);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *objective_typeKey = "objective_type";
	node = json_object_get_member(pJsonObject, objective_typeKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AudienceObjectiveType> new_list;
			AudienceObjectiveType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AudienceObjectiveType")) {
					jsonToValue(&inst, temp_json, "AudienceObjectiveType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			objective_type = new_list;
		}
		
	}
	const gchar *percentageKey = "percentage";
	node = json_object_get_member(pJsonObject, percentageKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&percentage, node, "int", "");
		} else {
			
		}
	}
	const gchar *pin_idKey = "pin_id";
	node = json_object_get_member(pJsonObject, pin_idKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			pin_id = new_list;
		}
		
	}
	const gchar *prefillKey = "prefill";
	node = json_object_get_member(pJsonObject, prefillKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&prefill, node, "bool", "");
		} else {
			
		}
	}
	const gchar *retention_daysKey = "retention_days";
	node = json_object_get_member(pJsonObject, retention_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&retention_days, node, "int", "");
		} else {
			
		}
	}
	const gchar *seed_idKey = "seed_id";
	node = json_object_get_member(pJsonObject, seed_idKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			seed_id = new_list;
		}
		
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			url = new_list;
		}
		
	}
	const gchar *visitor_source_idKey = "visitor_source_id";
	node = json_object_get_member(pJsonObject, visitor_source_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&visitor_source_id, node, "std::string", "");
		} else {
			
		}
	}
}

AdAccountsAudienceRule::AdAccountsAudienceRule(char* json)
{
	this->fromJson(json);
}

char*
AdAccountsAudienceRule::toJson()
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
		list<std::string> new_list = static_cast<list <std::string> > (getAdId());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAdId());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *ad_idKey = "ad_id";
	json_object_set_member(pJsonObject, ad_idKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCampaignId());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCampaignId());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *campaign_idKey = "campaign_id";
	json_object_set_member(pJsonObject, campaign_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCountry();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *countryKey = "country";
	json_object_set_member(pJsonObject, countryKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomerListId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *customer_list_idKey = "customer_list_id";
	json_object_set_member(pJsonObject, customer_list_idKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getEngagementDomain());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getEngagementDomain());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *engagement_domainKey = "engagement_domain";
	json_object_set_member(pJsonObject, engagement_domainKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEngagementType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *engagement_typeKey = "engagement_type";
	json_object_set_member(pJsonObject, engagement_typeKey, node);
	if (isprimitive("int")) {
		int obj = getEngagerType();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *engager_typeKey = "engager_type";
	json_object_set_member(pJsonObject, engager_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEvent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *eventKey = "event";
	json_object_set_member(pJsonObject, eventKey, node);
	if (isprimitive("EventData")) {
		EventData obj = getEventData();
		node = converttoJson(&obj, "EventData", "");
	}
	else {
		
		EventData obj = static_cast<EventData> (getEventData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *event_dataKey = "event_data";
	json_object_set_member(pJsonObject, event_dataKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEventSource();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getEventSource());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *event_sourceKey = "event_source";
	json_object_set_member(pJsonObject, event_sourceKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getIngestionSource();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getIngestionSource());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ingestion_sourceKey = "ingestion_source";
	json_object_set_member(pJsonObject, ingestion_sourceKey, node);
	if (isprimitive("AudienceObjectiveType")) {
		list<AudienceObjectiveType> new_list = static_cast<list <AudienceObjectiveType> > (getObjectiveType());
		node = converttoJson(&new_list, "AudienceObjectiveType", "array");
	} else {
		node = json_node_alloc();
		list<AudienceObjectiveType> new_list = static_cast<list <AudienceObjectiveType> > (getObjectiveType());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AudienceObjectiveType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AudienceObjectiveType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *objective_typeKey = "objective_type";
	json_object_set_member(pJsonObject, objective_typeKey, node);
	if (isprimitive("int")) {
		int obj = getPercentage();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *percentageKey = "percentage";
	json_object_set_member(pJsonObject, percentageKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getPinId());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getPinId());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *pin_idKey = "pin_id";
	json_object_set_member(pJsonObject, pin_idKey, node);
	if (isprimitive("bool")) {
		bool obj = getPrefill();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *prefillKey = "prefill";
	json_object_set_member(pJsonObject, prefillKey, node);
	if (isprimitive("int")) {
		int obj = getRetentionDays();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *retention_daysKey = "retention_days";
	json_object_set_member(pJsonObject, retention_daysKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getSeedId());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getSeedId());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *seed_idKey = "seed_id";
	json_object_set_member(pJsonObject, seed_idKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getUrl());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getUrl());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getVisitorSourceId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *visitor_source_idKey = "visitor_source_id";
	json_object_set_member(pJsonObject, visitor_source_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdAccountsAudienceRule::getAdAccountId()
{
	return ad_account_id;
}

void
AdAccountsAudienceRule::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::list<std::string>
AdAccountsAudienceRule::getAdId()
{
	return ad_id;
}

void
AdAccountsAudienceRule::setAdId(std::list <std::string> ad_id)
{
	this->ad_id = ad_id;
}

std::list<std::string>
AdAccountsAudienceRule::getCampaignId()
{
	return campaign_id;
}

void
AdAccountsAudienceRule::setCampaignId(std::list <std::string> campaign_id)
{
	this->campaign_id = campaign_id;
}

std::string
AdAccountsAudienceRule::getCountry()
{
	return country;
}

void
AdAccountsAudienceRule::setCountry(std::string  country)
{
	this->country = country;
}

std::string
AdAccountsAudienceRule::getCustomerListId()
{
	return customer_list_id;
}

void
AdAccountsAudienceRule::setCustomerListId(std::string  customer_list_id)
{
	this->customer_list_id = customer_list_id;
}

std::list<std::string>
AdAccountsAudienceRule::getEngagementDomain()
{
	return engagement_domain;
}

void
AdAccountsAudienceRule::setEngagementDomain(std::list <std::string> engagement_domain)
{
	this->engagement_domain = engagement_domain;
}

std::string
AdAccountsAudienceRule::getEngagementType()
{
	return engagement_type;
}

void
AdAccountsAudienceRule::setEngagementType(std::string  engagement_type)
{
	this->engagement_type = engagement_type;
}

int
AdAccountsAudienceRule::getEngagerType()
{
	return engager_type;
}

void
AdAccountsAudienceRule::setEngagerType(int  engager_type)
{
	this->engager_type = engager_type;
}

std::string
AdAccountsAudienceRule::getEvent()
{
	return event;
}

void
AdAccountsAudienceRule::setEvent(std::string  event)
{
	this->event = event;
}

EventData
AdAccountsAudienceRule::getEventData()
{
	return event_data;
}

void
AdAccountsAudienceRule::setEventData(EventData  event_data)
{
	this->event_data = event_data;
}

std::string
AdAccountsAudienceRule::getEventSource()
{
	return event_source;
}

void
AdAccountsAudienceRule::setEventSource(std::string  event_source)
{
	this->event_source = event_source;
}

std::string
AdAccountsAudienceRule::getIngestionSource()
{
	return ingestion_source;
}

void
AdAccountsAudienceRule::setIngestionSource(std::string  ingestion_source)
{
	this->ingestion_source = ingestion_source;
}

std::list<AudienceObjectiveType>
AdAccountsAudienceRule::getObjectiveType()
{
	return objective_type;
}

void
AdAccountsAudienceRule::setObjectiveType(std::list <AudienceObjectiveType> objective_type)
{
	this->objective_type = objective_type;
}

int
AdAccountsAudienceRule::getPercentage()
{
	return percentage;
}

void
AdAccountsAudienceRule::setPercentage(int  percentage)
{
	this->percentage = percentage;
}

std::list<std::string>
AdAccountsAudienceRule::getPinId()
{
	return pin_id;
}

void
AdAccountsAudienceRule::setPinId(std::list <std::string> pin_id)
{
	this->pin_id = pin_id;
}

bool
AdAccountsAudienceRule::getPrefill()
{
	return prefill;
}

void
AdAccountsAudienceRule::setPrefill(bool  prefill)
{
	this->prefill = prefill;
}

int
AdAccountsAudienceRule::getRetentionDays()
{
	return retention_days;
}

void
AdAccountsAudienceRule::setRetentionDays(int  retention_days)
{
	this->retention_days = retention_days;
}

std::list<std::string>
AdAccountsAudienceRule::getSeedId()
{
	return seed_id;
}

void
AdAccountsAudienceRule::setSeedId(std::list <std::string> seed_id)
{
	this->seed_id = seed_id;
}

std::list<std::string>
AdAccountsAudienceRule::getUrl()
{
	return url;
}

void
AdAccountsAudienceRule::setUrl(std::list <std::string> url)
{
	this->url = url;
}

std::string
AdAccountsAudienceRule::getVisitorSourceId()
{
	return visitor_source_id;
}

void
AdAccountsAudienceRule::setVisitorSourceId(std::string  visitor_source_id)
{
	this->visitor_source_id = visitor_source_id;
}


