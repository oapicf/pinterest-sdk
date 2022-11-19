#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ConversionEventsUserData_anyOf_2.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ConversionEventsUserData_anyOf_2::ConversionEventsUserData_anyOf_2()
{
	//__init();
}

ConversionEventsUserData_anyOf_2::~ConversionEventsUserData_anyOf_2()
{
	//__cleanup();
}

void
ConversionEventsUserData_anyOf_2::__init()
{
	//client_ip_address = std::string();
	//client_user_agent = std::string();
}

void
ConversionEventsUserData_anyOf_2::__cleanup()
{
	//if(client_ip_address != NULL) {
	//
	//delete client_ip_address;
	//client_ip_address = NULL;
	//}
	//if(client_user_agent != NULL) {
	//
	//delete client_user_agent;
	//client_user_agent = NULL;
	//}
	//
}

void
ConversionEventsUserData_anyOf_2::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *client_ip_addressKey = "client_ip_address";
	node = json_object_get_member(pJsonObject, client_ip_addressKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&client_ip_address, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *client_user_agentKey = "client_user_agent";
	node = json_object_get_member(pJsonObject, client_user_agentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&client_user_agent, node, "std::string", "");
		} else {
			
		}
	}
}

ConversionEventsUserData_anyOf_2::ConversionEventsUserData_anyOf_2(char* json)
{
	this->fromJson(json);
}

char*
ConversionEventsUserData_anyOf_2::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getClientIpAddress();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *client_ip_addressKey = "client_ip_address";
	json_object_set_member(pJsonObject, client_ip_addressKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getClientUserAgent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *client_user_agentKey = "client_user_agent";
	json_object_set_member(pJsonObject, client_user_agentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
ConversionEventsUserData_anyOf_2::getClientIpAddress()
{
	return client_ip_address;
}

void
ConversionEventsUserData_anyOf_2::setClientIpAddress(std::string  client_ip_address)
{
	this->client_ip_address = client_ip_address;
}

std::string
ConversionEventsUserData_anyOf_2::getClientUserAgent()
{
	return client_user_agent;
}

void
ConversionEventsUserData_anyOf_2::setClientUserAgent(std::string  client_user_agent)
{
	this->client_user_agent = client_user_agent;
}


