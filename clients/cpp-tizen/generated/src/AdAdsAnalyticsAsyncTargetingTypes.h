/*
 * AdAdsAnalyticsAsyncTargetingTypes.h
 *
 * Reporting targeting type
 */

#ifndef _AdAdsAnalyticsAsyncTargetingTypes_H_
#define _AdAdsAnalyticsAsyncTargetingTypes_H_


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

class AdAdsAnalyticsAsyncTargetingTypes : public Object {
public:
	/*! \brief Constructor.
	 */
	AdAdsAnalyticsAsyncTargetingTypes();
	AdAdsAnalyticsAsyncTargetingTypes(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdAdsAnalyticsAsyncTargetingTypes();

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

#endif /* _AdAdsAnalyticsAsyncTargetingTypes_H_ */
