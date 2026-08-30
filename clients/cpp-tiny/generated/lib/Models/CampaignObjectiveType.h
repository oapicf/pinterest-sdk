
/*
 * CampaignObjectiveType.h
 *
 * Campaign objective type. If set as one of [\&quot;AWARENESS\&quot;, \&quot;CONSIDERATION\&quot;, \&quot;WEB_CONVERSION\&quot;, \&quot;CATALOG_SALES\&quot;, \&quot;VIDEO_COMPLETION\&quot;, \&quot;CTV_CONSIDERATION\&quot;] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\&quot;WEB_SESSIONS\&quot;] is DEPRECATED. &#x60;VIDEO_VIEW&#x60; is deprecated; use &#x60;VIDEO_COMPLETION&#x60; instead. &#x60;CTV_CONSIDERATION&#x60; is in BETA. For update, only draft campaigns may update objective type.
 */

#ifndef TINY_CPP_CLIENT_CampaignObjectiveType_H_
#define TINY_CPP_CLIENT_CampaignObjectiveType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\", \"VIDEO_COMPLETION\", \"CTV_CONSIDERATION\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] is DEPRECATED. `VIDEO_VIEW` is deprecated; use `VIDEO_COMPLETION` instead. `CTV_CONSIDERATION` is in BETA. For update, only draft campaigns may update objective type.
 *
 *  \ingroup Models
 *
 */

class CampaignObjectiveType{
public:

    /*! \brief Constructor.
	 */
    CampaignObjectiveType();
    CampaignObjectiveType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignObjectiveType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CampaignObjectiveType_H_ */
