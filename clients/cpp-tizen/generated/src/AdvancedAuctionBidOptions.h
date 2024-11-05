/*
 * AdvancedAuctionBidOptions.h
 *
 * Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).
 */

#ifndef _AdvancedAuctionBidOptions_H_
#define _AdvancedAuctionBidOptions_H_


#include <string>
#include "AppTypeMultipliers.h"
#include "PlacementMultipliers.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing a retail catalog item's bid options (bid price and bid multipliers).
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionBidOptions : public Object {
public:
	/*! \brief Constructor.
	 */
	AdvancedAuctionBidOptions();
	AdvancedAuctionBidOptions(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdvancedAuctionBidOptions();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
	 */
	long long getBidInMicroCurrency();

	/*! \brief Set Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
	 */
	void setBidInMicroCurrency(long long  bid_in_micro_currency);
	/*! \brief Get 
	 */
	AppTypeMultipliers getAppTypeMultipliers();

	/*! \brief Set 
	 */
	void setAppTypeMultipliers(AppTypeMultipliers  app_type_multipliers);
	/*! \brief Get 
	 */
	PlacementMultipliers getPlacementMultipliers();

	/*! \brief Set 
	 */
	void setPlacementMultipliers(PlacementMultipliers  placement_multipliers);

private:
	long long bid_in_micro_currency;
	AppTypeMultipliers app_type_multipliers;
	PlacementMultipliers placement_multipliers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdvancedAuctionBidOptions_H_ */
