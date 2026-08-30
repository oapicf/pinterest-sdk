/*
 * Schedule_delta_value.h
 *
 * The value of the scheduled adjustment.
 */

#ifndef _Schedule_delta_value_H_
#define _Schedule_delta_value_H_


#include <string>
#include "BidOptionsAgeBucketMultipliers.h"
#include "BidOptionsAppTypeMultipliers.h"
#include "BidOptionsAudienceMultipliers.h"
#include "BidOptionsGenderMultipliers.h"
#include "BidOptionsPlacementMultipliers.h"
#include "ScheduleBidMultipliers.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The value of the scheduled adjustment.
 *
 *  \ingroup Models
 *
 */

class Schedule_delta_value : public Object {
public:
	/*! \brief Constructor.
	 */
	Schedule_delta_value();
	Schedule_delta_value(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Schedule_delta_value();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	BidOptionsAgeBucketMultipliers getAgeBucketMultipliers();

	/*! \brief Set 
	 */
	void setAgeBucketMultipliers(BidOptionsAgeBucketMultipliers  age_bucket_multipliers);
	/*! \brief Get 
	 */
	BidOptionsAppTypeMultipliers getAppTypeMultipliers();

	/*! \brief Set 
	 */
	void setAppTypeMultipliers(BidOptionsAppTypeMultipliers  app_type_multipliers);
	/*! \brief Get 
	 */
	std::list<BidOptionsAudienceMultipliers> getAudienceMultipliers();

	/*! \brief Set 
	 */
	void setAudienceMultipliers(std::list <BidOptionsAudienceMultipliers> audience_multipliers);
	/*! \brief Get 
	 */
	BidOptionsGenderMultipliers getGenderMultipliers();

	/*! \brief Set 
	 */
	void setGenderMultipliers(BidOptionsGenderMultipliers  gender_multipliers);
	/*! \brief Get 
	 */
	BidOptionsPlacementMultipliers getPlacementMultipliers();

	/*! \brief Set 
	 */
	void setPlacementMultipliers(BidOptionsPlacementMultipliers  placement_multipliers);

private:
	BidOptionsAgeBucketMultipliers age_bucket_multipliers;
	BidOptionsAppTypeMultipliers app_type_multipliers;
	std::list <BidOptionsAudienceMultipliers>audience_multipliers;
	BidOptionsGenderMultipliers gender_multipliers;
	BidOptionsPlacementMultipliers placement_multipliers;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Schedule_delta_value_H_ */
