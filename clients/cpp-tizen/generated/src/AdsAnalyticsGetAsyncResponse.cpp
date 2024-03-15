#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdsAnalyticsGetAsyncResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdsAnalyticsGetAsyncResponse::AdsAnalyticsGetAsyncResponse()
{
	//__init();
}

AdsAnalyticsGetAsyncResponse::~AdsAnalyticsGetAsyncResponse()
{
	//__cleanup();
}

void
AdsAnalyticsGetAsyncResponse::__init()
{
	//report_status = std::string();
	//url = std::string();
	//size = double(0);
}

void
AdsAnalyticsGetAsyncResponse::__cleanup()
{
	//if(report_status != NULL) {
	//
	//delete report_status;
	//report_status = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//if(size != NULL) {
	//
	//delete size;
	//size = NULL;
	//}
	//
}

void
AdsAnalyticsGetAsyncResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *report_statusKey = "report_status";
	node = json_object_get_member(pJsonObject, report_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("BulkReportingJobStatus")) {
			jsonToValue(&report_status, node, "BulkReportingJobStatus", "BulkReportingJobStatus");
		} else {
			
			BulkReportingJobStatus* obj = static_cast<BulkReportingJobStatus*> (&report_status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sizeKey = "size";
	node = json_object_get_member(pJsonObject, sizeKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&size, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&size);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdsAnalyticsGetAsyncResponse::AdsAnalyticsGetAsyncResponse(char* json)
{
	this->fromJson(json);
}

char*
AdsAnalyticsGetAsyncResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("BulkReportingJobStatus")) {
		BulkReportingJobStatus obj = getReportStatus();
		node = converttoJson(&obj, "BulkReportingJobStatus", "");
	}
	else {
		
		BulkReportingJobStatus obj = static_cast<BulkReportingJobStatus> (getReportStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *report_statusKey = "report_status";
	json_object_set_member(pJsonObject, report_statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	if (isprimitive("long long")) {
		long long obj = getSize();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getSize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sizeKey = "size";
	json_object_set_member(pJsonObject, sizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

BulkReportingJobStatus
AdsAnalyticsGetAsyncResponse::getReportStatus()
{
	return report_status;
}

void
AdsAnalyticsGetAsyncResponse::setReportStatus(BulkReportingJobStatus  report_status)
{
	this->report_status = report_status;
}

std::string
AdsAnalyticsGetAsyncResponse::getUrl()
{
	return url;
}

void
AdsAnalyticsGetAsyncResponse::setUrl(std::string  url)
{
	this->url = url;
}

long long
AdsAnalyticsGetAsyncResponse::getSize()
{
	return size;
}

void
AdsAnalyticsGetAsyncResponse::setSize(long long  size)
{
	this->size = size;
}


