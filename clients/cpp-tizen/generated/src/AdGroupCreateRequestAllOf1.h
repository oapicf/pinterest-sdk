/*
 * AdGroupCreateRequestAllOf1.h
 *
 * 
 */

#ifndef _AdGroupCreateRequestAllOf1_H_
#define _AdGroupCreateRequestAllOf1_H_


#include <string>
#include "BudgetType.h"
#include "PacingDeliveryType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdGroupCreateRequestAllOf1 : public Object {
public:
	/*! \brief Constructor.
	 */
	AdGroupCreateRequestAllOf1();
	AdGroupCreateRequestAllOf1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdGroupCreateRequestAllOf1();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
	 */
	bool getAutoTargetingEnabled();

	/*! \brief Set Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
	 */
	void setAutoTargetingEnabled(bool  auto_targeting_enabled);
	/*! \brief Get <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
	 */
	long long getBidMultiplier();

	/*! \brief Set <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
	 */
	void setBidMultiplier(long long  bid_multiplier);
	/*! \brief Get 
	 */
	BudgetType getBudgetType();

	/*! \brief Set 
	 */
	void setBudgetType(BudgetType  budget_type);
	/*! \brief Get 
	 */
	PacingDeliveryType getPacingDeliveryType();

	/*! \brief Set 
	 */
	void setPacingDeliveryType(PacingDeliveryType  pacing_delivery_type);

private:
	bool auto_targeting_enabled;
	long long bid_multiplier;
	BudgetType budget_type;
	PacingDeliveryType pacing_delivery_type;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdGroupCreateRequestAllOf1_H_ */
