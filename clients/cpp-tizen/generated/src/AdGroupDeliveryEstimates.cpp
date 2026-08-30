#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupDeliveryEstimates.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupDeliveryEstimates::AdGroupDeliveryEstimates()
{
	//__init();
}

AdGroupDeliveryEstimates::~AdGroupDeliveryEstimates()
{
	//__cleanup();
}

void
AdGroupDeliveryEstimates::__init()
{
	//auto_targeting_enabled = bool(false);
	//new std::list()std::list> creative_types;
	//new std::list()std::list> keywords;
	//monthly_frequency_cap = int(0);
	//optimization_goal_metadata = new OptimizationGoalMetadata();
	//optimization_type = null;
	//placement_group = new PlacementGroupType();
	//new std::list()std::list> product_group_ids;
	//targeting_spec = new TargetingSpecOptimal();
}

void
AdGroupDeliveryEstimates::__cleanup()
{
	//if(auto_targeting_enabled != NULL) {
	//
	//delete auto_targeting_enabled;
	//auto_targeting_enabled = NULL;
	//}
	//if(creative_types != NULL) {
	//creative_types.RemoveAll(true);
	//delete creative_types;
	//creative_types = NULL;
	//}
	//if(keywords != NULL) {
	//keywords.RemoveAll(true);
	//delete keywords;
	//keywords = NULL;
	//}
	//if(monthly_frequency_cap != NULL) {
	//
	//delete monthly_frequency_cap;
	//monthly_frequency_cap = NULL;
	//}
	//if(optimization_goal_metadata != NULL) {
	//
	//delete optimization_goal_metadata;
	//optimization_goal_metadata = NULL;
	//}
	//if(optimization_type != NULL) {
	//
	//delete optimization_type;
	//optimization_type = NULL;
	//}
	//if(placement_group != NULL) {
	//
	//delete placement_group;
	//placement_group = NULL;
	//}
	//if(product_group_ids != NULL) {
	//product_group_ids.RemoveAll(true);
	//delete product_group_ids;
	//product_group_ids = NULL;
	//}
	//if(targeting_spec != NULL) {
	//
	//delete targeting_spec;
	//targeting_spec = NULL;
	//}
	//
}

