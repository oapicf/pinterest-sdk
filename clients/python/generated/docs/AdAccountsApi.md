# pinterestsdk.AdAccountsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_account_analytics**](AdAccountsApi.md#ad_account_analytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**ad_accounts_list**](AdAccountsApi.md#ad_accounts_list) | **GET** /ad_accounts | List ad accounts
[**ad_groups_analytics**](AdAccountsApi.md#ad_groups_analytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**ad_groups_list**](AdAccountsApi.md#ad_groups_list) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**ads_analytics**](AdAccountsApi.md#ads_analytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**ads_list**](AdAccountsApi.md#ads_list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**analytics_create_report**](AdAccountsApi.md#analytics_create_report) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analytics_get_report**](AdAccountsApi.md#analytics_get_report) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**campaigns_analytics**](AdAccountsApi.md#campaigns_analytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaigns_list**](AdAccountsApi.md#campaigns_list) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**product_groups_analytics**](AdAccountsApi.md#product_groups_analytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


# **ad_account_analytics**
> AdAccountAnalyticsResponse ad_account_analytics(ad_account_id, start_date, end_date, columns, granularity)

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import ad_accounts_api
from pinterestsdk.model.granularity import Granularity
from pinterestsdk.model.ad_account_analytics_response import AdAccountAnalyticsResponse
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ad_accounts_api.AdAccountsApi(api_client)
    ad_account_id = "4" # str | Unique identifier of an ad account.
    start_date = dateutil_parser('1970-01-01').date() # date | Metric report start date (UTC). Format: YYYY-MM-DD
    end_date = dateutil_parser('1970-01-01').date() # date | Metric report end date (UTC). Format: YYYY-MM-DD
    columns = [
        "SPEND_IN_DOLLAR",
    ] # [str] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
    granularity = Granularity("DAY") # Granularity | Granularity
    click_window_days = 1 # int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) if omitted the server will use the default value of 30
    engagement_window_days = 30 # int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) if omitted the server will use the default value of 30
    view_window_days = 1 # int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) if omitted the server will use the default value of 1
    conversion_report_time = "TIME_OF_AD_ACTION" # str | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) if omitted the server will use the default value of "TIME_OF_AD_ACTION"

    # example passing only required values which don't have defaults set
    try:
        # Get ad account analytics
        api_response = api_instance.ad_account_analytics(ad_account_id, start_date, end_date, columns, granularity)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->ad_account_analytics: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get ad account analytics
        api_response = api_instance.ad_account_analytics(ad_account_id, start_date, end_date, columns, granularity, click_window_days=click_window_days, engagement_window_days=engagement_window_days, view_window_days=view_window_days, conversion_report_time=conversion_report_time)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->ad_account_analytics: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. |
 **start_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **end_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **columns** | **[str]**| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | **Granularity**| Granularity |
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] if omitted the server will use the default value of 30
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] if omitted the server will use the default value of 30
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] if omitted the server will use the default value of 1
 **conversion_report_time** | **str**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] if omitted the server will use the default value of "TIME_OF_AD_ACTION"

### Return type

[**AdAccountAnalyticsResponse**](AdAccountAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account analytics parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_list**
> bool, date, datetime, dict, float, int, list, str, none_type ad_accounts_list()

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import ad_accounts_api
from pinterestsdk.model.paginated import Paginated
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ad_accounts_api.AdAccountsApi(api_client)
    bookmark = "bookmark_example" # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) if omitted the server will use the default value of 25
    include_shared_accounts = True # bool | Include shared ad accounts (optional) if omitted the server will use the default value of True

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List ad accounts
        api_response = api_instance.ad_accounts_list(bookmark=bookmark, page_size=page_size, include_shared_accounts=include_shared_accounts)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->ad_accounts_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] if omitted the server will use the default value of 25
 **include_shared_accounts** | **bool**| Include shared ad accounts | [optional] if omitted the server will use the default value of True

### Return type

