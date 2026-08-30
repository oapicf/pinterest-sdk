/*
 * AudienceObjectiveType.h
 *
 * Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
 */

#ifndef _AudienceObjectiveType_H_
#define _AudienceObjectiveType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
 *
 *  \ingroup Models
 *
 */

class AudienceObjectiveType : public Object {
public:
	/*! \brief Constructor.
	 */
	AudienceObjectiveType();
	AudienceObjectiveType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudienceObjectiveType();

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

#endif /* _AudienceObjectiveType_H_ */
