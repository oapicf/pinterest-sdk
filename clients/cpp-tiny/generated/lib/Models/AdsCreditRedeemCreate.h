
/*
 * AdsCreditRedeemCreate.h
 *
 * Resource create operation model.
 */

#ifndef TINY_CPP_CLIENT_AdsCreditRedeemCreate_H_
#define TINY_CPP_CLIENT_AdsCreditRedeemCreate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Resource create operation model.
 *
 *  \ingroup Models
 *
 */

class AdsCreditRedeemCreate{
public:

    /*! \brief Constructor.
	 */
    AdsCreditRedeemCreate();
    AdsCreditRedeemCreate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdsCreditRedeemCreate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Takes in a SHA256 hash of the offerCode.
	 */
	std::string getOfferCodeHash();

	/*! \brief Set Takes in a SHA256 hash of the offerCode.
	 */
	void setOfferCodeHash(std::string offerCodeHash);
	/*! \brief Get If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
	 */
	bool isValidateOnly();

	/*! \brief Set If true, only validate if we can redeem offer code. Otherwise it will actually apply the offer code to the account
	 */
	void setValidateOnly(bool validateOnly);


    private:
    std::string offerCodeHash{};
    bool validateOnly{};
};
}

#endif /* TINY_CPP_CLIENT_AdsCreditRedeemCreate_H_ */
