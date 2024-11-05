/*
 * CreateMembershipOrPartnershipInvitesBody.h
 *
 * Body to be used on path to send Members or Partners Invite or Request
 */

#ifndef _CreateMembershipOrPartnershipInvitesBody_H_
#define _CreateMembershipOrPartnershipInvitesBody_H_


#include <string>
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

	/*! \brief Get The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
	 */
	std::string getBusinessRole();

	/*! \brief Set The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
	 */
	void setBusinessRole(std::string  business_role);
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
	std::string business_role;
	InviteType invite_type;
	std::list <std::string>members;
	std::list <std::string>partners;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateMembershipOrPartnershipInvitesBody_H_ */
