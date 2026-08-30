/*
 * AdAccountEntityType.h
 *
 * Specify the entity type to get summary information
 */

#ifndef _AdAccountEntityType_H_
#define _AdAccountEntityType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Specify the entity type to get summary information
 *
 *  \ingroup Models
 *
 */

class AdAccountEntityType : public Object {
public:
	/*! \brief Constructor.
	 */
	AdAccountEntityType();
	AdAccountEntityType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdAccountEntityType();

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

#endif /* _AdAccountEntityType_H_ */
