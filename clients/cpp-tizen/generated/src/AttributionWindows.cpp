#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AttributionWindows.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AttributionWindows::AttributionWindows()
{
	//__init();
}

AttributionWindows::~AttributionWindows()
{
	//__cleanup();
}

void
AttributionWindows::__init()
{
	//click_window_days = int(0);
	//engagement_window_days = int(0);
	//view_window_days = int(0);
}

void
AttributionWindows::__cleanup()
{
	//if(click_window_days != NULL) {
	//
	//delete click_window_days;
	//click_window_days = NULL;
	//}
	//if(engagement_window_days != NULL) {
	//
	//delete engagement_window_days;
	//engagement_window_days = NULL;
	//}
	//if(view_window_days != NULL) {
	//
	//delete view_window_days;
	//view_window_days = NULL;
	//}
	//
}

void
AttributionWindows::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *click_window_daysKey = "click_window_days";
	node = json_object_get_member(pJsonObject, click_window_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&click_window_days, node, "int", "");
		} else {
			
		}
	}
	const gchar *engagement_window_daysKey = "engagement_window_days";
	node = json_object_get_member(pJsonObject, engagement_window_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&engagement_window_days, node, "int", "");
		} else {
			
		}
	}
	const gchar *view_window_daysKey = "view_window_days";
	node = json_object_get_member(pJsonObject, view_window_daysKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&view_window_days, node, "int", "");
		} else {
			
		}
	}
}

AttributionWindows::AttributionWindows(char* json)
{
	this->fromJson(json);
}

char*
AttributionWindows::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getClickWindowDays();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *click_window_daysKey = "click_window_days";
	json_object_set_member(pJsonObject, click_window_daysKey, node);
	if (isprimitive("int")) {
		int obj = getEngagementWindowDays();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *engagement_window_daysKey = "engagement_window_days";
	json_object_set_member(pJsonObject, engagement_window_daysKey, node);
	if (isprimitive("int")) {
		int obj = getViewWindowDays();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *view_window_daysKey = "view_window_days";
	json_object_set_member(pJsonObject, view_window_daysKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
AttributionWindows::getClickWindowDays()
{
	return click_window_days;
}

void
AttributionWindows::setClickWindowDays(int  click_window_days)
{
	this->click_window_days = click_window_days;
}

int
AttributionWindows::getEngagementWindowDays()
{
	return engagement_window_days;
}

void
AttributionWindows::setEngagementWindowDays(int  engagement_window_days)
{
	this->engagement_window_days = engagement_window_days;
}

int
AttributionWindows::getViewWindowDays()
{
	return view_window_days;
}

void
AttributionWindows::setViewWindowDays(int  view_window_days)
{
	this->view_window_days = view_window_days;
}


