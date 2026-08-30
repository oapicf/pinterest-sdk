/*
 * NullalbleMatchType.h
 *
 * Keyword match type allowing null
 */

#ifndef _NullalbleMatchType_H_
#define _NullalbleMatchType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Keyword match type allowing null
 *
 *  \ingroup Models
 *
 */

class NullalbleMatchType : public Object {
public:
	/*! \brief Constructor.
	 */
	NullalbleMatchType();
	NullalbleMatchType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NullalbleMatchType();

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

#endif /* _NullalbleMatchType_H_ */
