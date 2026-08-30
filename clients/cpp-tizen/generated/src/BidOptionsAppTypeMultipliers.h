/*
 * BidOptionsAppTypeMultipliers.h
 *
 * This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

#ifndef _BidOptionsAppTypeMultipliers_H_
#define _BidOptionsAppTypeMultipliers_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 *
 *  \ingroup Models
 *
 */

class BidOptionsAppTypeMultipliers : public Object {
public:
	/*! \brief Constructor.
	 */
	BidOptionsAppTypeMultipliers();
	BidOptionsAppTypeMultipliers(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BidOptionsAppTypeMultipliers();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	long long getAndroidMobile();

	/*! \brief Set 
	 */
	void setAndroidMobile(long long  android_mobile);
	/*! \brief Get 
	 */
	long long getAndroidTablet();

	/*! \brief Set 
	 */
	void setAndroidTablet(long long  android_tablet);
	/*! \brief Get 
	 */
	long long getIpad();

	/*! \brief Set 
	 */
	void setIpad(long long  ipad);
	/*! \brief Get 
	 */
	long long getIphone();

	/*! \brief Set 
	 */
	void setIphone(long long  iphone);
	/*! \brief Get 
	 */
	long long getWeb();

	/*! \brief Set 
	 */
	void setWeb(long long  web);
	/*! \brief Get 
	 */
	long long getWebMobile();

	/*! \brief Set 
	 */
	void setWebMobile(long long  web_mobile);

private:
	long long android_mobile;
	long long android_tablet;
	long long ipad;
	long long iphone;
	long long web;
	long long web_mobile;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BidOptionsAppTypeMultipliers_H_ */
