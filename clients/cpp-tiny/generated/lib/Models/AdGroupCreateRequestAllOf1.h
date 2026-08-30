
/*
 * AdGroupCreateRequestAllOf1.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdGroupCreateRequestAllOf1_H_
#define TINY_CPP_CLIENT_AdGroupCreateRequestAllOf1_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BudgetType.h"
#include "PacingDeliveryType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdGroupCreateRequestAllOf1{
public:

    /*! \brief Constructor.
	 */
    AdGroupCreateRequestAllOf1();
    AdGroupCreateRequestAllOf1(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdGroupCreateRequestAllOf1();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
	 */
	bool isAutoTargetingEnabled();

	/*! \brief Set Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
	 */
	void setAutoTargetingEnabled(bool auto_targeting_enabled);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
	 */
	long getBidMultiplier();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
	 */
	void setBidMultiplier(long bid_multiplier);
	/*! \brief Get 
	 */
	BudgetType getBudgetType();

	/*! \brief Set 
	 */
	void setBudgetType(BudgetType budget_type);
	/*! \brief Get 
	 */
	PacingDeliveryType getPacingDeliveryType();

	/*! \brief Set 
	 */
	void setPacingDeliveryType(PacingDeliveryType pacing_delivery_type);


    private:
    bool auto_targeting_enabled{};
    long bid_multiplier{};
    BudgetType budget_type;
    PacingDeliveryType pacing_delivery_type;
};
}

#endif /* TINY_CPP_CLIENT_AdGroupCreateRequestAllOf1_H_ */
