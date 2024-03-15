#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderLineResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderLineResponse::OrderLineResponse()
{
	//__init();
}

OrderLineResponse::~OrderLineResponse()
{
	//__cleanup();
}

void
OrderLineResponse::__init()
{
	//new std::list()std::list> errors;
	//new std::list()std::list> order_line;
}

void
OrderLineResponse::__cleanup()
{
	//if(errors != NULL) {
	//errors.RemoveAll(true);
	//delete errors;
	//errors = NULL;
	//}
	//if(order_line != NULL) {
	//order_line.RemoveAll(true);
	//delete order_line;
	//order_line = NULL;
	//}
	//
}

void
OrderLineResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderLineError> new_list;
			OrderLineError inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderLineError")) {
					jsonToValue(&inst, temp_json, "OrderLineError", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			errors = new_list;
		}
		
	}
	const gchar *order_lineKey = "order_line";
	node = json_object_get_member(pJsonObject, order_lineKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<OrderLine> new_list;
			OrderLine inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("OrderLine")) {
					jsonToValue(&inst, temp_json, "OrderLine", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			order_line = new_list;
		}
		
	}
}

OrderLineResponse::OrderLineResponse(char* json)
{
	this->fromJson(json);
}

char*
OrderLineResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderLineError")) {
		list<OrderLineError> new_list = static_cast<list <OrderLineError> > (getErrors());
		node = converttoJson(&new_list, "OrderLineError", "array");
	} else {
		node = json_node_alloc();
		list<OrderLineError> new_list = static_cast<list <OrderLineError> > (getErrors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderLineError>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderLineError obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	if (isprimitive("OrderLine")) {
		list<OrderLine> new_list = static_cast<list <OrderLine> > (getOrderLine());
		node = converttoJson(&new_list, "OrderLine", "array");
	} else {
		node = json_node_alloc();
		list<OrderLine> new_list = static_cast<list <OrderLine> > (getOrderLine());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<OrderLine>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			OrderLine obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *order_lineKey = "order_line";
	json_object_set_member(pJsonObject, order_lineKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<OrderLineError>
OrderLineResponse::getErrors()
{
	return errors;
}

void
OrderLineResponse::setErrors(std::list <OrderLineError> errors)
{
	this->errors = errors;
}

std::list<OrderLine>
OrderLineResponse::getOrderLine()
{
	return order_line;
}

void
OrderLineResponse::setOrderLine(std::list <OrderLine> order_line)
{
	this->order_line = order_line;
}


