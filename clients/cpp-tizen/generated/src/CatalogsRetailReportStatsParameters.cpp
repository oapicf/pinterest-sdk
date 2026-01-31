#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsRetailReportStatsParameters.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsRetailReportStatsParameters::CatalogsRetailReportStatsParameters()
{
	//__init();
}

CatalogsRetailReportStatsParameters::~CatalogsRetailReportStatsParameters()
{
	//__cleanup();
}

void
CatalogsRetailReportStatsParameters::__init()
{
	//catalog_type = std::string();
	//report = new CatalogsHotelReportStatsParameters_report();
}

void
CatalogsRetailReportStatsParameters::__cleanup()
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
CatalogsRetailReportStatsParameters::fromJson(char* jsonStr)
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
	

		if (isprimitive("CatalogsHotelReportStatsParameters_report")) {
			jsonToValue(&report, node, "CatalogsHotelReportStatsParameters_report", "CatalogsHotelReportStatsParameters_report");
		} else {
			
			CatalogsHotelReportStatsParameters_report* obj = static_cast<CatalogsHotelReportStatsParameters_report*> (&report);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsRetailReportStatsParameters::CatalogsRetailReportStatsParameters(char* json)
{
	this->fromJson(json);
}

char*
CatalogsRetailReportStatsParameters::toJson()
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
	if (isprimitive("CatalogsHotelReportStatsParameters_report")) {
		CatalogsHotelReportStatsParameters_report obj = getReport();
		node = converttoJson(&obj, "CatalogsHotelReportStatsParameters_report", "");
	}
	else {
		
		CatalogsHotelReportStatsParameters_report obj = static_cast<CatalogsHotelReportStatsParameters_report> (getReport());
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
CatalogsRetailReportStatsParameters::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailReportStatsParameters::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsHotelReportStatsParameters_report
CatalogsRetailReportStatsParameters::getReport()
{
	return report;
}

void
CatalogsRetailReportStatsParameters::setReport(CatalogsHotelReportStatsParameters_report  report)
{
	this->report = report;
}


