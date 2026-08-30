/*
 * CampaignPlanningResponseErrorCode.h
 *
 * Error code returned for a campaign planning estimate failure.
 */

#ifndef _CampaignPlanningResponseErrorCode_H_
#define _CampaignPlanningResponseErrorCode_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Error code returned for a campaign planning estimate failure.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningResponseErrorCode : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningResponseErrorCode();
	CampaignPlanningResponseErrorCode(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningResponseErrorCode();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignPlanningResponseErrorCode_H_ */
