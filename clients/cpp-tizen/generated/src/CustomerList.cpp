#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CustomerList.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CustomerList::CustomerList()
{
	//__init();
}

CustomerList::~CustomerList()
{
	//__cleanup();
}

void
CustomerList::__init()
{
	//ad_account_id = std::string();
	//created_time = double(0);
	//id = std::string();
	//name = std::string();
	//num_batches = double(0);
	//num_removed_user_records = double(0);
	//num_uploaded_user_records = double(0);
	//status = std::string();
	//type = std::string();
	//updated_time = double(0);
	//exceptions = null;
}

void
CustomerList::__cleanup()
{
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(num_batches != NULL) {
	//
	//delete num_batches;
	//num_batches = NULL;
	//}
	//if(num_removed_user_records != NULL) {
	//
	//delete num_removed_user_records;
	//num_removed_user_records = NULL;
	//}
	//if(num_uploaded_user_records != NULL) {
	//
	//delete num_uploaded_user_records;
	//num_uploaded_user_records = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(updated_time != NULL) {
	//
	//delete updated_time;
	//updated_time = NULL;
	//}
	//if(exceptions != NULL) {
	//
	//delete exceptions;
	//exceptions = NULL;
	//}
	//
}

void
CustomerList::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_account_idKey = "ad_account_id";
	node = json_object_get_member(pJsonObject, ad_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_account_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *created_timeKey = "created_time";
	node = json_object_get_member(pJsonObject, created_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&created_time, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&created_time);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
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
	const gchar *num_batchesKey = "num_batches";
	node = json_object_get_member(pJsonObject, num_batchesKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&num_batches, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&num_batches);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *num_removed_user_recordsKey = "num_removed_user_records";
	node = json_object_get_member(pJsonObject, num_removed_user_recordsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&num_removed_user_records, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&num_removed_user_records);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *num_uploaded_user_recordsKey = "num_uploaded_user_records";
	node = json_object_get_member(pJsonObject, num_uploaded_user_recordsKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&num_uploaded_user_records, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&num_uploaded_user_records);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
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
	const gchar *updated_timeKey = "updated_time";
	node = json_object_get_member(pJsonObject, updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&updated_time, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&updated_time);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *exceptionsKey = "exceptions";
	node = json_object_get_member(pJsonObject, exceptionsKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&exceptions, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&exceptions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CustomerList::CustomerList(char* json)
{
	this->fromJson(json);
}

char*
CustomerList::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
	if (isprimitive("long long")) {
		long long obj = getCreatedTime();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getCreatedTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("long long")) {
		long long obj = getNumBatches();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getNumBatches());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *num_batchesKey = "num_batches";
	json_object_set_member(pJsonObject, num_batchesKey, node);
	if (isprimitive("long long")) {
		long long obj = getNumRemovedUserRecords();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getNumRemovedUserRecords());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *num_removed_user_recordsKey = "num_removed_user_records";
	json_object_set_member(pJsonObject, num_removed_user_recordsKey, node);
	if (isprimitive("long long")) {
		long long obj = getNumUploadedUserRecords();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getNumUploadedUserRecords());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *num_uploaded_user_recordsKey = "num_uploaded_user_records";
	json_object_set_member(pJsonObject, num_uploaded_user_recordsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("long long")) {
		long long obj = getUpdatedTime();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getUpdatedTime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *updated_timeKey = "updated_time";
	json_object_set_member(pJsonObject, updated_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getExceptions();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getExceptions());
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
CustomerList::getAdAccountId()
{
	return ad_account_id;
}

void
CustomerList::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

long long
CustomerList::getCreatedTime()
{
	return created_time;
}

void
CustomerList::setCreatedTime(long long  created_time)
{
	this->created_time = created_time;
}

std::string
CustomerList::getId()
{
	return id;
}

void
CustomerList::setId(std::string  id)
{
	this->id = id;
}

std::string
CustomerList::getName()
{
	return name;
}

void
CustomerList::setName(std::string  name)
{
	this->name = name;
}

long long
CustomerList::getNumBatches()
{
	return num_batches;
}

void
CustomerList::setNumBatches(long long  num_batches)
{
	this->num_batches = num_batches;
}

long long
CustomerList::getNumRemovedUserRecords()
{
	return num_removed_user_records;
}

void
CustomerList::setNumRemovedUserRecords(long long  num_removed_user_records)
{
	this->num_removed_user_records = num_removed_user_records;
}

long long
CustomerList::getNumUploadedUserRecords()
{
	return num_uploaded_user_records;
}

void
CustomerList::setNumUploadedUserRecords(long long  num_uploaded_user_records)
{
	this->num_uploaded_user_records = num_uploaded_user_records;
}

std::string
CustomerList::getStatus()
{
	return status;
}

void
CustomerList::setStatus(std::string  status)
{
	this->status = status;
}

std::string
CustomerList::getType()
{
	return type;
}

void
CustomerList::setType(std::string  type)
{
	this->type = type;
}

long long
CustomerList::getUpdatedTime()
{
	return updated_time;
}

void
CustomerList::setUpdatedTime(long long  updated_time)
{
	this->updated_time = updated_time;
}

std::string
CustomerList::getExceptions()
{
	return exceptions;
}

void
CustomerList::setExceptions(std::string  exceptions)
{
	this->exceptions = exceptions;
}


