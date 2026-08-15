
/*
 * AuthRespondInvitesBody.h
 *
 * An object with a list of all the invites the user would like to respond to and the action to take.
 */

#ifndef TINY_CPP_CLIENT_AuthRespondInvitesBody_H_
#define TINY_CPP_CLIENT_AuthRespondInvitesBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AuthRespondInvitesBody_invites_inner.h"
#include <list>

namespace Tiny {


/*! \brief An object with a list of all the invites the user would like to respond to and the action to take.
 *
 *  \ingroup Models
 *
 */

class AuthRespondInvitesBody{
public:

    /*! \brief Constructor.
	 */
    AuthRespondInvitesBody();
    AuthRespondInvitesBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuthRespondInvitesBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::list<AuthRespondInvitesBody_invites_inner> getInvites();

	/*! \brief Set 
	 */
	void setInvites(std::list <AuthRespondInvitesBody_invites_inner> invites);


    private:
    std::list<AuthRespondInvitesBody_invites_inner> invites;
};
}

#endif /* TINY_CPP_CLIENT_AuthRespondInvitesBody_H_ */
