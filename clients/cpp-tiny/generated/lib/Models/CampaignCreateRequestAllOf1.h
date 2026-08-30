
/*
 * CampaignCreateRequestAllOf1.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_CampaignCreateRequestAllOf1_H_
#define TINY_CPP_CLIENT_CampaignCreateRequestAllOf1_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignBidOptionsCreate.h"
#include "EntityStatus.h"
#include "IntendedPromotionType.h"
#include "ObjectiveType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CampaignCreateRequestAllOf1{
public:

    /*! \brief Constructor.
	 */
    CampaignCreateRequestAllOf1();
    CampaignCreateRequestAllOf1(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignCreateRequestAllOf1();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CampaignBidOptionsCreate getBidOptions();

	/*! \brief Set 
	 */
	void setBidOptions(CampaignBidOptionsCreate bid_options);
	/*! \brief Get 
	 */
	IntendedPromotionType getIntendedPromotionType();

	/*! \brief Set 
	 */
	void setIntendedPromotionType(IntendedPromotionType intended_promotion_type);
	/*! \brief Get Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
	 */
	bool isIsAutomatedCampaign();

	/*! \brief Set Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
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
	/*! \brief Get Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
	 */
	bool isIsPerformancePlus();

	/*! \brief Set Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
	 */
	void setIsPerformancePlus(bool is_performance_plus);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.
	 */
	bool isIsTopOfSearch();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>.
	 */
	void setIsTopOfSearch(bool is_top_of_search);
	/*! \brief Get 
	 */
	ObjectiveType getObjectiveType();

	/*! \brief Set 
	 */
	void setObjectiveType(ObjectiveType objective_type);
	/*! \brief Get 
	 */
	EntityStatus getStatus();

	/*! \brief Set 
	 */
	void setStatus(EntityStatus status);


    private:
    CampaignBidOptionsCreate bid_options;
    IntendedPromotionType intended_promotion_type;
    bool is_automated_campaign{};
    bool is_campaign_budget_optimization{};
    bool is_flexible_daily_budgets{};
    bool is_ltv_optimized{};
    bool is_performance_plus{};
    bool is_top_of_search{};
    ObjectiveType objective_type;
    EntityStatus status;
};
}

#endif /* TINY_CPP_CLIENT_CampaignCreateRequestAllOf1_H_ */
