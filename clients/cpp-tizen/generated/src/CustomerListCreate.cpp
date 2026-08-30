#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomerListCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomerListCreate::CustomerListCreate()
{
	//__init();
}

CustomerListCreate::~CustomerListCreate()
{
	//__cleanup();
}

void
CustomerListCreate::__init()
{
	//is_nca = bool(false);
	//list_type = null;
	//name = std::string();
	//records = std::string();
	//new std::list()std::list> records_v2;
}

void
CustomerListCreate::__cleanup()
{
	//if(is_nca != NULL) {
	//
	//delete is_nca;
	//is_nca = NULL;
	//}
	//if(list_type != NULL) {
	//
	//delete list_type;
	//list_type = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(records != NULL) {
	//
	//delete records;
	//records = NULL;
	//}
	//if(records_v2 != NULL) {
	//records_v2.RemoveAll(true);
	//delete records_v2;
	//records_v2 = NULL;
	//}
	//
}

void
CustomerListCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *is_ncaKey = "is_nca";
	node = json_object_get_member(pJsonObject, is_ncaKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_nca, node, "bool", "");
		} else {
			
		}
	}
	const gchar *list_typeKey = "list_type";
	node = json_object_get_member(pJsonObject, list_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("UserListType")) {
			jsonToValue(&list_type, node, "UserListType", "UserListType");
		} else {
			
			UserListType* obj = static_cast<UserListType*> (&list_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *recordsKey = "records";
	node = json_object_get_member(pJsonObject, recordsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&records, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *records_v2Key = "records_v2";
	node = json_object_get_member(pJsonObject, records_v2Key);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CustomerListRecordRow> new_list;
			CustomerListRecordRow inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CustomerListRecordRow")) {
					jsonToValue(&inst, temp_json, "CustomerListRecordRow", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			records_v2 = new_list;
		}
		
	}
}

CustomerListCreate::CustomerListCreate(char* json)
{
	this->fromJson(json);
}

char*
CustomerListCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getIsNca();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_ncaKey = "is_nca";
	json_object_set_member(pJsonObject, is_ncaKey, node);
	if (isprimitive("UserListType")) {
		UserListType obj = getListType();
		node = converttoJson(&obj, "UserListType", "");
	}
	else {
		
		UserListType obj = static_cast<UserListType> (getListType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *list_typeKey = "list_type";
	json_object_set_member(pJsonObject, list_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getRecords();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *recordsKey = "records";
	json_object_set_member(pJsonObject, recordsKey, node);
	if (isprimitive("CustomerListRecordRow")) {
		list<CustomerListRecordRow> new_list = static_cast<list <CustomerListRecordRow> > (getRecordsV2());
		node = converttoJson(&new_list, "CustomerListRecordRow", "array");
	} else {
		node = json_node_alloc();
		list<CustomerListRecordRow> new_list = static_cast<list <CustomerListRecordRow> > (getRecordsV2());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CustomerListRecordRow>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CustomerListRecordRow obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *records_v2Key = "records_v2";
	json_object_set_member(pJsonObject, records_v2Key, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
CustomerListCreate::getIsNca()
{
	return is_nca;
}

void
CustomerListCreate::setIsNca(bool  is_nca)
{
	this->is_nca = is_nca;
}

UserListType
CustomerListCreate::getListType()
{
	return list_type;
}

void
CustomerListCreate::setListType(UserListType  list_type)
{
	this->list_type = list_type;
}

std::string
CustomerListCreate::getName()
{
	return name;
}

void
CustomerListCreate::setName(std::string  name)
{
	this->name = name;
}

std::string
CustomerListCreate::getRecords()
{
	return records;
}

void
CustomerListCreate::setRecords(std::string  records)
{
	this->records = records;
}

std::list<CustomerListRecordRow>
CustomerListCreate::getRecordsV2()
{
	return records_v2;
}

void
CustomerListCreate::setRecordsV2(std::list <CustomerListRecordRow> records_v2)
{
	this->records_v2 = records_v2;
}


