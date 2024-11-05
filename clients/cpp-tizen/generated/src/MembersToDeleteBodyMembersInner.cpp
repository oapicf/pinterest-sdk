#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MembersToDeleteBody_members_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MembersToDeleteBody_members_inner::MembersToDeleteBody_members_inner()
{
	//__init();
}

MembersToDeleteBody_members_inner::~MembersToDeleteBody_members_inner()
{
	//__cleanup();
}

void
MembersToDeleteBody_members_inner::__init()
{
	//member_id = std::string();
	//business_role = new BusinessRoleForMembers();
}

void
MembersToDeleteBody_members_inner::__cleanup()
{
	//if(member_id != NULL) {
	//
	//delete member_id;
	//member_id = NULL;
	//}
	//if(business_role != NULL) {
	//
	//delete business_role;
	//business_role = NULL;
	//}
	//
}

void
MembersToDeleteBody_members_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *member_idKey = "member_id";
	node = json_object_get_member(pJsonObject, member_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&member_id, node, "std::string", "");
		} else {
			
		}
	}
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
}

MembersToDeleteBody_members_inner::MembersToDeleteBody_members_inner(char* json)
{
	this->fromJson(json);
}

char*
MembersToDeleteBody_members_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getMemberId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *member_idKey = "member_id";
	json_object_set_member(pJsonObject, member_idKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
MembersToDeleteBody_members_inner::getMemberId()
{
	return member_id;
}

void
MembersToDeleteBody_members_inner::setMemberId(std::string  member_id)
{
	this->member_id = member_id;
}

BusinessRoleForMembers
MembersToDeleteBody_members_inner::getBusinessRole()
{
	return business_role;
}

void
MembersToDeleteBody_members_inner::setBusinessRole(BusinessRoleForMembers  business_role)
{
	this->business_role = business_role;
}


