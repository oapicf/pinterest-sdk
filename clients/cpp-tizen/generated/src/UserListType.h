/*
 * UserListType.h
 *
 * User list type
 */

#ifndef _UserListType_H_
#define _UserListType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief User list type
 *
 *  \ingroup Models
 *
 */

class UserListType : public Object {
public:
	/*! \brief Constructor.
	 */
	UserListType();
	UserListType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserListType();

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

#endif /* _UserListType_H_ */
