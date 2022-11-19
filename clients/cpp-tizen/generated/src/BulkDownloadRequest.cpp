#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BulkDownloadRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BulkDownloadRequest::BulkDownloadRequest()
{
	//__init();
}

BulkDownloadRequest::~BulkDownloadRequest()
{
	//__cleanup();
}

void
BulkDownloadRequest::__init()
{
	//new std::list()std::list> entity_types;
	//new std::list()std::list> entity_ids;
	//updated_since = std::string();
	//campaign_filter = new BulkDownloadRequest_campaign_filter();
	//output_format = std::string();
}

void
BulkDownloadRequest::__cleanup()
{
	//if(entity_types != NULL) {
	//entity_types.RemoveAll(true);
	//delete entity_types;
	//entity_types = NULL;
	//}
	//if(entity_ids != NULL) {
	//entity_ids.RemoveAll(true);
	//delete entity_ids;
	//entity_ids = NULL;
	//}
	//if(updated_since != NULL) {
	//
	//delete updated_since;
	//updated_since = NULL;
	//}
	//if(campaign_filter != NULL) {
	//
	//delete campaign_filter;
	//campaign_filter = NULL;
	//}
	//if(output_format != NULL) {
	//
	//delete output_format;
	//output_format = NULL;
	//}
	//
}

void
BulkDownloadRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *entity_typesKey = "entity_types";
	node = json_object_get_member(pJsonObject, entity_typesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BulkEntityType> new_list;
			BulkEntityType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BulkEntityType")) {
					jsonToValue(&inst, temp_json, "BulkEntityType", "");
				} else {
					
				}
				new_list.push_back(inst);
			}
			entity_types = new_list;
		}
		
	}
	const gchar *entity_idsKey = "entity_ids";
	node = json_object_get_member(pJsonObject, entity_idsKey);
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
			entity_ids = new_list;
		}
		
	}
	const gchar *updated_sinceKey = "updated_since";
	node = json_object_get_member(pJsonObject, updated_sinceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&updated_since, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *campaign_filterKey = "campaign_filter";
	node = json_object_get_member(pJsonObject, campaign_filterKey);
	if (node !=NULL) {
	

		if (isprimitive("BulkDownloadRequest_campaign_filter")) {
			jsonToValue(&campaign_filter, node, "BulkDownloadRequest_campaign_filter", "BulkDownloadRequest_campaign_filter");
		} else {
			
			BulkDownloadRequest_campaign_filter* obj = static_cast<BulkDownloadRequest_campaign_filter*> (&campaign_filter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *output_formatKey = "output_format";
	node = json_object_get_member(pJsonObject, output_formatKey);
	if (node !=NULL) {
	

		if (isprimitive("BulkOutputFormat")) {
			jsonToValue(&output_format, node, "BulkOutputFormat", "BulkOutputFormat");
		} else {
			
		}
	}
}

BulkDownloadRequest::BulkDownloadRequest(char* json)
{
	this->fromJson(json);
}

char*
BulkDownloadRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("BulkEntityType")) {
		list<BulkEntityType> new_list = static_cast<list <BulkEntityType> > (getEntityTypes());
		node = converttoJson(&new_list, "BulkEntityType", "array");
	} else {
		node = json_node_alloc();
		list<BulkEntityType> new_list = static_cast<list <BulkEntityType> > (getEntityTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *entity_typesKey = "entity_types";
	json_object_set_member(pJsonObject, entity_typesKey, node);
	if (isprimitive("std::string")) {
		list<std::string> new_list = static_cast<list <std::string> > (getEntityIds());
		node = converttoJson(&new_list, "std::string", "array");
	} else {
		node = json_node_alloc();
		list<std::string> new_list = static_cast<list <std::string> > (getEntityIds());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
	}


	
	const gchar *entity_idsKey = "entity_ids";
	json_object_set_member(pJsonObject, entity_idsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUpdatedSince();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updated_sinceKey = "updated_since";
	json_object_set_member(pJsonObject, updated_sinceKey, node);
	if (isprimitive("BulkDownloadRequest_campaign_filter")) {
		BulkDownloadRequest_campaign_filter obj = getCampaignFilter();
		node = converttoJson(&obj, "BulkDownloadRequest_campaign_filter", "");
	}
	else {
		
		BulkDownloadRequest_campaign_filter obj = static_cast<BulkDownloadRequest_campaign_filter> (getCampaignFilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *campaign_filterKey = "campaign_filter";
	json_object_set_member(pJsonObject, campaign_filterKey, node);
	if (isprimitive("BulkOutputFormat")) {
		BulkOutputFormat obj = getOutputFormat();
		node = converttoJson(&obj, "BulkOutputFormat", "");
	}
	else {
		
	}
	const gchar *output_formatKey = "output_format";
	json_object_set_member(pJsonObject, output_formatKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<BulkEntityType>
BulkDownloadRequest::getEntityTypes()
{
	return entity_types;
}

void
BulkDownloadRequest::setEntityTypes(std::list <BulkEntityType> entity_types)
{
	this->entity_types = entity_types;
}

std::list<std::string>
BulkDownloadRequest::getEntityIds()
{
	return entity_ids;
}

void
BulkDownloadRequest::setEntityIds(std::list <std::string> entity_ids)
{
	this->entity_ids = entity_ids;
}

std::string
BulkDownloadRequest::getUpdatedSince()
{
	return updated_since;
}

void
BulkDownloadRequest::setUpdatedSince(std::string  updated_since)
{
	this->updated_since = updated_since;
}

BulkDownloadRequest_campaign_filter
BulkDownloadRequest::getCampaignFilter()
{
	return campaign_filter;
}

void
BulkDownloadRequest::setCampaignFilter(BulkDownloadRequest_campaign_filter  campaign_filter)
{
	this->campaign_filter = campaign_filter;
}

BulkOutputFormat
BulkDownloadRequest::getOutputFormat()
{
	return output_format;
}

void
BulkDownloadRequest::setOutputFormat(BulkOutputFormat  output_format)
{
	this->output_format = output_format;
}


