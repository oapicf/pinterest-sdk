#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BusinessAccessUserSummary.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BusinessAccessUserSummary::BusinessAccessUserSummary()
{
	//__init();
}

BusinessAccessUserSummary::~BusinessAccessUserSummary()
{
	//__cleanup();
}

void
BusinessAccessUserSummary::__init()
{
	//email = std::string();
	//id = std::string();
	//username = std::string();
}

void
BusinessAccessUserSummary::__cleanup()
{
	//if(email != NULL) {
	//
	//delete email;
	//email = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(username != NULL) {
	//
	//delete username;
	//username = NULL;
	//}
	//
}

void
BusinessAccessUserSummary::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *emailKey = "email";
	node = json_object_get_member(pJsonObject, emailKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&email, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *usernameKey = "username";
	node = json_object_get_member(pJsonObject, usernameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&username, node, "std::string", "");
		} else {
			
		}
	}
}

BusinessAccessUserSummary::BusinessAccessUserSummary(char* json)
{
	this->fromJson(json);
}

char*
BusinessAccessUserSummary::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getEmail();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *emailKey = "email";
	json_object_set_member(pJsonObject, emailKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
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
BusinessAccessUserSummary::getEmail()
{
	return email;
}

void
BusinessAccessUserSummary::setEmail(std::string  email)
{
	this->email = email;
}

std::string
BusinessAccessUserSummary::getId()
{
	return id;
}

void
BusinessAccessUserSummary::setId(std::string  id)
{
	this->id = id;
}

std::string
BusinessAccessUserSummary::getUsername()
{
	return username;
}

void
BusinessAccessUserSummary::setUsername(std::string  username)
{
	this->username = username;
}


