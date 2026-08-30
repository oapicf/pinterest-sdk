# PromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PromotionsCreate**](PromotionsApi.md#PromotionsCreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**PromotionsDelete**](PromotionsApi.md#PromotionsDelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**PromotionsGet**](PromotionsApi.md#PromotionsGet) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**PromotionsList**](PromotionsApi.md#PromotionsList) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**PromotionsUpdate**](PromotionsApi.md#PromotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions


# **PromotionsCreate**
> PromotionsResponse PromotionsCreate(ad_account_id, promotion_create)

Create promotions

Create multiple new promotions.

### Example
```R
library(openapi)

# Create promotions
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_promotion_create <- c(PromotionCreate$new("promotion_title_example", PromotionType$new(), DiscountStatus$new(), 123, "external_id_example", "platform_type_example", "promotion_code_example", "promotion_custom_id_example", 123, c(PromotionTemplateValue$new(123, Currency$new(), "custom_text_example", 123)))) # array[PromotionCreate] | 

api_instance <- PromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PromotionsCreate(var_ad_account_id, var_promotion_createdata_file = "result.txt")
result <- api_instance$PromotionsCreate(var_ad_account_id, var_promotion_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **promotion_create** | list( [**PromotionCreate**](PromotionCreate.md) )|  | 

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

# **PromotionsDelete**
> Promotion PromotionsDelete(promotion_id, ad_account_id)

Delete promotion by id

Delete a promotion within Pinterest.

### Example
```R
library(openapi)

# Delete promotion by id
#
# prepare function argument(s)
var_promotion_id <- "promotion_id_example" # character | Promotion ID
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.

api_instance <- PromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PromotionsDelete(var_promotion_id, var_ad_account_iddata_file = "result.txt")
result <- api_instance$PromotionsDelete(var_promotion_id, var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **character**| Promotion ID | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 

### Return type

[**Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

# **PromotionsGet**
> Promotion PromotionsGet(promotion_id, ad_account_id)

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example
```R
library(openapi)

# Get promotion by id
#
# prepare function argument(s)
var_promotion_id <- "promotion_id_example" # character | Promotion ID
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.

api_instance <- PromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PromotionsGet(var_promotion_id, var_ad_account_iddata_file = "result.txt")
result <- api_instance$PromotionsGet(var_promotion_id, var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotion_id** | **character**| Promotion ID | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 

### Return type

[**Promotion**](Promotion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

# **PromotionsList**
> PromotionsList200Response PromotionsList(ad_account_id, bookmark = var.bookmark, page_size = 25, order = var.order)

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example
```R
library(openapi)

# Get promotions
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)
var_order <- Pinterest.Lib.PaginationOrder$new() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)

api_instance <- PromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PromotionsList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_orderdata_file = "result.txt")
result <- api_instance$PromotionsList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[**PromotionsList200Response**](promotions_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

# **PromotionsUpdate**
> PromotionsResponse PromotionsUpdate(ad_account_id, promotion_batch_update)

Update promotions

Update multiple promotions.

### Example
```R
library(openapi)

# Update promotions
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_promotion_batch_update <- c(PromotionBatchUpdate$new("id_example", DiscountStatus$new(), 123, "external_id_example", "platform_type_example", "promotion_code_example", "promotion_custom_id_example", "promotion_title_example", PromotionType$new(), 123, c(PromotionTemplateValue$new(123, Currency$new(), "custom_text_example", 123)))) # array[PromotionBatchUpdate] | 

api_instance <- PromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PromotionsUpdate(var_ad_account_id, var_promotion_batch_updatedata_file = "result.txt")
result <- api_instance$PromotionsUpdate(var_ad_account_id, var_promotion_batch_update)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **promotion_batch_update** | list( [**PromotionBatchUpdate**](PromotionBatchUpdate.md) )|  | 

### Return type

[**PromotionsResponse**](PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

