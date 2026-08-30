#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ScheduleGenderMultipliers.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ScheduleGenderMultipliers::ScheduleGenderMultipliers()
{
	//__init();
}

ScheduleGenderMultipliers::~ScheduleGenderMultipliers()
{
	//__cleanup();
}

void
ScheduleGenderMultipliers::__init()
{
	//gENDER = new TargetingSpecGender();
}

void
ScheduleGenderMultipliers::__cleanup()
{
	//if(gENDER != NULL) {
	//
	//delete gENDER;
	//gENDER = NULL;
	//}
	//
}

void
ScheduleGenderMultipliers::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *gENDERKey = "GENDER";
	node = json_object_get_member(pJsonObject, gENDERKey);
	if (node !=NULL) {
	

		if (isprimitive("TargetingSpecGender")) {
			jsonToValue(&gENDER, node, "TargetingSpecGender", "TargetingSpecGender");
		} else {
			
			TargetingSpecGender* obj = static_cast<TargetingSpecGender*> (&gENDER);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ScheduleGenderMultipliers::ScheduleGenderMultipliers(char* json)
{
	this->fromJson(json);
}

char*
ScheduleGenderMultipliers::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("TargetingSpecGender")) {
		TargetingSpecGender obj = getGENDER();
		node = converttoJson(&obj, "TargetingSpecGender", "");
	}
	else {
		
		TargetingSpecGender obj = static_cast<TargetingSpecGender> (getGENDER());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *gENDERKey = "GENDER";
	json_object_set_member(pJsonObject, gENDERKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

TargetingSpecGender
ScheduleGenderMultipliers::getGENDER()
{
	return gENDER;
}

void
ScheduleGenderMultipliers::setGENDER(TargetingSpecGender  gENDER)
{
	this->gENDER = gENDER;
}


