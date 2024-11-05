/*
 * BusinessRole.h
 *
 * The access level a member/partner has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. &lt;br&gt; - PARTNER: Can only view and access assets you assign them to/or they assign to you.
 */

#ifndef _BusinessRole_H_
#define _BusinessRole_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The access level a member/partner has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. <br> - PARTNER: Can only view and access assets you assign them to/or they assign to you.
 *
 *  \ingroup Models
 *
 */

class BusinessRole : public Object {
public:
	/*! \brief Constructor.
	 */
	BusinessRole();
	BusinessRole(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BusinessRole();

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

#endif /* _BusinessRole_H_ */
