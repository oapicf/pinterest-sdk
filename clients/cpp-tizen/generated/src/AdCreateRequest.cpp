#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdCreateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdCreateRequest::AdCreateRequest()
{
	//__init();
}

AdCreateRequest::~AdCreateRequest()
{
	//__cleanup();
}

void
AdCreateRequest::__init()
{
	//ad_group_id = std::string();
	//android_deep_link = std::string();
	//new std::list()std::list> carousel_android_deep_links;
	//new std::list()std::list> carousel_destination_urls;
	//new std::list()std::list> carousel_ios_deep_links;
	//click_tracking_url = std::string();
	//creative_type = new CreativeType();
	//destination_url = std::string();
	//ios_deep_link = std::string();
	//is_pin_deleted = bool(false);
	//is_removable = bool(false);
	//name = std::string();
	//pin_id = std::string();
	//status = new EntityStatus();
	//tracking_urls = new AdCommon_tracking_urls();
	//view_tracking_url = std::string();
}

void
AdCreateRequest::__cleanup()
{
	//if(ad_group_id != NULL) {
	//
	//delete ad_group_id;
	//ad_group_id = NULL;
	//}
	//if(android_deep_link != NULL) {
	//
	//delete android_deep_link;
	//android_deep_link = NULL;
	//}
	//if(carousel_android_deep_links != NULL) {
	//carousel_android_deep_links.RemoveAll(true);
	//delete carousel_android_deep_links;
	//carousel_android_deep_links = NULL;
	//}
	//if(carousel_destination_urls != NULL) {
	//carousel_destination_urls.RemoveAll(true);
	//delete carousel_destination_urls;
	//carousel_destination_urls = NULL;
	//}
	//if(carousel_ios_deep_links != NULL) {
	//carousel_ios_deep_links.RemoveAll(true);
	//delete carousel_ios_deep_links;
	//carousel_ios_deep_links = NULL;
	//}
	//if(click_tracking_url != NULL) {
	//
	//delete click_tracking_url;
	//click_tracking_url = NULL;
	//}
	//if(creative_type != NULL) {
	//
	//delete creative_type;
	//creative_type = NULL;
	//}
	//if(destination_url != NULL) {
	//
	//delete destination_url;
	//destination_url = NULL;
	//}
	//if(ios_deep_link != NULL) {
	//
	//delete ios_deep_link;
	//ios_deep_link = NULL;
	//}
	//if(is_pin_deleted != NULL) {
	//
	//delete is_pin_deleted;
	//is_pin_deleted = NULL;
	//}
	//if(is_removable != NULL) {
	//
	//delete is_removable;
	//is_removable = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(pin_id != NULL) {
	//
	//delete pin_id;
	//pin_id = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(tracking_urls != NULL) {
	//
	//delete tracking_urls;
	//tracking_urls = NULL;
	//}
	//if(view_tracking_url != NULL) {
	//
	//delete view_tracking_url;
	//view_tracking_url = NULL;
	//}
	//
}

