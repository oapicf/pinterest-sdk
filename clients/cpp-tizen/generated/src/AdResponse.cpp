#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdResponse::AdResponse()
{
	//__init();
}

AdResponse::~AdResponse()
{
	//__cleanup();
}

void
AdResponse::__init()
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
	//status = new EntityStatus();
	//tracking_urls = new AdCommon_tracking_urls();
	//view_tracking_url = std::string();
	//lead_form_id = std::string();
	//grid_click_type = new GridClickType();
	//customizable_cta_type = std::string();
	//quiz_pin_data = new AdCommon_quiz_pin_data();
	//pin_id = std::string();
	//ad_account_id = std::string();
	//campaign_id = std::string();
	//collection_items_destination_url_template = std::string();
	//created_time = int(0);
	//id = std::string();
	//new std::list()std::list> rejected_reasons;
	//new std::list()std::list> rejection_labels;
	//review_status = std::string();
	//type = std::string();
	//updated_time = int(0);
	//summary_status = std::string();
}

void
AdResponse::__cleanup()
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
	//if(lead_form_id != NULL) {
	//
	//delete lead_form_id;
	//lead_form_id = NULL;
	//}
	//if(grid_click_type != NULL) {
	//
	//delete grid_click_type;
	//grid_click_type = NULL;
	//}
	//if(customizable_cta_type != NULL) {
	//
	//delete customizable_cta_type;
	//customizable_cta_type = NULL;
	//}
	//if(quiz_pin_data != NULL) {
	//
	//delete quiz_pin_data;
	//quiz_pin_data = NULL;
	//}
	//if(pin_id != NULL) {
	//
	//delete pin_id;
	//pin_id = NULL;
	//}
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(campaign_id != NULL) {
	//
	//delete campaign_id;
	//campaign_id = NULL;
	//}
	//if(collection_items_destination_url_template != NULL) {
	//
	//delete collection_items_destination_url_template;
	//collection_items_destination_url_template = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(rejected_reasons != NULL) {
	//rejected_reasons.RemoveAll(true);
	//delete rejected_reasons;
	//rejected_reasons = NULL;
	//}
	//if(rejection_labels != NULL) {
	//rejection_labels.RemoveAll(true);
	//delete rejection_labels;
	//rejection_labels = NULL;
	//}
	//if(review_status != NULL) {
	//
	//delete review_status;
	//review_status = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(updated_time != NULL) {
	//
	//delete updated_time;
	//updated_time = NULL;
	//}
	//if(summary_status != NULL) {
	//
	//delete summary_status;
	//summary_status = NULL;
	//}
	//
}

