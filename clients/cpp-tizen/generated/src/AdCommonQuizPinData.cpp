#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdCommon_quiz_pin_data.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdCommon_quiz_pin_data::AdCommon_quiz_pin_data()
{
	//__init();
}

AdCommon_quiz_pin_data::~AdCommon_quiz_pin_data()
{
	//__cleanup();
}

void
AdCommon_quiz_pin_data::__init()
{
	//new std::list()std::list> questions;
	//new std::list()std::list> results;
}

void
AdCommon_quiz_pin_data::__cleanup()
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
	//
}

void
AdCommon_quiz_pin_data::fromJson(char* jsonStr)
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
}

AdCommon_quiz_pin_data::AdCommon_quiz_pin_data(char* json)
{
	this->fromJson(json);
}

char*
AdCommon_quiz_pin_data::toJson()
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<QuizPinQuestion>
AdCommon_quiz_pin_data::getQuestions()
{
	return questions;
}

void
AdCommon_quiz_pin_data::setQuestions(std::list <QuizPinQuestion> questions)
{
	this->questions = questions;
}

std::list<QuizPinResult>
AdCommon_quiz_pin_data::getResults()
{
	return results;
}

void
AdCommon_quiz_pin_data::setResults(std::list <QuizPinResult> results)
{
	this->results = results;
}


