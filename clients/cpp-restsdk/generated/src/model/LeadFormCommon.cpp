/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/LeadFormCommon.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



LeadFormCommon::LeadFormCommon()
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
}

LeadFormCommon::~LeadFormCommon()
{
}

void LeadFormCommon::validate()
{
    // TODO: implement validation
}

web::json::value LeadFormCommon::toJson() const
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

    return val;
}

bool LeadFormCommon::fromJson(const web::json::value& val)
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
    return ok;
}

void LeadFormCommon::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
}

bool LeadFormCommon::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    return ok;
}

utility::string_t LeadFormCommon::getName() const
{
    return m_Name;
}

void LeadFormCommon::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool LeadFormCommon::nameIsSet() const
{
    return m_NameIsSet;
}

void LeadFormCommon::unsetName()
{
    m_NameIsSet = false;
}
utility::string_t LeadFormCommon::getPrivacyPolicyLink() const
{
    return m_Privacy_policy_link;
}

void LeadFormCommon::setPrivacyPolicyLink(const utility::string_t& value)
{
    m_Privacy_policy_link = value;
    m_Privacy_policy_linkIsSet = true;
}

bool LeadFormCommon::privacyPolicyLinkIsSet() const
{
    return m_Privacy_policy_linkIsSet;
}

void LeadFormCommon::unsetPrivacy_policy_link()
{
    m_Privacy_policy_linkIsSet = false;
}
bool LeadFormCommon::isHasAcceptedTerms() const
{
    return m_Has_accepted_terms;
}

void LeadFormCommon::setHasAcceptedTerms(bool value)
{
    m_Has_accepted_terms = value;
    m_Has_accepted_termsIsSet = true;
}

bool LeadFormCommon::hasAcceptedTermsIsSet() const
{
    return m_Has_accepted_termsIsSet;
}

void LeadFormCommon::unsetHas_accepted_terms()
{
    m_Has_accepted_termsIsSet = false;
}
utility::string_t LeadFormCommon::getCompletionMessage() const
{
    return m_Completion_message;
}

void LeadFormCommon::setCompletionMessage(const utility::string_t& value)
{
    m_Completion_message = value;
    m_Completion_messageIsSet = true;
}

bool LeadFormCommon::completionMessageIsSet() const
{
    return m_Completion_messageIsSet;
}

void LeadFormCommon::unsetCompletion_message()
{
    m_Completion_messageIsSet = false;
}
std::shared_ptr<LeadFormStatus> LeadFormCommon::getStatus() const
{
    return m_Status;
}

void LeadFormCommon::setStatus(const std::shared_ptr<LeadFormStatus>& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool LeadFormCommon::statusIsSet() const
{
    return m_StatusIsSet;
}

void LeadFormCommon::unsetStatus()
{
    m_StatusIsSet = false;
}
utility::string_t LeadFormCommon::getDisclosureLanguage() const
{
    return m_Disclosure_language;
}

void LeadFormCommon::setDisclosureLanguage(const utility::string_t& value)
{
    m_Disclosure_language = value;
    m_Disclosure_languageIsSet = true;
}

bool LeadFormCommon::disclosureLanguageIsSet() const
{
    return m_Disclosure_languageIsSet;
}

void LeadFormCommon::unsetDisclosure_language()
{
    m_Disclosure_languageIsSet = false;
}
std::vector<std::shared_ptr<LeadFormQuestion>>& LeadFormCommon::getQuestions()
{
    return m_Questions;
}

void LeadFormCommon::setQuestions(const std::vector<std::shared_ptr<LeadFormQuestion>>& value)
{
    m_Questions = value;
    m_QuestionsIsSet = true;
}

bool LeadFormCommon::questionsIsSet() const
{
    return m_QuestionsIsSet;
}

void LeadFormCommon::unsetQuestions()
{
    m_QuestionsIsSet = false;
}
}
}
}
}

