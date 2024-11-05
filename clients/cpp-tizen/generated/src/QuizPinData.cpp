#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "QuizPinData.h"

using namespace std;
using namespace Tizen::ArtikCloud;

QuizPinData::QuizPinData()
{
	//__init();
}

QuizPinData::~QuizPinData()
{
	//__cleanup();
}

void
QuizPinData::__init()
{
	//new std::list()std::list> questions;
	//new std::list()std::list> results;
	//tie_breaker_type = std::string();
	//tie_breaker_custom_result = new QuizPinResult();
}

void
QuizPinData::__cleanup()
{
	//if(questions != NULL) {
	//questions.RemoveAll(true);
	//delete questions;
	//questions = NULL;
	//}
	//if(results != NULL) {
	//results.RemoveAll(true);
	//delete results;
	//results = NULL;
	//}
	//if(tie_breaker_type != NULL) {
	//
	//delete tie_breaker_type;
	//tie_breaker_type = NULL;
	//}
	//if(tie_breaker_custom_result != NULL) {
	//
	//delete tie_breaker_custom_result;
	//tie_breaker_custom_result = NULL;
	//}
	//
}

void
QuizPinData::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *questionsKey = "questions";
	node = json_object_get_member(pJsonObject, questionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<QuizPinQuestion> new_list;
			QuizPinQuestion inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("QuizPinQuestion")) {
					jsonToValue(&inst, temp_json, "QuizPinQuestion", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			questions = new_list;
		}
		
	}
	const gchar *resultsKey = "results";
	node = json_object_get_member(pJsonObject, resultsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<QuizPinResult> new_list;
			QuizPinResult inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("QuizPinResult")) {
					jsonToValue(&inst, temp_json, "QuizPinResult", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			results = new_list;
		}
		
	}
	const gchar *tie_breaker_typeKey = "tie_breaker_type";
	node = json_object_get_member(pJsonObject, tie_breaker_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&tie_breaker_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *tie_breaker_custom_resultKey = "tie_breaker_custom_result";
	node = json_object_get_member(pJsonObject, tie_breaker_custom_resultKey);
	if (node !=NULL) {
	

		if (isprimitive("QuizPinResult")) {
			jsonToValue(&tie_breaker_custom_result, node, "QuizPinResult", "QuizPinResult");
		} else {
			
			QuizPinResult* obj = static_cast<QuizPinResult*> (&tie_breaker_custom_result);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

QuizPinData::QuizPinData(char* json)
{
	this->fromJson(json);
}

char*
QuizPinData::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("QuizPinQuestion")) {
		list<QuizPinQuestion> new_list = static_cast<list <QuizPinQuestion> > (getQuestions());
		node = converttoJson(&new_list, "QuizPinQuestion", "array");
	} else {
		node = json_node_alloc();
		list<QuizPinQuestion> new_list = static_cast<list <QuizPinQuestion> > (getQuestions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<QuizPinQuestion>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			QuizPinQuestion obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *questionsKey = "questions";
	json_object_set_member(pJsonObject, questionsKey, node);
	if (isprimitive("QuizPinResult")) {
		list<QuizPinResult> new_list = static_cast<list <QuizPinResult> > (getResults());
		node = converttoJson(&new_list, "QuizPinResult", "array");
	} else {
		node = json_node_alloc();
		list<QuizPinResult> new_list = static_cast<list <QuizPinResult> > (getResults());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<QuizPinResult>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			QuizPinResult obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *resultsKey = "results";
	json_object_set_member(pJsonObject, resultsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTieBreakerType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tie_breaker_typeKey = "tie_breaker_type";
	json_object_set_member(pJsonObject, tie_breaker_typeKey, node);
	if (isprimitive("QuizPinResult")) {
		QuizPinResult obj = getTieBreakerCustomResult();
		node = converttoJson(&obj, "QuizPinResult", "");
	}
	else {
		
		QuizPinResult obj = static_cast<QuizPinResult> (getTieBreakerCustomResult());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tie_breaker_custom_resultKey = "tie_breaker_custom_result";
	json_object_set_member(pJsonObject, tie_breaker_custom_resultKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<QuizPinQuestion>
QuizPinData::getQuestions()
{
	return questions;
}

void
QuizPinData::setQuestions(std::list <QuizPinQuestion> questions)
{
	this->questions = questions;
}

std::list<QuizPinResult>
QuizPinData::getResults()
{
	return results;
}

void
QuizPinData::setResults(std::list <QuizPinResult> results)
{
	this->results = results;
}

std::string
QuizPinData::getTieBreakerType()
{
	return tie_breaker_type;
}

void
QuizPinData::setTieBreakerType(std::string  tie_breaker_type)
{
	this->tie_breaker_type = tie_breaker_type;
}

QuizPinResult
QuizPinData::getTieBreakerCustomResult()
{
	return tie_breaker_custom_result;
}

void
QuizPinData::setTieBreakerCustomResult(QuizPinResult  tie_breaker_custom_result)
{
	this->tie_breaker_custom_result = tie_breaker_custom_result;
}


