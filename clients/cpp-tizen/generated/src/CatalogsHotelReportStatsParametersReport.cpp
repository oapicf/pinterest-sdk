#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsHotelReportStatsParametersReport.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsHotelReportStatsParametersReport::CatalogsHotelReportStatsParametersReport()
{
	//__init();
}

CatalogsHotelReportStatsParametersReport::~CatalogsHotelReportStatsParametersReport()
{
	//__cleanup();
}

void
CatalogsHotelReportStatsParametersReport::__init()
{
	//feed_id = std::string();
	//processing_result_id = std::string();
	//report_type = std::string();
	//catalog_id = std::string();
}

void
CatalogsHotelReportStatsParametersReport::__cleanup()
{
	//if(feed_id != NULL) {
	//
	//delete feed_id;
	//feed_id = NULL;
	//}
	//if(processing_result_id != NULL) {
	//
	//delete processing_result_id;
	//processing_result_id = NULL;
	//}
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
CatalogsHotelReportStatsParametersReport::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *feed_idKey = "feed_id";
	node = json_object_get_member(pJsonObject, feed_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&feed_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *processing_result_idKey = "processing_result_id";
	node = json_object_get_member(pJsonObject, processing_result_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&processing_result_id, node, "std::string", "");
		} else {
			
		}
	}
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

CatalogsHotelReportStatsParametersReport::CatalogsHotelReportStatsParametersReport(char* json)
{
	this->fromJson(json);
}

char*
CatalogsHotelReportStatsParametersReport::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getFeedId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *feed_idKey = "feed_id";
	json_object_set_member(pJsonObject, feed_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProcessingResultId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *processing_result_idKey = "processing_result_id";
	json_object_set_member(pJsonObject, processing_result_idKey, node);
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
CatalogsHotelReportStatsParametersReport::getFeedId()
{
	return feed_id;
}

void
CatalogsHotelReportStatsParametersReport::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}

std::string
CatalogsHotelReportStatsParametersReport::getProcessingResultId()
{
	return processing_result_id;
}

void
CatalogsHotelReportStatsParametersReport::setProcessingResultId(std::string  processing_result_id)
{
	this->processing_result_id = processing_result_id;
}

std::string
CatalogsHotelReportStatsParametersReport::getReportType()
{
	return report_type;
}

void
CatalogsHotelReportStatsParametersReport::setReportType(std::string  report_type)
{
	this->report_type = report_type;
}

std::string
CatalogsHotelReportStatsParametersReport::getCatalogId()
{
	return catalog_id;
}

void
CatalogsHotelReportStatsParametersReport::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}


