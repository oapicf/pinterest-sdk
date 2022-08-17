#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BidFloorSpec.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BidFloorSpec::BidFloorSpec()
{
	//__init();
}

BidFloorSpec::~BidFloorSpec()
{
	//__cleanup();
}

void
BidFloorSpec::__init()
{
	//new std::list()std::list> countries;
	//currency = new Currency();
	//objective_type = new ObjectiveType();
	//billable_event = new ActionType();
	//optimization_goal_metadata = null;
	//creative_type = new CreativeType();
}

void
BidFloorSpec::__cleanup()
{
	//if(countries != NULL) {
	//countries.RemoveAll(true);
	//delete countries;
	//countries = NULL;
	//}
	//if(currency != NULL) {
	//
	//delete currency;
	//currency = NULL;
	//}
	//if(objective_type != NULL) {
	//
	//delete objective_type;
	//objective_type = NULL;
	//}
	//if(billable_event != NULL) {
	//
	//delete billable_event;
	//billable_event = NULL;
	//}
	//if(optimization_goal_metadata != NULL) {
	//
	//delete optimization_goal_metadata;
	//optimization_goal_metadata = NULL;
	//}
	//if(creative_type != NULL) {
	//
	//delete creative_type;
	//creative_type = NULL;
	//}
	//
}

void
BidFloorSpec::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *countriesKey = "countries";
	node = json_object_get_member(pJsonObject, countriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Country> new_list;
			Country inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Country")) {
					jsonToValue(&inst, temp_json, "Country", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			countries = new_list;
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
	const gchar *optimization_goal_metadataKey = "optimization_goal_metadata";
	node = json_object_get_member(pJsonObject, optimization_goal_metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&optimization_goal_metadata, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&optimization_goal_metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *creative_typeKey = "creative_type";
	node = json_object_get_member(pJsonObject, creative_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CreativeType")) {
			jsonToValue(&creative_type, node, "CreativeType", "CreativeType");
		} else {
			
			CreativeType* obj = static_cast<CreativeType*> (&creative_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BidFloorSpec::BidFloorSpec(char* json)
{
	this->fromJson(json);
}

char*
BidFloorSpec::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Country")) {
		list<Country> new_list = static_cast<list <Country> > (getCountries());
		node = converttoJson(&new_list, "Country", "array");
	} else {
		node = json_node_alloc();
		list<Country> new_list = static_cast<list <Country> > (getCountries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Country>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Country obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *countriesKey = "countries";
	json_object_set_member(pJsonObject, countriesKey, node);
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
		std::string obj = getOptimizationGoalMetadata();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getOptimizationGoalMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *optimization_goal_metadataKey = "optimization_goal_metadata";
	json_object_set_member(pJsonObject, optimization_goal_metadataKey, node);
	if (isprimitive("CreativeType")) {
		CreativeType obj = getCreativeType();
		node = converttoJson(&obj, "CreativeType", "");
	}
	else {
		
		CreativeType obj = static_cast<CreativeType> (getCreativeType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *creative_typeKey = "creative_type";
	json_object_set_member(pJsonObject, creative_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<Country>
BidFloorSpec::getCountries()
{
	return countries;
}

void
BidFloorSpec::setCountries(std::list <Country> countries)
{
	this->countries = countries;
}

Currency
BidFloorSpec::getCurrency()
{
	return currency;
}

void
BidFloorSpec::setCurrency(Currency  currency)
{
	this->currency = currency;
}

ObjectiveType
BidFloorSpec::getObjectiveType()
{
	return objective_type;
}

void
BidFloorSpec::setObjectiveType(ObjectiveType  objective_type)
{
	this->objective_type = objective_type;
}

ActionType
BidFloorSpec::getBillableEvent()
{
	return billable_event;
}

void
BidFloorSpec::setBillableEvent(ActionType  billable_event)
{
	this->billable_event = billable_event;
}

std::string
BidFloorSpec::getOptimizationGoalMetadata()
{
	return optimization_goal_metadata;
}

void
BidFloorSpec::setOptimizationGoalMetadata(std::string  optimization_goal_metadata)
{
	this->optimization_goal_metadata = optimization_goal_metadata;
}

CreativeType
BidFloorSpec::getCreativeType()
{
	return creative_type;
}

void
BidFloorSpec::setCreativeType(CreativeType  creative_type)
{
	this->creative_type = creative_type;
}


