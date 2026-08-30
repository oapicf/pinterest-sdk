/*
 * AdsCreditRedeem.h
 *
 * Ads credit redemption
 */

#ifndef _AdsCreditRedeem_H_
#define _AdsCreditRedeem_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Ads credit redemption
 *
 *  \ingroup Models
 *
 */

class AdsCreditRedeem : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsCreditRedeem();
	AdsCreditRedeem(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsCreditRedeem();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Error code type if error occurs
	 */
	int getErrorCode();

	/*! \brief Set Error code type if error occurs
	 */
	void setErrorCode(int  errorCode);
	/*! \brief Get Reason for failure
	 */
	std::string getErrorMessage();

	/*! \brief Set Reason for failure
	 */
	void setErrorMessage(std::string  errorMessage);
	/*! \brief Get Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
	 */
	bool getSuccess();

	/*! \brief Set Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
	 */
	void setSuccess(bool  success);

private:
	int errorCode;
	std::string errorMessage;
	bool success;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdsCreditRedeem_H_ */
