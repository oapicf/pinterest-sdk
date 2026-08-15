
/*
 * AdsCreditDiscountsResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AdsCreditDiscountsResponse_H_
#define TINY_CPP_CLIENT_AdsCreditDiscountsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AdsCreditDiscountsResponse{
public:

    /*! \brief Constructor.
	 */
    AdsCreditDiscountsResponse();
    AdsCreditDiscountsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdsCreditDiscountsResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get True if the offer code is currently active.
	 */
	bool isActive();

	/*! \brief Set True if the offer code is currently active.
	 */
	void setActive(bool  active);
	/*! \brief Get Advertiser ID the offer was applied to.
	 */
	std::string getAdvertiserId();

	/*! \brief Set Advertiser ID the offer was applied to.
	 */
	void setAdvertiserId(std::string  advertiser_id);
	/*! \brief Get Currency value for the discount.
	 */
	std::string getDiscountCurrency();

	/*! \brief Set Currency value for the discount.
	 */
	void setDiscountCurrency(std::string  discountCurrency);
	/*! \brief Get The discount applied in the offer’s currency value.
	 */
	long getDiscountInMicroCurrency();

	/*! \brief Set The discount applied in the offer’s currency value.
	 */
	void setDiscountInMicroCurrency(long  discountInMicroCurrency);
	/*! \brief Get The type of discount of this credit
	 */
	std::string getDiscountType();

	/*! \brief Set The type of discount of this credit
	 */
	void setDiscountType(std::string  discountType);
	/*! \brief Get The credits left to spend.
	 */
	long getRemainingDiscountInMicroCurrency();

	/*! \brief Set The credits left to spend.
	 */
	void setRemainingDiscountInMicroCurrency(long  remainingDiscountInMicroCurrency);
	/*! \brief Get Human readable title of the offer code.
	 */
	std::string getTitle();

	/*! \brief Set Human readable title of the offer code.
	 */
	void setTitle(std::string  title);


    private:
    bool active{};
    std::string advertiser_id{};
    std::string discountCurrency{};
    long discountInMicroCurrency{};
    std::string discountType{};
    long remainingDiscountInMicroCurrency{};
    std::string title{};
};
}

#endif /* TINY_CPP_CLIENT_AdsCreditDiscountsResponse_H_ */
