/*
 * CampaignBidOptionsUpdate.h
 *
 * Object describing an update to the campaign level bid multipliers.
 */

#ifndef _CampaignBidOptionsUpdate_H_
#define _CampaignBidOptionsUpdate_H_


#include <string>
#include "AgeBucketMultipliers.h"
#include "AppTypeMultipliers.h"
#include "CampaignAudienceMultipliers.h"
#include "CampaignBidOptionsUpdateMaskItems.h"
#include "FreqBidMultiplierTimeWindow.h"
#include "FrequencyMultipliers.h"
#include "GenderMultipliers.h"
#include "PlacementMultipliers.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing an update to the campaign level bid multipliers.
 *
 *  \ingroup Models
 *
 */

class CampaignBidOptionsUpdate : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignBidOptionsUpdate();
	CampaignBidOptionsUpdate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignBidOptionsUpdate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Age bucket multipliers for bid adjustments.
	 */
	AgeBucketMultipliers getAgeBucketMultipliers();

	/*! \brief Set Age bucket multipliers for bid adjustments.
	 */
	void setAgeBucketMultipliers(AgeBucketMultipliers  age_bucket_multipliers);
	/*! \brief Get App type multipliers for bid adjustments.
	 */
	AppTypeMultipliers getAppTypeMultipliers();

	/*! \brief Set App type multipliers for bid adjustments.
	 */
	void setAppTypeMultipliers(AppTypeMultipliers  app_type_multipliers);
	/*! \brief Get Audience multipliers for bid adjustments.
	 */
	CampaignAudienceMultipliers getAudienceMultipliers();

	/*! \brief Set Audience multipliers for bid adjustments.
	 */
	void setAudienceMultipliers(CampaignAudienceMultipliers  audience_multipliers);
	/*! \brief Get The time window for frequency bid multipliers.
	 */
	FreqBidMultiplierTimeWindow getFreqBidMultiplierTimeWindow();

	/*! \brief Set The time window for frequency bid multipliers.
	 */
	void setFreqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow  freq_bid_multiplier_time_window);
	/*! \brief Get Frequency multipliers for bid adjustments.
	 */
	FrequencyMultipliers getFrequencyMultipliers();

	/*! \brief Set Frequency multipliers for bid adjustments.
	 */
	void setFrequencyMultipliers(FrequencyMultipliers  frequency_multipliers);
	/*! \brief Get Gender multipliers for bid adjustments.
	 */
	GenderMultipliers getGenderMultipliers();

	/*! \brief Set Gender multipliers for bid adjustments.
	 */
	void setGenderMultipliers(GenderMultipliers  gender_multipliers);
	/*! \brief Get Placement multipliers for bid adjustments.
	 */
	PlacementMultipliers getPlacementMultipliers();

	/*! \brief Set Placement multipliers for bid adjustments.
	 */
	void setPlacementMultipliers(PlacementMultipliers  placement_multipliers);
	/*! \brief Get List of fields to update. Only the fields in the list will be updated.
	 */
	std::list<CampaignBidOptionsUpdateMaskItems> getUpdateMask();

	/*! \brief Set List of fields to update. Only the fields in the list will be updated.
	 */
	void setUpdateMask(std::list <CampaignBidOptionsUpdateMaskItems> update_mask);

private:
	AgeBucketMultipliers age_bucket_multipliers;
	AppTypeMultipliers app_type_multipliers;
	CampaignAudienceMultipliers audience_multipliers;
	FreqBidMultiplierTimeWindow freq_bid_multiplier_time_window;
	FrequencyMultipliers frequency_multipliers;
	GenderMultipliers gender_multipliers;
	PlacementMultipliers placement_multipliers;
	std::list <CampaignBidOptionsUpdateMaskItems>update_mask;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignBidOptionsUpdate_H_ */
