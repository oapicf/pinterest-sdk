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
			list<IntegrationLogsInvalidLogResponse_rejected_logs_inner> new_list;
			IntegrationLogsInvalidLogResponse_rejected_logs_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("IntegrationLogsInvalidLogResponse_rejected_logs_inner")) {
					jsonToValue(&inst, temp_json, "IntegrationLogsInvalidLogResponse_rejected_logs_inner", "");
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
	if (isprimitive("IntegrationLogsInvalidLogResponse_rejected_logs_inner")) {
		list<IntegrationLogsInvalidLogResponse_rejected_logs_inner> new_list = static_cast<list <IntegrationLogsInvalidLogResponse_rejected_logs_inner> > (getRejectedLogs());
		node = converttoJson(&new_list, "IntegrationLogsInvalidLogResponse_rejected_logs_inner", "array");
	} else {
		node = json_node_alloc();
		list<IntegrationLogsInvalidLogResponse_rejected_logs_inner> new_list = static_cast<list <IntegrationLogsInvalidLogResponse_rejected_logs_inner> > (getRejectedLogs());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<IntegrationLogsInvalidLogResponse_rejected_logs_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			IntegrationLogsInvalidLogResponse_rejected_logs_inner obj = *it;
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

std::list<IntegrationLogsInvalidLogResponse_rejected_logs_inner>
IntegrationLogsInvalidLogResponse::getRejectedLogs()
{
	return rejected_logs;
}

void
IntegrationLogsInvalidLogResponse::setRejectedLogs(std::list <IntegrationLogsInvalidLogResponse_rejected_logs_inner> rejected_logs)
{
	this->rejected_logs = rejected_logs;
}


