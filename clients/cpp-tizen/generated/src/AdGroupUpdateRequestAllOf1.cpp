#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupUpdateRequestAllOf1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupUpdateRequestAllOf1::AdGroupUpdateRequestAllOf1()
{
	//__init();
}

AdGroupUpdateRequestAllOf1::~AdGroupUpdateRequestAllOf1()
{
	//__cleanup();
}

void
AdGroupUpdateRequestAllOf1::__init()
{
	//bid_multiplier = double(0);
	//id = std::string();
	//new std::list()std::list> targeting_spec_operations;
}

void
AdGroupUpdateRequestAllOf1::__cleanup()
{
	//if(bid_multiplier != NULL) {
	//
	//delete bid_multiplier;
	//bid_multiplier = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(targeting_spec_operations != NULL) {
	//targeting_spec_operations.RemoveAll(true);
	//delete targeting_spec_operations;
	//targeting_spec_operations = NULL;
	//}
	//
}

void
AdGroupUpdateRequestAllOf1::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *bid_multiplierKey = "bid_multiplier";
	node = json_object_get_member(pJsonObject, bid_multiplierKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&bid_multiplier, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&bid_multiplier);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *targeting_spec_operationsKey = "targeting_spec_operations";
	node = json_object_get_member(pJsonObject, targeting_spec_operationsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TargetingSpecOperations> new_list;
			TargetingSpecOperations inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TargetingSpecOperations")) {
					jsonToValue(&inst, temp_json, "TargetingSpecOperations", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			targeting_spec_operations = new_list;
		}
		
	}
}

AdGroupUpdateRequestAllOf1::AdGroupUpdateRequestAllOf1(char* json)
{
	this->fromJson(json);
}

char*
AdGroupUpdateRequestAllOf1::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getBidMultiplier();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getBidMultiplier());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *bid_multiplierKey = "bid_multiplier";
	json_object_set_member(pJsonObject, bid_multiplierKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("TargetingSpecOperations")) {
		list<TargetingSpecOperations> new_list = static_cast<list <TargetingSpecOperations> > (getTargetingSpecOperations());
		node = converttoJson(&new_list, "TargetingSpecOperations", "array");
	} else {
		node = json_node_alloc();
		list<TargetingSpecOperations> new_list = static_cast<list <TargetingSpecOperations> > (getTargetingSpecOperations());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TargetingSpecOperations>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TargetingSpecOperations obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *targeting_spec_operationsKey = "targeting_spec_operations";
	json_object_set_member(pJsonObject, targeting_spec_operationsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
AdGroupUpdateRequestAllOf1::getBidMultiplier()
{
	return bid_multiplier;
}

void
AdGroupUpdateRequestAllOf1::setBidMultiplier(long long  bid_multiplier)
{
	this->bid_multiplier = bid_multiplier;
}

std::string
AdGroupUpdateRequestAllOf1::getId()
{
	return id;
}

void
AdGroupUpdateRequestAllOf1::setId(std::string  id)
{
	this->id = id;
}

std::list<TargetingSpecOperations>
AdGroupUpdateRequestAllOf1::getTargetingSpecOperations()
{
	return targeting_spec_operations;
}

void
AdGroupUpdateRequestAllOf1::setTargetingSpecOperations(std::list <TargetingSpecOperations> targeting_spec_operations)
{
	this->targeting_spec_operations = targeting_spec_operations;
}


