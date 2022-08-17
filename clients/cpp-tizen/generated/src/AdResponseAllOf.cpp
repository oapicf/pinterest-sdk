#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AdResponse_allOf.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AdResponse_allOf::AdResponse_allOf()
{
	//__init();
}

AdResponse_allOf::~AdResponse_allOf()
{
	//__cleanup();
}

void
AdResponse_allOf::__init()
{
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
AdResponse_allOf::__cleanup()
{
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
AdResponse_allOf::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
			
		}
	}
}

AdResponse_allOf::AdResponse_allOf(char* json)
{
	this->fromJson(json);
}

char*
AdResponse_allOf::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
AdResponse_allOf::getAdAccountId()
{
	return ad_account_id;
}

void
AdResponse_allOf::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

std::string
AdResponse_allOf::getCampaignId()
{
	return campaign_id;
}

void
AdResponse_allOf::setCampaignId(std::string  campaign_id)
{
	this->campaign_id = campaign_id;
}

std::string
AdResponse_allOf::getCollectionItemsDestinationUrlTemplate()
{
	return collection_items_destination_url_template;
}

void
AdResponse_allOf::setCollectionItemsDestinationUrlTemplate(std::string  collection_items_destination_url_template)
{
	this->collection_items_destination_url_template = collection_items_destination_url_template;
}

int
AdResponse_allOf::getCreatedTime()
{
	return created_time;
}

void
AdResponse_allOf::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

std::string
AdResponse_allOf::getId()
{
	return id;
}

void
AdResponse_allOf::setId(std::string  id)
{
	this->id = id;
}

std::list<std::string>
AdResponse_allOf::getRejectedReasons()
{
	return rejected_reasons;
}

void
AdResponse_allOf::setRejectedReasons(std::list <std::string> rejected_reasons)
{
	this->rejected_reasons = rejected_reasons;
}

std::list<std::string>
AdResponse_allOf::getRejectionLabels()
{
	return rejection_labels;
}

void
AdResponse_allOf::setRejectionLabels(std::list <std::string> rejection_labels)
{
	this->rejection_labels = rejection_labels;
}

std::string
AdResponse_allOf::getReviewStatus()
{
	return review_status;
}

void
AdResponse_allOf::setReviewStatus(std::string  review_status)
{
	this->review_status = review_status;
}

std::string
AdResponse_allOf::getType()
{
	return type;
}

void
AdResponse_allOf::setType(std::string  type)
{
	this->type = type;
}

int
AdResponse_allOf::getUpdatedTime()
{
	return updated_time;
}

void
AdResponse_allOf::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}

PinPromotionSummaryStatus
AdResponse_allOf::getSummaryStatus()
{
	return summary_status;
}

void
AdResponse_allOf::setSummaryStatus(PinPromotionSummaryStatus  summary_status)
{
	this->summary_status = summary_status;
}


