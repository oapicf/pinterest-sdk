#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "InviteBusinessRoleBinding.h"

using namespace std;
using namespace Tizen::ArtikCloud;

InviteBusinessRoleBinding::InviteBusinessRoleBinding()
{
	//__init();
}

InviteBusinessRoleBinding::~InviteBusinessRoleBinding()
{
	//__cleanup();
}

void
InviteBusinessRoleBinding::__init()
{
	//created_by_business_id = std::string();
	//created_by_user_id = std::string();
	//user = null;
	//id = std::string();
	//invite_data = new BaseInviteDataResponse_invite_data();
	//is_received_invite = bool(false);
}

void
InviteBusinessRoleBinding::__cleanup()
{
	//if(created_by_business_id != NULL) {
	//
	//delete created_by_business_id;
	//created_by_business_id = NULL;
	//}
	//if(created_by_user_id != NULL) {
	//
	//delete created_by_user_id;
	//created_by_user_id = NULL;
	//}
	//if(user != NULL) {
	//
	//delete user;
	//user = NULL;
	//}
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
	//
}

void
InviteBusinessRoleBinding::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *created_by_business_idKey = "created_by_business_id";
	node = json_object_get_member(pJsonObject, created_by_business_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&created_by_business_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *created_by_user_idKey = "created_by_user_id";
	node = json_object_get_member(pJsonObject, created_by_user_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&created_by_user_id, node, "std::string", "");
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
}

InviteBusinessRoleBinding::InviteBusinessRoleBinding(char* json)
{
	this->fromJson(json);
}

char*
InviteBusinessRoleBinding::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getCreatedByBusinessId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *created_by_business_idKey = "created_by_business_id";
	json_object_set_member(pJsonObject, created_by_business_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCreatedByUserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *created_by_user_idKey = "created_by_user_id";
	json_object_set_member(pJsonObject, created_by_user_idKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
InviteBusinessRoleBinding::getCreatedByBusinessId()
{
	return created_by_business_id;
}

void
InviteBusinessRoleBinding::setCreatedByBusinessId(std::string  created_by_business_id)
{
	this->created_by_business_id = created_by_business_id;
}

std::string
InviteBusinessRoleBinding::getCreatedByUserId()
{
	return created_by_user_id;
}

void
InviteBusinessRoleBinding::setCreatedByUserId(std::string  created_by_user_id)
{
	this->created_by_user_id = created_by_user_id;
}

BusinessAccessUserSummary
InviteBusinessRoleBinding::getUser()
{
	return user;
}

void
InviteBusinessRoleBinding::setUser(BusinessAccessUserSummary  user)
{
	this->user = user;
}

std::string
InviteBusinessRoleBinding::getId()
{
	return id;
}

void
InviteBusinessRoleBinding::setId(std::string  id)
{
	this->id = id;
}

BaseInviteDataResponse_invite_data
InviteBusinessRoleBinding::getInviteData()
{
	return invite_data;
}

void
InviteBusinessRoleBinding::setInviteData(BaseInviteDataResponse_invite_data  invite_data)
{
	this->invite_data = invite_data;
}

bool
InviteBusinessRoleBinding::getIsReceivedInvite()
{
	return is_received_invite;
}

void
InviteBusinessRoleBinding::setIsReceivedInvite(bool  is_received_invite)
{
	this->is_received_invite = is_received_invite;
}


