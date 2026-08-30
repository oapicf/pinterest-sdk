#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Delete_business_membership_200_response.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Delete_business_membership_200_response::Delete_business_membership_200_response()
{
	//__init();
}

Delete_business_membership_200_response::~Delete_business_membership_200_response()
{
	//__cleanup();
}

void
Delete_business_membership_200_response::__init()
{
	//new std::list()std::list> deleted_members;
}

void
Delete_business_membership_200_response::__cleanup()
{
	//if(deleted_members != NULL) {
	//deleted_members.RemoveAll(true);
	//delete deleted_members;
	//deleted_members = NULL;
	//}
	//
}

void
Delete_business_membership_200_response::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *deleted_membersKey = "deleted_members";
	node = json_object_get_member(pJsonObject, deleted_membersKey);
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
			deleted_members = new_list;
		}
		
	}
}

Delete_business_membership_200_response::Delete_business_membership_200_response(char* json)
{
	this->fromJson(json);
}

char*
Delete_business_membership_200_response::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getDeletedMembers());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getDeletedMembers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *deleted_membersKey = "deleted_members";
	json_object_set_member(pJsonObject, deleted_membersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
Delete_business_membership_200_response::getDeletedMembers()
{
	return deleted_members;
}

void
Delete_business_membership_200_response::setDeletedMembers(std::list <std::string> deleted_members)
{
	this->deleted_members = deleted_members;
}


