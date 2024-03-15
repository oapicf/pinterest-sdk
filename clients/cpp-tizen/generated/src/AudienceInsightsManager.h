#ifndef _AudienceInsightsManager_H_
#define _AudienceInsightsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AudienceDefinitionResponse.h"
#include "AudienceInsightType.h"
#include "AudienceInsightsResponse.h"
#include "Error.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup AudienceInsights AudienceInsights
 * \ingroup Operations
 *  @{
 */
class AudienceInsightsManager {
public:
	AudienceInsightsManager();
	virtual ~AudienceInsightsManager();

/*! \brief Get audience insights. *Synchronous*
 *
 * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param audienceInsightType Type of audience insights. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audienceInsightsGetSync(char * accessToken,
	std::string adAccountId, AudienceInsightType audienceInsightType, 
	void(* handler)(AudienceInsightsResponse, Error, void* )
	, void* userData);

/*! \brief Get audience insights. *Asynchronous*
 *
 * Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param audienceInsightType Type of audience insights. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audienceInsightsGetAsync(char * accessToken,
	std::string adAccountId, AudienceInsightType audienceInsightType, 
	void(* handler)(AudienceInsightsResponse, Error, void* )
	, void* userData);


/*! \brief Get audience insights scope and type. *Synchronous*
 *
 * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audienceInsightsScopeAndTypeGetSync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(AudienceDefinitionResponse, Error, void* )
	, void* userData);

/*! \brief Get audience insights scope and type. *Asynchronous*
 *
 * Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool audienceInsightsScopeAndTypeGetAsync(char * accessToken,
	std::string adAccountId, 
	void(* handler)(AudienceDefinitionResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* AudienceInsightsManager_H_ */
