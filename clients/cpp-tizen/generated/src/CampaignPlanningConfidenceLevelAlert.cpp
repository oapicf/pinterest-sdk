#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignPlanningConfidenceLevelAlert.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignPlanningConfidenceLevelAlert::CampaignPlanningConfidenceLevelAlert()
{
	//__init();
}

CampaignPlanningConfidenceLevelAlert::~CampaignPlanningConfidenceLevelAlert()
{
	//__cleanup();
}

void
CampaignPlanningConfidenceLevelAlert::__init()
{
	//description = std::string();
	//reason = null;
	//severity = null;
}

void
CampaignPlanningConfidenceLevelAlert::__cleanup()
{
	//if(description != NULL) {
	//
	//delete description;
	//description = NULL;
	//}
	//if(reason != NULL) {
	//
	//delete reason;
	//reason = NULL;
	//}
	//if(severity != NULL) {
	//
	//delete severity;
	//severity = NULL;
	//}
	//
}

void
CampaignPlanningConfidenceLevelAlert::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *descriptionKey = "description";
	node = json_object_get_member(pJsonObject, descriptionKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&description, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *reasonKey = "reason";
	node = json_object_get_member(pJsonObject, reasonKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignPlanningConfidenceLevelAlertReason")) {
			jsonToValue(&reason, node, "CampaignPlanningConfidenceLevelAlertReason", "CampaignPlanningConfidenceLevelAlertReason");
		} else {
			
			CampaignPlanningConfidenceLevelAlertReason* obj = static_cast<CampaignPlanningConfidenceLevelAlertReason*> (&reason);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *severityKey = "severity";
	node = json_object_get_member(pJsonObject, severityKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignPlanningConfidenceLevelAlertSeverity")) {
			jsonToValue(&severity, node, "CampaignPlanningConfidenceLevelAlertSeverity", "CampaignPlanningConfidenceLevelAlertSeverity");
		} else {
			
			CampaignPlanningConfidenceLevelAlertSeverity* obj = static_cast<CampaignPlanningConfidenceLevelAlertSeverity*> (&severity);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

CampaignPlanningConfidenceLevelAlert::CampaignPlanningConfidenceLevelAlert(char* json)
{
	this->fromJson(json);
}

char*
CampaignPlanningConfidenceLevelAlert::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDescription();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *descriptionKey = "description";
	json_object_set_member(pJsonObject, descriptionKey, node);
	if (isprimitive("CampaignPlanningConfidenceLevelAlertReason")) {
		CampaignPlanningConfidenceLevelAlertReason obj = getReason();
		node = converttoJson(&obj, "CampaignPlanningConfidenceLevelAlertReason", "");
	}
	else {
		
		CampaignPlanningConfidenceLevelAlertReason obj = static_cast<CampaignPlanningConfidenceLevelAlertReason> (getReason());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *reasonKey = "reason";
	json_object_set_member(pJsonObject, reasonKey, node);
	if (isprimitive("CampaignPlanningConfidenceLevelAlertSeverity")) {
		CampaignPlanningConfidenceLevelAlertSeverity obj = getSeverity();
		node = converttoJson(&obj, "CampaignPlanningConfidenceLevelAlertSeverity", "");
	}
	else {
		
		CampaignPlanningConfidenceLevelAlertSeverity obj = static_cast<CampaignPlanningConfidenceLevelAlertSeverity> (getSeverity());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *severityKey = "severity";
	json_object_set_member(pJsonObject, severityKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CampaignPlanningConfidenceLevelAlert::getDescription()
{
	return description;
}

void
CampaignPlanningConfidenceLevelAlert::setDescription(std::string  description)
{
	this->description = description;
}

CampaignPlanningConfidenceLevelAlertReason
CampaignPlanningConfidenceLevelAlert::getReason()
{
	return reason;
}

void
CampaignPlanningConfidenceLevelAlert::setReason(CampaignPlanningConfidenceLevelAlertReason  reason)
{
	this->reason = reason;
}

CampaignPlanningConfidenceLevelAlertSeverity
CampaignPlanningConfidenceLevelAlert::getSeverity()
{
	return severity;
}

void
CampaignPlanningConfidenceLevelAlert::setSeverity(CampaignPlanningConfidenceLevelAlertSeverity  severity)
{
	this->severity = severity;
}


