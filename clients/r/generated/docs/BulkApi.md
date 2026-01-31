# BulkApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BulkDownloadCreate**](BulkApi.md#BulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**BulkRequestGet**](BulkApi.md#BulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**BulkUpsertCreate**](BulkApi.md#BulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk


# **BulkDownloadCreate**
> BulkDownloadResponse BulkDownloadCreate(ad_account_id, bulk_download_request)

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example
```R
library(openapi)

# Get advertiser entities in bulk
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bulk_download_request <- BulkDownloadRequest$new(BulkDownloadRequest_campaign_filter$new(c(CampaignSummaryStatus$new()), "end_time_example", "name_example", c(ObjectiveType$new()), "start_time_example"), c("entity_ids_example"), c(BulkEntityType$new()), BulkOutputFormat$new(), "updated_since_example") # BulkDownloadRequest | Parameters to get ad entities in bulk

api_instance <- BulkApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BulkDownloadCreate(var_ad_account_id, var_bulk_download_requestdata_file = "result.txt")
result <- api_instance$BulkDownloadCreate(var_ad_account_id, var_bulk_download_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bulk_download_request** | [**BulkDownloadRequest**](BulkDownloadRequest.md)| Parameters to get ad entities in bulk | 

### Return type

[**BulkDownloadResponse**](BulkDownloadResponse.md)

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

# **BulkRequestGet**
> BulkUpsertStatusResponse BulkRequestGet(ad_account_id, bulk_request_id, include_details = FALSE)

Download advertiser entities in bulk

Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Example
```R
library(openapi)

# Download advertiser entities in bulk
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bulk_request_id <- "bulk_request_id_example" # character | Unique identifier of a bulk upsert request.
var_include_details <- FALSE # character | if set to True then attach the errors/details to all the requests (Optional)

api_instance <- BulkApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BulkRequestGet(var_ad_account_id, var_bulk_request_id, include_details = var_include_detailsdata_file = "result.txt")
result <- api_instance$BulkRequestGet(var_ad_account_id, var_bulk_request_id, include_details = var_include_details)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bulk_request_id** | **character**| Unique identifier of a bulk upsert request. | 
 **include_details** | **character**| if set to True then attach the errors/details to all the requests | [optional] [default to FALSE]

### Return type

