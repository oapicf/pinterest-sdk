
/*
 * Schedule_delta_value.h
 *
 * The value of the scheduled adjustment.
 */

#ifndef TINY_CPP_CLIENT_Schedule_delta_value_H_
#define TINY_CPP_CLIENT_Schedule_delta_value_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "BidOptionsAgeBucketMultipliers.h"
#include "BidOptionsAppTypeMultipliers.h"
#include "BidOptionsAudienceMultipliers.h"
#include "BidOptionsGenderMultipliers.h"
#include "BidOptionsPlacementMultipliers.h"
#include "ScheduleBidMultipliers.h"
#include <list>

namespace Tiny {


/*! \brief The value of the scheduled adjustment.
 *
 *  \ingroup Models
 *
 */

class Schedule_delta_value{
public:

    /*! \brief Constructor.
	 */
    Schedule_delta_value();
    Schedule_delta_value(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Schedule_delta_value();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	BidOptionsAgeBucketMultipliers getAgeBucketMultipliers();

	/*! \brief Set 
	 */
	void setAgeBucketMultipliers(BidOptionsAgeBucketMultipliers age_bucket_multipliers);
	/*! \brief Get 
	 */
	BidOptionsAppTypeMultipliers getAppTypeMultipliers();

	/*! \brief Set 
	 */
	void setAppTypeMultipliers(BidOptionsAppTypeMultipliers app_type_multipliers);
	/*! \brief Get 
	 */
	std::list<BidOptionsAudienceMultipliers> getAudienceMultipliers();

	/*! \brief Set 
	 */
	void setAudienceMultipliers(std::list<BidOptionsAudienceMultipliers> audience_multipliers);
	/*! \brief Get 
	 */
	BidOptionsGenderMultipliers getGenderMultipliers();

	/*! \brief Set 
	 */
	void setGenderMultipliers(BidOptionsGenderMultipliers gender_multipliers);
	/*! \brief Get 
	 */
	BidOptionsPlacementMultipliers getPlacementMultipliers();

	/*! \brief Set 
	 */
	void setPlacementMultipliers(BidOptionsPlacementMultipliers placement_multipliers);


    private:
    BidOptionsAgeBucketMultipliers age_bucket_multipliers;
    BidOptionsAppTypeMultipliers app_type_multipliers;
    std::list<BidOptionsAudienceMultipliers> audience_multipliers;
    BidOptionsGenderMultipliers gender_multipliers;
    BidOptionsPlacementMultipliers placement_multipliers;
};
}

#endif /* TINY_CPP_CLIENT_Schedule_delta_value_H_ */
