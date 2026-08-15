#ifndef TINY_CPP_CLIENT_AdGroupsApi_H_
#define TINY_CPP_CLIENT_AdGroupsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AdGroupArrayResponse.h"
#include "AdGroupAudienceSizingRequest.h"
#include "AdGroupAudienceSizingResponse.h"
#include "AdGroupCreateRequest.h"
#include "AdGroupResponse.h"
#include "AdGroupUpdateRequest.h"
#include "AdGroupsAnalyticsResponse_inner.h"
#include "Ad_groups_list_200_response.h"
#include "AdsAnalyticsAdGroupTargetingType.h"
#include "BidFloor.h"
#include "BidFloorRequest.h"
#include "ConversionReportAttributionType.h"
#include "Date.h"
#include "Error.h"
#include "Granularity.h"
#include "MetricsResponse.h"
#include "ReportingTimeZone.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class AdGroupsApi : public Service {
public:
    AdGroupsApi() = default;

    virtual ~AdGroupsApi() = default;

    /**
    * Get bid floors.
    *
    * List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bidFloorRequest Parameters to get bid_floor info *Required*
    */
    Response<
                BidFloor
        >
    adGroupsBidFloor_get(
            
            std::string adAccountId
            , 
            
            BidFloorRequest bidFloorRequest
            
    );
    /**
    * Get targeting analytics for ad groups.
    *
    * Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adGroupIds List of Ad group Ids to use to filter the results. *Required*
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
    * \param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\", \"CREATIVE_ENHANCEMENTS\"] are in BETA and not yet available to all users. *Required*
    * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned *Required*
    * \param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly *Required*
    * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.
    * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
    * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    * \param attributionTypes List of types of attribution for the conversion report
    * \param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    */
    Response<
                MetricsResponse
        >
    adGroupsTargetingAnalytics_get(
            
            std::string adAccountId
            , 
            std::list<std::string> adGroupIds
            
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<AdsAnalyticsAdGroupTargetingType> targetingTypes
            
            , 
            std::list<std::string> columns
            
            , 
            
            Granularity granularity
            , 
            
            int clickWindowDays
            , 
            
            int engagementWindowDays
            , 
            
            int viewWindowDays
            , 
            
            std::string conversionReportTime
            , 
            std::list<ConversionReportAttributionType> attributionTypes
            
            , 
            
            ReportingTimeZone reportingTimezone
            
    );
    /**
    * Get ad group analytics.
    *
    * Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
    * \param adGroupIds List of Ad group Ids to use to filter the results. *Required*
    * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned *Required*
    * \param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly *Required*
    * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.
    * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
    * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    * \param aggregateReportRows Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
    * \param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    */
    Response<
                    std::list<AdGroupsAnalyticsResponse_inner>
        >
    adGroups_analytics(
            
            std::string adAccountId
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<std::string> adGroupIds
            
            , 
            std::list<std::string> columns
            
            , 
            
            Granularity granularity
            , 
            
            int clickWindowDays
            , 
            
            int engagementWindowDays
            , 
            
            int viewWindowDays
            , 
            
            std::string conversionReportTime
            , 
            
            bool aggregateReportRows
            , 
            
            ReportingTimeZone reportingTimezone
            
    );
    /**
    * Get audience sizing.
    *
    * Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adGroupAudienceSizingRequest  *Required*
    */
    Response<
                AdGroupAudienceSizingResponse
        >
    adGroups_audienceSizing(
            
            std::string adAccountId
            , 
            
            AdGroupAudienceSizingRequest adGroupAudienceSizingRequest
            
    );
    /**
    * Create ad groups.
    *
    * Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>. <strong>Notes:</strong> - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">closed beta</a> access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule. 
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adGroupCreateRequest List of ad groups to create, size limit [1, 30]. *Required*
    */
    Response<
                AdGroupArrayResponse
        >
    adGroups_create(
            
            std::string adAccountId
            , 
            std::list<AdGroupCreateRequest> adGroupCreateRequest
            
            
    );
    /**
    * Get ad group.
    *
    * Get a specific ad group given the ad group ID.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adGroupId Unique identifier of an ad group. *Required*
    */
    Response<
                AdGroupResponse
        >
    adGroups_get(
            
            std::string adAccountId
            , 
            
            std::string adGroupId
            
    );
    /**
    * List ad groups.
    *
    * List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param campaignIds List of Campaign Ids to use to filter the results.
    * \param adGroupIds List of Ad group Ids to use to filter the results.
    * \param entityStatuses Entity status
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param bookmark Cursor used to fetch the next page of items
    * \param translateInterestsToNames Return interests as text names (if value is true) rather than topic IDs.
    */
    Response<
                Ad_groups_list_200_response
        >
    adGroups_list(
            
            std::string adAccountId
            , 
            std::list<std::string> campaignIds
            
            , 
            std::list<std::string> adGroupIds
            
            , 
            std::list<std::string> entityStatuses
            
            , 
            
            int pageSize
            , 
            
            std::string order
            , 
            
            std::string bookmark
            , 
            
            bool translateInterestsToNames
            
    );
    /**
    * Update ad groups.
    *
    * Update multiple existing ad groups.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adGroupUpdateRequest List of ad groups to update, size limit [1, 30]. *Required*
    */
    Response<
                AdGroupArrayResponse
        >
    adGroups_update(
            
            std::string adAccountId
            , 
            std::list<AdGroupUpdateRequest> adGroupUpdateRequest
            
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_AdGroupsApi_H_ */