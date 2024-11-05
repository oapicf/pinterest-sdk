#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CancelInvitesBody.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CancelInvitesBody::CancelInvitesBody()
{
	//__init();
}

CancelInvitesBody::~CancelInvitesBody()
{
	//__cleanup();
}

void
CancelInvitesBody::__init()
{
	//new std::list()std::list> invite_ids;
}

void
CancelInvitesBody::__cleanup()
{
	//if(invite_ids != NULL) {
	//invite_ids.RemoveAll(true);
	//delete invite_ids;
	//invite_ids = NULL;
	//}
	//
}

void
CancelInvitesBody::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *invite_idsKey = "invite_ids";
	node = json_object_get_member(pJsonObject, invite_idsKey);
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
			invite_ids = new_list;
		}
		
	}
}

CancelInvitesBody::CancelInvitesBody(char* json)
{
	this->fromJson(json);
}

char*
CancelInvitesBody::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getInviteIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getInviteIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *invite_idsKey = "invite_ids";
	json_object_set_member(pJsonObject, invite_idsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<std::string>
CancelInvitesBody::getInviteIds()
{
	return invite_ids;
}

void
CancelInvitesBody::setInviteIds(std::list <std::string> invite_ids)
{
	this->invite_ids = invite_ids;
}


