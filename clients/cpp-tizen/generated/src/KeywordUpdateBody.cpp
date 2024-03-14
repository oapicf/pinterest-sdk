#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeywordUpdateBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeywordUpdateBody::KeywordUpdateBody()
{
	//__init();
}

KeywordUpdateBody::~KeywordUpdateBody()
{
	//__cleanup();
}

void
KeywordUpdateBody::__init()
{
	//new std::list()std::list> keywords;
}

void
KeywordUpdateBody::__cleanup()
{
	//if(keywords != NULL) {
	//keywords.RemoveAll(true);
	//delete keywords;
	//keywords = NULL;
	//}
	//
}

void
KeywordUpdateBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *keywordsKey = "keywords";
	node = json_object_get_member(pJsonObject, keywordsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<KeywordUpdate> new_list;
			KeywordUpdate inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("KeywordUpdate")) {
					jsonToValue(&inst, temp_json, "KeywordUpdate", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			keywords = new_list;
		}
		
	}
}

KeywordUpdateBody::KeywordUpdateBody(char* json)
{
	this->fromJson(json);
}

char*
KeywordUpdateBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("KeywordUpdate")) {
		list<KeywordUpdate> new_list = static_cast<list <KeywordUpdate> > (getKeywords());
		node = converttoJson(&new_list, "KeywordUpdate", "array");
	} else {
		node = json_node_alloc();
		list<KeywordUpdate> new_list = static_cast<list <KeywordUpdate> > (getKeywords());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<KeywordUpdate>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			KeywordUpdate obj = *it;
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

std::list<KeywordUpdate>
KeywordUpdateBody::getKeywords()
{
	return keywords;
}

void
KeywordUpdateBody::setKeywords(std::list <KeywordUpdate> keywords)
{
	this->keywords = keywords;
}


