
/*
 * AdsCreditRedeem.h
 *
 * Ads credit redemption
 */

#ifndef TINY_CPP_CLIENT_AdsCreditRedeem_H_
#define TINY_CPP_CLIENT_AdsCreditRedeem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Ads credit redemption
 *
 *  \ingroup Models
 *
 */

class AdsCreditRedeem{
public:

    /*! \brief Constructor.
	 */
    AdsCreditRedeem();
    AdsCreditRedeem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AdsCreditRedeem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Error code type if error occurs
	 */
	int getErrorCode();

	/*! \brief Set Error code type if error occurs
	 */
	void setErrorCode(int errorCode);
	/*! \brief Get Reason for failure
	 */
	std::string getErrorMessage();

	/*! \brief Set Reason for failure
	 */
	void setErrorMessage(std::string errorMessage);
	/*! \brief Get Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
	 */
	bool isSuccess();

	/*! \brief Set Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
	 */
	void setSuccess(bool success);


    private:
    int errorCode{};
    std::string errorMessage{};
    bool success{};
};
}

#endif /* TINY_CPP_CLIENT_AdsCreditRedeem_H_ */
