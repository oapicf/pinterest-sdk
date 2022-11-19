<a name="__pageTop"></a>
# pinterestsdk.apis.tags.conversion_events_api.ConversionEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**events_create**](#events_create) | **post** /ad_accounts/{ad_account_id}/events | Send conversion events to the Pinterest API for Conversions

# **events_create**
<a name="events_create"></a>
> ConversionApiResponse events_create(ad_account_idconversion_events)

Send conversion events to the Pinterest API for Conversions

The Pinterest API offers advertisers a way to send Pinterest their conversion information (including web conversions, in-app conversions, or even offline conversions) based on their <code>ad_account_id</code>. The request body should be a JSON object. - This endpoint requires an <code>access_token</code> be generated through Ads Manager. Review the <a href=\"/docs/conversions/conversion-management/#Authenticating%20for%20the%20Conversion%20Tracking%20endpoint\">Conversions Guide</a> for more details. - The token's <code>user_account</code> must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Audience, Campaign. - If the merchant is submitting this information using both Pinterest conversion tags and the Pinterest API, Pinterest will remove duplicate information before reporting. (Note that events that took place offline cannot be deduplicated.)

### Example

* Bearer Authentication (conversion_token):
```python
import pinterestsdk
from pinterestsdk.apis.tags import conversion_events_api
from pinterestsdk.model.conversion_api_response import ConversionApiResponse
from pinterestsdk.model.conversion_events import ConversionEvents
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

# Configure Bearer authorization: conversion_token
configuration = pinterestsdk.Configuration(
    access_token = 'YOUR_BEARER_TOKEN'
)
# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = conversion_events_api.ConversionEventsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
    }
    body = ConversionEvents(
        data=[
            dict(
                event_name="checkout",
                action_source="app_ios",
                event_time=1451431341,
                event_id="eventId0001",
                event_source_url="https://example.org/",
                opt_out=False,
                partner_name="partner_name_example",
                user_data=ConversionEventsUserData(),
                custom_data=dict(
                    currency="USD",
                    value="425325.89",
                    content_ids=[
                        "content_ids_example"
                    ],
                    contents=[
                        dict(
                            item_price="1325.12",
                            quantity=1,
                        )
                    ],
                    num_items=1,
                    order_id="order_id_example",
                    search_string="search_string_example",
                    opt_out_type="CPRA,GPC",
                    np="np_example",
                ),
                app_id="app_id_example",
                app_name="app_name_example",
                app_version="app_version_example",
                device_brand="device_brand_example",
                device_carrier="device_carrier_example",
                device_model="device_model_example",
                device_type="device_type_example",
                os_version="os_version_example",
                wifi=False,
                language="en",
            )
        ],
    )
    try:
        # Send conversion events to the Pinterest API for Conversions
        api_response = api_instance.events_create(
            path_params=path_params,
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling ConversionEventsApi->events_create: %s\n" % e)

    # example passing only optional values
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'test': True,
    }
    body = ConversionEvents(
        data=[
            dict(
                event_name="checkout",
                action_source="app_ios",
                event_time=1451431341,
                event_id="eventId0001",
                event_source_url="https://example.org/",
                opt_out=False,
                partner_name="partner_name_example",
                user_data=ConversionEventsUserData(),
                custom_data=dict(
                    currency="USD",
                    value="425325.89",
                    content_ids=[
                        "content_ids_example"
                    ],
                    contents=[
                        dict(
                            item_price="1325.12",
                            quantity=1,
                        )
                    ],
                    num_items=1,
                    order_id="order_id_example",
                    search_string="search_string_example",
                    opt_out_type="CPRA,GPC",
                    np="np_example",
                ),
                app_id="app_id_example",
                app_name="app_name_example",
                app_version="app_version_example",
                device_brand="device_brand_example",
                device_carrier="device_carrier_example",
                device_model="device_model_example",
                device_type="device_type_example",
                os_version="os_version_example",
                wifi=False,
                language="en",
            )
        ],
    )
    try:
        # Send conversion events to the Pinterest API for Conversions
        api_response = api_instance.events_create(
            path_params=path_params,
            query_params=query_params,
            body=body,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling ConversionEventsApi->events_create: %s\n" % e)
```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
body | typing.Union[SchemaForRequestBodyApplicationJson] | required |
query_params | RequestQueryParams | |
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
[**ConversionEvents**](../../models/ConversionEvents.md) |  | 


### query_params
#### RequestQueryParams

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
test | TestSchema | | optional


# TestSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
bool,  | BoolClass,  |  | 

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
200 | [ApiResponseFor200](#events_create.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#events_create.ApiResponseFor400) | The request was invalid.
503 | [ApiResponseFor503](#events_create.ApiResponseFor503) | The endpoint has been ramped down and is currently not accepting any traffic.
default | [ApiResponseForDefault](#events_create.ApiResponseForDefault) | Unexpected errors

#### events_create.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ConversionApiResponse**](../../models/ConversionApiResponse.md) |  | 


#### events_create.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


#### events_create.ApiResponseFor503
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor503ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor503ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


#### events_create.ApiResponseForDefault
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

[conversion_token](../../../README.md#conversion_token)

[[Back to top]](#__pageTop) [[Back to API list]](../../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../../README.md#documentation-for-models) [[Back to README]](../../../README.md)

