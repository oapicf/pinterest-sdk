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
 * CampaignCreateRequest.h
 *
 * 
 */

#ifndef CampaignCreateRequest_H_
#define CampaignCreateRequest_H_



#include "EntityStatus.h"
#include "ObjectiveType.h"
#include <string>
#include "TrackingUrls.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "CampaignCreateCommon.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  CampaignCreateRequest : public CampaignCreateCommon
{
public:
    CampaignCreateRequest() = default;
    explicit CampaignCreateRequest(boost::property_tree::ptree const& pt);
    virtual ~CampaignCreateRequest() = default;

    CampaignCreateRequest(const CampaignCreateRequest& other) = default; // copy constructor
    CampaignCreateRequest(CampaignCreateRequest&& other) noexcept = default; // move constructor

    CampaignCreateRequest& operator=(const CampaignCreateRequest& other) = default; // copy assignment
    CampaignCreateRequest& operator=(CampaignCreateRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CampaignCreateRequest members

    /// <summary>
    /// Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
    /// </summary>
    std::string getAdAccountId() const;
    void setAdAccountId(std::string value);

    /// <summary>
    /// Campaign name.
    /// </summary>
    std::string getName() const;
    void setName(std::string value);

    /// <summary>
    /// 
    /// </summary>
    EntityStatus getStatus() const;
    void setStatus(EntityStatus value);

    /// <summary>
    /// Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.
    /// </summary>
    int32_t getLifetimeSpendCap() const;
    void setLifetimeSpendCap(int32_t value);

    /// <summary>
    /// Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.
    /// </summary>
    int32_t getDailySpendCap() const;
    void setDailySpendCap(int32_t value);

    /// <summary>
    /// Order line ID that appears on the invoice.
    /// </summary>
    std::string getOrderLineId() const;
    void setOrderLineId(std::string value);

    /// <summary>
    /// 
    /// </summary>
    TrackingUrls getTrackingUrls() const;
    void setTrackingUrls(TrackingUrls value);

    /// <summary>
    /// Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
    /// </summary>
    int32_t getStartTime() const;
    void setStartTime(int32_t value);

    /// <summary>
    /// Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
    /// </summary>
    int32_t getEndTime() const;
    void setEndTime(int32_t value);

    /// <summary>
    /// Determine if a campaign has flexible daily budgets setup.
    /// </summary>
    bool isIsFlexibleDailyBudgets() const;
    void setIsFlexibleDailyBudgets(bool value);

    /// <summary>
    /// When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
    /// </summary>
    int32_t getDefaultAdGroupBudgetInMicroCurrency() const;
    void setDefaultAdGroupBudgetInMicroCurrency(int32_t value);

    /// <summary>
    /// Specifies whether the campaign was created in the automated campaign flow
    /// </summary>
    bool isIsAutomatedCampaign() const;
    void setIsAutomatedCampaign(bool value);

    /// <summary>
    /// 
    /// </summary>
    ObjectiveType getObjectiveType() const;
    void setObjectiveType(ObjectiveType value);

protected:
    std::string m_Ad_account_id = "";
    std::string m_Name = "";
    EntityStatus m_Status = "ACTIVE";
    int32_t m_Lifetime_spend_cap = 0;
    int32_t m_Daily_spend_cap = 0;
    std::string m_Order_line_id = "";
    TrackingUrls m_Tracking_urls;
    int32_t m_Start_time = 0;
    int32_t m_End_time = 0;
    bool m_Is_flexible_daily_budgets = false;
    int32_t m_Default_ad_group_budget_in_micro_currency = 0;
    bool m_Is_automated_campaign = false;
    ObjectiveType m_Objective_type = ObjectiveType{};
};

std::vector<CampaignCreateRequest> createCampaignCreateRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CampaignCreateRequest>(const CampaignCreateRequest& val) {
    return val.toPropertyTree();
}

template<>
inline CampaignCreateRequest fromPt<CampaignCreateRequest>(const boost::property_tree::ptree& pt) {
    CampaignCreateRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CampaignCreateRequest_H_ */
