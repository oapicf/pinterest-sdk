

#include "LeadFormResponse.h"

using namespace Tiny;

LeadFormResponse::LeadFormResponse()
{
	completion_message = std::string();
	disclosure_language = std::string();
	has_accepted_terms = bool(false);
	name = std::string();
	policy_links = std::list<LeadFormCommon_policy_links_inner>();
	privacy_policy_link = std::string();
	questions = std::list<LeadFormQuestion>();
	status = LeadFormStatus();
	ad_account_id = std::string();
	created_time = int(0);
	id = std::string();
	updated_time = int(0);
}

LeadFormResponse::LeadFormResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadFormResponse::~LeadFormResponse()
{

}

void
LeadFormResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *completion_messageKey = "completion_message";

    if(object.has_key(completion_messageKey))
    {
        bourne::json value = object[completion_messageKey];



        jsonToValue(&completion_message, value, "std::string");


    }

    const char *disclosure_languageKey = "disclosure_language";

    if(object.has_key(disclosure_languageKey))
    {
        bourne::json value = object[disclosure_languageKey];



        jsonToValue(&disclosure_language, value, "std::string");


    }

    const char *has_accepted_termsKey = "has_accepted_terms";

    if(object.has_key(has_accepted_termsKey))
    {
        bourne::json value = object[has_accepted_termsKey];



        jsonToValue(&has_accepted_terms, value, "bool");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *policy_linksKey = "policy_links";

    if(object.has_key(policy_linksKey))
    {
        bourne::json value = object[policy_linksKey];


        std::list<LeadFormCommon_policy_links_inner> policy_links_list;
        LeadFormCommon_policy_links_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            policy_links_list.push_back(element);
        }
        policy_links = policy_links_list;


    }

    const char *privacy_policy_linkKey = "privacy_policy_link";

    if(object.has_key(privacy_policy_linkKey))
    {
        bourne::json value = object[privacy_policy_linkKey];



        jsonToValue(&privacy_policy_link, value, "std::string");


    }

    const char *questionsKey = "questions";

    if(object.has_key(questionsKey))
    {
        bourne::json value = object[questionsKey];


        std::list<LeadFormQuestion> questions_list;
        LeadFormQuestion element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            questions_list.push_back(element);
        }
        questions = questions_list;


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];




        LeadFormStatus* obj = &status;
		obj->fromJson(value.dump());

    }

    const char *ad_account_idKey = "ad_account_id";

    if(object.has_key(ad_account_idKey))
    {
        bourne::json value = object[ad_account_idKey];



        jsonToValue(&ad_account_id, value, "std::string");


    }

    const char *created_timeKey = "created_time";

    if(object.has_key(created_timeKey))
    {
        bourne::json value = object[created_timeKey];



        jsonToValue(&created_time, value, "int");


    }

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *updated_timeKey = "updated_time";

    if(object.has_key(updated_timeKey))
    {
        bourne::json value = object[updated_timeKey];



        jsonToValue(&updated_time, value, "int");


    }


}

bourne::json
LeadFormResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["completion_message"] = getCompletionMessage();






    object["disclosure_language"] = getDisclosureLanguage();






    object["has_accepted_terms"] = isHasAcceptedTerms();






    object["name"] = getName();





    std::list<LeadFormCommon_policy_links_inner> policy_links_list = getPolicyLinks();
    bourne::json policy_links_arr = bourne::json::array();

    for(auto& var : policy_links_list)
    {
        LeadFormCommon_policy_links_inner obj = var;
        policy_links_arr.append(obj.toJson());
    }
    object["policy_links"] = policy_links_arr;







    object["privacy_policy_link"] = getPrivacyPolicyLink();





    std::list<LeadFormQuestion> questions_list = getQuestions();
    bourne::json questions_arr = bourne::json::array();

    for(auto& var : questions_list)
    {
        LeadFormQuestion obj = var;
        questions_arr.append(obj.toJson());
    }
    object["questions"] = questions_arr;








	object["status"] = getStatus().toJson();





    object["ad_account_id"] = getAdAccountId();






    object["created_time"] = getCreatedTime();






    object["id"] = getId();






    object["updated_time"] = getUpdatedTime();



    return object;

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

bool
LeadFormResponse::isHasAcceptedTerms()
{
	return has_accepted_terms;
}

void
LeadFormResponse::setHasAcceptedTerms(bool  has_accepted_terms)
{
	this->has_accepted_terms = has_accepted_terms;
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

std::list<LeadFormCommon_policy_links_inner>
LeadFormResponse::getPolicyLinks()
{
	return policy_links;
}

void
LeadFormResponse::setPolicyLinks(std::list <LeadFormCommon_policy_links_inner> policy_links)
{
	this->policy_links = policy_links;
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



