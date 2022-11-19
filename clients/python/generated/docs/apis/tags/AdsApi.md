<a name="__pageTop"></a>
# pinterestsdk.apis.tags.ads_api.AdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_previews_create**](#ad_previews_create) | **post** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**ad_targeting_analytics_get**](#ad_targeting_analytics_get) | **get** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**ads_analytics**](#ads_analytics) | **get** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**ads_create**](#ads_create) | **post** /ad_accounts/{ad_account_id}/ads | Create ads
[**ads_get**](#ads_get) | **get** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**ads_list**](#ads_list) | **get** /ad_accounts/{ad_account_id}/ads | List ads
[**ads_update**](#ads_update) | **patch** /ad_accounts/{ad_account_id}/ads | Update ads

# **ad_previews_create**
<a name="ad_previews_create"></a>
> AdPreviewURLResponse ad_previews_create(ad_account_idad_preview_request)

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import ads_api
from pinterestsdk.model.ad_preview_request import AdPreviewRequest
from pinterestsdk.model.ad_preview_url_response import AdPreviewURLResponse
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
    api_instance = ads_api.AdsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    body = AdPreviewRequest(None)
    try:
        # Create ad preview with pin or image
        api_response = api_instance.ad_previews_create(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdsApi->ad_previews_create: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AdPreviewRequest**](../../models/AdPreviewRequest.md) |  | 


### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

# AdAccountIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#ad_previews_create.ApiResponseFor200) | Successful ad preview creation.
400 | [ApiResponseFor400](#ad_previews_create.ApiResponseFor400) | Invalid Pin parameters response
default | [ApiResponseForDefault](#ad_previews_create.ApiResponseForDefault) | Unexpected error

#### ad_previews_create.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AdPreviewURLResponse**](../../models/AdPreviewURLResponse.md) |  | 


#### ad_previews_create.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


#### ad_previews_create.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


### Authorization

[pinterest_oauth2](../../../README.md#pinterest_oauth2)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **ad_targeting_analytics_get**
<a name="ad_targeting_analytics_get"></a>
> MetricsResponse ad_targeting_analytics_get(ad_account_idad_idsstart_dateend_datetargeting_typescolumnsgranularity)

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import ads_api
from pinterestsdk.model.metrics_response import MetricsResponse
from pinterestsdk.model.conversion_report_attribution_type import ConversionReportAttributionType
from pinterestsdk.model.granularity import Granularity
from pinterestsdk.model.ads_analytics_targeting_type import AdsAnalyticsTargetingType
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
    api_instance = ads_api.AdsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'ad_ids': [
        "4"
    ],
        'start_date': "1970-01-01",
        'end_date': "1970-01-01",
        'targeting_types': [
        AdsAnalyticsTargetingType("APPTYPE")
    ],
        'columns': [
        "SPEND_IN_DOLLAR"
    ],
        'granularity': Granularity("DAY"),
    }
    try:
        # Get targeting analytics for ads
        api_response = api_instance.ad_targeting_analytics_get(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdsApi->ad_targeting_analytics_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'ad_ids': [
        "4"
    ],
        'start_date': "1970-01-01",
        'end_date': "1970-01-01",
        'targeting_types': [
        AdsAnalyticsTargetingType("APPTYPE")
    ],
        'columns': [
        "SPEND_IN_DOLLAR"
    ],
        'granularity': Granularity("DAY"),
        'click_window_days': 1,
        'engagement_window_days': 30,
        'view_window_days': 1,
        'conversion_report_time': "TIME_OF_AD_ACTION",
        'attribution_types': ConversionReportAttributionType("INDIVIDUAL"),
    }
    try:
        # Get targeting analytics for ads
        api_response = api_instance.ad_targeting_analytics_get(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdsApi->ad_targeting_analytics_get: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_ids | AdIdsSchema | | 
start_date | StartDateSchema | | 
end_date | EndDateSchema | | 
targeting_types | TargetingTypesSchema | | 
columns | ColumnsSchema | | 
granularity | GranularitySchema | | 
click_window_days | ClickWindowDaysSchema | | optional
engagement_window_days | EngagementWindowDaysSchema | | optional
view_window_days | ViewWindowDaysSchema | | optional
conversion_report_time | ConversionReportTimeSchema | | optional
attribution_types | AttributionTypesSchema | | optional


# AdIdsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# StartDateSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

# EndDateSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

# TargetingTypesSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**AdsAnalyticsTargetingType**]({{complexTypePrefix}}AdsAnalyticsTargetingType.md) | [**AdsAnalyticsTargetingType**]({{complexTypePrefix}}AdsAnalyticsTargetingType.md) | [**AdsAnalyticsTargetingType**]({{complexTypePrefix}}AdsAnalyticsTargetingType.md) |  | 

# ColumnsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  | Name of the reporting column | must be one of ["ADVERTISER_ID", "PIN_PROMOTION_ID", "AD_ACCOUNT_ID", "AD_GROUP_ENTITY_STATUS", "AD_GROUP_ID", "AD_ID", "CAMPAIGN_DAILY_SPEND_CAP", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_ID", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_NAME", "CHECKOUT_ROAS", "CLICKTHROUGH_1", "CLICKTHROUGH_1_GROSS", "CLICKTHROUGH_2", "CPC_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "CPM_IN_MICRO_DOLLAR", "CTR", "CTR_2", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "ECPC_IN_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPE_IN_DOLLAR", "ECPM_IN_MICRO_DOLLAR", "ECPV_IN_DOLLAR", "ECTR", "EENGAGEMENT_RATE", "ENGAGEMENT_1", "ENGAGEMENT_2", "ENGAGEMENT_RATE", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "IMPRESSION_1", "IMPRESSION_1_GROSS", "IMPRESSION_2", "INAPP_CHECKOUT_COST_PER_ACTION", "OUTBOUND_CLICK_1", "OUTBOUND_CLICK_2", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "PAID_IMPRESSION", "PIN_ID", "REPIN_1", "REPIN_2", "REPIN_RATE", "SPEND_IN_DOLLAR", "SPEND_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICKTHROUGH", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CONVERSIONS", "TOTAL_CUSTOM", "TOTAL_ENGAGEMENT", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "TOTAL_IMPRESSION_FREQUENCY", "TOTAL_IMPRESSION_USER", "TOTAL_LEAD", "TOTAL_OFFLINE_CHECKOUT", "TOTAL_PAGE_VISIT", "TOTAL_REPIN_RATE", "TOTAL_SIGNUP", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "VIDEO_3SEC_VIEWS_2", "VIDEO_LENGTH", "VIDEO_MRC_VIEWS_2", "VIDEO_P0_COMBINED_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", ] 

# GranularitySchema
Type | Description  | Notes
------------- | ------------- | -------------
[**Granularity**](../../models/Granularity.md) |  | 


# ClickWindowDaysSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | must be one of [1, 7, 30, 60, ] if omitted the server will use the default value of 30

# EngagementWindowDaysSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | must be one of [1, 7, 30, 60, ] if omitted the server will use the default value of 30

# ViewWindowDaysSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | must be one of [1, 7, 30, 60, ] if omitted the server will use the default value of 1

# ConversionReportTimeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION", ] if omitted the server will use the default value of "TIME_OF_AD_ACTION"

# AttributionTypesSchema
Type | Description  | Notes
------------- | ------------- | -------------
[**ConversionReportAttributionType**](../../models/ConversionReportAttributionType.md) |  | 


### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

# AdAccountIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#ad_targeting_analytics_get.ApiResponseFor200) | Success
default | [ApiResponseForDefault](#ad_targeting_analytics_get.ApiResponseForDefault) | Unexpected error

#### ad_targeting_analytics_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**MetricsResponse**](../../models/MetricsResponse.md) |  | 


#### ad_targeting_analytics_get.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


### Authorization

[pinterest_oauth2](../../../README.md#pinterest_oauth2)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **ads_analytics**
<a name="ads_analytics"></a>
> AdsAnalyticsResponse ads_analytics(ad_account_idstart_dateend_datead_idscolumnsgranularity)

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import ads_api
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
    api_instance = ads_api.AdsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'start_date': "1970-01-01",
        'end_date': "1970-01-01",
        'ad_ids': [
        "4"
    ],
        'columns': [
        "SPEND_IN_DOLLAR"
    ],
        'granularity': Granularity("DAY"),
    }
    try:
        # Get ad analytics
        api_response = api_instance.ads_analytics(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdsApi->ads_analytics: %s\n" % e)

    # example passing only optional values
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'start_date': "1970-01-01",
        'end_date': "1970-01-01",
        'ad_ids': [
        "4"
    ],
        'columns': [
        "SPEND_IN_DOLLAR"
    ],
        'granularity': Granularity("DAY"),
        'click_window_days': 1,
        'engagement_window_days': 30,
        'view_window_days': 1,
        'conversion_report_time': "TIME_OF_AD_ACTION",
    }
    try:
        # Get ad analytics
        api_response = api_instance.ads_analytics(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdsApi->ads_analytics: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
start_date | StartDateSchema | | 
end_date | EndDateSchema | | 
ad_ids | AdIdsSchema | | 
columns | ColumnsSchema | | 
granularity | GranularitySchema | | 
click_window_days | ClickWindowDaysSchema | | optional
engagement_window_days | EngagementWindowDaysSchema | | optional
view_window_days | ViewWindowDaysSchema | | optional
conversion_report_time | ConversionReportTimeSchema | | optional


# StartDateSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

# EndDateSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str, date,  | str,  |  | value must conform to RFC-3339 full-date YYYY-MM-DD

# AdIdsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# ColumnsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  | Name of the reporting column | must be one of ["ADVERTISER_ID", "PIN_PROMOTION_ID", "AD_ACCOUNT_ID", "AD_GROUP_ENTITY_STATUS", "AD_GROUP_ID", "AD_ID", "CAMPAIGN_DAILY_SPEND_CAP", "CAMPAIGN_ENTITY_STATUS", "CAMPAIGN_ID", "CAMPAIGN_LIFETIME_SPEND_CAP", "CAMPAIGN_NAME", "CHECKOUT_ROAS", "CLICKTHROUGH_1", "CLICKTHROUGH_1_GROSS", "CLICKTHROUGH_2", "CPC_IN_MICRO_DOLLAR", "CPM_IN_DOLLAR", "CPM_IN_MICRO_DOLLAR", "CTR", "CTR_2", "ECPCV_IN_DOLLAR", "ECPCV_P95_IN_DOLLAR", "ECPC_IN_DOLLAR", "ECPC_IN_MICRO_DOLLAR", "ECPE_IN_DOLLAR", "ECPM_IN_MICRO_DOLLAR", "ECPV_IN_DOLLAR", "ECTR", "EENGAGEMENT_RATE", "ENGAGEMENT_1", "ENGAGEMENT_2", "ENGAGEMENT_RATE", "IDEA_PIN_PRODUCT_TAG_VISIT_1", "IDEA_PIN_PRODUCT_TAG_VISIT_2", "IMPRESSION_1", "IMPRESSION_1_GROSS", "IMPRESSION_2", "INAPP_CHECKOUT_COST_PER_ACTION", "OUTBOUND_CLICK_1", "OUTBOUND_CLICK_2", "PAGE_VISIT_COST_PER_ACTION", "PAGE_VISIT_ROAS", "PAID_IMPRESSION", "PIN_ID", "REPIN_1", "REPIN_2", "REPIN_RATE", "SPEND_IN_DOLLAR", "SPEND_IN_MICRO_DOLLAR", "TOTAL_CHECKOUT", "TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICKTHROUGH", "TOTAL_CLICK_ADD_TO_CART", "TOTAL_CLICK_CHECKOUT", "TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_CLICK_LEAD", "TOTAL_CLICK_SIGNUP", "TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_CONVERSIONS", "TOTAL_CUSTOM", "TOTAL_ENGAGEMENT", "TOTAL_ENGAGEMENT_CHECKOUT", "TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_ENGAGEMENT_LEAD", "TOTAL_ENGAGEMENT_SIGNUP", "TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT", "TOTAL_IMPRESSION_FREQUENCY", "TOTAL_IMPRESSION_USER", "TOTAL_LEAD", "TOTAL_OFFLINE_CHECKOUT", "TOTAL_PAGE_VISIT", "TOTAL_REPIN_RATE", "TOTAL_SIGNUP", "TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIDEO_3SEC_VIEWS", "TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND", "TOTAL_VIDEO_MRC_VIEWS", "TOTAL_VIDEO_P0_COMBINED", "TOTAL_VIDEO_P100_COMPLETE", "TOTAL_VIDEO_P25_COMBINED", "TOTAL_VIDEO_P50_COMBINED", "TOTAL_VIDEO_P75_COMBINED", "TOTAL_VIDEO_P95_COMBINED", "TOTAL_VIEW_ADD_TO_CART", "TOTAL_VIEW_CHECKOUT", "TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_VIEW_LEAD", "TOTAL_VIEW_SIGNUP", "TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CHECKOUT", "TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_CLICK_CHECKOUT", "TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_ENGAGEMENT_CHECKOUT", "TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "TOTAL_WEB_SESSIONS", "TOTAL_WEB_VIEW_CHECKOUT", "TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR", "VIDEO_3SEC_VIEWS_2", "VIDEO_LENGTH", "VIDEO_MRC_VIEWS_2", "VIDEO_P0_COMBINED_2", "VIDEO_P100_COMPLETE_2", "VIDEO_P25_COMBINED_2", "VIDEO_P50_COMBINED_2", "VIDEO_P75_COMBINED_2", "VIDEO_P95_COMBINED_2", "WEB_CHECKOUT_COST_PER_ACTION", "WEB_CHECKOUT_ROAS", "WEB_SESSIONS_1", "WEB_SESSIONS_2", ] 

# GranularitySchema
Type | Description  | Notes
------------- | ------------- | -------------
[**Granularity**](../../models/Granularity.md) |  | 


# ClickWindowDaysSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | must be one of [1, 7, 30, 60, ] if omitted the server will use the default value of 30

# EngagementWindowDaysSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | must be one of [1, 7, 30, 60, ] if omitted the server will use the default value of 30

# ViewWindowDaysSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | must be one of [1, 7, 30, 60, ] if omitted the server will use the default value of 1

# ConversionReportTimeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION", ] if omitted the server will use the default value of "TIME_OF_AD_ACTION"

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

# AdAccountIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#ads_analytics.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#ads_analytics.ApiResponseFor400) | Invalid ad account ads analytics parameters.
default | [ApiResponseForDefault](#ads_analytics.ApiResponseForDefault) | Unexpected error

#### ads_analytics.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AdsAnalyticsResponse**](../../models/AdsAnalyticsResponse.md) |  | 


#### ads_analytics.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


#### ads_analytics.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


### Authorization

[pinterest_oauth2](../../../README.md#pinterest_oauth2)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **ads_create**
<a name="ads_create"></a>
> AdArrayResponse ads_create(ad_account_idad_create_request)

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import ads_api
from pinterestsdk.model.ad_create_request import AdCreateRequest
from pinterestsdk.model.error import Error
from pinterestsdk.model.ad_array_response import AdArrayResponse
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
    api_instance = ads_api.AdsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    body = [
        AdCreateRequest(None)
    ]
    try:
        # Create ads
        api_response = api_instance.ads_create(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdsApi->ads_create: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**AdCreateRequest**]({{complexTypePrefix}}AdCreateRequest.md) | [**AdCreateRequest**]({{complexTypePrefix}}AdCreateRequest.md) | [**AdCreateRequest**]({{complexTypePrefix}}AdCreateRequest.md) |  | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

# AdAccountIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#ads_create.ApiResponseFor200) | Success
default | [ApiResponseForDefault](#ads_create.ApiResponseForDefault) | Unexpected error

#### ads_create.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AdArrayResponse**](../../models/AdArrayResponse.md) |  | 


#### ads_create.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


### Authorization

[pinterest_oauth2](../../../README.md#pinterest_oauth2)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **ads_get**
<a name="ads_get"></a>
> AdResponse ads_get(ad_account_idad_id)

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import ads_api
from pinterestsdk.model.ad_response import AdResponse
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
    api_instance = ads_api.AdsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
        'ad_id': "4",
    }
    try:
        # Get ad
        api_response = api_instance.ads_get(
            path_params=path_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdsApi->ads_get: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 
ad_id | AdIdSchema | | 

# AdAccountIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# AdIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#ads_get.ApiResponseFor200) | Success
default | [ApiResponseForDefault](#ads_get.ApiResponseForDefault) | Unexpected error

#### ads_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AdResponse**](../../models/AdResponse.md) |  | 


#### ads_get.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


### Authorization

[pinterest_oauth2](../../../README.md#pinterest_oauth2)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **ads_list**
<a name="ads_list"></a>
> bool, date, datetime, dict, float, int, list, str, none_type ads_list(ad_account_id)

List ads

List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import ads_api
from pinterestsdk.model.paginated import Paginated
from pinterestsdk.model.ad_response import AdResponse
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
    api_instance = ads_api.AdsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
    }
    try:
        # List ads
        api_response = api_instance.ads_list(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdsApi->ads_list: %s\n" % e)

    # example passing only optional values
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'campaign_ids': [
        "4"
    ],
        'ad_group_ids': [
        "4"
    ],
        'ad_ids': [
        "4"
    ],
        'entity_statuses': [
        "ACTIVE"
    ],
        'page_size': 25,
        'order': "ASCENDING",
        'bookmark': "bookmark_example",
    }
    try:
        # List ads
        api_response = api_instance.ads_list(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdsApi->ads_list: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
path_params | RequestPathParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
campaign_ids | CampaignIdsSchema | | optional
ad_group_ids | AdGroupIdsSchema | | optional
ad_ids | AdIdsSchema | | optional
entity_statuses | EntityStatusesSchema | | optional
page_size | PageSizeSchema | | optional
order | OrderSchema | | optional
bookmark | BookmarkSchema | | optional


# CampaignIdsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# AdGroupIdsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# AdIdsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# EntityStatusesSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | must be one of ["ACTIVE", "PAUSED", "ARCHIVED", ] 

# PageSizeSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | if omitted the server will use the default value of 25

# OrderSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["ASCENDING", "DESCENDING", ] 

# BookmarkSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

# AdAccountIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#ads_list.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#ads_list.ApiResponseFor400) | Invalid ad account ads parameters.
default | [ApiResponseForDefault](#ads_list.ApiResponseForDefault) | Unexpected error

#### ads_list.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[Paginated]({{complexTypePrefix}}Paginated.md) | [**Paginated**]({{complexTypePrefix}}Paginated.md) | [**Paginated**]({{complexTypePrefix}}Paginated.md) |  | 
[all_of_1](#all_of_1) | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# all_of_1

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[items](#items)** | list, tuple,  | tuple,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**AdResponse**]({{complexTypePrefix}}AdResponse.md) | [**AdResponse**]({{complexTypePrefix}}AdResponse.md) | [**AdResponse**]({{complexTypePrefix}}AdResponse.md) |  | 

#### ads_list.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


#### ads_list.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


### Authorization

[pinterest_oauth2](../../../README.md#pinterest_oauth2)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

# **ads_update**
<a name="ads_update"></a>
> AdArrayResponse ads_update(ad_account_idad_update_request)

Update ads

Update multiple existing ads

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import ads_api
from pinterestsdk.model.ad_update_request import AdUpdateRequest
from pinterestsdk.model.error import Error
from pinterestsdk.model.ad_array_response import AdArrayResponse
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
    api_instance = ads_api.AdsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    body = [
        AdUpdateRequest(None)
    ]
    try:
        # Update ads
        api_response = api_instance.ads_update(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling AdsApi->ads_update: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
path_params | RequestPathParams | |
content_type | str | optional, default is 'application/json' | Selects the schema and serialization of the request body
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### body

# SchemaForRequestBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**AdUpdateRequest**]({{complexTypePrefix}}AdUpdateRequest.md) | [**AdUpdateRequest**]({{complexTypePrefix}}AdUpdateRequest.md) | [**AdUpdateRequest**]({{complexTypePrefix}}AdUpdateRequest.md) |  | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

# AdAccountIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#ads_update.ApiResponseFor200) | Success
default | [ApiResponseForDefault](#ads_update.ApiResponseForDefault) | Unexpected error

#### ads_update.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AdArrayResponse**](../../models/AdArrayResponse.md) |  | 


#### ads_update.ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor0ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


### Authorization

[pinterest_oauth2](../../../README.md#pinterest_oauth2)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

