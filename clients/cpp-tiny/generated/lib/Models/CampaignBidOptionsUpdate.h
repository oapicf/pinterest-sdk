
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
#include "AppTypeMultipliers.h"
#include "CampaignAudienceMultipliers.h"
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
	/*! \brief Get List of fields to update, only the fields in the list will be updated.
	 */
	std::list<std::string> getUpdateMask();

	/*! \brief Set List of fields to update, only the fields in the list will be updated.
	 */
	void setUpdateMask(std::list <std::string> update_mask);


    private:
    AppTypeMultipliers app_type_multipliers;
    CampaignAudienceMultipliers audience_multipliers;
    PlacementMultipliers placement_multipliers;
    std::list<std::string> update_mask;
};
}

#endif /* TINY_CPP_CLIENT_CampaignBidOptionsUpdate_H_ */
