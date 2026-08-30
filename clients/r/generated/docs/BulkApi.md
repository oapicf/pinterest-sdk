# BulkApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BulkDownloadCreate**](BulkApi.md#BulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**BulkRequestGet**](BulkApi.md#BulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**BulkUpsertCreate**](BulkApi.md#BulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk


# **BulkDownloadCreate**
> BulkDownload BulkDownloadCreate(ad_account_id, bulk_download_create)

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example
```R
library(openapi)

# Get advertiser entities in bulk
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bulk_download_create <- BulkDownloadCreate$new(BulkDownloadCampaignFilter$new(c(SummaryStatus$new()), "end_time_example", "name_example", c(ConversionObjectiveType$new()), "start_time_example"), c("entity_ids_example"), c(BulkEntityType$new()), BulkOutputFormat$new(), "updated_since_example") # BulkDownloadCreate | 

api_instance <- BulkApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BulkDownloadCreate(var_ad_account_id, var_bulk_download_createdata_file = "result.txt")
result <- api_instance$BulkDownloadCreate(var_ad_account_id, var_bulk_download_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bulk_download_create** | [**BulkDownloadCreate**](BulkDownloadCreate.md)|  | 

### Return type

[**BulkDownload**](BulkDownload.md)

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

# **BulkRequestGet**
> BulkJobData BulkRequestGet(ad_account_id, bulk_request_id, include_details = FALSE)

Download advertiser entities in bulk

Get the status of a bulk request by `request_id`, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).

### Example
```R
library(openapi)

# Download advertiser entities in bulk
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bulk_request_id <- "bulk_request_id_example" # character | Bulk request ID that is from one of the entities bulk endpoints
var_include_details <- FALSE # character | If set to True then attach the errors/details to all the requests (Optional)

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
 **bulk_request_id** | **character**| Bulk request ID that is from one of the entities bulk endpoints | 
 **include_details** | **character**| If set to True then attach the errors/details to all the requests | [optional] [default to FALSE]

### Return type

[**BulkJobData**](BulkJobData.md)

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

