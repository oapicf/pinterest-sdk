#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CatalogsReport.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CatalogsReport::CatalogsReport()
{
	//__init();
}

CatalogsReport::~CatalogsReport()
{
	//__cleanup();
}

void
CatalogsReport::__init()
{
	//report_status = std::string();
	//url = std::string();
	//size = double(0);
}

void
CatalogsReport::__cleanup()
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
CatalogsReport::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *report_statusKey = "report_status";
	node = json_object_get_member(pJsonObject, report_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&report_status, node, "std::string", "");
		} else {
			
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

CatalogsReport::CatalogsReport(char* json)
{
	this->fromJson(json);
}

char*
CatalogsReport::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getReportStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
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

std::string
CatalogsReport::getReportStatus()
{
	return report_status;
}

void
CatalogsReport::setReportStatus(std::string  report_status)
{
	this->report_status = report_status;
}

std::string
CatalogsReport::getUrl()
{
	return url;
}

void
CatalogsReport::setUrl(std::string  url)
{
	this->url = url;
}

long long
CatalogsReport::getSize()
{
	return size;
}

void
CatalogsReport::setSize(long long  size)
{
	this->size = size;
}


