/*
 * BillingProfilesResponse.h
 *
 * 
 */

#ifndef _BillingProfilesResponse_H_
#define _BillingProfilesResponse_H_


#include <string>
#include "BillingProfileCardType.h"
#include "BillingProfilePaymentMethodBrand.h"
#include "BillingProfileStatus.h"
#include "BillingType.h"
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

	/*! \brief Get Advertiser ID of the billing.
	 */
	std::string getAdvertiserId();

	/*! \brief Set Advertiser ID of the billing.
	 */
	void setAdvertiserId(std::string  advertiser_id);
	/*! \brief Get Billing type of the advertiser
	 */
	BillingType getBillingType();

	/*! \brief Set Billing type of the advertiser
	 */
	void setBillingType(BillingType  billing_type);
	/*! \brief Get Type of the card.
	 */
	BillingProfileCardType getCardType();

	/*! \brief Set Type of the card.
	 */
	void setCardType(BillingProfileCardType  card_type);
	/*! \brief Get Billing ID.
	 */
	std::string getId();

	/*! \brief Set Billing ID.
	 */
	void setId(std::string  id);
	/*! \brief Get Brand of the payment method.
	 */
	BillingProfilePaymentMethodBrand getPaymentMethodBrand();

	/*! \brief Set Brand of the payment method.
	 */
	void setPaymentMethodBrand(BillingProfilePaymentMethodBrand  payment_method_brand);
	/*! \brief Get Status of the billing.
	 */
	BillingProfileStatus getStatus();

	/*! \brief Set Status of the billing.
	 */
	void setStatus(BillingProfileStatus  status);

private:
	std::string advertiser_id;
	BillingType billing_type;
	BillingProfileCardType card_type;
	std::string id;
	BillingProfilePaymentMethodBrand payment_method_brand;
	BillingProfileStatus status;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BillingProfilesResponse_H_ */
