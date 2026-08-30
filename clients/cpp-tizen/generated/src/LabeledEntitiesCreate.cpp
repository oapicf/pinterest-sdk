#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LabeledEntitiesCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LabeledEntitiesCreate::LabeledEntitiesCreate()
{
	//__init();
}

LabeledEntitiesCreate::~LabeledEntitiesCreate()
{
	//__cleanup();
}

void
LabeledEntitiesCreate::__init()
{
	//new std::list()std::list> entity_ids;
}

void
LabeledEntitiesCreate::__cleanup()
{
	//if(entity_ids != NULL) {
	//entity_ids.RemoveAll(true);
	//delete entity_ids;
	//entity_ids = NULL;
	//}
	//
}

void
LabeledEntitiesCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *entity_idsKey = "entity_ids";
	node = json_object_get_member(pJsonObject, entity_idsKey);
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
			entity_ids = new_list;
		}
		
	}
}

LabeledEntitiesCreate::LabeledEntitiesCreate(char* json)
{
	this->fromJson(json);
}

char*
LabeledEntitiesCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getEntityIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getEntityIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *entity_idsKey = "entity_ids";
	json_object_set_member(pJsonObject, entity_idsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
LabeledEntitiesCreate::getEntityIds()
{
	return entity_ids;
}

void
LabeledEntitiesCreate::setEntityIds(std::list <std::string> entity_ids)
{
	this->entity_ids = entity_ids;
}


