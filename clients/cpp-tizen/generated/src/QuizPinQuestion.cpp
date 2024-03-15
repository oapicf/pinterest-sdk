#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "QuizPinQuestion.h"

using namespace std;
using namespace Tizen::ArtikCloud;

QuizPinQuestion::QuizPinQuestion()
{
	//__init();
}

QuizPinQuestion::~QuizPinQuestion()
{
	//__cleanup();
}

void
QuizPinQuestion::__init()
{
	//question_id = double(0);
	//question_text = std::string();
	//new std::list()std::list> options;
}

void
QuizPinQuestion::__cleanup()
{
	//if(question_id != NULL) {
	//
	//delete question_id;
	//question_id = NULL;
	//}
	//if(question_text != NULL) {
	//
	//delete question_text;
	//question_text = NULL;
	//}
	//if(options != NULL) {
	//options.RemoveAll(true);
	//delete options;
	//options = NULL;
	//}
	//
}

void
QuizPinQuestion::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *question_idKey = "question_id";
	node = json_object_get_member(pJsonObject, question_idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&question_id, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&question_id);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *question_textKey = "question_text";
	node = json_object_get_member(pJsonObject, question_textKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&question_text, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *optionsKey = "options";
	node = json_object_get_member(pJsonObject, optionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<QuizPinOption> new_list;
			QuizPinOption inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("QuizPinOption")) {
					jsonToValue(&inst, temp_json, "QuizPinOption", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			options = new_list;
		}
		
	}
}

QuizPinQuestion::QuizPinQuestion(char* json)
{
	this->fromJson(json);
}

char*
QuizPinQuestion::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getQuestionId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getQuestionId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *question_idKey = "question_id";
	json_object_set_member(pJsonObject, question_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getQuestionText();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *question_textKey = "question_text";
	json_object_set_member(pJsonObject, question_textKey, node);
	if (isprimitive("QuizPinOption")) {
		list<QuizPinOption> new_list = static_cast<list <QuizPinOption> > (getOptions());
		node = converttoJson(&new_list, "QuizPinOption", "array");
	} else {
		node = json_node_alloc();
		list<QuizPinOption> new_list = static_cast<list <QuizPinOption> > (getOptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<QuizPinOption>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			QuizPinOption obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *optionsKey = "options";
	json_object_set_member(pJsonObject, optionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
QuizPinQuestion::getQuestionId()
{
	return question_id;
}

void
QuizPinQuestion::setQuestionId(long long  question_id)
{
	this->question_id = question_id;
}

std::string
QuizPinQuestion::getQuestionText()
{
	return question_text;
}

void
QuizPinQuestion::setQuestionText(std::string  question_text)
{
	this->question_text = question_text;
}

std::list<QuizPinOption>
QuizPinQuestion::getOptions()
{
	return options;
}

void
QuizPinQuestion::setOptions(std::list <QuizPinOption> options)
{
	this->options = options;
}


