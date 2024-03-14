#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BulkDownloadRequest_campaign_filter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BulkDownloadRequest_campaign_filter::BulkDownloadRequest_campaign_filter()
{
	//__init();
}

BulkDownloadRequest_campaign_filter::~BulkDownloadRequest_campaign_filter()
{
	//__cleanup();
}

void
BulkDownloadRequest_campaign_filter::__init()
{
	//start_time = std::string();
	//end_time = std::string();
	//name = std::string();
	//new std::list()std::list> campaign_status;
	//new std::list()std::list> objective_type;
}

void
BulkDownloadRequest_campaign_filter::__cleanup()
{
	//if(start_time != NULL) {
	//
	//delete start_time;
	//start_time = NULL;
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
	//if(campaign_status != NULL) {
	//campaign_status.RemoveAll(true);
	//delete campaign_status;
	//campaign_status = NULL;
	//}
	//if(objective_type != NULL) {
	//objective_type.RemoveAll(true);
	//delete objective_type;
	//objective_type = NULL;
	//}
	//
}

void
BulkDownloadRequest_campaign_filter::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *start_timeKey = "start_time";
	node = json_object_get_member(pJsonObject, start_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&start_time, node, "std::string", "");
		} else {
			
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
	const gchar *campaign_statusKey = "campaign_status";
	node = json_object_get_member(pJsonObject, campaign_statusKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<CampaignSummaryStatus> new_list;
			CampaignSummaryStatus inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("CampaignSummaryStatus")) {
					jsonToValue(&inst, temp_json, "CampaignSummaryStatus", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			campaign_status = new_list;
		}
		
	}
	const gchar *objective_typeKey = "objective_type";
	node = json_object_get_member(pJsonObject, objective_typeKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ObjectiveType> new_list;
			ObjectiveType inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ObjectiveType")) {
					jsonToValue(&inst, temp_json, "ObjectiveType", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			objective_type = new_list;
		}
		
	}
}

BulkDownloadRequest_campaign_filter::BulkDownloadRequest_campaign_filter(char* json)
{
	this->fromJson(json);
}

char*
BulkDownloadRequest_campaign_filter::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getStartTime();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *start_timeKey = "start_time";
	json_object_set_member(pJsonObject, start_timeKey, node);
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
	if (isprimitive("CampaignSummaryStatus")) {
		list<CampaignSummaryStatus> new_list = static_cast<list <CampaignSummaryStatus> > (getCampaignStatus());
		node = converttoJson(&new_list, "CampaignSummaryStatus", "array");
	} else {
		node = json_node_alloc();
		list<CampaignSummaryStatus> new_list = static_cast<list <CampaignSummaryStatus> > (getCampaignStatus());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<CampaignSummaryStatus>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			CampaignSummaryStatus obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *campaign_statusKey = "campaign_status";
	json_object_set_member(pJsonObject, campaign_statusKey, node);
	if (isprimitive("ObjectiveType")) {
		list<ObjectiveType> new_list = static_cast<list <ObjectiveType> > (getObjectiveType());
		node = converttoJson(&new_list, "ObjectiveType", "array");
	} else {
		node = json_node_alloc();
		list<ObjectiveType> new_list = static_cast<list <ObjectiveType> > (getObjectiveType());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ObjectiveType>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ObjectiveType obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *objective_typeKey = "objective_type";
	json_object_set_member(pJsonObject, objective_typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
BulkDownloadRequest_campaign_filter::getStartTime()
{
	return start_time;
}

void
BulkDownloadRequest_campaign_filter::setStartTime(std::string  start_time)
{
	this->start_time = start_time;
}

std::string
BulkDownloadRequest_campaign_filter::getEndTime()
{
	return end_time;
}

void
BulkDownloadRequest_campaign_filter::setEndTime(std::string  end_time)
{
	this->end_time = end_time;
}

std::string
BulkDownloadRequest_campaign_filter::getName()
{
	return name;
}

void
BulkDownloadRequest_campaign_filter::setName(std::string  name)
{
	this->name = name;
}

std::list<CampaignSummaryStatus>
BulkDownloadRequest_campaign_filter::getCampaignStatus()
{
	return campaign_status;
}

void
BulkDownloadRequest_campaign_filter::setCampaignStatus(std::list <CampaignSummaryStatus> campaign_status)
{
	this->campaign_status = campaign_status;
}

std::list<ObjectiveType>
BulkDownloadRequest_campaign_filter::getObjectiveType()
{
	return objective_type;
}

void
BulkDownloadRequest_campaign_filter::setObjectiveType(std::list <ObjectiveType> objective_type)
{
	this->objective_type = objective_type;
}


