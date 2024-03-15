#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsFeedIngestionDetails.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsFeedIngestionDetails::CatalogsFeedIngestionDetails()
{
	//__init();
}

CatalogsFeedIngestionDetails::~CatalogsFeedIngestionDetails()
{
	//__cleanup();
}

void
CatalogsFeedIngestionDetails::__init()
{
	//errors = new CatalogsFeedIngestionErrors();
	//info = new CatalogsFeedIngestionInfo();
	//warnings = new CatalogsFeedIngestionWarnings();
}

void
CatalogsFeedIngestionDetails::__cleanup()
{
	//if(errors != NULL) {
	//
	//delete errors;
	//errors = NULL;
	//}
	//if(info != NULL) {
	//
	//delete info;
	//info = NULL;
	//}
	//if(warnings != NULL) {
	//
	//delete warnings;
	//warnings = NULL;
	//}
	//
}

void
CatalogsFeedIngestionDetails::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsFeedIngestionErrors")) {
			jsonToValue(&errors, node, "CatalogsFeedIngestionErrors", "CatalogsFeedIngestionErrors");
		} else {
			
			CatalogsFeedIngestionErrors* obj = static_cast<CatalogsFeedIngestionErrors*> (&errors);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *infoKey = "info";
	node = json_object_get_member(pJsonObject, infoKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsFeedIngestionInfo")) {
			jsonToValue(&info, node, "CatalogsFeedIngestionInfo", "CatalogsFeedIngestionInfo");
		} else {
			
			CatalogsFeedIngestionInfo* obj = static_cast<CatalogsFeedIngestionInfo*> (&info);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *warningsKey = "warnings";
	node = json_object_get_member(pJsonObject, warningsKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsFeedIngestionWarnings")) {
			jsonToValue(&warnings, node, "CatalogsFeedIngestionWarnings", "CatalogsFeedIngestionWarnings");
		} else {
			
			CatalogsFeedIngestionWarnings* obj = static_cast<CatalogsFeedIngestionWarnings*> (&warnings);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsFeedIngestionDetails::CatalogsFeedIngestionDetails(char* json)
{
	this->fromJson(json);
}

char*
CatalogsFeedIngestionDetails::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsFeedIngestionErrors")) {
		CatalogsFeedIngestionErrors obj = getErrors();
		node = converttoJson(&obj, "CatalogsFeedIngestionErrors", "");
	}
	else {
		
		CatalogsFeedIngestionErrors obj = static_cast<CatalogsFeedIngestionErrors> (getErrors());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	if (isprimitive("CatalogsFeedIngestionInfo")) {
		CatalogsFeedIngestionInfo obj = getInfo();
		node = converttoJson(&obj, "CatalogsFeedIngestionInfo", "");
	}
	else {
		
		CatalogsFeedIngestionInfo obj = static_cast<CatalogsFeedIngestionInfo> (getInfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *infoKey = "info";
	json_object_set_member(pJsonObject, infoKey, node);
	if (isprimitive("CatalogsFeedIngestionWarnings")) {
		CatalogsFeedIngestionWarnings obj = getWarnings();
		node = converttoJson(&obj, "CatalogsFeedIngestionWarnings", "");
	}
	else {
		
		CatalogsFeedIngestionWarnings obj = static_cast<CatalogsFeedIngestionWarnings> (getWarnings());
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

CatalogsFeedIngestionErrors
CatalogsFeedIngestionDetails::getErrors()
{
	return errors;
}

void
CatalogsFeedIngestionDetails::setErrors(CatalogsFeedIngestionErrors  errors)
{
	this->errors = errors;
}

CatalogsFeedIngestionInfo
CatalogsFeedIngestionDetails::getInfo()
{
	return info;
}

void
CatalogsFeedIngestionDetails::setInfo(CatalogsFeedIngestionInfo  info)
{
	this->info = info;
}

CatalogsFeedIngestionWarnings
CatalogsFeedIngestionDetails::getWarnings()
{
	return warnings;
}

void
CatalogsFeedIngestionDetails::setWarnings(CatalogsFeedIngestionWarnings  warnings)
{
	this->warnings = warnings;
}


