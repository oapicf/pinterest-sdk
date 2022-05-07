# openapi_client.UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**user_account_analytics**](UserAccountApi.md#user_account_analytics) | **GET** /user_account/analytics | Get user account analytics
[**user_account_get**](UserAccountApi.md#user_account_get) | **GET** /user_account | Get user account

# **user_account_analytics**
> AnalyticsResponse user_account_analytics(start_dateend_date)

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import openapi_client
from openapi_client.api import user_account_api
from openapi_client.model.analytics_response import AnalyticsResponse
from openapi_client.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'
# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = user_account_api.UserAccountApi(api_client)

    # example passing only required values which don't have defaults set
    query_params = {
        'start_date': isoparse('1970-01-01').date(),
        'end_date': isoparse('1970-01-01').date(),
    }
    try:
        # Get user account analytics
        api_response = api_instance.user_account_analytics(
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling UserAccountApi->user_account_analytics: %s\n" % e)

    # example passing only optional values
    query_params = {
        'start_date': isoparse('1970-01-01').date(),
        'end_date': isoparse('1970-01-01').date(),
        'from_claimed_content': "BOTH",
        'pin_format': "ALL",
        'app_types': "ALL",
        'metric_types': [
        "ENGAGEMENT",
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
    except openapi_client.ApiException as e:
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


#### StartDateSchema

Type | Description | Notes
------------- | ------------- | -------------
**date** |  | 

#### EndDateSchema

Type | Description | Notes
------------- | ------------- | -------------
**date** |  | 

#### FromClaimedContentSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | defaults to "BOTH",  must be one of ["OTHER", "CLAIMED", "BOTH", ]

#### PinFormatSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | defaults to "ALL",  must be one of ["ALL", "PRODUCT", "REGULAR", "VIDEO", ]

#### AppTypesSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | defaults to "ALL",  must be one of ["ALL", "MOBILE", "TABLET", "WEB", ]

#### MetricTypesSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### SplitFieldSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | defaults to "NO_SPLIT",  must be one of ["NO_SPLIT", "APP_TYPE", "OWNED_CONTENT", "PIN_FORMAT", ]

#### AdAccountIdSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | Success 
403 | ApiResponseFor403 | Not authorized to access the user account analytics. 
default | ApiResponseForDefault | Unexpected error 

#### ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AnalyticsResponse**](AnalyticsResponse.md) |  | 


#### ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 


#### ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor0ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 



[**AnalyticsResponse**](AnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_get**
> Account user_account_get()

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/api/v5/#tag/Understanding-business-access'>Understanding Business Access</a> for more information.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import openapi_client
from openapi_client.api import user_account_api
from openapi_client.model.error import Error
from openapi_client.model.account import Account
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'
# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
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
    except openapi_client.ApiException as e:
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


#### AdAccountIdSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | response 
403 | ApiResponseFor403 | Not authorized to access the user account. 
default | ApiResponseForDefault | Unexpected error 

#### ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Account**](Account.md) |  | 


#### ApiResponseFor403
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor403ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor403ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 


#### ApiResponseForDefault
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor0ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor0ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](Error.md) |  | 



[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

