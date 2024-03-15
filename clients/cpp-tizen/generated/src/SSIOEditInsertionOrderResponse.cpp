#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SSIOEditInsertionOrderResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SSIOEditInsertionOrderResponse::SSIOEditInsertionOrderResponse()
{
	//__init();
}

SSIOEditInsertionOrderResponse::~SSIOEditInsertionOrderResponse()
{
	//__cleanup();
}

void
SSIOEditInsertionOrderResponse::__init()
{
	//pin_order_id = std::string();
}

void
SSIOEditInsertionOrderResponse::__cleanup()
{
	//if(pin_order_id != NULL) {
	//
	//delete pin_order_id;
	//pin_order_id = NULL;
	//}
	//
}

void
SSIOEditInsertionOrderResponse::fromJson(char* jsonStr)
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
}

SSIOEditInsertionOrderResponse::SSIOEditInsertionOrderResponse(char* json)
{
	this->fromJson(json);
}

char*
SSIOEditInsertionOrderResponse::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SSIOEditInsertionOrderResponse::getPinOrderId()
{
	return pin_order_id;
}

void
SSIOEditInsertionOrderResponse::setPinOrderId(std::string  pin_order_id)
{
	this->pin_order_id = pin_order_id;
}


