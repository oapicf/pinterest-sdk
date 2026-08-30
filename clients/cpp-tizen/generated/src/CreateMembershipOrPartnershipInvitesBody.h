/*
 * CreateMembershipOrPartnershipInvitesBody.h
 *
 * Body to be used on path to send Members or Partners Invite or Request
 */

#ifndef _CreateMembershipOrPartnershipInvitesBody_H_
#define _CreateMembershipOrPartnershipInvitesBody_H_


#include <string>
#include "BusinessRoleForInvite.h"
#include "InviteType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Body to be used on path to send Members or Partners Invite or Request
 *
 *  \ingroup Models
 *
 */

class CreateMembershipOrPartnershipInvitesBody : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateMembershipOrPartnershipInvitesBody();
	CreateMembershipOrPartnershipInvitesBody(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateMembershipOrPartnershipInvitesBody();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	BusinessRoleForInvite getBusinessRole();

	/*! \brief Set 
	 */
	void setBusinessRole(BusinessRoleForInvite  business_role);
	/*! \brief Get 
	 */
	InviteType getInviteType();

	/*! \brief Set 
	 */
	void setInviteType(InviteType  invite_type);
	/*! \brief Get A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
	 */
	std::list<std::string> getMembers();

	/*! \brief Set A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
	 */
	void setMembers(std::list <std::string> members);
	/*! \brief Get A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
	 */
	std::list<std::string> getPartners();

	/*! \brief Set A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
	 */
	void setPartners(std::list <std::string> partners);

private:
	BusinessRoleForInvite business_role;
	InviteType invite_type;
	std::list <std::string>members;
	std::list <std::string>partners;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateMembershipOrPartnershipInvitesBody_H_ */
