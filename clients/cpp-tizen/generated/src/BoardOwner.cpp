#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Board_owner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Board_owner::Board_owner()
{
	//__init();
}

Board_owner::~Board_owner()
{
	//__cleanup();
}

void
Board_owner::__init()
{
	//username = std::string();
}

void
Board_owner::__cleanup()
{
	//if(username != NULL) {
	//
	//delete username;
	//username = NULL;
	//}
	//
}

void
Board_owner::fromJson(char* jsonStr)
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

Board_owner::Board_owner(char* json)
{
	this->fromJson(json);
}

char*
Board_owner::toJson()
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
Board_owner::getUsername()
{
	return username;
}

void
Board_owner::setUsername(std::string  username)
{
	this->username = username;
}


