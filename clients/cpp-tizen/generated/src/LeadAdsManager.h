#ifndef _LeadAdsManager_H_
#define _LeadAdsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AdAccountCreateSubscriptionRequest.h"
#include "AdAccountCreateSubscriptionResponse.h"
#include "AdAccountGetSubscriptionResponse.h"
#include "Ad_accounts_subscriptions_get_list_200_response.h"
#include "Error.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup LeadAds LeadAds
 * \ingroup Operations
 *  @{
 */
class LeadAdsManager {
public:
	LeadAdsManager();
	virtual ~LeadAdsManager();

/*! \brief Delete lead ads subscription. *Synchronous*
 *
 * Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param subscriptionId Unique identifier of a subscription. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adAccountsSubscriptionsDelByIdSync(char * accessToken,
	std::string adAccountId, std::string subscriptionId, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Delete lead ads subscription. *Asynchronous*
 *
 * Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param subscriptionId Unique identifier of a subscription. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adAccountsSubscriptionsDelByIdAsync(char * accessToken,
	std::string adAccountId, std::string subscriptionId, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get lead ads subscription. *Synchronous*
 *
 * Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param subscriptionId Unique identifier of a subscription. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adAccountsSubscriptionsGetByIdSync(char * accessToken,
	std::string adAccountId, std::string subscriptionId, 
	void(* handler)(AdAccountGetSubscriptionResponse, Error, void* )
	, void* userData);

/*! \brief Get lead ads subscription. *Asynchronous*
 *
 * Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param subscriptionId Unique identifier of a subscription. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adAccountsSubscriptionsGetByIdAsync(char * accessToken,
	std::string adAccountId, std::string subscriptionId, 
	void(* handler)(AdAccountGetSubscriptionResponse, Error, void* )
	, void* userData);


/*! \brief Get lead ads subscriptions. *Synchronous*
 *
 * Get the advertiser's list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adAccountsSubscriptionsGetListSync(char * accessToken,
	std::string adAccountId, int pageSize, std::string bookmark, 
	void(* handler)(Ad_accounts_subscriptions_get_list_200_response, Error, void* )
	, void* userData);

/*! \brief Get lead ads subscriptions. *Asynchronous*
 *
 * Get the advertiser's list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adAccountsSubscriptionsGetListAsync(char * accessToken,
	std::string adAccountId, int pageSize, std::string bookmark, 
	void(* handler)(Ad_accounts_subscriptions_get_list_200_response, Error, void* )
	, void* userData);


/*! \brief Create lead ads subscription. *Synchronous*
 *
 * Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adAccountCreateSubscriptionRequest Subscription to create. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adAccountsSubscriptionsPostSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdAccountCreateSubscriptionRequest> adAccountCreateSubscriptionRequest, 
	void(* handler)(AdAccountCreateSubscriptionResponse, Error, void* )
	, void* userData);

/*! \brief Create lead ads subscription. *Asynchronous*
 *
 * Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adAccountCreateSubscriptionRequest Subscription to create. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adAccountsSubscriptionsPostAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdAccountCreateSubscriptionRequest> adAccountCreateSubscriptionRequest, 
	void(* handler)(AdAccountCreateSubscriptionResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* LeadAdsManager_H_ */
