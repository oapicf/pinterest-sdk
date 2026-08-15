

#include "LeadFormUpdateRequest.h"

using namespace Tiny;

LeadFormUpdateRequest::LeadFormUpdateRequest()
{
	completion_message = std::string();
	disclosure_language = std::string();
	has_accepted_terms = bool(false);
	name = std::string();
	policy_links = std::list<LeadFormCommon_policy_links_inner>();
	privacy_policy_link = std::string();
	questions = std::list<LeadFormQuestion>();
	status = LeadFormStatus();
	id = std::string();
}

LeadFormUpdateRequest::LeadFormUpdateRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

LeadFormUpdateRequest::~LeadFormUpdateRequest()
{

}

void
LeadFormUpdateRequest::fromJson(std::string jsonObj)
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

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }


}

bourne::json
LeadFormUpdateRequest::toJson()
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





    object["id"] = getId();



    return object;

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

bool
LeadFormUpdateRequest::isHasAcceptedTerms()
{
	return has_accepted_terms;
}

void
LeadFormUpdateRequest::setHasAcceptedTerms(bool  has_accepted_terms)
{
	this->has_accepted_terms = has_accepted_terms;
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
LeadFormUpdateRequest::getPrivacyPolicyLink()
{
	return privacy_policy_link;
}

void
LeadFormUpdateRequest::setPrivacyPolicyLink(std::string  privacy_policy_link)
{
	this->privacy_policy_link = privacy_policy_link;
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
LeadFormUpdateRequest::getId()
{
	return id;
}

void
LeadFormUpdateRequest::setId(std::string  id)
{
	this->id = id;
}



