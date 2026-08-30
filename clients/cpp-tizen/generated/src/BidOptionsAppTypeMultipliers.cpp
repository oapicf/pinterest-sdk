#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BidOptionsAppTypeMultipliers.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BidOptionsAppTypeMultipliers::BidOptionsAppTypeMultipliers()
{
	//__init();
}

BidOptionsAppTypeMultipliers::~BidOptionsAppTypeMultipliers()
{
	//__cleanup();
}

void
BidOptionsAppTypeMultipliers::__init()
{
	//android_mobile = double(0);
	//android_tablet = double(0);
	//ipad = double(0);
	//iphone = double(0);
	//web = double(0);
	//web_mobile = double(0);
}

void
BidOptionsAppTypeMultipliers::__cleanup()
{
	//if(android_mobile != NULL) {
	//
	//delete android_mobile;
	//android_mobile = NULL;
	//}
	//if(android_tablet != NULL) {
	//
	//delete android_tablet;
	//android_tablet = NULL;
	//}
	//if(ipad != NULL) {
	//
	//delete ipad;
	//ipad = NULL;
	//}
	//if(iphone != NULL) {
	//
	//delete iphone;
	//iphone = NULL;
	//}
	//if(web != NULL) {
	//
	//delete web;
	//web = NULL;
	//}
	//if(web_mobile != NULL) {
	//
	//delete web_mobile;
	//web_mobile = NULL;
	//}
	//
}

void
BidOptionsAppTypeMultipliers::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *android_mobileKey = "android_mobile";
	node = json_object_get_member(pJsonObject, android_mobileKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&android_mobile, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&android_mobile);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *android_tabletKey = "android_tablet";
	node = json_object_get_member(pJsonObject, android_tabletKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&android_tablet, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&android_tablet);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *ipadKey = "ipad";
	node = json_object_get_member(pJsonObject, ipadKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&ipad, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&ipad);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *iphoneKey = "iphone";
	node = json_object_get_member(pJsonObject, iphoneKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&iphone, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&iphone);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *webKey = "web";
	node = json_object_get_member(pJsonObject, webKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&web, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&web);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *web_mobileKey = "web_mobile";
	node = json_object_get_member(pJsonObject, web_mobileKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&web_mobile, node, "long long", "");
		} else {
			
			long long* obj = static_cast<long long*> (&web_mobile);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BidOptionsAppTypeMultipliers::BidOptionsAppTypeMultipliers(char* json)
{
	this->fromJson(json);
}

char*
BidOptionsAppTypeMultipliers::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getAndroidMobile();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getAndroidMobile());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *android_mobileKey = "android_mobile";
	json_object_set_member(pJsonObject, android_mobileKey, node);
	if (isprimitive("long long")) {
		long long obj = getAndroidTablet();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getAndroidTablet());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *android_tabletKey = "android_tablet";
	json_object_set_member(pJsonObject, android_tabletKey, node);
	if (isprimitive("long long")) {
		long long obj = getIpad();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getIpad());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ipadKey = "ipad";
	json_object_set_member(pJsonObject, ipadKey, node);
	if (isprimitive("long long")) {
		long long obj = getIphone();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getIphone());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *iphoneKey = "iphone";
	json_object_set_member(pJsonObject, iphoneKey, node);
	if (isprimitive("long long")) {
		long long obj = getWeb();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getWeb());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *webKey = "web";
	json_object_set_member(pJsonObject, webKey, node);
	if (isprimitive("long long")) {
		long long obj = getWebMobile();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
		long long obj = static_cast<long long> (getWebMobile());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *web_mobileKey = "web_mobile";
	json_object_set_member(pJsonObject, web_mobileKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
BidOptionsAppTypeMultipliers::getAndroidMobile()
{
	return android_mobile;
}

void
BidOptionsAppTypeMultipliers::setAndroidMobile(long long  android_mobile)
{
	this->android_mobile = android_mobile;
}

long long
BidOptionsAppTypeMultipliers::getAndroidTablet()
{
	return android_tablet;
}

void
BidOptionsAppTypeMultipliers::setAndroidTablet(long long  android_tablet)
{
	this->android_tablet = android_tablet;
}

long long
BidOptionsAppTypeMultipliers::getIpad()
{
	return ipad;
}

void
BidOptionsAppTypeMultipliers::setIpad(long long  ipad)
{
	this->ipad = ipad;
}

long long
BidOptionsAppTypeMultipliers::getIphone()
{
	return iphone;
}

void
BidOptionsAppTypeMultipliers::setIphone(long long  iphone)
{
	this->iphone = iphone;
}

long long
BidOptionsAppTypeMultipliers::getWeb()
{
	return web;
}

void
BidOptionsAppTypeMultipliers::setWeb(long long  web)
{
	this->web = web;
}

long long
BidOptionsAppTypeMultipliers::getWebMobile()
{
	return web_mobile;
}

void
BidOptionsAppTypeMultipliers::setWebMobile(long long  web_mobile)
{
	this->web_mobile = web_mobile;
}


