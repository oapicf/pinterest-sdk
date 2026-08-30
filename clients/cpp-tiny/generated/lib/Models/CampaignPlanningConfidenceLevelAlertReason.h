
/*
 * CampaignPlanningConfidenceLevelAlertReason.h
 *
 * Reason for a confidence level alert on delivery estimates.
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningConfidenceLevelAlertReason_H_
#define TINY_CPP_CLIENT_CampaignPlanningConfidenceLevelAlertReason_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Reason for a confidence level alert on delivery estimates.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningConfidenceLevelAlertReason{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningConfidenceLevelAlertReason();
    CampaignPlanningConfidenceLevelAlertReason(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningConfidenceLevelAlertReason();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningConfidenceLevelAlertReason_H_ */
