#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeywordMetrics.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeywordMetrics::KeywordMetrics()
{
	//__init();
}

KeywordMetrics::~KeywordMetrics()
{
	//__cleanup();
}

void
KeywordMetrics::__init()
{
	//keyword_query_volume = std::string();
}

void
KeywordMetrics::__cleanup()
{
	//if(keyword_query_volume != NULL) {
	//
	//delete keyword_query_volume;
	//keyword_query_volume = NULL;
	//}
	//
}

void
KeywordMetrics::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *keyword_query_volumeKey = "keyword_query_volume";
	node = json_object_get_member(pJsonObject, keyword_query_volumeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&keyword_query_volume, node, "std::string", "");
		} else {
			
		}
	}
}

KeywordMetrics::KeywordMetrics(char* json)
{
	this->fromJson(json);
}

char*
KeywordMetrics::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getKeywordQueryVolume();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *keyword_query_volumeKey = "keyword_query_volume";
	json_object_set_member(pJsonObject, keyword_query_volumeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
KeywordMetrics::getKeywordQueryVolume()
{
	return keyword_query_volume;
}

void
KeywordMetrics::setKeywordQueryVolume(std::string  keyword_query_volume)
{
	this->keyword_query_volume = keyword_query_volume;
}


