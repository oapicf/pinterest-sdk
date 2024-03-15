#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupAudienceSizingRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupAudienceSizingRequest::AdGroupAudienceSizingRequest()
{
	//__init();
}

AdGroupAudienceSizingRequest::~AdGroupAudienceSizingRequest()
{
	//__cleanup();
}

void
AdGroupAudienceSizingRequest::__init()
{
	//auto_targeting_enabled = bool(false);
	//placement_group = std::string();
	//new std::list()std::list> creative_types;
	//targeting_spec = new TargetingSpec();
	//new std::list()std::list> product_group_ids;
	//new std::list()std::list> keywords;
}

void
AdGroupAudienceSizingRequest::__cleanup()
{
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
	//if(creative_types != NULL) {
	//creative_types.RemoveAll(true);
	//delete creative_types;
	//creative_types = NULL;
	//}
	//if(targeting_spec != NULL) {
	//
	//delete targeting_spec;
	//targeting_spec = NULL;
	//}
	//if(product_group_ids != NULL) {
	//product_group_ids.RemoveAll(true);
	//delete product_group_ids;
	//product_group_ids = NULL;
	//}
	//if(keywords != NULL) {
	//keywords.RemoveAll(true);
	//delete keywords;
	//keywords = NULL;
	//}
	//
}

void
AdGroupAudienceSizingRequest::fromJson(char* jsonStr)
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
	const gchar *creative_typesKey = "creative_types";
	node = json_object_get_member(pJsonObject, creative_typesKey);
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
			creative_types = new_list;
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
	const gchar *keywordsKey = "keywords";
	node = json_object_get_member(pJsonObject, keywordsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AdGroupAudienceSizingRequest_keywords_inner> new_list;
			AdGroupAudienceSizingRequest_keywords_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdGroupAudienceSizingRequest_keywords_inner")) {
					jsonToValue(&inst, temp_json, "AdGroupAudienceSizingRequest_keywords_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			keywords = new_list;
		}
		
	}
}

AdGroupAudienceSizingRequest::AdGroupAudienceSizingRequest(char* json)
{
	this->fromJson(json);
}

char*
AdGroupAudienceSizingRequest::toJson()
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
		list<std::string> new_list = static_cast<list <std::string> > (getCreativeTypes());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCreativeTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *creative_typesKey = "creative_types";
	json_object_set_member(pJsonObject, creative_typesKey, node);
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
	if (isprimitive("AdGroupAudienceSizingRequest_keywords_inner")) {
		list<AdGroupAudienceSizingRequest_keywords_inner> new_list = static_cast<list <AdGroupAudienceSizingRequest_keywords_inner> > (getKeywords());
		node = converttoJson(&new_list, "AdGroupAudienceSizingRequest_keywords_inner", "array");
	} else {
		node = json_node_alloc();
		list<AdGroupAudienceSizingRequest_keywords_inner> new_list = static_cast<list <AdGroupAudienceSizingRequest_keywords_inner> > (getKeywords());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdGroupAudienceSizingRequest_keywords_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdGroupAudienceSizingRequest_keywords_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *keywordsKey = "keywords";
	json_object_set_member(pJsonObject, keywordsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
AdGroupAudienceSizingRequest::getAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
AdGroupAudienceSizingRequest::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

PlacementGroupType
AdGroupAudienceSizingRequest::getPlacementGroup()
{
	return placement_group;
}

void
AdGroupAudienceSizingRequest::setPlacementGroup(PlacementGroupType  placement_group)
{
	this->placement_group = placement_group;
}

std::list<std::string>
AdGroupAudienceSizingRequest::getCreativeTypes()
{
	return creative_types;
}

void
AdGroupAudienceSizingRequest::setCreativeTypes(std::list <std::string> creative_types)
{
	this->creative_types = creative_types;
}

TargetingSpec
AdGroupAudienceSizingRequest::getTargetingSpec()
{
	return targeting_spec;
}

void
AdGroupAudienceSizingRequest::setTargetingSpec(TargetingSpec  targeting_spec)
{
	this->targeting_spec = targeting_spec;
}

std::list<std::string>
AdGroupAudienceSizingRequest::getProductGroupIds()
{
	return product_group_ids;
}

void
AdGroupAudienceSizingRequest::setProductGroupIds(std::list <std::string> product_group_ids)
{
	this->product_group_ids = product_group_ids;
}

std::list<AdGroupAudienceSizingRequest_keywords_inner>
AdGroupAudienceSizingRequest::getKeywords()
{
	return keywords;
}

void
AdGroupAudienceSizingRequest::setKeywords(std::list <AdGroupAudienceSizingRequest_keywords_inner> keywords)
{
	this->keywords = keywords;
}


