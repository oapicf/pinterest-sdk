#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsRetailReportParameters.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsRetailReportParameters::CatalogsRetailReportParameters()
{
	//__init();
}

CatalogsRetailReportParameters::~CatalogsRetailReportParameters()
{
	//__cleanup();
}

void
CatalogsRetailReportParameters::__init()
{
	//catalog_type = std::string();
	//report = new CatalogsHotelReportParameters_report();
}

void
CatalogsRetailReportParameters::__cleanup()
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
CatalogsRetailReportParameters::fromJson(char* jsonStr)
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
	

		if (isprimitive("CatalogsHotelReportParameters_report")) {
			jsonToValue(&report, node, "CatalogsHotelReportParameters_report", "CatalogsHotelReportParameters_report");
		} else {
			
			CatalogsHotelReportParameters_report* obj = static_cast<CatalogsHotelReportParameters_report*> (&report);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsRetailReportParameters::CatalogsRetailReportParameters(char* json)
{
	this->fromJson(json);
}

char*
CatalogsRetailReportParameters::toJson()
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
	if (isprimitive("CatalogsHotelReportParameters_report")) {
		CatalogsHotelReportParameters_report obj = getReport();
		node = converttoJson(&obj, "CatalogsHotelReportParameters_report", "");
	}
	else {
		
		CatalogsHotelReportParameters_report obj = static_cast<CatalogsHotelReportParameters_report> (getReport());
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
CatalogsRetailReportParameters::getCatalogType()
{
	return catalog_type;
}

void
CatalogsRetailReportParameters::setCatalogType(std::string  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsHotelReportParameters_report
CatalogsRetailReportParameters::getReport()
{
	return report;
}

void
CatalogsRetailReportParameters::setReport(CatalogsHotelReportParameters_report  report)
{
	this->report = report;
}


