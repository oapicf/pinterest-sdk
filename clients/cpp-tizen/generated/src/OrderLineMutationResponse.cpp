#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderLineMutationResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderLineMutationResponse::OrderLineMutationResponse()
{
	//__init();
}

OrderLineMutationResponse::~OrderLineMutationResponse()
{
	//__cleanup();
}

void
OrderLineMutationResponse::__init()
{
	//data = new OrderLineMutationResult();
}

void
OrderLineMutationResponse::__cleanup()
{
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//
}

void
OrderLineMutationResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderLineMutationResult")) {
			jsonToValue(&data, node, "OrderLineMutationResult", "OrderLineMutationResult");
		} else {
			
			OrderLineMutationResult* obj = static_cast<OrderLineMutationResult*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrderLineMutationResponse::OrderLineMutationResponse(char* json)
{
	this->fromJson(json);
}

char*
OrderLineMutationResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderLineMutationResult")) {
		OrderLineMutationResult obj = getData();
		node = converttoJson(&obj, "OrderLineMutationResult", "");
	}
	else {
		
		OrderLineMutationResult obj = static_cast<OrderLineMutationResult> (getData());
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

OrderLineMutationResult
OrderLineMutationResponse::getData()
{
	return data;
}

void
OrderLineMutationResponse::setData(OrderLineMutationResult  data)
{
	this->data = data;
}


