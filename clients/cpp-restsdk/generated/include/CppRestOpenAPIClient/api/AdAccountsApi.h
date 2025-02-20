/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * AdAccountsApi.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_AdAccountsApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_AdAccountsApi_H_



#include "CppRestOpenAPIClient/ApiClient.h"

#include "CppRestOpenAPIClient/model/AdAccount.h"
#include "CppRestOpenAPIClient/model/AdAccountAnalyticsResponse_inner.h"
#include "CppRestOpenAPIClient/model/AdAccountCreateRequest.h"
#include "CppRestOpenAPIClient/model/Ad_accounts_list_200_response.h"
#include "CppRestOpenAPIClient/model/AdsAnalyticsCreateAsyncRequest.h"
#include "CppRestOpenAPIClient/model/AdsAnalyticsCreateAsyncResponse.h"
#include "CppRestOpenAPIClient/model/AdsAnalyticsGetAsyncResponse.h"
#include "CppRestOpenAPIClient/model/AdsAnalyticsTargetingType.h"
#include "CppRestOpenAPIClient/model/ConversionReportAttributionType.h"
#include "CppRestOpenAPIClient/model/CreateMMMReportRequest.h"
#include "CppRestOpenAPIClient/model/CreateMMMReportResponse.h"
#include "CppRestOpenAPIClient/model/Error.h"
#include "CppRestOpenAPIClient/model/GetMMMReportResponse.h"
#include "CppRestOpenAPIClient/model/Granularity.h"
#include "CppRestOpenAPIClient/model/MetricsResponse.h"
#include "CppRestOpenAPIClient/model/Templates_list_200_response.h"
#include <vector>
#include <cpprest/details/basic_types.h>
#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  AdAccountsApi 
{
public:

    explicit AdAccountsApi( std::shared_ptr<const ApiClient> apiClient );

    virtual ~AdAccountsApi();

    /// <summary>
    /// Get targeting analytics for an ad account
    /// </summary>
    /// <remarks>
    /// Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;). &lt;p/&gt; - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</param>
    /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</param>
    /// <param name="targetingTypes">Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users.</param>
    /// <param name="columns">Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned</param>
    /// <param name="granularity">TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly</param>
    /// <param name="clickWindowDays">Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 0)</param>
    /// <param name="engagementWindowDays">Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 0)</param>
    /// <param name="viewWindowDays">Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 0)</param>
    /// <param name="conversionReportTime">The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="attributionTypes">List of types of attribution for the conversion report (optional, default to new ConversionReportAttributionType())</param>
    pplx::task<std::shared_ptr<MetricsResponse>> adAccountTargetingAnalytics_get(
        utility::string_t adAccountId,
        utility::datetime startDate,
        utility::datetime endDate,
        std::vector<std::shared_ptr<AdsAnalyticsTargetingType>> targetingTypes,
        std::vector<utility::string_t> columns,
        std::shared_ptr<Granularity> granularity,
        boost::optional<int32_t> clickWindowDays,
        boost::optional<int32_t> engagementWindowDays,
        boost::optional<int32_t> viewWindowDays,
        boost::optional<utility::string_t> conversionReportTime,
        boost::optional<std::shared_ptr<ConversionReportAttributionType>> attributionTypes
    ) const;
    /// <summary>
    /// Get ad account analytics
    /// </summary>
    /// <remarks>
    /// Get analytics for the specified &lt;code&gt;ad_account_id&lt;/code&gt;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.</param>
    /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.</param>
    /// <param name="columns">Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned</param>
    /// <param name="granularity">TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly</param>
    /// <param name="clickWindowDays">Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 0)</param>
    /// <param name="engagementWindowDays">Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. (optional, default to 0)</param>
    /// <param name="viewWindowDays">Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. (optional, default to 0)</param>
    /// <param name="conversionReportTime">The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::vector<std::shared_ptr<AdAccountAnalyticsResponse_inner>>> adAccount_analytics(
        utility::string_t adAccountId,
        utility::datetime startDate,
        utility::datetime endDate,
        std::vector<utility::string_t> columns,
        std::shared_ptr<Granularity> granularity,
        boost::optional<int32_t> clickWindowDays,
        boost::optional<int32_t> engagementWindowDays,
        boost::optional<int32_t> viewWindowDays,
        boost::optional<utility::string_t> conversionReportTime
    ) const;
    /// <summary>
    /// Create ad account
    /// </summary>
    /// <remarks>
    /// Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. &lt;p/&gt; You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) &lt;p/&gt; For more, see &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/create-an-advertiser-account\&quot;&gt;Create an advertiser account&lt;/a&gt;.
    /// </remarks>
    /// <param name="adAccountCreateRequest">Ad account to create.</param>
    pplx::task<std::shared_ptr<AdAccount>> adAccounts_create(
        std::shared_ptr<AdAccountCreateRequest> adAccountCreateRequest
    ) const;
    /// <summary>
    /// Get ad account
    /// </summary>
    /// <remarks>
    /// Get an ad account
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    pplx::task<std::shared_ptr<AdAccount>> adAccounts_get(
        utility::string_t adAccountId
    ) const;
    /// <summary>
    /// List ad accounts
    /// </summary>
    /// <remarks>
    /// Get a list of the ad_accounts that the \&quot;operation user_account\&quot; has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;.
    /// </remarks>
    /// <param name="bookmark">Cursor used to fetch the next page of items (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 0)</param>
    /// <param name="includeSharedAccounts">Include shared ad accounts (optional, default to false)</param>
    pplx::task<std::shared_ptr<Ad_accounts_list_200_response>> adAccounts_list(
        boost::optional<utility::string_t> bookmark,
        boost::optional<int32_t> pageSize,
        boost::optional<bool> includeSharedAccounts
    ) const;
    /// <summary>
    /// Create a request for a Marketing Mix Modeling (MMM) report
    /// </summary>
    /// <remarks>
    /// This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it&#39;s in beta release.
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    /// <param name="createMMMReportRequest"></param>
    pplx::task<std::shared_ptr<CreateMMMReportResponse>> analytics_createMmmReport(
        utility::string_t adAccountId,
        std::shared_ptr<CreateMMMReportRequest> createMMMReportRequest
    ) const;
    /// <summary>
    /// Create async request for an account analytics report
    /// </summary>
    /// <remarks>
    /// This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    /// <param name="adsAnalyticsCreateAsyncRequest"></param>
    pplx::task<std::shared_ptr<AdsAnalyticsCreateAsyncResponse>> analytics_createReport(
        utility::string_t adAccountId,
        std::shared_ptr<AdsAnalyticsCreateAsyncRequest> adsAnalyticsCreateAsyncRequest
    ) const;
    /// <summary>
    /// Create async request for an analytics report using a template
    /// </summary>
    /// <remarks>
    /// This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    /// <param name="templateId">Unique identifier of a template.</param>
    /// <param name="startDate">Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. (optional, default to utility::datetime())</param>
    /// <param name="endDate">Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. (optional, default to utility::datetime())</param>
    /// <param name="granularity">TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly (optional, default to new Granularity())</param>
    pplx::task<std::shared_ptr<AdsAnalyticsCreateAsyncResponse>> analytics_createTemplateReport(
        utility::string_t adAccountId,
        utility::string_t templateId,
        boost::optional<utility::datetime> startDate,
        boost::optional<utility::datetime> endDate,
        boost::optional<std::shared_ptr<Granularity>> granularity
    ) const;
    /// <summary>
    /// Get advertiser Marketing Mix Modeling (MMM) report.
    /// </summary>
    /// <remarks>
    /// Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    /// <param name="token">Token returned from the post request creation call</param>
    pplx::task<std::shared_ptr<GetMMMReportResponse>> analytics_getMmmReport(
        utility::string_t adAccountId,
        utility::string_t token
    ) const;
    /// <summary>
    /// Get the account analytics report created by the async call
    /// </summary>
    /// <remarks>
    /// This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Analyst, Campaign Manager.
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    /// <param name="token">Token returned from the post request creation call</param>
    pplx::task<std::shared_ptr<AdsAnalyticsGetAsyncResponse>> analytics_getReport(
        utility::string_t adAccountId,
        utility::string_t token
    ) const;
    /// <summary>
    /// Delete ads data for ad account in API Sandbox
    /// </summary>
    /// <remarks>
    /// Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    pplx::task<utility::string_t> sandbox_delete(
        utility::string_t adAccountId
    ) const;
    /// <summary>
    /// List templates
    /// </summary>
    /// <remarks>
    /// Gets all Templates associated with an ad account ID.
    /// </remarks>
    /// <param name="adAccountId">Unique identifier of an ad account.</param>
    /// <param name="pageSize">Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. (optional, default to 0)</param>
    /// <param name="order">The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    /// <param name="bookmark">Cursor used to fetch the next page of items (optional, default to utility::conversions::to_string_t(&quot;&quot;))</param>
    pplx::task<std::shared_ptr<Templates_list_200_response>> templates_list(
        utility::string_t adAccountId,
        boost::optional<int32_t> pageSize,
        boost::optional<utility::string_t> order,
        boost::optional<utility::string_t> bookmark
    ) const;

protected:
    std::shared_ptr<const ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_AdAccountsApi_H_ */

