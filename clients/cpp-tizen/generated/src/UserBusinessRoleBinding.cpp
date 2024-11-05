#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UserBusinessRoleBinding.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UserBusinessRoleBinding::UserBusinessRoleBinding()
{
	//__init();
}

UserBusinessRoleBinding::~UserBusinessRoleBinding()
{
	//__cleanup();
}

void
UserBusinessRoleBinding::__init()
{
	//assets_summary = null;
	//new std::list()std::list> business_roles;
	//created_by_business = null;
	//created_by_user = null;
	//created_time = int(0);
	//id = std::string();
	//is_shared_partner = bool(false);
	//user = null;
}

void
UserBusinessRoleBinding::__cleanup()
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
	//if(is_shared_partner != NULL) {
	//
	//delete is_shared_partner;
	//is_shared_partner = NULL;
	//}
	//if(user != NULL) {
	//
	//delete user;
	//user = NULL;
	//}
	//
}

void
UserBusinessRoleBinding::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *assets_summaryKey = "assets_summary";
	node = json_object_get_member(pJsonObject, assets_summaryKey);
	if (node !=NULL) {
	

		if (isprimitive("BusinessMemberAssetsSummary")) {
			jsonToValue(&assets_summary, node, "BusinessMemberAssetsSummary", "BusinessMemberAssetsSummary");
		} else {
			
			BusinessMemberAssetsSummary* obj = static_cast<BusinessMemberAssetsSummary*> (&assets_summary);
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
	const gchar *is_shared_partnerKey = "is_shared_partner";
	node = json_object_get_member(pJsonObject, is_shared_partnerKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_shared_partner, node, "bool", "");
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

UserBusinessRoleBinding::UserBusinessRoleBinding(char* json)
{
	this->fromJson(json);
}

char*
UserBusinessRoleBinding::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("BusinessMemberAssetsSummary")) {
		BusinessMemberAssetsSummary obj = getAssetsSummary();
		node = converttoJson(&obj, "BusinessMemberAssetsSummary", "");
	}
	else {
		
		BusinessMemberAssetsSummary obj = static_cast<BusinessMemberAssetsSummary> (getAssetsSummary());
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
	if (isprimitive("bool")) {
		bool obj = getIsSharedPartner();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_shared_partnerKey = "is_shared_partner";
	json_object_set_member(pJsonObject, is_shared_partnerKey, node);
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

BusinessMemberAssetsSummary
UserBusinessRoleBinding::getAssetsSummary()
{
	return assets_summary;
}

void
UserBusinessRoleBinding::setAssetsSummary(BusinessMemberAssetsSummary  assets_summary)
{
	this->assets_summary = assets_summary;
}

std::list<std::string>
UserBusinessRoleBinding::getBusinessRoles()
{
	return business_roles;
}

void
UserBusinessRoleBinding::setBusinessRoles(std::list <std::string> business_roles)
{
	this->business_roles = business_roles;
}

BusinessAccessUserSummary
UserBusinessRoleBinding::getCreatedByBusiness()
{
	return created_by_business;
}

void
UserBusinessRoleBinding::setCreatedByBusiness(BusinessAccessUserSummary  created_by_business)
{
	this->created_by_business = created_by_business;
}

BusinessAccessUserSummary
UserBusinessRoleBinding::getCreatedByUser()
{
	return created_by_user;
}

void
UserBusinessRoleBinding::setCreatedByUser(BusinessAccessUserSummary  created_by_user)
{
	this->created_by_user = created_by_user;
}

int
UserBusinessRoleBinding::getCreatedTime()
{
	return created_time;
}

void
UserBusinessRoleBinding::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

std::string
UserBusinessRoleBinding::getId()
{
	return id;
}

void
UserBusinessRoleBinding::setId(std::string  id)
{
	this->id = id;
}

bool
UserBusinessRoleBinding::getIsSharedPartner()
{
	return is_shared_partner;
}

void
UserBusinessRoleBinding::setIsSharedPartner(bool  is_shared_partner)
{
	this->is_shared_partner = is_shared_partner;
}

BusinessAccessUserSummary
UserBusinessRoleBinding::getUser()
{
	return user;
}

void
UserBusinessRoleBinding::setUser(BusinessAccessUserSummary  user)
{
	this->user = user;
}


