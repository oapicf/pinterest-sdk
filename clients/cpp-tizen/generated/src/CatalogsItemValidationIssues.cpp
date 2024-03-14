#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsItemValidationIssues.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsItemValidationIssues::CatalogsItemValidationIssues()
{
	//__init();
}

CatalogsItemValidationIssues::~CatalogsItemValidationIssues()
{
	//__cleanup();
}

void
CatalogsItemValidationIssues::__init()
{
	//item_number = int(0);
	//item_id = std::string();
	//errors = new CatalogsItemValidationErrors();
	//warnings = new CatalogsItemValidationWarnings();
}

void
CatalogsItemValidationIssues::__cleanup()
{
	//if(item_number != NULL) {
	//
	//delete item_number;
	//item_number = NULL;
	//}
	//if(item_id != NULL) {
	//
	//delete item_id;
	//item_id = NULL;
	//}
	//if(errors != NULL) {
	//
	//delete errors;
	//errors = NULL;
	//}
	//if(warnings != NULL) {
	//
	//delete warnings;
	//warnings = NULL;
	//}
	//
}

void
CatalogsItemValidationIssues::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *item_numberKey = "item_number";
	node = json_object_get_member(pJsonObject, item_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&item_number, node, "int", "");
		} else {
			
		}
	}
	const gchar *item_idKey = "item_id";
	node = json_object_get_member(pJsonObject, item_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&item_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationErrors")) {
			jsonToValue(&errors, node, "CatalogsItemValidationErrors", "CatalogsItemValidationErrors");
		} else {
			
			CatalogsItemValidationErrors* obj = static_cast<CatalogsItemValidationErrors*> (&errors);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *warningsKey = "warnings";
	node = json_object_get_member(pJsonObject, warningsKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsItemValidationWarnings")) {
			jsonToValue(&warnings, node, "CatalogsItemValidationWarnings", "CatalogsItemValidationWarnings");
		} else {
			
			CatalogsItemValidationWarnings* obj = static_cast<CatalogsItemValidationWarnings*> (&warnings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsItemValidationIssues::CatalogsItemValidationIssues(char* json)
{
	this->fromJson(json);
}

char*
CatalogsItemValidationIssues::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getItemNumber();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *item_numberKey = "item_number";
	json_object_set_member(pJsonObject, item_numberKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getItemId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *item_idKey = "item_id";
	json_object_set_member(pJsonObject, item_idKey, node);
	if (isprimitive("CatalogsItemValidationErrors")) {
		CatalogsItemValidationErrors obj = getErrors();
		node = converttoJson(&obj, "CatalogsItemValidationErrors", "");
	}
	else {
		
		CatalogsItemValidationErrors obj = static_cast<CatalogsItemValidationErrors> (getErrors());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	if (isprimitive("CatalogsItemValidationWarnings")) {
		CatalogsItemValidationWarnings obj = getWarnings();
		node = converttoJson(&obj, "CatalogsItemValidationWarnings", "");
	}
	else {
		
		CatalogsItemValidationWarnings obj = static_cast<CatalogsItemValidationWarnings> (getWarnings());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *warningsKey = "warnings";
	json_object_set_member(pJsonObject, warningsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CatalogsItemValidationIssues::getItemNumber()
{
	return item_number;
}

void
CatalogsItemValidationIssues::setItemNumber(int  item_number)
{
	this->item_number = item_number;
}

std::string
CatalogsItemValidationIssues::getItemId()
{
	return item_id;
}

void
CatalogsItemValidationIssues::setItemId(std::string  item_id)
{
	this->item_id = item_id;
}

CatalogsItemValidationErrors
CatalogsItemValidationIssues::getErrors()
{
	return errors;
}

void
CatalogsItemValidationIssues::setErrors(CatalogsItemValidationErrors  errors)
{
	this->errors = errors;
}

CatalogsItemValidationWarnings
CatalogsItemValidationIssues::getWarnings()
{
	return warnings;
}

void
CatalogsItemValidationIssues::setWarnings(CatalogsItemValidationWarnings  warnings)
{
	this->warnings = warnings;
}


