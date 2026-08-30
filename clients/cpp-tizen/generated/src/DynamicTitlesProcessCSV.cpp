#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DynamicTitlesProcessCSV.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DynamicTitlesProcessCSV::DynamicTitlesProcessCSV()
{
	//__init();
}

DynamicTitlesProcessCSV::~DynamicTitlesProcessCSV()
{
	//__cleanup();
}

void
DynamicTitlesProcessCSV::__init()
{
	//new std::list()std::list> errors;
	//status = std::string();
}

void
DynamicTitlesProcessCSV::__cleanup()
{
	//if(errors != NULL) {
	//errors.RemoveAll(true);
	//delete errors;
	//errors = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//
}

void
DynamicTitlesProcessCSV::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<DynamicTitlesProcessCSVError> new_list;
			DynamicTitlesProcessCSVError inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("DynamicTitlesProcessCSVError")) {
					jsonToValue(&inst, temp_json, "DynamicTitlesProcessCSVError", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			errors = new_list;
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

DynamicTitlesProcessCSV::DynamicTitlesProcessCSV(char* json)
{
	this->fromJson(json);
}

char*
DynamicTitlesProcessCSV::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("DynamicTitlesProcessCSVError")) {
		list<DynamicTitlesProcessCSVError> new_list = static_cast<list <DynamicTitlesProcessCSVError> > (getErrors());
		node = converttoJson(&new_list, "DynamicTitlesProcessCSVError", "array");
	} else {
		node = json_node_alloc();
		list<DynamicTitlesProcessCSVError> new_list = static_cast<list <DynamicTitlesProcessCSVError> > (getErrors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<DynamicTitlesProcessCSVError>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			DynamicTitlesProcessCSVError obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
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

std::list<DynamicTitlesProcessCSVError>
DynamicTitlesProcessCSV::getErrors()
{
	return errors;
}

void
DynamicTitlesProcessCSV::setErrors(std::list <DynamicTitlesProcessCSVError> errors)
{
	this->errors = errors;
}

std::string
DynamicTitlesProcessCSV::getStatus()
{
	return status;
}

void
DynamicTitlesProcessCSV::setStatus(std::string  status)
{
	this->status = status;
}


