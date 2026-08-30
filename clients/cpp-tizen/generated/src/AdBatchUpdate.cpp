#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdBatchUpdate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdBatchUpdate::AdBatchUpdate()
{
	//__init();
}

AdBatchUpdate::~AdBatchUpdate()
{
	//__cleanup();
}

void
AdBatchUpdate::__init()
{
	//ad_group_id = std::string();
	//android_deep_link = std::string();
	//new std::list()std::list> carousel_android_deep_links;
	//new std::list()std::list> carousel_destination_urls;
	//new std::list()std::list> carousel_ios_deep_links;
	//click_tracking_url = std::string();
	//collection_items_destination_url_template = std::string();
	//collections_header_type = null;
	//creative_type = new CreativeType();
	//customizable_cta_type = new CustomizableCTAType();
	//destination_url = std::string();
	//disclosure_type = new DisclosureType();
	//disclosure_url = std::string();
	//grid_click_type = new GridClickType();
	//id = std::string();
	//ios_deep_link = std::string();
	//is_carting = bool(false);
	//is_collage_accepted_terms = bool(false);
	//is_collage_single_destination = bool(false);
	//is_pin_deleted = bool(false);
	//is_removable = bool(false);
	//lead_form_id = std::string();
	//name = std::string();
	//pin_id = std::string();
	//quiz_pin_data = null;
	//status = new EntityStatus();
	//tracking_urls = new TrackingUrls();
	//view_tracking_url = std::string();
}

