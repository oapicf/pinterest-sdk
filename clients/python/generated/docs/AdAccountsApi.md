# pinterestsdk.AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_account_analytics**](AdAccountsApi.md#ad_account_analytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**ad_account_targeting_analytics_get**](AdAccountsApi.md#ad_account_targeting_analytics_get) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
[**ad_accounts_create**](AdAccountsApi.md#ad_accounts_create) | **POST** /ad_accounts | Create ad account
[**ad_accounts_get**](AdAccountsApi.md#ad_accounts_get) | **GET** /ad_accounts/{ad_account_id} | Get ad account
[**ad_accounts_list**](AdAccountsApi.md#ad_accounts_list) | **GET** /ad_accounts | List ad accounts
[**analytics_create_conversion_product_report**](AdAccountsApi.md#analytics_create_conversion_product_report) | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report
[**analytics_create_mmm_report**](AdAccountsApi.md#analytics_create_mmm_report) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
[**analytics_create_report**](AdAccountsApi.md#analytics_create_report) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analytics_create_template_report**](AdAccountsApi.md#analytics_create_template_report) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
[**analytics_get_conversion_product_report**](AdAccountsApi.md#analytics_get_conversion_product_report) | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report
[**analytics_get_mmm_report**](AdAccountsApi.md#analytics_get_mmm_report) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
[**analytics_get_report**](AdAccountsApi.md#analytics_get_report) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**sandbox_delete**](AdAccountsApi.md#sandbox_delete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
[**templates_list**](AdAccountsApi.md#templates_list) | **GET** /ad_accounts/{ad_account_id}/templates | List templates


# **ad_account_analytics**
> List[AdAccountAnalyticsItems] ad_account_analytics(start_date, end_date, columns, granularity, ad_account_id, click_window_days=click_window_days, engagement_window_days=engagement_window_days, view_window_days=view_window_days, conversion_report_time=conversion_report_time, reporting_timezone=reporting_timezone)

Get ad account analytics

  Get analytics for the specified `ad_account_id`, filtered by the specified options.

  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

  - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.

  - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.ad_account_analytics_items import AdAccountAnalyticsItems
from pinterestsdk.models.granularity import Granularity
from pinterestsdk.models.reporting_column_sync import ReportingColumnSync
from pinterestsdk.models.reporting_time_zone import ReportingTimeZone
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdAccountsApi(api_client)
    start_date = '2013-10-20' # date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    end_date = '2013-10-20' # date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    columns = [pinterestsdk.ReportingColumnSync()] # List[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    granularity = pinterestsdk.Granularity() # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    click_window_days = 30 # float | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
    engagement_window_days = 30 # float | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
    view_window_days = 1 # float | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
    conversion_report_time = 'TIME_OF_AD_ACTION' # str | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to 'TIME_OF_AD_ACTION')
    reporting_timezone = pinterestsdk.ReportingTimeZone() # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

    try:
        # Get ad account analytics
        api_response = api_instance.ad_account_analytics(start_date, end_date, columns, granularity, ad_account_id, click_window_days=click_window_days, engagement_window_days=engagement_window_days, view_window_days=view_window_days, conversion_report_time=conversion_report_time, reporting_timezone=reporting_timezone)
        print("The response of AdAccountsApi->ad_account_analytics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdAccountsApi->ad_account_analytics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **columns** | [**List[ReportingColumnSync]**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **click_window_days** | **float**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **float**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | **float**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **str**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
 **reporting_timezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**List[AdAccountAnalyticsItems]**](AdAccountAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_account_targeting_analytics_get**
> MetricsResponse ad_account_targeting_analytics_get(ad_account_id, start_date, end_date, targeting_types, columns, granularity, click_window_days=click_window_days, engagement_window_days=engagement_window_days, view_window_days=view_window_days, conversion_report_time=conversion_report_time, attribution_types=attribution_types, reporting_timezone=reporting_timezone)

Get targeting analytics for an ad account

Get targeting analytics for an ad account.
For the requested account and metrics, the response will include the requested metric information
(e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49"). <p/>

* The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
* If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
* If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.ads_analytics_account_targeting_type import AdsAnalyticsAccountTargetingType
from pinterestsdk.models.conversion_report_attribution_type import ConversionReportAttributionType
from pinterestsdk.models.granularity import Granularity
from pinterestsdk.models.metrics_response import MetricsResponse
from pinterestsdk.models.reporting_column_sync import ReportingColumnSync
from pinterestsdk.models.reporting_time_zone import ReportingTimeZone
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdAccountsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    start_date = '2013-10-20' # date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    end_date = '2013-10-20' # date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    targeting_types = [pinterestsdk.AdsAnalyticsAccountTargetingType()] # List[AdsAnalyticsAccountTargetingType] | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
    columns = [pinterestsdk.ReportingColumnSync()] # List[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    granularity = pinterestsdk.Granularity() # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    click_window_days = 30 # float | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
    engagement_window_days = 30 # float | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
    view_window_days = 1 # float | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
    conversion_report_time = 'TIME_OF_AD_ACTION' # str | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to 'TIME_OF_AD_ACTION')
    attribution_types = [pinterestsdk.ConversionReportAttributionType()] # List[ConversionReportAttributionType] | List of types of attribution for the conversion report (optional)
    reporting_timezone = pinterestsdk.ReportingTimeZone() # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

    try:
        # Get targeting analytics for an ad account
        api_response = api_instance.ad_account_targeting_analytics_get(ad_account_id, start_date, end_date, targeting_types, columns, granularity, click_window_days=click_window_days, engagement_window_days=engagement_window_days, view_window_days=view_window_days, conversion_report_time=conversion_report_time, attribution_types=attribution_types, reporting_timezone=reporting_timezone)
        print("The response of AdAccountsApi->ad_account_targeting_analytics_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdAccountsApi->ad_account_targeting_analytics_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **start_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targeting_types** | [**List[AdsAnalyticsAccountTargetingType]**](AdsAnalyticsAccountTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | 
 **columns** | [**List[ReportingColumnSync]**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **click_window_days** | **float**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **float**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | **float**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **str**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
 **attribution_types** | [**List[ConversionReportAttributionType]**](ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional] 
 **reporting_timezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_create**
> AdAccount ad_accounts_create(ad_account_create)

Create ad account

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc.
An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.

You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.)
For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.ad_account import AdAccount
from pinterestsdk.models.ad_account_create import AdAccountCreate
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdAccountsApi(api_client)
    ad_account_create = pinterestsdk.AdAccountCreate() # AdAccountCreate | 

    try:
        # Create ad account
        api_response = api_instance.ad_accounts_create(ad_account_create)
        print("The response of AdAccountsApi->ad_accounts_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdAccountsApi->ad_accounts_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_create** | [**AdAccountCreate**](AdAccountCreate.md)|  | 

### Return type

[**AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**201** | Resource create operation completed successfully. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_get**
> AdAccount ad_accounts_get(ad_account_id)

Get ad account

Get an ad account

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.ad_account import AdAccount
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdAccountsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | 

    try:
        # Get ad account
        api_response = api_instance.ad_accounts_get(ad_account_id)
        print("The response of AdAccountsApi->ad_accounts_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdAccountsApi->ad_accounts_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**|  | 

### Return type

[**AdAccount**](AdAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_list**
> AdAccountsList200Response ad_accounts_list(include_shared_accounts=include_shared_accounts, bookmark=bookmark, page_size=page_size)

List ad accounts

Get a list of the ad_accounts that the "operation user_account" has access to.
        - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.ad_accounts_list200_response import AdAccountsList200Response
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdAccountsApi(api_client)
    include_shared_accounts = True # bool | Include shared ad accounts (optional) (default to True)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # List ad accounts
        api_response = api_instance.ad_accounts_list(include_shared_accounts=include_shared_accounts, bookmark=bookmark, page_size=page_size)
        print("The response of AdAccountsApi->ad_accounts_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdAccountsApi->ad_accounts_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_shared_accounts** | **bool**| Include shared ad accounts | [optional] [default to True]
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdAccountsList200Response**](AdAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_create_conversion_product_report**
> ConversionProductReport analytics_create_conversion_product_report(ad_account_id, conversion_product_report_create)

Create a request for a brand, category, SKU report

  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)
  This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.conversion_product_report import ConversionProductReport
from pinterestsdk.models.conversion_product_report_create import ConversionProductReportCreate
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdAccountsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    conversion_product_report_create = pinterestsdk.ConversionProductReportCreate() # ConversionProductReportCreate | 

    try:
        # Create a request for a brand, category, SKU report
        api_response = api_instance.analytics_create_conversion_product_report(ad_account_id, conversion_product_report_create)
        print("The response of AdAccountsApi->analytics_create_conversion_product_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdAccountsApi->analytics_create_conversion_product_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **conversion_product_report_create** | [**ConversionProductReportCreate**](ConversionProductReportCreate.md)|  | 

### Return type

[**ConversionProductReport**](ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**201** | Resource create operation completed successfully. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_create_mmm_report**
> MMMReport analytics_create_mmm_report(ad_account_id, mmm_report_create)

Create a request for a Marketing Mix Modeling (MMM) report

    This creates an asynchronous mmm report based on the given request.
    It returns a token that you can use to download the report when it is
    ready. NOTE: An additional limit of 5 queries per minute per advertiser
    applies to this endpoint while it's in beta release.
    For the ADVERTISER_PAID_SPEND_IN_DOLLAR,
    ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR
    columns: if you receive bonus media, this value still includes that spend, and it will
    need to be removed manually with support from your Pinterest account team for a
    fully netted value. Over time, we'll also subtract bonus media and other incentives as
    data becomes available. Production and other non-media fees are excluded.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.mmm_report import MMMReport
from pinterestsdk.models.mmm_report_create import MMMReportCreate
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdAccountsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | 
    mmm_report_create = pinterestsdk.MMMReportCreate() # MMMReportCreate | 

    try:
        # Create a request for a Marketing Mix Modeling (MMM) report
        api_response = api_instance.analytics_create_mmm_report(ad_account_id, mmm_report_create)
        print("The response of AdAccountsApi->analytics_create_mmm_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdAccountsApi->analytics_create_mmm_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**|  | 
 **mmm_report_create** | [**MMMReportCreate**](MMMReportCreate.md)|  | 

### Return type

[**MMMReport**](MMMReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**201** | Resource create operation completed successfully. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_create_report**
> AdsAnalyticsCreateAsyncResponse analytics_create_report(ad_account_id, ads_analytics_create_async_request)

Create async request for an account analytics report

  This returns a token that you can use to download the report when it is ready.
  Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.
  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
  - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.
  - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.
  - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.
  - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.ads_analytics_create_async_request import AdsAnalyticsCreateAsyncRequest
from pinterestsdk.models.ads_analytics_create_async_response import AdsAnalyticsCreateAsyncResponse
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdAccountsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    ads_analytics_create_async_request = pinterestsdk.AdsAnalyticsCreateAsyncRequest() # AdsAnalyticsCreateAsyncRequest | 

    try:
        # Create async request for an account analytics report
        api_response = api_instance.analytics_create_report(ad_account_id, ads_analytics_create_async_request)
        print("The response of AdAccountsApi->analytics_create_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdAccountsApi->analytics_create_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **ads_analytics_create_async_request** | [**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md)|  | 

### Return type

[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_create_template_report**
> TemplateBasedReport analytics_create_template_report(ad_account_id, template_id, start_date=start_date, end_date=end_date, granularity=granularity)

Create async request for an analytics report using a template

  This takes a template ID and an optional custom timeframe and
  constructs an asynchronous report based on the template. It returns
  a token that you can use to download the report when it is ready.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.granularity import Granularity
from pinterestsdk.models.template_based_report import TemplateBasedReport
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdAccountsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | 
    template_id = 'template_id_example' # str | Unique identifier of a template.
    start_date = '2013-10-20' # date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. (optional)
    end_date = '2013-10-20' # date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. (optional)
    granularity = pinterestsdk.Granularity() # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly (optional)

    try:
        # Create async request for an analytics report using a template
        api_response = api_instance.analytics_create_template_report(ad_account_id, template_id, start_date=start_date, end_date=end_date, granularity=granularity)
        print("The response of AdAccountsApi->analytics_create_template_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdAccountsApi->analytics_create_template_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**|  | 
 **template_id** | **str**| Unique identifier of a template. | 
 **start_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. | [optional] 
 **end_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. | [optional] 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [optional] 

### Return type

[**TemplateBasedReport**](TemplateBasedReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**201** | Resource create operation completed successfully. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_get_conversion_product_report**
> ConversionProductReport analytics_get_conversion_product_report(ad_account_id, token)

Get advertiser brand, category, SKU report

  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)
  Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.conversion_product_report import ConversionProductReport
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdAccountsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    token = 'token_example' # str | Token returned from the post request creation call

    try:
        # Get advertiser brand, category, SKU report
        api_response = api_instance.analytics_get_conversion_product_report(ad_account_id, token)
        print("The response of AdAccountsApi->analytics_get_conversion_product_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdAccountsApi->analytics_get_conversion_product_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **token** | **str**| Token returned from the post request creation call | 

### Return type

[**ConversionProductReport**](ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_get_mmm_report**
> MMMReport analytics_get_mmm_report(ad_account_id, token)

Get advertiser Marketing Mix Modeling (MMM) report.

    Get an mmm report for an ad account. This returns a URL to an
    mmm metrics report given a token returned from the create mmm report endpoint.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.mmm_report import MMMReport
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdAccountsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | 
    token = 'token_example' # str | Token returned from the post request creation call

    try:
        # Get advertiser Marketing Mix Modeling (MMM) report.
        api_response = api_instance.analytics_get_mmm_report(ad_account_id, token)
        print("The response of AdAccountsApi->analytics_get_mmm_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdAccountsApi->analytics_get_mmm_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**|  | 
 **token** | **str**| Token returned from the post request creation call | 

### Return type

[**MMMReport**](MMMReport.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_get_report**
> AdsAnalyticsGetAsyncResponse analytics_get_report(ad_account_id, token)

Get the account analytics report created by the async call

  This returns a URL to an analytics report given a token returned from the post request report creation call.
  You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.
  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.ads_analytics_get_async_response import AdsAnalyticsGetAsyncResponse
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdAccountsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    token = 'token_example' # str | Token returned from the post request creation call

    try:
        # Get the account analytics report created by the async call
        api_response = api_instance.analytics_get_report(ad_account_id, token)
        print("The response of AdAccountsApi->analytics_get_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdAccountsApi->analytics_get_report: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **token** | **str**| Token returned from the post request creation call | 

### Return type

[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sandbox_delete**
> str sandbox_delete(ad_account_id)

Delete ads data for ad account in API Sandbox

Delete an ad account and all the ads data associated with that account.
A string message is returned indicating the status of the delete operation.

Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).
Go to /docs/developer-tools/sandbox/ for more information.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdAccountsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.

    try:
        # Delete ads data for ad account in API Sandbox
        api_response = api_instance.sandbox_delete(ad_account_id)
        print("The response of AdAccountsApi->sandbox_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdAccountsApi->sandbox_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 

### Return type

**str**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **templates_list**
> TemplatesList200Response templates_list(ad_account_id, bookmark=bookmark, page_size=page_size, order=order)

List templates

Gets all Templates associated with an ad account ID.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from pinterestsdk.models.templates_list200_response import TemplatesList200Response
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.AdAccountsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
    order = pinterestsdk.PinterestLibPaginationOrder() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

    try:
        # List templates
        api_response = api_instance.templates_list(ad_account_id, bookmark=bookmark, page_size=page_size, order=order)
        print("The response of AdAccountsApi->templates_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdAccountsApi->templates_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[**TemplatesList200Response**](TemplatesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

