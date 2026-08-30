#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TargetingTemplate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TargetingTemplate::TargetingTemplate()
{
	//__init();
}

TargetingTemplate::~TargetingTemplate()
{
	//__cleanup();
}

void
TargetingTemplate::__init()
{
	//ad_account_id = std::string();
	//auto_targeting_enabled = bool(false);
	//created_time = int(0);
	//id = std::string();
	//new std::list()std::list> keywords;
	//name = std::string();
	//placement_group = new PlacementGroupType();
	//sizing = null;
	//status = null;
	//targeting_attributes = null;
	//tracking_urls = new TrackingUrls();
	//updated_time = int(0);
	//valid = bool(false);
}

void
TargetingTemplate::__cleanup()
{
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(auto_targeting_enabled != NULL) {
	//
	//delete auto_targeting_enabled;
	//auto_targeting_enabled = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(keywords != NULL) {
	//keywords.RemoveAll(true);
	//delete keywords;
	//keywords = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(placement_group != NULL) {
	//
	//delete placement_group;
	//placement_group = NULL;
	//}
	//if(sizing != NULL) {
	//
	//delete sizing;
	//sizing = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(targeting_attributes != NULL) {
	//
	//delete targeting_attributes;
	//targeting_attributes = NULL;
	//}
	//if(tracking_urls != NULL) {
	//
	//delete tracking_urls;
	//tracking_urls = NULL;
	//}
	//if(updated_time != NULL) {
	//
	//delete updated_time;
	//updated_time = NULL;
	//}
	//if(valid != NULL) {
	//
	//delete valid;
	//valid = NULL;
	//}
	//
}

void
TargetingTemplate::fromJson(char* jsonStr)
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
	const gchar *auto_targeting_enabledKey = "auto_targeting_enabled";
	node = json_object_get_member(pJsonObject, auto_targeting_enabledKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&auto_targeting_enabled, node, "bool", "");
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
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
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("TargetingTemplateStatus")) {
			jsonToValue(&status, node, "TargetingTemplateStatus", "TargetingTemplateStatus");
		} else {
			
			TargetingTemplateStatus* obj = static_cast<TargetingTemplateStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *targeting_attributesKey = "targeting_attributes";
	node = json_object_get_member(pJsonObject, targeting_attributesKey);
	if (node !=NULL) {
	

		if (isprimitive("TargetingSpecOptimal")) {
			jsonToValue(&targeting_attributes, node, "TargetingSpecOptimal", "TargetingSpecOptimal");
		} else {
			
			TargetingSpecOptimal* obj = static_cast<TargetingSpecOptimal*> (&targeting_attributes);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *updated_timeKey = "updated_time";
	node = json_object_get_member(pJsonObject, updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *validKey = "valid";
	node = json_object_get_member(pJsonObject, validKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&valid, node, "bool", "");
		} else {
			
		}
	}
}

TargetingTemplate::TargetingTemplate(char* json)
{
	this->fromJson(json);
}

char*
TargetingTemplate::toJson()
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
	if (isprimitive("bool")) {
		bool obj = getAutoTargetingEnabled();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *auto_targeting_enabledKey = "auto_targeting_enabled";
	json_object_set_member(pJsonObject, auto_targeting_enabledKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
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
	if (isprimitive("TargetingTemplateStatus")) {
		TargetingTemplateStatus obj = getStatus();
		node = converttoJson(&obj, "TargetingTemplateStatus", "");
	}
	else {
		
		TargetingTemplateStatus obj = static_cast<TargetingTemplateStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("TargetingSpecOptimal")) {
		TargetingSpecOptimal obj = getTargetingAttributes();
		node = converttoJson(&obj, "TargetingSpecOptimal", "");
	}
	else {
		
		TargetingSpecOptimal obj = static_cast<TargetingSpecOptimal> (getTargetingAttributes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *targeting_attributesKey = "targeting_attributes";
	json_object_set_member(pJsonObject, targeting_attributesKey, node);
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
	if (isprimitive("int")) {
		int obj = getUpdatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_timeKey = "updated_time";
	json_object_set_member(pJsonObject, updated_timeKey, node);
	if (isprimitive("bool")) {
		bool obj = getValid();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *validKey = "valid";
	json_object_set_member(pJsonObject, validKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
TargetingTemplate::getAdAccountId()
{
	return ad_account_id;
}

void
TargetingTemplate::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

bool
TargetingTemplate::getAutoTargetingEnabled()
{
	return auto_targeting_enabled;
}

void
TargetingTemplate::setAutoTargetingEnabled(bool  auto_targeting_enabled)
{
	this->auto_targeting_enabled = auto_targeting_enabled;
}

int
TargetingTemplate::getCreatedTime()
{
	return created_time;
}

void
TargetingTemplate::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

std::string
TargetingTemplate::getId()
{
	return id;
}

void
TargetingTemplate::setId(std::string  id)
{
	this->id = id;
}

std::list<TargetingTemplateKeyword>
TargetingTemplate::getKeywords()
{
	return keywords;
}

void
TargetingTemplate::setKeywords(std::list <TargetingTemplateKeyword> keywords)
{
	this->keywords = keywords;
}

std::string
TargetingTemplate::getName()
{
	return name;
}

void
TargetingTemplate::setName(std::string  name)
{
	this->name = name;
}

PlacementGroupType
TargetingTemplate::getPlacementGroup()
{
	return placement_group;
}

void
TargetingTemplate::setPlacementGroup(PlacementGroupType  placement_group)
{
	this->placement_group = placement_group;
}

TargetingTemplateAudienceSizing
TargetingTemplate::getSizing()
{
	return sizing;
}

void
TargetingTemplate::setSizing(TargetingTemplateAudienceSizing  sizing)
{
	this->sizing = sizing;
}

TargetingTemplateStatus
TargetingTemplate::getStatus()
{
	return status;
}

void
TargetingTemplate::setStatus(TargetingTemplateStatus  status)
{
	this->status = status;
}

TargetingSpecOptimal
TargetingTemplate::getTargetingAttributes()
{
	return targeting_attributes;
}

void
TargetingTemplate::setTargetingAttributes(TargetingSpecOptimal  targeting_attributes)
{
	this->targeting_attributes = targeting_attributes;
}

TrackingUrls
TargetingTemplate::getTrackingUrls()
{
	return tracking_urls;
}

void
TargetingTemplate::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

int
TargetingTemplate::getUpdatedTime()
{
	return updated_time;
}

void
TargetingTemplate::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}

bool
TargetingTemplate::getValid()
{
	return valid;
}

void
TargetingTemplate::setValid(bool  valid)
{
	this->valid = valid;
}


