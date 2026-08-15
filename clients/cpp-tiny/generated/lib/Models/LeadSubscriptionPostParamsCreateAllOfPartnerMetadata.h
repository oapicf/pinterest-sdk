
/*
 * LeadSubscriptionPostParamsCreate_allOf_partner_metadata.h
 *
 * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 */

#ifndef TINY_CPP_CLIENT_LeadSubscriptionPostParamsCreate_allOf_partner_metadata_H_
#define TINY_CPP_CLIENT_LeadSubscriptionPostParamsCreate_allOf_partner_metadata_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
 *
 *  \ingroup Models
 *
 */

class LeadSubscriptionPostParamsCreate_allOf_partner_metadata{
public:

    /*! \brief Constructor.
	 */
    LeadSubscriptionPostParamsCreate_allOf_partner_metadata();
    LeadSubscriptionPostParamsCreate_allOf_partner_metadata(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadSubscriptionPostParamsCreate_allOf_partner_metadata();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Text field value that uniquely identifies a subscriber.
	 */
	std::string getSubscriberKey();

	/*! \brief Set Text field value that uniquely identifies a subscriber.
	 */
	void setSubscriberKey(std::string  subscriber_key);


    private:
    std::string subscriber_key{};
};
}

#endif /* TINY_CPP_CLIENT_LeadSubscriptionPostParamsCreate_allOf_partner_metadata_H_ */
