#ifndef TINY_CPP_CLIENT_AdsApi_H_
#define TINY_CPP_CLIENT_AdsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "Ad.h"
#include "AdBatchUpdate.h"
#include "AdBatchWriteResponseModel.h"
#include "AdCreate.h"
#include "AdPreviewRequest.h"
#include "AdPreviewURLResponse.h"
#include "AdsAnalytics.h"
#include "AdsAnalyticsAdTargetingType.h"
#include "Ads_list_200_response.h"
#include "CampaignAdPreview.h"
#include "CampaignAdPreviewCreate.h"
#include "Campaign_ad_preview_create_200_response_inner.h"
#include "Campaign_ad_preview_delete_200_response_inner.h"
#include "ConversionAttributionWindowDays.h"
#include "ConversionReportAttributionType.h"
#include "ConversionReportTimeType.h"
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

class AdsApi : public Service {
public:
    AdsApi() = default;

    virtual ~AdsApi();

    /**
    * Create ad preview with pin or image.
    *
    * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.  If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)  You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adPreviewRequest  *Required*
    */
    Response<
                AdPreviewURLResponse
        >
    adPreviews_create(
            
            std::string adAccountId
            , 
            
            AdPreviewRequest adPreviewRequest
            
    );
    /**
    * Get targeting analytics for ads.
    *
    * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adIds List of Ad Ids to use to filter the results. *Required*
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
    * \param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. *Required*
    * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. *Required*
    * \param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly *Required*
    * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
    * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    * \param attributionTypes List of types of attribution for the conversion report
    * \param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    * \param sortColumns Sort Columns.
    * \param sortAscending Sort ascending.
    */
    Response<
                MetricsResponse
        >
    adTargetingAnalytics_get(
            
            std::string adAccountId
            , 
            std::list<std::string> adIds
            
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<AdsAnalyticsAdTargetingType> targetingTypes
            
            , 
            std::list<ReportingColumnSync> columns
            
            , 
            
            Granularity granularity
            , 
            
            ConversionAttributionWindowDays clickWindowDays
            , 
            
            ConversionAttributionWindowDays engagementWindowDays
            , 
            
            ConversionAttributionWindowDays viewWindowDays
            , 
            
            ConversionReportTimeType conversionReportTime
            , 
            std::list<ConversionReportAttributionType> attributionTypes
            
            , 
            
            ReportingTimeZone reportingTimezone
            , 
            std::list<std::string> sortColumns
            
            , 
            
            bool sortAscending
            
    );
    /**
    * Get ad analytics.
    *
    *     Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.     - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.     - The request must contain either ad_ids or both campaign_ids and pin_ids.     - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.     - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
    * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. *Required*
    * \param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param pinIds List of Pin IDs.
    * \param adIds List of Ad Ids to use to filter the results.
    * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
    * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    * \param campaignIds List of Campaign Ids to use to filter the results.
    * \param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    */
    Response<
                    std::list<AdsAnalytics>
        >
    ads_analytics(
            
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
            std::list<std::string> pinIds
            
            , 
            std::list<std::string> adIds
            
            , 
            
            long clickWindowDays
            , 
            
            long engagementWindowDays
            , 
            
            long viewWindowDays
            , 
            
            std::string conversionReportTime
            , 
            std::list<std::string> campaignIds
            
            , 
            
            ReportingTimeZone reportingTimezone
            
    );
    /**
    * Create ads.
    *
    * Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adCreate  *Required*
    */
    Response<
                AdBatchWriteResponseModel
        >
    ads_create(
            
            std::string adAccountId
            , 
            std::list<AdCreate> adCreate
            
            
    );
    /**
    * Get ad.
    *
    * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).
    * \param adId The ID of this ad. *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                Ad
        >
    ads_get(
            
            std::string adId
            , 
            
            std::string adAccountId
            
    );
    /**
    * List ads.
    *
    * List ads that meet the filters provided:     - Listed campaign ids or ad group ids or ad ids     - Listed entity statuses  If no filter is provided, all ads in the ad account are returned.  **Note:** Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.  Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.  For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param campaignIds List of Campaign Ids to use to filter the results.
    * \param adGroupIds List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users.
    * \param adIds List of Ad Ids to use to filter the results.
    * \param entityStatuses Entity status
    */
    Response<
                Ads_list_200_response
        >
    ads_list(
            
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
            std::list<std::string> adGroupIds
            
            , 
            std::list<std::string> adIds
            
            , 
            std::list<EntityStatus> entityStatuses
            
            
    );
    /**
    * Update ads.
    *
    * Update multiple existing ads
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adBatchUpdate  *Required*
    */
    Response<
                AdBatchWriteResponseModel
        >
    ads_update(
            
            std::string adAccountId
            , 
            std::list<AdBatchUpdate> adBatchUpdate
            
            
    );
    /**
    * Create ad preview records for one or more ad groups.
    *
    * Create ad preview records for one or more ad groups that can be shared. Each ad group is processed independently; individual failures do not block other previews.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param campaignAdPreviewCreate  *Required*
    */
    Response<
                    std::list<Campaign_ad_preview_create_200_response_inner>
        >
    campaignAdPreview_create(
            
            std::string adAccountId
            , 
            std::list<CampaignAdPreviewCreate> campaignAdPreviewCreate
            
            
    );
    /**
    * Delete ad preview records for one or more ad groups.
    *
    * Delete ad preview records for one or more ad groups. All ad groups are validated before deleting any records.
    * \param adGroupIds List of Ad group Ids to use to filter the results. *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                    std::list<Campaign_ad_preview_delete_200_response_inner>
        >
    campaignAdPreview_delete(
            std::list<std::string> adGroupIds
            
            , 
            
            std::string adAccountId
            
    );
    /**
    * Fetch ad preview records for one or more ad groups.
    *
    * Fetch ad preview records for one or more ad groups. Returns all active previews associated with the provided ad group IDs.
    * \param adGroupIds List of Ad group Ids to use to filter the results. *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                    std::list<CampaignAdPreview>
        >
    campaignAdPreview_read(
            std::list<std::string> adGroupIds
            
            , 
            
            std::string adAccountId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_AdsApi_H_ */