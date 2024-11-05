/*
 * PermissionsWithOwner.h
 *
 * 
 */

#ifndef _PermissionsWithOwner_H_
#define _PermissionsWithOwner_H_


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

class PermissionsWithOwner : public Object {
public:
	/*! \brief Constructor.
	 */
	PermissionsWithOwner();
	PermissionsWithOwner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PermissionsWithOwner();

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

#endif /* _PermissionsWithOwner_H_ */
