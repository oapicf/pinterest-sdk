#ifndef _CampaignsManager_H_
#define _CampaignsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CampaignCreateRequest.h"
#include "CampaignCreateResponse.h"
#include "CampaignResponse.h"
#include "CampaignUpdateRequest.h"
#include "CampaignUpdateResponse.h"
#include "Campaigns_list_200_response.h"
#include "Error.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Campaigns Campaigns
 * \ingroup Operations
 *  @{
 */
class CampaignsManager {
public:
	CampaignsManager();
	virtual ~CampaignsManager();

/*! \brief Create campaigns. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> Microcurrency is used to track very small transactions, based on the currency field set in the advertiser's profile. A microcurrency unit is one one-millionth of the standard unit of currency selected in the advertiser's profile (e.g. a microdollar is $0.000001.)
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignCreateRequest Array of campaigns. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool campaignsCreateSync(char * accessToken,
	std::string adAccountId, std::list<CampaignCreateRequest> campaignCreateRequest, 
	void(* handler)(CampaignCreateResponse, Error, void* )
	, void* userData);

/*! \brief Create campaigns. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads. For more, see <a href=\"https://help.pinterest.com/en/business/article/set-up-your-campaign/\">Set up your campaign</a>. <p/> <strong>Note:</strong> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> Microcurrency is used to track very small transactions, based on the currency field set in the advertiser's profile. A microcurrency unit is one one-millionth of the standard unit of currency selected in the advertiser's profile (e.g. a microdollar is $0.000001.)
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignCreateRequest Array of campaigns. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool campaignsCreateAsync(char * accessToken,
	std::string adAccountId, std::list<CampaignCreateRequest> campaignCreateRequest, 
	void(* handler)(CampaignCreateResponse, Error, void* )
	, void* userData);


/*! \brief Get campaign. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Get a specific campaign given the campaign ID.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignId Campaign ID, must be associated with the ad account ID provided in the path. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool campaignsGetSync(char * accessToken,
	std::string adAccountId, std::string campaignId, 
	void(* handler)(CampaignResponse, Error, void* )
	, void* userData);

/*! \brief Get campaign. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Get a specific campaign given the campaign ID.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignId Campaign ID, must be associated with the ad account ID provided in the path. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool campaignsGetAsync(char * accessToken,
	std::string adAccountId, std::string campaignId, 
	void(* handler)(CampaignResponse, Error, void* )
	, void* userData);


/*! \brief List campaigns. *Synchronous*
 *
 * Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignIds List of Campaign Ids to use to filter the results.
 * \param entityStatuses Entity status
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool campaignsListSync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Campaigns_list_200_response, Error, void* )
	, void* userData);

/*! \brief List campaigns. *Asynchronous*
 *
 * Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignIds List of Campaign Ids to use to filter the results.
 * \param entityStatuses Entity status
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool campaignsListAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, 
	void(* handler)(Campaigns_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update campaigns. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> Microcurrency is used to track very small transactions, based on the currency field set in the advertiser's profile. A microcurrency unit is one one-millionth of the standard unit of currency selected in the advertiser's profile (e.g. a microdollar is $0.000001.)
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignUpdateRequest Array of campaigns. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool campaignsUpdateSync(char * accessToken,
	std::string adAccountId, std::list<CampaignUpdateRequest> campaignUpdateRequest, 
	void(* handler)(CampaignUpdateResponse, Error, void* )
	, void* userData);

/*! \brief Update campaigns. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Update multiple ad campaigns based on campaign_ids. <p/> <strong>Note:</strong><p/> - The values for 'lifetime_spend_cap' and 'daily_spend_cap' are microcurrency amounts based on the currency field set in the advertiser's profile. (e.g. USD) <p/> Microcurrency is used to track very small transactions, based on the currency field set in the advertiser's profile. A microcurrency unit is one one-millionth of the standard unit of currency selected in the advertiser's profile (e.g. a microdollar is $0.000001.)
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignUpdateRequest Array of campaigns. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool campaignsUpdateAsync(char * accessToken,
	std::string adAccountId, std::list<CampaignUpdateRequest> campaignUpdateRequest, 
	void(* handler)(CampaignUpdateResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* CampaignsManager_H_ */
