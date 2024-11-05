#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateMemberBusinessRoleBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateMemberBusinessRoleBody::UpdateMemberBusinessRoleBody()
{
	//__init();
}

UpdateMemberBusinessRoleBody::~UpdateMemberBusinessRoleBody()
{
	//__cleanup();
}

void
UpdateMemberBusinessRoleBody::__init()
{
	//business_role = new BusinessRoleForMembers();
	//member_id = std::string();
}

void
UpdateMemberBusinessRoleBody::__cleanup()
{
	//if(business_role != NULL) {
	//
	//delete business_role;
	//business_role = NULL;
	//}
	//if(member_id != NULL) {
	//
	//delete member_id;
	//member_id = NULL;
	//}
	//
}

void
UpdateMemberBusinessRoleBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *business_roleKey = "business_role";
	node = json_object_get_member(pJsonObject, business_roleKey);
	if (node !=NULL) {
	

		if (isprimitive("BusinessRoleForMembers")) {
			jsonToValue(&business_role, node, "BusinessRoleForMembers", "BusinessRoleForMembers");
		} else {
			
			BusinessRoleForMembers* obj = static_cast<BusinessRoleForMembers*> (&business_role);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *member_idKey = "member_id";
	node = json_object_get_member(pJsonObject, member_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&member_id, node, "std::string", "");
		} else {
			
		}
	}
}

UpdateMemberBusinessRoleBody::UpdateMemberBusinessRoleBody(char* json)
{
	this->fromJson(json);
}

char*
UpdateMemberBusinessRoleBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("BusinessRoleForMembers")) {
		BusinessRoleForMembers obj = getBusinessRole();
		node = converttoJson(&obj, "BusinessRoleForMembers", "");
	}
	else {
		
		BusinessRoleForMembers obj = static_cast<BusinessRoleForMembers> (getBusinessRole());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *business_roleKey = "business_role";
	json_object_set_member(pJsonObject, business_roleKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMemberId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *member_idKey = "member_id";
	json_object_set_member(pJsonObject, member_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

BusinessRoleForMembers
UpdateMemberBusinessRoleBody::getBusinessRole()
{
	return business_role;
}

void
UpdateMemberBusinessRoleBody::setBusinessRole(BusinessRoleForMembers  business_role)
{
	this->business_role = business_role;
}

std::string
UpdateMemberBusinessRoleBody::getMemberId()
{
	return member_id;
}

void
UpdateMemberBusinessRoleBody::setMemberId(std::string  member_id)
{
	this->member_id = member_id;
}


