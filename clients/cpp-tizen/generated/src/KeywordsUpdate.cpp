#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeywordsUpdate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeywordsUpdate::KeywordsUpdate()
{
	//__init();
}

KeywordsUpdate::~KeywordsUpdate()
{
	//__cleanup();
}

void
KeywordsUpdate::__init()
{
	//new std::list()std::list> keywords;
}

void
KeywordsUpdate::__cleanup()
{
	//if(keywords != NULL) {
	//keywords.RemoveAll(true);
	//delete keywords;
	//keywords = NULL;
	//}
	//
}

void
KeywordsUpdate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *keywordsKey = "keywords";
	node = json_object_get_member(pJsonObject, keywordsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<KeywordUpdateItem> new_list;
			KeywordUpdateItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("KeywordUpdateItem")) {
					jsonToValue(&inst, temp_json, "KeywordUpdateItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			keywords = new_list;
		}
		
	}
}

KeywordsUpdate::KeywordsUpdate(char* json)
{
	this->fromJson(json);
}

char*
KeywordsUpdate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("KeywordUpdateItem")) {
		list<KeywordUpdateItem> new_list = static_cast<list <KeywordUpdateItem> > (getKeywords());
		node = converttoJson(&new_list, "KeywordUpdateItem", "array");
	} else {
		node = json_node_alloc();
		list<KeywordUpdateItem> new_list = static_cast<list <KeywordUpdateItem> > (getKeywords());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<KeywordUpdateItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			KeywordUpdateItem obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *keywordsKey = "keywords";
	json_object_set_member(pJsonObject, keywordsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<KeywordUpdateItem>
KeywordsUpdate::getKeywords()
{
	return keywords;
}

void
KeywordsUpdate::setKeywords(std::list <KeywordUpdateItem> keywords)
{
	this->keywords = keywords;
}


