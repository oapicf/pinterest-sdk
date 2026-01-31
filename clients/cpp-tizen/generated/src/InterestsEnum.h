/*
 * InterestsEnum.h
 *
 * 
 */

#ifndef _InterestsEnum_H_
#define _InterestsEnum_H_


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

class InterestsEnum : public Object {
public:
	/*! \brief Constructor.
	 */
	InterestsEnum();
	InterestsEnum(char* str);

	/*! \brief Destructor.
	 */
	virtual ~InterestsEnum();

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

#endif /* _InterestsEnum_H_ */
