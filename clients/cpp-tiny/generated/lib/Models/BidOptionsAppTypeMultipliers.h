
/*
 * BidOptionsAppTypeMultipliers.h
 *
 * This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef TINY_CPP_CLIENT_BidOptionsAppTypeMultipliers_H_
#define TINY_CPP_CLIENT_BidOptionsAppTypeMultipliers_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 *
 *  \ingroup Models
 *
 */

class BidOptionsAppTypeMultipliers{
public:

    /*! \brief Constructor.
	 */
    BidOptionsAppTypeMultipliers();
    BidOptionsAppTypeMultipliers(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BidOptionsAppTypeMultipliers();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	long getAndroidMobile();

	/*! \brief Set 
	 */
	void setAndroidMobile(long android_mobile);
	/*! \brief Get 
	 */
	long getAndroidTablet();

	/*! \brief Set 
	 */
	void setAndroidTablet(long android_tablet);
	/*! \brief Get 
	 */
	long getIpad();

	/*! \brief Set 
	 */
	void setIpad(long ipad);
	/*! \brief Get 
	 */
	long getIphone();

	/*! \brief Set 
	 */
	void setIphone(long iphone);
	/*! \brief Get 
	 */
	long getWeb();

	/*! \brief Set 
	 */
	void setWeb(long web);
	/*! \brief Get 
	 */
	long getWebMobile();

	/*! \brief Set 
	 */
	void setWebMobile(long web_mobile);


    private:
    long android_mobile{};
    long android_tablet{};
    long ipad{};
    long iphone{};
    long web{};
    long web_mobile{};
};
}

#endif /* TINY_CPP_CLIENT_BidOptionsAppTypeMultipliers_H_ */
