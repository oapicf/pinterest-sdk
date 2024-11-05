#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateAssetAccessRequestErrorMessage_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateAssetAccessRequestErrorMessage_inner::CreateAssetAccessRequestErrorMessage_inner()
{
	//__init();
}

CreateAssetAccessRequestErrorMessage_inner::~CreateAssetAccessRequestErrorMessage_inner()
{
	//__cleanup();
}

void
CreateAssetAccessRequestErrorMessage_inner::__init()
{
	//code = int(0);
	//new std::list()std::list> messages;
}

void
CreateAssetAccessRequestErrorMessage_inner::__cleanup()
{
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//if(messages != NULL) {
	//messages.RemoveAll(true);
	//delete messages;
	//messages = NULL;
	//}
	//
}

void
CreateAssetAccessRequestErrorMessage_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&code, node, "int", "");
		} else {
			
		}
	}
	const gchar *messagesKey = "messages";
	node = json_object_get_member(pJsonObject, messagesKey);
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
			messages = new_list;
		}
		
	}
}

CreateAssetAccessRequestErrorMessage_inner::CreateAssetAccessRequestErrorMessage_inner(char* json)
{
	this->fromJson(json);
}

char*
CreateAssetAccessRequestErrorMessage_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getCode();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getMessages());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getMessages());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *messagesKey = "messages";
	json_object_set_member(pJsonObject, messagesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
CreateAssetAccessRequestErrorMessage_inner::getCode()
{
	return code;
}

void
CreateAssetAccessRequestErrorMessage_inner::setCode(int  code)
{
	this->code = code;
}

std::list<std::string>
CreateAssetAccessRequestErrorMessage_inner::getMessages()
{
	return messages;
}

void
CreateAssetAccessRequestErrorMessage_inner::setMessages(std::list <std::string> messages)
{
	this->messages = messages;
}


