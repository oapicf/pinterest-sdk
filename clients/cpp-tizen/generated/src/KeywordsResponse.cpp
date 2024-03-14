#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeywordsResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeywordsResponse::KeywordsResponse()
{
	//__init();
}

KeywordsResponse::~KeywordsResponse()
{
	//__cleanup();
}

void
KeywordsResponse::__init()
{
	//new std::list()std::list> errors;
	//new std::list()std::list> keywords;
}

void
KeywordsResponse::__cleanup()
{
	//if(errors != NULL) {
	//errors.RemoveAll(true);
	//delete errors;
	//errors = NULL;
	//}
	//if(keywords != NULL) {
	//keywords.RemoveAll(true);
	//delete keywords;
	//keywords = NULL;
	//}
	//
}

void
KeywordsResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *errorsKey = "errors";
	node = json_object_get_member(pJsonObject, errorsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<KeywordError> new_list;
			KeywordError inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("KeywordError")) {
					jsonToValue(&inst, temp_json, "KeywordError", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			errors = new_list;
		}
		
	}
	const gchar *keywordsKey = "keywords";
	node = json_object_get_member(pJsonObject, keywordsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<Keyword> new_list;
			Keyword inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("Keyword")) {
					jsonToValue(&inst, temp_json, "Keyword", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			keywords = new_list;
		}
		
	}
}

KeywordsResponse::KeywordsResponse(char* json)
{
	this->fromJson(json);
}

char*
KeywordsResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("KeywordError")) {
		list<KeywordError> new_list = static_cast<list <KeywordError> > (getErrors());
		node = converttoJson(&new_list, "KeywordError", "array");
	} else {
		node = json_node_alloc();
		list<KeywordError> new_list = static_cast<list <KeywordError> > (getErrors());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<KeywordError>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			KeywordError obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *errorsKey = "errors";
	json_object_set_member(pJsonObject, errorsKey, node);
	if (isprimitive("Keyword")) {
		list<Keyword> new_list = static_cast<list <Keyword> > (getKeywords());
		node = converttoJson(&new_list, "Keyword", "array");
	} else {
		node = json_node_alloc();
		list<Keyword> new_list = static_cast<list <Keyword> > (getKeywords());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<Keyword>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			Keyword obj = *it;
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

std::list<KeywordError>
KeywordsResponse::getErrors()
{
	return errors;
}

void
KeywordsResponse::setErrors(std::list <KeywordError> errors)
{
	this->errors = errors;
}

std::list<Keyword>
KeywordsResponse::getKeywords()
{
	return keywords;
}

void
KeywordsResponse::setKeywords(std::list <Keyword> keywords)
{
	this->keywords = keywords;
}


