# openapi_client.AdAccountsApi

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
> AdAccountAnalyticsResponse ad_account_analytics(ad_account_idstart_dateend_datecolumnsgranularity)

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import openapi_client
from openapi_client.api import ad_accounts_api
from openapi_client.model.error import Error
from openapi_client.model.ad_account_analytics_response import AdAccountAnalyticsResponse
from openapi_client.model.granularity import Granularity
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
    api_instance = ad_accounts_api.AdAccountsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'start_date': isoparse('1970-01-01').date(),
        'end_date': isoparse('1970-01-01').date(),
        'columns': [
        "SPEND_IN_DOLLAR",
    ],
        'granularity': Granularity("DAY"),
    }
    try:
        # Get ad account analytics
        api_response = api_instance.ad_account_analytics(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->ad_account_analytics: %s\n" % e)

    # example passing only optional values
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'start_date': isoparse('1970-01-01').date(),
        'end_date': isoparse('1970-01-01').date(),
        'columns': [
        "SPEND_IN_DOLLAR",
    ],
        'granularity': Granularity("DAY"),
        'click_window_days': 1,
        'engagement_window_days': 30,
        'view_window_days': 1,
        'conversion_report_time': "TIME_OF_AD_ACTION",
    }
    try:
        # Get ad account analytics
        api_response = api_instance.ad_account_analytics(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->ad_account_analytics: %s\n" % e)
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
columns | ColumnsSchema | | 
granularity | GranularitySchema | | 
click_window_days | ClickWindowDaysSchema | | optional
engagement_window_days | EngagementWindowDaysSchema | | optional
view_window_days | ViewWindowDaysSchema | | optional
conversion_report_time | ConversionReportTimeSchema | | optional


#### StartDateSchema

Type | Description | Notes
------------- | ------------- | -------------
**date** |  | 

#### EndDateSchema

Type | Description | Notes
------------- | ------------- | -------------
**date** |  | 

#### ColumnsSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### GranularitySchema
Type | Description  | Notes
------------- | ------------- | -------------
[**Granularity**](Granularity.md) |  | 


#### ClickWindowDaysSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 30,  must be one of [1, 7, 30, 60, ]

#### EngagementWindowDaysSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 30,  must be one of [1, 7, 30, 60, ]

#### ViewWindowDaysSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 1,  must be one of [1, 7, 30, 60, ]

#### ConversionReportTimeSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | defaults to "TIME_OF_AD_ACTION",  must be one of ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION", ]

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

#### AdAccountIdSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | Success 
400 | ApiResponseFor400 | Invalid ad account analytics parameters. 
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
[**AdAccountAnalyticsResponse**](AdAccountAnalyticsResponse.md) |  | 


#### ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor400ResponseBodyApplicationJson
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



[**AdAccountAnalyticsResponse**](AdAccountAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_list**
> object ad_accounts_list()

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import openapi_client
from openapi_client.api import ad_accounts_api
from openapi_client.model.paginated import Paginated
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
    api_instance = ad_accounts_api.AdAccountsApi(api_client)

    # example passing only optional values
    query_params = {
        'bookmark': "bookmark_example",
        'page_size': 25,
        'include_shared_accounts': True,
    }
    try:
        # List ad accounts
        api_response = api_instance.ad_accounts_list(
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->ad_accounts_list: %s\n" % e)
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
bookmark | BookmarkSchema | | optional
page_size | PageSizeSchema | | optional
include_shared_accounts | IncludeSharedAccountsSchema | | optional


#### BookmarkSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

#### PageSizeSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 25

#### IncludeSharedAccountsSchema

Type | Description | Notes
------------- | ------------- | -------------
**bool** |  | defaults to True

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | response 
default | ApiResponseForDefault | Unexpected error 

#### ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor200ResponseBodyApplicationJson

#### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

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



**object**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_analytics**
> AdGroupsAnalyticsResponse ad_groups_analytics(ad_account_idstart_dateend_datead_group_idscolumnsgranularity)

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import openapi_client
from openapi_client.api import ad_accounts_api
from openapi_client.model.error import Error
from openapi_client.model.granularity import Granularity
from openapi_client.model.ad_groups_analytics_response import AdGroupsAnalyticsResponse
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
    api_instance = ad_accounts_api.AdAccountsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'start_date': isoparse('1970-01-01').date(),
        'end_date': isoparse('1970-01-01').date(),
        'ad_group_ids': [
        "4",
    ],
        'columns': [
        "SPEND_IN_DOLLAR",
    ],
        'granularity': Granularity("DAY"),
    }
    try:
        # Get ad group analytics
        api_response = api_instance.ad_groups_analytics(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->ad_groups_analytics: %s\n" % e)

    # example passing only optional values
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'start_date': isoparse('1970-01-01').date(),
        'end_date': isoparse('1970-01-01').date(),
        'ad_group_ids': [
        "4",
    ],
        'columns': [
        "SPEND_IN_DOLLAR",
    ],
        'granularity': Granularity("DAY"),
        'click_window_days': 1,
        'engagement_window_days': 30,
        'view_window_days': 1,
        'conversion_report_time': "TIME_OF_AD_ACTION",
    }
    try:
        # Get ad group analytics
        api_response = api_instance.ad_groups_analytics(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->ad_groups_analytics: %s\n" % e)
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
ad_group_ids | AdGroupIdsSchema | | 
columns | ColumnsSchema | | 
granularity | GranularitySchema | | 
click_window_days | ClickWindowDaysSchema | | optional
engagement_window_days | EngagementWindowDaysSchema | | optional
view_window_days | ViewWindowDaysSchema | | optional
conversion_report_time | ConversionReportTimeSchema | | optional


#### StartDateSchema

Type | Description | Notes
------------- | ------------- | -------------
**date** |  | 

#### EndDateSchema

Type | Description | Notes
------------- | ------------- | -------------
**date** |  | 

#### AdGroupIdsSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### ColumnsSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### GranularitySchema
Type | Description  | Notes
------------- | ------------- | -------------
[**Granularity**](Granularity.md) |  | 


#### ClickWindowDaysSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 30,  must be one of [1, 7, 30, 60, ]

#### EngagementWindowDaysSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 30,  must be one of [1, 7, 30, 60, ]

#### ViewWindowDaysSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 1,  must be one of [1, 7, 30, 60, ]

#### ConversionReportTimeSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | defaults to "TIME_OF_AD_ACTION",  must be one of ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION", ]

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

#### AdAccountIdSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | Success 
400 | ApiResponseFor400 | Invalid ad account group analytics parameters. 
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
[**AdGroupsAnalyticsResponse**](AdGroupsAnalyticsResponse.md) |  | 


#### ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor400ResponseBodyApplicationJson
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



[**AdGroupsAnalyticsResponse**](AdGroupsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_groups_list**
> object ad_groups_list(ad_account_id)

List ad groups

Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import openapi_client
from openapi_client.api import ad_accounts_api
from openapi_client.model.paginated import Paginated
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
    api_instance = ad_accounts_api.AdAccountsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
    }
    try:
        # List ad groups
        api_response = api_instance.ad_groups_list(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->ad_groups_list: %s\n" % e)

    # example passing only optional values
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'campaign_ids': [
        "4",
    ],
        'ad_group_ids': [
        "4",
    ],
        'entity_statuses': [
        "ACTIVE",
    ],
        'page_size': 25,
        'order': "ASCENDING",
        'bookmark': "bookmark_example",
        'translate_interests_to_names': False,
    }
    try:
        # List ad groups
        api_response = api_instance.ad_groups_list(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->ad_groups_list: %s\n" % e)
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
entity_statuses | EntityStatusesSchema | | optional
page_size | PageSizeSchema | | optional
order | OrderSchema | | optional
bookmark | BookmarkSchema | | optional
translate_interests_to_names | TranslateInterestsToNamesSchema | | optional


#### CampaignIdsSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### AdGroupIdsSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### EntityStatusesSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### PageSizeSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 25

#### OrderSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  |  must be one of ["ASCENDING", "DESCENDING", ]

#### BookmarkSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

#### TranslateInterestsToNamesSchema

Type | Description | Notes
------------- | ------------- | -------------
**bool** |  | defaults to False

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

#### AdAccountIdSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | Success 
400 | ApiResponseFor400 | Invalid ad account group parameters. 
default | ApiResponseForDefault | Unexpected error 

#### ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor200ResponseBodyApplicationJson

#### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

#### ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor400ResponseBodyApplicationJson
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



**object**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_analytics**
> AdsAnalyticsResponse ads_analytics(ad_account_idstart_dateend_datead_idscolumnsgranularity)

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import openapi_client
from openapi_client.api import ad_accounts_api
from openapi_client.model.ads_analytics_response import AdsAnalyticsResponse
from openapi_client.model.error import Error
from openapi_client.model.granularity import Granularity
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
    api_instance = ad_accounts_api.AdAccountsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'start_date': isoparse('1970-01-01').date(),
        'end_date': isoparse('1970-01-01').date(),
        'ad_ids': [
        "4",
    ],
        'columns': [
        "SPEND_IN_DOLLAR",
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
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->ads_analytics: %s\n" % e)

    # example passing only optional values
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'start_date': isoparse('1970-01-01').date(),
        'end_date': isoparse('1970-01-01').date(),
        'ad_ids': [
        "4",
    ],
        'columns': [
        "SPEND_IN_DOLLAR",
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
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->ads_analytics: %s\n" % e)
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


#### StartDateSchema

Type | Description | Notes
------------- | ------------- | -------------
**date** |  | 

#### EndDateSchema

Type | Description | Notes
------------- | ------------- | -------------
**date** |  | 

#### AdIdsSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### ColumnsSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### GranularitySchema
Type | Description  | Notes
------------- | ------------- | -------------
[**Granularity**](Granularity.md) |  | 


#### ClickWindowDaysSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 30,  must be one of [1, 7, 30, 60, ]

#### EngagementWindowDaysSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 30,  must be one of [1, 7, 30, 60, ]

#### ViewWindowDaysSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 1,  must be one of [1, 7, 30, 60, ]

#### ConversionReportTimeSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | defaults to "TIME_OF_AD_ACTION",  must be one of ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION", ]

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

#### AdAccountIdSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | Success 
400 | ApiResponseFor400 | Invalid ad account ads analytics parameters. 
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
[**AdsAnalyticsResponse**](AdsAnalyticsResponse.md) |  | 


#### ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor400ResponseBodyApplicationJson
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



[**AdsAnalyticsResponse**](AdsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ads_list**
> object ads_list(ad_account_id)

List ads

Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import openapi_client
from openapi_client.api import ad_accounts_api
from openapi_client.model.paginated import Paginated
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
    api_instance = ad_accounts_api.AdAccountsApi(api_client)

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
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->ads_list: %s\n" % e)

    # example passing only optional values
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'campaign_ids': [
        "4",
    ],
        'ad_group_ids': [
        "4",
    ],
        'ad_ids': [
        "4",
    ],
        'entity_statuses': [
        "ACTIVE",
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
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->ads_list: %s\n" % e)
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


#### CampaignIdsSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### AdGroupIdsSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### AdIdsSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### EntityStatusesSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### PageSizeSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 25

#### OrderSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  |  must be one of ["ASCENDING", "DESCENDING", ]

#### BookmarkSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

#### AdAccountIdSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | Success 
400 | ApiResponseFor400 | Invalid ad account ads parameters. 
default | ApiResponseForDefault | Unexpected error 

#### ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor200ResponseBodyApplicationJson

#### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

#### ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor400ResponseBodyApplicationJson
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



**object**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_create_report**
> AdsAnalyticsCreateAsyncResponse analytics_create_report(ad_account_idads_analytics_create_async_request)

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import openapi_client
from openapi_client.api import ad_accounts_api
from openapi_client.model.ads_analytics_create_async_request import AdsAnalyticsCreateAsyncRequest
from openapi_client.model.ads_analytics_create_async_response import AdsAnalyticsCreateAsyncResponse
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
    api_instance = ad_accounts_api.AdAccountsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    body = AdsAnalyticsCreateAsyncRequest()
    try:
        # Create async request for an account analytics report
        api_response = api_instance.analytics_create_report(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->analytics_create_report: %s\n" % e)
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

#### SchemaForRequestBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**AdsAnalyticsCreateAsyncRequest**](AdsAnalyticsCreateAsyncRequest.md) |  | 


### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

#### AdAccountIdSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | Success 
400 | ApiResponseFor400 | Invalid ad account ads analytics parameters. 
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
[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md) |  | 


#### ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor400ResponseBodyApplicationJson
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



[**AdsAnalyticsCreateAsyncResponse**](AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_get_report**
> AdsAnalyticsGetAsyncResponse analytics_get_report(ad_account_idtoken)

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import openapi_client
from openapi_client.api import ad_accounts_api
from openapi_client.model.error import Error
from openapi_client.model.ads_analytics_get_async_response import AdsAnalyticsGetAsyncResponse
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
    api_instance = ad_accounts_api.AdAccountsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'token': "token_example",
    }
    try:
        # Get the account analytics report created by the async call
        api_response = api_instance.analytics_get_report(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->analytics_get_report: %s\n" % e)
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
token | TokenSchema | | 


#### TokenSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

#### AdAccountIdSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | Success 
400 | ApiResponseFor400 | Invalid ad account ads analytics parameters. 
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
[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md) |  | 


#### ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor400ResponseBodyApplicationJson
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



[**AdsAnalyticsGetAsyncResponse**](AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_analytics**
> CampaignsAnalyticsResponse campaigns_analytics(ad_account_idstart_dateend_datecampaign_idscolumnsgranularity)

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import openapi_client
from openapi_client.api import ad_accounts_api
from openapi_client.model.error import Error
from openapi_client.model.campaigns_analytics_response import CampaignsAnalyticsResponse
from openapi_client.model.granularity import Granularity
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
    api_instance = ad_accounts_api.AdAccountsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'start_date': isoparse('1970-01-01').date(),
        'end_date': isoparse('1970-01-01').date(),
        'campaign_ids': [
        "4",
    ],
        'columns': [
        "SPEND_IN_DOLLAR",
    ],
        'granularity': Granularity("DAY"),
    }
    try:
        # Get campaign analytics
        api_response = api_instance.campaigns_analytics(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->campaigns_analytics: %s\n" % e)

    # example passing only optional values
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'start_date': isoparse('1970-01-01').date(),
        'end_date': isoparse('1970-01-01').date(),
        'campaign_ids': [
        "4",
    ],
        'columns': [
        "SPEND_IN_DOLLAR",
    ],
        'granularity': Granularity("DAY"),
        'click_window_days': 1,
        'engagement_window_days': 30,
        'view_window_days': 1,
        'conversion_report_time': "TIME_OF_AD_ACTION",
    }
    try:
        # Get campaign analytics
        api_response = api_instance.campaigns_analytics(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->campaigns_analytics: %s\n" % e)
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
campaign_ids | CampaignIdsSchema | | 
columns | ColumnsSchema | | 
granularity | GranularitySchema | | 
click_window_days | ClickWindowDaysSchema | | optional
engagement_window_days | EngagementWindowDaysSchema | | optional
view_window_days | ViewWindowDaysSchema | | optional
conversion_report_time | ConversionReportTimeSchema | | optional


#### StartDateSchema

Type | Description | Notes
------------- | ------------- | -------------
**date** |  | 

#### EndDateSchema

Type | Description | Notes
------------- | ------------- | -------------
**date** |  | 

#### CampaignIdsSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### ColumnsSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### GranularitySchema
Type | Description  | Notes
------------- | ------------- | -------------
[**Granularity**](Granularity.md) |  | 


#### ClickWindowDaysSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 30,  must be one of [1, 7, 30, 60, ]

#### EngagementWindowDaysSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 30,  must be one of [1, 7, 30, 60, ]

#### ViewWindowDaysSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 1,  must be one of [1, 7, 30, 60, ]

#### ConversionReportTimeSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | defaults to "TIME_OF_AD_ACTION",  must be one of ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION", ]

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

#### AdAccountIdSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | Success 
400 | ApiResponseFor400 | Invalid ad account campaign analytics parameters. 
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
[**CampaignsAnalyticsResponse**](CampaignsAnalyticsResponse.md) |  | 


#### ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor400ResponseBodyApplicationJson
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



[**CampaignsAnalyticsResponse**](CampaignsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **campaigns_list**
> object campaigns_list(ad_account_id)

List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import openapi_client
from openapi_client.api import ad_accounts_api
from openapi_client.model.paginated import Paginated
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
    api_instance = ad_accounts_api.AdAccountsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
    }
    try:
        # List campaigns
        api_response = api_instance.campaigns_list(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->campaigns_list: %s\n" % e)

    # example passing only optional values
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'campaign_ids': [
        "4",
    ],
        'entity_statuses': [
        "ACTIVE",
    ],
        'page_size': 25,
        'order': "ASCENDING",
        'bookmark': "bookmark_example",
    }
    try:
        # List campaigns
        api_response = api_instance.campaigns_list(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->campaigns_list: %s\n" % e)
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
entity_statuses | EntityStatusesSchema | | optional
page_size | PageSizeSchema | | optional
order | OrderSchema | | optional
bookmark | BookmarkSchema | | optional


#### CampaignIdsSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### EntityStatusesSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### PageSizeSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 25

#### OrderSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  |  must be one of ["ASCENDING", "DESCENDING", ]

#### BookmarkSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

#### AdAccountIdSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | Success 
400 | ApiResponseFor400 | Invalid ad account campaign parameters. 
default | ApiResponseForDefault | Unexpected error 

#### ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor200ResponseBodyApplicationJson

#### Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

#### ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor400ResponseBodyApplicationJson
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



**object**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **product_groups_analytics**
> ProductGroupAnalyticsResponse product_groups_analytics(ad_account_idstart_dateend_dateproduct_group_idscolumnsgranularity)

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import openapi_client
from openapi_client.api import ad_accounts_api
from openapi_client.model.error import Error
from openapi_client.model.product_group_analytics_response import ProductGroupAnalyticsResponse
from openapi_client.model.granularity import Granularity
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
    api_instance = ad_accounts_api.AdAccountsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'start_date': isoparse('1970-01-01').date(),
        'end_date': isoparse('1970-01-01').date(),
        'product_group_ids': [
        "4",
    ],
        'columns': [
        "SPEND_IN_DOLLAR",
    ],
        'granularity': Granularity("DAY"),
    }
    try:
        # Get product group analytics
        api_response = api_instance.product_groups_analytics(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->product_groups_analytics: %s\n" % e)

    # example passing only optional values
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'start_date': isoparse('1970-01-01').date(),
        'end_date': isoparse('1970-01-01').date(),
        'product_group_ids': [
        "4",
    ],
        'columns': [
        "SPEND_IN_DOLLAR",
    ],
        'granularity': Granularity("DAY"),
        'click_window_days': 1,
        'engagement_window_days': 30,
        'view_window_days': 1,
        'conversion_report_time': "TIME_OF_AD_ACTION",
    }
    try:
        # Get product group analytics
        api_response = api_instance.product_groups_analytics(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except openapi_client.ApiException as e:
        print("Exception when calling AdAccountsApi->product_groups_analytics: %s\n" % e)
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
product_group_ids | ProductGroupIdsSchema | | 
columns | ColumnsSchema | | 
granularity | GranularitySchema | | 
click_window_days | ClickWindowDaysSchema | | optional
engagement_window_days | EngagementWindowDaysSchema | | optional
view_window_days | ViewWindowDaysSchema | | optional
conversion_report_time | ConversionReportTimeSchema | | optional


#### StartDateSchema

Type | Description | Notes
------------- | ------------- | -------------
**date** |  | 

#### EndDateSchema

Type | Description | Notes
------------- | ------------- | -------------
**date** |  | 

#### ProductGroupIdsSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### ColumnsSchema

Type | Description | Notes
------------- | ------------- | -------------
**[str]** |  | 

#### GranularitySchema
Type | Description  | Notes
------------- | ------------- | -------------
[**Granularity**](Granularity.md) |  | 


#### ClickWindowDaysSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 30,  must be one of [1, 7, 30, 60, ]

#### EngagementWindowDaysSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 30,  must be one of [1, 7, 30, 60, ]

#### ViewWindowDaysSchema

Type | Description | Notes
------------- | ------------- | -------------
**int** |  | defaults to 1,  must be one of [1, 7, 30, 60, ]

#### ConversionReportTimeSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | defaults to "TIME_OF_AD_ACTION",  must be one of ["TIME_OF_AD_ACTION", "TIME_OF_CONVERSION", ]

### path_params
#### RequestPathParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
ad_account_id | AdAccountIdSchema | | 

#### AdAccountIdSchema

Type | Description | Notes
------------- | ------------- | -------------
**str** |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | ApiResponseFor200 | Success 
400 | ApiResponseFor400 | Invalid ad account ads analytics parameters. 
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
[**ProductGroupAnalyticsResponse**](ProductGroupAnalyticsResponse.md) |  | 


#### ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

#### SchemaFor400ResponseBodyApplicationJson
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



[**ProductGroupAnalyticsResponse**](ProductGroupAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

