#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderLineSingleResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderLineSingleResponse::OrderLineSingleResponse()
{
	//__init();
}

OrderLineSingleResponse::~OrderLineSingleResponse()
{
	//__cleanup();
}

void
OrderLineSingleResponse::__init()
{
	//data = new OrderLineResponse();
}

void
OrderLineSingleResponse::__cleanup()
{
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//
}

void
OrderLineSingleResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderLineResponse")) {
			jsonToValue(&data, node, "OrderLineResponse", "");
		} else {
			
			OrderLineResponse* obj = static_cast<OrderLineResponse*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrderLineSingleResponse::OrderLineSingleResponse(char* json)
{
	this->fromJson(json);
}

char*
OrderLineSingleResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderLineResponse")) {
		OrderLineResponse obj = getData();
		node = converttoJson(&obj, "OrderLineResponse", "");
	}
	else {
		
		OrderLineResponse obj = static_cast<OrderLineResponse> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OrderLineResponse
OrderLineSingleResponse::getData()
{
	return data;
}

void
OrderLineSingleResponse::setData(OrderLineResponse  data)
{
	this->data = data;
}


