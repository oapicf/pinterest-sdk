
/*
 * CampaignPlanningEstimationType.h
 *
 * Estimation type for campaign planning estimated curve
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningEstimationType_H_
#define TINY_CPP_CLIENT_CampaignPlanningEstimationType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Estimation type for campaign planning estimated curve
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningEstimationType{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningEstimationType();
    CampaignPlanningEstimationType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningEstimationType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningEstimationType_H_ */
