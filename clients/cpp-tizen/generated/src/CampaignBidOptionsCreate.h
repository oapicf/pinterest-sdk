/*
 * CampaignBidOptionsCreate.h
 *
 * Object describing the campaign level bid multipliers.
 */

#ifndef _CampaignBidOptionsCreate_H_
#define _CampaignBidOptionsCreate_H_


#include <string>
#include "AppTypeMultipliers.h"
#include "CampaignAudienceMultipliers.h"
#include "PlacementMultipliers.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Object describing the campaign level bid multipliers.
 *
 *  \ingroup Models
 *
 */

class CampaignBidOptionsCreate : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignBidOptionsCreate();
	CampaignBidOptionsCreate(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignBidOptionsCreate();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignBidOptionsCreate_H_ */
