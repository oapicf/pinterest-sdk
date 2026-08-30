
/*
 * InviteExceptionResponse.h
 *
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 */

#ifndef TINY_CPP_CLIENT_InviteExceptionResponse_H_
#define TINY_CPP_CLIENT_InviteExceptionResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief An exception object if there is an error performing the action. Will only be provided if there is an error.
 *
 *  \ingroup Models
 *
 */

class InviteExceptionResponse{
public:

    /*! \brief Constructor.
	 */
    InviteExceptionResponse();
    InviteExceptionResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InviteExceptionResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Error code associated with the error in performing the action on the invite/request.
	 */
	int getCode();

	/*! \brief Set Error code associated with the error in performing the action on the invite/request.
	 */
	void setCode(int code);
	/*! \brief Get Unique identifier of the invite/request.
	 */
	std::string getInviteOrRequestId();

	/*! \brief Set Unique identifier of the invite/request.
	 */
	void setInviteOrRequestId(std::string invite_or_request_id);
	/*! \brief Get Error message associated with the error in performing the action on the invite/request.
	 */
	std::string getMessage();

	/*! \brief Set Error message associated with the error in performing the action on the invite/request.
	 */
	void setMessage(std::string message);
	/*! \brief Get A list of users' usernames or emails OR a list of partner ids that caused the error.
	 */
	std::list<std::string> getUsersOrPartnerIds();

	/*! \brief Set A list of users' usernames or emails OR a list of partner ids that caused the error.
	 */
	void setUsersOrPartnerIds(std::list<std::string> users_or_partner_ids);


    private:
    int code{};
    std::string invite_or_request_id{};
    std::string message{};
    std::list<std::string> users_or_partner_ids;
};
}

#endif /* TINY_CPP_CLIENT_InviteExceptionResponse_H_ */
