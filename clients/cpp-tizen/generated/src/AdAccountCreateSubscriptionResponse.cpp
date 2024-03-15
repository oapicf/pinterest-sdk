#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdAccountCreateSubscriptionResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdAccountCreateSubscriptionResponse::AdAccountCreateSubscriptionResponse()
{
	//__init();
}

AdAccountCreateSubscriptionResponse::~AdAccountCreateSubscriptionResponse()
{
	//__cleanup();
}

void
AdAccountCreateSubscriptionResponse::__init()
{
	//id = std::string();
	//cryptographic_key = std::string();
	//cryptographic_algorithm = std::string();
	//created_time = int(0);
}

void
AdAccountCreateSubscriptionResponse::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(cryptographic_key != NULL) {
	//
	//delete cryptographic_key;
	//cryptographic_key = NULL;
	//}
	//if(cryptographic_algorithm != NULL) {
	//
	//delete cryptographic_algorithm;
	//cryptographic_algorithm = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//
}

void
AdAccountCreateSubscriptionResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *cryptographic_keyKey = "cryptographic_key";
	node = json_object_get_member(pJsonObject, cryptographic_keyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cryptographic_key, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *cryptographic_algorithmKey = "cryptographic_algorithm";
	node = json_object_get_member(pJsonObject, cryptographic_algorithmKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&cryptographic_algorithm, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *created_timeKey = "created_time";
	node = json_object_get_member(pJsonObject, created_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_time, node, "int", "");
		} else {
			
		}
	}
}

AdAccountCreateSubscriptionResponse::AdAccountCreateSubscriptionResponse(char* json)
{
	this->fromJson(json);
}

char*
AdAccountCreateSubscriptionResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCryptographicKey();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cryptographic_keyKey = "cryptographic_key";
	json_object_set_member(pJsonObject, cryptographic_keyKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCryptographicAlgorithm();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *cryptographic_algorithmKey = "cryptographic_algorithm";
	json_object_set_member(pJsonObject, cryptographic_algorithmKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdAccountCreateSubscriptionResponse::getId()
{
	return id;
}

void
AdAccountCreateSubscriptionResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
AdAccountCreateSubscriptionResponse::getCryptographicKey()
{
	return cryptographic_key;
}

void
AdAccountCreateSubscriptionResponse::setCryptographicKey(std::string  cryptographic_key)
{
	this->cryptographic_key = cryptographic_key;
}

std::string
AdAccountCreateSubscriptionResponse::getCryptographicAlgorithm()
{
	return cryptographic_algorithm;
}

void
AdAccountCreateSubscriptionResponse::setCryptographicAlgorithm(std::string  cryptographic_algorithm)
{
	this->cryptographic_algorithm = cryptographic_algorithm;
}

int
AdAccountCreateSubscriptionResponse::getCreatedTime()
{
	return created_time;
}

void
AdAccountCreateSubscriptionResponse::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}


