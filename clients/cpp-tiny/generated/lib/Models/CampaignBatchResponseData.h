
/*
 * CampaignBatchResponseData.h
 *
 * Campaign data in batch response, with all fields optional to support error cases where data may be empty.
 */

#ifndef TINY_CPP_CLIENT_CampaignBatchResponseData_H_
#define TINY_CPP_CLIENT_CampaignBatchResponseData_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignBidOptions.h"
#include "CampaignObjectiveType.h"
#include "IntendedPromotionType.h"
#include "NullableEntityStatus.h"
#include "PerformancePlusCampaignSettings.h"
#include "SummaryStatus.h"
#include "TrackingUrls.h"

namespace Tiny {


/*! \brief Campaign data in batch response, with all fields optional to support error cases where data may be empty.
 *
 *  \ingroup Models
 *
 */

class CampaignBatchResponseData{
public:

    /*! \brief Constructor.
	 */
    CampaignBatchResponseData();
    CampaignBatchResponseData(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignBatchResponseData();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Campaign's Advertiser ID.
	 */
	std::string getAdAccountId();

	/*! \brief Set Campaign's Advertiser ID.
	 */
	void setAdAccountId(std::string ad_account_id);
	/*! \brief Get [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
	 */
	CampaignBidOptions getBidOptions();

	/*! \brief Set [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
	 */
	void setBidOptions(CampaignBidOptions bid_options);
	/*! \brief Get Campaign creation time. Unix timestamp in seconds.
	 */
	int getCreatedTime();

	/*! \brief Set Campaign creation time. Unix timestamp in seconds.
	 */
	void setCreatedTime(int created_time);
	/*! \brief Get Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
	 */
	int getDailySpendCap();

	/*! \brief Set Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
	 */
	void setDailySpendCap(int daily_spend_cap);
	/*! \brief Get When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
	 */
	int getDefaultAdGroupBudgetInMicroCurrency();

	/*! \brief Set When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
	 */
	void setDefaultAdGroupBudgetInMicroCurrency(int default_ad_group_budget_in_micro_currency);
	/*! \brief Get Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
	 */
	int getEndTime();

	/*! \brief Set Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
	 */
	void setEndTime(int end_time);
	/*! \brief Get Campaign ID.
	 */
	std::string getId();

	/*! \brief Set Campaign ID.
	 */
	void setId(std::string id);
	/*! \brief Get 
	 */
	IntendedPromotionType getIntendedPromotionType();

	/*! \brief Set 
	 */
	void setIntendedPromotionType(IntendedPromotionType intended_promotion_type);
	/*! \brief Get Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
	 */
	bool isIsAutomatedCampaign();

	/*! \brief Set Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
	 */
	void setIsAutomatedCampaign(bool is_automated_campaign);
	/*! \brief Get Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
	 */
	bool isIsCampaignBudgetOptimization();

	/*! \brief Set Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
	 */
	void setIsCampaignBudgetOptimization(bool is_campaign_budget_optimization);
	/*! \brief Get Whether the campaign contains a carting(where-to-buy link) ad.
	 */
	bool isIsCarting();

	/*! \brief Set Whether the campaign contains a carting(where-to-buy link) ad.
	 */
	void setIsCarting(bool is_carting);
	/*! \brief Get Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
	 */
	bool isIsFlexibleDailyBudgets();

	/*! \brief Set Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
	 */
	void setIsFlexibleDailyBudgets(bool is_flexible_daily_budgets);
	/*! \brief Get Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
	 */
	bool isIsLtvOptimized();

	/*! \brief Set Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
	 */
	void setIsLtvOptimized(bool is_ltv_optimized);
	/*! \brief Get Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
	 */
	bool isIsPerformancePlus();

	/*! \brief Set Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
	 */
	void setIsPerformancePlus(bool is_performance_plus);
	/*! \brief Get Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
	 */
	bool isIsTopOfSearch();

	/*! \brief Set Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
	 */
	void setIsTopOfSearch(bool is_top_of_search);
	/*! \brief Get Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
	 */
	int getLifetimeSpendCap();

	/*! \brief Set Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
	 */
	void setLifetimeSpendCap(int lifetime_spend_cap);
	/*! \brief Get Campaign name - 255 chars max.
	 */
	std::string getName();

	/*! \brief Set Campaign name - 255 chars max.
	 */
	void setName(std::string name);
	/*! \brief Get 
	 */
	CampaignObjectiveType getObjectiveType();

	/*! \brief Set 
	 */
	void setObjectiveType(CampaignObjectiveType objective_type);
	/*! \brief Get Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
	 */
	std::string getOrderLineId();

	/*! \brief Set Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
	 */
	void setOrderLineId(std::string order_line_id);
	/*! \brief Get Pinterest Performance+ campaign settings.
	 */
	PerformancePlusCampaignSettings getPerformancePlusCampaignSettings();

	/*! \brief Set Pinterest Performance+ campaign settings.
	 */
	void setPerformancePlusCampaignSettings(PerformancePlusCampaignSettings performance_plus_campaign_settings);
	/*! \brief Get Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
	 */
	int getStartTime();

	/*! \brief Set Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
	 */
	void setStartTime(int start_time);
	/*! \brief Get 
	 */
	NullableEntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(NullableEntityStatus status);
	/*! \brief Get 
	 */
	SummaryStatus getSummaryStatus();

	/*! \brief Set 
	 */
	void setSummaryStatus(SummaryStatus summary_status);
	/*! \brief Get 
	 */
	TrackingUrls getTrackingUrls();

	/*! \brief Set 
	 */
	void setTrackingUrls(TrackingUrls tracking_urls);
	/*! \brief Get Always \"campaign\".
	 */
	std::string getType();

	/*! \brief Set Always \"campaign\".
	 */
	void setType(std::string type);
	/*! \brief Get UTC timestamp. Last update time.
	 */
	int getUpdatedTime();

	/*! \brief Set UTC timestamp. Last update time.
	 */
	void setUpdatedTime(int updated_time);


    private:
    std::string ad_account_id{};
    CampaignBidOptions bid_options;
    int created_time{};
    int daily_spend_cap{};
    int default_ad_group_budget_in_micro_currency{};
    int end_time{};
    std::string id{};
    IntendedPromotionType intended_promotion_type;
    bool is_automated_campaign{};
    bool is_campaign_budget_optimization{};
    bool is_carting{};
    bool is_flexible_daily_budgets{};
    bool is_ltv_optimized{};
    bool is_performance_plus{};
    bool is_top_of_search{};
    int lifetime_spend_cap{};
    std::string name{};
    CampaignObjectiveType objective_type;
    std::string order_line_id{};
    PerformancePlusCampaignSettings performance_plus_campaign_settings;
    int start_time{};
    NullableEntityStatus status;
    SummaryStatus summary_status;
    TrackingUrls tracking_urls;
    std::string type{};
    int updated_time{};
};
}

#endif /* TINY_CPP_CLIENT_CampaignBatchResponseData_H_ */
