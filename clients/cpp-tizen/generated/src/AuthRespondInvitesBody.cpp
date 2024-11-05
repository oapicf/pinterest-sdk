#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuthRespondInvitesBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuthRespondInvitesBody::AuthRespondInvitesBody()
{
	//__init();
}

AuthRespondInvitesBody::~AuthRespondInvitesBody()
{
	//__cleanup();
}

void
AuthRespondInvitesBody::__init()
{
	//new std::list()std::list> invites;
}

void
AuthRespondInvitesBody::__cleanup()
{
	//if(invites != NULL) {
	//invites.RemoveAll(true);
	//delete invites;
	//invites = NULL;
	//}
	//
}

void
AuthRespondInvitesBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *invitesKey = "invites";
	node = json_object_get_member(pJsonObject, invitesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AuthRespondInvitesBody_invites_inner> new_list;
			AuthRespondInvitesBody_invites_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AuthRespondInvitesBody_invites_inner")) {
					jsonToValue(&inst, temp_json, "AuthRespondInvitesBody_invites_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			invites = new_list;
		}
		
	}
}

AuthRespondInvitesBody::AuthRespondInvitesBody(char* json)
{
	this->fromJson(json);
}

char*
AuthRespondInvitesBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AuthRespondInvitesBody_invites_inner")) {
		list<AuthRespondInvitesBody_invites_inner> new_list = static_cast<list <AuthRespondInvitesBody_invites_inner> > (getInvites());
		node = converttoJson(&new_list, "AuthRespondInvitesBody_invites_inner", "array");
	} else {
		node = json_node_alloc();
		list<AuthRespondInvitesBody_invites_inner> new_list = static_cast<list <AuthRespondInvitesBody_invites_inner> > (getInvites());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AuthRespondInvitesBody_invites_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AuthRespondInvitesBody_invites_inner obj = *it;
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

std::list<AuthRespondInvitesBody_invites_inner>
AuthRespondInvitesBody::getInvites()
{
	return invites;
}

void
AuthRespondInvitesBody::setInvites(std::list <AuthRespondInvitesBody_invites_inner> invites)
{
	this->invites = invites;
}


