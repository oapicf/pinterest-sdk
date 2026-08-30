#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionEventsCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionEventsCreate::ConversionEventsCreate()
{
	//__init();
}

ConversionEventsCreate::~ConversionEventsCreate()
{
	//__cleanup();
}

void
ConversionEventsCreate::__init()
{
	//new std::list()std::list> data;
}

void
ConversionEventsCreate::__cleanup()
{
	//if(data != NULL) {
	//data.RemoveAll(true);
	//delete data;
	//data = NULL;
	//}
	//
}

void
ConversionEventsCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ConversionEventsDataItems> new_list;
			ConversionEventsDataItems inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ConversionEventsDataItems")) {
					jsonToValue(&inst, temp_json, "ConversionEventsDataItems", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			data = new_list;
		}
		
	}
}

ConversionEventsCreate::ConversionEventsCreate(char* json)
{
	this->fromJson(json);
}

char*
ConversionEventsCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConversionEventsDataItems")) {
		list<ConversionEventsDataItems> new_list = static_cast<list <ConversionEventsDataItems> > (getData());
		node = converttoJson(&new_list, "ConversionEventsDataItems", "array");
	} else {
		node = json_node_alloc();
		list<ConversionEventsDataItems> new_list = static_cast<list <ConversionEventsDataItems> > (getData());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ConversionEventsDataItems>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ConversionEventsDataItems obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
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

std::list<ConversionEventsDataItems>
ConversionEventsCreate::getData()
{
	return data;
}

void
ConversionEventsCreate::setData(std::list <ConversionEventsDataItems> data)
{
	this->data = data;
}


