# TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TargetingTemplateCreate**](TargetingTemplateApi.md#TargetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**TargetingTemplateList**](TargetingTemplateApi.md#TargetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**TargetingTemplateUpdate**](TargetingTemplateApi.md#TargetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


# **TargetingTemplateCreate**
> TargetingTemplate TargetingTemplateCreate(ad_account_id, targeting_template_create)

Create targeting templates

Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.

### Example
```R
library(openapi)

# Create targeting templates
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_targeting_template_create <- TargetingTemplateCreate$new("name_example", TargetingSpecOptimal$new(c(TargetingSpecAgeBucket$new()), c(TargetingSpecAppType$new()), c("AUDIENCE_EXCLUDE_example"), c("AUDIENCE_INCLUDE_example"), c(TargetingSpecGender$new()), c("GEO_example"), c("GEO_EXCLUDE_example"), c("INTEREST_example"), c("LOCALE_example"), c("LOCATION_example"), c("LOCATION_EXCLUDE_example"), "MAXIMUM_AGE_example", "MINIMUM_AGE_example", c(TargetingSpecShoppingRetargeting$new(123, 123, c(123))), c(TargetingStrategy$new())), "auto_targeting_enabled_example", c(TargetingTemplateKeyword$new(MatchType$new(), "value_example")), PlacementGroupType$new(), TrackingUrls$new(c("audience_verification_example"), c("buyable_button_example"), c("click_example"), c("engagement_example"), c("impression_example"))) # TargetingTemplateCreate | 

api_instance <- TargetingTemplateApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$TargetingTemplateCreate(var_ad_account_id, var_targeting_template_createdata_file = "result.txt")
result <- api_instance$TargetingTemplateCreate(var_ad_account_id, var_targeting_template_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **targeting_template_create** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md)|  | 

### Return type

[**TargetingTemplate**](TargetingTemplate.md)

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

# **TargetingTemplateList**
> TargetingTemplateList200Response TargetingTemplateList(ad_account_id, bookmark = var.bookmark, page_size = 25, order = var.order, include_sizing = FALSE, search_query = var.search_query)

List targeting templates

Get a list of the targeting templates in the specified `ad_account_id`

### Example
```R
library(openapi)

# List targeting templates
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)
var_order <- Pinterest.Lib.PaginationOrder$new() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_include_sizing <- FALSE # character | Include audience sizing in result or not (Optional)
var_search_query <- "search_query_example" # character | Search query. Can contain pin description keywords or comma-separated pin IDs. (Optional)

api_instance <- TargetingTemplateApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$TargetingTemplateList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, include_sizing = var_include_sizing, search_query = var_search_querydata_file = "result.txt")
result <- api_instance$TargetingTemplateList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, include_sizing = var_include_sizing, search_query = var_search_query)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **include_sizing** | **character**| Include audience sizing in result or not | [optional] [default to FALSE]
 **search_query** | **character**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[**TargetingTemplateList200Response**](targeting_template_list_200_response.md)

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

# **TargetingTemplateUpdate**
> TargetingTemplateUpdate(ad_account_id, targeting_template_update_request_read_or_update)

Update targeting templates

Update the targeting template given advertiser ID and targeting template ID

### Example
```R
library(openapi)

# Update targeting templates
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_targeting_template_update_request_read_or_update <- TargetingTemplateUpdateRequestReadOrUpdate$new("id_example", AudienceUpdateOperationType$new(), TargetingSpecOptimal$new(c(TargetingSpecAgeBucket$new()), c(TargetingSpecAppType$new()), c("AUDIENCE_EXCLUDE_example"), c("AUDIENCE_INCLUDE_example"), c(TargetingSpecGender$new()), c("GEO_example"), c("GEO_EXCLUDE_example"), c("INTEREST_example"), c("LOCALE_example"), c("LOCATION_example"), c("LOCATION_EXCLUDE_example"), "MAXIMUM_AGE_example", "MINIMUM_AGE_example", c(TargetingSpecShoppingRetargeting$new(123, 123, c(123))), c(TargetingStrategy$new()))) # TargetingTemplateUpdateRequestReadOrUpdate | 

api_instance <- TargetingTemplateApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
api_instance$TargetingTemplateUpdate(var_ad_account_id, var_targeting_template_update_request_read_or_update)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **targeting_template_update_request_read_or_update** | [**TargetingTemplateUpdateRequestReadOrUpdate**](TargetingTemplateUpdateRequestReadOrUpdate.md)|  | 

### Return type

void (empty response body)

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

