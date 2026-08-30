
/*
 * CampaignCreateItem.h
 *
 * Single campaign create item with create-specific defaults.
 */

#ifndef TINY_CPP_CLIENT_CampaignCreateItem_H_
#define TINY_CPP_CLIENT_CampaignCreateItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignBidOptions.h"
#include "ConversionObjectiveType.h"
#include "EntityStatus.h"
#include "IntendedPromotionType.h"
#include "MobileAppPlatform.h"
#include "TrackingUrls.h"

namespace Tiny {


/*! \brief Single campaign create item with create-specific defaults.
 *
 *  \ingroup Models
 *
 */

class CampaignCreateItem{
public:

    /*! \brief Constructor.
	 */
    CampaignCreateItem();
    CampaignCreateItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignCreateItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Setting this field does nothing. The ad account ID gets set from the path parameter.
	 */
	std::string getAdAccountId();

	/*! \brief Set Setting this field does nothing. The ad account ID gets set from the path parameter.
	 */
	void setAdAccountId(std::string ad_account_id);
	/*! \brief Get [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for `APP_INSTALL` campaigns.
	 */
	std::string getAppId();

	/*! \brief Set [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for `APP_INSTALL` campaigns.
	 */
	void setAppId(std::string app_id);
	/*! \brief Get [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for `APP_INSTALL` campaigns.
	 */
	MobileAppPlatform getAppPlatform();

	/*! \brief Set [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for `APP_INSTALL` campaigns.
	 */
	void setAppPlatform(MobileAppPlatform app_platform);
	/*! \brief Get [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
	 */
	CampaignBidOptions getBidOptions();

	/*! \brief Set [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
	 */
	void setBidOptions(CampaignBidOptions bid_options);
	/*! \brief Get Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
	 */
	int getDailySpendCap();

	/*! \brief Set Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
	 */
	void setDailySpendCap(int daily_spend_cap);
	/*! \brief Get Setting this field does nothing.
	 */
	int getDefaultAdGroupBudgetInMicroCurrency();

	/*! \brief Set Setting this field does nothing.
	 */
	void setDefaultAdGroupBudgetInMicroCurrency(int default_ad_group_budget_in_micro_currency);
	/*! \brief Get Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
	 */
	int getEndTime();

	/*! \brief Set Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
	 */
	void setEndTime(int end_time);
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
	ConversionObjectiveType getObjectiveType();

	/*! \brief Set 
	 */
	void setObjectiveType(ConversionObjectiveType objective_type);
	/*! \brief Get Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
	 */
	std::string getOrderLineId();

	/*! \brief Set Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
	 */
	void setOrderLineId(std::string order_line_id);
	/*! \brief Get Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
	 */
	int getStartTime();

	/*! \brief Set Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
	 */
	void setStartTime(int start_time);
	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus status);
	/*! \brief Get 
	 */
	TrackingUrls getTrackingUrls();

	/*! \brief Set 
	 */
	void setTrackingUrls(TrackingUrls tracking_urls);


    private:
    std::string ad_account_id{};
    std::string app_id{};
    MobileAppPlatform app_platform;
    CampaignBidOptions bid_options;
    int daily_spend_cap{};
    int default_ad_group_budget_in_micro_currency{};
    int end_time{};
    IntendedPromotionType intended_promotion_type;
    bool is_automated_campaign{};
    bool is_campaign_budget_optimization{};
    bool is_flexible_daily_budgets{};
    bool is_ltv_optimized{};
    bool is_performance_plus{};
    bool is_top_of_search{};
    int lifetime_spend_cap{};
    std::string name{};
    ConversionObjectiveType objective_type;
    std::string order_line_id{};
    int start_time{};
    EntityStatus status;
    TrackingUrls tracking_urls;
};
}

#endif /* TINY_CPP_CLIENT_CampaignCreateItem_H_ */
