#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LabelBulkUpdateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LabelBulkUpdateRequest::LabelBulkUpdateRequest()
{
	//__init();
}

LabelBulkUpdateRequest::~LabelBulkUpdateRequest()
{
	//__cleanup();
}

void
LabelBulkUpdateRequest::__init()
{
	//id = std::string();
	//parent_id = std::string();
	//status = new LabelStatusBulkUpdate();
}

void
LabelBulkUpdateRequest::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(parent_id != NULL) {
	//
	//delete parent_id;
	//parent_id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
LabelBulkUpdateRequest::fromJson(char* jsonStr)
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
	const gchar *parent_idKey = "parent_id";
	node = json_object_get_member(pJsonObject, parent_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&parent_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("LabelStatusBulkUpdate")) {
			jsonToValue(&status, node, "LabelStatusBulkUpdate", "LabelStatusBulkUpdate");
		} else {
			
			LabelStatusBulkUpdate* obj = static_cast<LabelStatusBulkUpdate*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

LabelBulkUpdateRequest::LabelBulkUpdateRequest(char* json)
{
	this->fromJson(json);
}

char*
LabelBulkUpdateRequest::toJson()
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
		std::string obj = getParentId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *parent_idKey = "parent_id";
	json_object_set_member(pJsonObject, parent_idKey, node);
	if (isprimitive("LabelStatusBulkUpdate")) {
		LabelStatusBulkUpdate obj = getStatus();
		node = converttoJson(&obj, "LabelStatusBulkUpdate", "");
	}
	else {
		
		LabelStatusBulkUpdate obj = static_cast<LabelStatusBulkUpdate> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LabelBulkUpdateRequest::getId()
{
	return id;
}

void
LabelBulkUpdateRequest::setId(std::string  id)
{
	this->id = id;
}

std::string
LabelBulkUpdateRequest::getParentId()
{
	return parent_id;
}

void
LabelBulkUpdateRequest::setParentId(std::string  parent_id)
{
	this->parent_id = parent_id;
}

LabelStatusBulkUpdate
LabelBulkUpdateRequest::getStatus()
{
	return status;
}

void
LabelBulkUpdateRequest::setStatus(LabelStatusBulkUpdate  status)
{
	this->status = status;
}


