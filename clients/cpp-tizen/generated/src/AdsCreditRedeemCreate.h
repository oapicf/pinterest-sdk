/*
 * AdsCreditRedeemCreate.h
 *
 * Resource create operation model.
 */

#ifndef _AdsCreditRedeemCreate_H_
#define _AdsCreditRedeemCreate_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class AdsCreditRedeemCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsCreditRedeemCreate();
	AdsCreditRedeemCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsCreditRedeemCreate();

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

#endif /* _AdsCreditRedeemCreate_H_ */
