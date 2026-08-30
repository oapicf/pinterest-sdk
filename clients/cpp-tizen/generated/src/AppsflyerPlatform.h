/*
 * AppsflyerPlatform.h
 *
 * Platform options for AppsFlyer audience
 */

#ifndef _AppsflyerPlatform_H_
#define _AppsflyerPlatform_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Platform options for AppsFlyer audience
 *
 *  \ingroup Models
 *
 */

class AppsflyerPlatform : public Object {
public:
	/*! \brief Constructor.
	 */
	AppsflyerPlatform();
	AppsflyerPlatform(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AppsflyerPlatform();

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

#endif /* _AppsflyerPlatform_H_ */
