
/*
 * CampaignPlanningResponseErrorCode.h
 *
 * Error code returned for a campaign planning estimate failure.
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningResponseErrorCode_H_
#define TINY_CPP_CLIENT_CampaignPlanningResponseErrorCode_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Error code returned for a campaign planning estimate failure.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningResponseErrorCode{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningResponseErrorCode();
    CampaignPlanningResponseErrorCode(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningResponseErrorCode();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningResponseErrorCode_H_ */
