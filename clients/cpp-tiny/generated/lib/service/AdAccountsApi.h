#ifndef TINY_CPP_CLIENT_AdAccountsApi_H_
#define TINY_CPP_CLIENT_AdAccountsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "AdAccount.h"
#include "AdAccountAnalyticsItems.h"
#include "AdAccountCreate.h"
#include "Ad_accounts_list_200_response.h"
#include "AdsAnalyticsAccountTargetingType.h"
#include "AdsAnalyticsCreateAsyncRequest.h"
#include "AdsAnalyticsCreateAsyncResponse.h"
#include "AdsAnalyticsGetAsyncResponse.h"
#include "ConversionProductReport.h"
#include "ConversionProductReportCreate.h"
#include "ConversionReportAttributionType.h"
#include "Date.h"
#include "Granularity.h"
#include "MMMReport.h"
#include "MMMReportCreate.h"
#include "MetricsResponse.h"
#include "Pinterest.Lib.Error.h"
#include "Pinterest.Lib.PaginationOrder.h"
#include "ReportingColumnSync.h"
#include "ReportingTimeZone.h"
#include "TemplateBasedReport.h"
#include "Templates_list_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class AdAccountsApi : public Service {
public:
    AdAccountsApi() = default;

    virtual ~AdAccountsApi();

    /**
    * Get targeting analytics for an ad account.
    *
    * Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
    * \param adAccountId Unique identifier of an ad account. *Required*
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
    adAccountTargetingAnalytics_get(
            
            std::string adAccountId
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            std::list<AdsAnalyticsAccountTargetingType> targetingTypes
            
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
    * Get ad account analytics.
    *
    *   Get analytics for the specified `ad_account_id`, filtered by the specified options.    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. *Required*
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. *Required*
    * \param columns Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. *Required*
    * \param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly *Required*
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    * \param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
    * \param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
    * \param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    * \param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
    */
    Response<
                    std::list<AdAccountAnalyticsItems>
        >
    adAccount_analytics(
            
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
            , 
            
            ReportingTimeZone reportingTimezone
            
    );
    /**
    * Create ad account.
    *
    * Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).
    * \param adAccountCreate  *Required*
    */
    Response<
                AdAccount
        >
    adAccounts_create(
            
            AdAccountCreate adAccountCreate
            
    );
    /**
    * Get ad account.
    *
    * Get an ad account
    * \param adAccountId  *Required*
    */
    Response<
                AdAccount
        >
    adAccounts_get(
            
            std::string adAccountId
            
    );
    /**
    * List ad accounts.
    *
    * Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).
    * \param includeSharedAccounts Include shared ad accounts
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    */
    Response<
                Ad_accounts_list_200_response
        >
    adAccounts_list(
            
            bool includeSharedAccounts
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            
    );
    /**
    * Create a request for a brand, category, SKU report.
    *
    *   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param conversionProductReportCreate  *Required*
    */
    Response<
                ConversionProductReport
        >
    analytics_createConversionProductReport(
            
            std::string adAccountId
            , 
            
            ConversionProductReportCreate conversionProductReportCreate
            
    );
    /**
    * Create a request for a Marketing Mix Modeling (MMM) report.
    *
    *     This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it's in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we'll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.
    * \param adAccountId  *Required*
    * \param mMMReportCreate  *Required*
    */
    Response<
                MMMReport
        >
    analytics_createMmmReport(
            
            std::string adAccountId
            , 
            
            MMMReportCreate mMMReportCreate
            
    );
    /**
    * Create async request for an account analytics report.
    *
    *   This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param adsAnalyticsCreateAsyncRequest  *Required*
    */
    Response<
                AdsAnalyticsCreateAsyncResponse
        >
    analytics_createReport(
            
            std::string adAccountId
            , 
            
            AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest
            
    );
    /**
    * Create async request for an analytics report using a template.
    *
    *   This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.
    * \param adAccountId  *Required*
    * \param templateId Unique identifier of a template. *Required*
    * \param startDate Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today.
    * \param endDate Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date.
    * \param granularity   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    */
    Response<
                TemplateBasedReport
        >
    analytics_createTemplateReport(
            
            std::string adAccountId
            , 
            
            std::string templateId
            , 
            
            Date startDate
            , 
            
            Date endDate
            , 
            
            Granularity granularity
            
    );
    /**
    * Get advertiser brand, category, SKU report.
    *
    *   [Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param token Token returned from the post request creation call *Required*
    */
    Response<
                ConversionProductReport
        >
    analytics_getConversionProductReport(
            
            std::string adAccountId
            , 
            
            std::string token
            
    );
    /**
    * Get advertiser Marketing Mix Modeling (MMM) report..
    *
    *     Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.
    * \param adAccountId  *Required*
    * \param token Token returned from the post request creation call *Required*
    */
    Response<
                MMMReport
        >
    analytics_getMmmReport(
            
            std::string adAccountId
            , 
            
            std::string token
            
    );
    /**
    * Get the account analytics report created by the async call.
    *
    *   This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param token Token returned from the post request creation call *Required*
    */
    Response<
                AdsAnalyticsGetAsyncResponse
        >
    analytics_getReport(
            
            std::string adAccountId
            , 
            
            std::string token
            
    );
    /**
    * Delete ads data for ad account in API Sandbox.
    *
    * Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
    * \param adAccountId Unique identifier of an ad account. *Required*
    */
    Response<
                std::string
        >
    sandbox_delete(
            
            std::string adAccountId
            
    );
    /**
    * List templates.
    *
    * Gets all Templates associated with an ad account ID.
    * \param adAccountId Unique identifier of an ad account. *Required*
    * \param bookmark Cursor used to fetch the next page of items
    * \param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    * \param order The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
    */
    Response<
                Templates_list_200_response
        >
    templates_list(
            
            std::string adAccountId
            , 
            
            std::string bookmark
            , 
            
            int pageSize
            , 
            
            Pinterest.Lib.PaginationOrder order
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_AdAccountsApi_H_ */