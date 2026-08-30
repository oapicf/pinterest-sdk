#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AiDisclosures.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AiDisclosures::AiDisclosures()
{
	//__init();
}

AiDisclosures::~AiDisclosures()
{
	//__cleanup();
}

void
AiDisclosures::__init()
{
	//new std::list()std::list> values;
}

void
AiDisclosures::__cleanup()
{
	//if(values != NULL) {
	//values.RemoveAll(true);
	//delete values;
	//values = NULL;
	//}
	//
}

void
AiDisclosures::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *valuesKey = "values";
	node = json_object_get_member(pJsonObject, valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AiDisclosureItem> new_list;
			AiDisclosureItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AiDisclosureItem")) {
					jsonToValue(&inst, temp_json, "AiDisclosureItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			values = new_list;
		}
		
	}
}

AiDisclosures::AiDisclosures(char* json)
{
	this->fromJson(json);
}

char*
AiDisclosures::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AiDisclosureItem")) {
		list<AiDisclosureItem> new_list = static_cast<list <AiDisclosureItem> > (getValues());
		node = converttoJson(&new_list, "AiDisclosureItem", "array");
	} else {
		node = json_node_alloc();
		list<AiDisclosureItem> new_list = static_cast<list <AiDisclosureItem> > (getValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AiDisclosureItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AiDisclosureItem obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *valuesKey = "values";
	json_object_set_member(pJsonObject, valuesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<AiDisclosureItem>
AiDisclosures::getValues()
{
	return values;
}

void
AiDisclosures::setValues(std::list <AiDisclosureItem> values)
{
	this->values = values;
}


