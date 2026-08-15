
/*
 * AuthRespondInvitesBody_invites_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AuthRespondInvitesBody_invites_inner_H_
#define TINY_CPP_CLIENT_AuthRespondInvitesBody_invites_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AuthRespondInvitesBody_invites_inner_action.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AuthRespondInvitesBody_invites_inner{
public:

    /*! \brief Constructor.
	 */
    AuthRespondInvitesBody_invites_inner();
    AuthRespondInvitesBody_invites_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuthRespondInvitesBody_invites_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string invite_id{};
};
}

#endif /* TINY_CPP_CLIENT_AuthRespondInvitesBody_invites_inner_H_ */
