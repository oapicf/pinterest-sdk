#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeywordsRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeywordsRequest::KeywordsRequest()
{
	//__init();
}

KeywordsRequest::~KeywordsRequest()
{
	//__cleanup();
}

void
KeywordsRequest::__init()
{
	//new std::list()std::list> keywords;
	//parent_id = std::string();
}

void
KeywordsRequest::__cleanup()
{
	//if(keywords != NULL) {
	//keywords.RemoveAll(true);
	//delete keywords;
	//keywords = NULL;
	//}
	//if(parent_id != NULL) {
	//
	//delete parent_id;
	//parent_id = NULL;
	//}
	//
}

void
KeywordsRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *keywordsKey = "keywords";
	node = json_object_get_member(pJsonObject, keywordsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<KeywordsCommon> new_list;
			KeywordsCommon inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("KeywordsCommon")) {
					jsonToValue(&inst, temp_json, "KeywordsCommon", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			keywords = new_list;
		}
		
	}
	const gchar *parent_idKey = "parent_id";
	node = json_object_get_member(pJsonObject, parent_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&parent_id, node, "std::string", "");
		} else {
			
		}
	}
}

KeywordsRequest::KeywordsRequest(char* json)
{
	this->fromJson(json);
}

char*
KeywordsRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("KeywordsCommon")) {
		list<KeywordsCommon> new_list = static_cast<list <KeywordsCommon> > (getKeywords());
		node = converttoJson(&new_list, "KeywordsCommon", "array");
	} else {
		node = json_node_alloc();
		list<KeywordsCommon> new_list = static_cast<list <KeywordsCommon> > (getKeywords());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<KeywordsCommon>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			KeywordsCommon obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *keywordsKey = "keywords";
	json_object_set_member(pJsonObject, keywordsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getParentId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *parent_idKey = "parent_id";
	json_object_set_member(pJsonObject, parent_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<KeywordsCommon>
KeywordsRequest::getKeywords()
{
	return keywords;
}

void
KeywordsRequest::setKeywords(std::list <KeywordsCommon> keywords)
{
	this->keywords = keywords;
}

std::string
KeywordsRequest::getParentId()
{
	return parent_id;
}

void
KeywordsRequest::setParentId(std::string  parent_id)
{
	this->parent_id = parent_id;
}


