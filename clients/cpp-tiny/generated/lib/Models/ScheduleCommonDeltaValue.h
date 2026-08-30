
/*
 * ScheduleCommonDeltaValue.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ScheduleCommonDeltaValue_H_
#define TINY_CPP_CLIENT_ScheduleCommonDeltaValue_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ScheduleAgeBucketMultipliers.h"
#include "ScheduleAppTypeMultipliers.h"
#include "ScheduleAudienceMultipliers.h"
#include "ScheduleBidOptions.h"
#include "ScheduleBidOptions_gender_multipliers.h"
#include "ScheduleBidOptions_placement_multipliers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ScheduleCommonDeltaValue{
public:

    /*! \brief Constructor.
	 */
    ScheduleCommonDeltaValue();
    ScheduleCommonDeltaValue(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ScheduleCommonDeltaValue();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ScheduleAgeBucketMultipliers&lt;std::string, double&gt; getAgeBucketMultipliers();

	/*! \brief Set 
	 */
	void setAgeBucketMultipliers(ScheduleAgeBucketMultipliers&lt;std::string, double&gt; age_bucket_multipliers);
	/*! \brief Get 
	 */
	ScheduleAppTypeMultipliers&lt;std::string, double&gt; getAppTypeMultipliers();

	/*! \brief Set 
	 */
	void setAppTypeMultipliers(ScheduleAppTypeMultipliers&lt;std::string, double&gt; app_type_multipliers);
	/*! \brief Get 
	 */
	ScheduleAudienceMultipliers&lt;std::string, double&gt; getAudienceMultipliers();

	/*! \brief Set 
	 */
	void setAudienceMultipliers(ScheduleAudienceMultipliers&lt;std::string, double&gt; audience_multipliers);
	/*! \brief Get 
	 */
	ScheduleBidOptions_gender_multipliers&lt;std::string, double&gt; getGenderMultipliers();

	/*! \brief Set 
	 */
	void setGenderMultipliers(ScheduleBidOptions_gender_multipliers&lt;std::string, double&gt; gender_multipliers);
	/*! \brief Get 
	 */
	ScheduleBidOptions_placement_multipliers getPlacementMultipliers();

	/*! \brief Set 
	 */
	void setPlacementMultipliers(ScheduleBidOptions_placement_multipliers placement_multipliers);


    private:
    ScheduleAgeBucketMultipliers&lt;std::string, double&gt; age_bucket_multipliers;
    ScheduleAppTypeMultipliers&lt;std::string, double&gt; app_type_multipliers;
    ScheduleAudienceMultipliers&lt;std::string, double&gt; audience_multipliers;
    ScheduleBidOptions_gender_multipliers&lt;std::string, double&gt; gender_multipliers;
    ScheduleBidOptions_placement_multipliers placement_multipliers;
};
}

#endif /* TINY_CPP_CLIENT_ScheduleCommonDeltaValue_H_ */
