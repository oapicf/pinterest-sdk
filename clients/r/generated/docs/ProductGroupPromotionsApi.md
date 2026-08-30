# ProductGroupPromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ProductGroupPromotionsCreate**](ProductGroupPromotionsApi.md#ProductGroupPromotionsCreate) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
[**ProductGroupPromotionsGet**](ProductGroupPromotionsApi.md#ProductGroupPromotionsGet) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
[**ProductGroupPromotionsList**](ProductGroupPromotionsApi.md#ProductGroupPromotionsList) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
[**ProductGroupPromotionsUpdate**](ProductGroupPromotionsApi.md#ProductGroupPromotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
[**ProductGroupsAnalytics**](ProductGroupPromotionsApi.md#ProductGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


# **ProductGroupPromotionsCreate**
> ProductGroupPromotions ProductGroupPromotionsCreate(ad_account_id, product_group_promotions_create)

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')

### Example
```R
library(openapi)

# Create product group promotions
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_product_group_promotions_create <- ProductGroupPromotionsCreate$new("ad_group_id_example", c(ProductGroupPromotion$new("ad_group_id_example", 123, "catalog_product_group_id_example", "catalog_product_group_name_example", CollectionsHeaderType$new(), "collections_hero_destination_url_example", "collections_hero_pin_id_example", CreativeType$new(), ProductGroupPromotionCustomizableCTAType$new(), "definition_example", GridClickType$new(), "id_example", "included_example", "is_generate_background_example", "is_image_auto_resizing_example", "is_mdl_example", "parent_id_example", PreferredMediaType$new(), "relative_definition_example", "selected_image_tag_example", "selected_video_tag_example", "slideshow_collections_description_example", "slideshow_collections_title_example", EntityStatus$new(), "tracking_url_example"))) # ProductGroupPromotionsCreate | 

api_instance <- ProductGroupPromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ProductGroupPromotionsCreate(var_ad_account_id, var_product_group_promotions_createdata_file = "result.txt")
result <- api_instance$ProductGroupPromotionsCreate(var_ad_account_id, var_product_group_promotions_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **product_group_promotions_create** | [**ProductGroupPromotionsCreate**](ProductGroupPromotionsCreate.md)|  | 

### Return type

[**ProductGroupPromotions**](ProductGroupPromotions.md)

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

# **ProductGroupPromotionsGet**
> ProductGroupPromotion ProductGroupPromotionsGet(ad_account_id, product_group_promotion_id)

Get a product group promotion by id

Get a product group promotion by id

### Example
```R
library(openapi)

# Get a product group promotion by id
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_product_group_promotion_id <- "product_group_promotion_id_example" # character | Unique identifier of a product group promotion

api_instance <- ProductGroupPromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ProductGroupPromotionsGet(var_ad_account_id, var_product_group_promotion_iddata_file = "result.txt")
result <- api_instance$ProductGroupPromotionsGet(var_ad_account_id, var_product_group_promotion_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **product_group_promotion_id** | **character**| Unique identifier of a product group promotion | 

### Return type

[**ProductGroupPromotion**](ProductGroupPromotion.md)

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

# **ProductGroupPromotionsList**
> ProductGroupPromotionsList200Response ProductGroupPromotionsList(ad_account_id, bookmark = var.bookmark, page_size = 25, order = var.order, product_group_promotion_ids = var.product_group_promotion_ids, entity_statuses = ["ACTIVE","PAUSED"], ad_group_id = var.ad_group_id)

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

### Example
```R
library(openapi)

# Get product group promotions
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)
var_order <- Pinterest.Lib.PaginationOrder$new() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_product_group_promotion_ids <- c("inner_example") # array[character] | List of Product group promotion Ids. (Optional)
var_entity_statuses <- c(EntityStatus$new()) # array[EntityStatus] | Entity status (Optional)
var_ad_group_id <- "ad_group_id_example" # character | Ad group Id. (Optional)

api_instance <- ProductGroupPromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ProductGroupPromotionsList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, product_group_promotion_ids = var_product_group_promotion_ids, entity_statuses = var_entity_statuses, ad_group_id = var_ad_group_iddata_file = "result.txt")
result <- api_instance$ProductGroupPromotionsList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order, product_group_promotion_ids = var_product_group_promotion_ids, entity_statuses = var_entity_statuses, ad_group_id = var_ad_group_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **product_group_promotion_ids** | list( **character** )| List of Product group promotion Ids. | [optional] 
 **entity_statuses** | list( [**EntityStatus**](EntityStatus.md) )| Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]
 **ad_group_id** | **character**| Ad group Id. | [optional] 

### Return type

[**ProductGroupPromotionsList200Response**](product_group_promotions_list_200_response.md)

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

# **ProductGroupPromotionsUpdate**
> ProductGroupPromotions ProductGroupPromotionsUpdate(ad_account_id, product_group_promotions_update_with_required_body)

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Example
```R
library(openapi)

# Update product group promotions
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_product_group_promotions_update_with_required_body <- ProductGroupPromotionsUpdateWithRequiredBody$new("ad_group_id_example", c(ProductGroupPromotion$new("ad_group_id_example", 123, "catalog_product_group_id_example", "catalog_product_group_name_example", CollectionsHeaderType$new(), "collections_hero_destination_url_example", "collections_hero_pin_id_example", CreativeType$new(), ProductGroupPromotionCustomizableCTAType$new(), "definition_example", GridClickType$new(), "id_example", "included_example", "is_generate_background_example", "is_image_auto_resizing_example", "is_mdl_example", "parent_id_example", PreferredMediaType$new(), "relative_definition_example", "selected_image_tag_example", "selected_video_tag_example", "slideshow_collections_description_example", "slideshow_collections_title_example", EntityStatus$new(), "tracking_url_example"))) # ProductGroupPromotionsUpdateWithRequiredBody | 

api_instance <- ProductGroupPromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ProductGroupPromotionsUpdate(var_ad_account_id, var_product_group_promotions_update_with_required_bodydata_file = "result.txt")
result <- api_instance$ProductGroupPromotionsUpdate(var_ad_account_id, var_product_group_promotions_update_with_required_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **product_group_promotions_update_with_required_body** | [**ProductGroupPromotionsUpdateWithRequiredBody**](ProductGroupPromotionsUpdateWithRequiredBody.md)|  | 

### Return type

[**ProductGroupPromotions**](ProductGroupPromotions.md)

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

# **ProductGroupsAnalytics**
> array[ProductGroupAnalyticsItems] ProductGroupsAnalytics(start_date, end_date, product_group_ids, columns, granularity, ad_account_id, click_window_days = 30, engagement_window_days = 30, view_window_days = 1, conversion_report_time = "TIME_OF_AD_ACTION", reporting_timezone = var.reporting_timezone)

Get product group analytics

Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```R
library(openapi)

# Get product group analytics
#
# prepare function argument(s)
var_start_date <- "start_date_example" # character | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
var_end_date <- "end_date_example" # character | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
var_product_group_ids <- c("inner_example") # array[character] | List of Product group Ids to use to filter the results.
var_columns <- c(ReportingColumnSync$new()) # array[ReportingColumnSync] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
var_granularity <- Granularity$new() # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_click_window_days <- 30 # numeric | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (Optional)
var_engagement_window_days <- 30 # numeric | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (Optional)
var_view_window_days <- 1 # numeric | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (Optional)
var_conversion_report_time <- "TIME_OF_AD_ACTION" # character | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (Optional)
var_reporting_timezone <- ReportingTimeZone$new() # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (Optional)

api_instance <- ProductGroupPromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ProductGroupsAnalytics(var_start_date, var_end_date, var_product_group_ids, var_columns, var_granularity, var_ad_account_id, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time, reporting_timezone = var_reporting_timezonedata_file = "result.txt")
result <- api_instance$ProductGroupsAnalytics(var_start_date, var_end_date, var_product_group_ids, var_columns, var_granularity, var_ad_account_id, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time, reporting_timezone = var_reporting_timezone)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **product_group_ids** | list( **character** )| List of Product group Ids to use to filter the results. | 
 **columns** | list( [**ReportingColumnSync**](ReportingColumnSync.md) )| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **granularity** | [**Granularity**](.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **click_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **view_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | Enum [TIME_OF_AD_ACTION, TIME_OF_CONVERSION] | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]
 **reporting_timezone** | [**ReportingTimeZone**](.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**array[ProductGroupAnalyticsItems]**](ProductGroupAnalyticsItems.md)

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

