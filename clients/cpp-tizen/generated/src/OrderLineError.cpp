#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrderLineError.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrderLineError::OrderLineError()
{
	//__init();
}

OrderLineError::~OrderLineError()
{
	//__cleanup();
}

void
OrderLineError::__init()
{
	//data = new OrderLine();
	//new std::list()std::list> error_messages;
}

void
OrderLineError::__cleanup()
{
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//if(error_messages != NULL) {
	//error_messages.RemoveAll(true);
	//delete error_messages;
	//error_messages = NULL;
	//}
	//
}

void
OrderLineError::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("OrderLine")) {
			jsonToValue(&data, node, "OrderLine", "");
		} else {
			
			OrderLine* obj = static_cast<OrderLine*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *error_messagesKey = "error_messages";
	node = json_object_get_member(pJsonObject, error_messagesKey);
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
			error_messages = new_list;
		}
		
	}
}

OrderLineError::OrderLineError(char* json)
{
	this->fromJson(json);
}

char*
OrderLineError::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("OrderLine")) {
		OrderLine obj = getData();
		node = converttoJson(&obj, "OrderLine", "");
	}
	else {
		
		OrderLine obj = static_cast<OrderLine> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getErrorMessages());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getErrorMessages());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *error_messagesKey = "error_messages";
	json_object_set_member(pJsonObject, error_messagesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

OrderLine
OrderLineError::getData()
{
	return data;
}

void
OrderLineError::setData(OrderLine  data)
{
	this->data = data;
}

std::list<std::string>
OrderLineError::getErrorMessages()
{
	return error_messages;
}

void
OrderLineError::setErrorMessages(std::list <std::string> error_messages)
{
	this->error_messages = error_messages;
}


