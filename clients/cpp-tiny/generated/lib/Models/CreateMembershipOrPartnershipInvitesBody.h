
/*
 * CreateMembershipOrPartnershipInvitesBody.h
 *
 * Body to be used on path to send Members or Partners Invite or Request
 */

#ifndef TINY_CPP_CLIENT_CreateMembershipOrPartnershipInvitesBody_H_
#define TINY_CPP_CLIENT_CreateMembershipOrPartnershipInvitesBody_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BusinessRoleForInvite.h"
#include "InviteType.h"
#include <list>

namespace Tiny {


/*! \brief Body to be used on path to send Members or Partners Invite or Request
 *
 *  \ingroup Models
 *
 */

class CreateMembershipOrPartnershipInvitesBody{
public:

    /*! \brief Constructor.
	 */
    CreateMembershipOrPartnershipInvitesBody();
    CreateMembershipOrPartnershipInvitesBody(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateMembershipOrPartnershipInvitesBody();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	BusinessRoleForInvite getBusinessRole();

	/*! \brief Set 
	 */
	void setBusinessRole(BusinessRoleForInvite business_role);
	/*! \brief Get 
	 */
	InviteType getInviteType();

	/*! \brief Set 
	 */
	void setInviteType(InviteType invite_type);
	/*! \brief Get A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
	 */
	std::list<std::string> getMembers();

	/*! \brief Set A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
	 */
	void setMembers(std::list<std::string> members);
	/*! \brief Get A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
	 */
	std::list<std::string> getPartners();

	/*! \brief Set A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
	 */
	void setPartners(std::list<std::string> partners);


    private:
    BusinessRoleForInvite business_role;
    InviteType invite_type;
    std::list<std::string> members;
    std::list<std::string> partners;
};
}

#endif /* TINY_CPP_CLIENT_CreateMembershipOrPartnershipInvitesBody_H_ */
