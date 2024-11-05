#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CreateMembershipOrPartnershipInvitesBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CreateMembershipOrPartnershipInvitesBody::CreateMembershipOrPartnershipInvitesBody()
{
	//__init();
}

CreateMembershipOrPartnershipInvitesBody::~CreateMembershipOrPartnershipInvitesBody()
{
	//__cleanup();
}

void
CreateMembershipOrPartnershipInvitesBody::__init()
{
	//business_role = std::string();
	//invite_type = new InviteType();
	//new std::list()std::list> members;
	//new std::list()std::list> partners;
}

void
CreateMembershipOrPartnershipInvitesBody::__cleanup()
{
	//if(business_role != NULL) {
	//
	//delete business_role;
	//business_role = NULL;
	//}
	//if(invite_type != NULL) {
	//
	//delete invite_type;
	//invite_type = NULL;
	//}
	//if(members != NULL) {
	//members.RemoveAll(true);
	//delete members;
	//members = NULL;
	//}
	//if(partners != NULL) {
	//partners.RemoveAll(true);
	//delete partners;
	//partners = NULL;
	//}
	//
}

void
CreateMembershipOrPartnershipInvitesBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *business_roleKey = "business_role";
	node = json_object_get_member(pJsonObject, business_roleKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&business_role, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *invite_typeKey = "invite_type";
	node = json_object_get_member(pJsonObject, invite_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("InviteType")) {
			jsonToValue(&invite_type, node, "InviteType", "InviteType");
		} else {
			
			InviteType* obj = static_cast<InviteType*> (&invite_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *membersKey = "members";
	node = json_object_get_member(pJsonObject, membersKey);
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
			members = new_list;
		}
		
	}
	const gchar *partnersKey = "partners";
	node = json_object_get_member(pJsonObject, partnersKey);
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
			partners = new_list;
		}
		
	}
}

CreateMembershipOrPartnershipInvitesBody::CreateMembershipOrPartnershipInvitesBody(char* json)
{
	this->fromJson(json);
}

char*
CreateMembershipOrPartnershipInvitesBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getBusinessRole();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *business_roleKey = "business_role";
	json_object_set_member(pJsonObject, business_roleKey, node);
	if (isprimitive("InviteType")) {
		InviteType obj = getInviteType();
		node = converttoJson(&obj, "InviteType", "");
	}
	else {
		
		InviteType obj = static_cast<InviteType> (getInviteType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *invite_typeKey = "invite_type";
	json_object_set_member(pJsonObject, invite_typeKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getMembers());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getMembers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *membersKey = "members";
	json_object_set_member(pJsonObject, membersKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getPartners());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getPartners());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *partnersKey = "partners";
	json_object_set_member(pJsonObject, partnersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CreateMembershipOrPartnershipInvitesBody::getBusinessRole()
{
	return business_role;
}

void
CreateMembershipOrPartnershipInvitesBody::setBusinessRole(std::string  business_role)
{
	this->business_role = business_role;
}

InviteType
CreateMembershipOrPartnershipInvitesBody::getInviteType()
{
	return invite_type;
}

void
CreateMembershipOrPartnershipInvitesBody::setInviteType(InviteType  invite_type)
{
	this->invite_type = invite_type;
}

std::list<std::string>
CreateMembershipOrPartnershipInvitesBody::getMembers()
{
	return members;
}

void
CreateMembershipOrPartnershipInvitesBody::setMembers(std::list <std::string> members)
{
	this->members = members;
}

std::list<std::string>
CreateMembershipOrPartnershipInvitesBody::getPartners()
{
	return partners;
}

void
CreateMembershipOrPartnershipInvitesBody::setPartners(std::list <std::string> partners)
{
	this->partners = partners;
}


