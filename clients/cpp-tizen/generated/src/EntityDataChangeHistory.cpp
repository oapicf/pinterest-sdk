#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EntityDataChangeHistory.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EntityDataChangeHistory::EntityDataChangeHistory()
{
	//__init();
}

EntityDataChangeHistory::~EntityDataChangeHistory()
{
	//__cleanup();
}

void
EntityDataChangeHistory::__init()
{
	//changed_field_id = std::string();
	//changed_field_name = std::string();
	//data_type = null;
	//new_data_value = std::string();
	//old_data_value = std::string();
}

void
EntityDataChangeHistory::__cleanup()
{
	//if(changed_field_id != NULL) {
	//
	//delete changed_field_id;
	//changed_field_id = NULL;
	//}
	//if(changed_field_name != NULL) {
	//
	//delete changed_field_name;
	//changed_field_name = NULL;
	//}
	//if(data_type != NULL) {
	//
	//delete data_type;
	//data_type = NULL;
	//}
	//if(new_data_value != NULL) {
	//
	//delete new_data_value;
	//new_data_value = NULL;
	//}
	//if(old_data_value != NULL) {
	//
	//delete old_data_value;
	//old_data_value = NULL;
	//}
	//
}

void
EntityDataChangeHistory::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *changed_field_idKey = "changed_field_id";
	node = json_object_get_member(pJsonObject, changed_field_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&changed_field_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *changed_field_nameKey = "changed_field_name";
	node = json_object_get_member(pJsonObject, changed_field_nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&changed_field_name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *data_typeKey = "data_type";
	node = json_object_get_member(pJsonObject, data_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ChangeHistoryDataType")) {
			jsonToValue(&data_type, node, "ChangeHistoryDataType", "ChangeHistoryDataType");
		} else {
			
			ChangeHistoryDataType* obj = static_cast<ChangeHistoryDataType*> (&data_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *new_data_valueKey = "new_data_value";
	node = json_object_get_member(pJsonObject, new_data_valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&new_data_value, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *old_data_valueKey = "old_data_value";
	node = json_object_get_member(pJsonObject, old_data_valueKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&old_data_value, node, "std::string", "");
		} else {
			
		}
	}
}

EntityDataChangeHistory::EntityDataChangeHistory(char* json)
{
	this->fromJson(json);
}

char*
EntityDataChangeHistory::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getChangedFieldId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *changed_field_idKey = "changed_field_id";
	json_object_set_member(pJsonObject, changed_field_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getChangedFieldName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *changed_field_nameKey = "changed_field_name";
	json_object_set_member(pJsonObject, changed_field_nameKey, node);
	if (isprimitive("ChangeHistoryDataType")) {
		ChangeHistoryDataType obj = getDataType();
		node = converttoJson(&obj, "ChangeHistoryDataType", "");
	}
	else {
		
		ChangeHistoryDataType obj = static_cast<ChangeHistoryDataType> (getDataType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *data_typeKey = "data_type";
	json_object_set_member(pJsonObject, data_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getNewDataValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *new_data_valueKey = "new_data_value";
	json_object_set_member(pJsonObject, new_data_valueKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getOldDataValue();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *old_data_valueKey = "old_data_value";
	json_object_set_member(pJsonObject, old_data_valueKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
EntityDataChangeHistory::getChangedFieldId()
{
	return changed_field_id;
}

void
EntityDataChangeHistory::setChangedFieldId(std::string  changed_field_id)
{
	this->changed_field_id = changed_field_id;
}

std::string
EntityDataChangeHistory::getChangedFieldName()
{
	return changed_field_name;
}

void
EntityDataChangeHistory::setChangedFieldName(std::string  changed_field_name)
{
	this->changed_field_name = changed_field_name;
}

ChangeHistoryDataType
EntityDataChangeHistory::getDataType()
{
	return data_type;
}

void
EntityDataChangeHistory::setDataType(ChangeHistoryDataType  data_type)
{
	this->data_type = data_type;
}

std::string
EntityDataChangeHistory::getNewDataValue()
{
	return new_data_value;
}

void
EntityDataChangeHistory::setNewDataValue(std::string  new_data_value)
{
	this->new_data_value = new_data_value;
}

std::string
EntityDataChangeHistory::getOldDataValue()
{
	return old_data_value;
}

void
EntityDataChangeHistory::setOldDataValue(std::string  old_data_value)
{
	this->old_data_value = old_data_value;
}


