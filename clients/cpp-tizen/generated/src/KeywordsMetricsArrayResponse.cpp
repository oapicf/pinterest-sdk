#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeywordsMetricsArrayResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeywordsMetricsArrayResponse::KeywordsMetricsArrayResponse()
{
	//__init();
}

KeywordsMetricsArrayResponse::~KeywordsMetricsArrayResponse()
{
	//__cleanup();
}

void
KeywordsMetricsArrayResponse::__init()
{
	//new std::list()std::list> data;
}

void
KeywordsMetricsArrayResponse::__cleanup()
{
	//if(data != NULL) {
	//data.RemoveAll(true);
	//delete data;
	//data = NULL;
	//}
	//
}

void
KeywordsMetricsArrayResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<KeywordMetricsResponse> new_list;
			KeywordMetricsResponse inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("KeywordMetricsResponse")) {
					jsonToValue(&inst, temp_json, "KeywordMetricsResponse", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			data = new_list;
		}
		
	}
}

KeywordsMetricsArrayResponse::KeywordsMetricsArrayResponse(char* json)
{
	this->fromJson(json);
}

char*
KeywordsMetricsArrayResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("KeywordMetricsResponse")) {
		list<KeywordMetricsResponse> new_list = static_cast<list <KeywordMetricsResponse> > (getData());
		node = converttoJson(&new_list, "KeywordMetricsResponse", "array");
	} else {
		node = json_node_alloc();
		list<KeywordMetricsResponse> new_list = static_cast<list <KeywordMetricsResponse> > (getData());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<KeywordMetricsResponse>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			KeywordMetricsResponse obj = *it;
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

std::list<KeywordMetricsResponse>
KeywordsMetricsArrayResponse::getData()
{
	return data;
}

void
KeywordsMetricsArrayResponse::setData(std::list <KeywordMetricsResponse> data)
{
	this->data = data;
}


