/*
 * AdsAnalyticsAccountTargetingType.h
 *
 * Reporting targeting type
 */

#ifndef _AdsAnalyticsAccountTargetingType_H_
#define _AdsAnalyticsAccountTargetingType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Reporting targeting type
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsAccountTargetingType : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsAnalyticsAccountTargetingType();
	AdsAnalyticsAccountTargetingType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsAnalyticsAccountTargetingType();

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

#endif /* _AdsAnalyticsAccountTargetingType_H_ */