[**BulkUpsertStatusResponse**](BulkUpsertStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **BulkUpsertCreate**
> BulkUpsertResponse BulkUpsertCreate(ad_account_id, bulk_upsert_request)

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Example
```R
library(openapi)

# Create/update ad entities in bulk
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bulk_upsert_request <- BulkUpsertRequest$new(BulkUpsertRequestCreate$new(c(AdGroupCreateRequest$new(ActionType$new(), "campaign_id_example", "name_example", "auto_targeting_enabled_example", 123, "AUTOMATIC_BID", 123, BudgetType$new(), 123, "is_creative_optimization_example", 123, OptimizationGoalMetadata$new(OptimizationGoalMetadata_conversion_tag_v3_goal_metadata$new(..., "PAGE_VISIT", "conversion_tag_id_example", "cpa_goal_value_in_micro_currency_example", "is_roas_optimized_example", "NOT_ACTIVE", "reporting_event_example"), OptimizationGoalMetadata_frequency_goal_metadata$new(123, "THIRTY_DAY"), OptimizationGoalMetadata_scrollup_goal_metadata$new("scrollup_goal_value_in_micro_currency_example")), PacingDeliveryType$new(), PlacementGroupType$new(), "NONE", "promotion_id_example", 123, EntityStatus$new(), TargetingSpec$new(c(TargetingSpecAgeBucket$new()), c(TargetingSpecAppType$new()), c("AUDIENCE_EXCLUDE_example"), c("AUDIENCE_INCLUDE_example"), c(TargetingSpecGender$new()), c("GEO_example"), c("INTEREST_example"), c("LOCALE_example"), c("LOCATION_example"), "MAXIMUM_AGE_example", "MINIMUM_AGE_example", c(TargetingSpecShoppingRetargeting$new(..., ..., ...)), c("CHOOSE_YOUR_OWN")), c("targeting_template_ids_example"), TrackingUrls$new(c("audience_verification_example"), c("buyable_button_example"), c("click_example"), c("engagement_example"), c("impression_example")), 123)), c(AdCreateRequest$new("ad_group_id_example", CreativeType$new(), "pin_id_example", "android_deep_link_example", c("carousel_android_deep_links_example"), c("carousel_destination_urls_example"), c("carousel_ios_deep_links_example"), "click_tracking_url_example", CustomizableCTAType$new(), "destination_url_example", DisclosureType$new(), "disclosure_url_example", GridClickType$new(), "ios_deep_link_example", "is_pin_deleted_example", "is_removable_example", "lead_form_id_example", "name_example", QuizPinData$new(c(QuizPinQuestion$new(..., ..., ...)), c(QuizPinResult$new(..., ..., ..., ..., ...)), QuizPinResult$new("android_deep_link_example", "destination_url_example", "ios_deep_link_example", "organic_pin_id_example", 123), "RANDOM"), EntityStatus$new(), TrackingUrls$new(c("audience_verification_example"), c("buyable_button_example"), c("click_example"), c("engagement_example"), c("impression_example")), "view_tracking_url_example")), c(CampaignCreateRequest$new("ad_account_id_example", "name_example", ObjectiveType$new(), 123, 123, "is_automated_campaign_example", "is_flexible_daily_budgets_example", 123, "order_line_id_example", 123, EntityStatus$new(), TrackingUrls$new(c("audience_verification_example"), c("buyable_button_example"), c("click_example"), c("engagement_example"), c("impression_example")), 123, "is_campaign_budget_optimization_example", CampaignBidOptionsCreate$new(AppTypeMultipliers$new("android_mobile"), CampaignAudienceMultipliers$new("AUDIENCE_ID_example"), PlacementMultipliers$new("SEARCH")), "is_performance_plus_example")), c(multiple_product_groups_inner$new("feed_id_example", CatalogsCreativeAssetsProductGroupFilters$new(c(CatalogsCreativeAssetsProductGroupFilterKeys$new(..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ...)), c(CatalogsCreativeAssetsProductGroupFilterKeys$new(..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ...))), "name_example", "catalog_id_example", "CREATIVE_ASSETS", "description_example", "is_featured_example", Country$new(), CatalogsLocale$new())), c(KeywordsRequest$new(c(KeywordsCommon$new(MatchTypeResponse$new(), "value_example", 123)), "parent_id_example")), c(LabelCreateRequest$new(c(LabelCreateRequest_labels_inner$new(LabelType$new(), "value_example")), "parent_id_example")), c(ProductGroupPromotionCreateRequest$new("ad_group_id_example", c(ProductGroupPromotion$new("ad_group_id_example", 123, "catalog_product_group_id_example", "catalog_product_group_name_example", "SHOP_THIS_COLLECTION", "collections_hero_destination_url_example", "collections_hero_pin_id_example", CreativeType$new(), "SHOP_NOW", "definition_example", GridClickType$new(), "id_example", "included_example", "is_generate_background_example", "is_mdl_example", "parent_id_example", "VIDEO", "relative_definition_example", "selected_image_tag_example", "selected_video_tag_example", "slideshow_collections_description_example", "slideshow_collections_title_example", EntityStatus$new(), "tracking_url_example"))))), BulkUpsertRequestUpdate$new(c(AdGroupUpdateRequest$new("id_example", "auto_targeting_enabled_example", 123, "AUTOMATIC_BID", ActionType$new(), 123, BudgetType$new(), "campaign_id_example", 123, "is_creative_optimization_example", 123, "name_example", OptimizationGoalMetadata$new(OptimizationGoalMetadata_conversion_tag_v3_goal_metadata$new(..., "PAGE_VISIT", "conversion_tag_id_example", "cpa_goal_value_in_micro_currency_example", "is_roas_optimized_example", "NOT_ACTIVE", "reporting_event_example"), OptimizationGoalMetadata_frequency_goal_metadata$new(123, "THIRTY_DAY"), OptimizationGoalMetadata_scrollup_goal_metadata$new("scrollup_goal_value_in_micro_currency_example")), PacingDeliveryType$new(), PlacementGroupType$new(), "NONE", "promotion_id_example", 123, EntityStatus$new(), TargetingSpec$new(c(TargetingSpecAgeBucket$new()), c(TargetingSpecAppType$new()), c("AUDIENCE_EXCLUDE_example"), c("AUDIENCE_INCLUDE_example"), c(TargetingSpecGender$new()), c("GEO_example"), c("INTEREST_example"), c("LOCALE_example"), c("LOCATION_example"), "MAXIMUM_AGE_example", "MINIMUM_AGE_example", c(TargetingSpecShoppingRetargeting$new(..., ..., ...)), c("CHOOSE_YOUR_OWN")), c("targeting_template_ids_example"), TrackingUrls$new(c("audience_verification_example"), c("buyable_button_example"), c("click_example"), c("engagement_example"), c("impression_example")), 123)), c(AdUpdateRequest$new("id_example", "ad_group_id_example", "android_deep_link_example", c("carousel_android_deep_links_example"), c("carousel_destination_urls_example"), c("carousel_ios_deep_links_example"), "click_tracking_url_example", CreativeType$new(), CustomizableCTAType$new(), "destination_url_example", DisclosureType$new(), "disclosure_url_example", GridClickType$new(), "ios_deep_link_example", "is_pin_deleted_example", "is_removable_example", "lead_form_id_example", "name_example", QuizPinData$new(c(QuizPinQuestion$new(..., ..., ...)), c(QuizPinResult$new(..., ..., ..., ..., ...)), QuizPinResult$new("android_deep_link_example", "destination_url_example", "ios_deep_link_example", "organic_pin_id_example", 123), "RANDOM"), EntityStatus$new(), TrackingUrls$new(c("audience_verification_example"), c("buyable_button_example"), c("click_example"), c("engagement_example"), c("impression_example")), "view_tracking_url_example", "pin_id_example")), c(CampaignUpdateRequest$new("id_example", "ad_account_id_example", 123, 123, "is_automated_campaign_example", "is_flexible_daily_budgets_example", 123, "name_example", "order_line_id_example", 123, EntityStatus$new(), TrackingUrls$new(c("audience_verification_example"), c("buyable_button_example"), c("click_example"), c("engagement_example"), c("impression_example")), 123, "is_campaign_budget_optimization_example", CampaignBidOptionsUpdate$new(c("AUDIENCE"), AppTypeMultipliers$new("android_mobile"), CampaignAudienceMultipliers$new("AUDIENCE_ID_example"), PlacementMultipliers$new("SEARCH")), "is_performance_plus_example", ObjectiveType$new())), c(catalogs_product_groups_update_request$new("description_example", CatalogsCreativeAssetsProductGroupFilters$new(c(CatalogsCreativeAssetsProductGroupFilterKeys$new(..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ...)), c(CatalogsCreativeAssetsProductGroupFilterKeys$new(..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ...))), "is_featured_example", "name_example", "CREATIVE_ASSETS", Country$new(), CatalogsLocale$new())), c(KeywordUpdate$new("id_example", "archived_example", 123)), c(LabelBulkUpdateRequest$new("id_example", "ARCHIVED", "value_example")), c(ProductGroupPromotionUpdateRequest$new("ad_group_id_example", c(ProductGroupPromotion$new("ad_group_id_example", 123, "catalog_product_group_id_example", "catalog_product_group_name_example", "SHOP_THIS_COLLECTION", "collections_hero_destination_url_example", "collections_hero_pin_id_example", CreativeType$new(), "SHOP_NOW", "definition_example", GridClickType$new(), "id_example", "included_example", "is_generate_background_example", "is_mdl_example", "parent_id_example", "VIDEO", "relative_definition_example", "selected_image_tag_example", "selected_video_tag_example", "slideshow_collections_description_example", "slideshow_collections_title_example", EntityStatus$new(), "tracking_url_example")))))) # BulkUpsertRequest | Parameters to get create/update ad entities in bulk

api_instance <- BulkApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BulkUpsertCreate(var_ad_account_id, var_bulk_upsert_requestdata_file = "result.txt")
result <- api_instance$BulkUpsertCreate(var_ad_account_id, var_bulk_upsert_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bulk_upsert_request** | [**BulkUpsertRequest**](BulkUpsertRequest.md)| Parameters to get create/update ad entities in bulk | 

### Return type

[**BulkUpsertResponse**](BulkUpsertResponse.md)

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

