# TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TargetingTemplateCreate**](TargetingTemplateApi.md#TargetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**TargetingTemplateList**](TargetingTemplateApi.md#TargetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**TargetingTemplateUpdate**](TargetingTemplateApi.md#TargetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


# **TargetingTemplateCreate**
> TargetingTemplateGetResponseData TargetingTemplateCreate(ad_account_id, targeting_template_create)

Create targeting templates

<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>

### Example
```R
library(openapi)

# Create targeting templates
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_targeting_template_create <- TargetingTemplateCreate$new("name_example", TargetingSpec$new(c("18-24"), c("android_mobile"), c("AUDIENCE_EXCLUDE_example"), c("AUDIENCE_INCLUDE_example"), c("unknown"), c("GEO_example"), c("INTEREST_example"), c("LOCALE_example"), c("LOCATION_example"), c(TargetingSpec_SHOPPING_RETARGETING$new(123, c(123), 123)), c("CHOOSE_YOUR_OWN")), "auto_targeting_enabled_example", PlacementGroupType$new(), c(TargetingTemplateKeyword$new(MatchType$new(), "value_example")), TrackingUrls$new(c("impression_example"), c("click_example"), c("engagement_example"), c("buyable_button_example"), c("audience_verification_example"))) # TargetingTemplateCreate | targeting template creation entity

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
 **targeting_template_create** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md)| targeting template creation entity | 

### Return type

[**TargetingTemplateGetResponseData**](TargetingTemplateGetResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |

# **TargetingTemplateList**
> TargetingTemplateList200Response TargetingTemplateList(ad_account_id, order = var.order, include_sizing = FALSE, search_query = var.search_query, page_size = 25, bookmark = var.bookmark)

List targeting templates

Get a list of the targeting templates in the specified <code>ad_account_id</code>

### Example
```R
library(openapi)

# List targeting templates
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_order <- "ASCENDING" # character | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_include_sizing <- FALSE # character | Include audience sizing in result or not (Optional)
var_search_query <- "gaming" # character | Search keyword for targeting templates (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)

api_instance <- TargetingTemplateApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$TargetingTemplateList(var_ad_account_id, order = var_order, include_sizing = var_include_sizing, search_query = var_search_query, page_size = var_page_size, bookmark = var_bookmarkdata_file = "result.txt")
result <- api_instance$TargetingTemplateList(var_ad_account_id, order = var_order, include_sizing = var_include_sizing, search_query = var_search_query, page_size = var_page_size, bookmark = var_bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **order** | Enum [ASCENDING, DESCENDING] | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **include_sizing** | **character**| Include audience sizing in result or not | [optional] [default to FALSE]
 **search_query** | **character**| Search keyword for targeting templates | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**TargetingTemplateList200Response**](targeting_template_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |

# **TargetingTemplateUpdate**
> TargetingTemplateUpdate(ad_account_id, targeting_template_update_request)

Update targeting templates

<p>Update the targeting template given advertiser ID and targeting template ID</p>

### Example
```R
library(openapi)

# Update targeting templates
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_targeting_template_update_request <- TargetingTemplateUpdateRequest$new("REMOVE", "id_example") # TargetingTemplateUpdateRequest | Operation type and targeting template ID

api_instance <- TargetingTemplateApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
api_instance$TargetingTemplateUpdate(var_ad_account_id, var_targeting_template_update_request)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **targeting_template_update_request** | [**TargetingTemplateUpdateRequest**](TargetingTemplateUpdateRequest.md)| Operation type and targeting template ID | 

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
| **200** | Success |  -  |
| **400** | Invalid ad account id. |  -  |
| **0** | Unexpected error |  -  |

