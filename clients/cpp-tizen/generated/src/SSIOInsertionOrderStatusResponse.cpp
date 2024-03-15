#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SSIOInsertionOrderStatusResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SSIOInsertionOrderStatusResponse::SSIOInsertionOrderStatusResponse()
{
	//__init();
}

SSIOInsertionOrderStatusResponse::~SSIOInsertionOrderStatusResponse()
{
	//__cleanup();
}

void
SSIOInsertionOrderStatusResponse::__init()
{
	//pin_order_id = std::string();
	//status = std::string();
	//creation_time = std::string();
}

void
SSIOInsertionOrderStatusResponse::__cleanup()
{
	//if(pin_order_id != NULL) {
	//
	//delete pin_order_id;
	//pin_order_id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(creation_time != NULL) {
	//
	//delete creation_time;
	//creation_time = NULL;
	//}
	//
}

void
SSIOInsertionOrderStatusResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pin_order_idKey = "pin_order_id";
	node = json_object_get_member(pJsonObject, pin_order_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pin_order_id, node, "std::string", "");
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
	const gchar *creation_timeKey = "creation_time";
	node = json_object_get_member(pJsonObject, creation_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&creation_time, node, "std::string", "");
		} else {
			
		}
	}
}

SSIOInsertionOrderStatusResponse::SSIOInsertionOrderStatusResponse(char* json)
{
	this->fromJson(json);
}

char*
SSIOInsertionOrderStatusResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getPinOrderId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pin_order_idKey = "pin_order_id";
	json_object_set_member(pJsonObject, pin_order_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreationTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *creation_timeKey = "creation_time";
	json_object_set_member(pJsonObject, creation_timeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SSIOInsertionOrderStatusResponse::getPinOrderId()
{
	return pin_order_id;
}

void
SSIOInsertionOrderStatusResponse::setPinOrderId(std::string  pin_order_id)
{
	this->pin_order_id = pin_order_id;
}

std::string
SSIOInsertionOrderStatusResponse::getStatus()
{
	return status;
}

void
SSIOInsertionOrderStatusResponse::setStatus(std::string  status)
{
	this->status = status;
}

std::string
SSIOInsertionOrderStatusResponse::getCreationTime()
{
	return creation_time;
}

void
SSIOInsertionOrderStatusResponse::setCreationTime(std::string  creation_time)
{
	this->creation_time = creation_time;
}


