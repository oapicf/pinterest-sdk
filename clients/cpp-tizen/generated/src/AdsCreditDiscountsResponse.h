/*
 * AdsCreditDiscountsResponse.h
 *
 * 
 */

#ifndef _AdsCreditDiscountsResponse_H_
#define _AdsCreditDiscountsResponse_H_


#include <string>
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

class AdsCreditDiscountsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsCreditDiscountsResponse();
	AdsCreditDiscountsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsCreditDiscountsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get True if the offer code is currently active.
	 */
	bool getActive();

	/*! \brief Set True if the offer code is currently active.
	 */
	void setActive(bool  active);
	/*! \brief Get Advertiser ID the offer was applied to.
	 */
	std::string getAdvertiserId();

	/*! \brief Set Advertiser ID the offer was applied to.
	 */
	void setAdvertiserId(std::string  advertiser_id);
	/*! \brief Get The type of discount of this credit
	 */
	std::string getDiscountType();

	/*! \brief Set The type of discount of this credit
	 */
	void setDiscountType(std::string  discountType);
	/*! \brief Get The discount applied in the offer’s currency value.
	 */
	long long getDiscountInMicroCurrency();

	/*! \brief Set The discount applied in the offer’s currency value.
	 */
	void setDiscountInMicroCurrency(long long  discountInMicroCurrency);
	/*! \brief Get Currency value for the discount.
	 */
	std::string getDiscountCurrency();

	/*! \brief Set Currency value for the discount.
	 */
	void setDiscountCurrency(std::string  discountCurrency);
	/*! \brief Get Human readable title of the offer code.
	 */
	std::string getTitle();

	/*! \brief Set Human readable title of the offer code.
	 */
	void setTitle(std::string  title);
	/*! \brief Get The credits left to spend.
	 */
	long long getRemainingDiscountInMicroCurrency();

	/*! \brief Set The credits left to spend.
	 */
	void setRemainingDiscountInMicroCurrency(long long  remainingDiscountInMicroCurrency);

private:
	bool active;
	std::string advertiser_id;
	std::string discountType;
	long long discountInMicroCurrency;
	std::string discountCurrency;
	std::string title;
	long long remainingDiscountInMicroCurrency;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdsCreditDiscountsResponse_H_ */
