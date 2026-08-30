/*
 * AudienceOwnershipType.h
 *
 * Filter audiences by ownership type.
 */

#ifndef _AudienceOwnershipType_H_
#define _AudienceOwnershipType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Filter audiences by ownership type.
 *
 *  \ingroup Models
 *
 */

class AudienceOwnershipType : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceOwnershipType();
	AudienceOwnershipType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceOwnershipType();

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

#endif /* _AudienceOwnershipType_H_ */