void
AdBatchUpdate::__cleanup()
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
	//if(collection_items_destination_url_template != NULL) {
	//
	//delete collection_items_destination_url_template;
	//collection_items_destination_url_template = NULL;
	//}
	//if(collections_header_type != NULL) {
	//
	//delete collections_header_type;
	//collections_header_type = NULL;
	//}
	//if(creative_type != NULL) {
	//
	//delete creative_type;
	//creative_type = NULL;
	//}
	//if(customizable_cta_type != NULL) {
	//
	//delete customizable_cta_type;
	//customizable_cta_type = NULL;
	//}
	//if(destination_url != NULL) {
	//
	//delete destination_url;
	//destination_url = NULL;
	//}
	//if(disclosure_type != NULL) {
	//
	//delete disclosure_type;
	//disclosure_type = NULL;
	//}
	//if(disclosure_url != NULL) {
	//
	//delete disclosure_url;
	//disclosure_url = NULL;
	//}
	//if(grid_click_type != NULL) {
	//
	//delete grid_click_type;
	//grid_click_type = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(ios_deep_link != NULL) {
	//
	//delete ios_deep_link;
	//ios_deep_link = NULL;
	//}
	//if(is_carting != NULL) {
	//
	//delete is_carting;
	//is_carting = NULL;
	//}
	//if(is_collage_accepted_terms != NULL) {
	//
	//delete is_collage_accepted_terms;
	//is_collage_accepted_terms = NULL;
	//}
	//if(is_collage_single_destination != NULL) {
	//
	//delete is_collage_single_destination;
	//is_collage_single_destination = NULL;
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
	//if(lead_form_id != NULL) {
	//
	//delete lead_form_id;
	//lead_form_id = NULL;
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
	//if(quiz_pin_data != NULL) {
	//
	//delete quiz_pin_data;
	//quiz_pin_data = NULL;
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
AdBatchUpdate::fromJson(char* jsonStr)
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
	const gchar *collection_items_destination_url_templateKey = "collection_items_destination_url_template";
	node = json_object_get_member(pJsonObject, collection_items_destination_url_templateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&collection_items_destination_url_template, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *collections_header_typeKey = "collections_header_type";
	node = json_object_get_member(pJsonObject, collections_header_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AdCollectionsHeaderType")) {
			jsonToValue(&collections_header_type, node, "AdCollectionsHeaderType", "AdCollectionsHeaderType");
		} else {
			
			AdCollectionsHeaderType* obj = static_cast<AdCollectionsHeaderType*> (&collections_header_type);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *customizable_cta_typeKey = "customizable_cta_type";
	node = json_object_get_member(pJsonObject, customizable_cta_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("CustomizableCTAType")) {
			jsonToValue(&customizable_cta_type, node, "CustomizableCTAType", "CustomizableCTAType");
		} else {
			
			CustomizableCTAType* obj = static_cast<CustomizableCTAType*> (&customizable_cta_type);
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
	const gchar *disclosure_typeKey = "disclosure_type";
	node = json_object_get_member(pJsonObject, disclosure_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("DisclosureType")) {
			jsonToValue(&disclosure_type, node, "DisclosureType", "DisclosureType");
		} else {
			
			DisclosureType* obj = static_cast<DisclosureType*> (&disclosure_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *disclosure_urlKey = "disclosure_url";
	node = json_object_get_member(pJsonObject, disclosure_urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&disclosure_url, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *grid_click_typeKey = "grid_click_type";
	node = json_object_get_member(pJsonObject, grid_click_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("GridClickType")) {
			jsonToValue(&grid_click_type, node, "GridClickType", "GridClickType");
		} else {
			
			GridClickType* obj = static_cast<GridClickType*> (&grid_click_type);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *ios_deep_linkKey = "ios_deep_link";
	node = json_object_get_member(pJsonObject, ios_deep_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ios_deep_link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *is_cartingKey = "is_carting";
	node = json_object_get_member(pJsonObject, is_cartingKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_carting, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_collage_accepted_termsKey = "is_collage_accepted_terms";
	node = json_object_get_member(pJsonObject, is_collage_accepted_termsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_collage_accepted_terms, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_collage_single_destinationKey = "is_collage_single_destination";
	node = json_object_get_member(pJsonObject, is_collage_single_destinationKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_collage_single_destination, node, "bool", "");
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
	const gchar *lead_form_idKey = "lead_form_id";
	node = json_object_get_member(pJsonObject, lead_form_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&lead_form_id, node, "std::string", "");
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
	const gchar *quiz_pin_dataKey = "quiz_pin_data";
	node = json_object_get_member(pJsonObject, quiz_pin_dataKey);
	if (node !=NULL) {
	

		if (isprimitive("QuizPinData")) {
			jsonToValue(&quiz_pin_data, node, "QuizPinData", "QuizPinData");
		} else {
			
			QuizPinData* obj = static_cast<QuizPinData*> (&quiz_pin_data);
			obj->fromJson(json_to_string(node, false));
			
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
	

		if (isprimitive("TrackingUrls")) {
			jsonToValue(&tracking_urls, node, "TrackingUrls", "TrackingUrls");
		} else {
			
			TrackingUrls* obj = static_cast<TrackingUrls*> (&tracking_urls);
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

AdBatchUpdate::AdBatchUpdate(char* json)
{
	this->fromJson(json);
}

char*
AdBatchUpdate::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getCollectionItemsDestinationUrlTemplate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *collection_items_destination_url_templateKey = "collection_items_destination_url_template";
	json_object_set_member(pJsonObject, collection_items_destination_url_templateKey, node);
	if (isprimitive("AdCollectionsHeaderType")) {
		AdCollectionsHeaderType obj = getCollectionsHeaderType();
		node = converttoJson(&obj, "AdCollectionsHeaderType", "");
	}
	else {
		
		AdCollectionsHeaderType obj = static_cast<AdCollectionsHeaderType> (getCollectionsHeaderType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *collections_header_typeKey = "collections_header_type";
	json_object_set_member(pJsonObject, collections_header_typeKey, node);
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
	if (isprimitive("CustomizableCTAType")) {
		CustomizableCTAType obj = getCustomizableCtaType();
		node = converttoJson(&obj, "CustomizableCTAType", "");
	}
	else {
		
		CustomizableCTAType obj = static_cast<CustomizableCTAType> (getCustomizableCtaType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *customizable_cta_typeKey = "customizable_cta_type";
	json_object_set_member(pJsonObject, customizable_cta_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDestinationUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *destination_urlKey = "destination_url";
	json_object_set_member(pJsonObject, destination_urlKey, node);
	if (isprimitive("DisclosureType")) {
		DisclosureType obj = getDisclosureType();
		node = converttoJson(&obj, "DisclosureType", "");
	}
	else {
		
		DisclosureType obj = static_cast<DisclosureType> (getDisclosureType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *disclosure_typeKey = "disclosure_type";
	json_object_set_member(pJsonObject, disclosure_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDisclosureUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *disclosure_urlKey = "disclosure_url";
	json_object_set_member(pJsonObject, disclosure_urlKey, node);
	if (isprimitive("GridClickType")) {
		GridClickType obj = getGridClickType();
		node = converttoJson(&obj, "GridClickType", "");
	}
	else {
		
		GridClickType obj = static_cast<GridClickType> (getGridClickType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *grid_click_typeKey = "grid_click_type";
	json_object_set_member(pJsonObject, grid_click_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getIosDeepLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ios_deep_linkKey = "ios_deep_link";
	json_object_set_member(pJsonObject, ios_deep_linkKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsCarting();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_cartingKey = "is_carting";
	json_object_set_member(pJsonObject, is_cartingKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsCollageAcceptedTerms();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_collage_accepted_termsKey = "is_collage_accepted_terms";
	json_object_set_member(pJsonObject, is_collage_accepted_termsKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsCollageSingleDestination();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_collage_single_destinationKey = "is_collage_single_destination";
	json_object_set_member(pJsonObject, is_collage_single_destinationKey, node);
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
		std::string obj = getLeadFormId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *lead_form_idKey = "lead_form_id";
	json_object_set_member(pJsonObject, lead_form_idKey, node);
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
	if (isprimitive("QuizPinData")) {
		QuizPinData obj = getQuizPinData();
		node = converttoJson(&obj, "QuizPinData", "");
	}
	else {
		
		QuizPinData obj = static_cast<QuizPinData> (getQuizPinData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *quiz_pin_dataKey = "quiz_pin_data";
	json_object_set_member(pJsonObject, quiz_pin_dataKey, node);
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
	if (isprimitive("TrackingUrls")) {
		TrackingUrls obj = getTrackingUrls();
		node = converttoJson(&obj, "TrackingUrls", "");
	}
	else {
		
		TrackingUrls obj = static_cast<TrackingUrls> (getTrackingUrls());
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
AdBatchUpdate::getAdGroupId()
{
	return ad_group_id;
}

void
AdBatchUpdate::setAdGroupId(std::string  ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

std::string
AdBatchUpdate::getAndroidDeepLink()
{
	return android_deep_link;
}

void
AdBatchUpdate::setAndroidDeepLink(std::string  android_deep_link)
{
	this->android_deep_link = android_deep_link;
}

std::list<std::string>
AdBatchUpdate::getCarouselAndroidDeepLinks()
{
	return carousel_android_deep_links;
}

void
AdBatchUpdate::setCarouselAndroidDeepLinks(std::list <std::string> carousel_android_deep_links)
{
	this->carousel_android_deep_links = carousel_android_deep_links;
}

std::list<std::string>
AdBatchUpdate::getCarouselDestinationUrls()
{
	return carousel_destination_urls;
}

void
AdBatchUpdate::setCarouselDestinationUrls(std::list <std::string> carousel_destination_urls)
{
	this->carousel_destination_urls = carousel_destination_urls;
}

std::list<std::string>
AdBatchUpdate::getCarouselIosDeepLinks()
{
	return carousel_ios_deep_links;
}

void
AdBatchUpdate::setCarouselIosDeepLinks(std::list <std::string> carousel_ios_deep_links)
{
	this->carousel_ios_deep_links = carousel_ios_deep_links;
}

std::string
AdBatchUpdate::getClickTrackingUrl()
{
	return click_tracking_url;
}

void
AdBatchUpdate::setClickTrackingUrl(std::string  click_tracking_url)
{
	this->click_tracking_url = click_tracking_url;
}

std::string
AdBatchUpdate::getCollectionItemsDestinationUrlTemplate()
{
	return collection_items_destination_url_template;
}

void
AdBatchUpdate::setCollectionItemsDestinationUrlTemplate(std::string  collection_items_destination_url_template)
{
	this->collection_items_destination_url_template = collection_items_destination_url_template;
}

AdCollectionsHeaderType
AdBatchUpdate::getCollectionsHeaderType()
{
	return collections_header_type;
}

void
AdBatchUpdate::setCollectionsHeaderType(AdCollectionsHeaderType  collections_header_type)
{
	this->collections_header_type = collections_header_type;
}

CreativeType
AdBatchUpdate::getCreativeType()
{
	return creative_type;
}

void
AdBatchUpdate::setCreativeType(CreativeType  creative_type)
{
	this->creative_type = creative_type;
}

CustomizableCTAType
AdBatchUpdate::getCustomizableCtaType()
{
	return customizable_cta_type;
}

void
AdBatchUpdate::setCustomizableCtaType(CustomizableCTAType  customizable_cta_type)
{
	this->customizable_cta_type = customizable_cta_type;
}

std::string
AdBatchUpdate::getDestinationUrl()
{
	return destination_url;
}

void
AdBatchUpdate::setDestinationUrl(std::string  destination_url)
{
	this->destination_url = destination_url;
}

DisclosureType
AdBatchUpdate::getDisclosureType()
{
	return disclosure_type;
}

void
AdBatchUpdate::setDisclosureType(DisclosureType  disclosure_type)
{
	this->disclosure_type = disclosure_type;
}

std::string
AdBatchUpdate::getDisclosureUrl()
{
	return disclosure_url;
}

void
AdBatchUpdate::setDisclosureUrl(std::string  disclosure_url)
{
	this->disclosure_url = disclosure_url;
}

GridClickType
AdBatchUpdate::getGridClickType()
{
	return grid_click_type;
}

void
AdBatchUpdate::setGridClickType(GridClickType  grid_click_type)
{
	this->grid_click_type = grid_click_type;
}

std::string
AdBatchUpdate::getId()
{
	return id;
}

void
AdBatchUpdate::setId(std::string  id)
{
	this->id = id;
}

std::string
AdBatchUpdate::getIosDeepLink()
{
	return ios_deep_link;
}

void
AdBatchUpdate::setIosDeepLink(std::string  ios_deep_link)
{
	this->ios_deep_link = ios_deep_link;
}

bool
AdBatchUpdate::getIsCarting()
{
	return is_carting;
}

void
AdBatchUpdate::setIsCarting(bool  is_carting)
{
	this->is_carting = is_carting;
}

bool
AdBatchUpdate::getIsCollageAcceptedTerms()
{
	return is_collage_accepted_terms;
}

void
AdBatchUpdate::setIsCollageAcceptedTerms(bool  is_collage_accepted_terms)
{
	this->is_collage_accepted_terms = is_collage_accepted_terms;
}

bool
AdBatchUpdate::getIsCollageSingleDestination()
{
	return is_collage_single_destination;
}

void
AdBatchUpdate::setIsCollageSingleDestination(bool  is_collage_single_destination)
{
	this->is_collage_single_destination = is_collage_single_destination;
}

bool
AdBatchUpdate::getIsPinDeleted()
{
	return is_pin_deleted;
}

void
AdBatchUpdate::setIsPinDeleted(bool  is_pin_deleted)
{
	this->is_pin_deleted = is_pin_deleted;
}

bool
AdBatchUpdate::getIsRemovable()
{
	return is_removable;
}

void
AdBatchUpdate::setIsRemovable(bool  is_removable)
{
	this->is_removable = is_removable;
}

std::string
AdBatchUpdate::getLeadFormId()
{
	return lead_form_id;
}

void
AdBatchUpdate::setLeadFormId(std::string  lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

std::string
AdBatchUpdate::getName()
{
	return name;
}

void
AdBatchUpdate::setName(std::string  name)
{
	this->name = name;
}

std::string
AdBatchUpdate::getPinId()
{
	return pin_id;
}

void
AdBatchUpdate::setPinId(std::string  pin_id)
{
	this->pin_id = pin_id;
}

QuizPinData
AdBatchUpdate::getQuizPinData()
{
	return quiz_pin_data;
}

void
AdBatchUpdate::setQuizPinData(QuizPinData  quiz_pin_data)
{
	this->quiz_pin_data = quiz_pin_data;
}

EntityStatus
AdBatchUpdate::getStatus()
{
	return status;
}

void
AdBatchUpdate::setStatus(EntityStatus  status)
{
	this->status = status;
}

TrackingUrls
AdBatchUpdate::getTrackingUrls()
{
	return tracking_urls;
}

void
AdBatchUpdate::setTrackingUrls(TrackingUrls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

std::string
AdBatchUpdate::getViewTrackingUrl()
{
	return view_tracking_url;
}

void
AdBatchUpdate::setViewTrackingUrl(std::string  view_tracking_url)
{
	this->view_tracking_url = view_tracking_url;
}


