/*
 * MembersToDeleteBody_members_inner.h
 *
 * 
 */

#ifndef _MembersToDeleteBody_members_inner_H_
#define _MembersToDeleteBody_members_inner_H_


#include <string>
#include "BusinessRoleForMembers.h"
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

class MembersToDeleteBody_members_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	MembersToDeleteBody_members_inner();
	MembersToDeleteBody_members_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MembersToDeleteBody_members_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Unique identifier of the member
	 */
	std::string getMemberId();

	/*! \brief Set Unique identifier of the member
	 */
	void setMemberId(std::string  member_id);
	/*! \brief Get 
	 */
	BusinessRoleForMembers getBusinessRole();

	/*! \brief Set 
	 */
	void setBusinessRole(BusinessRoleForMembers  business_role);

private:
	std::string member_id;
	BusinessRoleForMembers business_role;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MembersToDeleteBody_members_inner_H_ */
