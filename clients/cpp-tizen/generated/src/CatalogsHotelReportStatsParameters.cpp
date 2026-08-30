#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsHotelReportStatsParameters.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsHotelReportStatsParameters::CatalogsHotelReportStatsParameters()
{
	//__init();
}

CatalogsHotelReportStatsParameters::~CatalogsHotelReportStatsParameters()
{
	//__cleanup();
}

void
CatalogsHotelReportStatsParameters::__init()
{
	//catalog_type = std::string();
	//report = new CatalogsHotelReportStatsParametersReport();
}

void
CatalogsHotelReportStatsParameters::__cleanup()
{
	//if(catalog_type != NULL) {
	//
	//delete catalog_type;
	//catalog_type = NULL;
	//}
	//if(report != NULL) {
	//
	//delete report;
	//report = NULL;
	//}
	//
}

void
CatalogsHotelReportStatsParameters::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *catalog_typeKey = "catalog_type";
	node = json_object_get_member(pJsonObject, catalog_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *reportKey = "report";
	node = json_object_get_member(pJsonObject, reportKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsHotelReportStatsParametersReport")) {
			jsonToValue(&report, node, "CatalogsHotelReportStatsParametersReport", "CatalogsHotelReportStatsParametersReport");
		} else {
			
			CatalogsHotelReportStatsParametersReport* obj = static_cast<CatalogsHotelReportStatsParametersReport*> (&report);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsHotelReportStatsParameters::CatalogsHotelReportStatsParameters(char* json)
{
	this->fromJson(json);
}

char*
CatalogsHotelReportStatsParameters::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCatalogType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *catalog_typeKey = "catalog_type";
	json_object_set_member(pJsonObject, catalog_typeKey, node);
	if (isprimitive("CatalogsHotelReportStatsParametersReport")) {
		CatalogsHotelReportStatsParametersReport obj = getReport();
		node = converttoJson(&obj, "CatalogsHotelReportStatsParametersReport", "");
	}
	else {
		
		CatalogsHotelReportStatsParametersReport obj = static_cast<CatalogsHotelReportStatsParametersReport> (getReport());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reportKey = "report";
	json_object_set_member(pJsonObject, reportKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsHotelReportStatsParameters::getCatalogType()
{
	return catalog_type;
}

void
CatalogsHotelReportStatsParameters::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsHotelReportStatsParametersReport
CatalogsHotelReportStatsParameters::getReport()
{
	return report;
}

void
CatalogsHotelReportStatsParameters::setReport(CatalogsHotelReportStatsParametersReport  report)
{
	this->report = report;
}


