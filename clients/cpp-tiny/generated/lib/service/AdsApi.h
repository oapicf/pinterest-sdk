#ifndef TINY_CPP_CLIENT_AdsApi_H_
#define TINY_CPP_CLIENT_AdsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AdArrayResponse.h"
#include "AdCreateRequest.h"
#include "AdPreviewRequest.h"
#include "AdPreviewURLResponse.h"
#include "AdResponse.h"
#include "AdUpdateRequest.h"
#include "AdsAnalyticsAdTargetingType.h"
#include "AdsAnalyticsResponse_inner.h"
#include "Ads_list_200_response.h"
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

class AdsApi : public Service {
public:
    AdsApi() = default;

    virtual ~AdsApi() = default;

    /**
    * Create ad preview with pin or image.
    *
    * Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.  Creating ad preview from catalog product group is currently in BETA and is not available to all users.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adPreviewRequest Create ad preview with pin or image. *Required*
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
    * Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adIds List of Ad Ids to use to filter the results. *Required*
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
    * \param targetingTypes Targeting type breakdowns for the report. The reporting per targeting type <br> is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. *Required*
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
    * Get ad analytics.
    *
    * Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - The request must contain either ad_ids or both campaign_ids and pin_ids. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
    * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned *Required*
    * \param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly *Required*
    * \param adIds List of Ad Ids to use to filter the results.
    * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.<br> <strong>Note:</strong> This parameter no longer returns new data. However, you can still access historic data through <strong>Sept 30, 2027</strong>.
    * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
    * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    * \param pinIds List of Pin IDs.
    * \param campaignIds List of Campaign Ids to use to filter the results.
    * \param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    */
    Response<
                    std::list<AdsAnalyticsResponse_inner>
        >
    ads_analytics(
            
            std::string adAccountId
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<std::string> columns
            
            , 
            
            Granularity granularity
            , 
            std::list<std::string> adIds
            
            , 
            
            int clickWindowDays
            , 
            
            int engagementWindowDays
            , 
            
            int viewWindowDays
            , 
            
            std::string conversionReportTime
            , 
            std::list<std::string> pinIds
            
            , 
            std::list<std::string> campaignIds
            
            , 
            
            ReportingTimeZone reportingTimezone
            
    );
    /**
    * Create ads.
    *
    * Create multiple new ads. Request must contain `ad_group_id`, `creative_type`, and the source Pin `pin_id`.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adCreateRequest List of ads to create, size limit [1, 30]. *Required*
    */
    Response<
                AdArrayResponse
        >
    ads_create(
            
            std::string adAccountId
            , 
            std::list<AdCreateRequest> adCreateRequest
            
            
    );
    /**
    * Get ad.
    *
    * Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adId Unique identifier of an ad. *Required*
    */
    Response<
                AdResponse
        >
    ads_get(
            
            std::string adAccountId
            , 
            
            std::string adId
            
    );
    /**
    * List ads.
    *
    * List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param campaignIds List of Campaign Ids to use to filter the results.
    * \param adGroupIds List of Ad group Ids to use to filter the results.
    * \param adIds List of Ad Ids to use to filter the results.
    * \param entityStatuses Entity status
    * \param pageSize Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
    * \param order The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
    * \param bookmark Cursor used to fetch the next page of items
    */
    Response<
                Ads_list_200_response
        >
    ads_list(
            
            std::string adAccountId
            , 
            std::list<std::string> campaignIds
            
            , 
            std::list<std::string> adGroupIds
            
            , 
            std::list<std::string> adIds
            
            , 
            std::list<std::string> entityStatuses
            
            , 
            
            int pageSize
            , 
            
            std::string order
            , 
            
            std::string bookmark
            
    );
    /**
    * Update ads.
    *
    * Update multiple existing ads
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adUpdateRequest List of ads to update, size limit [1, 30] *Required*
    */
    Response<
                AdArrayResponse
        >
    ads_update(
            
            std::string adAccountId
            , 
            std::list<AdUpdateRequest> adUpdateRequest
            
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_AdsApi_H_ */