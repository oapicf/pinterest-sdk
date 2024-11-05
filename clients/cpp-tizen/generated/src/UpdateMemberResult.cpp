#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UpdateMemberResult.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UpdateMemberResult::UpdateMemberResult()
{
	//__init();
}

UpdateMemberResult::~UpdateMemberResult()
{
	//__cleanup();
}

void
UpdateMemberResult::__init()
{
	//business_role = std::string();
	//member_id = std::string();
}

void
UpdateMemberResult::__cleanup()
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
UpdateMemberResult::fromJson(char* jsonStr)
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
	const gchar *member_idKey = "member_id";
	node = json_object_get_member(pJsonObject, member_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&member_id, node, "std::string", "");
		} else {
			
		}
	}
}

UpdateMemberResult::UpdateMemberResult(char* json)
{
	this->fromJson(json);
}

char*
UpdateMemberResult::toJson()
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

std::string
UpdateMemberResult::getBusinessRole()
{
	return business_role;
}

void
UpdateMemberResult::setBusinessRole(std::string  business_role)
{
	this->business_role = business_role;
}

std::string
UpdateMemberResult::getMemberId()
{
	return member_id;
}

void
UpdateMemberResult::setMemberId(std::string  member_id)
{
	this->member_id = member_id;
}


