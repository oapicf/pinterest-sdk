#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CampaignPlanningResponseError.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CampaignPlanningResponseError::CampaignPlanningResponseError()
{
	//__init();
}

CampaignPlanningResponseError::~CampaignPlanningResponseError()
{
	//__cleanup();
}

void
CampaignPlanningResponseError::__init()
{
	//code = new CampaignPlanningResponseErrorCode();
	//message = std::string();
}

void
CampaignPlanningResponseError::__cleanup()
{
	//if(code != NULL) {
	//
	//delete code;
	//code = NULL;
	//}
	//if(message != NULL) {
	//
	//delete message;
	//message = NULL;
	//}
	//
}

void
CampaignPlanningResponseError::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *codeKey = "code";
	node = json_object_get_member(pJsonObject, codeKey);
	if (node !=NULL) {
	

		if (isprimitive("CampaignPlanningResponseErrorCode")) {
			jsonToValue(&code, node, "CampaignPlanningResponseErrorCode", "CampaignPlanningResponseErrorCode");
		} else {
			
			CampaignPlanningResponseErrorCode* obj = static_cast<CampaignPlanningResponseErrorCode*> (&code);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *messageKey = "message";
	node = json_object_get_member(pJsonObject, messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&message, node, "std::string", "");
		} else {
			
		}
	}
}

CampaignPlanningResponseError::CampaignPlanningResponseError(char* json)
{
	this->fromJson(json);
}

char*
CampaignPlanningResponseError::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("CampaignPlanningResponseErrorCode")) {
		CampaignPlanningResponseErrorCode obj = getCode();
		node = converttoJson(&obj, "CampaignPlanningResponseErrorCode", "");
	}
	else {
		
		CampaignPlanningResponseErrorCode obj = static_cast<CampaignPlanningResponseErrorCode> (getCode());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *codeKey = "code";
	json_object_set_member(pJsonObject, codeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *messageKey = "message";
	json_object_set_member(pJsonObject, messageKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

CampaignPlanningResponseErrorCode
CampaignPlanningResponseError::getCode()
{
	return code;
}

void
CampaignPlanningResponseError::setCode(CampaignPlanningResponseErrorCode  code)
{
	this->code = code;
}

std::string
CampaignPlanningResponseError::getMessage()
{
	return message;
}

void
CampaignPlanningResponseError::setMessage(std::string  message)
{
	this->message = message;
}


