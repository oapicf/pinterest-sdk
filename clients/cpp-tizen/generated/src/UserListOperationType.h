/*
 * UserListOperationType.h
 *
 * User list operation type (add or remove)
 */

#ifndef _UserListOperationType_H_
#define _UserListOperationType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief User list operation type (add or remove)
 *
 *  \ingroup Models
 *
 */

class UserListOperationType : public Object {
public:
	/*! \brief Constructor.
	 */
	UserListOperationType();
	UserListOperationType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserListOperationType();

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

#endif /* _UserListOperationType_H_ */
