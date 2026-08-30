#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DynamicTitlesProcessCSVError.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DynamicTitlesProcessCSVError::DynamicTitlesProcessCSVError()
{
	//__init();
}

DynamicTitlesProcessCSVError::~DynamicTitlesProcessCSVError()
{
	//__cleanup();
}

void
DynamicTitlesProcessCSVError::__init()
{
	//error_type = std::string();
	//row_number = int(0);
}

void
DynamicTitlesProcessCSVError::__cleanup()
{
	//if(error_type != NULL) {
	//
	//delete error_type;
	//error_type = NULL;
	//}
	//if(row_number != NULL) {
	//
	//delete row_number;
	//row_number = NULL;
	//}
	//
}

void
DynamicTitlesProcessCSVError::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *error_typeKey = "error_type";
	node = json_object_get_member(pJsonObject, error_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&error_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *row_numberKey = "row_number";
	node = json_object_get_member(pJsonObject, row_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&row_number, node, "int", "");
		} else {
			
		}
	}
}

DynamicTitlesProcessCSVError::DynamicTitlesProcessCSVError(char* json)
{
	this->fromJson(json);
}

char*
DynamicTitlesProcessCSVError::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getErrorType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *error_typeKey = "error_type";
	json_object_set_member(pJsonObject, error_typeKey, node);
	if (isprimitive("int")) {
		int obj = getRowNumber();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *row_numberKey = "row_number";
	json_object_set_member(pJsonObject, row_numberKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
DynamicTitlesProcessCSVError::getErrorType()
{
	return error_type;
}

void
DynamicTitlesProcessCSVError::setErrorType(std::string  error_type)
{
	this->error_type = error_type;
}

int
DynamicTitlesProcessCSVError::getRowNumber()
{
	return row_number;
}

void
DynamicTitlesProcessCSVError::setRowNumber(int  row_number)
{
	this->row_number = row_number;
}


