#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TopPinsAnalyticsResponsePinsItems.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TopPinsAnalyticsResponsePinsItems::TopPinsAnalyticsResponsePinsItems()
{
	//__init();
}

TopPinsAnalyticsResponsePinsItems::~TopPinsAnalyticsResponsePinsItems()
{
	//__cleanup();
}

void
TopPinsAnalyticsResponsePinsItems::__init()
{
	//new std::map()std::map> data_status;
	//new std::map()std::map> metrics;
	//pin_id = std::string();
}

void
TopPinsAnalyticsResponsePinsItems::__cleanup()
{
	//if(data_status != NULL) {
	//data_status.RemoveAll(true);
	//delete data_status;
	//data_status = NULL;
	//}
	//if(metrics != NULL) {
	//metrics.RemoveAll(true);
	//delete metrics;
	//metrics = NULL;
	//}
	//if(pin_id != NULL) {
	//
	//delete pin_id;
	//pin_id = NULL;
	//}
	//
}

void
TopPinsAnalyticsResponsePinsItems::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *data_statusKey = "data_status";
	node = json_object_get_member(pJsonObject, data_statusKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			data_status = new_map;
		}
		
	}
	const gchar *metricsKey = "metrics";
	node = json_object_get_member(pJsonObject, metricsKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			metrics = new_map;
		}
		
	}
	const gchar *pin_idKey = "pin_id";
	node = json_object_get_member(pJsonObject, pin_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pin_id, node, "std::string", "");
		} else {
			
		}
	}
}

TopPinsAnalyticsResponsePinsItems::TopPinsAnalyticsResponsePinsItems(char* json)
{
	this->fromJson(json);
}

char*
TopPinsAnalyticsResponsePinsItems::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getDataStatus());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *data_statusKey = "data_status";
	json_object_set_member(pJsonObject, data_statusKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getMetrics());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *metricsKey = "metrics";
	json_object_set_member(pJsonObject, metricsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPinId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pin_idKey = "pin_id";
	json_object_set_member(pJsonObject, pin_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::map<string, string>
TopPinsAnalyticsResponsePinsItems::getDataStatus()
{
	return data_status;
}

void
TopPinsAnalyticsResponsePinsItems::setDataStatus(std::map <string, string> data_status)
{
	this->data_status = data_status;
}

std::map<string, string>
TopPinsAnalyticsResponsePinsItems::getMetrics()
{
	return metrics;
}

void
TopPinsAnalyticsResponsePinsItems::setMetrics(std::map <string, string> metrics)
{
	this->metrics = metrics;
}

std::string
TopPinsAnalyticsResponsePinsItems::getPinId()
{
	return pin_id;
}

void
TopPinsAnalyticsResponsePinsItems::setPinId(std::string  pin_id)
{
	this->pin_id = pin_id;
}


