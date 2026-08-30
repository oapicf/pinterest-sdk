# openapi_client.AdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_previews_create**](AdsApi.md#ad_previews_create) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**ad_targeting_analytics_get**](AdsApi.md#ad_targeting_analytics_get) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**ads_analytics**](AdsApi.md#ads_analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**ads_create**](AdsApi.md#ads_create) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
[**ads_get**](AdsApi.md#ads_get) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**ads_list**](AdsApi.md#ads_list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**ads_update**](AdsApi.md#ads_update) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads
[**campaign_ad_preview_create**](AdsApi.md#campaign_ad_preview_create) | **POST** /ad_accounts/{ad_account_id}/campaign_ad_preview | Create ad preview records for one or more ad groups
[**campaign_ad_preview_delete**](AdsApi.md#campaign_ad_preview_delete) | **DELETE** /ad_accounts/{ad_account_id}/campaign_ad_preview | Delete ad preview records for one or more ad groups
[**campaign_ad_preview_read**](AdsApi.md#campaign_ad_preview_read) | **GET** /ad_accounts/{ad_account_id}/campaign_ad_preview | Fetch ad preview records for one or more ad groups


# **ad_previews_create**
> AdPreviewURLResponse ad_previews_create(ad_account_id, ad_preview_request)

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad.

If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See [Ads Overview](https://help.pinterest.com/en/business/article/promoted-pins-overview).)

You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires. Collection ads are not currently supported ad preview.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.ad_preview_request import AdPreviewRequest
from openapi_client.models.ad_preview_url_response import AdPreviewURLResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AdsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    ad_preview_request = openapi_client.AdPreviewRequest() # AdPreviewRequest | 

    try:
        # Create ad preview with pin or image
        api_response = api_instance.ad_previews_create(ad_account_id, ad_preview_request)
        print("The response of AdsApi->ad_previews_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdsApi->ad_previews_create: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **ad_preview_request** | [**AdPreviewRequest**](AdPreviewRequest.md)|  | 

### Return type

[**AdPreviewURLResponse**](AdPreviewURLResponse.md)

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

# **ad_targeting_analytics_get**
> MetricsResponse ad_targeting_analytics_get(ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days=click_window_days, engagement_window_days=engagement_window_days, view_window_days=view_window_days, conversion_report_time=conversion_report_time, attribution_types=attribution_types, reporting_timezone=reporting_timezone, sort_columns=sort_columns, sort_ascending=sort_ascending)

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. "age_bucket") for applicable values (e.g. "45-49").

* The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
* If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
* If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.ads_analytics_ad_targeting_type import AdsAnalyticsAdTargetingType
from openapi_client.models.conversion_attribution_window_days import ConversionAttributionWindowDays
from openapi_client.models.conversion_report_attribution_type import ConversionReportAttributionType
from openapi_client.models.conversion_report_time_type import ConversionReportTimeType
from openapi_client.models.granularity import Granularity
from openapi_client.models.metrics_response import MetricsResponse
from openapi_client.models.reporting_column_sync import ReportingColumnSync
from openapi_client.models.reporting_time_zone import ReportingTimeZone
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AdsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    ad_ids = ['ad_ids_example'] # List[str] | List of Ad Ids to use to filter the results.
    start_date = '2013-10-20' # date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    end_date = '2013-10-20' # date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    targeting_types = [openapi_client.AdsAnalyticsAdTargetingType()] # List[AdsAnalyticsAdTargetingType] | Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
    columns = [openapi_client.ReportingColumnSync()] # List[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    granularity = openapi_client.Granularity() # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    click_window_days = openapi_client.ConversionAttributionWindowDays() # ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional)
    engagement_window_days = openapi_client.ConversionAttributionWindowDays() # ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional)
    view_window_days = openapi_client.ConversionAttributionWindowDays() # ConversionAttributionWindowDays | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional)
    conversion_report_time = openapi_client.ConversionReportTimeType() # ConversionReportTimeType | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional)
    attribution_types = [openapi_client.ConversionReportAttributionType()] # List[ConversionReportAttributionType] | List of types of attribution for the conversion report (optional)
    reporting_timezone = openapi_client.ReportingTimeZone() # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)
    sort_columns = ['sort_columns_example'] # List[str] | Sort Columns. (optional)
    sort_ascending = True # bool | Sort ascending. (optional)

    try:
        # Get targeting analytics for ads
        api_response = api_instance.ad_targeting_analytics_get(ad_account_id, ad_ids, start_date, end_date, targeting_types, columns, granularity, click_window_days=click_window_days, engagement_window_days=engagement_window_days, view_window_days=view_window_days, conversion_report_time=conversion_report_time, attribution_types=attribution_types, reporting_timezone=reporting_timezone, sort_columns=sort_columns, sort_ascending=sort_ascending)
        print("The response of AdsApi->ad_targeting_analytics_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdsApi->ad_targeting_analytics_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **ad_ids** | [**List[str]**](str.md)| List of Ad Ids to use to filter the results. | 
 **start_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **targeting_types** | [**List[AdsAnalyticsAdTargetingType]**](AdsAnalyticsAdTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | 
 **columns** | [**List[ReportingColumnSync]**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **click_window_days** | [**ConversionAttributionWindowDays**](.md)| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] 
 **engagement_window_days** | [**ConversionAttributionWindowDays**](.md)| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.  **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] 
 **view_window_days** | [**ConversionAttributionWindowDays**](.md)| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] 
 **conversion_report_time** | [**ConversionReportTimeType**](.md)| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] 
 **attribution_types** | [**List[ConversionReportAttributionType]**](ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional] 
 **reporting_timezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 
 **sort_columns** | [**List[str]**](str.md)| Sort Columns. | [optional] 
 **sort_ascending** | **bool**| Sort ascending. | [optional] 

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

# **ads_analytics**
> List[AdsAnalytics] ads_analytics(start_date, end_date, columns, granularity, ad_account_id, pin_ids=pin_ids, ad_ids=ad_ids, click_window_days=click_window_days, engagement_window_days=engagement_window_days, view_window_days=view_window_days, conversion_report_time=conversion_report_time, campaign_ids=campaign_ids, reporting_timezone=reporting_timezone)

Get ad analytics

    Get analytics for the specified ads in the specified `ad_account_id`, filtered by the specified options.
    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.
    - The request must contain either ad_ids or both campaign_ids and pin_ids.
    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.
    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.ads_analytics import AdsAnalytics
from openapi_client.models.granularity import Granularity
from openapi_client.models.reporting_column_sync import ReportingColumnSync
from openapi_client.models.reporting_time_zone import ReportingTimeZone
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AdsApi(api_client)
    start_date = '2013-10-20' # date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    end_date = '2013-10-20' # date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    columns = [openapi_client.ReportingColumnSync()] # List[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
    granularity = openapi_client.Granularity() # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    pin_ids = ['pin_ids_example'] # List[str] | List of Pin IDs. (optional)
    ad_ids = ['ad_ids_example'] # List[str] | List of Ad Ids to use to filter the results. (optional)
    click_window_days = 30 # float | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
    engagement_window_days = 30 # float | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
    view_window_days = 1 # float | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
    conversion_report_time = 'TIME_OF_AD_ACTION' # str | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to 'TIME_OF_AD_ACTION')
    campaign_ids = ['campaign_ids_example'] # List[str] | List of Campaign Ids to use to filter the results. (optional)
    reporting_timezone = openapi_client.ReportingTimeZone() # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

    try:
        # Get ad analytics
        api_response = api_instance.ads_analytics(start_date, end_date, columns, granularity, ad_account_id, pin_ids=pin_ids, ad_ids=ad_ids, click_window_days=click_window_days, engagement_window_days=engagement_window_days, view_window_days=view_window_days, conversion_report_time=conversion_report_time, campaign_ids=campaign_ids, reporting_timezone=reporting_timezone)
        print("The response of AdsApi->ads_analytics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdsApi->ads_analytics: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **columns** | [**List[ReportingColumnSync]**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **pin_ids** | [**List[str]**](str.md)| List of Pin IDs. | [optional] 
 **ad_ids** | [**List[str]**](str.md)| List of Ad Ids to use to filter the results. | [optional] 
 **click_window_days** | **float**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | **float**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | **float**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | **str**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
 **campaign_ids** | [**List[str]**](str.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **reporting_timezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**List[AdsAnalytics]**](AdsAnalytics.md)

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

# **ads_create**
> AdBatchWriteResponseModel ads_create(ad_account_id, ad_create)

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.ad_batch_write_response_model import AdBatchWriteResponseModel
from openapi_client.models.ad_create import AdCreate
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AdsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    ad_create = [openapi_client.AdCreate()] # List[AdCreate] | 

    try:
        # Create ads
        api_response = api_instance.ads_create(ad_account_id, ad_create)
        print("The response of AdsApi->ads_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdsApi->ads_create: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **ad_create** | [**List[AdCreate]**](AdCreate.md)|  | 

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

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

# **ads_get**
> Ad ads_get(ad_id, ad_account_id)

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will
contain additional information from the Ad Review process.
For more information about our policies and rejection reasons see the [Pinterest advertising standards](https://www.pinterest.com/_/_/policy/advertising-guidelines/).

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.ad import Ad
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AdsApi(api_client)
    ad_id = 'ad_id_example' # str | The ID of this ad.
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.

    try:
        # Get ad
        api_response = api_instance.ads_get(ad_id, ad_account_id)
        print("The response of AdsApi->ads_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdsApi->ads_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_id** | **str**| The ID of this ad. | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | 

### Return type

[**Ad**](Ad.md)

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

# **ads_list**
> AdsList200Response ads_list(ad_account_id, bookmark=bookmark, page_size=page_size, order=order, campaign_ids=campaign_ids, ad_group_ids=ad_group_ids, ad_ids=ad_ids, entity_statuses=entity_statuses)

List ads

List ads that meet the filters provided:
    - Listed campaign ids or ad group ids or ad ids
    - Listed entity statuses

If no filter is provided, all ads in the ad account are returned.

**Note:**
Provide only `campaign_id` or `ad_group_id` or `ad_id`. Do not provide more than one type.

Review status is provided for each ad; if `review_status` is `REJECTED`, the `rejected_reasons` field will contain additional information.

For more, see [Pinterest advertising standards](https://policy.pinterest.com/en/advertising-guidelines).

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.ads_list200_response import AdsList200Response
from openapi_client.models.entity_status import EntityStatus
from openapi_client.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AdsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
    order = openapi_client.PinterestLibPaginationOrder() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    campaign_ids = ['campaign_ids_example'] # List[str] | List of Campaign Ids to use to filter the results. (optional)
    ad_group_ids = ['ad_group_ids_example'] # List[str] | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
    ad_ids = ['ad_ids_example'] # List[str] | List of Ad Ids to use to filter the results. (optional)
    entity_statuses = ["ACTIVE","PAUSED"] # List[EntityStatus] | Entity status (optional) (default to ["ACTIVE","PAUSED"])

    try:
        # List ads
        api_response = api_instance.ads_list(ad_account_id, bookmark=bookmark, page_size=page_size, order=order, campaign_ids=campaign_ids, ad_group_ids=ad_group_ids, ad_ids=ad_ids, entity_statuses=entity_statuses)
        print("The response of AdsApi->ads_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdsApi->ads_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **campaign_ids** | [**List[str]**](str.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **ad_group_ids** | [**List[str]**](str.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] 
 **ad_ids** | [**List[str]**](str.md)| List of Ad Ids to use to filter the results. | [optional] 
 **entity_statuses** | [**List[EntityStatus]**](EntityStatus.md)| Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]

### Return type

[**AdsList200Response**](AdsList200Response.md)

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

# **ads_update**
> AdBatchWriteResponseModel ads_update(ad_account_id, ad_batch_update)

Update ads

Update multiple existing ads

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.ad_batch_update import AdBatchUpdate
from openapi_client.models.ad_batch_write_response_model import AdBatchWriteResponseModel
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AdsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    ad_batch_update = [openapi_client.AdBatchUpdate()] # List[AdBatchUpdate] | 

    try:
        # Update ads
        api_response = api_instance.ads_update(ad_account_id, ad_batch_update)
        print("The response of AdsApi->ads_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdsApi->ads_update: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **ad_batch_update** | [**List[AdBatchUpdate]**](AdBatchUpdate.md)|  | 

### Return type

[**AdBatchWriteResponseModel**](AdBatchWriteResponseModel.md)

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

# **campaign_ad_preview_create**
> List[CampaignAdPreviewCreate200ResponseInner] campaign_ad_preview_create(ad_account_id, campaign_ad_preview_create)

Create ad preview records for one or more ad groups

Create ad preview records for one or more ad groups that can be shared.
Each ad group is processed independently; individual failures do not block other previews.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.campaign_ad_preview_create import CampaignAdPreviewCreate
from openapi_client.models.campaign_ad_preview_create200_response_inner import CampaignAdPreviewCreate200ResponseInner
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AdsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    campaign_ad_preview_create = [openapi_client.CampaignAdPreviewCreate()] # List[CampaignAdPreviewCreate] | 

    try:
        # Create ad preview records for one or more ad groups
        api_response = api_instance.campaign_ad_preview_create(ad_account_id, campaign_ad_preview_create)
        print("The response of AdsApi->campaign_ad_preview_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdsApi->campaign_ad_preview_create: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **campaign_ad_preview_create** | [**List[CampaignAdPreviewCreate]**](CampaignAdPreviewCreate.md)|  | 

### Return type

[**List[CampaignAdPreviewCreate200ResponseInner]**](CampaignAdPreviewCreate200ResponseInner.md)

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

# **campaign_ad_preview_delete**
> List[CampaignAdPreviewDelete200ResponseInner] campaign_ad_preview_delete(ad_group_ids, ad_account_id)

Delete ad preview records for one or more ad groups

Delete ad preview records for one or more ad groups.
All ad groups are validated before deleting any records.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.campaign_ad_preview_delete200_response_inner import CampaignAdPreviewDelete200ResponseInner
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AdsApi(api_client)
    ad_group_ids = ['ad_group_ids_example'] # List[str] | List of Ad group Ids to use to filter the results.
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.

    try:
        # Delete ad preview records for one or more ad groups
        api_response = api_instance.campaign_ad_preview_delete(ad_group_ids, ad_account_id)
        print("The response of AdsApi->campaign_ad_preview_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdsApi->campaign_ad_preview_delete: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_group_ids** | [**List[str]**](str.md)| List of Ad group Ids to use to filter the results. | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | 

### Return type

[**List[CampaignAdPreviewDelete200ResponseInner]**](CampaignAdPreviewDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**204** | Resource deleted successfully. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaign_ad_preview_read**
> List[CampaignAdPreview] campaign_ad_preview_read(ad_group_ids, ad_account_id)

Fetch ad preview records for one or more ad groups

Fetch ad preview records for one or more ad groups.
Returns all active previews associated with the provided ad group IDs.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.campaign_ad_preview import CampaignAdPreview
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.AdsApi(api_client)
    ad_group_ids = ['ad_group_ids_example'] # List[str] | List of Ad group Ids to use to filter the results.
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.

    try:
        # Fetch ad preview records for one or more ad groups
        api_response = api_instance.campaign_ad_preview_read(ad_group_ids, ad_account_id)
        print("The response of AdsApi->campaign_ad_preview_read:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AdsApi->campaign_ad_preview_read: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_group_ids** | [**List[str]**](str.md)| List of Ad group Ids to use to filter the results. | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | 

### Return type

[**List[CampaignAdPreview]**](CampaignAdPreview.md)

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

