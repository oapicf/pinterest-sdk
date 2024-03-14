#ifndef _ResourcesManager_H_
#define _ResourcesManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AdAccountsCountryResponse.h"
#include "BookClosedResponse.h"
#include "DeliveryMetricsResponse.h"
#include "Error.h"
#include "SingleInterestTargetingOptionResponse.h"
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
	
	void(* handler)(AdAccountsCountryResponse, Error, void* )
	, void* userData);

/*! \brief Get ad accounts countries. *Asynchronous*
 *
 * Get Ad Accounts countries
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adAccountCountriesGetAsync(char * accessToken,
	
	void(* handler)(AdAccountsCountryResponse, Error, void* )
	, void* userData);


/*! \brief Get available delivery metrics' definitions. *Synchronous*
 *
 * Get the definitions for the delivery metrics available for synchronous or asynchronous reports.
 * \param reportType Report type.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deliveryMetricsGetSync(char * accessToken,
	std::string reportType, 
	void(* handler)(DeliveryMetricsResponse, Error, void* )
	, void* userData);

/*! \brief Get available delivery metrics' definitions. *Asynchronous*
 *
 * Get the definitions for the delivery metrics available for synchronous or asynchronous reports.
 * \param reportType Report type.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool deliveryMetricsGetAsync(char * accessToken,
	std::string reportType, 
	void(* handler)(DeliveryMetricsResponse, Error, void* )
	, void* userData);


/*! \brief Get interest details. *Synchronous*
 *
 * <p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>
 * \param interestId Unique identifier of an interest. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool interestTargetingOptionsGetSync(char * accessToken,
	std::string interestId, 
	void(* handler)(SingleInterestTargetingOptionResponse, Error, void* )
	, void* userData);

/*! \brief Get interest details. *Asynchronous*
 *
 * <p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>
 * \param interestId Unique identifier of an interest. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool interestTargetingOptionsGetAsync(char * accessToken,
	std::string interestId, 
	void(* handler)(SingleInterestTargetingOptionResponse, Error, void* )
	, void* userData);


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
	void(* handler)(BookClosedResponse, Error, void* )
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
	void(* handler)(BookClosedResponse, Error, void* )
	, void* userData);


/*! \brief Get targeting options. *Synchronous*
 *
 * <p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>
 * \param targetingType Public targeting type. *Required*
 * \param clientId Client ID.
 * \param oauthSignature Oauth signature
 * \param timestamp Timestamp
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool targetingOptionsGetSync(char * accessToken,
	std::string targetingType, std::string clientId, std::string oauthSignature, std::string timestamp, 
	void(* handler)(std::list<std::string>, Error, void* )
	, void* userData);

/*! \brief Get targeting options. *Asynchronous*
 *
 * <p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>
 * \param targetingType Public targeting type. *Required*
 * \param clientId Client ID.
 * \param oauthSignature Oauth signature
 * \param timestamp Timestamp
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool targetingOptionsGetAsync(char * accessToken,
	std::string targetingType, std::string clientId, std::string oauthSignature, std::string timestamp, 
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
