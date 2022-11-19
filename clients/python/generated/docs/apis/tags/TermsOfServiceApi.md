<a name="__pageTop"></a>
# pinterestsdk.apis.tags.terms_of_service_api.TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**terms_of_service_get**](#terms_of_service_get) | **get** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service

# **terms_of_service_get**
<a name="terms_of_service_get"></a>
> TermsOfService terms_of_service_get(ad_account_id)

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import terms_of_service_api
from pinterestsdk.model.terms_of_service import TermsOfService
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
    api_instance = terms_of_service_api.TermsOfServiceApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
    }
    try:
        # Get terms of service
        api_response = api_instance.terms_of_service_get(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling TermsOfServiceApi->terms_of_service_get: %s\n" % e)

    # example passing only optional values
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'include_html': False,
        'tos_type': "tos_type_example",
    }
    try:
        # Get terms of service
        api_response = api_instance.terms_of_service_get(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling TermsOfServiceApi->terms_of_service_get: %s\n" % e)
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
include_html | IncludeHtmlSchema | | optional
tos_type | TosTypeSchema | | optional


# IncludeHtmlSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  | if omitted the server will use the default value of False

# TosTypeSchema

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
200 | [ApiResponseFor200](#terms_of_service_get.ApiResponseFor200) | Success
default | [ApiResponseForDefault](#terms_of_service_get.ApiResponseForDefault) | Unexpected error

#### terms_of_service_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**TermsOfService**](../../models/TermsOfService.md) |  | 


#### terms_of_service_get.ApiResponseForDefault
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

