# pinterestsdk.OauthApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauth_token**](OauthApi.md#oauth_token) | **POST** /oauth/token | Generate OAuth access token


# **oauth_token**
> OauthAccessTokenResponse oauth_token(grant_type)

Generate OAuth access token

Generate an OAuth access token by using an authorization code or a refresh token.  See <a href='/docs/api/v5/#tag/Authentication'>Authentication</a> for more.

### Example


```python
import time
import pinterestsdk
from pinterestsdk.api import oauth_api
from pinterestsdk.model.oauth_access_token_response import OauthAccessTokenResponse
from pinterestsdk.model.error import Error
from pprint import pprint
# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)


# Enter a context with an instance of the API client
with pinterestsdk.ApiClient() as api_client:
    # Create an instance of the API class
    api_instance = oauth_api.OauthApi(api_client)
    grant_type = "authorization_code" # str | 

    # example passing only required values which don't have defaults set
    try:
        # Generate OAuth access token
        api_response = api_instance.oauth_token(grant_type)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling OauthApi->oauth_token: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **grant_type** | **str**|  |

### Return type

[**OauthAccessTokenResponse**](OauthAccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

