#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsHotelReportStatsParameters_report.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsHotelReportStatsParameters_report::CatalogsHotelReportStatsParameters_report()
{
	//__init();
}

CatalogsHotelReportStatsParameters_report::~CatalogsHotelReportStatsParameters_report()
{
	//__cleanup();
}

void
CatalogsHotelReportStatsParameters_report::__init()
{
	//report_type = std::string();
	//feed_id = std::string();
	//processing_result_id = std::string();
	//catalog_id = std::string();
}

void
CatalogsHotelReportStatsParameters_report::__cleanup()
{
	//if(report_type != NULL) {
	//
	//delete report_type;
	//report_type = NULL;
	//}
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
	//if(catalog_id != NULL) {
	//
	//delete catalog_id;
	//catalog_id = NULL;
	//}
	//
}

void
CatalogsHotelReportStatsParameters_report::fromJson(char* jsonStr)
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
	const gchar *catalog_idKey = "catalog_id";
	node = json_object_get_member(pJsonObject, catalog_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&catalog_id, node, "std::string", "");
		} else {
			
		}
	}
}

CatalogsHotelReportStatsParameters_report::CatalogsHotelReportStatsParameters_report(char* json)
{
	this->fromJson(json);
}

char*
CatalogsHotelReportStatsParameters_report::toJson()
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
CatalogsHotelReportStatsParameters_report::getReportType()
{
	return report_type;
}

void
CatalogsHotelReportStatsParameters_report::setReportType(std::string  report_type)
{
	this->report_type = report_type;
}

std::string
CatalogsHotelReportStatsParameters_report::getFeedId()
{
	return feed_id;
}

void
CatalogsHotelReportStatsParameters_report::setFeedId(std::string  feed_id)
{
	this->feed_id = feed_id;
}

std::string
CatalogsHotelReportStatsParameters_report::getProcessingResultId()
{
	return processing_result_id;
}

void
CatalogsHotelReportStatsParameters_report::setProcessingResultId(std::string  processing_result_id)
{
	this->processing_result_id = processing_result_id;
}

std::string
CatalogsHotelReportStatsParameters_report::getCatalogId()
{
	return catalog_id;
}

void
CatalogsHotelReportStatsParameters_report::setCatalogId(std::string  catalog_id)
{
	this->catalog_id = catalog_id;
}


