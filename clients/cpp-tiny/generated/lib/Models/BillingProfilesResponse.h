
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
	void setAdvertiserId(std::string  advertiser_id);
	/*! \brief Get Billing type of the advertiser
	 */
	std::string getBillingType();

	/*! \brief Set Billing type of the advertiser
	 */
	void setBillingType(std::string  billing_type);
	/*! \brief Get Type of the card.
	 */
	std::string getCardType();

	/*! \brief Set Type of the card.
	 */
	void setCardType(std::string  card_type);
	/*! \brief Get Billing ID.
	 */
	std::string getId();

	/*! \brief Set Billing ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Brand of the payment method.
	 */
	std::string getPaymentMethodBrand();

	/*! \brief Set Brand of the payment method.
	 */
	void setPaymentMethodBrand(std::string  payment_method_brand);
	/*! \brief Get Status of the billing.
	 */
	std::string getStatus();

	/*! \brief Set Status of the billing.
	 */
	void setStatus(std::string  status);


    private:
    std::string advertiser_id{};
    std::string billing_type{};
    std::string card_type{};
    std::string id{};
    std::string payment_method_brand{};
    std::string status{};
};
}

#endif /* TINY_CPP_CLIENT_BillingProfilesResponse_H_ */
