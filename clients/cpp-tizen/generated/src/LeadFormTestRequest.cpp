#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LeadFormTestRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LeadFormTestRequest::LeadFormTestRequest()
{
	//__init();
}

LeadFormTestRequest::~LeadFormTestRequest()
{
	//__cleanup();
}

void
LeadFormTestRequest::__init()
{
	//new std::list()std::list> answers;
}

void
LeadFormTestRequest::__cleanup()
{
	//if(answers != NULL) {
	//answers.RemoveAll(true);
	//delete answers;
	//answers = NULL;
	//}
	//
}

void
LeadFormTestRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *answersKey = "answers";
	node = json_object_get_member(pJsonObject, answersKey);
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
			answers = new_list;
		}
		
	}
}

LeadFormTestRequest::LeadFormTestRequest(char* json)
{
	this->fromJson(json);
}

char*
LeadFormTestRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getAnswers());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getAnswers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *answersKey = "answers";
	json_object_set_member(pJsonObject, answersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
LeadFormTestRequest::getAnswers()
{
	return answers;
}

void
LeadFormTestRequest::setAnswers(std::list <std::string> answers)
{
	this->answers = answers;
}


