/*
 * ScheduleCommonDeltaValue.h
 *
 * 
 */

#ifndef _ScheduleCommonDeltaValue_H_
#define _ScheduleCommonDeltaValue_H_


#include <string>
#include "ScheduleAgeBucketMultipliers.h"
#include "ScheduleAppTypeMultipliers.h"
#include "ScheduleAudienceMultipliers.h"
#include "ScheduleBidOptions.h"
#include "ScheduleBidOptions_gender_multipliers.h"
#include "ScheduleBidOptions_placement_multipliers.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ScheduleCommonDeltaValue : public Object {
public:
	/*! \brief Constructor.
	 */
	ScheduleCommonDeltaValue();
	ScheduleCommonDeltaValue(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ScheduleCommonDeltaValue();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ScheduleAgeBucketMultipliers getAgeBucketMultipliers();

	/*! \brief Set 
	 */
	void setAgeBucketMultipliers(ScheduleAgeBucketMultipliers  age_bucket_multipliers);
	/*! \brief Get 
	 */
	ScheduleAppTypeMultipliers getAppTypeMultipliers();

	/*! \brief Set 
	 */
	void setAppTypeMultipliers(ScheduleAppTypeMultipliers  app_type_multipliers);
	/*! \brief Get 
	 */
	ScheduleAudienceMultipliers getAudienceMultipliers();

	/*! \brief Set 
	 */
	void setAudienceMultipliers(ScheduleAudienceMultipliers  audience_multipliers);
	/*! \brief Get 
	 */
	ScheduleBidOptions_gender_multipliers getGenderMultipliers();

	/*! \brief Set 
	 */
	void setGenderMultipliers(ScheduleBidOptions_gender_multipliers  gender_multipliers);
	/*! \brief Get 
	 */
	ScheduleBidOptions_placement_multipliers getPlacementMultipliers();

	/*! \brief Set 
	 */
	void setPlacementMultipliers(ScheduleBidOptions_placement_multipliers  placement_multipliers);

private:
	ScheduleAgeBucketMultipliers age_bucket_multipliers;
	ScheduleAppTypeMultipliers app_type_multipliers;
	ScheduleAudienceMultipliers audience_multipliers;
	ScheduleBidOptions_gender_multipliers gender_multipliers;
	ScheduleBidOptions_placement_multipliers placement_multipliers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ScheduleCommonDeltaValue_H_ */