**bool, date, datetime, dict, float, int, list, str, none_type**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_analytics**
> AdGroupsAnalyticsResponse ad_groups_analytics(ad_account_id, start_date, end_date, ad_group_ids, columns, granularity)

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import ad_accounts_api
from pinterestsdk.model.granularity import Granularity
from pinterestsdk.model.error import Error
from pinterestsdk.model.ad_groups_analytics_response import AdGroupsAnalyticsResponse
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ad_accounts_api.AdAccountsApi(api_client)
    ad_account_id = "4" # str | Unique identifier of an ad account.
    start_date = dateutil_parser('1970-01-01').date() # date | Metric report start date (UTC). Format: YYYY-MM-DD
    end_date = dateutil_parser('1970-01-01').date() # date | Metric report end date (UTC). Format: YYYY-MM-DD
    ad_group_ids = [
        "4",
    ] # [str] | List of Ad group Ids to use to filter the results.
    columns = [
        "SPEND_IN_DOLLAR",
    ] # [str] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
    granularity = Granularity("DAY") # Granularity | Granularity
    click_window_days = 1 # int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) if omitted the server will use the default value of 30
    engagement_window_days = 30 # int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) if omitted the server will use the default value of 30
    view_window_days = 1 # int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) if omitted the server will use the default value of 1
    conversion_report_time = "TIME_OF_AD_ACTION" # str | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) if omitted the server will use the default value of "TIME_OF_AD_ACTION"

    # example passing only required values which don't have defaults set
    try:
        # Get ad group analytics
        api_response = api_instance.ad_groups_analytics(ad_account_id, start_date, end_date, ad_group_ids, columns, granularity)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->ad_groups_analytics: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get ad group analytics
        api_response = api_instance.ad_groups_analytics(ad_account_id, start_date, end_date, ad_group_ids, columns, granularity, click_window_days=click_window_days, engagement_window_days=engagement_window_days, view_window_days=view_window_days, conversion_report_time=conversion_report_time)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->ad_groups_analytics: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. |
 **start_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **end_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **ad_group_ids** | **[str]**| List of Ad group Ids to use to filter the results. |
 **columns** | **[str]**| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | **Granularity**| Granularity |
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] if omitted the server will use the default value of 30
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] if omitted the server will use the default value of 30
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] if omitted the server will use the default value of 1
 **conversion_report_time** | **str**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] if omitted the server will use the default value of "TIME_OF_AD_ACTION"

### Return type

[**AdGroupsAnalyticsResponse**](AdGroupsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account group analytics parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_list**
> bool, date, datetime, dict, float, int, list, str, none_type ad_groups_list(ad_account_id)

List ad groups

Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import ad_accounts_api
from pinterestsdk.model.paginated import Paginated
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ad_accounts_api.AdAccountsApi(api_client)
    ad_account_id = "4" # str | Unique identifier of an ad account.
    campaign_ids = [
        "4",
    ] # [str] | List of Campaign Ids to use to filter the results. (optional)
    ad_group_ids = [
        "4",
    ] # [str] | List of Ad group Ids to use to filter the results. (optional)
    entity_statuses = [
        "ACTIVE",
    ] # [str] | Entity status (optional)
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) if omitted the server will use the default value of 25
    order = "ASCENDING" # str | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    bookmark = "bookmark_example" # str | Cursor used to fetch the next page of items (optional)
    translate_interests_to_names = False # bool | Return interests as text names (if value is true) rather than topic IDs. (optional) if omitted the server will use the default value of False

    # example passing only required values which don't have defaults set
    try:
        # List ad groups
        api_response = api_instance.ad_groups_list(ad_account_id)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->ad_groups_list: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List ad groups
        api_response = api_instance.ad_groups_list(ad_account_id, campaign_ids=campaign_ids, ad_group_ids=ad_group_ids, entity_statuses=entity_statuses, page_size=page_size, order=order, bookmark=bookmark, translate_interests_to_names=translate_interests_to_names)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->ad_groups_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. |
 **campaign_ids** | **[str]**| List of Campaign Ids to use to filter the results. | [optional]
 **ad_group_ids** | **[str]**| List of Ad group Ids to use to filter the results. | [optional]
 **entity_statuses** | **[str]**| Entity status | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] if omitted the server will use the default value of 25
 **order** | **str**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional]
 **translate_interests_to_names** | **bool**| Return interests as text names (if value is true) rather than topic IDs. | [optional] if omitted the server will use the default value of False

