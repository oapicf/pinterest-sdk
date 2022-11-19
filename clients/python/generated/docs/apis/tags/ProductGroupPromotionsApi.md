<a name="__pageTop"></a>
# pinterestsdk.apis.tags.product_group_promotions_api.ProductGroupPromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**product_group_promotion_get**](#product_group_promotion_get) | **get** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
[**product_group_promotions_create**](#product_group_promotions_create) | **post** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
[**product_group_promotions_update**](#product_group_promotions_update) | **patch** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
[**product_groups_analytics**](#product_groups_analytics) | **get** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics

# **product_group_promotion_get**
<a name="product_group_promotion_get"></a>
> ProductGroupPromotion product_group_promotion_get(ad_account_idproduct_group_promotion_id)

Get a product group promotion by id

Get a product group promotion by id

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import product_group_promotions_api
from pinterestsdk.model.product_group_promotion import ProductGroupPromotion
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
    api_instance = product_group_promotions_api.ProductGroupPromotionsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
        'product_group_promotion_id': "4",
    }
    try:
        # Get a product group promotion by id
        api_response = api_instance.product_group_promotion_get(
            path_params=path_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling ProductGroupPromotionsApi->product_group_promotion_get: %s\n" % e)
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
product_group_promotion_id | ProductGroupPromotionIdSchema | | 

# AdAccountIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

# ProductGroupPromotionIdSchema

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Return Types, Responses

Code | Class | Description
------------- | ------------- | -------------
n/a | api_client.ApiResponseWithoutDeserialization | When skip_deserialization is True this response is returned
200 | [ApiResponseFor200](#product_group_promotion_get.ApiResponseFor200) | Success
default | [ApiResponseForDefault](#product_group_promotion_get.ApiResponseForDefault) | Unexpected error

#### product_group_promotion_get.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ProductGroupPromotion**](../../models/ProductGroupPromotion.md) |  | 


#### product_group_promotion_get.ApiResponseForDefault
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

# **product_group_promotions_create**
<a name="product_group_promotions_create"></a>
> ProductGroupPromotionArrayResponse product_group_promotions_create(ad_account_idproduct_group_promotion_create_request)

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import product_group_promotions_api
from pinterestsdk.model.product_group_promotion_create_request import ProductGroupPromotionCreateRequest
from pinterestsdk.model.error import Error
from pinterestsdk.model.product_group_promotion_array_response import ProductGroupPromotionArrayResponse
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
    api_instance = product_group_promotions_api.ProductGroupPromotionsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    body = ProductGroupPromotionCreateRequest(
        ad_group_id="2680059592705",
        product_group_promotion=[
            ProductGroupPromotionCommon(
                status=EntityStatus("ACTIVE"),
                tracking_url="https://www.pinterest.com",
                catalogs_product_group_id="1231235",
                catalogs_product_group_name="catalogProductGroupName",
                creative_type=CreativeType("REGULAR"),
                collections_hero_pin_id="123123",
                collections_hero_destination_url="http://www.pinterest.com",
                slideshow_collections_title="Title",
                slideshow_collections_description="Description",
                is_mdl=True,
            )
        ],
    )
    try:
        # Create product group promotions
        api_response = api_instance.product_group_promotions_create(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling ProductGroupPromotionsApi->product_group_promotions_create: %s\n" % e)
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
[**ProductGroupPromotionCreateRequest**](../../models/ProductGroupPromotionCreateRequest.md) |  | 


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
200 | [ApiResponseFor200](#product_group_promotions_create.ApiResponseFor200) | Success
default | [ApiResponseForDefault](#product_group_promotions_create.ApiResponseForDefault) | Unexpected error

#### product_group_promotions_create.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ProductGroupPromotionArrayResponse**](../../models/ProductGroupPromotionArrayResponse.md) |  | 


#### product_group_promotions_create.ApiResponseForDefault
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

# **product_group_promotions_update**
<a name="product_group_promotions_update"></a>
> [ProductGroupPromotionUpdateResponseItem] product_group_promotions_update(ad_account_idproduct_group_promotion_update_request)

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import product_group_promotions_api
from pinterestsdk.model.product_group_promotion_update_response_item import ProductGroupPromotionUpdateResponseItem
from pinterestsdk.model.error import Error
from pinterestsdk.model.product_group_promotion_update_request import ProductGroupPromotionUpdateRequest
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
    api_instance = product_group_promotions_api.ProductGroupPromotionsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    body = ProductGroupPromotionUpdateRequest(
        ad_group_id="2680059592705",
        product_group_promotion=[
            ProductGroupPromotionUpdateItem(None)
        ],
    )
    try:
        # Update product group promotions
        api_response = api_instance.product_group_promotions_update(
            path_params=path_params,
            body=body,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling ProductGroupPromotionsApi->product_group_promotions_update: %s\n" % e)
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
[**ProductGroupPromotionUpdateRequest**](../../models/ProductGroupPromotionUpdateRequest.md) |  | 


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
200 | [ApiResponseFor200](#product_group_promotions_update.ApiResponseFor200) | Success
default | [ApiResponseForDefault](#product_group_promotions_update.ApiResponseForDefault) | Unexpected error

#### product_group_promotions_update.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ProductGroupPromotionUpdateResponseItem**]({{complexTypePrefix}}ProductGroupPromotionUpdateResponseItem.md) | [**ProductGroupPromotionUpdateResponseItem**]({{complexTypePrefix}}ProductGroupPromotionUpdateResponseItem.md) | [**ProductGroupPromotionUpdateResponseItem**]({{complexTypePrefix}}ProductGroupPromotionUpdateResponseItem.md) |  | 

#### product_group_promotions_update.ApiResponseForDefault
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

# **product_groups_analytics**
<a name="product_groups_analytics"></a>
> ProductGroupAnalyticsResponse product_groups_analytics(ad_account_idstart_dateend_dateproduct_group_idscolumnsgranularity)

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import pinterestsdk
from pinterestsdk.apis.tags import product_group_promotions_api
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
    api_instance = product_group_promotions_api.ProductGroupPromotionsApi(api_client)

    # example passing only required values which don't have defaults set
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'start_date': "1970-01-01",
        'end_date': "1970-01-01",
        'product_group_ids': [
        "4"
    ],
        'columns': [
        "SPEND_IN_DOLLAR"
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
    except pinterestsdk.ApiException as e:
        print("Exception when calling ProductGroupPromotionsApi->product_groups_analytics: %s\n" % e)

    # example passing only optional values
    path_params = {
        'ad_account_id': "4",
    }
    query_params = {
        'start_date': "1970-01-01",
        'end_date': "1970-01-01",
        'product_group_ids': [
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
        # Get product group analytics
        api_response = api_instance.product_groups_analytics(
            path_params=path_params,
            query_params=query_params,
        )
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling ProductGroupPromotionsApi->product_groups_analytics: %s\n" % e)
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

# ProductGroupIdsSchema

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
200 | [ApiResponseFor200](#product_groups_analytics.ApiResponseFor200) | Success
400 | [ApiResponseFor400](#product_groups_analytics.ApiResponseFor400) | Invalid ad account ads analytics parameters.
default | [ApiResponseForDefault](#product_groups_analytics.ApiResponseForDefault) | Unexpected error

#### product_groups_analytics.ApiResponseFor200
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor200ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor200ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**ProductGroupAnalyticsResponse**](../../models/ProductGroupAnalyticsResponse.md) |  | 


#### product_groups_analytics.ApiResponseFor400
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
response | urllib3.HTTPResponse | Raw response |
body | typing.Union[SchemaFor400ResponseBodyApplicationJson, ] |  |
headers | Unset | headers were not defined |

# SchemaFor400ResponseBodyApplicationJson
Type | Description  | Notes
------------- | ------------- | -------------
[**Error**](../../models/Error.md) |  | 


#### product_groups_analytics.ApiResponseForDefault
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

