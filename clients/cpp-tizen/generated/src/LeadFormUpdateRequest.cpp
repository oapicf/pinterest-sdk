#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "LeadFormUpdateRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

LeadFormUpdateRequest::LeadFormUpdateRequest()
{
	//__init();
}

LeadFormUpdateRequest::~LeadFormUpdateRequest()
{
	//__cleanup();
}

void
LeadFormUpdateRequest::__init()
{
	//name = std::string();
	//privacy_policy_link = std::string();
	//has_accepted_terms = bool(false);
	//completion_message = std::string();
	//status = new LeadFormStatus();
	//disclosure_language = std::string();
	//new std::list()std::list> questions;
	//new std::list()std::list> policy_links;
	//id = std::string();
}

void
LeadFormUpdateRequest::__cleanup()
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
	//if(policy_links != NULL) {
	//policy_links.RemoveAll(true);
	//delete policy_links;
	//policy_links = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
LeadFormUpdateRequest::fromJson(char* jsonStr)
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
	const gchar *policy_linksKey = "policy_links";
	node = json_object_get_member(pJsonObject, policy_linksKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<LeadFormCommon_policy_links_inner> new_list;
			LeadFormCommon_policy_links_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("LeadFormCommon_policy_links_inner")) {
					jsonToValue(&inst, temp_json, "LeadFormCommon_policy_links_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			policy_links = new_list;
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
}

LeadFormUpdateRequest::LeadFormUpdateRequest(char* json)
{
	this->fromJson(json);
}

char*
LeadFormUpdateRequest::toJson()
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
	if (isprimitive("LeadFormCommon_policy_links_inner")) {
		list<LeadFormCommon_policy_links_inner> new_list = static_cast<list <LeadFormCommon_policy_links_inner> > (getPolicyLinks());
		node = converttoJson(&new_list, "LeadFormCommon_policy_links_inner", "array");
	} else {
		node = json_node_alloc();
		list<LeadFormCommon_policy_links_inner> new_list = static_cast<list <LeadFormCommon_policy_links_inner> > (getPolicyLinks());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<LeadFormCommon_policy_links_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			LeadFormCommon_policy_links_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *policy_linksKey = "policy_links";
	json_object_set_member(pJsonObject, policy_linksKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
LeadFormUpdateRequest::getName()
{
	return name;
}

void
LeadFormUpdateRequest::setName(std::string  name)
{
	this->name = name;
}

std::string
LeadFormUpdateRequest::getPrivacyPolicyLink()
{
	return privacy_policy_link;
}

void
LeadFormUpdateRequest::setPrivacyPolicyLink(std::string  privacy_policy_link)
{
	this->privacy_policy_link = privacy_policy_link;
}

bool
LeadFormUpdateRequest::getHasAcceptedTerms()
{
	return has_accepted_terms;
}

void
LeadFormUpdateRequest::setHasAcceptedTerms(bool  has_accepted_terms)
{
	this->has_accepted_terms = has_accepted_terms;
}

std::string
LeadFormUpdateRequest::getCompletionMessage()
{
	return completion_message;
}

void
LeadFormUpdateRequest::setCompletionMessage(std::string  completion_message)
{
	this->completion_message = completion_message;
}

LeadFormStatus
LeadFormUpdateRequest::getStatus()
{
	return status;
}

void
LeadFormUpdateRequest::setStatus(LeadFormStatus  status)
{
	this->status = status;
}

std::string
LeadFormUpdateRequest::getDisclosureLanguage()
{
	return disclosure_language;
}

void
LeadFormUpdateRequest::setDisclosureLanguage(std::string  disclosure_language)
{
	this->disclosure_language = disclosure_language;
}

std::list<LeadFormQuestion>
LeadFormUpdateRequest::getQuestions()
{
	return questions;
}

void
LeadFormUpdateRequest::setQuestions(std::list <LeadFormQuestion> questions)
{
	this->questions = questions;
}

std::list<LeadFormCommon_policy_links_inner>
LeadFormUpdateRequest::getPolicyLinks()
{
	return policy_links;
}

void
LeadFormUpdateRequest::setPolicyLinks(std::list <LeadFormCommon_policy_links_inner> policy_links)
{
	this->policy_links = policy_links;
}

std::string
LeadFormUpdateRequest::getId()
{
	return id;
}

void
LeadFormUpdateRequest::setId(std::string  id)
{
	this->id = id;
}


