#ifndef _AdGroupsManager_H_
#define _AdGroupsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AdGroupArrayResponse.h"
#include "AdGroupCreateRequest.h"
#include "AdGroupResponse.h"
#include "AdGroupUpdateRequest.h"
#include "Ad_groups_list_200_response.h"
#include "BidFloor.h"
#include "BidFloorRequest.h"
#include "Error.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup AdGroups AdGroups
 * \ingroup Operations
 *  @{
 */
class AdGroupsManager {
public:
	AdGroupsManager();
	virtual ~AdGroupsManager();

/*! \brief Get bid floors. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> Microcurrency is used to track very small transactions, based on the currency field set in the advertiser's profile. A microcurrency unit is one one-millionth of the standard unit of currency selected in the advertiser's profile (e.g. a microdollar is $0.000001.) <p/> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bidFloorRequest Parameters to get bid_floor info *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsBidFloorGetSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BidFloorRequest> bidFloorRequest, 
	void(* handler)(BidFloor, Error, void* )
	, void* userData);

/*! \brief Get bid floors. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> Microcurrency is used to track very small transactions, based on the currency field set in the advertiser's profile. A microcurrency unit is one one-millionth of the standard unit of currency selected in the advertiser's profile (e.g. a microdollar is $0.000001.) <p/> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bidFloorRequest Parameters to get bid_floor info *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsBidFloorGetAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BidFloorRequest> bidFloorRequest, 
	void(* handler)(BidFloor, Error, void* )
	, void* userData);


/*! \brief Create ad groups. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile. Microcurrency is used to track very small transactions, based on the currency field set in the advertiser's profile. A microcurrency unit is one one-millionth of the standard unit of currency selected in the advertiser's profile (e.g. a microdollar is $0.000001.) - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupCreateRequest List of ad groups to create, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsCreateSync(char * accessToken,
	std::string adAccountId, std::list<AdGroupCreateRequest> adGroupCreateRequest, 
	void(* handler)(AdGroupArrayResponse, Error, void* )
	, void* userData);

/*! \brief Create ad groups. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile. Microcurrency is used to track very small transactions, based on the currency field set in the advertiser's profile. A microcurrency unit is one one-millionth of the standard unit of currency selected in the advertiser's profile (e.g. a microdollar is $0.000001.) - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupCreateRequest List of ad groups to create, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsCreateAsync(char * accessToken,
	std::string adAccountId, std::list<AdGroupCreateRequest> adGroupCreateRequest, 
	void(* handler)(AdGroupArrayResponse, Error, void* )
	, void* userData);


/*! \brief Get ad group. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupId Unique identifier of an ad group. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsGetSync(char * accessToken,
	std::string adAccountId, std::string adGroupId, 
	void(* handler)(AdGroupResponse, Error, void* )
	, void* userData);

/*! \brief Get ad group. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupId Unique identifier of an ad group. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsGetAsync(char * accessToken,
	std::string adAccountId, std::string adGroupId, 
	void(* handler)(AdGroupResponse, Error, void* )
	, void* userData);


/*! \brief List ad groups. *Synchronous*
 *
 * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignIds List of Campaign Ids to use to filter the results.
 * \param adGroupIds List of Ad group Ids to use to filter the results.
 * \param entityStatuses Entity status
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param translateInterestsToNames Return interests as text names (if value is true) rather than topic IDs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsListSync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> adGroupIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, bool translateInterestsToNames, 
	void(* handler)(Ad_groups_list_200_response, Error, void* )
	, void* userData);

/*! \brief List ad groups. *Asynchronous*
 *
 * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param campaignIds List of Campaign Ids to use to filter the results.
 * \param adGroupIds List of Ad group Ids to use to filter the results.
 * \param entityStatuses Entity status
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
 * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param bookmark Cursor used to fetch the next page of items
 * \param translateInterestsToNames Return interests as text names (if value is true) rather than topic IDs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsListAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> campaignIds, std::list<std::string> adGroupIds, std::list<std::string> entityStatuses, int pageSize, std::string order, std::string bookmark, bool translateInterestsToNames, 
	void(* handler)(Ad_groups_list_200_response, Error, void* )
	, void* userData);


/*! \brief Update ad groups. *Synchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Update multiple existing ad groups.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupUpdateRequest List of ad groups to update, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsUpdateSync(char * accessToken,
	std::string adAccountId, std::list<AdGroupUpdateRequest> adGroupUpdateRequest, 
	void(* handler)(AdGroupArrayResponse, Error, void* )
	, void* userData);

/*! \brief Update ad groups. *Asynchronous*
 *
 * <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/features/ads-management/'>Learn more</a>.</strong> <p/> Update multiple existing ad groups.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupUpdateRequest List of ad groups to update, size limit [1, 30]. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsUpdateAsync(char * accessToken,
	std::string adAccountId, std::list<AdGroupUpdateRequest> adGroupUpdateRequest, 
	void(* handler)(AdGroupArrayResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.pinterest.com/v5";
	}
};
/** @}*/

}
}
#endif /* AdGroupsManager_H_ */
