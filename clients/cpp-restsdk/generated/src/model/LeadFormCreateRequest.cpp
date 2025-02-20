/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/LeadFormCreateRequest.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



LeadFormCreateRequest::LeadFormCreateRequest()
{
    m_Name = utility::conversions::to_string_t("");
    m_NameIsSet = false;
    m_Privacy_policy_link = utility::conversions::to_string_t("");
    m_Privacy_policy_linkIsSet = false;
    m_Has_accepted_terms = false;
    m_Has_accepted_termsIsSet = false;
    m_Completion_message = utility::conversions::to_string_t("");
    m_Completion_messageIsSet = false;
    m_StatusIsSet = false;
    m_Disclosure_language = utility::conversions::to_string_t("");
    m_Disclosure_languageIsSet = false;
    m_QuestionsIsSet = false;
    m_Policy_linksIsSet = false;
}

LeadFormCreateRequest::~LeadFormCreateRequest()
{
}

void LeadFormCreateRequest::validate()
{
    // TODO: implement validation
}

web::json::value LeadFormCreateRequest::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_NameIsSet)
    {
        val[utility::conversions::to_string_t(U("name"))] = ModelBase::toJson(m_Name);
    }
    if(m_Privacy_policy_linkIsSet)
    {
        val[utility::conversions::to_string_t(U("privacy_policy_link"))] = ModelBase::toJson(m_Privacy_policy_link);
    }
    if(m_Has_accepted_termsIsSet)
    {
        val[utility::conversions::to_string_t(U("has_accepted_terms"))] = ModelBase::toJson(m_Has_accepted_terms);
    }
    if(m_Completion_messageIsSet)
    {
        val[utility::conversions::to_string_t(U("completion_message"))] = ModelBase::toJson(m_Completion_message);
    }
    if(m_StatusIsSet)
    {
        val[utility::conversions::to_string_t(U("status"))] = ModelBase::toJson(m_Status);
    }
    if(m_Disclosure_languageIsSet)
    {
        val[utility::conversions::to_string_t(U("disclosure_language"))] = ModelBase::toJson(m_Disclosure_language);
    }
    if(m_QuestionsIsSet)
    {
        val[utility::conversions::to_string_t(U("questions"))] = ModelBase::toJson(m_Questions);
    }
    if(m_Policy_linksIsSet)
    {
        val[utility::conversions::to_string_t(U("policy_links"))] = ModelBase::toJson(m_Policy_links);
    }

    return val;
}

bool LeadFormCreateRequest::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("name"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("name")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setName;
            ok &= ModelBase::fromJson(fieldValue, refVal_setName);
            setName(refVal_setName);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("privacy_policy_link"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("privacy_policy_link")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setPrivacyPolicyLink;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPrivacyPolicyLink);
            setPrivacyPolicyLink(refVal_setPrivacyPolicyLink);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("has_accepted_terms"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("has_accepted_terms")));
        if(!fieldValue.is_null())
        {
            bool refVal_setHasAcceptedTerms;
            ok &= ModelBase::fromJson(fieldValue, refVal_setHasAcceptedTerms);
            setHasAcceptedTerms(refVal_setHasAcceptedTerms);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("completion_message"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("completion_message")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setCompletionMessage;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCompletionMessage);
            setCompletionMessage(refVal_setCompletionMessage);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("status"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("status")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<LeadFormStatus> refVal_setStatus;
            ok &= ModelBase::fromJson(fieldValue, refVal_setStatus);
            setStatus(refVal_setStatus);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("disclosure_language"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("disclosure_language")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setDisclosureLanguage;
            ok &= ModelBase::fromJson(fieldValue, refVal_setDisclosureLanguage);
            setDisclosureLanguage(refVal_setDisclosureLanguage);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("questions"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("questions")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<LeadFormQuestion>> refVal_setQuestions;
            ok &= ModelBase::fromJson(fieldValue, refVal_setQuestions);
            setQuestions(refVal_setQuestions);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("policy_links"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("policy_links")));
        if(!fieldValue.is_null())
        {
            std::vector<std::shared_ptr<LeadFormCommon_policy_links_inner>> refVal_setPolicyLinks;
            ok &= ModelBase::fromJson(fieldValue, refVal_setPolicyLinks);
            setPolicyLinks(refVal_setPolicyLinks);
        }
    }
    return ok;
}

void LeadFormCreateRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_NameIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("name")), m_Name));
    }
    if(m_Privacy_policy_linkIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("privacy_policy_link")), m_Privacy_policy_link));
    }
    if(m_Has_accepted_termsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("has_accepted_terms")), m_Has_accepted_terms));
    }
    if(m_Completion_messageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("completion_message")), m_Completion_message));
    }
    if(m_StatusIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("status")), m_Status));
    }
    if(m_Disclosure_languageIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("disclosure_language")), m_Disclosure_language));
    }
    if(m_QuestionsIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("questions")), m_Questions));
    }
    if(m_Policy_linksIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("policy_links")), m_Policy_links));
    }
}

bool LeadFormCreateRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("name"))))
    {
        utility::string_t refVal_setName;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("name"))), refVal_setName );
        setName(refVal_setName);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("privacy_policy_link"))))
    {
        utility::string_t refVal_setPrivacyPolicyLink;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("privacy_policy_link"))), refVal_setPrivacyPolicyLink );
        setPrivacyPolicyLink(refVal_setPrivacyPolicyLink);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("has_accepted_terms"))))
    {
        bool refVal_setHasAcceptedTerms;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("has_accepted_terms"))), refVal_setHasAcceptedTerms );
        setHasAcceptedTerms(refVal_setHasAcceptedTerms);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("completion_message"))))
    {
        utility::string_t refVal_setCompletionMessage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("completion_message"))), refVal_setCompletionMessage );
        setCompletionMessage(refVal_setCompletionMessage);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("status"))))
    {
        std::shared_ptr<LeadFormStatus> refVal_setStatus;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("status"))), refVal_setStatus );
        setStatus(refVal_setStatus);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("disclosure_language"))))
    {
        utility::string_t refVal_setDisclosureLanguage;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("disclosure_language"))), refVal_setDisclosureLanguage );
        setDisclosureLanguage(refVal_setDisclosureLanguage);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("questions"))))
    {
        std::vector<std::shared_ptr<LeadFormQuestion>> refVal_setQuestions;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("questions"))), refVal_setQuestions );
        setQuestions(refVal_setQuestions);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("policy_links"))))
    {
        std::vector<std::shared_ptr<LeadFormCommon_policy_links_inner>> refVal_setPolicyLinks;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("policy_links"))), refVal_setPolicyLinks );
        setPolicyLinks(refVal_setPolicyLinks);
    }
    return ok;
}

utility::string_t LeadFormCreateRequest::getName() const
{
    return m_Name;
}

void LeadFormCreateRequest::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool LeadFormCreateRequest::nameIsSet() const
{
    return m_NameIsSet;
}

void LeadFormCreateRequest::unsetName()
{
    m_NameIsSet = false;
}
utility::string_t LeadFormCreateRequest::getPrivacyPolicyLink() const
{
    return m_Privacy_policy_link;
}

void LeadFormCreateRequest::setPrivacyPolicyLink(const utility::string_t& value)
{
    m_Privacy_policy_link = value;
    m_Privacy_policy_linkIsSet = true;
}

bool LeadFormCreateRequest::privacyPolicyLinkIsSet() const
{
    return m_Privacy_policy_linkIsSet;
}

void LeadFormCreateRequest::unsetPrivacy_policy_link()
{
    m_Privacy_policy_linkIsSet = false;
}
bool LeadFormCreateRequest::isHasAcceptedTerms() const
{
    return m_Has_accepted_terms;
}

void LeadFormCreateRequest::setHasAcceptedTerms(bool value)
{
    m_Has_accepted_terms = value;
    m_Has_accepted_termsIsSet = true;
}

bool LeadFormCreateRequest::hasAcceptedTermsIsSet() const
{
    return m_Has_accepted_termsIsSet;
}

void LeadFormCreateRequest::unsetHas_accepted_terms()
{
    m_Has_accepted_termsIsSet = false;
}
utility::string_t LeadFormCreateRequest::getCompletionMessage() const
{
    return m_Completion_message;
}

void LeadFormCreateRequest::setCompletionMessage(const utility::string_t& value)
{
    m_Completion_message = value;
    m_Completion_messageIsSet = true;
}

bool LeadFormCreateRequest::completionMessageIsSet() const
{
    return m_Completion_messageIsSet;
}

void LeadFormCreateRequest::unsetCompletion_message()
{
    m_Completion_messageIsSet = false;
}
std::shared_ptr<LeadFormStatus> LeadFormCreateRequest::getStatus() const
{
    return m_Status;
}

void LeadFormCreateRequest::setStatus(const std::shared_ptr<LeadFormStatus>& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool LeadFormCreateRequest::statusIsSet() const
{
    return m_StatusIsSet;
}

void LeadFormCreateRequest::unsetStatus()
{
    m_StatusIsSet = false;
}
utility::string_t LeadFormCreateRequest::getDisclosureLanguage() const
{
    return m_Disclosure_language;
}

void LeadFormCreateRequest::setDisclosureLanguage(const utility::string_t& value)
{
    m_Disclosure_language = value;
    m_Disclosure_languageIsSet = true;
}

bool LeadFormCreateRequest::disclosureLanguageIsSet() const
{
    return m_Disclosure_languageIsSet;
}

void LeadFormCreateRequest::unsetDisclosure_language()
{
    m_Disclosure_languageIsSet = false;
}
std::vector<std::shared_ptr<LeadFormQuestion>>& LeadFormCreateRequest::getQuestions()
{
    return m_Questions;
}

void LeadFormCreateRequest::setQuestions(const std::vector<std::shared_ptr<LeadFormQuestion>>& value)
{
    m_Questions = value;
    m_QuestionsIsSet = true;
}

bool LeadFormCreateRequest::questionsIsSet() const
{
    return m_QuestionsIsSet;
}

void LeadFormCreateRequest::unsetQuestions()
{
    m_QuestionsIsSet = false;
}
std::vector<std::shared_ptr<LeadFormCommon_policy_links_inner>>& LeadFormCreateRequest::getPolicyLinks()
{
    return m_Policy_links;
}

void LeadFormCreateRequest::setPolicyLinks(const std::vector<std::shared_ptr<LeadFormCommon_policy_links_inner>>& value)
{
    m_Policy_links = value;
    m_Policy_linksIsSet = true;
}

bool LeadFormCreateRequest::policyLinksIsSet() const
{
    return m_Policy_linksIsSet;
}

void LeadFormCreateRequest::unsetPolicy_links()
{
    m_Policy_linksIsSet = false;
}
}
}
}
}


