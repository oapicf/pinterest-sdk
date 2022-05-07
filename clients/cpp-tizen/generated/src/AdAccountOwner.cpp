#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Ad_account_owner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Ad_account_owner::Ad_account_owner()
{
	//__init();
}

Ad_account_owner::~Ad_account_owner()
{
	//__cleanup();
}

void
Ad_account_owner::__init()
{
	//username = std::string();
}

void
Ad_account_owner::__cleanup()
{
	//if(username != NULL) {
	//
	//delete username;
	//username = NULL;
	//}
	//
}

void
Ad_account_owner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *usernameKey = "username";
	node = json_object_get_member(pJsonObject, usernameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&username, node, "std::string", "");
		} else {
			
		}
	}
}

Ad_account_owner::Ad_account_owner(char* json)
{
	this->fromJson(json);
}

char*
Ad_account_owner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getUsername();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *usernameKey = "username";
	json_object_set_member(pJsonObject, usernameKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Ad_account_owner::getUsername()
{
	return username;
}

void
Ad_account_owner::setUsername(std::string  username)
{
	this->username = username;
}


