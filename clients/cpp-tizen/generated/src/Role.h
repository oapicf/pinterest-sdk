/*
 * Role.h
 *
 * An internal role type used on business access, EMPLOYEE, ADMIN.
 */

#ifndef _Role_H_
#define _Role_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An internal role type used on business access, EMPLOYEE, ADMIN.
 *
 *  \ingroup Models
 *
 */

class Role : public Object {
public:
	/*! \brief Constructor.
	 */
	Role();
	Role(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Role();

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

#endif /* _Role_H_ */
