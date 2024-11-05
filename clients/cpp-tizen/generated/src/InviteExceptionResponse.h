/*
 * InviteExceptionResponse.h
 *
 * An exception object if there is an error performing the action. Will only be provided if there is an error.
 */

#ifndef _InviteExceptionResponse_H_
#define _InviteExceptionResponse_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An exception object if there is an error performing the action. Will only be provided if there is an error.
 *
 *  \ingroup Models
 *
 */

class InviteExceptionResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	InviteExceptionResponse();
	InviteExceptionResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InviteExceptionResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of the invite/request.
	 */
	std::string getInviteOrRequestId();

	/*! \brief Set Unique identifier of the invite/request.
	 */
	void setInviteOrRequestId(std::string  invite_or_request_id);
	/*! \brief Get Error code associated with the error in performing the action on the invite/request.
	 */
	int getCode();

	/*! \brief Set Error code associated with the error in performing the action on the invite/request.
	 */
	void setCode(int  code);
	/*! \brief Get Error message associated with the error in performing the action on the invite/request.
	 */
	std::string getMessage();

	/*! \brief Set Error message associated with the error in performing the action on the invite/request.
	 */
	void setMessage(std::string  message);
	/*! \brief Get A list of users' usernames or emails OR a list of partner ids that caused the error.
	 */
	std::list<std::string> getUsersOrPartnerIds();

	/*! \brief Set A list of users' usernames or emails OR a list of partner ids that caused the error.
	 */
	void setUsersOrPartnerIds(std::list <std::string> users_or_partner_ids);

private:
	std::string invite_or_request_id;
	int code;
	std::string message;
	std::list <std::string>users_or_partner_ids;
	void __init();
	void __cleanup();

};
}
}

#endif /* _InviteExceptionResponse_H_ */
