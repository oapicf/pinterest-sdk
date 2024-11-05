#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsReportDistributionIssueFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsReportDistributionIssueFilter::CatalogsReportDistributionIssueFilter()
{
	//__init();
}

CatalogsReportDistributionIssueFilter::~CatalogsReportDistributionIssueFilter()
{
	//__cleanup();
}

void
CatalogsReportDistributionIssueFilter::__init()
{
	//report_type = std::string();
	//catalog_id = std::string();
}

void
CatalogsReportDistributionIssueFilter::__cleanup()
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
	//
}

void
CatalogsReportDistributionIssueFilter::fromJson(char* jsonStr)
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
}

CatalogsReportDistributionIssueFilter::CatalogsReportDistributionIssueFilter(char* json)
{
	this->fromJson(json);
}

char*
CatalogsReportDistributionIssueFilter::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CatalogsReportDistributionIssueFilter::getReportType()
{
	return report_type;
}

void
CatalogsReportDistributionIssueFilter::setReportType(std::string  report_type)
{
	this->report_type = report_type;
}

std::string
CatalogsReportDistributionIssueFilter::getCatalogId()
{
	return catalog_id;
}

void
CatalogsReportDistributionIssueFilter::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}


