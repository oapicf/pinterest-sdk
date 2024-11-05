/*
 * AdsAnalyticsCampaignTargetingType.h
 *
 * Reporting targeting type for campaigns
 */

#ifndef _AdsAnalyticsCampaignTargetingType_H_
#define _AdsAnalyticsCampaignTargetingType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Reporting targeting type for campaigns
 *
 *  \ingroup Models
 *
 */

class AdsAnalyticsCampaignTargetingType : public Object {
public:
	/*! \brief Constructor.
	 */
	AdsAnalyticsCampaignTargetingType();
	AdsAnalyticsCampaignTargetingType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AdsAnalyticsCampaignTargetingType();

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

#endif /* _AdsAnalyticsCampaignTargetingType_H_ */