### Return type

**bool, date, datetime, dict, float, int, list, str, none_type**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account group parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_analytics**
> AdsAnalyticsResponse ads_analytics(ad_account_id, start_date, end_date, ad_ids, columns, granularity)

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import ad_accounts_api
from pinterestsdk.model.granularity import Granularity
from pinterestsdk.model.ads_analytics_response import AdsAnalyticsResponse
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ad_accounts_api.AdAccountsApi(api_client)
    ad_account_id = "4" # str | Unique identifier of an ad account.
    start_date = dateutil_parser('1970-01-01').date() # date | Metric report start date (UTC). Format: YYYY-MM-DD
    end_date = dateutil_parser('1970-01-01').date() # date | Metric report end date (UTC). Format: YYYY-MM-DD
    ad_ids = [
        "4",
    ] # [str] | List of Ad Ids to use to filter the results.
    columns = [
        "SPEND_IN_DOLLAR",
    ] # [str] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
    granularity = Granularity("DAY") # Granularity | Granularity
    click_window_days = 1 # int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) if omitted the server will use the default value of 30
    engagement_window_days = 30 # int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) if omitted the server will use the default value of 30
    view_window_days = 1 # int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) if omitted the server will use the default value of 1
    conversion_report_time = "TIME_OF_AD_ACTION" # str | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) if omitted the server will use the default value of "TIME_OF_AD_ACTION"

    # example passing only required values which don't have defaults set
    try:
        # Get ad analytics
        api_response = api_instance.ads_analytics(ad_account_id, start_date, end_date, ad_ids, columns, granularity)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->ads_analytics: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get ad analytics
        api_response = api_instance.ads_analytics(ad_account_id, start_date, end_date, ad_ids, columns, granularity, click_window_days=click_window_days, engagement_window_days=engagement_window_days, view_window_days=view_window_days, conversion_report_time=conversion_report_time)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->ads_analytics: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. |
 **start_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **end_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **ad_ids** | **[str]**| List of Ad Ids to use to filter the results. |
 **columns** | **[str]**| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | **Granularity**| Granularity |
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] if omitted the server will use the default value of 30
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] if omitted the server will use the default value of 30
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] if omitted the server will use the default value of 1
 **conversion_report_time** | **str**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] if omitted the server will use the default value of "TIME_OF_AD_ACTION"

### Return type

[**AdsAnalyticsResponse**](AdsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account ads analytics parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_list**
> bool, date, datetime, dict, float, int, list, str, none_type ads_list(ad_account_id)

List ads

Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import ad_accounts_api
from pinterestsdk.model.paginated import Paginated
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ad_accounts_api.AdAccountsApi(api_client)
    ad_account_id = "4" # str | Unique identifier of an ad account.
    campaign_ids = [
        "4",
    ] # [str] | List of Campaign Ids to use to filter the results. (optional)
    ad_group_ids = [
        "4",
    ] # [str] | List of Ad group Ids to use to filter the results. (optional)
    ad_ids = [
        "4",
    ] # [str] | List of Ad Ids to use to filter the results. (optional)
    entity_statuses = [
        "ACTIVE",
    ] # [str] | Entity status (optional)
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) if omitted the server will use the default value of 25
    order = "ASCENDING" # str | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    bookmark = "bookmark_example" # str | Cursor used to fetch the next page of items (optional)

    # example passing only required values which don't have defaults set
    try:
        # List ads
        api_response = api_instance.ads_list(ad_account_id)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->ads_list: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List ads
        api_response = api_instance.ads_list(ad_account_id, campaign_ids=campaign_ids, ad_group_ids=ad_group_ids, ad_ids=ad_ids, entity_statuses=entity_statuses, page_size=page_size, order=order, bookmark=bookmark)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->ads_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. |
 **campaign_ids** | **[str]**| List of Campaign Ids to use to filter the results. | [optional]
 **ad_group_ids** | **[str]**| List of Ad group Ids to use to filter the results. | [optional]
 **ad_ids** | **[str]**| List of Ad Ids to use to filter the results. | [optional]
 **entity_statuses** | **[str]**| Entity status | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] if omitted the server will use the default value of 25
 **order** | **str**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional]

