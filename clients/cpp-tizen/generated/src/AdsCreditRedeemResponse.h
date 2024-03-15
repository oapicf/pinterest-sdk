/*
 * AdsCreditRedeemResponse.h
 *
 * 
 */

#ifndef _AdsCreditRedeemResponse_H_
#define _AdsCreditRedeemResponse_H_


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

class AdsCreditRedeemResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsCreditRedeemResponse();
	AdsCreditRedeemResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsCreditRedeemResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
	 */
	bool getSuccess();

	/*! \brief Set Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
	 */
	void setSuccess(bool  success);
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

private:
	bool success;
	int errorCode;
	std::string errorMessage;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AdsCreditRedeemResponse_H_ */
