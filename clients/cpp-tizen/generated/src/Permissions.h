/*
 * Permissions.h
 *
 * 
 */

#ifndef _Permissions_H_
#define _Permissions_H_


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

class Permissions : public Object {
public:
	/*! \brief Constructor.
	 */
	Permissions();
	Permissions(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Permissions();

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

#endif /* _Permissions_H_ */
