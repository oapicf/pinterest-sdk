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
#include "AdGroupsAnalyticsResponse_inner.h"
#include "Ad_groups_list_200_response.h"
#include "AdsAnalyticsTargetingType.h"
#include "BidFloor.h"
#include "BidFloorRequest.h"
#include "ConversionReportAttributionType.h"
#include "Date.h"
#include "Error.h"
#include "Granularity.h"
#include "MetricsResponse.h"
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

/*! \brief Get ad group analytics. *Synchronous*
 *
 * Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD *Required*
 * \param adGroupIds List of Ad group Ids to use to filter the results. *Required*
 * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned *Required*
 * \param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly *Required*
 * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsAnalyticsSync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> adGroupIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<AdGroupsAnalyticsResponse_inner>, Error, void* )
	, void* userData);

/*! \brief Get ad group analytics. *Asynchronous*
 *
 * Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD *Required*
 * \param adGroupIds List of Ad group Ids to use to filter the results. *Required*
 * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned *Required*
 * \param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly *Required*
 * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsAnalyticsAsync(char * accessToken,
	std::string adAccountId, Date startDate, Date endDate, std::list<std::string> adGroupIds, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, 
	void(* handler)(std::list<AdGroupsAnalyticsResponse_inner>, Error, void* )
	, void* userData);


/*! \brief Get bid floors. *Synchronous*
 *
 * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.
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
 * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.
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
 * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message.
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
 * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message.
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
 * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
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
 * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
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
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
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
 * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
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


/*! \brief Get targeting analytics for ad groups. *Synchronous*
 *
 * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupIds List of Ad group Ids to use to filter the results. *Required*
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD *Required*
 * \param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. *Required*
 * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned *Required*
 * \param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly *Required*
 * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * \param attributionTypes List of types of attribution for the conversion report
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsTargetingAnalyticsGetSync(char * accessToken,
	std::string adAccountId, std::list<std::string> adGroupIds, Date startDate, Date endDate, std::list<AdsAnalyticsTargetingType> targetingTypes, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, ConversionReportAttributionType attributionTypes, 
	void(* handler)(MetricsResponse, Error, void* )
	, void* userData);

/*! \brief Get targeting analytics for ad groups. *Asynchronous*
 *
 * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupIds List of Ad group Ids to use to filter the results. *Required*
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD *Required*
 * \param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. *Required*
 * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned *Required*
 * \param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly *Required*
 * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * \param attributionTypes List of types of attribution for the conversion report
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsTargetingAnalyticsGetAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> adGroupIds, Date startDate, Date endDate, std::list<AdsAnalyticsTargetingType> targetingTypes, std::list<std::string> columns, Granularity granularity, int clickWindowDays, int engagementWindowDays, int viewWindowDays, std::string conversionReportTime, ConversionReportAttributionType attributionTypes, 
	void(* handler)(MetricsResponse, Error, void* )
	, void* userData);


/*! \brief Update ad groups. *Synchronous*
 *
 * Update multiple existing ad groups.
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
 * Update multiple existing ad groups.
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
