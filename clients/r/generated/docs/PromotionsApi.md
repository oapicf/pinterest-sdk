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
> PromotionsResponse PromotionsCreate(ad_account_id, promotion_create_request)

Create promotions

Create multiple new promotions.

### Example
```R
library(openapi)

# Create promotions
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_promotion_create_request <- c(PromotionCreateRequest$new("promotion_title_example", PromotionType$new(), "OTHER", 123, "external_id_example", "platform_type_example", "promotion_code_example", "promotion_custom_id_example", 123, c(PromotionTemplateValue$new(123, Currency$new(), "custom_text_example", 123)))) # array[PromotionCreateRequest] | List of promotions to create, size limit [1, 30].

api_instance <- PromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PromotionsCreate(var_ad_account_id, var_promotion_create_requestdata_file = "result.txt")
result <- api_instance$PromotionsCreate(var_ad_account_id, var_promotion_create_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **promotion_create_request** | list( [**PromotionCreateRequest**](PromotionCreateRequest.md) )| List of promotions to create, size limit [1, 30]. | 

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
| **200** | Success |  -  |
| **400** | Invalid create promotions request parameters. |  -  |
| **0** | Unexpected error |  -  |

# **PromotionsDelete**
> PromotionsDelete(ad_account_id, promotion_id)

Delete promotion by id

Delete a promotion within Pinterest.

### Example
```R
library(openapi)

# Delete promotion by id
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_promotion_id <- "promotion_id_example" # character | Unique identifier of a promotion

api_instance <- PromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
api_instance$PromotionsDelete(var_ad_account_id, var_promotion_id)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **promotion_id** | **character**| Unique identifier of a promotion | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Promotion deleted successfully |  -  |
| **0** | Unexpected error |  -  |

# **PromotionsGet**
> PromotionResponse PromotionsGet(ad_account_id, promotion_id)

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example
```R
library(openapi)

# Get promotion by id
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_promotion_id <- "promotion_id_example" # character | Unique identifier of a promotion

api_instance <- PromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PromotionsGet(var_ad_account_id, var_promotion_iddata_file = "result.txt")
result <- api_instance$PromotionsGet(var_ad_account_id, var_promotion_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **promotion_id** | **character**| Unique identifier of a promotion | 

### Return type

[**PromotionResponse**](PromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | The promotion ID for the given ad account ID was not found. |  -  |
| **0** | Unexpected error |  -  |

# **PromotionsList**
> PromotionsList200Response PromotionsList(ad_account_id, page_size = 25, order = var.order, bookmark = var.bookmark)

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example
```R
library(openapi)

# Get promotions
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_order <- "ASCENDING" # character | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)

api_instance <- PromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PromotionsList(var_ad_account_id, page_size = var_page_size, order = var_order, bookmark = var_bookmarkdata_file = "result.txt")
result <- api_instance$PromotionsList(var_ad_account_id, page_size = var_page_size, order = var_order, bookmark = var_bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | Enum [ASCENDING, DESCENDING] | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

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
| **200** | Success |  -  |
| **400** | Invalid ad account promotions parameters. |  -  |
| **0** | Unexpected error |  -  |

# **PromotionsUpdate**
> PromotionsResponse PromotionsUpdate(ad_account_id, promotion_update_request)

Update promotions

Update multiple promotions.

### Example
```R
library(openapi)

# Update promotions
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_promotion_update_request <- c(PromotionUpdateRequest$new("id_example", "OTHER", 123, "external_id_example", "platform_type_example", "promotion_code_example", "promotion_custom_id_example", "promotion_title_example", PromotionType$new(), 123, c(PromotionTemplateValue$new(123, Currency$new(), "custom_text_example", 123)), EntityStatus$new())) # array[PromotionUpdateRequest] | List of promotions to create, size limit [1, 30].

api_instance <- PromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PromotionsUpdate(var_ad_account_id, var_promotion_update_requestdata_file = "result.txt")
result <- api_instance$PromotionsUpdate(var_ad_account_id, var_promotion_update_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **promotion_update_request** | list( [**PromotionUpdateRequest**](PromotionUpdateRequest.md) )| List of promotions to create, size limit [1, 30]. | 

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
| **200** | Success |  -  |
| **400** | Invalid create promotions request parameters. |  -  |
| **0** | Unexpected error |  -  |

