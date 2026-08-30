/*
 * CampaignPlanningEstimationType.h
 *
 * Estimation type for campaign planning estimated curve
 */

#ifndef _CampaignPlanningEstimationType_H_
#define _CampaignPlanningEstimationType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Estimation type for campaign planning estimated curve
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningEstimationType : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningEstimationType();
	CampaignPlanningEstimationType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningEstimationType();

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

#endif /* _CampaignPlanningEstimationType_H_ */
