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
> ProductGroupPromotionResponse ProductGroupPromotionsCreate(ad_account_id, product_group_promotion_create_request)

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')

### Example
```R
library(openapi)

# Create product group promotions
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_product_group_promotion_create_request <- ProductGroupPromotionCreateRequest$new("ad_group_id_example", c(ProductGroupPromotion$new("id_example", "ad_group_id_example", 123, "included_example", "definition_example", "relative_definition_example", "parent_id_example", "slideshow_collections_title_example", "slideshow_collections_description_example", "is_mdl_example", EntityStatus$new(), "tracking_url_example", "catalog_product_group_id_example", "catalog_product_group_name_example", CreativeType$new(), "collections_hero_pin_id_example", "collections_hero_destination_url_example", GridClickType$new()))) # ProductGroupPromotionCreateRequest | List of Product Group Promotions to create, size limit [1, 30].

api_instance <- ProductGroupPromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ProductGroupPromotionsCreate(var_ad_account_id, var_product_group_promotion_create_requestdata_file = "result.txt")
result <- api_instance$ProductGroupPromotionsCreate(var_ad_account_id, var_product_group_promotion_create_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **product_group_promotion_create_request** | [**ProductGroupPromotionCreateRequest**](ProductGroupPromotionCreateRequest.md)| List of Product Group Promotions to create, size limit [1, 30]. | 

### Return type

[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

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

# **ProductGroupPromotionsGet**
> ProductGroupPromotionResponse ProductGroupPromotionsGet(ad_account_id, product_group_promotion_id)

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

[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **ProductGroupPromotionsList**
> ProductGroupPromotionsList200Response ProductGroupPromotionsList(ad_account_id, product_group_promotion_ids = var.product_group_promotion_ids, entity_statuses = ["ACTIVE","PAUSED"], ad_group_id = var.ad_group_id, page_size = 25, order = var.order, bookmark = var.bookmark)

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

### Example
```R
library(openapi)

# Get product group promotions
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_product_group_promotion_ids <- c("inner_example") # array[character] | List of Product group promotion Ids. (Optional)
var_entity_statuses <- c("ACTIVE") # array[character] | Entity status (Optional)
var_ad_group_id <- "123123123" # character | Ad group Id. (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)
var_order <- "ASCENDING" # character | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)

