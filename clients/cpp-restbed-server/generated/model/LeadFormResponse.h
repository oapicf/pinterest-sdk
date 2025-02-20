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

/*
 * LeadFormResponse.h
 *
 * 
 */

#ifndef LeadFormResponse_H_
#define LeadFormResponse_H_



#include "LeadFormStatus.h"
#include <string>
#include "LeadFormCommon_policy_links_inner.h"
#include "LeadFormQuestion.h"
#include <vector>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "LeadFormCommon.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  LeadFormResponse : public LeadFormCommon
{
public:
    LeadFormResponse() = default;
    explicit LeadFormResponse(boost::property_tree::ptree const& pt);
    virtual ~LeadFormResponse() = default;

    LeadFormResponse(const LeadFormResponse& other) = default; // copy constructor
    LeadFormResponse(LeadFormResponse&& other) noexcept = default; // move constructor

    LeadFormResponse& operator=(const LeadFormResponse& other) = default; // copy assignment
    LeadFormResponse& operator=(LeadFormResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// LeadFormResponse members

    /// <summary>
    /// Internal name of the lead form.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// A link to the advertiser&#39;s privacy policy. This will be included in the lead form&#39;s disclosure language.
    /// </summary>
    std::string getPrivacyPolicyLink() const;
    void setPrivacyPolicyLink(std::string value);

    /// <summary>
    /// Whether the advertiser has accepted Pinterest&#39;s terms of service for creating a lead ad.  By sending us TRUE for this parameter, you agree that (i) you will use any personal information received in compliance with the privacy policy you share with Pinterest, and (ii) you will comply with Pinterest&#39;s &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/lead-ad-terms\&quot;&gt;Lead Ad Terms&lt;/a&gt;. As a reminder, all advertising on Pinterest is subject to the &lt;a href&#x3D;\&quot;https://business.pinterest.com/en/pinterest-advertising-services-agreement/\&quot;&gt;Pinterest Advertising Services Agreement&lt;/a&gt; or an equivalent agreement as set forth on an IO
    /// </summary>
    bool isHasAcceptedTerms() const;
    void setHasAcceptedTerms(bool value);

    /// <summary>
    /// A message for people who complete the form to let them know what happens next.
    /// </summary>
    std::string getCompletionMessage() const;
    void setCompletionMessage(std::string value);

    /// <summary>
    /// 
    /// </summary>
    LeadFormStatus getStatus() const;
    void setStatus(LeadFormStatus value);

    /// <summary>
    /// Additional disclosure language to be included in the lead form.
    /// </summary>
    std::string getDisclosureLanguage() const;
    void setDisclosureLanguage(std::string value);

    /// <summary>
    /// List of questions to be displayed on the lead form.
    /// </summary>
    std::vector<LeadFormQuestion> getQuestions() const;
    void setQuestions(std::vector<LeadFormQuestion> value);

    /// <summary>
    /// List of additional policy links to be displayed on the lead form.
    /// </summary>
    std::vector<LeadFormCommon_policy_links_inner> getPolicyLinks() const;
    void setPolicyLinks(std::vector<LeadFormCommon_policy_links_inner> value);

    /// <summary>
    /// The ID of this lead form
    /// </summary>
    std::string getId() const;
    void setId(std::string value);

    /// <summary>
    /// The Ad Account ID that this lead form belongs to.
    /// </summary>
    std::string getAdAccountId() const;
    void setAdAccountId(std::string value);

    /// <summary>
    /// Lead form creation time. Unix timestamp in seconds.
    /// </summary>
    int32_t getCreatedTime() const;
    void setCreatedTime(int32_t value);

    /// <summary>
    /// Last update time. Unix timestamp in seconds.
    /// </summary>
    int32_t getUpdatedTime() const;
    void setUpdatedTime(int32_t value);

protected:
    std::string m_Name = "";
    std::string m_Privacy_policy_link = "";
    bool m_Has_accepted_terms = false;
    std::string m_Completion_message = "";
    LeadFormStatus m_Status = LeadFormStatus{};
    std::string m_Disclosure_language = "";
    std::vector<LeadFormQuestion> m_Questions;
    std::vector<LeadFormCommon_policy_links_inner> m_Policy_links;
    std::string m_Id = "";
    std::string m_Ad_account_id = "";
    int32_t m_Created_time = 0;
    int32_t m_Updated_time = 0;
};

std::vector<LeadFormResponse> createLeadFormResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<LeadFormResponse>(const LeadFormResponse& val) {
    return val.toPropertyTree();
}

template<>
inline LeadFormResponse fromPt<LeadFormResponse>(const boost::property_tree::ptree& pt) {
    LeadFormResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* LeadFormResponse_H_ */
