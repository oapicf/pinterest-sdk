#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BulkDownloadCampaignFilter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BulkDownloadCampaignFilter::BulkDownloadCampaignFilter()
{
	//__init();
}

BulkDownloadCampaignFilter::~BulkDownloadCampaignFilter()
{
	//__cleanup();
}

void
BulkDownloadCampaignFilter::__init()
{
	//new std::list()std::list> campaign_status;
	//end_time = std::string();
	//name = std::string();
	//new std::list()std::list> objective_type;
	//start_time = std::string();
}

void
BulkDownloadCampaignFilter::__cleanup()
{
	//if(campaign_status != NULL) {
	//campaign_status.RemoveAll(true);
	//delete campaign_status;
	//campaign_status = NULL;
	//}
	//if(end_time != NULL) {
	//
	//delete end_time;
	//end_time = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(objective_type != NULL) {
	//objective_type.RemoveAll(true);
	//delete objective_type;
	//objective_type = NULL;
	//}
	//if(start_time != NULL) {
	//
	//delete start_time;
	//start_time = NULL;
	//}
	//
}

void
BulkDownloadCampaignFilter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *campaign_statusKey = "campaign_status";
	node = json_object_get_member(pJsonObject, campaign_statusKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<SummaryStatus> new_list;
			SummaryStatus inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("SummaryStatus")) {
					jsonToValue(&inst, temp_json, "SummaryStatus", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			campaign_status = new_list;
		}
		
	}
	const gchar *end_timeKey = "end_time";
	node = json_object_get_member(pJsonObject, end_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&end_time, node, "std::string", "");
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
	const gchar *objective_typeKey = "objective_type";
	node = json_object_get_member(pJsonObject, objective_typeKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ConversionObjectiveType> new_list;
			ConversionObjectiveType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ConversionObjectiveType")) {
					jsonToValue(&inst, temp_json, "ConversionObjectiveType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			objective_type = new_list;
		}
		
	}
	const gchar *start_timeKey = "start_time";
	node = json_object_get_member(pJsonObject, start_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&start_time, node, "std::string", "");
		} else {
			
		}
	}
}

BulkDownloadCampaignFilter::BulkDownloadCampaignFilter(char* json)
{
	this->fromJson(json);
}

char*
BulkDownloadCampaignFilter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("SummaryStatus")) {
		list<SummaryStatus> new_list = static_cast<list <SummaryStatus> > (getCampaignStatus());
		node = converttoJson(&new_list, "SummaryStatus", "array");
	} else {
		node = json_node_alloc();
		list<SummaryStatus> new_list = static_cast<list <SummaryStatus> > (getCampaignStatus());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<SummaryStatus>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			SummaryStatus obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *campaign_statusKey = "campaign_status";
	json_object_set_member(pJsonObject, campaign_statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getEndTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *end_timeKey = "end_time";
	json_object_set_member(pJsonObject, end_timeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("ConversionObjectiveType")) {
		list<ConversionObjectiveType> new_list = static_cast<list <ConversionObjectiveType> > (getObjectiveType());
		node = converttoJson(&new_list, "ConversionObjectiveType", "array");
	} else {
		node = json_node_alloc();
		list<ConversionObjectiveType> new_list = static_cast<list <ConversionObjectiveType> > (getObjectiveType());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ConversionObjectiveType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ConversionObjectiveType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *objective_typeKey = "objective_type";
	json_object_set_member(pJsonObject, objective_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getStartTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *start_timeKey = "start_time";
	json_object_set_member(pJsonObject, start_timeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::list<SummaryStatus>
BulkDownloadCampaignFilter::getCampaignStatus()
{
	return campaign_status;
}

void
BulkDownloadCampaignFilter::setCampaignStatus(std::list <SummaryStatus> campaign_status)
{
	this->campaign_status = campaign_status;
}

std::string
BulkDownloadCampaignFilter::getEndTime()
{
	return end_time;
}

void
BulkDownloadCampaignFilter::setEndTime(std::string  end_time)
{
	this->end_time = end_time;
}

std::string
BulkDownloadCampaignFilter::getName()
{
	return name;
}

void
BulkDownloadCampaignFilter::setName(std::string  name)
{
	this->name = name;
}

std::list<ConversionObjectiveType>
BulkDownloadCampaignFilter::getObjectiveType()
{
	return objective_type;
}

void
BulkDownloadCampaignFilter::setObjectiveType(std::list <ConversionObjectiveType> objective_type)
{
	this->objective_type = objective_type;
}

std::string
BulkDownloadCampaignFilter::getStartTime()
{
	return start_time;
}

void
BulkDownloadCampaignFilter::setStartTime(std::string  start_time)
{
	this->start_time = start_time;
}


