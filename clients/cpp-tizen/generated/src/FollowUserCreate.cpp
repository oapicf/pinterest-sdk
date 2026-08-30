#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "FollowUserCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

FollowUserCreate::FollowUserCreate()
{
	//__init();
}

FollowUserCreate::~FollowUserCreate()
{
	//__cleanup();
}

void
FollowUserCreate::__init()
{
	//auto_follow = bool(false);
}

void
FollowUserCreate::__cleanup()
{
	//if(auto_follow != NULL) {
	//
	//delete auto_follow;
	//auto_follow = NULL;
	//}
	//
}

void
FollowUserCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *auto_followKey = "auto_follow";
	node = json_object_get_member(pJsonObject, auto_followKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&auto_follow, node, "bool", "");
		} else {
			
		}
	}
}

FollowUserCreate::FollowUserCreate(char* json)
{
	this->fromJson(json);
}

char*
FollowUserCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getAutoFollow();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *auto_followKey = "auto_follow";
	json_object_set_member(pJsonObject, auto_followKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
FollowUserCreate::getAutoFollow()
{
	return auto_follow;
}

void
FollowUserCreate::setAutoFollow(bool  auto_follow)
{
	this->auto_follow = auto_follow;
}