api_instance <- ProductGroupPromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ProductGroupPromotionsList(var_ad_account_id, product_group_promotion_ids = var_product_group_promotion_ids, entity_statuses = var_entity_statuses, ad_group_id = var_ad_group_id, page_size = var_page_size, order = var_order, bookmark = var_bookmarkdata_file = "result.txt")
result <- api_instance$ProductGroupPromotionsList(var_ad_account_id, product_group_promotion_ids = var_product_group_promotion_ids, entity_statuses = var_entity_statuses, ad_group_id = var_ad_group_id, page_size = var_page_size, order = var_order, bookmark = var_bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **product_group_promotion_ids** | list( **character** )| List of Product group promotion Ids. | [optional] 
 **entity_statuses** | Enum [ACTIVE, PAUSED, ARCHIVED, DRAFT, DELETED_DRAFT] | Entity status | [optional] [default to [&quot;ACTIVE&quot;,&quot;PAUSED&quot;]]
 **ad_group_id** | **character**| Ad group Id. | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | Enum [ASCENDING, DESCENDING] | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **ProductGroupPromotionsUpdate**
> ProductGroupPromotionResponse ProductGroupPromotionsUpdate(ad_account_id, product_group_promotion_update_request)

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Example
```R
library(openapi)

# Update product group promotions
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_product_group_promotion_update_request <- ProductGroupPromotionUpdateRequest$new("ad_group_id_example", c(ProductGroupPromotion$new("id_example", "ad_group_id_example", 123, "included_example", "definition_example", "relative_definition_example", "parent_id_example", "slideshow_collections_title_example", "slideshow_collections_description_example", "is_mdl_example", EntityStatus$new(), "tracking_url_example", "catalog_product_group_id_example", "catalog_product_group_name_example", CreativeType$new(), "collections_hero_pin_id_example", "collections_hero_destination_url_example", GridClickType$new()))) # ProductGroupPromotionUpdateRequest | Parameters to update Product group promotions

api_instance <- ProductGroupPromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ProductGroupPromotionsUpdate(var_ad_account_id, var_product_group_promotion_update_requestdata_file = "result.txt")
result <- api_instance$ProductGroupPromotionsUpdate(var_ad_account_id, var_product_group_promotion_update_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **product_group_promotion_update_request** | [**ProductGroupPromotionUpdateRequest**](ProductGroupPromotionUpdateRequest.md)| Parameters to update Product group promotions | 

### Return type

[**ProductGroupPromotionResponse**](ProductGroupPromotionResponse.md)

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

# **ProductGroupsAnalytics**
> array[ProductGroupAnalyticsResponseInner] ProductGroupsAnalytics(ad_account_id, start_date, end_date, product_group_ids, columns, granularity, click_window_days = 30, engagement_window_days = 30, view_window_days = 1, conversion_report_time = "TIME_OF_AD_ACTION")

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example
```R
library(openapi)

# Get product group analytics
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_start_date <- "start_date_example" # character | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
var_end_date <- "end_date_example" # character | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
var_product_group_ids <- c("inner_example") # array[character] | List of Product group Ids to use to filter the results.
var_columns <- c("SPEND_IN_MICRO_DOLLAR") # array[character] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.<br/>For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).<br/>If a column has no value, it may not be returned
var_granularity <- Granularity$new() # Granularity | TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
var_click_window_days <- 30 # integer | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (Optional)
var_engagement_window_days <- 30 # integer | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (Optional)
var_view_window_days <- 1 # integer | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (Optional)
var_conversion_report_time <- "TIME_OF_AD_ACTION" # character | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (Optional)

api_instance <- ProductGroupPromotionsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ProductGroupsAnalytics(var_ad_account_id, var_start_date, var_end_date, var_product_group_ids, var_columns, var_granularity, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_timedata_file = "result.txt")
result <- api_instance$ProductGroupsAnalytics(var_ad_account_id, var_start_date, var_end_date, var_product_group_ids, var_columns, var_granularity, click_window_days = var_click_window_days, engagement_window_days = var_engagement_window_days, view_window_days = var_view_window_days, conversion_report_time = var_conversion_report_time)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **start_date** | **character**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **character**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **product_group_ids** | list( **character** )| List of Product group Ids to use to filter the results. | 
 **columns** | Enum [SPEND_IN_MICRO_DOLLAR, PAID_IMPRESSION, SPEND_IN_DOLLAR, CPC_IN_MICRO_DOLLAR, ECPC_IN_MICRO_DOLLAR, ECPC_IN_DOLLAR, CTR, ECTR, CAMPAIGN_NAME, PIN_ID, TOTAL_ENGAGEMENT, ENGAGEMENT_1, ENGAGEMENT_2, ECPE_IN_DOLLAR, ENGAGEMENT_RATE, EENGAGEMENT_RATE, ECPM_IN_MICRO_DOLLAR, REPIN_RATE, CTR_2, CAMPAIGN_ID, ADVERTISER_ID, AD_ACCOUNT_ID, PIN_PROMOTION_ID, AD_ID, AD_GROUP_ID, CAMPAIGN_ENTITY_STATUS, CAMPAIGN_OBJECTIVE_TYPE, CPM_IN_MICRO_DOLLAR, CPM_IN_DOLLAR, AD_GROUP_ENTITY_STATUS, ORDER_LINE_ID, ORDER_LINE_NAME, CLICKTHROUGH_1, REPIN_1, IMPRESSION_1, IMPRESSION_1_GROSS, CLICKTHROUGH_1_GROSS, OUTBOUND_CLICK_1, CLICKTHROUGH_2, REPIN_2, IMPRESSION_2, OUTBOUND_CLICK_2, TOTAL_CLICKTHROUGH, TOTAL_IMPRESSION, TOTAL_IMPRESSION_USER, TOTAL_IMPRESSION_FREQUENCY, COST_PER_OUTBOUND_CLICK_IN_DOLLAR, TOTAL_ENGAGEMENT_SIGNUP, TOTAL_ENGAGEMENT_CHECKOUT, TOTAL_ENGAGEMENT_LEAD, TOTAL_CLICK_SIGNUP, TOTAL_CLICK_CHECKOUT, TOTAL_CLICK_ADD_TO_CART, TOTAL_CLICK_LEAD, TOTAL_VIEW_SIGNUP, TOTAL_VIEW_CHECKOUT, TOTAL_VIEW_ADD_TO_CART, TOTAL_VIEW_LEAD, TOTAL_CONVERSIONS, TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_SESSIONS, WEB_SESSIONS_1, WEB_SESSIONS_2, CAMPAIGN_LIFETIME_SPEND_CAP, CAMPAIGN_DAILY_SPEND_CAP, TOTAL_PAGE_VISIT, TOTAL_SIGNUP, TOTAL_CHECKOUT, TOTAL_CUSTOM, TOTAL_LEAD, TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR, TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR, PAGE_VISIT_COST_PER_ACTION, PAGE_VISIT_ROAS, CHECKOUT_ROAS, CUSTOM_ROAS, VIDEO_MRC_VIEWS_1, VIDEO_3SEC_VIEWS_2, VIDEO_P100_COMPLETE_2, VIDEO_P0_COMBINED_2, VIDEO_P25_COMBINED_2, VIDEO_P50_COMBINED_2, VIDEO_P75_COMBINED_2, VIDEO_P95_COMBINED_2, VIDEO_MRC_VIEWS_2, VIDEO_LENGTH, ECPV_IN_DOLLAR, ECPCV_IN_DOLLAR, ECPCV_P95_IN_DOLLAR, TOTAL_VIDEO_3SEC_VIEWS, TOTAL_VIDEO_P100_COMPLETE, TOTAL_VIDEO_P0_COMBINED, TOTAL_VIDEO_P25_COMBINED, TOTAL_VIDEO_P50_COMBINED, TOTAL_VIDEO_P75_COMBINED, TOTAL_VIDEO_P95_COMBINED, TOTAL_VIDEO_MRC_VIEWS, TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND, TOTAL_REPIN_RATE, WEB_CHECKOUT_COST_PER_ACTION, WEB_CHECKOUT_ROAS, TOTAL_WEB_CHECKOUT, TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_CLICK_CHECKOUT, TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_ENGAGEMENT_CHECKOUT, TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR, TOTAL_WEB_VIEW_CHECKOUT, TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR, INAPP_CHECKOUT_COST_PER_ACTION, TOTAL_OFFLINE_CHECKOUT, IDEA_PIN_PRODUCT_TAG_VISIT_1, IDEA_PIN_PRODUCT_TAG_VISIT_2, TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT, LEADS, COST_PER_LEAD, QUIZ_COMPLETED, QUIZ_COMPLETION_RATE, SHOWCASE_PIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_CLICKTHROUGH, SHOWCASE_SUBPIN_CLICKTHROUGH, SHOWCASE_SUBPAGE_IMPRESSION, SHOWCASE_SUBPIN_IMPRESSION, SHOWCASE_SUBPAGE_SWIPE_LEFT, SHOWCASE_SUBPAGE_SWIPE_RIGHT, SHOWCASE_SUBPIN_SWIPE_LEFT, SHOWCASE_SUBPIN_SWIPE_RIGHT, SHOWCASE_SUBPAGE_REPIN, SHOWCASE_SUBPIN_REPIN, SHOWCASE_SUBPAGE_CLOSEUP, SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD, SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD, SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION, TOTAL_CHECKOUT_CONVERSION_RATE, TOTAL_VIEW_CATEGORY_CONVERSION_RATE, TOTAL_ADD_TO_CART_CONVERSION_RATE, TOTAL_SIGNUP_CONVERSION_RATE, TOTAL_PAGE_VISIT_CONVERSION_RATE, TOTAL_LEAD_CONVERSION_RATE, TOTAL_SEARCH_CONVERSION_RATE, TOTAL_WATCH_VIDEO_CONVERSION_RATE, TOTAL_UNKNOWN_CONVERSION_RATE, TOTAL_CUSTOM_CONVERSION_RATE] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned | 
 **granularity** | [**Granularity**](.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
 **click_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagement_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **view_window_days** | Enum [0, 1, 7, 14, 30, 60] | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversion_report_time** | Enum [TIME_OF_AD_ACTION, TIME_OF_CONVERSION] | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]

### Return type

[**array[ProductGroupAnalyticsResponseInner]**](ProductGroupAnalyticsResponse_inner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads analytics parameters. |  -  |
| **0** | Unexpected error |  -  |

