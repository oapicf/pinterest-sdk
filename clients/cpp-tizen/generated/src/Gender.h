/*
 * Gender.h
 *
 * 
 */

#ifndef _Gender_H_
#define _Gender_H_


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

class Gender : public Object {
public:
	/*! \brief Constructor.
	 */
	Gender();
	Gender(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Gender();

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

#endif /* _Gender_H_ */
