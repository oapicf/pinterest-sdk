/*
 * CampaignPlanningConfidenceLevelAlert.h
 *
 * A confidence level alert for the delivery estimates provided in the response.
 */

#ifndef _CampaignPlanningConfidenceLevelAlert_H_
#define _CampaignPlanningConfidenceLevelAlert_H_


#include <string>
#include "CampaignPlanningConfidenceLevelAlertReason.h"
#include "CampaignPlanningConfidenceLevelAlertSeverity.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A confidence level alert for the delivery estimates provided in the response.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningConfidenceLevelAlert : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningConfidenceLevelAlert();
	CampaignPlanningConfidenceLevelAlert(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningConfidenceLevelAlert();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Human-readable context for debugging. Not intended for display to end users.
	 */
	std::string getDescription();

	/*! \brief Set Human-readable context for debugging. Not intended for display to end users.
	 */
	void setDescription(std::string  description);
	/*! \brief Get Reason for the confidence level alert.
	 */
	CampaignPlanningConfidenceLevelAlertReason getReason();

	/*! \brief Set Reason for the confidence level alert.
	 */
	void setReason(CampaignPlanningConfidenceLevelAlertReason  reason);
	/*! \brief Get Severity of the confidence level alert.
	 */
	CampaignPlanningConfidenceLevelAlertSeverity getSeverity();

	/*! \brief Set Severity of the confidence level alert.
	 */
	void setSeverity(CampaignPlanningConfidenceLevelAlertSeverity  severity);

private:
	std::string description;
	CampaignPlanningConfidenceLevelAlertReason reason;
	CampaignPlanningConfidenceLevelAlertSeverity severity;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignPlanningConfidenceLevelAlert_H_ */
