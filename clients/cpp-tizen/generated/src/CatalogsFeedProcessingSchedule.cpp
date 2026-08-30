#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsFeedProcessingSchedule.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsFeedProcessingSchedule::CatalogsFeedProcessingSchedule()
{
	//__init();
}

CatalogsFeedProcessingSchedule::~CatalogsFeedProcessingSchedule()
{
	//__cleanup();
}

void
CatalogsFeedProcessingSchedule::__init()
{
	//time = std::string();
	//timezone = null;
}

void
CatalogsFeedProcessingSchedule::__cleanup()
{
	//if(time != NULL) {
	//
	//delete time;
	//time = NULL;
	//}
	//if(timezone != NULL) {
	//
	//delete timezone;
	//timezone = NULL;
	//}
	//
}

void
CatalogsFeedProcessingSchedule::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *timeKey = "time";
	node = json_object_get_member(pJsonObject, timeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&time, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *timezoneKey = "timezone";
	node = json_object_get_member(pJsonObject, timezoneKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsFeedProcessingScheduleTimezone")) {
			jsonToValue(&timezone, node, "CatalogsFeedProcessingScheduleTimezone", "CatalogsFeedProcessingScheduleTimezone");
		} else {
			
			CatalogsFeedProcessingScheduleTimezone* obj = static_cast<CatalogsFeedProcessingScheduleTimezone*> (&timezone);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsFeedProcessingSchedule::CatalogsFeedProcessingSchedule(char* json)
{
	this->fromJson(json);
}

char*
CatalogsFeedProcessingSchedule::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *timeKey = "time";
	json_object_set_member(pJsonObject, timeKey, node);
	if (isprimitive("CatalogsFeedProcessingScheduleTimezone")) {
		CatalogsFeedProcessingScheduleTimezone obj = getTimezone();
		node = converttoJson(&obj, "CatalogsFeedProcessingScheduleTimezone", "");
	}
	else {
		
		CatalogsFeedProcessingScheduleTimezone obj = static_cast<CatalogsFeedProcessingScheduleTimezone> (getTimezone());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *timezoneKey = "timezone";
	json_object_set_member(pJsonObject, timezoneKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsFeedProcessingSchedule::getTime()
{
	return time;
}

void
CatalogsFeedProcessingSchedule::setTime(std::string  time)
{
	this->time = time;
}

CatalogsFeedProcessingScheduleTimezone
CatalogsFeedProcessingSchedule::getTimezone()
{
	return timezone;
}

void
CatalogsFeedProcessingSchedule::setTimezone(CatalogsFeedProcessingScheduleTimezone  timezone)
{
	this->timezone = timezone;
}


