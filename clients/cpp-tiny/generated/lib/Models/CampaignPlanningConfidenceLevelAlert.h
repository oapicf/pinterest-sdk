
/*
 * CampaignPlanningConfidenceLevelAlert.h
 *
 * A confidence level alert for the delivery estimates provided in the response.
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningConfidenceLevelAlert_H_
#define TINY_CPP_CLIENT_CampaignPlanningConfidenceLevelAlert_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignPlanningConfidenceLevelAlertReason.h"
#include "CampaignPlanningConfidenceLevelAlertSeverity.h"

namespace Tiny {


/*! \brief A confidence level alert for the delivery estimates provided in the response.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningConfidenceLevelAlert{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningConfidenceLevelAlert();
    CampaignPlanningConfidenceLevelAlert(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningConfidenceLevelAlert();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Human-readable context for debugging. Not intended for display to end users.
	 */
	std::string getDescription();

	/*! \brief Set Human-readable context for debugging. Not intended for display to end users.
	 */
	void setDescription(std::string description);
	/*! \brief Get Reason for the confidence level alert.
	 */
	CampaignPlanningConfidenceLevelAlertReason getReason();

	/*! \brief Set Reason for the confidence level alert.
	 */
	void setReason(CampaignPlanningConfidenceLevelAlertReason reason);
	/*! \brief Get Severity of the confidence level alert.
	 */
	CampaignPlanningConfidenceLevelAlertSeverity getSeverity();

	/*! \brief Set Severity of the confidence level alert.
	 */
	void setSeverity(CampaignPlanningConfidenceLevelAlertSeverity severity);


    private:
    std::string description{};
    CampaignPlanningConfidenceLevelAlertReason reason;
    CampaignPlanningConfidenceLevelAlertSeverity severity;
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningConfidenceLevelAlert_H_ */
