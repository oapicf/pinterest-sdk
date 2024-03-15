#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionEventResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionEventResponse::ConversionEventResponse()
{
	//__init();
}

ConversionEventResponse::~ConversionEventResponse()
{
	//__cleanup();
}

void
ConversionEventResponse::__init()
{
	//conversion_event = new ConversionTagType();
	//conversion_tag_id = std::string();
	//ad_account_id = std::string();
	//created_time = int(0);
}

void
ConversionEventResponse::__cleanup()
{
	//if(conversion_event != NULL) {
	//
	//delete conversion_event;
	//conversion_event = NULL;
	//}
	//if(conversion_tag_id != NULL) {
	//
	//delete conversion_tag_id;
	//conversion_tag_id = NULL;
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
	//
}

void
ConversionEventResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *conversion_eventKey = "conversion_event";
	node = json_object_get_member(pJsonObject, conversion_eventKey);
	if (node !=NULL) {
	

		if (isprimitive("ConversionTagType")) {
			jsonToValue(&conversion_event, node, "ConversionTagType", "ConversionTagType");
		} else {
			
		}
	}
	const gchar *conversion_tag_idKey = "conversion_tag_id";
	node = json_object_get_member(pJsonObject, conversion_tag_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&conversion_tag_id, node, "std::string", "");
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
}

ConversionEventResponse::ConversionEventResponse(char* json)
{
	this->fromJson(json);
}

char*
ConversionEventResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConversionTagType")) {
		ConversionTagType obj = getConversionEvent();
		node = converttoJson(&obj, "ConversionTagType", "");
	}
	else {
		
	}
	const gchar *conversion_eventKey = "conversion_event";
	json_object_set_member(pJsonObject, conversion_eventKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getConversionTagId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *conversion_tag_idKey = "conversion_tag_id";
	json_object_set_member(pJsonObject, conversion_tag_idKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConversionTagType
ConversionEventResponse::getConversionEvent()
{
	return conversion_event;
}

void
ConversionEventResponse::setConversionEvent(ConversionTagType  conversion_event)
{
	this->conversion_event = conversion_event;
}

std::string
ConversionEventResponse::getConversionTagId()
{
	return conversion_tag_id;
}

void
ConversionEventResponse::setConversionTagId(std::string  conversion_tag_id)
{
	this->conversion_tag_id = conversion_tag_id;
}

std::string
ConversionEventResponse::getAdAccountId()
{
	return ad_account_id;
}

void
ConversionEventResponse::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

int
ConversionEventResponse::getCreatedTime()
{
	return created_time;
}

void
ConversionEventResponse::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}


