/*
 * CampaignPlanningAdGroupAudienceSize.h
 *
 * Range audience size for an ad group.
 */

#ifndef _CampaignPlanningAdGroupAudienceSize_H_
#define _CampaignPlanningAdGroupAudienceSize_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Range audience size for an ad group.
 *
 *  \ingroup Models
 *
 */

class CampaignPlanningAdGroupAudienceSize : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignPlanningAdGroupAudienceSize();
	CampaignPlanningAdGroupAudienceSize(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignPlanningAdGroupAudienceSize();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Lower bound of the audience size estimate.
	 */
	int getCountLower();

	/*! \brief Set Lower bound of the audience size estimate.
	 */
	void setCountLower(int  count_lower);
	/*! \brief Get Upper bound of the audience size estimate.
	 */
	int getCountUpper();

	/*! \brief Set Upper bound of the audience size estimate.
	 */
	void setCountUpper(int  count_upper);

private:
	int count_lower;
	int count_upper;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignPlanningAdGroupAudienceSize_H_ */
