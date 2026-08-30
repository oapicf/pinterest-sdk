#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "IntegrationLogsInvalidLogResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

IntegrationLogsInvalidLogResponse::IntegrationLogsInvalidLogResponse()
{
	//__init();
}

IntegrationLogsInvalidLogResponse::~IntegrationLogsInvalidLogResponse()
{
	//__cleanup();
}

void
IntegrationLogsInvalidLogResponse::__init()
{
	//new std::list()std::list> rejected_logs;
}

void
IntegrationLogsInvalidLogResponse::__cleanup()
{
	//if(rejected_logs != NULL) {
	//rejected_logs.RemoveAll(true);
	//delete rejected_logs;
	//rejected_logs = NULL;
	//}
	//
}

void
IntegrationLogsInvalidLogResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *rejected_logsKey = "rejected_logs";
	node = json_object_get_member(pJsonObject, rejected_logsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<IntegrationLogsInvalidLogResponseRejectedLogsItems> new_list;
			IntegrationLogsInvalidLogResponseRejectedLogsItems inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("IntegrationLogsInvalidLogResponseRejectedLogsItems")) {
					jsonToValue(&inst, temp_json, "IntegrationLogsInvalidLogResponseRejectedLogsItems", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			rejected_logs = new_list;
		}
		
	}
}

IntegrationLogsInvalidLogResponse::IntegrationLogsInvalidLogResponse(char* json)
{
	this->fromJson(json);
}

char*
IntegrationLogsInvalidLogResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("IntegrationLogsInvalidLogResponseRejectedLogsItems")) {
		list<IntegrationLogsInvalidLogResponseRejectedLogsItems> new_list = static_cast<list <IntegrationLogsInvalidLogResponseRejectedLogsItems> > (getRejectedLogs());
		node = converttoJson(&new_list, "IntegrationLogsInvalidLogResponseRejectedLogsItems", "array");
	} else {
		node = json_node_alloc();
		list<IntegrationLogsInvalidLogResponseRejectedLogsItems> new_list = static_cast<list <IntegrationLogsInvalidLogResponseRejectedLogsItems> > (getRejectedLogs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<IntegrationLogsInvalidLogResponseRejectedLogsItems>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			IntegrationLogsInvalidLogResponseRejectedLogsItems obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *rejected_logsKey = "rejected_logs";
	json_object_set_member(pJsonObject, rejected_logsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<IntegrationLogsInvalidLogResponseRejectedLogsItems>
IntegrationLogsInvalidLogResponse::getRejectedLogs()
{
	return rejected_logs;
}

void
IntegrationLogsInvalidLogResponse::setRejectedLogs(std::list <IntegrationLogsInvalidLogResponseRejectedLogsItems> rejected_logs)
{
	this->rejected_logs = rejected_logs;
}


