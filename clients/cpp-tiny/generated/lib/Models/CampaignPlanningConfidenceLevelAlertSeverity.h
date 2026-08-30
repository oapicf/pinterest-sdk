
/*
 * CampaignPlanningConfidenceLevelAlertSeverity.h
 *
 * Severity of a confidence level alert on delivery estimates.
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningConfidenceLevelAlertSeverity_H_
#define TINY_CPP_CLIENT_CampaignPlanningConfidenceLevelAlertSeverity_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Severity of a confidence level alert on delivery estimates.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningConfidenceLevelAlertSeverity{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningConfidenceLevelAlertSeverity();
    CampaignPlanningConfidenceLevelAlertSeverity(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningConfidenceLevelAlertSeverity();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningConfidenceLevelAlertSeverity_H_ */
