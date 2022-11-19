<a name="__pageTop"></a>
# pinterestsdk.apis.tags.user_account_api.UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_account_analytics**](#user_account_analytics) | **get** /user_account/analytics | Get user account analytics
[**user_account_analytics_top_pins**](#user_account_analytics_top_pins) | **get** /user_account/analytics/top_pins | Get user account top pins analytics
[**user_account_analytics_top_video_pins**](#user_account_analytics_top_video_pins) | **get** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**user_account_get**](#user_account_get) | **get** /user_account | Get user account

# **user_account_analytics**
<a name="user_account_analytics"></a>
> AnalyticsResponse user_account_analytics(start_dateend_date)

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import user_account_api
from pinterestsdk.model.analytics_response import AnalyticsResponse
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
    api_instance = user_account_api.UserAccountApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'start_date': "1970-01-01",
        'end_date': "1970-01-01",
    }
    try:
        # Get user account analytics
        api_response = api_instance.user_account_analytics(
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling UserAccountApi->user_account_analytics: %s\n" % e)

    # example passing only optional values
    query_params = {
        'start_date': "1970-01-01",
        'end_date': "1970-01-01",
        'from_claimed_content': "BOTH",
        'pin_format': "ALL",
        'app_types': "ALL",
        'metric_types': [
        "ENGAGEMENT"
    ],
        'split_field': "NO_SPLIT",
        'ad_account_id': "4",
    }
    try:
        # Get user account analytics
        api_response = api_instance.user_account_analytics(
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling UserAccountApi->user_account_analytics: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
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
from_claimed_content | FromClaimedContentSchema | | optional
pin_format | PinFormatSchema | | optional
app_types | AppTypesSchema | | optional
metric_types | MetricTypesSchema | | optional
split_field | SplitFieldSchema | | optional
ad_account_id | AdAccountIdSchema | | optional


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

# FromClaimedContentSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["OTHER", "CLAIMED", "BOTH", ] if omitted the server will use the default value of "BOTH"

# PinFormatSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["ALL", "PRODUCT", "REGULAR", "VIDEO", ] if omitted the server will use the default value of "ALL"

# AppTypesSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["ALL", "MOBILE", "TABLET", "WEB", ] if omitted the server will use the default value of "ALL"

# MetricTypesSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | must be one of ["ENGAGEMENT", "ENGAGEMENT_RATE", "IMPRESSION", "OUTBOUND_CLICK", "OUTBOUND_CLICK_RATE", "PIN_CLICK", "PIN_CLICK_RATE", "SAVE", "SAVE_RATE", ] 

# SplitFieldSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["NO_SPLIT", "APP_TYPE", "OWNED_CONTENT", "PIN_FORMAT", ] if omitted the server will use the default value of "NO_SPLIT"

# AdAccountIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#user_account_analytics.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#user_account_analytics.ApiResponseFor400) | Invalid user accounts analytics parameters.
403 | [ApiResponseFor403](#user_account_analytics.ApiResponseFor403) | Not authorized to access the user account analytics.
default | [ApiResponseForDefault](#user_account_analytics.ApiResponseForDefault) | Unexpected error

#### user_account_analytics.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AnalyticsResponse**](../../models/AnalyticsResponse.md) |  | 


#### user_account_analytics.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


#### user_account_analytics.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


#### user_account_analytics.ApiResponseForDefault
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

# **user_account_analytics_top_pins**
<a name="user_account_analytics_top_pins"></a>
> TopPinsAnalyticsResponse user_account_analytics_top_pins(start_dateend_datesort_by)

Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import user_account_api
from pinterestsdk.model.top_pins_analytics_response import TopPinsAnalyticsResponse
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
    api_instance = user_account_api.UserAccountApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'start_date': "1970-01-01",
        'end_date': "1970-01-01",
        'sort_by': "ENGAGEMENT",
    }
    try:
        # Get user account top pins analytics
        api_response = api_instance.user_account_analytics_top_pins(
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling UserAccountApi->user_account_analytics_top_pins: %s\n" % e)

    # example passing only optional values
    query_params = {
        'start_date': "1970-01-01",
        'end_date': "1970-01-01",
        'sort_by': "ENGAGEMENT",
        'from_claimed_content': "BOTH",
        'pin_format': "ALL",
        'app_types': "ALL",
        'metric_types': [
        "ENGAGEMENT"
    ],
        'num_of_pins': 25,
        'created_in_last_n_days': 30,
        'ad_account_id': "4",
    }
    try:
        # Get user account top pins analytics
        api_response = api_instance.user_account_analytics_top_pins(
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling UserAccountApi->user_account_analytics_top_pins: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
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
sort_by | SortBySchema | | 
from_claimed_content | FromClaimedContentSchema | | optional
pin_format | PinFormatSchema | | optional
app_types | AppTypesSchema | | optional
metric_types | MetricTypesSchema | | optional
num_of_pins | NumOfPinsSchema | | optional
created_in_last_n_days | CreatedInLastNDaysSchema | | optional
ad_account_id | AdAccountIdSchema | | optional


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

# SortBySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["ENGAGEMENT", "IMPRESSION", "OUTBOUND_CLICK", "PIN_CLICK", "SAVE", ] 

# FromClaimedContentSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["OTHER", "CLAIMED", "BOTH", ] if omitted the server will use the default value of "BOTH"

# PinFormatSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["ALL", "PRODUCT", "REGULAR", "VIDEO", ] if omitted the server will use the default value of "ALL"

# AppTypesSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["ALL", "MOBILE", "TABLET", "WEB", ] if omitted the server will use the default value of "ALL"

# MetricTypesSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | must be one of ["ENGAGEMENT", "ENGAGEMENT_RATE", "IMPRESSION", "OUTBOUND_CLICK", "OUTBOUND_CLICK_RATE", "PIN_CLICK", "PIN_CLICK_RATE", "SAVE", "SAVE_RATE", ] 

# NumOfPinsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | if omitted the server will use the default value of 10

# CreatedInLastNDaysSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | must be one of [30, ] 

# AdAccountIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#user_account_analytics_top_pins.ApiResponseFor200) | Success
403 | [ApiResponseFor403](#user_account_analytics_top_pins.ApiResponseFor403) | Not authorized to access the user account analytics.
default | [ApiResponseForDefault](#user_account_analytics_top_pins.ApiResponseForDefault) | Unexpected error

#### user_account_analytics_top_pins.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TopPinsAnalyticsResponse**](../../models/TopPinsAnalyticsResponse.md) |  | 


#### user_account_analytics_top_pins.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


#### user_account_analytics_top_pins.ApiResponseForDefault
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

# **user_account_analytics_top_video_pins**
<a name="user_account_analytics_top_video_pins"></a>
> TopVideoPinsAnalyticsResponse user_account_analytics_top_video_pins(start_dateend_datesort_by)

Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import user_account_api
from pinterestsdk.model.top_video_pins_analytics_response import TopVideoPinsAnalyticsResponse
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
    api_instance = user_account_api.UserAccountApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'start_date': "1970-01-01",
        'end_date': "1970-01-01",
        'sort_by': "IMPRESSION",
    }
    try:
        # Get user account top video pins analytics
        api_response = api_instance.user_account_analytics_top_video_pins(
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling UserAccountApi->user_account_analytics_top_video_pins: %s\n" % e)

    # example passing only optional values
    query_params = {
        'start_date': "1970-01-01",
        'end_date': "1970-01-01",
        'sort_by': "IMPRESSION",
        'from_claimed_content': "BOTH",
        'pin_format': "ALL",
        'app_types': "ALL",
        'metric_types': [
        "IMPRESSION"
    ],
        'num_of_pins': 25,
        'created_in_last_n_days': 30,
        'ad_account_id': "4",
    }
    try:
        # Get user account top video pins analytics
        api_response = api_instance.user_account_analytics_top_video_pins(
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling UserAccountApi->user_account_analytics_top_video_pins: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
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
sort_by | SortBySchema | | 
from_claimed_content | FromClaimedContentSchema | | optional
pin_format | PinFormatSchema | | optional
app_types | AppTypesSchema | | optional
metric_types | MetricTypesSchema | | optional
num_of_pins | NumOfPinsSchema | | optional
created_in_last_n_days | CreatedInLastNDaysSchema | | optional
ad_account_id | AdAccountIdSchema | | optional


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

# SortBySchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["IMPRESSION", "SAVE", "OUTBOUND_CLICK", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START", ] 

# FromClaimedContentSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["OTHER", "CLAIMED", "BOTH", ] if omitted the server will use the default value of "BOTH"

# PinFormatSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["ALL", "PRODUCT", "REGULAR", "VIDEO", ] if omitted the server will use the default value of "ALL"

# AppTypesSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | must be one of ["ALL", "MOBILE", "TABLET", "WEB", ] if omitted the server will use the default value of "ALL"

# MetricTypesSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | must be one of ["IMPRESSION", "SAVE", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START", "OUTBOUND_CLICK", ] 

# NumOfPinsSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | if omitted the server will use the default value of 10

# CreatedInLastNDaysSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
decimal.Decimal, int,  | decimal.Decimal,  |  | must be one of [30, ] 

# AdAccountIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#user_account_analytics_top_video_pins.ApiResponseFor200) | Success
403 | [ApiResponseFor403](#user_account_analytics_top_video_pins.ApiResponseFor403) | Not authorized to access the user account analytics.
default | [ApiResponseForDefault](#user_account_analytics_top_video_pins.ApiResponseForDefault) | Unexpected error

#### user_account_analytics_top_video_pins.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TopVideoPinsAnalyticsResponse**](../../models/TopVideoPinsAnalyticsResponse.md) |  | 


#### user_account_analytics_top_video_pins.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


#### user_account_analytics_top_video_pins.ApiResponseForDefault
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

# **user_account_get**
<a name="user_account_get"></a>
> Account user_account_get()

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import user_account_api
from pinterestsdk.model.account import Account
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
    api_instance = user_account_api.UserAccountApi(api_client)

    # example passing only optional values
    query_params = {
        'ad_account_id': "4",
    }
    try:
        # Get user account
        api_response = api_instance.user_account_get(
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling UserAccountApi->user_account_get: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
query_params | RequestQueryParams | |
accept_content_types | typing.Tuple[str] | default is ('application/json', ) | Tells the server the content type(s) that are accepted by the client
stream | bool | default is False | if True then the response.content will be streamed and loaded from a file like object. When downloading a file, set this to True to force the code to deserialize the content to a FileSchema file
timeout | typing.Optional[typing.Union[int, typing.Tuple]] | default is None | the timeout used by the rest client
skip_deserialization | bool | default is False | when True, headers and body will be unset and an instance of api_client.ApiResponseWithoutDeserialization will be returned

### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | optional


# AdAccountIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#user_account_get.ApiResponseFor200) | response
403 | [ApiResponseFor403](#user_account_get.ApiResponseFor403) | Not authorized to access the user account.
default | [ApiResponseForDefault](#user_account_get.ApiResponseForDefault) | Unexpected error

#### user_account_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Account**](../../models/Account.md) |  | 


#### user_account_get.ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


#### user_account_get.ApiResponseForDefault
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

