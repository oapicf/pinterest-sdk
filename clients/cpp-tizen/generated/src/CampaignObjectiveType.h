/*
 * CampaignObjectiveType.h
 *
 * Campaign objective type. If set as one of [\&quot;AWARENESS\&quot;, \&quot;CONSIDERATION\&quot;, \&quot;WEB_CONVERSION\&quot;, \&quot;CATALOG_SALES\&quot;, \&quot;VIDEO_COMPLETION\&quot;, \&quot;CTV_CONSIDERATION\&quot;] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\&quot;WEB_SESSIONS\&quot;] is DEPRECATED. &#x60;VIDEO_VIEW&#x60; is deprecated; use &#x60;VIDEO_COMPLETION&#x60; instead. &#x60;CTV_CONSIDERATION&#x60; is in BETA. For update, only draft campaigns may update objective type.
 */

#ifndef _CampaignObjectiveType_H_
#define _CampaignObjectiveType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Campaign objective type. If set as one of [\"AWARENESS\", \"CONSIDERATION\", \"WEB_CONVERSION\", \"CATALOG_SALES\", \"VIDEO_COMPLETION\", \"CTV_CONSIDERATION\"] the campaign is considered as a Campaign Budget Optimization (CBO) campaign, meaning budget needs to be set at the campaign level rather than at the ad group level. [\"WEB_SESSIONS\"] is DEPRECATED. `VIDEO_VIEW` is deprecated; use `VIDEO_COMPLETION` instead. `CTV_CONSIDERATION` is in BETA. For update, only draft campaigns may update objective type.
 *
 *  \ingroup Models
 *
 */

class CampaignObjectiveType : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignObjectiveType();
	CampaignObjectiveType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignObjectiveType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignObjectiveType_H_ */
