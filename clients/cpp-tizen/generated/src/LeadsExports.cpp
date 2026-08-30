#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LeadsExports.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LeadsExports::LeadsExports()
{
	//__init();
}

LeadsExports::~LeadsExports()
{
	//__cleanup();
}

void
LeadsExports::__init()
{
	//leads_export_id = std::string();
}

void
LeadsExports::__cleanup()
{
	//if(leads_export_id != NULL) {
	//
	//delete leads_export_id;
	//leads_export_id = NULL;
	//}
	//
}

void
LeadsExports::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *leads_export_idKey = "leads_export_id";
	node = json_object_get_member(pJsonObject, leads_export_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&leads_export_id, node, "std::string", "");
		} else {
			
		}
	}
}

LeadsExports::LeadsExports(char* json)
{
	this->fromJson(json);
}

char*
LeadsExports::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getLeadsExportId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *leads_export_idKey = "leads_export_id";
	json_object_set_member(pJsonObject, leads_export_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LeadsExports::getLeadsExportId()
{
	return leads_export_id;
}

void
LeadsExports::setLeadsExportId(std::string  leads_export_id)
{
	this->leads_export_id = leads_export_id;
}