### Return type

**bool, date, datetime, dict, float, int, list, str, none_type**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account ads parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_create_report**
> AdsAnalyticsCreateAsyncResponse analytics_create_report(ad_account_id, ads_analytics_create_async_request)

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import ad_accounts_api
from pinterestsdk.model.ads_analytics_create_async_response import AdsAnalyticsCreateAsyncResponse
from pinterestsdk.model.error import Error
from pinterestsdk.model.ads_analytics_create_async_request import AdsAnalyticsCreateAsyncRequest
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ad_accounts_api.AdAccountsApi(api_client)
    ad_account_id = "4" # str | Unique identifier of an ad account.
    ads_analytics_create_async_request = AdsAnalyticsCreateAsyncRequest() # AdsAnalyticsCreateAsyncRequest | 

    # example passing only required values which don't have defaults set
    try:
        # Create async request for an account analytics report
        api_response = api_instance.analytics_create_report(ad_account_id, ads_analytics_create_async_request)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
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
**200** | Success |  -  |
**400** | Invalid ad account ads analytics parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_get_report**
> AdsAnalyticsGetAsyncResponse analytics_get_report(ad_account_id, token)

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import ad_accounts_api
from pinterestsdk.model.ads_analytics_get_async_response import AdsAnalyticsGetAsyncResponse
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ad_accounts_api.AdAccountsApi(api_client)
    ad_account_id = "4" # str | Unique identifier of an ad account.
    token = "token_example" # str | Token returned from the post request creation call

    # example passing only required values which don't have defaults set
    try:
        # Get the account analytics report created by the async call
        api_response = api_instance.analytics_get_report(ad_account_id, token)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
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
**200** | Success |  -  |
**400** | Invalid ad account ads analytics parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_analytics**
> CampaignsAnalyticsResponse campaigns_analytics(ad_account_id, start_date, end_date, campaign_ids, columns, granularity)

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import ad_accounts_api
from pinterestsdk.model.campaigns_analytics_response import CampaignsAnalyticsResponse
from pinterestsdk.model.granularity import Granularity
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ad_accounts_api.AdAccountsApi(api_client)
    ad_account_id = "4" # str | Unique identifier of an ad account.
    start_date = dateutil_parser('1970-01-01').date() # date | Metric report start date (UTC). Format: YYYY-MM-DD
    end_date = dateutil_parser('1970-01-01').date() # date | Metric report end date (UTC). Format: YYYY-MM-DD
    campaign_ids = [
        "4",
    ] # [str] | List of Campaign Ids to use to filter the results.
    columns = [
        "SPEND_IN_DOLLAR",
    ] # [str] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
    granularity = Granularity("DAY") # Granularity | Granularity
    click_window_days = 1 # int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) if omitted the server will use the default value of 30
    engagement_window_days = 30 # int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) if omitted the server will use the default value of 30
    view_window_days = 1 # int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) if omitted the server will use the default value of 1
    conversion_report_time = "TIME_OF_AD_ACTION" # str | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) if omitted the server will use the default value of "TIME_OF_AD_ACTION"

    # example passing only required values which don't have defaults set
    try:
        # Get campaign analytics
        api_response = api_instance.campaigns_analytics(ad_account_id, start_date, end_date, campaign_ids, columns, granularity)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->campaigns_analytics: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get campaign analytics
        api_response = api_instance.campaigns_analytics(ad_account_id, start_date, end_date, campaign_ids, columns, granularity, click_window_days=click_window_days, engagement_window_days=engagement_window_days, view_window_days=view_window_days, conversion_report_time=conversion_report_time)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->campaigns_analytics: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. |
 **start_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **end_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **campaign_ids** | **[str]**| List of Campaign Ids to use to filter the results. |
 **columns** | **[str]**| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | **Granularity**| Granularity |
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] if omitted the server will use the default value of 30
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] if omitted the server will use the default value of 30
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] if omitted the server will use the default value of 1
 **conversion_report_time** | **str**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] if omitted the server will use the default value of "TIME_OF_AD_ACTION"

