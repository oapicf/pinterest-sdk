# AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AudiencesCreate**](AudiencesApi.md#AudiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**AudiencesCreateCustom**](AudiencesApi.md#AudiencesCreateCustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
[**AudiencesGet**](AudiencesApi.md#AudiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**AudiencesList**](AudiencesApi.md#AudiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**AudiencesUpdate**](AudiencesApi.md#AudiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **AudiencesCreate**
> Audience AudiencesCreate(ad_account_id, audience_create_request)

Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.

### Example
```R
library(openapi)

# Create audience
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_audience_create_request <- AudienceCreateRequest$new("name_example", AudienceRule$new("country_example", "customer_list_id_example", c("engagement_domain_example"), "engagement_type_example", "event_example", PinterestTagEventData$new(Currency$new(), "lead_type_example", LineItem$new("product_brand_example", "product_category_example", 123, "product_name_example", "product_price_example", 123, "product_variant_example", "product_variant_id_example"), "order_id_example", 123, "page_name_example", "promo_code_example", "property_example", "search_query_example", "value_example", "video_title_example"), 123, c("pin_id_example"), "prefill_example", 123, c("seed_id_example"), c("url_example"), "visitor_source_id_example", 123, 123, 123, c("campaign_id_example"), c("ad_id_example"), c(ObjectiveType$new()), "ad_account_id_example"), AudienceCreateRequest_1_audience_type$new(), "ad_account_id_example", "description_example") # AudienceCreateRequest | List of ads to create, size limit [1, 30]

api_instance <- AudiencesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AudiencesCreate(var_ad_account_id, var_audience_create_requestdata_file = "result.txt")
result <- api_instance$AudiencesCreate(var_ad_account_id, var_audience_create_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **audience_create_request** | [**AudienceCreateRequest**](AudienceCreateRequest.md)| List of ads to create, size limit [1, 30] | 

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **AudiencesCreateCustom**
> Audience AudiencesCreateCustom(ad_account_id, audience_create_custom_request)

Create custom audience

Create a custom audience and find the audiences you want your ads to reach.

### Example
```R
library(openapi)

# Create custom audience
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_audience_create_custom_request <- AudienceCreateCustomRequest$new("name_example", AudienceRule$new("country_example", "customer_list_id_example", c("engagement_domain_example"), "engagement_type_example", "event_example", PinterestTagEventData$new(Currency$new(), "lead_type_example", LineItem$new("product_brand_example", "product_category_example", 123, "product_name_example", "product_price_example", 123, "product_variant_example", "product_variant_id_example"), "order_id_example", 123, "page_name_example", "promo_code_example", "property_example", "search_query_example", "value_example", "video_title_example"), 123, c("pin_id_example"), "prefill_example", 123, c("seed_id_example"), c("url_example"), "visitor_source_id_example", 123, 123, 123, c("campaign_id_example"), c("ad_id_example"), c(ObjectiveType$new()), "ad_account_id_example"), AudienceSharingType$new(), AudienceDataParty$new(), "ad_account_id_example", "category_example") # AudienceCreateCustomRequest | Custom audience to create.

api_instance <- AudiencesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AudiencesCreateCustom(var_ad_account_id, var_audience_create_custom_requestdata_file = "result.txt")
result <- api_instance$AudiencesCreateCustom(var_ad_account_id, var_audience_create_custom_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **audience_create_custom_request** | [**AudienceCreateCustomRequest**](AudienceCreateCustomRequest.md)| Custom audience to create. | 

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **AudiencesGet**
> Audience AudiencesGet(ad_account_id, audience_id)

Get audience

Get a specific audience given the audience ID.

### Example
```R
library(openapi)

# Get audience
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_audience_id <- "audience_id_example" # character | Unique identifier of an audience

api_instance <- AudiencesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AudiencesGet(var_ad_account_id, var_audience_iddata_file = "result.txt")
result <- api_instance$AudiencesGet(var_ad_account_id, var_audience_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **audience_id** | **character**| Unique identifier of an audience | 

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Audience not found. |  -  |
| **0** | Unexpected error. |  -  |

# **AudiencesList**
> AudiencesList200Response AudiencesList(ad_account_id, bookmark = var.bookmark, order = var.order, page_size = 25, ownership_type = "OWNED")

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
var_order <- "ASCENDING" # character | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)
var_ownership_type <- "OWNED" # character | <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type. (Optional)

api_instance <- AudiencesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AudiencesList(var_ad_account_id, bookmark = var_bookmark, order = var_order, page_size = var_page_size, ownership_type = var_ownership_typedata_file = "result.txt")
result <- api_instance$AudiencesList(var_ad_account_id, bookmark = var_bookmark, order = var_order, page_size = var_page_size, ownership_type = var_ownership_type)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **order** | Enum [ASCENDING, DESCENDING] | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ownership_type** | Enum [OWNED, RECEIVED] | &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type. | [optional] [default to &quot;OWNED&quot;]

### Return type

[**AudiencesList200Response**](audiences_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account audience parameters. |  -  |
| **0** | Unexpected error |  -  |

# **AudiencesUpdate**
> Audience AudiencesUpdate(ad_account_id, audience_id, audience_update_request = var.audience_update_request)

Update audience

Update (edit or remove) an existing targeting audience.

### Example
```R
library(openapi)

# Update audience
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_audience_id <- "audience_id_example" # character | Unique identifier of an audience
var_audience_update_request <- AudienceUpdateRequest$new("ad_account_id_example", "name_example", AudienceRule$new("country_example", "customer_list_id_example", c("engagement_domain_example"), "engagement_type_example", "event_example", PinterestTagEventData$new(Currency$new(), "lead_type_example", LineItem$new("product_brand_example", "product_category_example", 123, "product_name_example", "product_price_example", 123, "product_variant_example", "product_variant_id_example"), "order_id_example", 123, "page_name_example", "promo_code_example", "property_example", "search_query_example", "value_example", "video_title_example"), 123, c("pin_id_example"), "prefill_example", 123, c("seed_id_example"), c("url_example"), "visitor_source_id_example", 123, 123, 123, c("campaign_id_example"), c("ad_id_example"), c(ObjectiveType$new()), "ad_account_id_example"), "description_example", AudienceUpdateOperationType$new()) # AudienceUpdateRequest | The audience to be updated. (Optional)

api_instance <- AudiencesApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AudiencesUpdate(var_ad_account_id, var_audience_id, audience_update_request = var_audience_update_requestdata_file = "result.txt")
result <- api_instance$AudiencesUpdate(var_ad_account_id, var_audience_id, audience_update_request = var_audience_update_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **audience_id** | **character**| Unique identifier of an audience | 
 **audience_update_request** | [**AudienceUpdateRequest**](AudienceUpdateRequest.md)| The audience to be updated. | [optional] 

### Return type

[**Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

