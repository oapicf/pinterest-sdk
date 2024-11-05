#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BaseInviteDataResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BaseInviteDataResponse::BaseInviteDataResponse()
{
	//__init();
}

BaseInviteDataResponse::~BaseInviteDataResponse()
{
	//__cleanup();
}

void
BaseInviteDataResponse::__init()
{
	//id = std::string();
	//invite_data = new BaseInviteDataResponse_invite_data();
	//is_received_invite = bool(false);
	//user = null;
}

void
BaseInviteDataResponse::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(invite_data != NULL) {
	//
	//delete invite_data;
	//invite_data = NULL;
	//}
	//if(is_received_invite != NULL) {
	//
	//delete is_received_invite;
	//is_received_invite = NULL;
	//}
	//if(user != NULL) {
	//
	//delete user;
	//user = NULL;
	//}
	//
}

void
BaseInviteDataResponse::fromJson(char* jsonStr)
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
	const gchar *invite_dataKey = "invite_data";
	node = json_object_get_member(pJsonObject, invite_dataKey);
	if (node !=NULL) {
	

		if (isprimitive("BaseInviteDataResponse_invite_data")) {
			jsonToValue(&invite_data, node, "BaseInviteDataResponse_invite_data", "BaseInviteDataResponse_invite_data");
		} else {
			
			BaseInviteDataResponse_invite_data* obj = static_cast<BaseInviteDataResponse_invite_data*> (&invite_data);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *is_received_inviteKey = "is_received_invite";
	node = json_object_get_member(pJsonObject, is_received_inviteKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_received_invite, node, "bool", "");
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

BaseInviteDataResponse::BaseInviteDataResponse(char* json)
{
	this->fromJson(json);
}

char*
BaseInviteDataResponse::toJson()
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
	if (isprimitive("BaseInviteDataResponse_invite_data")) {
		BaseInviteDataResponse_invite_data obj = getInviteData();
		node = converttoJson(&obj, "BaseInviteDataResponse_invite_data", "");
	}
	else {
		
		BaseInviteDataResponse_invite_data obj = static_cast<BaseInviteDataResponse_invite_data> (getInviteData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *invite_dataKey = "invite_data";
	json_object_set_member(pJsonObject, invite_dataKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsReceivedInvite();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_received_inviteKey = "is_received_invite";
	json_object_set_member(pJsonObject, is_received_inviteKey, node);
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
BaseInviteDataResponse::getId()
{
	return id;
}

void
BaseInviteDataResponse::setId(std::string  id)
{
	this->id = id;
}

BaseInviteDataResponse_invite_data
BaseInviteDataResponse::getInviteData()
{
	return invite_data;
}

void
BaseInviteDataResponse::setInviteData(BaseInviteDataResponse_invite_data  invite_data)
{
	this->invite_data = invite_data;
}

bool
BaseInviteDataResponse::getIsReceivedInvite()
{
	return is_received_invite;
}

void
BaseInviteDataResponse::setIsReceivedInvite(bool  is_received_invite)
{
	this->is_received_invite = is_received_invite;
}

BusinessAccessUserSummary
BaseInviteDataResponse::getUser()
{
	return user;
}

void
BaseInviteDataResponse::setUser(BusinessAccessUserSummary  user)
{
	this->user = user;
}


