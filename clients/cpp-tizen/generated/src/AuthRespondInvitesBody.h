/*
 * AuthRespondInvitesBody.h
 *
 * An object with a list of all the invites the user would like to respond to and the action to take.
 */

#ifndef _AuthRespondInvitesBody_H_
#define _AuthRespondInvitesBody_H_


#include <string>
#include "AuthRespondInvitesBody_invites_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object with a list of all the invites the user would like to respond to and the action to take.
 *
 *  \ingroup Models
 *
 */

class AuthRespondInvitesBody : public Object {
public:
	/*! \brief Constructor.
	 */
	AuthRespondInvitesBody();
	AuthRespondInvitesBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuthRespondInvitesBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<AuthRespondInvitesBody_invites_inner> getInvites();

	/*! \brief Set 
	 */
	void setInvites(std::list <AuthRespondInvitesBody_invites_inner> invites);

private:
	std::list <AuthRespondInvitesBody_invites_inner>invites;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuthRespondInvitesBody_H_ */
