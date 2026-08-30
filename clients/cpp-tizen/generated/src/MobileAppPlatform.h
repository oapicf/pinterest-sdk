/*
 * MobileAppPlatform.h
 *
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an &#x60;APP_INSTALL&#x60; campaign.
 */

#ifndef _MobileAppPlatform_H_
#define _MobileAppPlatform_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an `APP_INSTALL` campaign.
 *
 *  \ingroup Models
 *
 */

class MobileAppPlatform : public Object {
public:
	/*! \brief Constructor.
	 */
	MobileAppPlatform();
	MobileAppPlatform(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MobileAppPlatform();

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

#endif /* _MobileAppPlatform_H_ */
