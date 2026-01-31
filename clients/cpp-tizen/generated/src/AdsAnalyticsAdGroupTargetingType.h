/*
 * AdsAnalyticsAdGroupTargetingType.h
 *
 * Reporting targeting type for ad groups
 */

#ifndef _AdsAnalyticsAdGroupTargetingType_H_
#define _AdsAnalyticsAdGroupTargetingType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Reporting targeting type for ad groups
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsAdGroupTargetingType : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsAnalyticsAdGroupTargetingType();
	AdsAnalyticsAdGroupTargetingType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsAnalyticsAdGroupTargetingType();

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

#endif /* _AdsAnalyticsAdGroupTargetingType_H_ */
