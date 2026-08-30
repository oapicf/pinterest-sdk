/*
 * ScheduleBidOptions.h
 *
 * Object describing the schedule level bid level changes.
 */

#ifndef _ScheduleBidOptions_H_
#define _ScheduleBidOptions_H_


#include <string>
#include "ScheduleAgeBucketMultipliers.h"
#include "ScheduleAppTypeMultipliers.h"
#include "ScheduleAudienceMultipliers.h"
#include "ScheduleBidOptions_gender_multipliers.h"
#include "ScheduleBidOptions_placement_multipliers.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing the schedule level bid level changes.
 *
 *  \ingroup Models
 *
 */

class ScheduleBidOptions : public Object {
public:
	/*! \brief Constructor.
	 */
	ScheduleBidOptions();
	ScheduleBidOptions(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ScheduleBidOptions();

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

#endif /* _ScheduleBidOptions_H_ */