void
AdGroupDeliveryEstimates::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *auto_targeting_enabledKey = "auto_targeting_enabled";
	node = json_object_get_member(pJsonObject, auto_targeting_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&auto_targeting_enabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *creative_typesKey = "creative_types";
	node = json_object_get_member(pJsonObject, creative_typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AdGroupAudienceSizingCreativeTypes> new_list;
			AdGroupAudienceSizingCreativeTypes inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdGroupAudienceSizingCreativeTypes")) {
					jsonToValue(&inst, temp_json, "AdGroupAudienceSizingCreativeTypes", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			creative_types = new_list;
		}
		
	}
	const gchar *keywordsKey = "keywords";
	node = json_object_get_member(pJsonObject, keywordsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AdGroupDeliveryEstimatesKeywordsItems> new_list;
			AdGroupDeliveryEstimatesKeywordsItems inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdGroupDeliveryEstimatesKeywordsItems")) {
					jsonToValue(&inst, temp_json, "AdGroupDeliveryEstimatesKeywordsItems", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			keywords = new_list;
		}
		
	}
	const gchar *monthly_frequency_capKey = "monthly_frequency_cap";
	node = json_object_get_member(pJsonObject, monthly_frequency_capKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&monthly_frequency_cap, node, "int", "");
		} else {
			
		}
	}
	const gchar *optimization_goal_metadataKey = "optimization_goal_metadata";
	node = json_object_get_member(pJsonObject, optimization_goal_metadataKey);
	if (node !=NULL) {
	

		if (isprimitive("OptimizationGoalMetadata")) {
			jsonToValue(&optimization_goal_metadata, node, "OptimizationGoalMetadata", "OptimizationGoalMetadata");
		} else {
			
			OptimizationGoalMetadata* obj = static_cast<OptimizationGoalMetadata*> (&optimization_goal_metadata);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *optimization_typeKey = "optimization_type";
	node = json_object_get_member(pJsonObject, optimization_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("OptimizationType")) {
			jsonToValue(&optimization_type, node, "OptimizationType", "OptimizationType");
		} else {
			
			OptimizationType* obj = static_cast<OptimizationType*> (&optimization_type);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *product_group_idsKey = "product_group_ids";
	node = json_object_get_member(pJsonObject, product_group_idsKey);
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
			product_group_ids = new_list;
		}
		
	}
	const gchar *targeting_specKey = "targeting_spec";
	node = json_object_get_member(pJsonObject, targeting_specKey);
	if (node !=NULL) {
	

		if (isprimitive("TargetingSpecOptimal")) {
			jsonToValue(&targeting_spec, node, "TargetingSpecOptimal", "TargetingSpecOptimal");
		} else {
			
			TargetingSpecOptimal* obj = static_cast<TargetingSpecOptimal*> (&targeting_spec);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdGroupDeliveryEstimates::AdGroupDeliveryEstimates(char* json)
{
	this->fromJson(json);
}

char*
AdGroupDeliveryEstimates::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getAutoTargetingEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *auto_targeting_enabledKey = "auto_targeting_enabled";
	json_object_set_member(pJsonObject, auto_targeting_enabledKey, node);
	if (isprimitive("AdGroupAudienceSizingCreativeTypes")) {
		list<AdGroupAudienceSizingCreativeTypes> new_list = static_cast<list <AdGroupAudienceSizingCreativeTypes> > (getCreativeTypes());
		node = converttoJson(&new_list, "AdGroupAudienceSizingCreativeTypes", "array");
	} else {
		node = json_node_alloc();
		list<AdGroupAudienceSizingCreativeTypes> new_list = static_cast<list <AdGroupAudienceSizingCreativeTypes> > (getCreativeTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdGroupAudienceSizingCreativeTypes>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdGroupAudienceSizingCreativeTypes obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *creative_typesKey = "creative_types";
	json_object_set_member(pJsonObject, creative_typesKey, node);
	if (isprimitive("AdGroupDeliveryEstimatesKeywordsItems")) {
		list<AdGroupDeliveryEstimatesKeywordsItems> new_list = static_cast<list <AdGroupDeliveryEstimatesKeywordsItems> > (getKeywords());
		node = converttoJson(&new_list, "AdGroupDeliveryEstimatesKeywordsItems", "array");
	} else {
		node = json_node_alloc();
		list<AdGroupDeliveryEstimatesKeywordsItems> new_list = static_cast<list <AdGroupDeliveryEstimatesKeywordsItems> > (getKeywords());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdGroupDeliveryEstimatesKeywordsItems>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdGroupDeliveryEstimatesKeywordsItems obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *keywordsKey = "keywords";
	json_object_set_member(pJsonObject, keywordsKey, node);
	if (isprimitive("int")) {
		int obj = getMonthlyFrequencyCap();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *monthly_frequency_capKey = "monthly_frequency_cap";
	json_object_set_member(pJsonObject, monthly_frequency_capKey, node);
	if (isprimitive("OptimizationGoalMetadata")) {
		OptimizationGoalMetadata obj = getOptimizationGoalMetadata();
		node = converttoJson(&obj, "OptimizationGoalMetadata", "");
	}
	else {
		
		OptimizationGoalMetadata obj = static_cast<OptimizationGoalMetadata> (getOptimizationGoalMetadata());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *optimization_goal_metadataKey = "optimization_goal_metadata";
	json_object_set_member(pJsonObject, optimization_goal_metadataKey, node);
	if (isprimitive("OptimizationType")) {
		OptimizationType obj = getOptimizationType();
		node = converttoJson(&obj, "OptimizationType", "");
	}
	else {
		
		OptimizationType obj = static_cast<OptimizationType> (getOptimizationType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *optimization_typeKey = "optimization_type";
	json_object_set_member(pJsonObject, optimization_typeKey, node);
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
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getProductGroupIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getProductGroupIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *product_group_idsKey = "product_group_ids";
	json_object_set_member(pJsonObject, product_group_idsKey, node);
	if (isprimitive("TargetingSpecOptimal")) {
		TargetingSpecOptimal obj = getTargetingSpec();
		node = converttoJson(&obj, "TargetingSpecOptimal", "");
	}
	else {
		
		TargetingSpecOptimal obj = static_cast<TargetingSpecOptimal> (getTargetingSpec());
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

bool
AdGroupDeliveryEstimates::getAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
AdGroupDeliveryEstimates::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

std::list<AdGroupAudienceSizingCreativeTypes>
AdGroupDeliveryEstimates::getCreativeTypes()
{
	return creative_types;
}

void
AdGroupDeliveryEstimates::setCreativeTypes(std::list <AdGroupAudienceSizingCreativeTypes> creative_types)
{
	this->creative_types = creative_types;
}

std::list<AdGroupDeliveryEstimatesKeywordsItems>
AdGroupDeliveryEstimates::getKeywords()
{
	return keywords;
}

void
AdGroupDeliveryEstimates::setKeywords(std::list <AdGroupDeliveryEstimatesKeywordsItems> keywords)
{
	this->keywords = keywords;
}

int
AdGroupDeliveryEstimates::getMonthlyFrequencyCap()
{
	return monthly_frequency_cap;
}

void
AdGroupDeliveryEstimates::setMonthlyFrequencyCap(int  monthly_frequency_cap)
{
	this->monthly_frequency_cap = monthly_frequency_cap;
}

OptimizationGoalMetadata
AdGroupDeliveryEstimates::getOptimizationGoalMetadata()
{
	return optimization_goal_metadata;
}

void
AdGroupDeliveryEstimates::setOptimizationGoalMetadata(OptimizationGoalMetadata  optimization_goal_metadata)
{
	this->optimization_goal_metadata = optimization_goal_metadata;
}

OptimizationType
AdGroupDeliveryEstimates::getOptimizationType()
{
	return optimization_type;
}

void
AdGroupDeliveryEstimates::setOptimizationType(OptimizationType  optimization_type)
{
	this->optimization_type = optimization_type;
}

PlacementGroupType
AdGroupDeliveryEstimates::getPlacementGroup()
{
	return placement_group;
}

void
AdGroupDeliveryEstimates::setPlacementGroup(PlacementGroupType  placement_group)
{
	this->placement_group = placement_group;
}

std::list<std::string>
AdGroupDeliveryEstimates::getProductGroupIds()
{
	return product_group_ids;
}

void
AdGroupDeliveryEstimates::setProductGroupIds(std::list <std::string> product_group_ids)
{
	this->product_group_ids = product_group_ids;
}

TargetingSpecOptimal
AdGroupDeliveryEstimates::getTargetingSpec()
{
	return targeting_spec;
}

void
AdGroupDeliveryEstimates::setTargetingSpec(TargetingSpecOptimal  targeting_spec)
{
	this->targeting_spec = targeting_spec;
}


