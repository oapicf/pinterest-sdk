
/*
 * AuthRespondInvitesBodyItem.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_AuthRespondInvitesBodyItem_H_
#define TINY_CPP_CLIENT_AuthRespondInvitesBodyItem_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AuthRespondInviteAction.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class AuthRespondInvitesBodyItem{
public:

    /*! \brief Constructor.
	 */
    AuthRespondInvitesBodyItem();
    AuthRespondInvitesBodyItem(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuthRespondInvitesBodyItem();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AuthRespondInviteAction getAction();

	/*! \brief Set 
	 */
	void setAction(AuthRespondInviteAction action);
	/*! \brief Get Unique identifier of an invite.
	 */
	std::string getInviteId();

	/*! \brief Set Unique identifier of an invite.
	 */
	void setInviteId(std::string invite_id);


    private:
    AuthRespondInviteAction action;
    std::string invite_id{};
};
}

#endif /* TINY_CPP_CLIENT_AuthRespondInvitesBodyItem_H_ */
