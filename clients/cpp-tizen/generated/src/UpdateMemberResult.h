/*
 * UpdateMemberResult.h
 *
 * 
 */

#ifndef _UpdateMemberResult_H_
#define _UpdateMemberResult_H_


#include <string>
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

class UpdateMemberResult : public Object {
public:
	/*! \brief Constructor.
	 */
	UpdateMemberResult();
	UpdateMemberResult(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UpdateMemberResult();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
	 */
	std::string getBusinessRole();

	/*! \brief Set The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
	 */
	void setBusinessRole(std::string  business_role);
	/*! \brief Get Unique identifier of the business member.
	 */
	std::string getMemberId();

	/*! \brief Set Unique identifier of the business member.
	 */
	void setMemberId(std::string  member_id);

private:
	std::string business_role;
	std::string member_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UpdateMemberResult_H_ */
