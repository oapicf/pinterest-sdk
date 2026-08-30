
/*
 * CampaignBidOptionsUpdate.h
 *
 * Object describing an update to the campaign level bid multipliers.
 */

#ifndef TINY_CPP_CLIENT_CampaignBidOptionsUpdate_H_
#define TINY_CPP_CLIENT_CampaignBidOptionsUpdate_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AgeBucketMultipliers.h"
#include "AppTypeMultipliers.h"
#include "CampaignAudienceMultipliers.h"
#include "CampaignBidOptionsUpdateMaskItems.h"
#include "FreqBidMultiplierTimeWindow.h"
#include "FrequencyMultipliers.h"
#include "GenderMultipliers.h"
#include "PlacementMultipliers.h"
#include <list>

namespace Tiny {


/*! \brief Object describing an update to the campaign level bid multipliers.
 *
 *  \ingroup Models
 *
 */

class CampaignBidOptionsUpdate{
public:

    /*! \brief Constructor.
	 */
    CampaignBidOptionsUpdate();
    CampaignBidOptionsUpdate(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignBidOptionsUpdate();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Age bucket multipliers for bid adjustments.
	 */
	AgeBucketMultipliers&lt;std::string, double&gt; getAgeBucketMultipliers();

	/*! \brief Set Age bucket multipliers for bid adjustments.
	 */
	void setAgeBucketMultipliers(AgeBucketMultipliers&lt;std::string, double&gt; age_bucket_multipliers);
	/*! \brief Get App type multipliers for bid adjustments.
	 */
	AppTypeMultipliers&lt;std::string, double&gt; getAppTypeMultipliers();

	/*! \brief Set App type multipliers for bid adjustments.
	 */
	void setAppTypeMultipliers(AppTypeMultipliers&lt;std::string, double&gt; app_type_multipliers);
	/*! \brief Get Audience multipliers for bid adjustments.
	 */
	CampaignAudienceMultipliers&lt;std::string, double&gt; getAudienceMultipliers();

	/*! \brief Set Audience multipliers for bid adjustments.
	 */
	void setAudienceMultipliers(CampaignAudienceMultipliers&lt;std::string, double&gt; audience_multipliers);
	/*! \brief Get The time window for frequency bid multipliers.
	 */
	FreqBidMultiplierTimeWindow getFreqBidMultiplierTimeWindow();

	/*! \brief Set The time window for frequency bid multipliers.
	 */
	void setFreqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freq_bid_multiplier_time_window);
	/*! \brief Get Frequency multipliers for bid adjustments.
	 */
	FrequencyMultipliers&lt;std::string, double&gt; getFrequencyMultipliers();

	/*! \brief Set Frequency multipliers for bid adjustments.
	 */
	void setFrequencyMultipliers(FrequencyMultipliers&lt;std::string, double&gt; frequency_multipliers);
	/*! \brief Get Gender multipliers for bid adjustments.
	 */
	GenderMultipliers&lt;std::string, double&gt; getGenderMultipliers();

	/*! \brief Set Gender multipliers for bid adjustments.
	 */
	void setGenderMultipliers(GenderMultipliers&lt;std::string, double&gt; gender_multipliers);
	/*! \brief Get Placement multipliers for bid adjustments.
	 */
	PlacementMultipliers&lt;std::string, double&gt; getPlacementMultipliers();

	/*! \brief Set Placement multipliers for bid adjustments.
	 */
	void setPlacementMultipliers(PlacementMultipliers&lt;std::string, double&gt; placement_multipliers);
	/*! \brief Get List of fields to update. Only the fields in the list will be updated.
	 */
	std::list<CampaignBidOptionsUpdateMaskItems> getUpdateMask();

	/*! \brief Set List of fields to update. Only the fields in the list will be updated.
	 */
	void setUpdateMask(std::list<CampaignBidOptionsUpdateMaskItems> update_mask);


    private:
    AgeBucketMultipliers&lt;std::string, double&gt; age_bucket_multipliers;
    AppTypeMultipliers&lt;std::string, double&gt; app_type_multipliers;
    CampaignAudienceMultipliers&lt;std::string, double&gt; audience_multipliers;
    FreqBidMultiplierTimeWindow freq_bid_multiplier_time_window;
    FrequencyMultipliers&lt;std::string, double&gt; frequency_multipliers;
    GenderMultipliers&lt;std::string, double&gt; gender_multipliers;
    PlacementMultipliers&lt;std::string, double&gt; placement_multipliers;
    std::list<CampaignBidOptionsUpdateMaskItems> update_mask;
};
}

#endif /* TINY_CPP_CLIENT_CampaignBidOptionsUpdate_H_ */
