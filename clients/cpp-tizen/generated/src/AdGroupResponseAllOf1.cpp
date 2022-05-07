#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdGroupResponse_allOf_1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdGroupResponse_allOf_1::AdGroupResponse_allOf_1()
{
	//__init();
}

AdGroupResponse_allOf_1::~AdGroupResponse_allOf_1()
{
	//__cleanup();
}

void
AdGroupResponse_allOf_1::__init()
{
	//campaign_id = std::string();
	//billable_event = new ActionType();
	//id = std::string();
	//type = std::string();
	//ad_account_id = std::string();
	//created_time = int(0);
	//updated_time = int(0);
}

void
AdGroupResponse_allOf_1::__cleanup()
{
	//if(campaign_id != NULL) {
	//
	//delete campaign_id;
	//campaign_id = NULL;
	//}
	//if(billable_event != NULL) {
	//
	//delete billable_event;
	//billable_event = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
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
	//
}

void
AdGroupResponse_allOf_1::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *campaign_idKey = "campaign_id";
	node = json_object_get_member(pJsonObject, campaign_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&campaign_id, node, "std::string", "");
		} else {
			
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
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
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
}

AdGroupResponse_allOf_1::AdGroupResponse_allOf_1(char* json)
{
	this->fromJson(json);
}

char*
AdGroupResponse_allOf_1::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCampaignId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *campaign_idKey = "campaign_id";
	json_object_set_member(pJsonObject, campaign_idKey, node);
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
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdGroupResponse_allOf_1::getCampaignId()
{
	return campaign_id;
}

void
AdGroupResponse_allOf_1::setCampaignId(std::string  campaign_id)
{
	this->campaign_id = campaign_id;
}

ActionType
AdGroupResponse_allOf_1::getBillableEvent()
{
	return billable_event;
}

void
AdGroupResponse_allOf_1::setBillableEvent(ActionType  billable_event)
{
	this->billable_event = billable_event;
}

std::string
AdGroupResponse_allOf_1::getId()
{
	return id;
}

void
AdGroupResponse_allOf_1::setId(std::string  id)
{
	this->id = id;
}

std::string
AdGroupResponse_allOf_1::getType()
{
	return type;
}

void
AdGroupResponse_allOf_1::setType(std::string  type)
{
	this->type = type;
}

std::string
AdGroupResponse_allOf_1::getAdAccountId()
{
	return ad_account_id;
}

void
AdGroupResponse_allOf_1::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

int
AdGroupResponse_allOf_1::getCreatedTime()
{
	return created_time;
}

void
AdGroupResponse_allOf_1::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

int
AdGroupResponse_allOf_1::getUpdatedTime()
{
	return updated_time;
}

void
AdGroupResponse_allOf_1::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}


