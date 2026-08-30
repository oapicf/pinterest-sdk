#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Schedules_create_200_response_inner_data_oneOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Schedules_create_200_response_inner_data_oneOf::Schedules_create_200_response_inner_data_oneOf()
{
	//__init();
}

Schedules_create_200_response_inner_data_oneOf::~Schedules_create_200_response_inner_data_oneOf()
{
	//__cleanup();
}

void
Schedules_create_200_response_inner_data_oneOf::__init()
{
	//id = std::string();
	//schedule_id = std::string();
	//exceptions = new Pinterest.Lib.Error();
}

void
Schedules_create_200_response_inner_data_oneOf::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(schedule_id != NULL) {
	//
	//delete schedule_id;
	//schedule_id = NULL;
	//}
	//if(exceptions != NULL) {
	//
	//delete exceptions;
	//exceptions = NULL;
	//}
	//
}

void
Schedules_create_200_response_inner_data_oneOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *schedule_idKey = "schedule_id";
	node = json_object_get_member(pJsonObject, schedule_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&schedule_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *exceptionsKey = "exceptions";
	node = json_object_get_member(pJsonObject, exceptionsKey);
	if (node !=NULL) {
	

		if (isprimitive("Pinterest.Lib.Error")) {
			jsonToValue(&exceptions, node, "Pinterest.Lib.Error", "Pinterest.Lib.Error");
		} else {
			
			Pinterest.Lib.Error* obj = static_cast<Pinterest.Lib.Error*> (&exceptions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

Schedules_create_200_response_inner_data_oneOf::Schedules_create_200_response_inner_data_oneOf(char* json)
{
	this->fromJson(json);
}

char*
Schedules_create_200_response_inner_data_oneOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getScheduleId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *schedule_idKey = "schedule_id";
	json_object_set_member(pJsonObject, schedule_idKey, node);
	if (isprimitive("Pinterest.Lib.Error")) {
		Pinterest.Lib.Error obj = getExceptions();
		node = converttoJson(&obj, "Pinterest.Lib.Error", "");
	}
	else {
		
		Pinterest.Lib.Error obj = static_cast<Pinterest.Lib.Error> (getExceptions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *exceptionsKey = "exceptions";
	json_object_set_member(pJsonObject, exceptionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Schedules_create_200_response_inner_data_oneOf::getId()
{
	return id;
}

void
Schedules_create_200_response_inner_data_oneOf::setId(std::string  id)
{
	this->id = id;
}

std::string
Schedules_create_200_response_inner_data_oneOf::getScheduleId()
{
	return schedule_id;
}

void
Schedules_create_200_response_inner_data_oneOf::setScheduleId(std::string  schedule_id)
{
	this->schedule_id = schedule_id;
}

Pinterest.Lib.Error
Schedules_create_200_response_inner_data_oneOf::getExceptions()
{
	return exceptions;
}

void
Schedules_create_200_response_inner_data_oneOf::setExceptions(Pinterest.Lib.Error  exceptions)
{
	this->exceptions = exceptions;
}


