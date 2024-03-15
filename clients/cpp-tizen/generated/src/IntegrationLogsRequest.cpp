#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "IntegrationLogsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

IntegrationLogsRequest::IntegrationLogsRequest()
{
	//__init();
}

IntegrationLogsRequest::~IntegrationLogsRequest()
{
	//__cleanup();
}

void
IntegrationLogsRequest::__init()
{
	//new std::list()std::list> logs;
}

void
IntegrationLogsRequest::__cleanup()
{
	//if(logs != NULL) {
	//logs.RemoveAll(true);
	//delete logs;
	//logs = NULL;
	//}
	//
}

void
IntegrationLogsRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *logsKey = "logs";
	node = json_object_get_member(pJsonObject, logsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<IntegrationLog> new_list;
			IntegrationLog inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("IntegrationLog")) {
					jsonToValue(&inst, temp_json, "IntegrationLog", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			logs = new_list;
		}
		
	}
}

IntegrationLogsRequest::IntegrationLogsRequest(char* json)
{
	this->fromJson(json);
}

char*
IntegrationLogsRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("IntegrationLog")) {
		list<IntegrationLog> new_list = static_cast<list <IntegrationLog> > (getLogs());
		node = converttoJson(&new_list, "IntegrationLog", "array");
	} else {
		node = json_node_alloc();
		list<IntegrationLog> new_list = static_cast<list <IntegrationLog> > (getLogs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<IntegrationLog>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			IntegrationLog obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *logsKey = "logs";
	json_object_set_member(pJsonObject, logsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<IntegrationLog>
IntegrationLogsRequest::getLogs()
{
	return logs;
}

void
IntegrationLogsRequest::setLogs(std::list <IntegrationLog> logs)
{
	this->logs = logs;
}