# **BulkUpsertCreate**
> BulkUpsertResponse BulkUpsertCreate(ad_account_id, bulk_upsert_request)

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Example
```R
library(openapi)

# Create/update ad entities in bulk
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bulk_upsert_request <- BulkUpsertRequest$new(BulkUpsertRequestCreate$new(c(AdGroupCreateRequest$new(ActionType$new(), "campaign_id_example", "name_example", "auto_targeting_enabled_example", 123, BudgetType$new(), PacingDeliveryType$new(), 123, BidStrategyType$new(), 123, 123, "is_creative_optimization_example", 123, 123, PlacementGroupType$new(), "NONE", "promotion_id_example", c("promotion_ids_example"), 123, EntityStatus$new(), TargetingSpec$new(c(TargetingSpecAgeBucket$new()), c(TargetingSpecAppType$new()), c("AUDIENCE_EXCLUDE_example"), c("AUDIENCE_INCLUDE_example"), c(TargetingSpecGender$new()), c("GEO_example"), c("GEO_EXCLUDE_example"), c("INTEREST_example"), c("LOCALE_example"), c("LOCATION_example"), c("LOCATION_EXCLUDE_example"), "MAXIMUM_AGE_example", "MINIMUM_AGE_example", c(TargetingSpecShoppingRetargeting$new(..., ..., ...)), c("CHOOSE_YOUR_OWN")), c("targeting_template_ids_example"), 123)), c(AdCreateRequest$new("ad_group_id_example", CreativeType$new(), "pin_id_example", "android_deep_link_example", c("carousel_android_deep_links_example"), c("carousel_destination_urls_example"), c("carousel_ios_deep_links_example"), "click_tracking_url_example", CustomizableCTAType$new(), "destination_url_example", DisclosureType$new(), "disclosure_url_example", GridClickType$new(), "ios_deep_link_example", "is_carting_example", "is_pin_deleted_example", "is_removable_example", "lead_form_id_example", "name_example", 123, EntityStatus$new(), 123, "view_tracking_url_example")), c(CampaignCreateRequest$new(ObjectiveType$new(), "ad_account_id_example", "name_example", CampaignBidOptionsCreate$new(AgeBucketMultipliers$new(...), AppTypeMultipliers$new(...), CampaignAudienceMultipliers$new("AUDIENCE_ID_example"), FreqBidMultiplierTimeWindow$new(), FrequencyMultipliers$new("IMPRESSION_COUNT_example"), GenderMultipliers$new(...), PlacementMultipliers$new(...)), IntendedPromotionType$new(), "is_automated_campaign_example", "is_campaign_budget_optimization_example", "is_flexible_daily_budgets_example", "is_ltv_optimized_example", "is_performance_plus_example", "is_top_of_search_example", EntityStatus$new(), 123, 123, 123, 123, "order_line_id_example", 123, 123)), c(BulkUpsertRequestCreateCatalogProductGroupsItems$new("feed_id_example", CatalogsCreativeAssetsProductGroupFilters$new(c(CatalogsCreativeAssetsProductGroupFilterKeys$new(..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ...)), c(CatalogsCreativeAssetsProductGroupFilterKeys$new(..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ...))), "name_example", "catalog_id_example", "CREATIVE_ASSETS", "description_example", "is_featured_example", Country$new(), CatalogsLocale$new())), c(KeywordsRequest$new(c(KeywordsCommon$new(MatchTypeResponse$new(), "value_example", 123)), "parent_id_example")), c(LabelBulkCreateRequest$new(c(LabelCreateItem$new(LabelType$new(), "value_example")), "parent_id_example")), c(ProductGroupPromotionCreateRequest$new("ad_group_id_example", c(ProductGroupPromotion$new("ad_group_id_example", 123, "catalog_product_group_id_example", "catalog_product_group_name_example", CollectionsHeaderType$new(), "collections_hero_destination_url_example", "collections_hero_pin_id_example", CreativeType$new(), ProductGroupPromotionCustomizableCTAType$new(), "definition_example", GridClickType$new(), "id_example", "included_example", "is_generate_background_example", "is_image_auto_resizing_example", "is_mdl_example", "parent_id_example", PreferredMediaType$new(), "relative_definition_example", "selected_image_tag_example", "selected_video_tag_example", "slideshow_collections_description_example", "slideshow_collections_title_example", EntityStatus$new(), "tracking_url_example")))), c(ScheduleCreateRequest$new("entity_id_example", "entity_type_example", ScheduleCommonDeltaValue$new(ScheduleAgeBucketMultipliers$new("18-24"), ScheduleAppTypeMultipliers$new(...), ScheduleAudienceMultipliers$new("AUDIENCE_ID_example"), ScheduleBidOptions_gender_multipliers$new(...), ScheduleBidOptions_placement_multipliers$new(123, 123, 123)), 123, "name_example", ScheduleAction$new(), ScheduleStatus$new(), ScheduleType$new(), 123))), BulkUpsertRequestUpdate$new(c(AdGroupUpdateRequest$new("id_example", 123, c(TargetingSpecOperations$new("MINIMUM_AGE", "SET", c(...), "value_example")), "auto_targeting_enabled_example", 123, BidStrategyType$new(), ActionType$new(), 123, BudgetType$new(), "campaign_id_example", 123, "is_creative_optimization_example", 123, "name_example", 123, PacingDeliveryType$new(), PlacementGroupType$new(), "NONE", "promotion_id_example", c("promotion_ids_example"), 123, EntityStatus$new(), TargetingSpec$new(c(TargetingSpecAgeBucket$new()), c(TargetingSpecAppType$new()), c("AUDIENCE_EXCLUDE_example"), c("AUDIENCE_INCLUDE_example"), c(TargetingSpecGender$new()), c("GEO_example"), c("GEO_EXCLUDE_example"), c("INTEREST_example"), c("LOCALE_example"), c("LOCATION_example"), c("LOCATION_EXCLUDE_example"), "MAXIMUM_AGE_example", "MINIMUM_AGE_example", c(TargetingSpecShoppingRetargeting$new(..., ..., ...)), c("CHOOSE_YOUR_OWN")), c("targeting_template_ids_example"), 123)), c(AdUpdateRequest$new("id_example", "pin_id_example", "ad_group_id_example", "android_deep_link_example", c("carousel_android_deep_links_example"), c("carousel_destination_urls_example"), c("carousel_ios_deep_links_example"), "click_tracking_url_example", CreativeType$new(), CustomizableCTAType$new(), "destination_url_example", DisclosureType$new(), "disclosure_url_example", GridClickType$new(), "ios_deep_link_example", "is_carting_example", "is_pin_deleted_example", "is_removable_example", "lead_form_id_example", "name_example", 123, EntityStatus$new(), 123, "view_tracking_url_example")), c(CampaignUpdateRequest$new("ad_account_id_example", "id_example", CampaignBidOptionsUpdate$new(c(CampaignBidOptionsUpdateMaskItems$new()), AgeBucketMultipliers$new(...), AppTypeMultipliers$new(...), CampaignAudienceMultipliers$new("AUDIENCE_ID_example"), FreqBidMultiplierTimeWindow$new(), FrequencyMultipliers$new("IMPRESSION_COUNT_example"), GenderMultipliers$new(...), PlacementMultipliers$new(...)), IntendedPromotionType$new(), "is_ltv_optimized_example", "is_performance_plus_example", "is_top_of_search_example", ObjectiveType$new(), 123, 123, 123, "is_automated_campaign_example", "is_campaign_budget_optimization_example", "is_flexible_daily_budgets_example", 123, "name_example", "order_line_id_example", 123, EntityStatus$new(), 123)), c(BulkUpsertRequestUpdateCatalogProductGroupsItems$new("description_example", CatalogsCreativeAssetsProductGroupFilters$new(c(CatalogsCreativeAssetsProductGroupFilterKeys$new(..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ...)), c(CatalogsCreativeAssetsProductGroupFilterKeys$new(..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ..., ...))), "is_featured_example", "name_example", "CREATIVE_ASSETS", Country$new(), CatalogsLocale$new())), c(KeywordUpdateGenerated$new("id_example", "archived_example", 123)), c(LabelBulkUpdateRequest$new("id_example", "parent_id_example", LabelStatusBulkUpdate$new())), c(ProductGroupPromotionUpdateRequest$new("ad_group_id_example", c(ProductGroupPromotion$new("ad_group_id_example", 123, "catalog_product_group_id_example", "catalog_product_group_name_example", CollectionsHeaderType$new(), "collections_hero_destination_url_example", "collections_hero_pin_id_example", CreativeType$new(), ProductGroupPromotionCustomizableCTAType$new(), "definition_example", GridClickType$new(), "id_example", "included_example", "is_generate_background_example", "is_image_auto_resizing_example", "is_mdl_example", "parent_id_example", PreferredMediaType$new(), "relative_definition_example", "selected_image_tag_example", "selected_video_tag_example", "slideshow_collections_description_example", "slideshow_collections_title_example", EntityStatus$new(), "tracking_url_example")))), c(ScheduleUpdateRequest$new("id_example", "entity_id_example", "entity_type_example", ScheduleCommonDeltaValue$new(ScheduleAgeBucketMultipliers$new("18-24"), ScheduleAppTypeMultipliers$new(...), ScheduleAudienceMultipliers$new("AUDIENCE_ID_example"), ScheduleBidOptions_gender_multipliers$new(...), ScheduleBidOptions_placement_multipliers$new(123, 123, 123)), 123, "name_example", ScheduleAction$new(), ScheduleStatus$new(), ScheduleType$new(), 123)))) # BulkUpsertRequest | Parameters to get create/update ad entities in bulk

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
| **200** | The request has succeeded. |  -  |
| **0** | Unexpected error |  -  |

