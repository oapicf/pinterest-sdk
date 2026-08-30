#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DynamicTitlesDownloadCSV.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DynamicTitlesDownloadCSV::DynamicTitlesDownloadCSV()
{
	//__init();
}

DynamicTitlesDownloadCSV::~DynamicTitlesDownloadCSV()
{
	//__cleanup();
}

void
DynamicTitlesDownloadCSV::__init()
{
	//download_url = std::string();
}

void
DynamicTitlesDownloadCSV::__cleanup()
{
	//if(download_url != NULL) {
	//
	//delete download_url;
	//download_url = NULL;
	//}
	//
}

void
DynamicTitlesDownloadCSV::fromJson(char* jsonStr)
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
}

DynamicTitlesDownloadCSV::DynamicTitlesDownloadCSV(char* json)
{
	this->fromJson(json);
}

char*
DynamicTitlesDownloadCSV::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
DynamicTitlesDownloadCSV::getDownloadUrl()
{
	return download_url;
}

void
DynamicTitlesDownloadCSV::setDownloadUrl(std::string  download_url)
{
	this->download_url = download_url;
}


