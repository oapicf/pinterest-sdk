/*
 * AdsCreditRedeemRequest.h
 *
 * 
 */

#ifndef _AdsCreditRedeemRequest_H_
#define _AdsCreditRedeemRequest_H_


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

class AdsCreditRedeemRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsCreditRedeemRequest();
	AdsCreditRedeemRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsCreditRedeemRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Takes in a SHA256 hash of the offerCode.
	 */
	std::string getOfferCodeHash();

	/*! \brief Set Takes in a SHA256 hash of the offerCode.
	 */
	void setOfferCodeHash(std::string  offerCodeHash);
	/*! \brief Get If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
	 */
	bool getValidateOnly();

	/*! \brief Set If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
	 */
	void setValidateOnly(bool  validateOnly);

private:
	std::string offerCodeHash;
	bool validateOnly;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdsCreditRedeemRequest_H_ */
