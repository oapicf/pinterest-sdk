#ifndef _AdGroupsManager_H_
#define _AdGroupsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AdGroup.h"
#include "AdGroupAudienceSizing.h"
#include "AdGroupAudienceSizingCreate.h"
#include "AdGroupCreateCreate.h"
#include "AdGroupUpdateBatchUpdate.h"
#include "AdGroupsAnalyticsMetrics.h"
#include "Ad_groups_create_200_response.h"
#include "Ad_groups_list_200_response.h"
#include "AdsAnalyticsAdGroupTargetingType.h"
#include "BidFloor.h"
#include "BidFloorCreate.h"
#include "ConversionReportAttributionType.h"
#include "Date.h"
#include "DynamicTitlesDownloadCSV.h"
#include "DynamicTitlesGetStatus.h"
#include "DynamicTitlesProcessCSV.h"
#include "DynamicTitlesProcessCSVCreate.h"
#include "DynamicTitlesUploadURL.h"
#include "EntityStatus.h"
#include "Granularity.h"
#include "MetricsResponse.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include "ReportingColumnSync.h"
#include "ReportingTimeZone.h"
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
 * Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
 * \param adGroupIds List of Ad group Ids to use to filter the results. *Required*
 * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. *Required*
 * \param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
 * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * \param aggregateReportRows Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
 * \param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsAnalyticsSync(char * accessToken,
	Date startDate, Date endDate, std::list<std::string> adGroupIds, std::list<ReportingColumnSync> columns, Granularity granularity, std::string adAccountId, long long clickWindowDays, long long engagementWindowDays, long long viewWindowDays, std::string conversionReportTime, bool aggregateReportRows, ReportingTimeZone reportingTimezone, 
	void(* handler)(std::list<AdGroupsAnalyticsMetrics>, Error, void* )
	, void* userData);

