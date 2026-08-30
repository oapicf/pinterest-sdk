/*
 * CampaignPlanningConfidenceLevelAlertReason.h
 *
 * Reason for a confidence level alert on delivery estimates.
 */

#ifndef _CampaignPlanningConfidenceLevelAlertReason_H_
#define _CampaignPlanningConfidenceLevelAlertReason_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Reason for a confidence level alert on delivery estimates.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningConfidenceLevelAlertReason : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningConfidenceLevelAlertReason();
	CampaignPlanningConfidenceLevelAlertReason(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningConfidenceLevelAlertReason();

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

#endif /* _CampaignPlanningConfidenceLevelAlertReason_H_ */
