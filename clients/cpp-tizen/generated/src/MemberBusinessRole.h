/*
 * MemberBusinessRole.h
 *
 * The access level a member/partner has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.
 */

#ifndef _MemberBusinessRole_H_
#define _MemberBusinessRole_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The access level a member/partner has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. <br> - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.
 *
 *  \ingroup Models
 *
 */

class MemberBusinessRole : public Object {
public:
	/*! \brief Constructor.
	 */
	MemberBusinessRole();
	MemberBusinessRole(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MemberBusinessRole();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _MemberBusinessRole_H_ */
