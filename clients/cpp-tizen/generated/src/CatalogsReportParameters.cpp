#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsReportParameters.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsReportParameters::CatalogsReportParameters()
{
	//__init();
}

CatalogsReportParameters::~CatalogsReportParameters()
{
	//__cleanup();
}

void
CatalogsReportParameters::__init()
{
	//catalog_type = new CatalogsType();
	//report = new CatalogsHotelReportParameters_report();
}

void
CatalogsReportParameters::__cleanup()
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
CatalogsReportParameters::fromJson(char* jsonStr)
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
	

		if (isprimitive("CatalogsHotelReportParameters_report")) {
			jsonToValue(&report, node, "CatalogsHotelReportParameters_report", "CatalogsHotelReportParameters_report");
		} else {
			
			CatalogsHotelReportParameters_report* obj = static_cast<CatalogsHotelReportParameters_report*> (&report);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CatalogsReportParameters::CatalogsReportParameters(char* json)
{
	this->fromJson(json);
}

char*
CatalogsReportParameters::toJson()
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

CatalogsType
CatalogsReportParameters::getCatalogType()
{
	return catalog_type;
}

void
CatalogsReportParameters::setCatalogType(CatalogsType  catalog_type)
{
	this->catalog_type = catalog_type;
}

CatalogsHotelReportParameters_report
CatalogsReportParameters::getReport()
{
	return report;
}

void
CatalogsReportParameters::setReport(CatalogsHotelReportParameters_report  report)
{
	this->report = report;
}


