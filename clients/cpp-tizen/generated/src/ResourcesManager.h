#ifndef _ResourcesManager_H_
#define _ResourcesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Ad_account_countries_get_200_response.h"
#include "BookClosed.h"
#include "Delivery_metrics_get_200_response.h"
#include "Pinterest.Lib.Error.h"
#include "PublicTargetingType.h"
#include "ReportType.h"
#include "SingleInterestTargetingOption.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Resources Resources
 * \ingroup Operations
 *  @{
 */
class ResourcesManager {
public:
	ResourcesManager();
	virtual ~ResourcesManager();

/*! \brief Get ad accounts countries. *Synchronous*
 *
 * Get Ad Accounts countries
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adAccountCountriesGetSync(char * accessToken,
	
	void(* handler)(Ad_account_countries_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get ad accounts countries. *Asynchronous*
 *
 * Get Ad Accounts countries
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adAccountCountriesGetAsync(char * accessToken,
	
	void(* handler)(Ad_account_countries_get_200_response, Error, void* )
	, void* userData);


/*! \brief Get available metrics' definitions. *Synchronous*
 *
 * Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
 * \param reportType Report type.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deliveryMetricsGetSync(char * accessToken,
	ReportType reportType, 
	void(* handler)(Delivery_metrics_get_200_response, Error, void* )
	, void* userData);

/*! \brief Get available metrics' definitions. *Asynchronous*
 *
 * Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.
 * \param reportType Report type.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deliveryMetricsGetAsync(char * accessToken,
	ReportType reportType, 
	void(* handler)(Delivery_metrics_get_200_response, Error, void* )
	, void* userData);


/*! \brief Get interest details. *Synchronous*
 *
 * Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.
 * \param interestId Unique identifier of an interest. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool interestTargetingOptionsGetSync(char * accessToken,
	std::string interestId, 
	void(* handler)(SingleInterestTargetingOption, Error, void* )
	, void* userData);

/*! \brief Get interest details. *Asynchronous*
 *
 * Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.
 * \param interestId Unique identifier of an interest. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool interestTargetingOptionsGetAsync(char * accessToken,
	std::string interestId, 
	void(* handler)(SingleInterestTargetingOption, Error, void* )
	, void* userData);


/*! \brief Get lead form questions. *Synchronous*
 *
 * Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormQuestionsGetSync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Get lead form questions. *Asynchronous*
 *
 * Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool leadFormQuestionsGetAsync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get metrics ready state. *Synchronous*
 *
 * Learn whether conversion or non-conversion metrics are finalized and ready to query.
 * \param date Analytics reports request date (UTC). Format: YYYY-MM-DD *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metricsReadyStateGetSync(char * accessToken,
	std::string date, 
	void(* handler)(BookClosed, Error, void* )
	, void* userData);

/*! \brief Get metrics ready state. *Asynchronous*
 *
 * Learn whether conversion or non-conversion metrics are finalized and ready to query.
 * \param date Analytics reports request date (UTC). Format: YYYY-MM-DD *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool metricsReadyStateGetAsync(char * accessToken,
	std::string date, 
	void(* handler)(BookClosed, Error, void* )
	, void* userData);


/*! \brief Get targeting options. *Synchronous*
 *
 *     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```
 * \param targetingType Public targeting type *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param clientId Client ID
 * \param oauthSignature Oauth signature
 * \param timestamp Timestamp.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool targetingOptionsGetSync(char * accessToken,
	PublicTargetingType targetingType, std::string adAccountId, std::string clientId, std::string oauthSignature, std::string timestamp, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);

/*! \brief Get targeting options. *Asynchronous*
 *
 *     You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```
 * \param targetingType Public targeting type *Required*
 * \param adAccountId Unique identifier of an ad account.
 * \param clientId Client ID
 * \param oauthSignature Oauth signature
 * \param timestamp Timestamp.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool targetingOptionsGetAsync(char * accessToken,
	PublicTargetingType targetingType, std::string adAccountId, std::string clientId, std::string oauthSignature, std::string timestamp, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* ResourcesManager_H_ */
