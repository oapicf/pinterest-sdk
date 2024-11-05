#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "InviteResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

InviteResponse::InviteResponse()
{
	//__init();
}

InviteResponse::~InviteResponse()
{
	//__cleanup();
}

void
InviteResponse::__init()
{
	//assets_summary = new InviteAssetsSummary();
	//new std::list()std::list> business_roles;
	//created_by_business = null;
	//created_by_user = null;
	//created_time = int(0);
	//id = std::string();
	//invite_data = new BaseInviteDataResponse_invite_data();
	//is_received_invite = bool(false);
	//user = null;
}

void
InviteResponse::__cleanup()
{
	//if(assets_summary != NULL) {
	//
	//delete assets_summary;
	//assets_summary = NULL;
	//}
	//if(business_roles != NULL) {
	//business_roles.RemoveAll(true);
	//delete business_roles;
	//business_roles = NULL;
	//}
	//if(created_by_business != NULL) {
	//
	//delete created_by_business;
	//created_by_business = NULL;
	//}
	//if(created_by_user != NULL) {
	//
	//delete created_by_user;
	//created_by_user = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
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
	//if(user != NULL) {
	//
	//delete user;
	//user = NULL;
	//}
	//
}

void
InviteResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *assets_summaryKey = "assets_summary";
	node = json_object_get_member(pJsonObject, assets_summaryKey);
	if (node !=NULL) {
	

		if (isprimitive("InviteAssetsSummary")) {
			jsonToValue(&assets_summary, node, "InviteAssetsSummary", "InviteAssetsSummary");
		} else {
			
			InviteAssetsSummary* obj = static_cast<InviteAssetsSummary*> (&assets_summary);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *business_rolesKey = "business_roles";
	node = json_object_get_member(pJsonObject, business_rolesKey);
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
			business_roles = new_list;
		}
		
	}
	const gchar *created_by_businessKey = "created_by_business";
	node = json_object_get_member(pJsonObject, created_by_businessKey);
	if (node !=NULL) {
	

		if (isprimitive("BusinessAccessUserSummary")) {
			jsonToValue(&created_by_business, node, "BusinessAccessUserSummary", "BusinessAccessUserSummary");
		} else {
			
			BusinessAccessUserSummary* obj = static_cast<BusinessAccessUserSummary*> (&created_by_business);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *created_by_userKey = "created_by_user";
	node = json_object_get_member(pJsonObject, created_by_userKey);
	if (node !=NULL) {
	

		if (isprimitive("BusinessAccessUserSummary")) {
			jsonToValue(&created_by_user, node, "BusinessAccessUserSummary", "BusinessAccessUserSummary");
		} else {
			
			BusinessAccessUserSummary* obj = static_cast<BusinessAccessUserSummary*> (&created_by_user);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *created_timeKey = "created_time";
	node = json_object_get_member(pJsonObject, created_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_time, node, "int", "");
		} else {
			
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

InviteResponse::InviteResponse(char* json)
{
	this->fromJson(json);
}

char*
InviteResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("InviteAssetsSummary")) {
		InviteAssetsSummary obj = getAssetsSummary();
		node = converttoJson(&obj, "InviteAssetsSummary", "");
	}
	else {
		
		InviteAssetsSummary obj = static_cast<InviteAssetsSummary> (getAssetsSummary());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *assets_summaryKey = "assets_summary";
	json_object_set_member(pJsonObject, assets_summaryKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getBusinessRoles());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getBusinessRoles());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *business_rolesKey = "business_roles";
	json_object_set_member(pJsonObject, business_rolesKey, node);
	if (isprimitive("BusinessAccessUserSummary")) {
		BusinessAccessUserSummary obj = getCreatedByBusiness();
		node = converttoJson(&obj, "BusinessAccessUserSummary", "");
	}
	else {
		
		BusinessAccessUserSummary obj = static_cast<BusinessAccessUserSummary> (getCreatedByBusiness());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *created_by_businessKey = "created_by_business";
	json_object_set_member(pJsonObject, created_by_businessKey, node);
	if (isprimitive("BusinessAccessUserSummary")) {
		BusinessAccessUserSummary obj = getCreatedByUser();
		node = converttoJson(&obj, "BusinessAccessUserSummary", "");
	}
	else {
		
		BusinessAccessUserSummary obj = static_cast<BusinessAccessUserSummary> (getCreatedByUser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *created_by_userKey = "created_by_user";
	json_object_set_member(pJsonObject, created_by_userKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
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

InviteAssetsSummary
InviteResponse::getAssetsSummary()
{
	return assets_summary;
}

void
InviteResponse::setAssetsSummary(InviteAssetsSummary  assets_summary)
{
	this->assets_summary = assets_summary;
}

std::list<std::string>
InviteResponse::getBusinessRoles()
{
	return business_roles;
}

void
InviteResponse::setBusinessRoles(std::list <std::string> business_roles)
{
	this->business_roles = business_roles;
}

BusinessAccessUserSummary
InviteResponse::getCreatedByBusiness()
{
	return created_by_business;
}

void
InviteResponse::setCreatedByBusiness(BusinessAccessUserSummary  created_by_business)
{
	this->created_by_business = created_by_business;
}

BusinessAccessUserSummary
InviteResponse::getCreatedByUser()
{
	return created_by_user;
}

void
InviteResponse::setCreatedByUser(BusinessAccessUserSummary  created_by_user)
{
	this->created_by_user = created_by_user;
}

int
InviteResponse::getCreatedTime()
{
	return created_time;
}

void
InviteResponse::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

std::string
InviteResponse::getId()
{
	return id;
}

void
InviteResponse::setId(std::string  id)
{
	this->id = id;
}

BaseInviteDataResponse_invite_data
InviteResponse::getInviteData()
{
	return invite_data;
}

void
InviteResponse::setInviteData(BaseInviteDataResponse_invite_data  invite_data)
{
	this->invite_data = invite_data;
}

bool
InviteResponse::getIsReceivedInvite()
{
	return is_received_invite;
}

void
InviteResponse::setIsReceivedInvite(bool  is_received_invite)
{
	this->is_received_invite = is_received_invite;
}

BusinessAccessUserSummary
InviteResponse::getUser()
{
	return user;
}

void
InviteResponse::setUser(BusinessAccessUserSummary  user)
{
	this->user = user;
}


