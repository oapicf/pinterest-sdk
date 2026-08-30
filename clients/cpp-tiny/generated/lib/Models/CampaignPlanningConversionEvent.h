
/*
 * CampaignPlanningConversionEvent.h
 *
 * Conversion event for which a conversion rate estimate is computed.
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningConversionEvent_H_
#define TINY_CPP_CLIENT_CampaignPlanningConversionEvent_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Conversion event for which a conversion rate estimate is computed.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningConversionEvent{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningConversionEvent();
    CampaignPlanningConversionEvent(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningConversionEvent();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningConversionEvent_H_ */