void
AdResponse::fromJson(char* jsonStr)
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
	const gchar *lead_form_idKey = "lead_form_id";
	node = json_object_get_member(pJsonObject, lead_form_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&lead_form_id, node, "std::string", "");
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
	const gchar *customizable_cta_typeKey = "customizable_cta_type";
	node = json_object_get_member(pJsonObject, customizable_cta_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&customizable_cta_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *quiz_pin_dataKey = "quiz_pin_data";
	node = json_object_get_member(pJsonObject, quiz_pin_dataKey);
	if (node !=NULL) {
	

		if (isprimitive("AdCommon_quiz_pin_data")) {
			jsonToValue(&quiz_pin_data, node, "AdCommon_quiz_pin_data", "AdCommon_quiz_pin_data");
		} else {
			
			AdCommon_quiz_pin_data* obj = static_cast<AdCommon_quiz_pin_data*> (&quiz_pin_data);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *ad_account_idKey = "ad_account_id";
	node = json_object_get_member(pJsonObject, ad_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_account_id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *campaign_idKey = "campaign_id";
	node = json_object_get_member(pJsonObject, campaign_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&campaign_id, node, "std::string", "");
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
	const gchar *created_timeKey = "created_time";
	node = json_object_get_member(pJsonObject, created_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&created_time, node, "int", "");
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
	const gchar *rejected_reasonsKey = "rejected_reasons";
	node = json_object_get_member(pJsonObject, rejected_reasonsKey);
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
			rejected_reasons = new_list;
		}
		
	}
	const gchar *rejection_labelsKey = "rejection_labels";
	node = json_object_get_member(pJsonObject, rejection_labelsKey);
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
			rejection_labels = new_list;
		}
		
	}
	const gchar *review_statusKey = "review_status";
	node = json_object_get_member(pJsonObject, review_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&review_status, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *updated_timeKey = "updated_time";
	node = json_object_get_member(pJsonObject, updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_time, node, "int", "");
		} else {
			
		}
	}
	const gchar *summary_statusKey = "summary_status";
	node = json_object_get_member(pJsonObject, summary_statusKey);
	if (node !=NULL) {
	

		if (isprimitive("PinPromotionSummaryStatus")) {
			jsonToValue(&summary_status, node, "PinPromotionSummaryStatus", "PinPromotionSummaryStatus");
		} else {
			
			PinPromotionSummaryStatus* obj = static_cast<PinPromotionSummaryStatus*> (&summary_status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AdResponse::AdResponse(char* json)
{
	this->fromJson(json);
}

char*
AdResponse::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getLeadFormId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *lead_form_idKey = "lead_form_id";
	json_object_set_member(pJsonObject, lead_form_idKey, node);
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
		std::string obj = getCustomizableCtaType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *customizable_cta_typeKey = "customizable_cta_type";
	json_object_set_member(pJsonObject, customizable_cta_typeKey, node);
	if (isprimitive("AdCommon_quiz_pin_data")) {
		AdCommon_quiz_pin_data obj = getQuizPinData();
		node = converttoJson(&obj, "AdCommon_quiz_pin_data", "");
	}
	else {
		
		AdCommon_quiz_pin_data obj = static_cast<AdCommon_quiz_pin_data> (getQuizPinData());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *quiz_pin_dataKey = "quiz_pin_data";
	json_object_set_member(pJsonObject, quiz_pin_dataKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPinId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pin_idKey = "pin_id";
	json_object_set_member(pJsonObject, pin_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCampaignId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *campaign_idKey = "campaign_id";
	json_object_set_member(pJsonObject, campaign_idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCollectionItemsDestinationUrlTemplate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *collection_items_destination_url_templateKey = "collection_items_destination_url_template";
	json_object_set_member(pJsonObject, collection_items_destination_url_templateKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getRejectedReasons());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getRejectedReasons());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *rejected_reasonsKey = "rejected_reasons";
	json_object_set_member(pJsonObject, rejected_reasonsKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getRejectionLabels());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getRejectionLabels());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *rejection_labelsKey = "rejection_labels";
	json_object_set_member(pJsonObject, rejection_labelsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getReviewStatus();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *review_statusKey = "review_status";
	json_object_set_member(pJsonObject, review_statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("int")) {
		int obj = getUpdatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_timeKey = "updated_time";
	json_object_set_member(pJsonObject, updated_timeKey, node);
	if (isprimitive("PinPromotionSummaryStatus")) {
		PinPromotionSummaryStatus obj = getSummaryStatus();
		node = converttoJson(&obj, "PinPromotionSummaryStatus", "");
	}
	else {
		
		PinPromotionSummaryStatus obj = static_cast<PinPromotionSummaryStatus> (getSummaryStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *summary_statusKey = "summary_status";
	json_object_set_member(pJsonObject, summary_statusKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
AdResponse::getAdGroupId()
{
	return ad_group_id;
}

void
AdResponse::setAdGroupId(std::string  ad_group_id)
{
	this->ad_group_id = ad_group_id;
}

std::string
AdResponse::getAndroidDeepLink()
{
	return android_deep_link;
}

void
AdResponse::setAndroidDeepLink(std::string  android_deep_link)
{
	this->android_deep_link = android_deep_link;
}

std::list<std::string>
AdResponse::getCarouselAndroidDeepLinks()
{
	return carousel_android_deep_links;
}

void
AdResponse::setCarouselAndroidDeepLinks(std::list <std::string> carousel_android_deep_links)
{
	this->carousel_android_deep_links = carousel_android_deep_links;
}

std::list<std::string>
AdResponse::getCarouselDestinationUrls()
{
	return carousel_destination_urls;
}

void
AdResponse::setCarouselDestinationUrls(std::list <std::string> carousel_destination_urls)
{
	this->carousel_destination_urls = carousel_destination_urls;
}

std::list<std::string>
AdResponse::getCarouselIosDeepLinks()
{
	return carousel_ios_deep_links;
}

void
AdResponse::setCarouselIosDeepLinks(std::list <std::string> carousel_ios_deep_links)
{
	this->carousel_ios_deep_links = carousel_ios_deep_links;
}

std::string
AdResponse::getClickTrackingUrl()
{
	return click_tracking_url;
}

void
AdResponse::setClickTrackingUrl(std::string  click_tracking_url)
{
	this->click_tracking_url = click_tracking_url;
}

CreativeType
AdResponse::getCreativeType()
{
	return creative_type;
}

void
AdResponse::setCreativeType(CreativeType  creative_type)
{
	this->creative_type = creative_type;
}

std::string
AdResponse::getDestinationUrl()
{
	return destination_url;
}

void
AdResponse::setDestinationUrl(std::string  destination_url)
{
	this->destination_url = destination_url;
}

std::string
AdResponse::getIosDeepLink()
{
	return ios_deep_link;
}

void
AdResponse::setIosDeepLink(std::string  ios_deep_link)
{
	this->ios_deep_link = ios_deep_link;
}

bool
AdResponse::getIsPinDeleted()
{
	return is_pin_deleted;
}

void
AdResponse::setIsPinDeleted(bool  is_pin_deleted)
{
	this->is_pin_deleted = is_pin_deleted;
}

bool
AdResponse::getIsRemovable()
{
	return is_removable;
}

void
AdResponse::setIsRemovable(bool  is_removable)
{
	this->is_removable = is_removable;
}

std::string
AdResponse::getName()
{
	return name;
}

void
AdResponse::setName(std::string  name)
{
	this->name = name;
}

EntityStatus
AdResponse::getStatus()
{
	return status;
}

void
AdResponse::setStatus(EntityStatus  status)
{
	this->status = status;
}

AdCommon_tracking_urls
AdResponse::getTrackingUrls()
{
	return tracking_urls;
}

void
AdResponse::setTrackingUrls(AdCommon_tracking_urls  tracking_urls)
{
	this->tracking_urls = tracking_urls;
}

std::string
AdResponse::getViewTrackingUrl()
{
	return view_tracking_url;
}

void
AdResponse::setViewTrackingUrl(std::string  view_tracking_url)
{
	this->view_tracking_url = view_tracking_url;
}

std::string
AdResponse::getLeadFormId()
{
	return lead_form_id;
}

void
AdResponse::setLeadFormId(std::string  lead_form_id)
{
	this->lead_form_id = lead_form_id;
}

GridClickType
AdResponse::getGridClickType()
{
	return grid_click_type;
}

void
AdResponse::setGridClickType(GridClickType  grid_click_type)
{
	this->grid_click_type = grid_click_type;
}

std::string
AdResponse::getCustomizableCtaType()
{
	return customizable_cta_type;
}

void
AdResponse::setCustomizableCtaType(std::string  customizable_cta_type)
{
	this->customizable_cta_type = customizable_cta_type;
}

AdCommon_quiz_pin_data
AdResponse::getQuizPinData()
{
	return quiz_pin_data;
}

void
AdResponse::setQuizPinData(AdCommon_quiz_pin_data  quiz_pin_data)
{
	this->quiz_pin_data = quiz_pin_data;
}

std::string
AdResponse::getPinId()
{
	return pin_id;
}

void
AdResponse::setPinId(std::string  pin_id)
{
	this->pin_id = pin_id;
}

std::string
AdResponse::getAdAccountId()
{
	return ad_account_id;
}

void
AdResponse::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
AdResponse::getCampaignId()
{
	return campaign_id;
}

void
AdResponse::setCampaignId(std::string  campaign_id)
{
	this->campaign_id = campaign_id;
}

std::string
AdResponse::getCollectionItemsDestinationUrlTemplate()
{
	return collection_items_destination_url_template;
}

void
AdResponse::setCollectionItemsDestinationUrlTemplate(std::string  collection_items_destination_url_template)
{
	this->collection_items_destination_url_template = collection_items_destination_url_template;
}

int
AdResponse::getCreatedTime()
{
	return created_time;
}

void
AdResponse::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

std::string
AdResponse::getId()
{
	return id;
}

void
AdResponse::setId(std::string  id)
{
	this->id = id;
}

std::list<std::string>
AdResponse::getRejectedReasons()
{
	return rejected_reasons;
}

void
AdResponse::setRejectedReasons(std::list <std::string> rejected_reasons)
{
	this->rejected_reasons = rejected_reasons;
}

std::list<std::string>
AdResponse::getRejectionLabels()
{
	return rejection_labels;
}

void
AdResponse::setRejectionLabels(std::list <std::string> rejection_labels)
{
	this->rejection_labels = rejection_labels;
}

std::string
AdResponse::getReviewStatus()
{
	return review_status;
}

void
AdResponse::setReviewStatus(std::string  review_status)
{
	this->review_status = review_status;
}

std::string
AdResponse::getType()
{
	return type;
}

void
AdResponse::setType(std::string  type)
{
	this->type = type;
}

int
AdResponse::getUpdatedTime()
{
	return updated_time;
}

void
AdResponse::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}

PinPromotionSummaryStatus
AdResponse::getSummaryStatus()
{
	return summary_status;
}

void
AdResponse::setSummaryStatus(PinPromotionSummaryStatus  summary_status)
{
	this->summary_status = summary_status;
}


