/*
 * CampaignPlanningConfidenceLevelAlertSeverity.h
 *
 * Severity of a confidence level alert on delivery estimates.
 */

#ifndef _CampaignPlanningConfidenceLevelAlertSeverity_H_
#define _CampaignPlanningConfidenceLevelAlertSeverity_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Severity of a confidence level alert on delivery estimates.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningConfidenceLevelAlertSeverity : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningConfidenceLevelAlertSeverity();
	CampaignPlanningConfidenceLevelAlertSeverity(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningConfidenceLevelAlertSeverity();

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

#endif /* _CampaignPlanningConfidenceLevelAlertSeverity_H_ */
