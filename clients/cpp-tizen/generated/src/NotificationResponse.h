/*
 * NotificationResponse.h
 *
 * 
 */

#ifndef _NotificationResponse_H_
#define _NotificationResponse_H_


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

class NotificationResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	NotificationResponse();
	NotificationResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NotificationResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get error message when success is false
	 */
	std::string getErrorMsg();

	/*! \brief Set error message when success is false
	 */
	void setErrorMsg(std::string  error_msg);
	/*! \brief Get Received time. Unix timestamp in seconds.
	 */
	int getReceivedAt();

	/*! \brief Set Received time. Unix timestamp in seconds.
	 */
	void setReceivedAt(int  received_at);
	/*! \brief Get Returns true if the notification accepted.
	 */
	bool getSuccess();

	/*! \brief Set Returns true if the notification accepted.
	 */
	void setSuccess(bool  success);

private:
	std::string error_msg;
	int received_at;
	bool success;
	void __init();
	void __cleanup();

};
}
}

#endif /* _NotificationResponse_H_ */
