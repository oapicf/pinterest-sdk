/*
 * LeadFormTestResponse.h
 *
 * Response for lead data test API.
 */

#ifndef _LeadFormTestResponse_H_
#define _LeadFormTestResponse_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Response for lead data test API.
 *
 *  \ingroup Models
 *
 */

class LeadFormTestResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	LeadFormTestResponse();
	LeadFormTestResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~LeadFormTestResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Subscription ID.
	 */
	std::string getSubscriptionId();

	/*! \brief Set Subscription ID.
	 */
	void setSubscriptionId(std::string  subscription_id);

private:
	std::string subscription_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _LeadFormTestResponse_H_ */
