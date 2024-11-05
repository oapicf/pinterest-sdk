#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MembersToDeleteBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MembersToDeleteBody::MembersToDeleteBody()
{
	//__init();
}

MembersToDeleteBody::~MembersToDeleteBody()
{
	//__cleanup();
}

void
MembersToDeleteBody::__init()
{
	//new std::list()std::list> members;
}

void
MembersToDeleteBody::__cleanup()
{
	//if(members != NULL) {
	//members.RemoveAll(true);
	//delete members;
	//members = NULL;
	//}
	//
}

void
MembersToDeleteBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *membersKey = "members";
	node = json_object_get_member(pJsonObject, membersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MembersToDeleteBody_members_inner> new_list;
			MembersToDeleteBody_members_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MembersToDeleteBody_members_inner")) {
					jsonToValue(&inst, temp_json, "MembersToDeleteBody_members_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			members = new_list;
		}
		
	}
}

MembersToDeleteBody::MembersToDeleteBody(char* json)
{
	this->fromJson(json);
}

char*
MembersToDeleteBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("MembersToDeleteBody_members_inner")) {
		list<MembersToDeleteBody_members_inner> new_list = static_cast<list <MembersToDeleteBody_members_inner> > (getMembers());
		node = converttoJson(&new_list, "MembersToDeleteBody_members_inner", "array");
	} else {
		node = json_node_alloc();
		list<MembersToDeleteBody_members_inner> new_list = static_cast<list <MembersToDeleteBody_members_inner> > (getMembers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MembersToDeleteBody_members_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MembersToDeleteBody_members_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *membersKey = "members";
	json_object_set_member(pJsonObject, membersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<MembersToDeleteBody_members_inner>
MembersToDeleteBody::getMembers()
{
	return members;
}

void
MembersToDeleteBody::setMembers(std::list <MembersToDeleteBody_members_inner> members)
{
	this->members = members;
}


