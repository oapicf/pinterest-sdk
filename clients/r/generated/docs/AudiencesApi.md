# AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AudiencesCreate**](AudiencesApi.md#AudiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**AudiencesGet**](AudiencesApi.md#AudiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**AudiencesList**](AudiencesApi.md#AudiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**AudiencesUpdate**](AudiencesApi.md#AudiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **AudiencesCreate**
> AdAccountsAudience AudiencesCreate(ad_account_id, ad_accounts_audience_create)

Create audience

Create a new audience for the ad account.

### Example
```R
library(openapi)

# Create audience
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_accounts_audience_create <- AdAccountsAudienceCreate$new("ad_account_id_example", AudienceType$new(), "description_example", "name_example", AdAccountsAudienceRule$new("ad_account_id_example", c("ad_id_example"), c("campaign_id_example"), "country_example", "customer_list_id_example", c("engagement_domain_example"), "engagement_type_example", 123, "event_example", EventData$new(Currency$new(), "lead_type_example", LineItem$new("product_brand_example", "product_category_example", 123, "product_name_example", "product_price_example", 123, "product_variant_example", "product_variant_id_example"), "order_id_example", 123, "page_name_example", "promo_code_example", "property_example", "search_query_example", "value_example", "video_title_example"), 123, 123, c(AudienceObjectiveType$new()), 123, c("pin_id_example"), "prefill_example", 123, c("seed_id_example"), c("url_example"), "visitor_source_id_example")) # AdAccountsAudienceCreate | 

api_instance <- AudiencesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AudiencesCreate(var_ad_account_id, var_ad_accounts_audience_createdata_file = "result.txt")
result <- api_instance$AudiencesCreate(var_ad_account_id, var_ad_accounts_audience_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_accounts_audience_create** | [**AdAccountsAudienceCreate**](AdAccountsAudienceCreate.md)|  | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

# **AudiencesGet**
> AdAccountsAudience AudiencesGet(audience_id, ad_account_id)

Get audience

Get a specific audience given the audience ID.

### Example
```R
library(openapi)

# Get audience
#
# prepare function argument(s)
var_audience_id <- "audience_id_example" # character | Audience ID.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.

api_instance <- AudiencesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AudiencesGet(var_audience_id, var_ad_account_iddata_file = "result.txt")
result <- api_instance$AudiencesGet(var_audience_id, var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audience_id** | **character**| Audience ID. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

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

# **AudiencesList**
> AudiencesList200Response AudiencesList(ad_account_id, bookmark = var.bookmark, page_size = 25, order = var.order, ownership_type = var.ownership_type, exclude_nca = FALSE)

List audiences

Get list of audiences for the ad account.

### Example
```R
library(openapi)

# List audiences
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)
var_order <- Pinterest.Lib.PaginationOrder$new() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_ownership_type <- AudienceOwnershipType$new() # AudienceOwnershipType |  (Optional)
var_exclude_nca <- FALSE # character | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). (Optional)

api_instance <- AudiencesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AudiencesList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, ownership_type = var_ownership_type, exclude_nca = var_exclude_ncadata_file = "result.txt")
result <- api_instance$AudiencesList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, ownership_type = var_ownership_type, exclude_nca = var_exclude_nca)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **ownership_type** | [**AudienceOwnershipType**](.md)|  | [optional] 
 **exclude_nca** | **character**| When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional] [default to FALSE]

### Return type

[**AudiencesList200Response**](audiences_list_200_response.md)

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

# **AudiencesUpdate**
> AdAccountsAudience AudiencesUpdate(audience_id, ad_account_id, ad_accounts_audience_update)

Update audience

Update an existing audience for the ad account.

### Example
```R
library(openapi)

# Update audience
#
# prepare function argument(s)
var_audience_id <- "audience_id_example" # character | Audience ID.
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_ad_accounts_audience_update <- AdAccountsAudienceUpdate$new("ad_account_id_example", AudienceType$new(), "description_example", "name_example", AudienceUpdateOperationType$new(), AdAccountsAudienceRule$new("ad_account_id_example", c("ad_id_example"), c("campaign_id_example"), "country_example", "customer_list_id_example", c("engagement_domain_example"), "engagement_type_example", 123, "event_example", EventData$new(Currency$new(), "lead_type_example", LineItem$new("product_brand_example", "product_category_example", 123, "product_name_example", "product_price_example", 123, "product_variant_example", "product_variant_id_example"), "order_id_example", 123, "page_name_example", "promo_code_example", "property_example", "search_query_example", "value_example", "video_title_example"), 123, 123, c(AudienceObjectiveType$new()), 123, c("pin_id_example"), "prefill_example", 123, c("seed_id_example"), c("url_example"), "visitor_source_id_example")) # AdAccountsAudienceUpdate | 

api_instance <- AudiencesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AudiencesUpdate(var_audience_id, var_ad_account_id, var_ad_accounts_audience_updatedata_file = "result.txt")
result <- api_instance$AudiencesUpdate(var_audience_id, var_ad_account_id, var_ad_accounts_audience_update)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audience_id** | **character**| Audience ID. | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **ad_accounts_audience_update** | [**AdAccountsAudienceUpdate**](AdAccountsAudienceUpdate.md)|  | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

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