/*! \brief Get ad group analytics. *Asynchronous*
 *
 * Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
 * \param adGroupIds List of Ad group Ids to use to filter the results. *Required*
 * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. *Required*
 * \param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
 * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * \param aggregateReportRows Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
 * \param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsAnalyticsAsync(char * accessToken,
	Date startDate, Date endDate, std::list<std::string> adGroupIds, std::list<ReportingColumnSync> columns, Granularity granularity, std::string adAccountId, long long clickWindowDays, long long engagementWindowDays, long long viewWindowDays, std::string conversionReportTime, bool aggregateReportRows, ReportingTimeZone reportingTimezone, 
	void(* handler)(std::list<AdGroupsAnalyticsMetrics>, Error, void* )
	, void* userData);


/*! \brief Get audience sizing. *Synchronous*
 *
 * Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupAudienceSizingCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsAudienceSizingSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdGroupAudienceSizingCreate> adGroupAudienceSizingCreate, 
	void(* handler)(AdGroupAudienceSizing, Error, void* )
	, void* userData);

/*! \brief Get audience sizing. *Asynchronous*
 *
 * Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupAudienceSizingCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsAudienceSizingAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<AdGroupAudienceSizingCreate> adGroupAudienceSizingCreate, 
	void(* handler)(AdGroupAudienceSizing, Error, void* )
	, void* userData);


/*! \brief Get bid floors. *Synchronous*
 *
 * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bidFloorCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsBidFloorGetSync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BidFloorCreate> bidFloorCreate, 
	void(* handler)(BidFloor, Error, void* )
	, void* userData);

/*! \brief Get bid floors. *Asynchronous*
 *
 * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bidFloorCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsBidFloorGetAsync(char * accessToken,
	std::string adAccountId, std::shared_ptr<BidFloorCreate> bidFloorCreate, 
	void(* handler)(BidFloor, Error, void* )
	, void* userData);


/*! \brief Create ad groups. *Synchronous*
 *
 * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupCreateCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsCreateSync(char * accessToken,
	std::string adAccountId, std::list<AdGroupCreateCreate> adGroupCreateCreate, 
	void(* handler)(Ad_groups_create_200_response, Error, void* )
	, void* userData);

/*! \brief Create ad groups. *Asynchronous*
 *
 * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupCreateCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsCreateAsync(char * accessToken,
	std::string adAccountId, std::list<AdGroupCreateCreate> adGroupCreateCreate, 
	void(* handler)(Ad_groups_create_200_response, Error, void* )
	, void* userData);


/*! \brief Get dynamic titles CSV download URL. *Synchronous*
 *
 * Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupId Ad group ID. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsDynamicTitlesDownloadCsvSync(char * accessToken,
	std::string adAccountId, std::string adGroupId, 
	void(* handler)(DynamicTitlesDownloadCSV, Error, void* )
	, void* userData);

/*! \brief Get dynamic titles CSV download URL. *Asynchronous*
 *
 * Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupId Ad group ID. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsDynamicTitlesDownloadCsvAsync(char * accessToken,
	std::string adAccountId, std::string adGroupId, 
	void(* handler)(DynamicTitlesDownloadCSV, Error, void* )
	, void* userData);


/*! \brief Get dynamic titles status. *Synchronous*
 *
 * Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupId Ad group ID. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsDynamicTitlesGetStatusSync(char * accessToken,
	std::string adAccountId, std::string adGroupId, 
	void(* handler)(DynamicTitlesGetStatus, Error, void* )
	, void* userData);

/*! \brief Get dynamic titles status. *Asynchronous*
 *
 * Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupId Ad group ID. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsDynamicTitlesGetStatusAsync(char * accessToken,
	std::string adAccountId, std::string adGroupId, 
	void(* handler)(DynamicTitlesGetStatus, Error, void* )
	, void* userData);


/*! \brief Get dynamic titles upload URL. *Synchronous*
 *
 * Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupId Ad group ID. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsDynamicTitlesGetUploadUrlSync(char * accessToken,
	std::string adAccountId, std::string adGroupId, 
	void(* handler)(DynamicTitlesUploadURL, Error, void* )
	, void* userData);

/*! \brief Get dynamic titles upload URL. *Asynchronous*
 *
 * Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupId Ad group ID. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsDynamicTitlesGetUploadUrlAsync(char * accessToken,
	std::string adAccountId, std::string adGroupId, 
	void(* handler)(DynamicTitlesUploadURL, Error, void* )
	, void* userData);


/*! \brief Process dynamic titles CSV. *Synchronous*
 *
 * Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupId Ad group ID. *Required*
 * \param dynamicTitlesProcessCSVCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsDynamicTitlesProcessCsvSync(char * accessToken,
	std::string adAccountId, std::string adGroupId, std::shared_ptr<DynamicTitlesProcessCSVCreate> dynamicTitlesProcessCSVCreate, 
	void(* handler)(DynamicTitlesProcessCSV, Error, void* )
	, void* userData);

/*! \brief Process dynamic titles CSV. *Asynchronous*
 *
 * Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupId Ad group ID. *Required*
 * \param dynamicTitlesProcessCSVCreate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsDynamicTitlesProcessCsvAsync(char * accessToken,
	std::string adAccountId, std::string adGroupId, std::shared_ptr<DynamicTitlesProcessCSVCreate> dynamicTitlesProcessCSVCreate, 
	void(* handler)(DynamicTitlesProcessCSV, Error, void* )
	, void* userData);


/*! \brief Get ad group. *Synchronous*
 *
 * Get a specific ad group given the ad group ID.
 * \param adGroupId Ad group ID. *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsGetSync(char * accessToken,
	std::string adGroupId, std::string adAccountId, 
	void(* handler)(AdGroup, Error, void* )
	, void* userData);

/*! \brief Get ad group. *Asynchronous*
 *
 * Get a specific ad group given the ad group ID.
 * \param adGroupId Ad group ID. *Required*
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsGetAsync(char * accessToken,
	std::string adGroupId, std::string adAccountId, 
	void(* handler)(AdGroup, Error, void* )
	, void* userData);


/*! \brief List ad groups. *Synchronous*
 *
 * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param campaignIds List of Campaign Ids to use to filter the results.
 * \param adGroupIds List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
 * \param entityStatuses Entity status
 * \param translateInterestsToNames Return interests as text names (if value is true) rather than topic IDs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsListSync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, std::list<std::string> campaignIds, std::list<std::string> adGroupIds, std::list<EntityStatus> entityStatuses, bool translateInterestsToNames, 
	void(* handler)(Ad_groups_list_200_response, Error, void* )
	, void* userData);

/*! \brief List ad groups. *Asynchronous*
 *
 * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param campaignIds List of Campaign Ids to use to filter the results.
 * \param adGroupIds List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
 * \param entityStatuses Entity status
 * \param translateInterestsToNames Return interests as text names (if value is true) rather than topic IDs.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsListAsync(char * accessToken,
	std::string adAccountId, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, std::list<std::string> campaignIds, std::list<std::string> adGroupIds, std::list<EntityStatus> entityStatuses, bool translateInterestsToNames, 
	void(* handler)(Ad_groups_list_200_response, Error, void* )
	, void* userData);


/*! \brief Get targeting analytics for ad groups. *Synchronous*
 *
 * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupIds List of Ad group Ids to use to filter the results. *Required*
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
 * \param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users. *Required*
 * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. *Required*
 * \param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly *Required*
 * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
 * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * \param attributionTypes List of types of attribution for the conversion report
 * \param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
 * \param sortColumns Sort Columns.
 * \param sortAscending Sort ascending.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsTargetingAnalyticsGetSync(char * accessToken,
	std::string adAccountId, std::list<std::string> adGroupIds, Date startDate, Date endDate, std::list<AdsAnalyticsAdGroupTargetingType> targetingTypes, std::list<ReportingColumnSync> columns, Granularity granularity, long long clickWindowDays, long long engagementWindowDays, long long viewWindowDays, std::string conversionReportTime, std::list<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone, std::list<std::string> sortColumns, bool sortAscending, 
	void(* handler)(MetricsResponse, Error, void* )
	, void* userData);

/*! \brief Get targeting analytics for ad groups. *Asynchronous*
 *
 * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupIds List of Ad group Ids to use to filter the results. *Required*
 * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
 * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
 * \param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users. *Required*
 * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. *Required*
 * \param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly *Required*
 * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
 * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * \param attributionTypes List of types of attribution for the conversion report
 * \param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
 * \param sortColumns Sort Columns.
 * \param sortAscending Sort ascending.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsTargetingAnalyticsGetAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> adGroupIds, Date startDate, Date endDate, std::list<AdsAnalyticsAdGroupTargetingType> targetingTypes, std::list<ReportingColumnSync> columns, Granularity granularity, long long clickWindowDays, long long engagementWindowDays, long long viewWindowDays, std::string conversionReportTime, std::list<ConversionReportAttributionType> attributionTypes, ReportingTimeZone reportingTimezone, std::list<std::string> sortColumns, bool sortAscending, 
	void(* handler)(MetricsResponse, Error, void* )
	, void* userData);


/*! \brief Update ad groups. *Synchronous*
 *
 * Update multiple existing ad groups.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupUpdateBatchUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsUpdateSync(char * accessToken,
	std::string adAccountId, std::list<AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate, 
	void(* handler)(Ad_groups_create_200_response, Error, void* )
	, void* userData);

/*! \brief Update ad groups. *Asynchronous*
 *
 * Update multiple existing ad groups.
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param adGroupUpdateBatchUpdate  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool adGroupsUpdateAsync(char * accessToken,
	std::string adAccountId, std::list<AdGroupUpdateBatchUpdate> adGroupUpdateBatchUpdate, 
	void(* handler)(Ad_groups_create_200_response, Error, void* )
	, void* userData);


/*! \brief List of ad groups using promotions IDs.. *Synchronous*
 *
 *   Get a list of ad groups that are associated with those promotion ids
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param promotionIds List of Promotion IDs to use to filter the results. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAdGroupsByPromotionIdsListSync(char * accessToken,
	std::string adAccountId, std::list<std::string> promotionIds, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, 
	void(* handler)(Ad_groups_list_200_response, Error, void* )
	, void* userData);

/*! \brief List of ad groups using promotions IDs.. *Asynchronous*
 *
 *   Get a list of ad groups that are associated with those promotion ids
 * \param adAccountId Unique identifier of an ad account. *Required*
 * \param promotionIds List of Promotion IDs to use to filter the results. *Required*
 * \param bookmark Cursor used to fetch the next page of items
 * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
 * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getAdGroupsByPromotionIdsListAsync(char * accessToken,
	std::string adAccountId, std::list<std::string> promotionIds, std::string bookmark, int pageSize, Pinterest.Lib.PaginationOrder order, 
	void(* handler)(Ad_groups_list_200_response, Error, void* )
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
