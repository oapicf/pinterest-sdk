# PinsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MultiPinsAnalytics**](PinsApi.md#MultiPinsAnalytics) | **GET** /pins/analytics | Get multiple Pin analytics
[**PinsAnalytics**](PinsApi.md#PinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**PinsCreate**](PinsApi.md#PinsCreate) | **POST** /pins | Create Pin
[**PinsDelete**](PinsApi.md#PinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**PinsGet**](PinsApi.md#PinsGet) | **GET** /pins/{pin_id} | Get Pin
[**PinsList**](PinsApi.md#PinsList) | **GET** /pins | List Pins
[**PinsSave**](PinsApi.md#PinsSave) | **POST** /pins/{pin_id}/save | Save Pin
[**PinsUpdate**](PinsApi.md#PinsUpdate) | **PATCH** /pins/{pin_id} | Update Pin


# **MultiPinsAnalytics**
> map(map) MultiPinsAnalytics(pin_ids, start_date, end_date, metric_types, app_types = "ALL", ad_account_id = var.ad_account_id)

Get multiple Pin analytics

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**  Get analytics for multiple pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - The maximum number of pins supported in a single request is 100. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example
```R
library(openapi)

# Get multiple Pin analytics
#
# prepare function argument(s)
var_pin_ids <- c("inner_example") # array[character] | List of Pin IDs.
var_start_date <- "start_date_example" # character | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
var_end_date <- "end_date_example" # character | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
var_metric_types <- c(MultiPinsAnalyticsMetricTypesItem$new()) # array[MultiPinsAnalyticsMetricTypesItem] | Pin metric types to get data for.
var_app_types <- "ALL" # character | Apps or devices to get data for, default is all. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- PinsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$MultiPinsAnalytics(var_pin_ids, var_start_date, var_end_date, var_metric_types, app_types = var_app_types, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$MultiPinsAnalytics(var_pin_ids, var_start_date, var_end_date, var_metric_types, app_types = var_app_types, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_ids** | list( **character** )| List of Pin IDs. | 
 **start_date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **metric_types** | list( [**MultiPinsAnalyticsMetricTypesItem**](MultiPinsAnalyticsMetricTypesItem.md) )| Pin metric types to get data for. | 
 **app_types** | Enum [ALL, MOBILE, TABLET, WEB] | Apps or devices to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**map(map)**](map.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **PinsAnalytics**
> map(PinAnalyticsMetricsResponse) PinsAnalytics(pin_id, start_date, end_date, metric_types, app_types = "ALL", split_field = "NO_SPLIT", ad_account_id = var.ad_account_id)

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example
```R
library(openapi)

# Get Pin analytics
#
# prepare function argument(s)
var_pin_id <- "pin_id_example" # character | Unique identifier of a Pin.
var_start_date <- "start_date_example" # character | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
var_end_date <- "end_date_example" # character | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
var_metric_types <- c(QuerypinanalyticsmetrictypesItems$new()) # array[QuerypinanalyticsmetrictypesItems] | Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before `2023-03-20`, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than `NO_SPLIT`.
var_app_types <- "ALL" # character | Apps or devices to get data for, default is all. (Optional)
var_split_field <- "NO_SPLIT" # character | How to split the data into groups. Not including this param means data won't be split. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- PinsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PinsAnalytics(var_pin_id, var_start_date, var_end_date, var_metric_types, app_types = var_app_types, split_field = var_split_field, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$PinsAnalytics(var_pin_id, var_start_date, var_end_date, var_metric_types, app_types = var_app_types, split_field = var_split_field, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **character**| Unique identifier of a Pin. | 
 **start_date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **metric_types** | list( [**QuerypinanalyticsmetrictypesItems**](QuerypinanalyticsmetrictypesItems.md) )| Pin metric types to get data for. VIDEO_MRC_VIEW are Video views, VIDEO_V50_WATCH_TIME is Total play time. If Pin was created before &#x60;2023-03-20&#x60;, Profile visits and Follows will only be available for Idea Pins. These metrics are available for all Pin formats since then. Keep in mind this cannot have ALL if split_field is set to any value other than &#x60;NO_SPLIT&#x60;. | 
 **app_types** | Enum [ALL, MOBILE, TABLET, WEB] | Apps or devices to get data for, default is all. | [optional] [default to &quot;ALL&quot;]
 **split_field** | Enum [NO_SPLIT, APP_TYPE] | How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &quot;NO_SPLIT&quot;]
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**map(PinAnalyticsMetricsResponse)**](PinAnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **PinsCreate**
> Pin PinsCreate(pin_create, ad_account_id = var.ad_account_id)

Create Pin

 Create a Pin on a board or board section owned by the \"operation user_account\".   Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our [Save button](/docs/web-features/add-ons-overview/) instead. For more tips on creating fresh content for Pinterest, review our [Content App Solutions Guide](/docs/api-features/content-overview/).  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-video-pins)** about video Pin creation.  **[Learn more](/docs/api-features/creating-boards-and-pins/#creating-image-pins)** about image Pin creation.

### Example
```R
library(openapi)

# Create Pin
#
# prepare function argument(s)
var_pin_create <- PinCreate$new(AiDisclosures$new(c(AiDisclosureItem$new())), "alt_text_example", "board_id_example", "board_section_id_example", "description_example", "dominant_color_example", "link_example", PinMediaSource$new(ContentType$new(), "data_example", "pin_url", "url_example", "media_id_example", c(PinMediaSourceImagesURLItem$new("url_example", "description_example", "link_example", "title_example")), "is_standard_example", ContentType$new(), "cover_image_data_example", 123, "cover_image_url_example", 123, "is_affiliate_link_example"), "parent_pin_id_example", "sponsor_id_example", "title_example") # PinCreate | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- PinsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PinsCreate(var_pin_create, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$PinsCreate(var_pin_create, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_create** | [**PinCreate**](PinCreate.md)|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **PinsDelete**
> Pin PinsDelete(pin_id, ad_account_id = var.ad_account_id)

Delete Pin

  Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Example
```R
library(openapi)

# Delete Pin
#
# prepare function argument(s)
var_pin_id <- "pin_id_example" # character | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- PinsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PinsDelete(var_pin_id, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$PinsDelete(var_pin_id, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **character**|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **204** | Resource deleted successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **PinsGet**
> Pin PinsGet(pin_id, ad_account_id = var.ad_account_id, pin_metrics = FALSE)

Get Pin

  Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account.   - By default, the \"operation user_account\" is the token user_account.    Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:    - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager.   - For Pins on secret boards: Owner, Admin.

### Example
```R
library(openapi)

# Get Pin
#
# prepare function argument(s)
var_pin_id <- "pin_id_example" # character | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_pin_metrics <- FALSE # character | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (Optional)

api_instance <- PinsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PinsGet(var_pin_id, ad_account_id = var_ad_account_id, pin_metrics = var_pin_metricsdata_file = "result.txt")
result <- api_instance$PinsGet(var_pin_id, ad_account_id = var_ad_account_id, pin_metrics = var_pin_metrics)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **character**|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **pin_metrics** | **character**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to FALSE]

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **PinsList**
> PinsList200Response PinsList(pin_filter = var.pin_filter, pin_metrics = FALSE, include_protected_pins = FALSE, pin_type = var.pin_type, creative_types = var.creative_types, ad_account_id = var.ad_account_id, domain = var.domain, domains = var.domains, include_product_tag_obj = var.include_product_tag_obj, bookmark = var.bookmark, page_size = 25)

List Pins

    Get a list of the Pins owned by the \"operation user_account\".     - By default, the \"operation user_account\" is the token user_account.     - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on.      Optional: Business Access: Specify an `ad_account_id` to use the owner of that ad_account as the \"operation user_account\".      Disclaimer: There are known performance issues when filtering by field `creative_type` and including protected pins.     If your request is timing out in this scenario, we encourage you to use [GET List Pins on Board](/docs/api/v5/#operation/boards/list_pins).

### Example
```R
library(openapi)

# List Pins
#
# prepare function argument(s)
var_pin_filter <- PinFilter$new() # PinFilter | The filter to apply to the pins (Optional)
var_pin_metrics <- FALSE # character | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (Optional)
var_include_protected_pins <- FALSE # character | Whether to include protected pins in the results (Optional)
var_pin_type <- PinType$new() # PinType | The type of pins to return, currently only enabled for private pins (Optional)
var_creative_types <- c(CreativeType$new()) # array[CreativeType] | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. (Optional)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)
var_domain <- "domain_example" # character | Only return pins with links that match the exact domain. Domain should not include 'www.' prefix. For example, 'pinterest.com' is a valid domain, but 'www.pinterest.com' is not (will not match any pins). (Optional)
var_domains <- c("inner_example") # array[character] | Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. `?domains=instagram.com,jcpenney.com`). (Optional)
var_include_product_tag_obj <- "include_product_tag_obj_example" # character | Include product tag objects in the response with their associated links. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- PinsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PinsList(pin_filter = var_pin_filter, pin_metrics = var_pin_metrics, include_protected_pins = var_include_protected_pins, pin_type = var_pin_type, creative_types = var_creative_types, ad_account_id = var_ad_account_id, domain = var_domain, domains = var_domains, include_product_tag_obj = var_include_product_tag_obj, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$PinsList(pin_filter = var_pin_filter, pin_metrics = var_pin_metrics, include_protected_pins = var_include_protected_pins, pin_type = var_pin_type, creative_types = var_creative_types, ad_account_id = var_ad_account_id, domain = var_domain, domains = var_domains, include_product_tag_obj = var_include_product_tag_obj, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_filter** | [**PinFilter**](.md)| The filter to apply to the pins | [optional] 
 **pin_metrics** | **character**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to FALSE]
 **include_protected_pins** | **character**| Whether to include protected pins in the results | [optional] [default to FALSE]
 **pin_type** | [**PinType**](.md)| The type of pins to return, currently only enabled for private pins | [optional] 
 **creative_types** | list( [**CreativeType**](CreativeType.md) )| Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 
 **domain** | **character**| Only return pins with links that match the exact domain. Domain should not include &#39;www.&#39; prefix. For example, &#39;pinterest.com&#39; is a valid domain, but &#39;www.pinterest.com&#39; is not (will not match any pins). | [optional] 
 **domains** | list( **character** )| Only return pins with links whose domain matches any value in the list. Values are joined comma-separated on the wire (e.g. &#x60;?domains&#x3D;instagram.com,jcpenney.com&#x60;). | [optional] 
 **include_product_tag_obj** | **character**| Include product tag objects in the response with their associated links. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**PinsList200Response**](pins_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **PinsSave**
> Pin PinsSave(pin_id, pins_save_request_create, ad_account_id = var.ad_account_id)

Save Pin

Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Example
```R
library(openapi)

# Save Pin
#
# prepare function argument(s)
var_pin_id <- "pin_id_example" # character | Unique identifier of a Pin.
var_pins_save_request_create <- PinsSaveRequestCreate$new("board_id_example", "board_section_id_example") # PinsSaveRequestCreate | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- PinsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PinsSave(var_pin_id, var_pins_save_request_create, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$PinsSave(var_pin_id, var_pins_save_request_create, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **character**| Unique identifier of a Pin. | 
 **pins_save_request_create** | [**PinsSaveRequestCreate**](PinsSaveRequestCreate.md)|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The request has succeeded and a new resource has been created as a result. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **PinsUpdate**
> Pin PinsUpdate(pin_id, pin_update, ad_account_id = var.ad_account_id)

Update Pin

Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example
```R
library(openapi)

# Update Pin
#
# prepare function argument(s)
var_pin_id <- "pin_id_example" # character | 
var_pin_update <- PinUpdate$new(AiDisclosuresUpdate$new(c(AiDisclosureItem$new())), "alt_text_example", "board_id_example", "board_section_id_example", c(CarouselSlot$new("description_example", "link_example", "title_example")), "description_example", "link_example", "title_example") # PinUpdate | 
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account. (Optional)

api_instance <- PinsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PinsUpdate(var_pin_id, var_pin_update, ad_account_id = var_ad_account_iddata_file = "result.txt")
result <- api_instance$PinsUpdate(var_pin_id, var_pin_update, ad_account_id = var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pin_id** | **character**|  | 
 **pin_update** | [**PinUpdate**](PinUpdate.md)|  | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | [optional] 

### Return type

[**Pin**](Pin.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

