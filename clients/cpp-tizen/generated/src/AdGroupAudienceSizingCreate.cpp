#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupAudienceSizingCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupAudienceSizingCreate::AdGroupAudienceSizingCreate()
{
	//__init();
}

AdGroupAudienceSizingCreate::~AdGroupAudienceSizingCreate()
{
	//__cleanup();
}

void
AdGroupAudienceSizingCreate::__init()
{
	//auto_targeting_enabled = bool(false);
	//new std::list()std::list> creative_types;
	//new std::list()std::list> keywords;
	//placement_group = null;
	//new std::list()std::list> product_group_ids;
	//targeting_spec = new TargetingSpecOptimal();
}

void
AdGroupAudienceSizingCreate::__cleanup()
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
AdGroupAudienceSizingCreate::fromJson(char* jsonStr)
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
			list<AdGroupAudienceSizingKeyword> new_list;
			AdGroupAudienceSizingKeyword inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AdGroupAudienceSizingKeyword")) {
					jsonToValue(&inst, temp_json, "AdGroupAudienceSizingKeyword", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			keywords = new_list;
		}
		
	}
	const gchar *placement_groupKey = "placement_group";
	node = json_object_get_member(pJsonObject, placement_groupKey);
	if (node !=NULL) {
	

		if (isprimitive("AdgroupPlacementGroupType")) {
			jsonToValue(&placement_group, node, "AdgroupPlacementGroupType", "AdgroupPlacementGroupType");
		} else {
			
			AdgroupPlacementGroupType* obj = static_cast<AdgroupPlacementGroupType*> (&placement_group);
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

AdGroupAudienceSizingCreate::AdGroupAudienceSizingCreate(char* json)
{
	this->fromJson(json);
}

char*
AdGroupAudienceSizingCreate::toJson()
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
	if (isprimitive("AdGroupAudienceSizingKeyword")) {
		list<AdGroupAudienceSizingKeyword> new_list = static_cast<list <AdGroupAudienceSizingKeyword> > (getKeywords());
		node = converttoJson(&new_list, "AdGroupAudienceSizingKeyword", "array");
	} else {
		node = json_node_alloc();
		list<AdGroupAudienceSizingKeyword> new_list = static_cast<list <AdGroupAudienceSizingKeyword> > (getKeywords());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AdGroupAudienceSizingKeyword>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AdGroupAudienceSizingKeyword obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *keywordsKey = "keywords";
	json_object_set_member(pJsonObject, keywordsKey, node);
	if (isprimitive("AdgroupPlacementGroupType")) {
		AdgroupPlacementGroupType obj = getPlacementGroup();
		node = converttoJson(&obj, "AdgroupPlacementGroupType", "");
	}
	else {
		
		AdgroupPlacementGroupType obj = static_cast<AdgroupPlacementGroupType> (getPlacementGroup());
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
AdGroupAudienceSizingCreate::getAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
AdGroupAudienceSizingCreate::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

std::list<AdGroupAudienceSizingCreativeTypes>
AdGroupAudienceSizingCreate::getCreativeTypes()
{
	return creative_types;
}

void
AdGroupAudienceSizingCreate::setCreativeTypes(std::list <AdGroupAudienceSizingCreativeTypes> creative_types)
{
	this->creative_types = creative_types;
}

std::list<AdGroupAudienceSizingKeyword>
AdGroupAudienceSizingCreate::getKeywords()
{
	return keywords;
}

void
AdGroupAudienceSizingCreate::setKeywords(std::list <AdGroupAudienceSizingKeyword> keywords)
{
	this->keywords = keywords;
}

AdgroupPlacementGroupType
AdGroupAudienceSizingCreate::getPlacementGroup()
{
	return placement_group;
}

void
AdGroupAudienceSizingCreate::setPlacementGroup(AdgroupPlacementGroupType  placement_group)
{
	this->placement_group = placement_group;
}

std::list<std::string>
AdGroupAudienceSizingCreate::getProductGroupIds()
{
	return product_group_ids;
}

void
AdGroupAudienceSizingCreate::setProductGroupIds(std::list <std::string> product_group_ids)
{
	this->product_group_ids = product_group_ids;
}

TargetingSpecOptimal
AdGroupAudienceSizingCreate::getTargetingSpec()
{
	return targeting_spec;
}

void
AdGroupAudienceSizingCreate::setTargetingSpec(TargetingSpecOptimal  targeting_spec)
{
	this->targeting_spec = targeting_spec;
}


