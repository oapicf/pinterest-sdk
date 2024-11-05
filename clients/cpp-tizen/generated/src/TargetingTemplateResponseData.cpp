#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingTemplateResponseData.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingTemplateResponseData::TargetingTemplateResponseData()
{
	//__init();
}

TargetingTemplateResponseData::~TargetingTemplateResponseData()
{
	//__cleanup();
}

void
TargetingTemplateResponseData::__init()
{
	//name = std::string();
	//auto_targeting_enabled = bool(false);
	//targeting_attributes = new TargetingSpec();
	//placement_group = new PlacementGroupType();
	//new std::list()std::list> keywords;
	//tracking_urls = new TrackingUrls();
	//id = std::string();
	//created_time = int(0);
	//updated_time = int(0);
	//ad_account_id = std::string();
	//status = std::string();
	//sizing = new TargetingTemplateAudienceSizing();
}

void
TargetingTemplateResponseData::__cleanup()
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
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//if(updated_time != NULL) {
	//
	//delete updated_time;
	//updated_time = NULL;
	//}
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(sizing != NULL) {
	//
	//delete sizing;
	//sizing = NULL;
	//}
	//
}

void
TargetingTemplateResponseData::fromJson(char* jsonStr)
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *created_timeKey = "created_time";
	node = json_object_get_member(pJsonObject, created_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *updated_timeKey = "updated_time";
	node = json_object_get_member(pJsonObject, updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *ad_account_idKey = "ad_account_id";
	node = json_object_get_member(pJsonObject, ad_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_account_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sizingKey = "sizing";
	node = json_object_get_member(pJsonObject, sizingKey);
	if (node !=NULL) {
	

		if (isprimitive("TargetingTemplateAudienceSizing")) {
			jsonToValue(&sizing, node, "TargetingTemplateAudienceSizing", "TargetingTemplateAudienceSizing");
		} else {
			
			TargetingTemplateAudienceSizing* obj = static_cast<TargetingTemplateAudienceSizing*> (&sizing);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TargetingTemplateResponseData::TargetingTemplateResponseData(char* json)
{
	this->fromJson(json);
}

char*
TargetingTemplateResponseData::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
	if (isprimitive("int")) {
		int obj = getUpdatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_timeKey = "updated_time";
	json_object_set_member(pJsonObject, updated_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("TargetingTemplateAudienceSizing")) {
		TargetingTemplateAudienceSizing obj = getSizing();
		node = converttoJson(&obj, "TargetingTemplateAudienceSizing", "");
	}
	else {
		
		TargetingTemplateAudienceSizing obj = static_cast<TargetingTemplateAudienceSizing> (getSizing());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sizingKey = "sizing";
	json_object_set_member(pJsonObject, sizingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TargetingTemplateResponseData::getName()
{
	return name;
}

void
TargetingTemplateResponseData::setName(std::string  name)
{
	this->name = name;
}

bool
TargetingTemplateResponseData::getAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
TargetingTemplateResponseData::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

TargetingSpec
TargetingTemplateResponseData::getTargetingAttributes()
{
	return targeting_attributes;
}

void
TargetingTemplateResponseData::setTargetingAttributes(TargetingSpec  targeting_attributes)
{
	this->targeting_attributes = targeting_attributes;
}

PlacementGroupType
TargetingTemplateResponseData::getPlacementGroup()
{
	return placement_group;
}

void
TargetingTemplateResponseData::setPlacementGroup(PlacementGroupType  placement_group)
{
	this->placement_group = placement_group;
}

std::list<TargetingTemplateKeyword>
TargetingTemplateResponseData::getKeywords()
{
	return keywords;
}

void
TargetingTemplateResponseData::setKeywords(std::list <TargetingTemplateKeyword> keywords)
{
	this->keywords = keywords;
}

TrackingUrls
TargetingTemplateResponseData::getTrackingUrls()
{
	return tracking_urls;
}

void
TargetingTemplateResponseData::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

std::string
TargetingTemplateResponseData::getId()
{
	return id;
}

void
TargetingTemplateResponseData::setId(std::string  id)
{
	this->id = id;
}

int
TargetingTemplateResponseData::getCreatedTime()
{
	return created_time;
}

void
TargetingTemplateResponseData::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

int
TargetingTemplateResponseData::getUpdatedTime()
{
	return updated_time;
}

void
TargetingTemplateResponseData::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}

std::string
TargetingTemplateResponseData::getAdAccountId()
{
	return ad_account_id;
}

void
TargetingTemplateResponseData::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
TargetingTemplateResponseData::getStatus()
{
	return status;
}

void
TargetingTemplateResponseData::setStatus(std::string  status)
{
	this->status = status;
}

TargetingTemplateAudienceSizing
TargetingTemplateResponseData::getSizing()
{
	return sizing;
}

void
TargetingTemplateResponseData::setSizing(TargetingTemplateAudienceSizing  sizing)
{
	this->sizing = sizing;
}