void
AdCreateRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ad_group_idKey = "ad_group_id";
	node = json_object_get_member(pJsonObject, ad_group_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_group_id, node, "std::string", "");
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
	const gchar *carousel_android_deep_linksKey = "carousel_android_deep_links";
	node = json_object_get_member(pJsonObject, carousel_android_deep_linksKey);
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
			carousel_android_deep_links = new_list;
		}
		
	}
	const gchar *carousel_destination_urlsKey = "carousel_destination_urls";
	node = json_object_get_member(pJsonObject, carousel_destination_urlsKey);
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
			carousel_destination_urls = new_list;
		}
		
	}
	const gchar *carousel_ios_deep_linksKey = "carousel_ios_deep_links";
	node = json_object_get_member(pJsonObject, carousel_ios_deep_linksKey);
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
			carousel_ios_deep_links = new_list;
		}
		
	}
	const gchar *click_tracking_urlKey = "click_tracking_url";
	node = json_object_get_member(pJsonObject, click_tracking_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&click_tracking_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *creative_typeKey = "creative_type";
	node = json_object_get_member(pJsonObject, creative_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CreativeType")) {
			jsonToValue(&creative_type, node, "CreativeType", "CreativeType");
		} else {
			
			CreativeType* obj = static_cast<CreativeType*> (&creative_type);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *ios_deep_linkKey = "ios_deep_link";
	node = json_object_get_member(pJsonObject, ios_deep_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ios_deep_link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_pin_deletedKey = "is_pin_deleted";
	node = json_object_get_member(pJsonObject, is_pin_deletedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_pin_deleted, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_removableKey = "is_removable";
	node = json_object_get_member(pJsonObject, is_removableKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_removable, node, "bool", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pin_idKey = "pin_id";
	node = json_object_get_member(pJsonObject, pin_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&pin_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("EntityStatus")) {
			jsonToValue(&status, node, "EntityStatus", "EntityStatus");
		} else {
			
			EntityStatus* obj = static_cast<EntityStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *tracking_urlsKey = "tracking_urls";
	node = json_object_get_member(pJsonObject, tracking_urlsKey);
	if (node !=NULL) {
	

		if (isprimitive("AdCommon_tracking_urls")) {
			jsonToValue(&tracking_urls, node, "AdCommon_tracking_urls", "AdCommon_tracking_urls");
		} else {
			
			AdCommon_tracking_urls* obj = static_cast<AdCommon_tracking_urls*> (&tracking_urls);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *view_tracking_urlKey = "view_tracking_url";
	node = json_object_get_member(pJsonObject, view_tracking_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&view_tracking_url, node, "std::string", "");
		} else {
			
		}
	}
}

AdCreateRequest::AdCreateRequest(char* json)
{
	this->fromJson(json);
}

char*
AdCreateRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAdGroupId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_group_idKey = "ad_group_id";
	json_object_set_member(pJsonObject, ad_group_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAndroidDeepLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *android_deep_linkKey = "android_deep_link";
	json_object_set_member(pJsonObject, android_deep_linkKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCarouselAndroidDeepLinks());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCarouselAndroidDeepLinks());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *carousel_android_deep_linksKey = "carousel_android_deep_links";
	json_object_set_member(pJsonObject, carousel_android_deep_linksKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCarouselDestinationUrls());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCarouselDestinationUrls());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *carousel_destination_urlsKey = "carousel_destination_urls";
	json_object_set_member(pJsonObject, carousel_destination_urlsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getCarouselIosDeepLinks());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getCarouselIosDeepLinks());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *carousel_ios_deep_linksKey = "carousel_ios_deep_links";
	json_object_set_member(pJsonObject, carousel_ios_deep_linksKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getClickTrackingUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *click_tracking_urlKey = "click_tracking_url";
	json_object_set_member(pJsonObject, click_tracking_urlKey, node);
	if (isprimitive("CreativeType")) {
		CreativeType obj = getCreativeType();
		node = converttoJson(&obj, "CreativeType", "");
	}
	else {
		
		CreativeType obj = static_cast<CreativeType> (getCreativeType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *creative_typeKey = "creative_type";
	json_object_set_member(pJsonObject, creative_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDestinationUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *destination_urlKey = "destination_url";
	json_object_set_member(pJsonObject, destination_urlKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getIosDeepLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ios_deep_linkKey = "ios_deep_link";
	json_object_set_member(pJsonObject, ios_deep_linkKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsPinDeleted();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_pin_deletedKey = "is_pin_deleted";
	json_object_set_member(pJsonObject, is_pin_deletedKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsRemovable();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_removableKey = "is_removable";
	json_object_set_member(pJsonObject, is_removableKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPinId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pin_idKey = "pin_id";
	json_object_set_member(pJsonObject, pin_idKey, node);
	if (isprimitive("EntityStatus")) {
		EntityStatus obj = getStatus();
		node = converttoJson(&obj, "EntityStatus", "");
	}
	else {
		
		EntityStatus obj = static_cast<EntityStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("AdCommon_tracking_urls")) {
		AdCommon_tracking_urls obj = getTrackingUrls();
		node = converttoJson(&obj, "AdCommon_tracking_urls", "");
	}
	else {
		
		AdCommon_tracking_urls obj = static_cast<AdCommon_tracking_urls> (getTrackingUrls());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *tracking_urlsKey = "tracking_urls";
	json_object_set_member(pJsonObject, tracking_urlsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getViewTrackingUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *view_tracking_urlKey = "view_tracking_url";
	json_object_set_member(pJsonObject, view_tracking_urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdCreateRequest::getAdGroupId()
{
	return ad_group_id;
}

void
AdCreateRequest::setAdGroupId(std::string  ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

std::string
AdCreateRequest::getAndroidDeepLink()
{
	return android_deep_link;
}

void
AdCreateRequest::setAndroidDeepLink(std::string  android_deep_link)
{
	this->android_deep_link = android_deep_link;
}

std::list<std::string>
AdCreateRequest::getCarouselAndroidDeepLinks()
{
	return carousel_android_deep_links;
}

void
AdCreateRequest::setCarouselAndroidDeepLinks(std::list <std::string> carousel_android_deep_links)
{
	this->carousel_android_deep_links = carousel_android_deep_links;
}

std::list<std::string>
AdCreateRequest::getCarouselDestinationUrls()
{
	return carousel_destination_urls;
}

void
AdCreateRequest::setCarouselDestinationUrls(std::list <std::string> carousel_destination_urls)
{
	this->carousel_destination_urls = carousel_destination_urls;
}

std::list<std::string>
AdCreateRequest::getCarouselIosDeepLinks()
{
	return carousel_ios_deep_links;
}

void
AdCreateRequest::setCarouselIosDeepLinks(std::list <std::string> carousel_ios_deep_links)
{
	this->carousel_ios_deep_links = carousel_ios_deep_links;
}

std::string
AdCreateRequest::getClickTrackingUrl()
{
	return click_tracking_url;
}

void
AdCreateRequest::setClickTrackingUrl(std::string  click_tracking_url)
{
	this->click_tracking_url = click_tracking_url;
}

CreativeType
AdCreateRequest::getCreativeType()
{
	return creative_type;
}

void
AdCreateRequest::setCreativeType(CreativeType  creative_type)
{
	this->creative_type = creative_type;
}

std::string
AdCreateRequest::getDestinationUrl()
{
	return destination_url;
}

void
AdCreateRequest::setDestinationUrl(std::string  destination_url)
{
	this->destination_url = destination_url;
}

std::string
AdCreateRequest::getIosDeepLink()
{
	return ios_deep_link;
}

void
AdCreateRequest::setIosDeepLink(std::string  ios_deep_link)
{
	this->ios_deep_link = ios_deep_link;
}

bool
AdCreateRequest::getIsPinDeleted()
{
	return is_pin_deleted;
}

void
AdCreateRequest::setIsPinDeleted(bool  is_pin_deleted)
{
	this->is_pin_deleted = is_pin_deleted;
}

bool
AdCreateRequest::getIsRemovable()
{
	return is_removable;
}

void
AdCreateRequest::setIsRemovable(bool  is_removable)
{
	this->is_removable = is_removable;
}

std::string
AdCreateRequest::getName()
{
	return name;
}

void
AdCreateRequest::setName(std::string  name)
{
	this->name = name;
}

std::string
AdCreateRequest::getPinId()
{
	return pin_id;
}

void
AdCreateRequest::setPinId(std::string  pin_id)
{
	this->pin_id = pin_id;
}

EntityStatus
AdCreateRequest::getStatus()
{
	return status;
}

void
AdCreateRequest::setStatus(EntityStatus  status)
{
	this->status = status;
}

AdCommon_tracking_urls
AdCreateRequest::getTrackingUrls()
{
	return tracking_urls;
}

void
AdCreateRequest::setTrackingUrls(AdCommon_tracking_urls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

std::string
AdCreateRequest::getViewTrackingUrl()
{
	return view_tracking_url;
}

void
AdCreateRequest::setViewTrackingUrl(std::string  view_tracking_url)
{
	this->view_tracking_url = view_tracking_url;
}


