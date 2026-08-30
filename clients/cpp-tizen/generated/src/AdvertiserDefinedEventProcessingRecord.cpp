#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdvertiserDefinedEventProcessingRecord.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdvertiserDefinedEventProcessingRecord::AdvertiserDefinedEventProcessingRecord()
{
	//__init();
}

AdvertiserDefinedEventProcessingRecord::~AdvertiserDefinedEventProcessingRecord()
{
	//__cleanup();
}

void
AdvertiserDefinedEventProcessingRecord::__init()
{
	//new std::list()std::list> exceptions;
	//name = std::string();
	//status = std::string();
}

void
AdvertiserDefinedEventProcessingRecord::__cleanup()
{
	//if(exceptions != NULL) {
	//exceptions.RemoveAll(true);
	//delete exceptions;
	//exceptions = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
AdvertiserDefinedEventProcessingRecord::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *exceptionsKey = "exceptions";
	node = json_object_get_member(pJsonObject, exceptionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			exceptions = new_list;
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
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&status, node, "std::string", "");
		} else {
			
		}
	}
}

AdvertiserDefinedEventProcessingRecord::AdvertiserDefinedEventProcessingRecord(char* json)
{
	this->fromJson(json);
}

char*
AdvertiserDefinedEventProcessingRecord::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getExceptions());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getExceptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *exceptionsKey = "exceptions";
	json_object_set_member(pJsonObject, exceptionsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
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

std::list<std::string>
AdvertiserDefinedEventProcessingRecord::getExceptions()
{
	return exceptions;
}

void
AdvertiserDefinedEventProcessingRecord::setExceptions(std::list <std::string> exceptions)
{
	this->exceptions = exceptions;
}

std::string
AdvertiserDefinedEventProcessingRecord::getName()
{
	return name;
}

void
AdvertiserDefinedEventProcessingRecord::setName(std::string  name)
{
	this->name = name;
}

std::string
AdvertiserDefinedEventProcessingRecord::getStatus()
{
	return status;
}

void
AdvertiserDefinedEventProcessingRecord::setStatus(std::string  status)
{
	this->status = status;
}


