# CampaignsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adPinsAnalytics**](CampaignsApi.md#adPinsAnalytics) | **GET** /ad_accounts/{ad_account_id}/pins/analytics | Get pins analytics |
| [**campaignTargetingAnalyticsGet**](CampaignsApi.md#campaignTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/targeting_analytics | Get targeting analytics for campaigns |
| [**campaignsAnalytics**](CampaignsApi.md#campaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics |
| [**campaignsCreate**](CampaignsApi.md#campaignsCreate) | **POST** /ad_accounts/{ad_account_id}/campaigns | Create campaigns |
| [**campaignsGet**](CampaignsApi.md#campaignsGet) | **GET** /ad_accounts/{ad_account_id}/campaigns/{campaign_id} | Get campaign |
| [**campaignsList**](CampaignsApi.md#campaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns |
| [**campaignsUpdate**](CampaignsApi.md#campaignsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/campaigns | Update campaigns |
| [**getCampaignDeliveryEstimates**](CampaignsApi.md#getCampaignDeliveryEstimates) | **POST** /ad_accounts/{ad_account_id}/campaigns/delivery_estimates | Get campaign delivery estimates |



## adPinsAnalytics

> List&lt;AdPinAnalytics&gt; adPinsAnalytics(campaignId, pinIds, startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime)

Get pins analytics

Get analytics for the pins given a campaign and pins in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. Data will not be provided for conversion metrics but will be available for non-conversion metrics.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2 access token for authorization: client_credentials
        OAuth client_credentials = (OAuth) defaultClient.getAuthentication("client_credentials");
        client_credentials.setAccessToken("YOUR ACCESS TOKEN");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | Campaign Id to use to filter the results.
        List<String> pinIds = Arrays.asList(); // List<String> | List of Pin IDs.
        Date startDate = new Date(); // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        Date endDate = new Date(); // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        List<ReportingColumnSync> columns = Arrays.asList(); // List<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
        Granularity granularity = Granularity.fromValue("TOTAL"); // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
        String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
        BigDecimal clickWindowDays = new BigDecimal("0"); // BigDecimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
        BigDecimal engagementWindowDays = new BigDecimal("0"); // BigDecimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
        BigDecimal viewWindowDays = new BigDecimal("0"); // BigDecimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
        String conversionReportTime = "TIME_OF_AD_ACTION"; // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
        try {
            List<AdPinAnalytics> result = apiInstance.adPinsAnalytics(campaignId, pinIds, startDate, endDate, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#adPinsAnalytics");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | **String**| Campaign Id to use to filter the results. | |
| **pinIds** | [**List&lt;String&gt;**](String.md)| List of Pin IDs. | |
| **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **columns** | [**List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **adAccountId** | **String**| Unique identifier of an ad account. | |
| **clickWindowDays** | **BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **engagementWindowDays** | **BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **viewWindowDays** | **BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60] |
| **conversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |

### Return type

[**List&lt;AdPinAnalytics&gt;**](AdPinAnalytics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## campaignTargetingAnalyticsGet

> MetricsResponse campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone)

Get targeting analytics for campaigns

Get targeting analytics for one or more campaigns. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \&quot;age_bucket\&quot;) for applicable values (e.g. \&quot;45-49\&quot;).  * The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2 access token for authorization: client_credentials
        OAuth client_credentials = (OAuth) defaultClient.getAuthentication("client_credentials");
        client_credentials.setAccessToken("YOUR ACCESS TOKEN");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
        List<String> campaignIds = Arrays.asList(); // List<String> | List of Campaign Ids to use to filter the results.
        Date startDate = new Date(); // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        Date endDate = new Date(); // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        List<AdsAnalyticsCampaignTargetingType> targetingTypes = Arrays.asList(); // List<AdsAnalyticsCampaignTargetingType> | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
        List<ReportingColumnSync> columns = Arrays.asList(); // List<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
        Granularity granularity = Granularity.fromValue("TOTAL"); // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
        BigDecimal clickWindowDays = new BigDecimal("0"); // BigDecimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
        BigDecimal engagementWindowDays = new BigDecimal("0"); // BigDecimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
        BigDecimal viewWindowDays = new BigDecimal("0"); // BigDecimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
        String conversionReportTime = "TIME_OF_AD_ACTION"; // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
        List<ConversionReportAttributionType> attributionTypes = Arrays.asList(); // List<ConversionReportAttributionType> | List of types of attribution for the conversion report
        ReportingTimeZone reportingTimezone = ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE"); // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
        try {
            MetricsResponse result = apiInstance.campaignTargetingAnalyticsGet(adAccountId, campaignIds, startDate, endDate, targetingTypes, columns, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, reportingTimezone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#campaignTargetingAnalyticsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**| Unique identifier of an ad account. | |
| **campaignIds** | [**List&lt;String&gt;**](String.md)| List of Campaign Ids to use to filter the results. | |
| **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **targetingTypes** | [**List&lt;AdsAnalyticsCampaignTargetingType&gt;**](AdsAnalyticsCampaignTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | |
| **columns** | [**List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **clickWindowDays** | **BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **engagementWindowDays** | **BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **viewWindowDays** | **BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60] |
| **conversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| **attributionTypes** | [**List&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional] |
| **reportingTimezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE] |

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## campaignsAnalytics

> List&lt;CampaignsAnalyticsMetrics&gt; campaignsAnalytics(startDate, endDate, campaignIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone)

Get campaign analytics

Get analytics for the specified campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2 access token for authorization: client_credentials
        OAuth client_credentials = (OAuth) defaultClient.getAuthentication("client_credentials");
        client_credentials.setAccessToken("YOUR ACCESS TOKEN");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        Date startDate = new Date(); // Date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
        Date endDate = new Date(); // Date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
        List<String> campaignIds = Arrays.asList(); // List<String> | List of Campaign Ids to use to filter the results.
        List<ReportingColumnSync> columns = Arrays.asList(); // List<ReportingColumnSync> | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
        Granularity granularity = Granularity.fromValue("TOTAL"); // Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
        String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
        BigDecimal clickWindowDays = new BigDecimal("0"); // BigDecimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
        BigDecimal engagementWindowDays = new BigDecimal("0"); // BigDecimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**.
        BigDecimal viewWindowDays = new BigDecimal("0"); // BigDecimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
        String conversionReportTime = "TIME_OF_AD_ACTION"; // String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
        Boolean aggregateReportRows = false; // Boolean | Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users.
        ReportingTimeZone reportingTimezone = ReportingTimeZone.fromValue("PINTEREST_TIME_ZONE"); // ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
        try {
            List<CampaignsAnalyticsMetrics> result = apiInstance.campaignsAnalytics(startDate, endDate, campaignIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, aggregateReportRows, reportingTimezone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#campaignsAnalytics");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startDate** | **Date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **endDate** | **Date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **campaignIds** | [**List&lt;String&gt;**](String.md)| List of Campaign Ids to use to filter the results. | |
| **columns** | [**List&lt;ReportingColumnSync&gt;**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | |
| **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [enum: TOTAL, DAY, HOUR, WEEK, MONTH] |
| **adAccountId** | **String**| Unique identifier of an ad account. | |
| **clickWindowDays** | **BigDecimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **engagementWindowDays** | **BigDecimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30] [enum: 0, 1, 7, 14, 30, 60] |
| **viewWindowDays** | **BigDecimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1] [enum: 0, 1, 7, 14, 30, 60] |
| **conversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to TIME_OF_AD_ACTION] [enum: TIME_OF_AD_ACTION, TIME_OF_CONVERSION] |
| **aggregateReportRows** | **Boolean**| Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [optional] [default to false] |
| **reportingTimezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] [enum: PINTEREST_TIME_ZONE, AD_ACCOUNT_TIME_ZONE] |

### Return type

[**List&lt;CampaignsAnalyticsMetrics&gt;**](CampaignsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## campaignsCreate

> CampaignBatchWriteResponseModel campaignsCreate(adAccountId, campaignCreateItem)

Create campaigns

Create multiple new campaigns. Every campaign has its own campaign_id and houses one or more ad groups, which contain one or more ads.  For more, see [Set up your campaign](https://help.pinterest.com/en/business/article/set-up-your-campaign/).  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
        List<CampaignCreateItem> campaignCreateItem = Arrays.asList(); // List<CampaignCreateItem> | 
        try {
            CampaignBatchWriteResponseModel result = apiInstance.campaignsCreate(adAccountId, campaignCreateItem);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#campaignsCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**| Unique identifier of an ad account. | |
| **campaignCreateItem** | [**List&lt;CampaignCreateItem&gt;**](CampaignCreateItem.md)|  | |

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## campaignsGet

> Campaign campaignsGet(campaignId, adAccountId)

Get campaign

Get a specific campaign given the campaign ID.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2 access token for authorization: client_credentials
        OAuth client_credentials = (OAuth) defaultClient.getAuthentication("client_credentials");
        client_credentials.setAccessToken("YOUR ACCESS TOKEN");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String campaignId = "campaignId_example"; // String | Campaign ID, must be associated with the ad account ID provided in the path.
        String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
        try {
            Campaign result = apiInstance.campaignsGet(campaignId, adAccountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#campaignsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **campaignId** | **String**| Campaign ID, must be associated with the ad account ID provided in the path. | |
| **adAccountId** | **String**| Unique identifier of an ad account. | |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## campaignsList

> CampaignsList200Response campaignsList(adAccountId, bookmark, pageSize, order, campaignIds, entityStatuses)

List campaigns

Get a list of the campaigns in the specified &#x60;ad_account_id&#x60;, filtered by the specified options. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        // Configure OAuth2 access token for authorization: client_credentials
        OAuth client_credentials = (OAuth) defaultClient.getAuthentication("client_credentials");
        client_credentials.setAccessToken("YOUR ACCESS TOKEN");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
        String bookmark = "bookmark_example"; // String | Cursor used to fetch the next page of items
        Integer pageSize = 25; // Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
        PinterestLibPaginationOrder order = PinterestLibPaginationOrder.fromValue("ASCENDING"); // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
        List<String> campaignIds = Arrays.asList(); // List<String> | List of Campaign Ids to use to filter the results.
        List<EntityStatus> entityStatuses = Arrays.asList(); // List<EntityStatus> | Entity status
        try {
            CampaignsList200Response result = apiInstance.campaignsList(adAccountId, bookmark, pageSize, order, campaignIds, entityStatuses);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#campaignsList");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**| Unique identifier of an ad account. | |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] |
| **pageSize** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [enum: ASCENDING, DESCENDING] |
| **campaignIds** | [**List&lt;String&gt;**](String.md)| List of Campaign Ids to use to filter the results. | [optional] |
| **entityStatuses** | [**List&lt;EntityStatus&gt;**](EntityStatus.md)| Entity status | [optional] |

### Return type

[**CampaignsList200Response**](CampaignsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## campaignsUpdate

> CampaignBatchWriteResponseModel campaignsUpdate(adAccountId, campaignBatchUpdateItem)

Update campaigns

Update multiple ad campaigns based on campaign_ids.  **Note:** - The values for &#x60;lifetime_spend_cap&#x60; and &#x60;daily_spend_cap&#x60; are microcurrency amounts based on the currency field set in the advertiser&#39;s profile (e.g. USD).  Microcurrency is used to track very small transactions, based on the currency set in the advertiser&#39;s profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser&#39;s profile.  **Equivalency equations**, using dollars as an example currency:  - $1 &#x3D; 1,000,000 microdollars - 1 microdollar &#x3D; $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
        List<CampaignBatchUpdateItem> campaignBatchUpdateItem = Arrays.asList(); // List<CampaignBatchUpdateItem> | 
        try {
            CampaignBatchWriteResponseModel result = apiInstance.campaignsUpdate(adAccountId, campaignBatchUpdateItem);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#campaignsUpdate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**| Unique identifier of an ad account. | |
| **campaignBatchUpdateItem** | [**List&lt;CampaignBatchUpdateItem&gt;**](CampaignBatchUpdateItem.md)|  | |

### Return type

[**CampaignBatchWriteResponseModel**](CampaignBatchWriteResponseModel.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## getCampaignDeliveryEstimates

> CampaignDeliveryEstimatesResponse getCampaignDeliveryEstimates(adAccountId, campaignDeliveryEstimatesCampaign)

Get campaign delivery estimates

Get delivery estimates for an ads campaign  **This endpoint is currently in beta and is not available to all apps [Learn more](/docs/new/about-beta-access/).**

### Example

```java
// Import classes:
import org.openapitools.server.ApiClient;
import org.openapitools.server.ApiException;
import org.openapitools.server.Configuration;
import org.openapitools.server.auth.*;
import org.openapitools.server.models.*;
import org.openapitools.server.api.CampaignsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.pinterest.com/v5");
        
        // Configure OAuth2 access token for authorization: pinterest_oauth2
        OAuth pinterest_oauth2 = (OAuth) defaultClient.getAuthentication("pinterest_oauth2");
        pinterest_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        CampaignsApi apiInstance = new CampaignsApi(defaultClient);
        String adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
        List<CampaignDeliveryEstimatesCampaign> campaignDeliveryEstimatesCampaign = Arrays.asList(); // List<CampaignDeliveryEstimatesCampaign> | 
        try {
            CampaignDeliveryEstimatesResponse result = apiInstance.getCampaignDeliveryEstimates(adAccountId, campaignDeliveryEstimatesCampaign);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CampaignsApi#getCampaignDeliveryEstimates");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**| Unique identifier of an ad account. | |
| **campaignDeliveryEstimatesCampaign** | [**List&lt;CampaignDeliveryEstimatesCampaign&gt;**](CampaignDeliveryEstimatesCampaign.md)|  | |

### Return type

[**CampaignDeliveryEstimatesResponse**](CampaignDeliveryEstimatesResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **503** | The service is temporarily unavailable. |  -  |
| **200** | An unexpected error response. |  -  |

