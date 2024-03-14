/*
 * ObjectiveType.h
 *
 * Campaign objective type. [\&quot;WEB_SESSIONS\&quot;] in BETA.
 */

#ifndef _ObjectiveType_H_
#define _ObjectiveType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Campaign objective type. [\"WEB_SESSIONS\"] in BETA.
 *
 *  \ingroup Models
 *
 */

class ObjectiveType : public Object {
public:
	/*! \brief Constructor.
	 */
	ObjectiveType();
	ObjectiveType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ObjectiveType();

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

#endif /* _ObjectiveType_H_ */
