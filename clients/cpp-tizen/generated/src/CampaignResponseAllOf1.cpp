#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignResponse_allOf_1.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignResponse_allOf_1::CampaignResponse_allOf_1()
{
	//__init();
}

CampaignResponse_allOf_1::~CampaignResponse_allOf_1()
{
	//__cleanup();
}

void
CampaignResponse_allOf_1::__init()
{
	//objective_type = new ObjectiveType();
	//created_time = int(0);
	//updated_time = int(0);
	//type = std::string();
}

void
CampaignResponse_allOf_1::__cleanup()
{
	//if(objective_type != NULL) {
	//
	//delete objective_type;
	//objective_type = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//if(updated_time != NULL) {
	//
	//delete updated_time;
	//updated_time = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
CampaignResponse_allOf_1::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *objective_typeKey = "objective_type";
	node = json_object_get_member(pJsonObject, objective_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ObjectiveType")) {
			jsonToValue(&objective_type, node, "ObjectiveType", "ObjectiveType");
		} else {
			
			ObjectiveType* obj = static_cast<ObjectiveType*> (&objective_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *created_timeKey = "created_time";
	node = json_object_get_member(pJsonObject, created_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *updated_timeKey = "updated_time";
	node = json_object_get_member(pJsonObject, updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
}

CampaignResponse_allOf_1::CampaignResponse_allOf_1(char* json)
{
	this->fromJson(json);
}

char*
CampaignResponse_allOf_1::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ObjectiveType")) {
		ObjectiveType obj = getObjectiveType();
		node = converttoJson(&obj, "ObjectiveType", "");
	}
	else {
		
		ObjectiveType obj = static_cast<ObjectiveType> (getObjectiveType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *objective_typeKey = "objective_type";
	json_object_set_member(pJsonObject, objective_typeKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
	if (isprimitive("int")) {
		int obj = getUpdatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_timeKey = "updated_time";
	json_object_set_member(pJsonObject, updated_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ObjectiveType
CampaignResponse_allOf_1::getObjectiveType()
{
	return objective_type;
}

void
CampaignResponse_allOf_1::setObjectiveType(ObjectiveType  objective_type)
{
	this->objective_type = objective_type;
}

int
CampaignResponse_allOf_1::getCreatedTime()
{
	return created_time;
}

void
CampaignResponse_allOf_1::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

int
CampaignResponse_allOf_1::getUpdatedTime()
{
	return updated_time;
}

void
CampaignResponse_allOf_1::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}

std::string
CampaignResponse_allOf_1::getType()
{
	return type;
}

void
CampaignResponse_allOf_1::setType(std::string  type)
{
	this->type = type;
}


