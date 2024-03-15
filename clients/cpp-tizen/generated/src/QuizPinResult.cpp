#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "QuizPinResult.h"

using namespace std;
using namespace Tizen::ArtikCloud;

QuizPinResult::QuizPinResult()
{
	//__init();
}

QuizPinResult::~QuizPinResult()
{
	//__cleanup();
}

void
QuizPinResult::__init()
{
	//organic_pin_id = std::string();
	//android_deep_link = std::string();
	//ios_deep_link = std::string();
	//destination_url = std::string();
	//result_id = double(0);
}

void
QuizPinResult::__cleanup()
{
	//if(organic_pin_id != NULL) {
	//
	//delete organic_pin_id;
	//organic_pin_id = NULL;
	//}
	//if(android_deep_link != NULL) {
	//
	//delete android_deep_link;
	//android_deep_link = NULL;
	//}
	//if(ios_deep_link != NULL) {
	//
	//delete ios_deep_link;
	//ios_deep_link = NULL;
	//}
	//if(destination_url != NULL) {
	//
	//delete destination_url;
	//destination_url = NULL;
	//}
	//if(result_id != NULL) {
	//
	//delete result_id;
	//result_id = NULL;
	//}
	//
}

void
QuizPinResult::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *organic_pin_idKey = "organic_pin_id";
	node = json_object_get_member(pJsonObject, organic_pin_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&organic_pin_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *android_deep_linkKey = "android_deep_link";
	node = json_object_get_member(pJsonObject, android_deep_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&android_deep_link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *ios_deep_linkKey = "ios_deep_link";
	node = json_object_get_member(pJsonObject, ios_deep_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ios_deep_link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *destination_urlKey = "destination_url";
	node = json_object_get_member(pJsonObject, destination_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&destination_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *result_idKey = "result_id";
	node = json_object_get_member(pJsonObject, result_idKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&result_id, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&result_id);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

QuizPinResult::QuizPinResult(char* json)
{
	this->fromJson(json);
}

char*
QuizPinResult::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getOrganicPinId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *organic_pin_idKey = "organic_pin_id";
	json_object_set_member(pJsonObject, organic_pin_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAndroidDeepLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *android_deep_linkKey = "android_deep_link";
	json_object_set_member(pJsonObject, android_deep_linkKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getIosDeepLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ios_deep_linkKey = "ios_deep_link";
	json_object_set_member(pJsonObject, ios_deep_linkKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDestinationUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *destination_urlKey = "destination_url";
	json_object_set_member(pJsonObject, destination_urlKey, node);
	if (isprimitive("long long")) {
		long long obj = getResultId();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getResultId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *result_idKey = "result_id";
	json_object_set_member(pJsonObject, result_idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
QuizPinResult::getOrganicPinId()
{
	return organic_pin_id;
}

void
QuizPinResult::setOrganicPinId(std::string  organic_pin_id)
{
	this->organic_pin_id = organic_pin_id;
}

std::string
QuizPinResult::getAndroidDeepLink()
{
	return android_deep_link;
}

void
QuizPinResult::setAndroidDeepLink(std::string  android_deep_link)
{
	this->android_deep_link = android_deep_link;
}

std::string
QuizPinResult::getIosDeepLink()
{
	return ios_deep_link;
}

void
QuizPinResult::setIosDeepLink(std::string  ios_deep_link)
{
	this->ios_deep_link = ios_deep_link;
}

std::string
QuizPinResult::getDestinationUrl()
{
	return destination_url;
}

void
QuizPinResult::setDestinationUrl(std::string  destination_url)
{
	this->destination_url = destination_url;
}

long long
QuizPinResult::getResultId()
{
	return result_id;
}

void
QuizPinResult::setResultId(long long  result_id)
{
	this->result_id = result_id;
}


