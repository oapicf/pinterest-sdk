#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "KeywordError.h"

using namespace std;
using namespace Tizen::ArtikCloud;

KeywordError::KeywordError()
{
	//__init();
}

KeywordError::~KeywordError()
{
	//__cleanup();
}

void
KeywordError::__init()
{
	//data = new Keyword();
	//new std::list()std::list> error_messages;
}

void
KeywordError::__cleanup()
{
	//if(data != NULL) {
	//
	//delete data;
	//data = NULL;
	//}
	//if(error_messages != NULL) {
	//error_messages.RemoveAll(true);
	//delete error_messages;
	//error_messages = NULL;
	//}
	//
}

void
KeywordError::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *dataKey = "data";
	node = json_object_get_member(pJsonObject, dataKey);
	if (node !=NULL) {
	

		if (isprimitive("Keyword")) {
			jsonToValue(&data, node, "Keyword", "Keyword");
		} else {
			
			Keyword* obj = static_cast<Keyword*> (&data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *error_messagesKey = "error_messages";
	node = json_object_get_member(pJsonObject, error_messagesKey);
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
			error_messages = new_list;
		}
		
	}
}

KeywordError::KeywordError(char* json)
{
	this->fromJson(json);
}

char*
KeywordError::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("Keyword")) {
		Keyword obj = getData();
		node = converttoJson(&obj, "Keyword", "");
	}
	else {
		
		Keyword obj = static_cast<Keyword> (getData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *dataKey = "data";
	json_object_set_member(pJsonObject, dataKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getErrorMessages());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getErrorMessages());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *error_messagesKey = "error_messages";
	json_object_set_member(pJsonObject, error_messagesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

Keyword
KeywordError::getData()
{
	return data;
}

void
KeywordError::setData(Keyword  data)
{
	this->data = data;
}

std::list<std::string>
KeywordError::getErrorMessages()
{
	return error_messages;
}

void
KeywordError::setErrorMessages(std::list <std::string> error_messages)
{
	this->error_messages = error_messages;
}


