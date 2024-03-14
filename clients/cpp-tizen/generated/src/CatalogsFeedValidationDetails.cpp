#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsFeedValidationDetails.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsFeedValidationDetails::CatalogsFeedValidationDetails()
{
	//__init();
}

CatalogsFeedValidationDetails::~CatalogsFeedValidationDetails()
{
	//__cleanup();
}

void
CatalogsFeedValidationDetails::__init()
{
	//errors = new CatalogsFeedValidationErrors();
	//warnings = new CatalogsFeedValidationWarnings();
}

void
CatalogsFeedValidationDetails::__cleanup()
{
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
CatalogsFeedValidationDetails::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsFeedValidationErrors")) {
			jsonToValue(&errors, node, "CatalogsFeedValidationErrors", "CatalogsFeedValidationErrors");
		} else {
			
			CatalogsFeedValidationErrors* obj = static_cast<CatalogsFeedValidationErrors*> (&errors);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *warningsKey = "warnings";
	node = json_object_get_member(pJsonObject, warningsKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsFeedValidationWarnings")) {
			jsonToValue(&warnings, node, "CatalogsFeedValidationWarnings", "CatalogsFeedValidationWarnings");
		} else {
			
			CatalogsFeedValidationWarnings* obj = static_cast<CatalogsFeedValidationWarnings*> (&warnings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsFeedValidationDetails::CatalogsFeedValidationDetails(char* json)
{
	this->fromJson(json);
}

char*
CatalogsFeedValidationDetails::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsFeedValidationErrors")) {
		CatalogsFeedValidationErrors obj = getErrors();
		node = converttoJson(&obj, "CatalogsFeedValidationErrors", "");
	}
	else {
		
		CatalogsFeedValidationErrors obj = static_cast<CatalogsFeedValidationErrors> (getErrors());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	if (isprimitive("CatalogsFeedValidationWarnings")) {
		CatalogsFeedValidationWarnings obj = getWarnings();
		node = converttoJson(&obj, "CatalogsFeedValidationWarnings", "");
	}
	else {
		
		CatalogsFeedValidationWarnings obj = static_cast<CatalogsFeedValidationWarnings> (getWarnings());
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

CatalogsFeedValidationErrors
CatalogsFeedValidationDetails::getErrors()
{
	return errors;
}

void
CatalogsFeedValidationDetails::setErrors(CatalogsFeedValidationErrors  errors)
{
	this->errors = errors;
}

CatalogsFeedValidationWarnings
CatalogsFeedValidationDetails::getWarnings()
{
	return warnings;
}

void
CatalogsFeedValidationDetails::setWarnings(CatalogsFeedValidationWarnings  warnings)
{
	this->warnings = warnings;
}


