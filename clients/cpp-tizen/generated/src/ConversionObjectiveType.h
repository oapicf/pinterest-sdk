/*
 * ConversionObjectiveType.h
 *
 * Intended result of the campaign. You can only update objectives for draft campaigns. &#x60;WEB_SESSIONS&#x60; and &#x60;VIDEO_VIEW&#x60; objectives are deprecated. We recommend using &#x60;VIDEO_COMPLETION&#x60; as an alternative for the latter.
 */

#ifndef _ConversionObjectiveType_H_
#define _ConversionObjectiveType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Intended result of the campaign. You can only update objectives for draft campaigns. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
 *
 *  \ingroup Models
 *
 */

class ConversionObjectiveType : public Object {
public:
	/*! \brief Constructor.
	 */
	ConversionObjectiveType();
	ConversionObjectiveType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ConversionObjectiveType();

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

#endif /* _ConversionObjectiveType_H_ */
