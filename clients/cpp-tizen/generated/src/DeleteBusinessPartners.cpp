#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "DeleteBusinessPartners.h"

using namespace std;
using namespace Tizen::ArtikCloud;

DeleteBusinessPartners::DeleteBusinessPartners()
{
	//__init();
}

DeleteBusinessPartners::~DeleteBusinessPartners()
{
	//__cleanup();
}

void
DeleteBusinessPartners::__init()
{
	//new std::list()std::list> deleted_partners;
}

void
DeleteBusinessPartners::__cleanup()
{
	//if(deleted_partners != NULL) {
	//deleted_partners.RemoveAll(true);
	//delete deleted_partners;
	//deleted_partners = NULL;
	//}
	//
}

void
DeleteBusinessPartners::fromJson(char* jsonStr)
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

DeleteBusinessPartners::DeleteBusinessPartners(char* json)
{
	this->fromJson(json);
}

char*
DeleteBusinessPartners::toJson()
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
DeleteBusinessPartners::getDeletedPartners()
{
	return deleted_partners;
}

void
DeleteBusinessPartners::setDeletedPartners(std::list <std::string> deleted_partners)
{
	this->deleted_partners = deleted_partners;
}


