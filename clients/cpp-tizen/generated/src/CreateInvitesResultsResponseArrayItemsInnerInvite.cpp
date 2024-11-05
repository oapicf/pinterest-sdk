#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateInvitesResultsResponseArray_items_inner_invite.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateInvitesResultsResponseArray_items_inner_invite::CreateInvitesResultsResponseArray_items_inner_invite()
{
	//__init();
}

CreateInvitesResultsResponseArray_items_inner_invite::~CreateInvitesResultsResponseArray_items_inner_invite()
{
	//__cleanup();
}

void
CreateInvitesResultsResponseArray_items_inner_invite::__init()
{
	//id = std::string();
	//user = null;
}

void
CreateInvitesResultsResponseArray_items_inner_invite::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(user != NULL) {
	//
	//delete user;
	//user = NULL;
	//}
	//
}

void
CreateInvitesResultsResponseArray_items_inner_invite::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *userKey = "user";
	node = json_object_get_member(pJsonObject, userKey);
	if (node !=NULL) {
	

		if (isprimitive("BusinessAccessUserSummary")) {
			jsonToValue(&user, node, "BusinessAccessUserSummary", "BusinessAccessUserSummary");
		} else {
			
			BusinessAccessUserSummary* obj = static_cast<BusinessAccessUserSummary*> (&user);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CreateInvitesResultsResponseArray_items_inner_invite::CreateInvitesResultsResponseArray_items_inner_invite(char* json)
{
	this->fromJson(json);
}

char*
CreateInvitesResultsResponseArray_items_inner_invite::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("BusinessAccessUserSummary")) {
		BusinessAccessUserSummary obj = getUser();
		node = converttoJson(&obj, "BusinessAccessUserSummary", "");
	}
	else {
		
		BusinessAccessUserSummary obj = static_cast<BusinessAccessUserSummary> (getUser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *userKey = "user";
	json_object_set_member(pJsonObject, userKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateInvitesResultsResponseArray_items_inner_invite::getId()
{
	return id;
}

void
CreateInvitesResultsResponseArray_items_inner_invite::setId(std::string  id)
{
	this->id = id;
}

BusinessAccessUserSummary
CreateInvitesResultsResponseArray_items_inner_invite::getUser()
{
	return user;
}

void
CreateInvitesResultsResponseArray_items_inner_invite::setUser(BusinessAccessUserSummary  user)
{
	this->user = user;
}


