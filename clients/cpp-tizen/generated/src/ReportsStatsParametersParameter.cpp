#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Reports_stats_parameters_parameter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Reports_stats_parameters_parameter::Reports_stats_parameters_parameter()
{
	//__init();
}

Reports_stats_parameters_parameter::~Reports_stats_parameters_parameter()
{
	//__cleanup();
}

void
Reports_stats_parameters_parameter::__init()
{
	//catalog_type = new CatalogsType();
	//report = new CatalogsHotelReportStatsParameters_report();
}

void
Reports_stats_parameters_parameter::__cleanup()
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
Reports_stats_parameters_parameter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *catalog_typeKey = "catalog_type";
	node = json_object_get_member(pJsonObject, catalog_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CatalogsType")) {
			jsonToValue(&catalog_type, node, "CatalogsType", "CatalogsType");
		} else {
			
			CatalogsType* obj = static_cast<CatalogsType*> (&catalog_type);
			obj->fromJson(json_to_string(node, false));
			
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

Reports_stats_parameters_parameter::Reports_stats_parameters_parameter(char* json)
{
	this->fromJson(json);
}

char*
Reports_stats_parameters_parameter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CatalogsType")) {
		CatalogsType obj = getCatalogType();
		node = converttoJson(&obj, "CatalogsType", "");
	}
	else {
		
		CatalogsType obj = static_cast<CatalogsType> (getCatalogType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
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

CatalogsType
Reports_stats_parameters_parameter::getCatalogType()
{
	return catalog_type;
}

void
Reports_stats_parameters_parameter::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsHotelReportStatsParameters_report
Reports_stats_parameters_parameter::getReport()
{
	return report;
}

void
Reports_stats_parameters_parameter::setReport(CatalogsHotelReportStatsParameters_report  report)
{
	this->report = report;
}


