/*
 * CancelInviteResult.h
 *
 * 
 */

#ifndef _CancelInviteResult_H_
#define _CancelInviteResult_H_


#include <string>
#include "CancelInviteResultUser.h"
#include "InviteDataResponse.h"
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

class CancelInviteResult : public Object {
public:
	/*! \brief Constructor.
	 */
	CancelInviteResult();
	CancelInviteResult(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CancelInviteResult();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	InviteDataResponse getInviteData();

	/*! \brief Set 
	 */
	void setInviteData(InviteDataResponse  invite_data);
	/*! \brief Get 
	 */
	bool getIsReceivedInvite();

	/*! \brief Set 
	 */
	void setIsReceivedInvite(bool  is_received_invite);
	/*! \brief Get 
	 */
	CancelInviteResultUser getUser();

	/*! \brief Set 
	 */
	void setUser(CancelInviteResultUser  user);

private:
	std::string id;
	InviteDataResponse invite_data;
	bool is_received_invite;
	CancelInviteResultUser user;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CancelInviteResult_H_ */
