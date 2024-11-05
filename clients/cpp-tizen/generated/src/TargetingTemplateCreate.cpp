#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingTemplateCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingTemplateCreate::TargetingTemplateCreate()
{
	//__init();
}

TargetingTemplateCreate::~TargetingTemplateCreate()
{
	//__cleanup();
}

void
TargetingTemplateCreate::__init()
{
	//name = std::string();
	//auto_targeting_enabled = bool(false);
	//targeting_attributes = new TargetingSpec();
	//placement_group = new PlacementGroupType();
	//new std::list()std::list> keywords;
	//tracking_urls = new TrackingUrls();
}

void
TargetingTemplateCreate::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(auto_targeting_enabled != NULL) {
	//
	//delete auto_targeting_enabled;
	//auto_targeting_enabled = NULL;
	//}
	//if(targeting_attributes != NULL) {
	//
	//delete targeting_attributes;
	//targeting_attributes = NULL;
	//}
	//if(placement_group != NULL) {
	//
	//delete placement_group;
	//placement_group = NULL;
	//}
	//if(keywords != NULL) {
	//keywords.RemoveAll(true);
	//delete keywords;
	//keywords = NULL;
	//}
	//if(tracking_urls != NULL) {
	//
	//delete tracking_urls;
	//tracking_urls = NULL;
	//}
	//
}

void
TargetingTemplateCreate::fromJson(char* jsonStr)
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
	const gchar *auto_targeting_enabledKey = "auto_targeting_enabled";
	node = json_object_get_member(pJsonObject, auto_targeting_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&auto_targeting_enabled, node, "bool", "");
		} else {
			
		}
	}
	const gchar *targeting_attributesKey = "targeting_attributes";
	node = json_object_get_member(pJsonObject, targeting_attributesKey);
	if (node !=NULL) {
	

		if (isprimitive("TargetingSpec")) {
			jsonToValue(&targeting_attributes, node, "TargetingSpec", "TargetingSpec");
		} else {
			
			TargetingSpec* obj = static_cast<TargetingSpec*> (&targeting_attributes);
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
	const gchar *keywordsKey = "keywords";
	node = json_object_get_member(pJsonObject, keywordsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TargetingTemplateKeyword> new_list;
			TargetingTemplateKeyword inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TargetingTemplateKeyword")) {
					jsonToValue(&inst, temp_json, "TargetingTemplateKeyword", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			keywords = new_list;
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
}

TargetingTemplateCreate::TargetingTemplateCreate(char* json)
{
	this->fromJson(json);
}

char*
TargetingTemplateCreate::toJson()
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
	if (isprimitive("bool")) {
		bool obj = getAutoTargetingEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *auto_targeting_enabledKey = "auto_targeting_enabled";
	json_object_set_member(pJsonObject, auto_targeting_enabledKey, node);
	if (isprimitive("TargetingSpec")) {
		TargetingSpec obj = getTargetingAttributes();
		node = converttoJson(&obj, "TargetingSpec", "");
	}
	else {
		
		TargetingSpec obj = static_cast<TargetingSpec> (getTargetingAttributes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *targeting_attributesKey = "targeting_attributes";
	json_object_set_member(pJsonObject, targeting_attributesKey, node);
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
	if (isprimitive("TargetingTemplateKeyword")) {
		list<TargetingTemplateKeyword> new_list = static_cast<list <TargetingTemplateKeyword> > (getKeywords());
		node = converttoJson(&new_list, "TargetingTemplateKeyword", "array");
	} else {
		node = json_node_alloc();
		list<TargetingTemplateKeyword> new_list = static_cast<list <TargetingTemplateKeyword> > (getKeywords());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TargetingTemplateKeyword>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TargetingTemplateKeyword obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *keywordsKey = "keywords";
	json_object_set_member(pJsonObject, keywordsKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TargetingTemplateCreate::getName()
{
	return name;
}

void
TargetingTemplateCreate::setName(std::string  name)
{
	this->name = name;
}

bool
TargetingTemplateCreate::getAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
TargetingTemplateCreate::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

TargetingSpec
TargetingTemplateCreate::getTargetingAttributes()
{
	return targeting_attributes;
}

void
TargetingTemplateCreate::setTargetingAttributes(TargetingSpec  targeting_attributes)
{
	this->targeting_attributes = targeting_attributes;
}

PlacementGroupType
TargetingTemplateCreate::getPlacementGroup()
{
	return placement_group;
}

void
TargetingTemplateCreate::setPlacementGroup(PlacementGroupType  placement_group)
{
	this->placement_group = placement_group;
}

std::list<TargetingTemplateKeyword>
TargetingTemplateCreate::getKeywords()
{
	return keywords;
}

void
TargetingTemplateCreate::setKeywords(std::list <TargetingTemplateKeyword> keywords)
{
	this->keywords = keywords;
}

TrackingUrls
TargetingTemplateCreate::getTrackingUrls()
{
	return tracking_urls;
}

void
TargetingTemplateCreate::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}


