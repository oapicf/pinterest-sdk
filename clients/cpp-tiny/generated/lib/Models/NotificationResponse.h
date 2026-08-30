
/*
 * NotificationResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_NotificationResponse_H_
#define TINY_CPP_CLIENT_NotificationResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class NotificationResponse{
public:

    /*! \brief Constructor.
	 */
    NotificationResponse();
    NotificationResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~NotificationResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get error message when success is false
	 */
	std::string getErrorMsg();

	/*! \brief Set error message when success is false
	 */
	void setErrorMsg(std::string error_msg);
	/*! \brief Get Received time. Unix timestamp in seconds.
	 */
	int getReceivedAt();

	/*! \brief Set Received time. Unix timestamp in seconds.
	 */
	void setReceivedAt(int received_at);
	/*! \brief Get Returns true if the notification accepted.
	 */
	bool isSuccess();

	/*! \brief Set Returns true if the notification accepted.
	 */
	void setSuccess(bool success);


    private:
    std::string error_msg{};
    int received_at{};
    bool success{};
};
}

#endif /* TINY_CPP_CLIENT_NotificationResponse_H_ */
