/*
 * DeleteBusinessMembershipMember.h
 *
 * Single instance of a business member to be removed from the business.
 */

#ifndef _DeleteBusinessMembershipMember_H_
#define _DeleteBusinessMembershipMember_H_


#include <string>
#include "BusinessRoleForMembers.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Single instance of a business member to be removed from the business.
 *
 *  \ingroup Models
 *
 */

class DeleteBusinessMembershipMember : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteBusinessMembershipMember();
	DeleteBusinessMembershipMember(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteBusinessMembershipMember();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	BusinessRoleForMembers getBusinessRole();

	/*! \brief Set 
	 */
	void setBusinessRole(BusinessRoleForMembers  business_role);
	/*! \brief Get Unique identifier of the member
	 */
	std::string getMemberId();

	/*! \brief Set Unique identifier of the member
	 */
	void setMemberId(std::string  member_id);

private:
	BusinessRoleForMembers business_role;
	std::string member_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteBusinessMembershipMember_H_ */
