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



#include "CppRestOpenAPIClient/model/LeadFormResponse.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



LeadFormResponse::LeadFormResponse()
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
    m_Id = utility::conversions::to_string_t("");
    m_IdIsSet = false;
    m_Ad_account_id = utility::conversions::to_string_t("");
    m_Ad_account_idIsSet = false;
    m_Created_time = 0;
    m_Created_timeIsSet = false;
    m_Updated_time = 0;
    m_Updated_timeIsSet = false;
}

LeadFormResponse::~LeadFormResponse()
{
}

void LeadFormResponse::validate()
{
    // TODO: implement validation
}

web::json::value LeadFormResponse::toJson() const
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
    if(m_IdIsSet)
    {
        val[utility::conversions::to_string_t(U("id"))] = ModelBase::toJson(m_Id);
    }
    if(m_Ad_account_idIsSet)
    {
        val[utility::conversions::to_string_t(U("ad_account_id"))] = ModelBase::toJson(m_Ad_account_id);
    }
    if(m_Created_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("created_time"))] = ModelBase::toJson(m_Created_time);
    }
    if(m_Updated_timeIsSet)
    {
        val[utility::conversions::to_string_t(U("updated_time"))] = ModelBase::toJson(m_Updated_time);
    }

    return val;
}

bool LeadFormResponse::fromJson(const web::json::value& val)
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
    if(val.has_field(utility::conversions::to_string_t(U("id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setId);
            setId(refVal_setId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("ad_account_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("ad_account_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setAdAccountId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setAdAccountId);
            setAdAccountId(refVal_setAdAccountId);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("created_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("created_time")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setCreatedTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setCreatedTime);
            setCreatedTime(refVal_setCreatedTime);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("updated_time"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("updated_time")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setUpdatedTime;
            ok &= ModelBase::fromJson(fieldValue, refVal_setUpdatedTime);
            setUpdatedTime(refVal_setUpdatedTime);
        }
    }
    return ok;
}

void LeadFormResponse::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
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
    if(m_IdIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("id")), m_Id));
    }
    if(m_Ad_account_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("ad_account_id")), m_Ad_account_id));
    }
    if(m_Created_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("created_time")), m_Created_time));
    }
    if(m_Updated_timeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("updated_time")), m_Updated_time));
    }
}

bool LeadFormResponse::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
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
    if(multipart->hasContent(utility::conversions::to_string_t(U("id"))))
    {
        utility::string_t refVal_setId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("id"))), refVal_setId );
        setId(refVal_setId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("ad_account_id"))))
    {
        utility::string_t refVal_setAdAccountId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("ad_account_id"))), refVal_setAdAccountId );
        setAdAccountId(refVal_setAdAccountId);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("created_time"))))
    {
        int32_t refVal_setCreatedTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("created_time"))), refVal_setCreatedTime );
        setCreatedTime(refVal_setCreatedTime);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("updated_time"))))
    {
        int32_t refVal_setUpdatedTime;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("updated_time"))), refVal_setUpdatedTime );
        setUpdatedTime(refVal_setUpdatedTime);
    }
    return ok;
}

utility::string_t LeadFormResponse::getName() const
{
    return m_Name;
}

void LeadFormResponse::setName(const utility::string_t& value)
{
    m_Name = value;
    m_NameIsSet = true;
}

bool LeadFormResponse::nameIsSet() const
{
    return m_NameIsSet;
}

void LeadFormResponse::unsetName()
{
    m_NameIsSet = false;
}
utility::string_t LeadFormResponse::getPrivacyPolicyLink() const
{
    return m_Privacy_policy_link;
}

void LeadFormResponse::setPrivacyPolicyLink(const utility::string_t& value)
{
    m_Privacy_policy_link = value;
    m_Privacy_policy_linkIsSet = true;
}

bool LeadFormResponse::privacyPolicyLinkIsSet() const
{
    return m_Privacy_policy_linkIsSet;
}

void LeadFormResponse::unsetPrivacy_policy_link()
{
    m_Privacy_policy_linkIsSet = false;
}
bool LeadFormResponse::isHasAcceptedTerms() const
{
    return m_Has_accepted_terms;
}

void LeadFormResponse::setHasAcceptedTerms(bool value)
{
    m_Has_accepted_terms = value;
    m_Has_accepted_termsIsSet = true;
}

bool LeadFormResponse::hasAcceptedTermsIsSet() const
{
    return m_Has_accepted_termsIsSet;
}

