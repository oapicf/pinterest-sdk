/*
 * BusinessMembershipMember.h
 *
 * A business member identified by &#x60;member_id&#x60; with their &#x60;business_role&#x60; in the business.
 */

#ifndef _BusinessMembershipMember_H_
#define _BusinessMembershipMember_H_


#include <string>
#include "BusinessRoleForMembers.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A business member identified by `member_id` with their `business_role` in the business.
 *
 *  \ingroup Models
 *
 */

class BusinessMembershipMember : public Object {
public:
	/*! \brief Constructor.
	 */
	BusinessMembershipMember();
	BusinessMembershipMember(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BusinessMembershipMember();

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
	/*! \brief Get Unique identifier of the member.
	 */
	std::string getMemberId();

	/*! \brief Set Unique identifier of the member.
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

#endif /* _BusinessMembershipMember_H_ */
