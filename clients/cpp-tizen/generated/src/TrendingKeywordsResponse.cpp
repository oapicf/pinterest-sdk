#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TrendingKeywordsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TrendingKeywordsResponse::TrendingKeywordsResponse()
{
	//__init();
}

TrendingKeywordsResponse::~TrendingKeywordsResponse()
{
	//__cleanup();
}

void
TrendingKeywordsResponse::__init()
{
	//new std::list()std::list> trends;
}

void
TrendingKeywordsResponse::__cleanup()
{
	//if(trends != NULL) {
	//trends.RemoveAll(true);
	//delete trends;
	//trends = NULL;
	//}
	//
}

void
TrendingKeywordsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *trendsKey = "trends";
	node = json_object_get_member(pJsonObject, trendsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<TrendingKeywordsResponse_trends_inner> new_list;
			TrendingKeywordsResponse_trends_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("TrendingKeywordsResponse_trends_inner")) {
					jsonToValue(&inst, temp_json, "TrendingKeywordsResponse_trends_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			trends = new_list;
		}
		
	}
}

TrendingKeywordsResponse::TrendingKeywordsResponse(char* json)
{
	this->fromJson(json);
}

char*
TrendingKeywordsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TrendingKeywordsResponse_trends_inner")) {
		list<TrendingKeywordsResponse_trends_inner> new_list = static_cast<list <TrendingKeywordsResponse_trends_inner> > (getTrends());
		node = converttoJson(&new_list, "TrendingKeywordsResponse_trends_inner", "array");
	} else {
		node = json_node_alloc();
		list<TrendingKeywordsResponse_trends_inner> new_list = static_cast<list <TrendingKeywordsResponse_trends_inner> > (getTrends());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<TrendingKeywordsResponse_trends_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			TrendingKeywordsResponse_trends_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *trendsKey = "trends";
	json_object_set_member(pJsonObject, trendsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<TrendingKeywordsResponse_trends_inner>
TrendingKeywordsResponse::getTrends()
{
	return trends;
}

void
TrendingKeywordsResponse::setTrends(std::list <TrendingKeywordsResponse_trends_inner> trends)
{
	this->trends = trends;
}


