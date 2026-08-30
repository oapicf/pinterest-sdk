#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EntityHistory.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EntityHistory::EntityHistory()
{
	//__init();
}

EntityHistory::~EntityHistory()
{
	//__cleanup();
}

void
EntityHistory::__init()
{
	//change_timestamp = int(0);
	//new std::list()std::list> data_changes;
	//entity_id = std::string();
	//entity_name = std::string();
	//ldap = std::string();
	//operation = null;
	//user_id = std::string();
}

void
EntityHistory::__cleanup()
{
	//if(change_timestamp != NULL) {
	//
	//delete change_timestamp;
	//change_timestamp = NULL;
	//}
	//if(data_changes != NULL) {
	//data_changes.RemoveAll(true);
	//delete data_changes;
	//data_changes = NULL;
	//}
	//if(entity_id != NULL) {
	//
	//delete entity_id;
	//entity_id = NULL;
	//}
	//if(entity_name != NULL) {
	//
	//delete entity_name;
	//entity_name = NULL;
	//}
	//if(ldap != NULL) {
	//
	//delete ldap;
	//ldap = NULL;
	//}
	//if(operation != NULL) {
	//
	//delete operation;
	//operation = NULL;
	//}
	//if(user_id != NULL) {
	//
	//delete user_id;
	//user_id = NULL;
	//}
	//
}

void
EntityHistory::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *change_timestampKey = "change_timestamp";
	node = json_object_get_member(pJsonObject, change_timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&change_timestamp, node, "int", "");
		} else {
			
		}
	}
	const gchar *data_changesKey = "data_changes";
	node = json_object_get_member(pJsonObject, data_changesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EntityDataChangeHistory> new_list;
			EntityDataChangeHistory inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EntityDataChangeHistory")) {
					jsonToValue(&inst, temp_json, "EntityDataChangeHistory", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			data_changes = new_list;
		}
		
	}
	const gchar *entity_idKey = "entity_id";
	node = json_object_get_member(pJsonObject, entity_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&entity_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *entity_nameKey = "entity_name";
	node = json_object_get_member(pJsonObject, entity_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&entity_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ldapKey = "ldap";
	node = json_object_get_member(pJsonObject, ldapKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ldap, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *operationKey = "operation";
	node = json_object_get_member(pJsonObject, operationKey);
	if (node !=NULL) {
	

		if (isprimitive("ChangeHistoryOperationType")) {
			jsonToValue(&operation, node, "ChangeHistoryOperationType", "ChangeHistoryOperationType");
		} else {
			
			ChangeHistoryOperationType* obj = static_cast<ChangeHistoryOperationType*> (&operation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *user_idKey = "user_id";
	node = json_object_get_member(pJsonObject, user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&user_id, node, "std::string", "");
		} else {
			
		}
	}
}

EntityHistory::EntityHistory(char* json)
{
	this->fromJson(json);
}

char*
EntityHistory::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getChangeTimestamp();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *change_timestampKey = "change_timestamp";
	json_object_set_member(pJsonObject, change_timestampKey, node);
	if (isprimitive("EntityDataChangeHistory")) {
		list<EntityDataChangeHistory> new_list = static_cast<list <EntityDataChangeHistory> > (getDataChanges());
		node = converttoJson(&new_list, "EntityDataChangeHistory", "array");
	} else {
		node = json_node_alloc();
		list<EntityDataChangeHistory> new_list = static_cast<list <EntityDataChangeHistory> > (getDataChanges());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EntityDataChangeHistory>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EntityDataChangeHistory obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *data_changesKey = "data_changes";
	json_object_set_member(pJsonObject, data_changesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEntityId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *entity_idKey = "entity_id";
	json_object_set_member(pJsonObject, entity_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEntityName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *entity_nameKey = "entity_name";
	json_object_set_member(pJsonObject, entity_nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLdap();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ldapKey = "ldap";
	json_object_set_member(pJsonObject, ldapKey, node);
	if (isprimitive("ChangeHistoryOperationType")) {
		ChangeHistoryOperationType obj = getOperation();
		node = converttoJson(&obj, "ChangeHistoryOperationType", "");
	}
	else {
		
		ChangeHistoryOperationType obj = static_cast<ChangeHistoryOperationType> (getOperation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operationKey = "operation";
	json_object_set_member(pJsonObject, operationKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *user_idKey = "user_id";
	json_object_set_member(pJsonObject, user_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
EntityHistory::getChangeTimestamp()
{
	return change_timestamp;
}

void
EntityHistory::setChangeTimestamp(int  change_timestamp)
{
	this->change_timestamp = change_timestamp;
}

std::list<EntityDataChangeHistory>
EntityHistory::getDataChanges()
{
	return data_changes;
}

void
EntityHistory::setDataChanges(std::list <EntityDataChangeHistory> data_changes)
{
	this->data_changes = data_changes;
}

std::string
EntityHistory::getEntityId()
{
	return entity_id;
}

void
EntityHistory::setEntityId(std::string  entity_id)
{
	this->entity_id = entity_id;
}

std::string
EntityHistory::getEntityName()
{
	return entity_name;
}

void
EntityHistory::setEntityName(std::string  entity_name)
{
	this->entity_name = entity_name;
}

std::string
EntityHistory::getLdap()
{
	return ldap;
}

void
EntityHistory::setLdap(std::string  ldap)
{
	this->ldap = ldap;
}

ChangeHistoryOperationType
EntityHistory::getOperation()
{
	return operation;
}

void
EntityHistory::setOperation(ChangeHistoryOperationType  operation)
{
	this->operation = operation;
}

std::string
EntityHistory::getUserId()
{
	return user_id;
}

void
EntityHistory::setUserId(std::string  user_id)
{
	this->user_id = user_id;
}


