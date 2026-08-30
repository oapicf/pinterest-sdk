
/*
 * CampaignPlanningConversionAttributionWindowDays.h
 *
 * Conversion attribution window in days.
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningConversionAttributionWindowDays_H_
#define TINY_CPP_CLIENT_CampaignPlanningConversionAttributionWindowDays_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Conversion attribution window in days.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningConversionAttributionWindowDays{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningConversionAttributionWindowDays();
    CampaignPlanningConversionAttributionWindowDays(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningConversionAttributionWindowDays();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningConversionAttributionWindowDays_H_ */
