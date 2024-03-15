#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LeadFormQuestion.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LeadFormQuestion::LeadFormQuestion()
{
	//__init();
}

LeadFormQuestion::~LeadFormQuestion()
{
	//__cleanup();
}

void
LeadFormQuestion::__init()
{
	//question_type = new LeadFormQuestionType();
	//custom_question_field_type = new LeadFormQuestionFieldType();
	//custom_question_label = std::string();
	//new std::list()std::list> custom_question_options;
}

void
LeadFormQuestion::__cleanup()
{
	//if(question_type != NULL) {
	//
	//delete question_type;
	//question_type = NULL;
	//}
	//if(custom_question_field_type != NULL) {
	//
	//delete custom_question_field_type;
	//custom_question_field_type = NULL;
	//}
	//if(custom_question_label != NULL) {
	//
	//delete custom_question_label;
	//custom_question_label = NULL;
	//}
	//if(custom_question_options != NULL) {
	//custom_question_options.RemoveAll(true);
	//delete custom_question_options;
	//custom_question_options = NULL;
	//}
	//
}

void
LeadFormQuestion::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *question_typeKey = "question_type";
	node = json_object_get_member(pJsonObject, question_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("LeadFormQuestionType")) {
			jsonToValue(&question_type, node, "LeadFormQuestionType", "LeadFormQuestionType");
		} else {
			
			LeadFormQuestionType* obj = static_cast<LeadFormQuestionType*> (&question_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *custom_question_field_typeKey = "custom_question_field_type";
	node = json_object_get_member(pJsonObject, custom_question_field_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("LeadFormQuestionFieldType")) {
			jsonToValue(&custom_question_field_type, node, "LeadFormQuestionFieldType", "LeadFormQuestionFieldType");
		} else {
			
			LeadFormQuestionFieldType* obj = static_cast<LeadFormQuestionFieldType*> (&custom_question_field_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *custom_question_labelKey = "custom_question_label";
	node = json_object_get_member(pJsonObject, custom_question_labelKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&custom_question_label, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *custom_question_optionsKey = "custom_question_options";
	node = json_object_get_member(pJsonObject, custom_question_optionsKey);
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
			custom_question_options = new_list;
		}
		
	}
}

LeadFormQuestion::LeadFormQuestion(char* json)
{
	this->fromJson(json);
}

char*
LeadFormQuestion::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("LeadFormQuestionType")) {
		LeadFormQuestionType obj = getQuestionType();
		node = converttoJson(&obj, "LeadFormQuestionType", "");
	}
	else {
		
		LeadFormQuestionType obj = static_cast<LeadFormQuestionType> (getQuestionType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *question_typeKey = "question_type";
	json_object_set_member(pJsonObject, question_typeKey, node);
	if (isprimitive("LeadFormQuestionFieldType")) {
		LeadFormQuestionFieldType obj = getCustomQuestionFieldType();
		node = converttoJson(&obj, "LeadFormQuestionFieldType", "");
	}
	else {
		
		LeadFormQuestionFieldType obj = static_cast<LeadFormQuestionFieldType> (getCustomQuestionFieldType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *custom_question_field_typeKey = "custom_question_field_type";
	json_object_set_member(pJsonObject, custom_question_field_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCustomQuestionLabel();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *custom_question_labelKey = "custom_question_label";
	json_object_set_member(pJsonObject, custom_question_labelKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCustomQuestionOptions());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCustomQuestionOptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *custom_question_optionsKey = "custom_question_options";
	json_object_set_member(pJsonObject, custom_question_optionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

LeadFormQuestionType
LeadFormQuestion::getQuestionType()
{
	return question_type;
}

void
LeadFormQuestion::setQuestionType(LeadFormQuestionType  question_type)
{
	this->question_type = question_type;
}

LeadFormQuestionFieldType
LeadFormQuestion::getCustomQuestionFieldType()
{
	return custom_question_field_type;
}

void
LeadFormQuestion::setCustomQuestionFieldType(LeadFormQuestionFieldType  custom_question_field_type)
{
	this->custom_question_field_type = custom_question_field_type;
}

std::string
LeadFormQuestion::getCustomQuestionLabel()
{
	return custom_question_label;
}

void
LeadFormQuestion::setCustomQuestionLabel(std::string  custom_question_label)
{
	this->custom_question_label = custom_question_label;
}

std::list<std::string>
LeadFormQuestion::getCustomQuestionOptions()
{
	return custom_question_options;
}

void
LeadFormQuestion::setCustomQuestionOptions(std::list <std::string> custom_question_options)
{
	this->custom_question_options = custom_question_options;
}


