/*
 * BusinessRoleCheckMode.h
 *
 * Specifies if the partner is internal or external.
 */

#ifndef _BusinessRoleCheckMode_H_
#define _BusinessRoleCheckMode_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Specifies if the partner is internal or external.
 *
 *  \ingroup Models
 *
 */

class BusinessRoleCheckMode : public Object {
public:
	/*! \brief Constructor.
	 */
	BusinessRoleCheckMode();
	BusinessRoleCheckMode(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BusinessRoleCheckMode();

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

#endif /* _BusinessRoleCheckMode_H_ */
