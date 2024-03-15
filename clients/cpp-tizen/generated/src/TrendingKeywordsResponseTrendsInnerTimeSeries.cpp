#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TrendingKeywordsResponse_trends_inner_time_series.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TrendingKeywordsResponse_trends_inner_time_series::TrendingKeywordsResponse_trends_inner_time_series()
{
	//__init();
}

TrendingKeywordsResponse_trends_inner_time_series::~TrendingKeywordsResponse_trends_inner_time_series()
{
	//__cleanup();
}

void
TrendingKeywordsResponse_trends_inner_time_series::__init()
{
	//date = null;
}

void
TrendingKeywordsResponse_trends_inner_time_series::__cleanup()
{
	//if(date != NULL) {
	//
	//delete date;
	//date = NULL;
	//}
	//
}

void
TrendingKeywordsResponse_trends_inner_time_series::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dateKey = "date";
	node = json_object_get_member(pJsonObject, dateKey);
	if (node !=NULL) {
	

		if (isprimitive("Date")) {
			jsonToValue(&date, node, "Date", "Date");
		} else {
			
		}
	}
}

TrendingKeywordsResponse_trends_inner_time_series::TrendingKeywordsResponse_trends_inner_time_series(char* json)
{
	this->fromJson(json);
}

char*
TrendingKeywordsResponse_trends_inner_time_series::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Date")) {
		Date obj = getDate();
		node = converttoJson(&obj, "Date", "");
	}
	else {
		
	}
	const gchar *dateKey = "date";
	json_object_set_member(pJsonObject, dateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Date
TrendingKeywordsResponse_trends_inner_time_series::getDate()
{
	return date;
}

void
TrendingKeywordsResponse_trends_inner_time_series::setDate(Date  date)
{
	this->date = date;
}


