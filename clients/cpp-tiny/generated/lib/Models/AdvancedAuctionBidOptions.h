
/*
 * AdvancedAuctionBidOptions.h
 *
 * Object describing a retail catalog item&#39;s bid options (bid price and bid multipliers).
 */

#ifndef TINY_CPP_CLIENT_AdvancedAuctionBidOptions_H_
#define TINY_CPP_CLIENT_AdvancedAuctionBidOptions_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AppTypeMultipliers.h"
#include "PlacementMultipliers.h"

namespace Tiny {


/*! \brief Object describing a retail catalog item's bid options (bid price and bid multipliers).
 *
 *  \ingroup Models
 *
 */

class AdvancedAuctionBidOptions{
public:

    /*! \brief Constructor.
	 */
    AdvancedAuctionBidOptions();
    AdvancedAuctionBidOptions(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdvancedAuctionBidOptions();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AppTypeMultipliers&lt;std::string, double&gt; getAppTypeMultipliers();

	/*! \brief Set 
	 */
	void setAppTypeMultipliers(AppTypeMultipliers&lt;std::string, double&gt; app_type_multipliers);
	/*! \brief Get Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
	 */
	long getBidInMicroCurrency();

	/*! \brief Set Bid price in micro currency. A value of 0 will stop distribution for this item in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. A value of `null` will fallback to the ad group's `bid_in_micro_currency`.
	 */
	void setBidInMicroCurrency(long bid_in_micro_currency);
	/*! \brief Get 
	 */
	PlacementMultipliers&lt;std::string, double&gt; getPlacementMultipliers();

	/*! \brief Set 
	 */
	void setPlacementMultipliers(PlacementMultipliers&lt;std::string, double&gt; placement_multipliers);


    private:
    AppTypeMultipliers&lt;std::string, double&gt; app_type_multipliers;
    long bid_in_micro_currency{};
    PlacementMultipliers&lt;std::string, double&gt; placement_multipliers;
};
}

#endif /* TINY_CPP_CLIENT_AdvancedAuctionBidOptions_H_ */
