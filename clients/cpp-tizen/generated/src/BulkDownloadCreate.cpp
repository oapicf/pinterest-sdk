#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BulkDownloadCreate.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BulkDownloadCreate::BulkDownloadCreate()
{
	//__init();
}

BulkDownloadCreate::~BulkDownloadCreate()
{
	//__cleanup();
}

void
BulkDownloadCreate::__init()
{
	//campaign_filter = new BulkDownloadCampaignFilter();
	//new std::list()std::list> entity_ids;
	//new std::list()std::list> entity_types;
	//output_format = null;
	//updated_since = std::string();
}

void
BulkDownloadCreate::__cleanup()
{
	//if(campaign_filter != NULL) {
	//
	//delete campaign_filter;
	//campaign_filter = NULL;
	//}
	//if(entity_ids != NULL) {
	//entity_ids.RemoveAll(true);
	//delete entity_ids;
	//entity_ids = NULL;
	//}
	//if(entity_types != NULL) {
	//entity_types.RemoveAll(true);
	//delete entity_types;
	//entity_types = NULL;
	//}
	//if(output_format != NULL) {
	//
	//delete output_format;
	//output_format = NULL;
	//}
	//if(updated_since != NULL) {
	//
	//delete updated_since;
	//updated_since = NULL;
	//}
	//
}

void
BulkDownloadCreate::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *campaign_filterKey = "campaign_filter";
	node = json_object_get_member(pJsonObject, campaign_filterKey);
	if (node !=NULL) {
	

		if (isprimitive("BulkDownloadCampaignFilter")) {
			jsonToValue(&campaign_filter, node, "BulkDownloadCampaignFilter", "BulkDownloadCampaignFilter");
		} else {
			
			BulkDownloadCampaignFilter* obj = static_cast<BulkDownloadCampaignFilter*> (&campaign_filter);
			obj->fromJson(json_to_string(node, false));
			
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
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			entity_types = new_list;
		}
		
	}
	const gchar *output_formatKey = "output_format";
	node = json_object_get_member(pJsonObject, output_formatKey);
	if (node !=NULL) {
	

		if (isprimitive("BulkOutputFormat")) {
			jsonToValue(&output_format, node, "BulkOutputFormat", "BulkOutputFormat");
		} else {
			
			BulkOutputFormat* obj = static_cast<BulkOutputFormat*> (&output_format);
			obj->fromJson(json_to_string(node, false));
			
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
}

BulkDownloadCreate::BulkDownloadCreate(char* json)
{
	this->fromJson(json);
}

char*
BulkDownloadCreate::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("BulkDownloadCampaignFilter")) {
		BulkDownloadCampaignFilter obj = getCampaignFilter();
		node = converttoJson(&obj, "BulkDownloadCampaignFilter", "");
	}
	else {
		
		BulkDownloadCampaignFilter obj = static_cast<BulkDownloadCampaignFilter> (getCampaignFilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *campaign_filterKey = "campaign_filter";
	json_object_set_member(pJsonObject, campaign_filterKey, node);
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
	if (isprimitive("BulkEntityType")) {
		list<BulkEntityType> new_list = static_cast<list <BulkEntityType> > (getEntityTypes());
		node = converttoJson(&new_list, "BulkEntityType", "array");
	} else {
		node = json_node_alloc();
		list<BulkEntityType> new_list = static_cast<list <BulkEntityType> > (getEntityTypes());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BulkEntityType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BulkEntityType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *entity_typesKey = "entity_types";
	json_object_set_member(pJsonObject, entity_typesKey, node);
	if (isprimitive("BulkOutputFormat")) {
		BulkOutputFormat obj = getOutputFormat();
		node = converttoJson(&obj, "BulkOutputFormat", "");
	}
	else {
		
		BulkOutputFormat obj = static_cast<BulkOutputFormat> (getOutputFormat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *output_formatKey = "output_format";
	json_object_set_member(pJsonObject, output_formatKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUpdatedSince();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *updated_sinceKey = "updated_since";
	json_object_set_member(pJsonObject, updated_sinceKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

BulkDownloadCampaignFilter
BulkDownloadCreate::getCampaignFilter()
{
	return campaign_filter;
}

void
BulkDownloadCreate::setCampaignFilter(BulkDownloadCampaignFilter  campaign_filter)
{
	this->campaign_filter = campaign_filter;
}

std::list<std::string>
BulkDownloadCreate::getEntityIds()
{
	return entity_ids;
}

void
BulkDownloadCreate::setEntityIds(std::list <std::string> entity_ids)
{
	this->entity_ids = entity_ids;
}

std::list<BulkEntityType>
BulkDownloadCreate::getEntityTypes()
{
	return entity_types;
}

void
BulkDownloadCreate::setEntityTypes(std::list <BulkEntityType> entity_types)
{
	this->entity_types = entity_types;
}

BulkOutputFormat
BulkDownloadCreate::getOutputFormat()
{
	return output_format;
}

void
BulkDownloadCreate::setOutputFormat(BulkOutputFormat  output_format)
{
	this->output_format = output_format;
}

std::string
BulkDownloadCreate::getUpdatedSince()
{
	return updated_since;
}

void
BulkDownloadCreate::setUpdatedSince(std::string  updated_since)
{
	this->updated_since = updated_since;
}


