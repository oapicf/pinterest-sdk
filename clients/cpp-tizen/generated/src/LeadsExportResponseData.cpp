#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LeadsExportResponseData.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LeadsExportResponseData::LeadsExportResponseData()
{
	//__init();
}

LeadsExportResponseData::~LeadsExportResponseData()
{
	//__cleanup();
}

void
LeadsExportResponseData::__init()
{
	//download_url = std::string();
	//export_status = new LeadsExportStatus();
}

void
LeadsExportResponseData::__cleanup()
{
	//if(download_url != NULL) {
	//
	//delete download_url;
	//download_url = NULL;
	//}
	//if(export_status != NULL) {
	//
	//delete export_status;
	//export_status = NULL;
	//}
	//
}

void
LeadsExportResponseData::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *download_urlKey = "download_url";
	node = json_object_get_member(pJsonObject, download_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&download_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *export_statusKey = "export_status";
	node = json_object_get_member(pJsonObject, export_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("LeadsExportStatus")) {
			jsonToValue(&export_status, node, "LeadsExportStatus", "LeadsExportStatus");
		} else {
			
			LeadsExportStatus* obj = static_cast<LeadsExportStatus*> (&export_status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

LeadsExportResponseData::LeadsExportResponseData(char* json)
{
	this->fromJson(json);
}

char*
LeadsExportResponseData::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDownloadUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *download_urlKey = "download_url";
	json_object_set_member(pJsonObject, download_urlKey, node);
	if (isprimitive("LeadsExportStatus")) {
		LeadsExportStatus obj = getExportStatus();
		node = converttoJson(&obj, "LeadsExportStatus", "");
	}
	else {
		
		LeadsExportStatus obj = static_cast<LeadsExportStatus> (getExportStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *export_statusKey = "export_status";
	json_object_set_member(pJsonObject, export_statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LeadsExportResponseData::getDownloadUrl()
{
	return download_url;
}

void
LeadsExportResponseData::setDownloadUrl(std::string  download_url)
{
	this->download_url = download_url;
}

LeadsExportStatus
LeadsExportResponseData::getExportStatus()
{
	return export_status;
}

void
LeadsExportResponseData::setExportStatus(LeadsExportStatus  export_status)
{
	this->export_status = export_status;
}


