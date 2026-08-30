/*
 * UserAccountType.h
 *
 * 
 */

#ifndef _UserAccountType_H_
#define _UserAccountType_H_


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

class UserAccountType : public Object {
public:
	/*! \brief Constructor.
	 */
	UserAccountType();
	UserAccountType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserAccountType();

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

#endif /* _UserAccountType_H_ */
