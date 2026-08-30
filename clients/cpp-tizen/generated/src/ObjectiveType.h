/*
 * ObjectiveType.h
 *
 * Advertiser campaign objective type. You can only update objectives for draft campaigns. &#x60;CTV_CONSIDERATION&#x60; is in BETA. &#x60;WEB_SESSIONS&#x60; and &#x60;VIDEO_VIEW&#x60; objectives are deprecated. We recommend using &#x60;VIDEO_COMPLETION&#x60; as an alternative for the latter.
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


/*! \brief Advertiser campaign objective type. You can only update objectives for draft campaigns. `CTV_CONSIDERATION` is in BETA. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
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
