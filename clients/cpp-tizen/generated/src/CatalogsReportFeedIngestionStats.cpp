#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsReportFeedIngestionStats.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsReportFeedIngestionStats::CatalogsReportFeedIngestionStats()
{
	//__init();
}

CatalogsReportFeedIngestionStats::~CatalogsReportFeedIngestionStats()
{
	//__cleanup();
}

void
CatalogsReportFeedIngestionStats::__init()
{
	//report_type = std::string();
	//catalog_id = std::string();
	//code = int(0);
	//code_label = std::string();
	//message = std::string();
	//occurrences = int(0);
	//severity = std::string();
}

void
CatalogsReportFeedIngestionStats::__cleanup()
{
	//if(report_type != NULL) {
	//
	//delete report_type;
	//report_type = NULL;
	//}
	//if(catalog_id != NULL) {
	//
	//delete catalog_id;
	//catalog_id = NULL;
	//}
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//if(code_label != NULL) {
	//
	//delete code_label;
	//code_label = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//if(occurrences != NULL) {
	//
	//delete occurrences;
	//occurrences = NULL;
	//}
	//if(severity != NULL) {
	//
	//delete severity;
	//severity = NULL;
	//}
	//
}

void
CatalogsReportFeedIngestionStats::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *report_typeKey = "report_type";
	node = json_object_get_member(pJsonObject, report_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&report_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *catalog_idKey = "catalog_id";
	node = json_object_get_member(pJsonObject, catalog_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&code, node, "int", "");
		} else {
			
		}
	}
	const gchar *code_labelKey = "code_label";
	node = json_object_get_member(pJsonObject, code_labelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&code_label, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *occurrencesKey = "occurrences";
	node = json_object_get_member(pJsonObject, occurrencesKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&occurrences, node, "int", "");
		} else {
			
		}
	}
	const gchar *severityKey = "severity";
	node = json_object_get_member(pJsonObject, severityKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&severity, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsReportFeedIngestionStats::CatalogsReportFeedIngestionStats(char* json)
{
	this->fromJson(json);
}

char*
CatalogsReportFeedIngestionStats::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getReportType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *report_typeKey = "report_type";
	json_object_set_member(pJsonObject, report_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCatalogId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_idKey = "catalog_id";
	json_object_set_member(pJsonObject, catalog_idKey, node);
	if (isprimitive("int")) {
		int obj = getCode();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCodeLabel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *code_labelKey = "code_label";
	json_object_set_member(pJsonObject, code_labelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	if (isprimitive("int")) {
		int obj = getOccurrences();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *occurrencesKey = "occurrences";
	json_object_set_member(pJsonObject, occurrencesKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSeverity();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *severityKey = "severity";
	json_object_set_member(pJsonObject, severityKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsReportFeedIngestionStats::getReportType()
{
	return report_type;
}

void
CatalogsReportFeedIngestionStats::setReportType(std::string  report_type)
{
	this->report_type = report_type;
}

std::string
CatalogsReportFeedIngestionStats::getCatalogId()
{
	return catalog_id;
}

void
CatalogsReportFeedIngestionStats::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}

int
CatalogsReportFeedIngestionStats::getCode()
{
	return code;
}

void
CatalogsReportFeedIngestionStats::setCode(int  code)
{
	this->code = code;
}

std::string
CatalogsReportFeedIngestionStats::getCodeLabel()
{
	return code_label;
}

void
CatalogsReportFeedIngestionStats::setCodeLabel(std::string  code_label)
{
	this->code_label = code_label;
}

std::string
CatalogsReportFeedIngestionStats::getMessage()
{
	return message;
}

void
CatalogsReportFeedIngestionStats::setMessage(std::string  message)
{
	this->message = message;
}

int
CatalogsReportFeedIngestionStats::getOccurrences()
{
	return occurrences;
}

void
CatalogsReportFeedIngestionStats::setOccurrences(int  occurrences)
{
	this->occurrences = occurrences;
}

std::string
CatalogsReportFeedIngestionStats::getSeverity()
{
	return severity;
}

void
CatalogsReportFeedIngestionStats::setSeverity(std::string  severity)
{
	this->severity = severity;
}


