#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LeadFormResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LeadFormResponse::LeadFormResponse()
{
	//__init();
}

LeadFormResponse::~LeadFormResponse()
{
	//__cleanup();
}

void
LeadFormResponse::__init()
{
	//name = std::string();
	//privacy_policy_link = std::string();
	//has_accepted_terms = bool(false);
	//completion_message = std::string();
	//status = new LeadFormStatus();
	//disclosure_language = std::string();
	//new std::list()std::list> questions;
	//id = std::string();
	//ad_account_id = std::string();
	//created_time = int(0);
	//updated_time = int(0);
}

void
LeadFormResponse::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(privacy_policy_link != NULL) {
	//
	//delete privacy_policy_link;
	//privacy_policy_link = NULL;
	//}
	//if(has_accepted_terms != NULL) {
	//
	//delete has_accepted_terms;
	//has_accepted_terms = NULL;
	//}
	//if(completion_message != NULL) {
	//
	//delete completion_message;
	//completion_message = NULL;
	//}
	//if(status != NULL) {
	//
	//delete status;
	//status = NULL;
	//}
	//if(disclosure_language != NULL) {
	//
	//delete disclosure_language;
	//disclosure_language = NULL;
	//}
	//if(questions != NULL) {
	//questions.RemoveAll(true);
	//delete questions;
	//questions = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(ad_account_id != NULL) {
	//
	//delete ad_account_id;
	//ad_account_id = NULL;
	//}
	//if(created_time != NULL) {
	//
	//delete created_time;
	//created_time = NULL;
	//}
	//if(updated_time != NULL) {
	//
	//delete updated_time;
	//updated_time = NULL;
	//}
	//
}

void
LeadFormResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *privacy_policy_linkKey = "privacy_policy_link";
	node = json_object_get_member(pJsonObject, privacy_policy_linkKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&privacy_policy_link, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *has_accepted_termsKey = "has_accepted_terms";
	node = json_object_get_member(pJsonObject, has_accepted_termsKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&has_accepted_terms, node, "bool", "");
		} else {
			
		}
	}
	const gchar *completion_messageKey = "completion_message";
	node = json_object_get_member(pJsonObject, completion_messageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&completion_message, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *statusKey = "status";
	node = json_object_get_member(pJsonObject, statusKey);
	if (node !=NULL) {
	

		if (isprimitive("LeadFormStatus")) {
			jsonToValue(&status, node, "LeadFormStatus", "LeadFormStatus");
		} else {
			
			LeadFormStatus* obj = static_cast<LeadFormStatus*> (&status);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *disclosure_languageKey = "disclosure_language";
	node = json_object_get_member(pJsonObject, disclosure_languageKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&disclosure_language, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *questionsKey = "questions";
	node = json_object_get_member(pJsonObject, questionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LeadFormQuestion> new_list;
			LeadFormQuestion inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LeadFormQuestion")) {
					jsonToValue(&inst, temp_json, "LeadFormQuestion", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			questions = new_list;
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
	const gchar *ad_account_idKey = "ad_account_id";
	node = json_object_get_member(pJsonObject, ad_account_idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ad_account_id, node, "std::string", "");
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
	const gchar *updated_timeKey = "updated_time";
	node = json_object_get_member(pJsonObject, updated_timeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&updated_time, node, "int", "");
		} else {
			
		}
	}
}

LeadFormResponse::LeadFormResponse(char* json)
{
	this->fromJson(json);
}

char*
LeadFormResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPrivacyPolicyLink();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *privacy_policy_linkKey = "privacy_policy_link";
	json_object_set_member(pJsonObject, privacy_policy_linkKey, node);
	if (isprimitive("bool")) {
		bool obj = getHasAcceptedTerms();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *has_accepted_termsKey = "has_accepted_terms";
	json_object_set_member(pJsonObject, has_accepted_termsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getCompletionMessage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *completion_messageKey = "completion_message";
	json_object_set_member(pJsonObject, completion_messageKey, node);
	if (isprimitive("LeadFormStatus")) {
		LeadFormStatus obj = getStatus();
		node = converttoJson(&obj, "LeadFormStatus", "");
	}
	else {
		
		LeadFormStatus obj = static_cast<LeadFormStatus> (getStatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statusKey = "status";
	json_object_set_member(pJsonObject, statusKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDisclosureLanguage();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *disclosure_languageKey = "disclosure_language";
	json_object_set_member(pJsonObject, disclosure_languageKey, node);
	if (isprimitive("LeadFormQuestion")) {
		list<LeadFormQuestion> new_list = static_cast<list <LeadFormQuestion> > (getQuestions());
		node = converttoJson(&new_list, "LeadFormQuestion", "array");
	} else {
		node = json_node_alloc();
		list<LeadFormQuestion> new_list = static_cast<list <LeadFormQuestion> > (getQuestions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LeadFormQuestion>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LeadFormQuestion obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *questionsKey = "questions";
	json_object_set_member(pJsonObject, questionsKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getAdAccountId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ad_account_idKey = "ad_account_id";
	json_object_set_member(pJsonObject, ad_account_idKey, node);
	if (isprimitive("int")) {
		int obj = getCreatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *created_timeKey = "created_time";
	json_object_set_member(pJsonObject, created_timeKey, node);
	if (isprimitive("int")) {
		int obj = getUpdatedTime();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *updated_timeKey = "updated_time";
	json_object_set_member(pJsonObject, updated_timeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LeadFormResponse::getName()
{
	return name;
}

void
LeadFormResponse::setName(std::string  name)
{
	this->name = name;
}

std::string
LeadFormResponse::getPrivacyPolicyLink()
{
	return privacy_policy_link;
}

void
LeadFormResponse::setPrivacyPolicyLink(std::string  privacy_policy_link)
{
	this->privacy_policy_link = privacy_policy_link;
}

bool
LeadFormResponse::getHasAcceptedTerms()
{
	return has_accepted_terms;
}

void
LeadFormResponse::setHasAcceptedTerms(bool  has_accepted_terms)
{
	this->has_accepted_terms = has_accepted_terms;
}

std::string
LeadFormResponse::getCompletionMessage()
{
	return completion_message;
}

void
LeadFormResponse::setCompletionMessage(std::string  completion_message)
{
	this->completion_message = completion_message;
}

LeadFormStatus
LeadFormResponse::getStatus()
{
	return status;
}

void
LeadFormResponse::setStatus(LeadFormStatus  status)
{
	this->status = status;
}

std::string
LeadFormResponse::getDisclosureLanguage()
{
	return disclosure_language;
}

void
LeadFormResponse::setDisclosureLanguage(std::string  disclosure_language)
{
	this->disclosure_language = disclosure_language;
}

std::list<LeadFormQuestion>
LeadFormResponse::getQuestions()
{
	return questions;
}

void
LeadFormResponse::setQuestions(std::list <LeadFormQuestion> questions)
{
	this->questions = questions;
}

std::string
LeadFormResponse::getId()
{
	return id;
}

void
LeadFormResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
LeadFormResponse::getAdAccountId()
{
	return ad_account_id;
}

void
LeadFormResponse::setAdAccountId(std::string  ad_account_id)
{
	this->ad_account_id = ad_account_id;
}

int
LeadFormResponse::getCreatedTime()
{
	return created_time;
}

void
LeadFormResponse::setCreatedTime(int  created_time)
{
	this->created_time = created_time;
}

int
LeadFormResponse::getUpdatedTime()
{
	return updated_time;
}

void
LeadFormResponse::setUpdatedTime(int  updated_time)
{
	this->updated_time = updated_time;
}


