
/*
 * CampaignPlanningResponseError.h
 *
 * Error encountered while estimating delivery for a campaign.
 */

#ifndef TINY_CPP_CLIENT_CampaignPlanningResponseError_H_
#define TINY_CPP_CLIENT_CampaignPlanningResponseError_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignPlanningResponseErrorCode.h"

namespace Tiny {


/*! \brief Error encountered while estimating delivery for a campaign.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningResponseError{
public:

    /*! \brief Constructor.
	 */
    CampaignPlanningResponseError();
    CampaignPlanningResponseError(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignPlanningResponseError();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	CampaignPlanningResponseErrorCode getCode();

	/*! \brief Set 
	 */
	void setCode(CampaignPlanningResponseErrorCode code);
	/*! \brief Get Human-readable error message.
	 */
	std::string getMessage();

	/*! \brief Set Human-readable error message.
	 */
	void setMessage(std::string message);


    private:
    CampaignPlanningResponseErrorCode code;
    std::string message{};
};
}

#endif /* TINY_CPP_CLIENT_CampaignPlanningResponseError_H_ */
