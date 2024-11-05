#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateAssetAccessRequestResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateAssetAccessRequestResponse::CreateAssetAccessRequestResponse()
{
	//__init();
}

CreateAssetAccessRequestResponse::~CreateAssetAccessRequestResponse()
{
	//__cleanup();
}

void
CreateAssetAccessRequestResponse::__init()
{
	//new std::list()std::list> exceptions;
	//new std::map()std::map> invites;
}

void
CreateAssetAccessRequestResponse::__cleanup()
{
	//if(exceptions != NULL) {
	//exceptions.RemoveAll(true);
	//delete exceptions;
	//exceptions = NULL;
	//}
	//if(invites != NULL) {
	//invites.RemoveAll(true);
	//delete invites;
	//invites = NULL;
	//}
	//
}

void
CreateAssetAccessRequestResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *exceptionsKey = "exceptions";
	node = json_object_get_member(pJsonObject, exceptionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CreateAssetAccessRequestErrorMessage_inner> new_list;
			CreateAssetAccessRequestErrorMessage_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CreateAssetAccessRequestErrorMessage_inner")) {
					jsonToValue(&inst, temp_json, "CreateAssetAccessRequestErrorMessage_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			exceptions = new_list;
		}
		
	}
	const gchar *invitesKey = "invites";
	node = json_object_get_member(pJsonObject, invitesKey);
	if (node !=NULL) {
	
		{
			JsonObject* json_obj = json_node_get_object(node);
			map<string,string> new_map;
			json_object_foreach_member(json_obj,helper_func,&new_map);
			invites = new_map;
		}
		
	}
}

CreateAssetAccessRequestResponse::CreateAssetAccessRequestResponse(char* json)
{
	this->fromJson(json);
}

char*
CreateAssetAccessRequestResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CreateAssetAccessRequestErrorMessage_inner")) {
		list<CreateAssetAccessRequestErrorMessage_inner> new_list = static_cast<list <CreateAssetAccessRequestErrorMessage_inner> > (getExceptions());
		node = converttoJson(&new_list, "CreateAssetAccessRequestErrorMessage_inner", "array");
	} else {
		node = json_node_alloc();
		list<CreateAssetAccessRequestErrorMessage_inner> new_list = static_cast<list <CreateAssetAccessRequestErrorMessage_inner> > (getExceptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CreateAssetAccessRequestErrorMessage_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CreateAssetAccessRequestErrorMessage_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *exceptionsKey = "exceptions";
	json_object_set_member(pJsonObject, exceptionsKey, node);


	{
		JsonObject* json_obj;
		map<string, string> new_list = static_cast<map <string, string> > (getInvites());
		json_obj = json_object_new();
		for (map<string, string>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			string obj = (*it).first;
			string obj2 = (*it).second;
			JsonNode* tempnode = json_from_string(obj2.c_str(),NULL);
			json_object_set_member(json_obj, obj.c_str(), tempnode);
		}
	node = json_node_alloc();
	json_node_init_object(node, json_obj);
	json_object_unref(json_obj);
	}

	const gchar *invitesKey = "invites";
	json_object_set_member(pJsonObject, invitesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<CreateAssetAccessRequestErrorMessage_inner>
CreateAssetAccessRequestResponse::getExceptions()
{
	return exceptions;
}

void
CreateAssetAccessRequestResponse::setExceptions(std::list <CreateAssetAccessRequestErrorMessage_inner> exceptions)
{
	this->exceptions = exceptions;
}

std::map<string, string>
CreateAssetAccessRequestResponse::getInvites()
{
	return invites;
}

void
CreateAssetAccessRequestResponse::setInvites(std::map <string, string> invites)
{
	this->invites = invites;
}


