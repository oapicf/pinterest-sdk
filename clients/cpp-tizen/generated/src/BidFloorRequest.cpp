#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BidFloorRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BidFloorRequest::BidFloorRequest()
{
	//__init();
}

BidFloorRequest::~BidFloorRequest()
{
	//__cleanup();
}

void
BidFloorRequest::__init()
{
	//new std::list()std::list> bid_floor_specs;
	//targeting_spec = new TargetingSpec();
}

void
BidFloorRequest::__cleanup()
{
	//if(bid_floor_specs != NULL) {
	//bid_floor_specs.RemoveAll(true);
	//delete bid_floor_specs;
	//bid_floor_specs = NULL;
	//}
	//if(targeting_spec != NULL) {
	//
	//delete targeting_spec;
	//targeting_spec = NULL;
	//}
	//
}

void
BidFloorRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *bid_floor_specsKey = "bid_floor_specs";
	node = json_object_get_member(pJsonObject, bid_floor_specsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BidFloorSpec> new_list;
			BidFloorSpec inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BidFloorSpec")) {
					jsonToValue(&inst, temp_json, "BidFloorSpec", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			bid_floor_specs = new_list;
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
}

BidFloorRequest::BidFloorRequest(char* json)
{
	this->fromJson(json);
}

char*
BidFloorRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("BidFloorSpec")) {
		list<BidFloorSpec> new_list = static_cast<list <BidFloorSpec> > (getBidFloorSpecs());
		node = converttoJson(&new_list, "BidFloorSpec", "array");
	} else {
		node = json_node_alloc();
		list<BidFloorSpec> new_list = static_cast<list <BidFloorSpec> > (getBidFloorSpecs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BidFloorSpec>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BidFloorSpec obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *bid_floor_specsKey = "bid_floor_specs";
	json_object_set_member(pJsonObject, bid_floor_specsKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<BidFloorSpec>
BidFloorRequest::getBidFloorSpecs()
{
	return bid_floor_specs;
}

void
BidFloorRequest::setBidFloorSpecs(std::list <BidFloorSpec> bid_floor_specs)
{
	this->bid_floor_specs = bid_floor_specs;
}

TargetingSpec
BidFloorRequest::getTargetingSpec()
{
	return targeting_spec;
}

void
BidFloorRequest::setTargetingSpec(TargetingSpec  targeting_spec)
{
	this->targeting_spec = targeting_spec;
}


