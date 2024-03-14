#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TopVideoPinsAnalyticsResponse_pins_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TopVideoPinsAnalyticsResponse_pins_inner::TopVideoPinsAnalyticsResponse_pins_inner()
{
	//__init();
}

TopVideoPinsAnalyticsResponse_pins_inner::~TopVideoPinsAnalyticsResponse_pins_inner()
{
	//__cleanup();
}

void
TopVideoPinsAnalyticsResponse_pins_inner::__init()
{
	//new std::map()std::map> metrics;
	//new std::map()std::map> data_status;
	//pin_id = std::string();
}

void
TopVideoPinsAnalyticsResponse_pins_inner::__cleanup()
{
	//if(metrics != NULL) {
	//metrics.RemoveAll(true);
	//delete metrics;
	//metrics = NULL;
	//}
	//if(data_status != NULL) {
	//data_status.RemoveAll(true);
	//delete data_status;
	//data_status = NULL;
	//}
	//if(pin_id != NULL) {
	//
	//delete pin_id;
	//pin_id = NULL;
	//}
	//
}

void
TopVideoPinsAnalyticsResponse_pins_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *pin_idKey = "pin_id";
	node = json_object_get_member(pJsonObject, pin_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pin_id, node, "std::string", "");
		} else {
			
		}
	}
}

TopVideoPinsAnalyticsResponse_pins_inner::TopVideoPinsAnalyticsResponse_pins_inner(char* json)
{
	this->fromJson(json);
}

char*
TopVideoPinsAnalyticsResponse_pins_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;


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
TopVideoPinsAnalyticsResponse_pins_inner::getMetrics()
{
	return metrics;
}

void
TopVideoPinsAnalyticsResponse_pins_inner::setMetrics(std::map <string, string> metrics)
{
	this->metrics = metrics;
}

std::map<string, string>
TopVideoPinsAnalyticsResponse_pins_inner::getDataStatus()
{
	return data_status;
}

void
TopVideoPinsAnalyticsResponse_pins_inner::setDataStatus(std::map <string, string> data_status)
{
	this->data_status = data_status;
}

std::string
TopVideoPinsAnalyticsResponse_pins_inner::getPinId()
{
	return pin_id;
}

void
TopVideoPinsAnalyticsResponse_pins_inner::setPinId(std::string  pin_id)
{
	this->pin_id = pin_id;
}


