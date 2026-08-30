#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomerListUpdateWithRequiredBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomerListUpdateWithRequiredBody::CustomerListUpdateWithRequiredBody()
{
	//__init();
}

CustomerListUpdateWithRequiredBody::~CustomerListUpdateWithRequiredBody()
{
	//__cleanup();
}

void
CustomerListUpdateWithRequiredBody::__init()
{
	//operation_type = null;
	//records = std::string();
	//new std::list()std::list> records_v2;
}

void
CustomerListUpdateWithRequiredBody::__cleanup()
{
	//if(operation_type != NULL) {
	//
	//delete operation_type;
	//operation_type = NULL;
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
CustomerListUpdateWithRequiredBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *operation_typeKey = "operation_type";
	node = json_object_get_member(pJsonObject, operation_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("UserListOperationType")) {
			jsonToValue(&operation_type, node, "UserListOperationType", "UserListOperationType");
		} else {
			
			UserListOperationType* obj = static_cast<UserListOperationType*> (&operation_type);
			obj->fromJson(json_to_string(node, false));
			
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

CustomerListUpdateWithRequiredBody::CustomerListUpdateWithRequiredBody(char* json)
{
	this->fromJson(json);
}

char*
CustomerListUpdateWithRequiredBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("UserListOperationType")) {
		UserListOperationType obj = getOperationType();
		node = converttoJson(&obj, "UserListOperationType", "");
	}
	else {
		
		UserListOperationType obj = static_cast<UserListOperationType> (getOperationType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *operation_typeKey = "operation_type";
	json_object_set_member(pJsonObject, operation_typeKey, node);
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

UserListOperationType
CustomerListUpdateWithRequiredBody::getOperationType()
{
	return operation_type;
}

void
CustomerListUpdateWithRequiredBody::setOperationType(UserListOperationType  operation_type)
{
	this->operation_type = operation_type;
}

std::string
CustomerListUpdateWithRequiredBody::getRecords()
{
	return records;
}

void
CustomerListUpdateWithRequiredBody::setRecords(std::string  records)
{
	this->records = records;
}

std::list<CustomerListRecordRow>
CustomerListUpdateWithRequiredBody::getRecordsV2()
{
	return records_v2;
}

void
CustomerListUpdateWithRequiredBody::setRecordsV2(std::list <CustomerListRecordRow> records_v2)
{
	this->records_v2 = records_v2;
}


