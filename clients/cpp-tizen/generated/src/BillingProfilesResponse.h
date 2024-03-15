/*
 * BillingProfilesResponse.h
 *
 * 
 */

#ifndef _BillingProfilesResponse_H_
#define _BillingProfilesResponse_H_


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

class BillingProfilesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	BillingProfilesResponse();
	BillingProfilesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BillingProfilesResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Billing ID.
	 */
	std::string getId();

	/*! \brief Set Billing ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Type of the card.
	 */
	std::string getCardType();

	/*! \brief Set Type of the card.
	 */
	void setCardType(std::string  card_type);
	/*! \brief Get Status of the billing.
	 */
	std::string getStatus();

	/*! \brief Set Status of the billing.
	 */
	void setStatus(std::string  status);
	/*! \brief Get Advertiser ID of the billing.
	 */
	std::string getAdvertiserId();

	/*! \brief Set Advertiser ID of the billing.
	 */
	void setAdvertiserId(std::string  advertiser_id);
	/*! \brief Get Brand of the payment method.
	 */
	std::string getPaymentMethodBrand();

	/*! \brief Set Brand of the payment method.
	 */
	void setPaymentMethodBrand(std::string  payment_method_brand);

private:
	std::string id;
	std::string card_type;
	std::string status;
	std::string advertiser_id;
	std::string payment_method_brand;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BillingProfilesResponse_H_ */
