#ifndef TINY_CPP_CLIENT_CampaignsApi_H_
#define TINY_CPP_CLIENT_CampaignsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AdPinAnalytics.h"
#include "AdsAnalyticsCampaignTargetingType.h"
#include "Campaign.h"
#include "CampaignBatchUpdateItem.h"
#include "CampaignBatchWriteResponseModel.h"
#include "CampaignCreateItem.h"
#include "CampaignDeliveryEstimatesCampaign.h"
#include "CampaignDeliveryEstimatesResponse.h"
#include "CampaignsAnalyticsMetrics.h"
#include "Campaigns_list_200_response.h"
#include "ConversionReportAttributionType.h"
#include "Date.h"
#include "EntityStatus.h"
#include "Granularity.h"
#include "MetricsResponse.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include "ReportingColumnSync.h"
#include "ReportingTimeZone.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class CampaignsApi : public Service {
public:
    CampaignsApi() = default;

    virtual ~CampaignsApi();

    /**
    * Get pins analytics.
    *
    * Get analytics for the pins given a campaign and pins in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.
    * \param campaignId Campaign Id to use to filter the results. *Required*
    * \param pinIds List of Pin IDs. *Required*
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
    * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. *Required*
    * \param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
    * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    */
    Response<
                    std::list<AdPinAnalytics>
        >
    adPins_analytics(
            
            std::string campaignId
            , 
            std::list<std::string> pinIds
            
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<ReportingColumnSync> columns
            
            , 
            
            Granularity granularity
            , 
            
            std::string adAccountId
            , 
            
            long clickWindowDays
            , 
            
            long engagementWindowDays
            , 
            
            long viewWindowDays
            , 
            
            std::string conversionReportTime
            
    );
    /**
    * Get targeting analytics for campaigns.
    *
    * Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param campaignIds List of Campaign Ids to use to filter the results. *Required*
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
    * \param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. *Required*
    * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. *Required*
    * \param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly *Required*
    * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
    * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    * \param attributionTypes List of types of attribution for the conversion report
    * \param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    */
    Response<
                MetricsResponse
        >
    campaignTargetingAnalytics_get(
            
            std::string adAccountId
            , 
            std::list<std::string> campaignIds
            
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<AdsAnalyticsCampaignTargetingType> targetingTypes
            
            , 
            std::list<ReportingColumnSync> columns
            
            , 
            
            Granularity granularity
            , 
            
            long clickWindowDays
            , 
            
            long engagementWindowDays
            , 
            
            long viewWindowDays
            , 
            
            std::string conversionReportTime
            , 
            std::list<ConversionReportAttributionType> attributionTypes
            
            , 
            
            ReportingTimeZone reportingTimezone
            
    );
    /**
    * Get campaign analytics.
    *
    * Get analytics for the specified campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
    * \param campaignIds List of Campaign Ids to use to filter the results. *Required*
    * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. *Required*
    * \param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
    * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    * \param aggregateReportRows Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
    * \param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    */
    Response<
                    std::list<CampaignsAnalyticsMetrics>
        >
    campaigns_analytics(
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<std::string> campaignIds
            
            , 
            std::list<ReportingColumnSync> columns
            
            , 
            
            Granularity granularity
            , 
            
            std::string adAccountId
            , 
            
            long clickWindowDays
            , 
            
            long engagementWindowDays
            , 
            
            long viewWindowDays
            , 
            
            std::string conversionReportTime
            , 
            
            bool aggregateReportRows
            , 
            
            ReportingTimeZone reportingTimezone
            
    );
    /**
    * Create campaigns.
    *
    * Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param campaignCreateItem  *Required*
    */
    Response<
                CampaignBatchWriteResponseModel
        >
    campaigns_create(
            
            std::string adAccountId
            , 
            std::list<CampaignCreateItem> campaignCreateItem
            
            
    );
    /**
    * Get campaign.
    *
    * Get a specific campaign given the campaign ID.
    * \param campaignId Campaign ID, must be associated with the ad account ID provided in the path. *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                Campaign
        >
    campaigns_get(
            
            std::string campaignId
            , 
            
            std::string adAccountId
            
    );
    /**
    * List campaigns.
    *
    * Get a list of the campaigns in the specified `ad_account_id`, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param campaignIds List of Campaign Ids to use to filter the results.
    * \param entityStatuses Entity status
    */
    Response<
                Campaigns_list_200_response
        >
    campaigns_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            , 
            std::list<std::string> campaignIds
            
            , 
            std::list<EntityStatus> entityStatuses
            
            
    );
    /**
    * Update campaigns.
    *
    * Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for `lifetime_spend_cap` and `daily_spend_cap` are microcurrency amounts based on the currency field set in the advertiser's profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param campaignBatchUpdateItem  *Required*
    */
    Response<
                CampaignBatchWriteResponseModel
        >
    campaigns_update(
            
            std::string adAccountId
            , 
            std::list<CampaignBatchUpdateItem> campaignBatchUpdateItem
            
            
    );
    /**
    * Get campaign delivery estimates.
    *
    * Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param campaignDeliveryEstimatesCampaign  *Required*
    */
    Response<
                CampaignDeliveryEstimatesResponse
        >
    getCampaignDeliveryEstimates(
            
            std::string adAccountId
            , 
            std::list<CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign
            
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_CampaignsApi_H_ */