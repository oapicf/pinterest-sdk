/*
 * CampaignPlanningResponseError.h
 *
 * Error encountered while estimating delivery for a campaign.
 */

#ifndef _CampaignPlanningResponseError_H_
#define _CampaignPlanningResponseError_H_


#include <string>
#include "CampaignPlanningResponseErrorCode.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Error encountered while estimating delivery for a campaign.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningResponseError : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningResponseError();
	CampaignPlanningResponseError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningResponseError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CampaignPlanningResponseErrorCode getCode();

	/*! \brief Set 
	 */
	void setCode(CampaignPlanningResponseErrorCode  code);
	/*! \brief Get Human-readable error message.
	 */
	std::string getMessage();

	/*! \brief Set Human-readable error message.
	 */
	void setMessage(std::string  message);

private:
	CampaignPlanningResponseErrorCode code;
	std::string message;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignPlanningResponseError_H_ */
