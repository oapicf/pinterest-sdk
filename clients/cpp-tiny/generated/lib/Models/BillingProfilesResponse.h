
/*
 * BillingProfilesResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_BillingProfilesResponse_H_
#define TINY_CPP_CLIENT_BillingProfilesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BillingProfileCardType.h"
#include "BillingProfilePaymentMethodBrand.h"
#include "BillingProfileStatus.h"
#include "BillingType.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class BillingProfilesResponse{
public:

    /*! \brief Constructor.
	 */
    BillingProfilesResponse();
    BillingProfilesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~BillingProfilesResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Advertiser ID of the billing.
	 */
	std::string getAdvertiserId();

	/*! \brief Set Advertiser ID of the billing.
	 */
	void setAdvertiserId(std::string advertiser_id);
	/*! \brief Get Billing type of the advertiser
	 */
	BillingType getBillingType();

	/*! \brief Set Billing type of the advertiser
	 */
	void setBillingType(BillingType billing_type);
	/*! \brief Get Type of the card.
	 */
	BillingProfileCardType getCardType();

	/*! \brief Set Type of the card.
	 */
	void setCardType(BillingProfileCardType card_type);
	/*! \brief Get Billing ID.
	 */
	std::string getId();

	/*! \brief Set Billing ID.
	 */
	void setId(std::string id);
	/*! \brief Get Brand of the payment method.
	 */
	BillingProfilePaymentMethodBrand getPaymentMethodBrand();

	/*! \brief Set Brand of the payment method.
	 */
	void setPaymentMethodBrand(BillingProfilePaymentMethodBrand payment_method_brand);
	/*! \brief Get Status of the billing.
	 */
	BillingProfileStatus getStatus();

	/*! \brief Set Status of the billing.
	 */
	void setStatus(BillingProfileStatus status);


    private:
    std::string advertiser_id{};
    BillingType billing_type;
    BillingProfileCardType card_type;
    std::string id{};
    BillingProfilePaymentMethodBrand payment_method_brand;
    BillingProfileStatus status;
};
}

#endif /* TINY_CPP_CLIENT_BillingProfilesResponse_H_ */
