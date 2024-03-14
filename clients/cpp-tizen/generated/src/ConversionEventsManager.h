#ifndef _ConversionEventsManager_H_
#define _ConversionEventsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "ConversionApiResponse.h"
#include "ConversionEvents.h"
#include "Error.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup ConversionEvents ConversionEvents
 * \ingroup Operations
 *  @{
 */
class ConversionEventsManager {
public:
	ConversionEventsManager();
	virtual ~ConversionEventsManager();

/*! \brief Send conversion events to the Pinterest API for Conversions. *Synchronous*
 *
 * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/conversions/conversion-management/#Authenticating%20for%20the%20Conversion%20Tracking%20endpoint\">Conversions Guide</a> for more details. - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param conversionEvents Conversion events. *Required*
 * \param test Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool eventsCreateSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ConversionEvents> conversionEvents, bool test, 
	void(* handler)(ConversionApiResponse, Error, void* )
	, void* userData);

/*! \brief Send conversion events to the Pinterest API for Conversions. *Asynchronous*
 *
 * The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/conversions/conversion-management/#Authenticating%20for%20the%20Conversion%20Tracking%20endpoint\">Conversions Guide</a> for more details. - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param conversionEvents Conversion events. *Required*
 * \param test Include query param ?test=true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool eventsCreateAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<ConversionEvents> conversionEvents, bool test, 
	void(* handler)(ConversionApiResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* ConversionEventsManager_H_ */
