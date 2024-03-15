/*
 * AudienceSharingType.h
 *
 * Audience sharing type: [\&quot;CUSTOM\&quot;, \&quot;SYNDICATED\&quot;]
 */

#ifndef _AudienceSharingType_H_
#define _AudienceSharingType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Audience sharing type: [\"CUSTOM\", \"SYNDICATED\"]
 *
 *  \ingroup Models
 *
 */

class AudienceSharingType : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceSharingType();
	AudienceSharingType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceSharingType();

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

#endif /* _AudienceSharingType_H_ */
