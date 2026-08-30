
/*
 * CampaignAudienceMultipliers.h
 *
 * This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 */

#ifndef TINY_CPP_CLIENT_CampaignAudienceMultipliers_H_
#define TINY_CPP_CLIENT_CampaignAudienceMultipliers_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <map>

namespace Tiny {


/*! \brief This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).
 *
 *  \ingroup Models
 *
 */

class CampaignAudienceMultipliers{
public:

    /*! \brief Constructor.
	 */
    CampaignAudienceMultipliers();
    CampaignAudienceMultipliers(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignAudienceMultipliers();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Audience ID for the multiplier.
	 */
	std::string getAUDIENCEID();

	/*! \brief Set Audience ID for the multiplier.
	 */
	void setAUDIENCEID(std::string aUDIENCE_ID);


    private:
    std::string aUDIENCE_ID{};
};
}

#endif /* TINY_CPP_CLIENT_CampaignAudienceMultipliers_H_ */
