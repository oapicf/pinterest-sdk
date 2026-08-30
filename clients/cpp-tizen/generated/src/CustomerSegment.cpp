#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomerSegment.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomerSegment::CustomerSegment()
{
	//__init();
}

CustomerSegment::~CustomerSegment()
{
	//__cleanup();
}

void
CustomerSegment::__init()
{
	//ad_account_id = std::string();
	//new std::list()std::list> audience_ids;
	//created_time = int(0);
	//id = std::string();
	//name = std::string();
	//status = null;
	//updated_time = int(0);
}

void
CustomerSegment::__cleanup()
{
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(audience_ids != NULL) {
	//audience_ids.RemoveAll(true);
	//delete audience_ids;
	//audience_ids = NULL;
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
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(updated_time != NULL) {
	//
	//delete updated_time;
	//updated_time = NULL;
	//}
	//
}

void
CustomerSegment::fromJson(char* jsonStr)
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
	const gchar *audience_idsKey = "audience_ids";
	node = json_object_get_member(pJsonObject, audience_idsKey);
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
			audience_ids = new_list;
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
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
	const gchar *updated_timeKey = "updated_time";
	node = json_object_get_member(pJsonObject, updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_time, node, "int", "");
		} else {
			
		}
	}
}

CustomerSegment::CustomerSegment(char* json)
{
	this->fromJson(json);
}

char*
CustomerSegment::toJson()
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
		list<std::string> new_list = static_cast<list <std::string> > (getAudienceIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAudienceIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *audience_idsKey = "audience_ids";
	json_object_set_member(pJsonObject, audience_idsKey, node);
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
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
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
	if (isprimitive("int")) {
		int obj = getUpdatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_timeKey = "updated_time";
	json_object_set_member(pJsonObject, updated_timeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CustomerSegment::getAdAccountId()
{
	return ad_account_id;
}

void
CustomerSegment::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::list<std::string>
CustomerSegment::getAudienceIds()
{
	return audience_ids;
}

void
CustomerSegment::setAudienceIds(std::list <std::string> audience_ids)
{
	this->audience_ids = audience_ids;
}

int
CustomerSegment::getCreatedTime()
{
	return created_time;
}

void
CustomerSegment::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

std::string
CustomerSegment::getId()
{
	return id;
}

void
CustomerSegment::setId(std::string  id)
{
	this->id = id;
}

std::string
CustomerSegment::getName()
{
	return name;
}

void
CustomerSegment::setName(std::string  name)
{
	this->name = name;
}

TargetingTemplateStatus
CustomerSegment::getStatus()
{
	return status;
}

void
CustomerSegment::setStatus(TargetingTemplateStatus  status)
{
	this->status = status;
}

int
CustomerSegment::getUpdatedTime()
{
	return updated_time;
}

void
CustomerSegment::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}


