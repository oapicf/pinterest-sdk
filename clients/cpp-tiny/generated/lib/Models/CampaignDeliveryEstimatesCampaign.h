
/*
 * CampaignDeliveryEstimatesCampaign.h
 *
 * Campaign configuration for delivery estimates.
 */

#ifndef TINY_CPP_CLIENT_CampaignDeliveryEstimatesCampaign_H_
#define TINY_CPP_CLIENT_CampaignDeliveryEstimatesCampaign_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AdGroupDeliveryEstimates.h"
#include "BudgetDurationType.h"
#include "DeliveryEstimateObjectiveType.h"
#include <list>

namespace Tiny {


/*! \brief Campaign configuration for delivery estimates.
 *
 *  \ingroup Models
 *
 */

class CampaignDeliveryEstimatesCampaign{
public:

    /*! \brief Constructor.
	 */
    CampaignDeliveryEstimatesCampaign();
    CampaignDeliveryEstimatesCampaign(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignDeliveryEstimatesCampaign();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<AdGroupDeliveryEstimates> getAdGroups();

	/*! \brief Set 
	 */
	void setAdGroups(std::list<AdGroupDeliveryEstimates> ad_groups);
	/*! \brief Get Duration type of the budget
	 */
	BudgetDurationType getBudgetDurationType();

	/*! \brief Set Duration type of the budget
	 */
	void setBudgetDurationType(BudgetDurationType budget_duration_type);
	/*! \brief Get Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
	 */
	int getDailySpendCap();

	/*! \brief Set Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
	 */
	void setDailySpendCap(int daily_spend_cap);
	/*! \brief Get End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
	 */
	std::string getEndDate();

	/*! \brief Set End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
	 */
	void setEndDate(std::string end_date);
	/*! \brief Get Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
	 */
	int getLifetimeSpendCap();

	/*! \brief Set Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
	 */
	void setLifetimeSpendCap(int lifetime_spend_cap);
	/*! \brief Get 
	 */
	DeliveryEstimateObjectiveType getObjectiveType();

	/*! \brief Set 
	 */
	void setObjectiveType(DeliveryEstimateObjectiveType objective_type);
	/*! \brief Get Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
	 */
	std::string getStartDate();

	/*! \brief Set Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
	 */
	void setStartDate(std::string start_date);


    private:
    std::list<AdGroupDeliveryEstimates> ad_groups;
    BudgetDurationType budget_duration_type;
    int daily_spend_cap{};
    std::string end_date{};
    int lifetime_spend_cap{};
    DeliveryEstimateObjectiveType objective_type;
    std::string start_date{};
};
}

#endif /* TINY_CPP_CLIENT_CampaignDeliveryEstimatesCampaign_H_ */
