/*
 * AuthRespondInvitesBody_invites_inner.h
 *
 * 
 */

#ifndef _AuthRespondInvitesBody_invites_inner_H_
#define _AuthRespondInvitesBody_invites_inner_H_


#include <string>
#include "AuthRespondInvitesBody_invites_inner_action.h"
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

class AuthRespondInvitesBody_invites_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	AuthRespondInvitesBody_invites_inner();
	AuthRespondInvitesBody_invites_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuthRespondInvitesBody_invites_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	AuthRespondInvitesBody_invites_inner_action getAction();

	/*! \brief Set 
	 */
	void setAction(AuthRespondInvitesBody_invites_inner_action  action);
	/*! \brief Get Unique identifier of an invite.
	 */
	std::string getInviteId();

	/*! \brief Set Unique identifier of an invite.
	 */
	void setInviteId(std::string  invite_id);

private:
	AuthRespondInvitesBody_invites_inner_action action;
	std::string invite_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuthRespondInvitesBody_invites_inner_H_ */
