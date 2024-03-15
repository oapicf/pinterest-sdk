/*
 * BusinessAccessRole.h
 *
 * Permission role for business access.
 */

#ifndef _BusinessAccessRole_H_
#define _BusinessAccessRole_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Permission role for business access.
 *
 *  \ingroup Models
 *
 */

class BusinessAccessRole : public Object {
public:
	/*! \brief Constructor.
	 */
	BusinessAccessRole();
	BusinessAccessRole(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BusinessAccessRole();

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

#endif /* _BusinessAccessRole_H_ */
