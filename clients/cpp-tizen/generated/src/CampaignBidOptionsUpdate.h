/*
 * CampaignBidOptionsUpdate.h
 *
 * Object describing an update to the campaign level bid multipliers.
 */

#ifndef _CampaignBidOptionsUpdate_H_
#define _CampaignBidOptionsUpdate_H_


#include <string>
#include "AppTypeMultipliers.h"
#include "CampaignAudienceMultipliers.h"
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
	std::list <std::string>update_mask;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignBidOptionsUpdate_H_ */
