#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TimeSeries.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TimeSeries::TimeSeries()
{
	//__init();
}

TimeSeries::~TimeSeries()
{
	//__cleanup();
}

void
TimeSeries::__init()
{
	//date = null;
}

void
TimeSeries::__cleanup()
{
	//if(date != NULL) {
	//
	//delete date;
	//date = NULL;
	//}
	//
}

void
TimeSeries::fromJson(char* jsonStr)
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

TimeSeries::TimeSeries(char* json)
{
	this->fromJson(json);
}

char*
TimeSeries::toJson()
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
TimeSeries::getDate()
{
	return date;
}

void
TimeSeries::setDate(Date  date)
{
	this->date = date;
}


