#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateAssetInvitesRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateAssetInvitesRequest::CreateAssetInvitesRequest()
{
	//__init();
}

CreateAssetInvitesRequest::~CreateAssetInvitesRequest()
{
	//__cleanup();
}

void
CreateAssetInvitesRequest::__init()
{
	//new std::list()std::list> invites;
}

void
CreateAssetInvitesRequest::__cleanup()
{
	//if(invites != NULL) {
	//invites.RemoveAll(true);
	//delete invites;
	//invites = NULL;
	//}
	//
}

void
CreateAssetInvitesRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *invitesKey = "invites";
	node = json_object_get_member(pJsonObject, invitesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CreateAssetInvitesRequestItem> new_list;
			CreateAssetInvitesRequestItem inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CreateAssetInvitesRequestItem")) {
					jsonToValue(&inst, temp_json, "CreateAssetInvitesRequestItem", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			invites = new_list;
		}
		
	}
}

CreateAssetInvitesRequest::CreateAssetInvitesRequest(char* json)
{
	this->fromJson(json);
}

char*
CreateAssetInvitesRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CreateAssetInvitesRequestItem")) {
		list<CreateAssetInvitesRequestItem> new_list = static_cast<list <CreateAssetInvitesRequestItem> > (getInvites());
		node = converttoJson(&new_list, "CreateAssetInvitesRequestItem", "array");
	} else {
		node = json_node_alloc();
		list<CreateAssetInvitesRequestItem> new_list = static_cast<list <CreateAssetInvitesRequestItem> > (getInvites());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CreateAssetInvitesRequestItem>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CreateAssetInvitesRequestItem obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
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

std::list<CreateAssetInvitesRequestItem>
CreateAssetInvitesRequest::getInvites()
{
	return invites;
}

void
CreateAssetInvitesRequest::setInvites(std::list <CreateAssetInvitesRequestItem> invites)
{
	this->invites = invites;
}