### Return type

[**CampaignsAnalyticsResponse**](CampaignsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account campaign analytics parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_list**
> bool, date, datetime, dict, float, int, list, str, none_type campaigns_list(ad_account_id)

List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import ad_accounts_api
from pinterestsdk.model.paginated import Paginated
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ad_accounts_api.AdAccountsApi(api_client)
    ad_account_id = "4" # str | Unique identifier of an ad account.
    campaign_ids = [
        "4",
    ] # [str] | List of Campaign Ids to use to filter the results. (optional)
    entity_statuses = [
        "ACTIVE",
    ] # [str] | Entity status (optional)
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) if omitted the server will use the default value of 25
    order = "ASCENDING" # str | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    bookmark = "bookmark_example" # str | Cursor used to fetch the next page of items (optional)

    # example passing only required values which don't have defaults set
    try:
        # List campaigns
        api_response = api_instance.campaigns_list(ad_account_id)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->campaigns_list: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List campaigns
        api_response = api_instance.campaigns_list(ad_account_id, campaign_ids=campaign_ids, entity_statuses=entity_statuses, page_size=page_size, order=order, bookmark=bookmark)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->campaigns_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. |
 **campaign_ids** | **[str]**| List of Campaign Ids to use to filter the results. | [optional]
 **entity_statuses** | **[str]**| Entity status | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] if omitted the server will use the default value of 25
 **order** | **str**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional]

### Return type

**bool, date, datetime, dict, float, int, list, str, none_type**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account campaign parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_groups_analytics**
> ProductGroupAnalyticsResponse product_groups_analytics(ad_account_id, start_date, end_date, product_group_ids, columns, granularity)

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import ad_accounts_api
from pinterestsdk.model.granularity import Granularity
from pinterestsdk.model.product_group_analytics_response import ProductGroupAnalyticsResponse
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ad_accounts_api.AdAccountsApi(api_client)
    ad_account_id = "4" # str | Unique identifier of an ad account.
    start_date = dateutil_parser('1970-01-01').date() # date | Metric report start date (UTC). Format: YYYY-MM-DD
    end_date = dateutil_parser('1970-01-01').date() # date | Metric report end date (UTC). Format: YYYY-MM-DD
    product_group_ids = [
        "4",
    ] # [str] | List of Product group Ids to use to filter the results.
    columns = [
        "SPEND_IN_DOLLAR",
    ] # [str] | Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
    granularity = Granularity("DAY") # Granularity | Granularity
    click_window_days = 1 # int | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) if omitted the server will use the default value of 30
    engagement_window_days = 30 # int | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) if omitted the server will use the default value of 30
    view_window_days = 1 # int | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) if omitted the server will use the default value of 1
    conversion_report_time = "TIME_OF_AD_ACTION" # str | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) if omitted the server will use the default value of "TIME_OF_AD_ACTION"

    # example passing only required values which don't have defaults set
    try:
        # Get product group analytics
        api_response = api_instance.product_groups_analytics(ad_account_id, start_date, end_date, product_group_ids, columns, granularity)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->product_groups_analytics: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get product group analytics
        api_response = api_instance.product_groups_analytics(ad_account_id, start_date, end_date, product_group_ids, columns, granularity, click_window_days=click_window_days, engagement_window_days=engagement_window_days, view_window_days=view_window_days, conversion_report_time=conversion_report_time)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdAccountsApi->product_groups_analytics: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. |
 **start_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **end_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **product_group_ids** | **[str]**| List of Product group Ids to use to filter the results. |
 **columns** | **[str]**| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | **Granularity**| Granularity |
 **click_window_days** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] if omitted the server will use the default value of 30
 **engagement_window_days** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] if omitted the server will use the default value of 30
 **view_window_days** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] if omitted the server will use the default value of 1
 **conversion_report_time** | **str**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] if omitted the server will use the default value of "TIME_OF_AD_ACTION"

### Return type

[**ProductGroupAnalyticsResponse**](ProductGroupAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account ads analytics parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

