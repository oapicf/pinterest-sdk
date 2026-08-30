/*
 * PinnerListType.h
 *
 * Audience type
 */

#ifndef _PinnerListType_H_
#define _PinnerListType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Audience type
 *
 *  \ingroup Models
 *
 */

class PinnerListType : public Object {
public:
	/*! \brief Constructor.
	 */
	PinnerListType();
	PinnerListType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PinnerListType();

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

#endif /* _PinnerListType_H_ */
