/*
 * CancelInviteResultUser.h
 *
 * Metadata of the member/partner that has access to the asset.
 */

#ifndef _CancelInviteResultUser_H_
#define _CancelInviteResultUser_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Metadata of the member/partner that has access to the asset.
 *
 *  \ingroup Models
 *
 */

class CancelInviteResultUser : public Object {
public:
	/*! \brief Constructor.
	 */
	CancelInviteResultUser();
	CancelInviteResultUser(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CancelInviteResultUser();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Email of the business member/partner.
	 */
	std::string getEmail();

	/*! \brief Set Email of the business member/partner.
	 */
	void setEmail(std::string  email);
	/*! \brief Get Unique identifier of the business member/partner.
	 */
	std::string getId();

	/*! \brief Set Unique identifier of the business member/partner.
	 */
	void setId(std::string  id);
	/*! \brief Get Username of the business member/partner.
	 */
	std::string getUsername();

	/*! \brief Set Username of the business member/partner.
	 */
	void setUsername(std::string  username);

private:
	std::string email;
	std::string id;
	std::string username;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CancelInviteResultUser_H_ */
