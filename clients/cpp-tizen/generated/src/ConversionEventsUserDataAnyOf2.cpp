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
	//new std::list()std::list> em;
	//new std::list()std::list> hashed_maids;
	//client_ip_address = std::string();
	//client_user_agent = std::string();
}

void
ConversionEventsUserData_anyOf_2::__cleanup()
{
	//if(em != NULL) {
	//em.RemoveAll(true);
	//delete em;
	//em = NULL;
	//}
	//if(hashed_maids != NULL) {
	//hashed_maids.RemoveAll(true);
	//delete hashed_maids;
	//hashed_maids = NULL;
	//}
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
	const gchar *emKey = "em";
	node = json_object_get_member(pJsonObject, emKey);
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
			em = new_list;
		}
		
	}
	const gchar *hashed_maidsKey = "hashed_maids";
	node = json_object_get_member(pJsonObject, hashed_maidsKey);
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
			hashed_maids = new_list;
		}
		
	}
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
		list<std::string> new_list = static_cast<list <std::string> > (getEm());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getEm());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *emKey = "em";
	json_object_set_member(pJsonObject, emKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getHashedMaids());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getHashedMaids());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *hashed_maidsKey = "hashed_maids";
	json_object_set_member(pJsonObject, hashed_maidsKey, node);
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

std::list<std::string>
ConversionEventsUserData_anyOf_2::getEm()
{
	return em;
}

void
ConversionEventsUserData_anyOf_2::setEm(std::list <std::string> em)
{
	this->em = em;
}

std::list<std::string>
ConversionEventsUserData_anyOf_2::getHashedMaids()
{
	return hashed_maids;
}

void
ConversionEventsUserData_anyOf_2::setHashedMaids(std::list <std::string> hashed_maids)
{
	this->hashed_maids = hashed_maids;
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


