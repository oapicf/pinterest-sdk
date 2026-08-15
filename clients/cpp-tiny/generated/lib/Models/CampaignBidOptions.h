
/*
 * CampaignBidOptions.h
 *
 * Object describing the campaign level bid multipliers.
 */

#ifndef TINY_CPP_CLIENT_CampaignBidOptions_H_
#define TINY_CPP_CLIENT_CampaignBidOptions_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AppTypeMultipliers.h"
#include "CampaignAudienceMultipliers.h"
#include "PlacementMultipliers.h"

namespace Tiny {


/*! \brief Object describing the campaign level bid multipliers.
 *
 *  \ingroup Models
 *
 */

class CampaignBidOptions{
public:

    /*! \brief Constructor.
	 */
    CampaignBidOptions();
    CampaignBidOptions(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignBidOptions();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	AppTypeMultipliers getAppTypeMultipliers();

	/*! \brief Set 
	 */
	void setAppTypeMultipliers(AppTypeMultipliers  app_type_multipliers);
	/*! \brief Get 
	 */
	CampaignAudienceMultipliers getAudienceMultipliers();

	/*! \brief Set 
	 */
	void setAudienceMultipliers(CampaignAudienceMultipliers  audience_multipliers);
	/*! \brief Get 
	 */
	PlacementMultipliers getPlacementMultipliers();

	/*! \brief Set 
	 */
	void setPlacementMultipliers(PlacementMultipliers  placement_multipliers);


    private:
    AppTypeMultipliers app_type_multipliers;
    CampaignAudienceMultipliers audience_multipliers;
    PlacementMultipliers placement_multipliers;
};
}

#endif /* TINY_CPP_CLIENT_CampaignBidOptions_H_ */
