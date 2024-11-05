/*
 * AdAccountCreateSubscriptionRequest_partner_metadata.h
 *
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 */

#ifndef _AdAccountCreateSubscriptionRequest_partner_metadata_H_
#define _AdAccountCreateSubscriptionRequest_partner_metadata_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 *
 *  \ingroup Models
 *
 */

class AdAccountCreateSubscriptionRequest_partner_metadata : public Object {
public:
	/*! \brief Constructor.
	 */
	AdAccountCreateSubscriptionRequest_partner_metadata();
	AdAccountCreateSubscriptionRequest_partner_metadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdAccountCreateSubscriptionRequest_partner_metadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Text field value that uniquely identifies a subscriber.
	 */
	std::string getSubscriberKey();

	/*! \brief Set Text field value that uniquely identifies a subscriber.
	 */
	void setSubscriberKey(std::string  subscriber_key);

private:
	std::string subscriber_key;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdAccountCreateSubscriptionRequest_partner_metadata_H_ */
