#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PredictedTimeSeries.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PredictedTimeSeries::PredictedTimeSeries()
{
	//__init();
}

PredictedTimeSeries::~PredictedTimeSeries()
{
	//__cleanup();
}

void
PredictedTimeSeries::__init()
{
	//date = null;
}

void
PredictedTimeSeries::__cleanup()
{
	//if(date != NULL) {
	//
	//delete date;
	//date = NULL;
	//}
	//
}

void
PredictedTimeSeries::fromJson(char* jsonStr)
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

PredictedTimeSeries::PredictedTimeSeries(char* json)
{
	this->fromJson(json);
}

char*
PredictedTimeSeries::toJson()
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
PredictedTimeSeries::getDate()
{
	return date;
}

void
PredictedTimeSeries::setDate(Date  date)
{
	this->date = date;
}


