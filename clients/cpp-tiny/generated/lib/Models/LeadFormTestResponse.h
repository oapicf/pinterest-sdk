
/*
 * LeadFormTestResponse.h
 *
 * Response for lead data test API.
 */

#ifndef TINY_CPP_CLIENT_LeadFormTestResponse_H_
#define TINY_CPP_CLIENT_LeadFormTestResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Response for lead data test API.
 *
 *  \ingroup Models
 *
 */

class LeadFormTestResponse{
public:

    /*! \brief Constructor.
	 */
    LeadFormTestResponse();
    LeadFormTestResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~LeadFormTestResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Subscription ID.
	 */
	std::string getSubscriptionId();

	/*! \brief Set Subscription ID.
	 */
	void setSubscriptionId(std::string  subscription_id);


    private:
    std::string subscription_id{};
};
}

#endif /* TINY_CPP_CLIENT_LeadFormTestResponse_H_ */
