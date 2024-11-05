#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeletePartnersResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeletePartnersResponse::DeletePartnersResponse()
{
	//__init();
}

DeletePartnersResponse::~DeletePartnersResponse()
{
	//__cleanup();
}

void
DeletePartnersResponse::__init()
{
	//new std::list()std::list> deleted_partners;
}

void
DeletePartnersResponse::__cleanup()
{
	//if(deleted_partners != NULL) {
	//deleted_partners.RemoveAll(true);
	//delete deleted_partners;
	//deleted_partners = NULL;
	//}
	//
}

void
DeletePartnersResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *deleted_partnersKey = "deleted_partners";
	node = json_object_get_member(pJsonObject, deleted_partnersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<std::string> new_list;
			std::string inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("std::string")) {
					jsonToValue(&inst, temp_json, "std::string", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			deleted_partners = new_list;
		}
		
	}
}

DeletePartnersResponse::DeletePartnersResponse(char* json)
{
	this->fromJson(json);
}

char*
DeletePartnersResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getDeletedPartners());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getDeletedPartners());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *deleted_partnersKey = "deleted_partners";
	json_object_set_member(pJsonObject, deleted_partnersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
DeletePartnersResponse::getDeletedPartners()
{
	return deleted_partners;
}

void
DeletePartnersResponse::setDeletedPartners(std::list <std::string> deleted_partners)
{
	this->deleted_partners = deleted_partners;
}