void LeadFormResponse::unsetHas_accepted_terms()
{
    m_Has_accepted_termsIsSet = false;
}
utility::string_t LeadFormResponse::getCompletionMessage() const
{
    return m_Completion_message;
}

void LeadFormResponse::setCompletionMessage(const utility::string_t& value)
{
    m_Completion_message = value;
    m_Completion_messageIsSet = true;
}

bool LeadFormResponse::completionMessageIsSet() const
{
    return m_Completion_messageIsSet;
}

void LeadFormResponse::unsetCompletion_message()
{
    m_Completion_messageIsSet = false;
}
std::shared_ptr<LeadFormStatus> LeadFormResponse::getStatus() const
{
    return m_Status;
}

void LeadFormResponse::setStatus(const std::shared_ptr<LeadFormStatus>& value)
{
    m_Status = value;
    m_StatusIsSet = true;
}

bool LeadFormResponse::statusIsSet() const
{
    return m_StatusIsSet;
}

void LeadFormResponse::unsetStatus()
{
    m_StatusIsSet = false;
}
utility::string_t LeadFormResponse::getDisclosureLanguage() const
{
    return m_Disclosure_language;
}

void LeadFormResponse::setDisclosureLanguage(const utility::string_t& value)
{
    m_Disclosure_language = value;
    m_Disclosure_languageIsSet = true;
}

bool LeadFormResponse::disclosureLanguageIsSet() const
{
    return m_Disclosure_languageIsSet;
}

void LeadFormResponse::unsetDisclosure_language()
{
    m_Disclosure_languageIsSet = false;
}
std::vector<std::shared_ptr<LeadFormQuestion>>& LeadFormResponse::getQuestions()
{
    return m_Questions;
}

void LeadFormResponse::setQuestions(const std::vector<std::shared_ptr<LeadFormQuestion>>& value)
{
    m_Questions = value;
    m_QuestionsIsSet = true;
}

bool LeadFormResponse::questionsIsSet() const
{
    return m_QuestionsIsSet;
}

void LeadFormResponse::unsetQuestions()
{
    m_QuestionsIsSet = false;
}
std::vector<std::shared_ptr<LeadFormCommon_policy_links_inner>>& LeadFormResponse::getPolicyLinks()
{
    return m_Policy_links;
}

void LeadFormResponse::setPolicyLinks(const std::vector<std::shared_ptr<LeadFormCommon_policy_links_inner>>& value)
{
    m_Policy_links = value;
    m_Policy_linksIsSet = true;
}

bool LeadFormResponse::policyLinksIsSet() const
{
    return m_Policy_linksIsSet;
}

void LeadFormResponse::unsetPolicy_links()
{
    m_Policy_linksIsSet = false;
}
utility::string_t LeadFormResponse::getId() const
{
    return m_Id;
}

void LeadFormResponse::setId(const utility::string_t& value)
{
    m_Id = value;
    m_IdIsSet = true;
}

bool LeadFormResponse::idIsSet() const
{
    return m_IdIsSet;
}

void LeadFormResponse::unsetId()
{
    m_IdIsSet = false;
}
utility::string_t LeadFormResponse::getAdAccountId() const
{
    return m_Ad_account_id;
}

void LeadFormResponse::setAdAccountId(const utility::string_t& value)
{
    m_Ad_account_id = value;
    m_Ad_account_idIsSet = true;
}

bool LeadFormResponse::adAccountIdIsSet() const
{
    return m_Ad_account_idIsSet;
}

void LeadFormResponse::unsetAd_account_id()
{
    m_Ad_account_idIsSet = false;
}
int32_t LeadFormResponse::getCreatedTime() const
{
    return m_Created_time;
}

void LeadFormResponse::setCreatedTime(int32_t value)
{
    m_Created_time = value;
    m_Created_timeIsSet = true;
}

bool LeadFormResponse::createdTimeIsSet() const
{
    return m_Created_timeIsSet;
}

void LeadFormResponse::unsetCreated_time()
{
    m_Created_timeIsSet = false;
}
int32_t LeadFormResponse::getUpdatedTime() const
{
    return m_Updated_time;
}

void LeadFormResponse::setUpdatedTime(int32_t value)
{
    m_Updated_time = value;
    m_Updated_timeIsSet = true;
}

bool LeadFormResponse::updatedTimeIsSet() const
{
    return m_Updated_timeIsSet;
}

void LeadFormResponse::unsetUpdated_time()
{
    m_Updated_timeIsSet = false;
}
}
}
}
}


