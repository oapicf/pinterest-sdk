# BulkAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDownloadCreate**](BulkAPI.md#bulkdownloadcreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**bulkRequestGet**](BulkAPI.md#bulkrequestget) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**bulkUpsertCreate**](BulkAPI.md#bulkupsertcreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk


# **bulkDownloadCreate**
```swift
    open class func bulkDownloadCreate(adAccountId: String, bulkDownloadCreate: BulkDownloadCreate, completion: @escaping (_ data: BulkDownload?, _ error: Error?) -> Void)
```

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bulkDownloadCreate = BulkDownloadCreate(campaignFilter: BulkDownloadCampaignFilter(campaignStatus: [SummaryStatus()], endTime: "endTime_example", name: "name_example", objectiveType: [ConversionObjectiveType()], startTime: "startTime_example"), entityIds: ["entityIds_example"], entityTypes: [BulkEntityType()], outputFormat: BulkOutputFormat(), updatedSince: "updatedSince_example") // BulkDownloadCreate | 

// Get advertiser entities in bulk
BulkAPI.bulkDownloadCreate(adAccountId: adAccountId, bulkDownloadCreate: bulkDownloadCreate) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **bulkDownloadCreate** | [**BulkDownloadCreate**](BulkDownloadCreate.md) |  | 

### Return type

[**BulkDownload**](BulkDownload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bulkRequestGet**
```swift
    open class func bulkRequestGet(adAccountId: String, bulkRequestId: String, includeDetails: Bool? = nil, completion: @escaping (_ data: BulkJobData?, _ error: Error?) -> Void)
```

Download advertiser entities in bulk

Get the status of a bulk request by `request_id`, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bulkRequestId = "bulkRequestId_example" // String | Bulk request ID that is from one of the entities bulk endpoints
let includeDetails = true // Bool | If set to True then attach the errors/details to all the requests (optional) (default to false)

// Download advertiser entities in bulk
BulkAPI.bulkRequestGet(adAccountId: adAccountId, bulkRequestId: bulkRequestId, includeDetails: includeDetails) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **bulkRequestId** | **String** | Bulk request ID that is from one of the entities bulk endpoints | 
 **includeDetails** | **Bool** | If set to True then attach the errors/details to all the requests | [optional] [default to false]

### Return type

[**BulkJobData**](BulkJobData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bulkUpsertCreate**
```swift
    open class func bulkUpsertCreate(adAccountId: String, bulkUpsertRequest: BulkUpsertRequest, completion: @escaping (_ data: BulkUpsertResponse?, _ error: Error?) -> Void)
```

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bulkUpsertRequest = BulkUpsertRequest(create: BulkUpsertRequestCreate(adGroups: [AdGroupCreateRequest(autoTargetingEnabled: false, bidMultiplier: 123, budgetType: BudgetType(), pacingDeliveryType: PacingDeliveryType(), bidInMicroCurrency: 123, bidStrategyType: BidStrategyType(), billableEvent: ActionType(), budgetInMicroCurrency: 123, campaignId: "campaignId_example", endTime: 123, isCreativeOptimization: true, lifetimeFrequencyCap: 123, name: "name_example", optimizationGoalMetadata: 123, placementGroup: PlacementGroupType(), promotionApplicationLevel: "promotionApplicationLevel_example", promotionId: "promotionId_example", promotionIds: ["promotionIds_example"], startTime: 123, status: EntityStatus(), targetingSpec: TargetingSpec(AGE_BUCKET: [TargetingSpecAgeBucket()], APPTYPE: [TargetingSpecAppType()], AUDIENCE_EXCLUDE: ["AUDIENCE_EXCLUDE_example"], AUDIENCE_INCLUDE: ["AUDIENCE_INCLUDE_example"], GENDER: [TargetingSpecGender()], GEO: ["GEO_example"], GEO_EXCLUDE: ["GEO_EXCLUDE_example"], INTEREST: ["INTEREST_example"], LOCALE: ["LOCALE_example"], LOCATION: ["LOCATION_example"], LOCATION_EXCLUDE: ["LOCATION_EXCLUDE_example"], MAXIMUM_AGE: "MAXIMUM_AGE_example", MINIMUM_AGE: "MINIMUM_AGE_example", SHOPPING_RETARGETING: [TargetingSpecShoppingRetargeting(exclusionWindow: 123, lookbackWindow: 123, tagTypes: [123])], TARGETING_STRATEGY: ["TARGETING_STRATEGY_example"]), targetingTemplateIds: ["targetingTemplateIds_example"], trackingUrls: 123)], ads: [AdCreateRequest(adGroupId: "adGroupId_example", androidDeepLink: "androidDeepLink_example", carouselAndroidDeepLinks: ["carouselAndroidDeepLinks_example"], carouselDestinationUrls: ["carouselDestinationUrls_example"], carouselIosDeepLinks: ["carouselIosDeepLinks_example"], clickTrackingUrl: "clickTrackingUrl_example", creativeType: CreativeType(), customizableCtaType: CustomizableCTAType(), destinationUrl: "destinationUrl_example", disclosureType: DisclosureType(), disclosureUrl: "disclosureUrl_example", gridClickType: GridClickType(), iosDeepLink: "iosDeepLink_example", isCarting: false, isPinDeleted: false, isRemovable: false, leadFormId: "leadFormId_example", name: "name_example", pinId: "pinId_example", quizPinData: 123, status: nil, trackingUrls: 123, viewTrackingUrl: "viewTrackingUrl_example")], campaigns: [CampaignCreateRequest(bidOptions: CampaignBidOptionsCreate(ageBucketMultipliers: AgeBucketMultipliers(AGE_BUCKET: nil), appTypeMultipliers: AppTypeMultipliers(APP_TYPE: nil), audienceMultipliers: CampaignAudienceMultipliers(AUDIENCE_ID: "AUDIENCE_ID_example"), freqBidMultiplierTimeWindow: FreqBidMultiplierTimeWindow(), frequencyMultipliers: FrequencyMultipliers(IMPRESSION_COUNT: "IMPRESSION_COUNT_example"), genderMultipliers: GenderMultipliers(GENDER: nil), placementMultipliers: PlacementMultipliers(PLACEMENT: PlacementType())), intendedPromotionType: IntendedPromotionType(), isAutomatedCampaign: false, isCampaignBudgetOptimization: false, isFlexibleDailyBudgets: false, isLtvOptimized: false, isPerformancePlus: false, isTopOfSearch: false, objectiveType: ObjectiveType(), status: nil, adAccountId: "adAccountId_example", dailySpendCap: 123, defaultAdGroupBudgetInMicroCurrency: 123, endTime: 123, lifetimeSpendCap: 123, name: "name_example", orderLineId: "orderLineId_example", startTime: 123, trackingUrls: 123)], catalogProductGroups: [BulkUpsertRequestCreateCatalogProductGroupsItems(description: "description_example", feedId: "feedId_example", filters: CatalogsCreativeAssetsProductGroupFilters(anyOf: [CatalogsCreativeAssetsProductGroupFilterKeys(CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria(negated: false, values: ["values_example"]), cUSTOMLABEL0: CatalogsProductGroupFilterOperatorTypeCriteria(filterOperatorType: FilterOperatorType(), negated: false, values: ["values_example"]), cUSTOMLABEL1: nil, cUSTOMLABEL2: nil, cUSTOMLABEL3: nil, cUSTOMLABEL4: nil, gOOGLEPRODUCTCATEGORY6: CatalogsProductGroupMultipleStringListCriteria(negated: false, values: [["values_example"]]), gOOGLEPRODUCTCATEGORY5: nil, gOOGLEPRODUCTCATEGORY4: nil, gOOGLEPRODUCTCATEGORY3: nil, gOOGLEPRODUCTCATEGORY2: nil, gOOGLEPRODUCTCATEGORY1: nil, gOOGLEPRODUCTCATEGORY0: nil, MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria(negated: false, values: [MediaType()]), TITLE_KEYWORDS: nil, LINK: nil)], allOf: [nil]), isFeatured: false, name: "name_example", catalogId: "catalogId_example", catalogType: "catalogType_example", country: Country(), locale: CatalogsLocale())], keywords: [KeywordsRequest(keywords: [KeywordsCommon(bid: 123, matchType: MatchTypeResponse(), value: "value_example")], parentId: "parentId_example")], labels: [LabelBulkCreateRequest(labels: [LabelCreateItem(labelType: LabelType(), value: "value_example")], parentId: "parentId_example")], productGroups: [ProductGroupPromotionCreateRequest(adGroupId: "adGroupId_example", productGroupPromotion: [ProductGroupPromotion(adGroupId: "adGroupId_example", bidInMicroCurrency: 123, catalogProductGroupId: "catalogProductGroupId_example", catalogProductGroupName: "catalogProductGroupName_example", collectionsHeaderType: CollectionsHeaderType(), collectionsHeroDestinationUrl: "collectionsHeroDestinationUrl_example", collectionsHeroPinId: "collectionsHeroPinId_example", creativeType: nil, customizableCtaType: ProductGroupPromotionCustomizableCTAType(), definition: "definition_example", gridClickType: nil, id: "id_example", included: true, isGenerateBackground: true, isImageAutoResizing: true, isMdl: true, parentId: "parentId_example", preferredMediaType: PreferredMediaType(), relativeDefinition: "relativeDefinition_example", selectedImageTag: "selectedImageTag_example", selectedVideoTag: "selectedVideoTag_example", slideshowCollectionsDescription: "slideshowCollectionsDescription_example", slideshowCollectionsTitle: "slideshowCollectionsTitle_example", status: nil, trackingUrl: "trackingUrl_example")])], schedules: [ScheduleCreateRequest(entityId: "entityId_example", entityType: "entityType_example", deltaValue: ScheduleCommonDeltaValue(ageBucketMultipliers: ScheduleAgeBucketMultipliers(AGE_BUCKET: "AGE_BUCKET_example"), appTypeMultipliers: ScheduleAppTypeMultipliers(APP_TYPE: nil), audienceMultipliers: ScheduleAudienceMultipliers(AUDIENCE_ID: "AUDIENCE_ID_example"), genderMultipliers: ScheduleBidOptions_gender_multipliers(GENDER: nil), placementMultipliers: ScheduleBidOptions_placement_multipliers(browse: 123, relatedPins: 123, search: 123)), endTimestamp: 123, name: "name_example", scheduleAction: ScheduleAction(), scheduleStatus: ScheduleStatus(), scheduleType: ScheduleType(), startTimestamp: 123)]), update: BulkUpsertRequestUpdate(adGroups: [AdGroupUpdateRequest(bidMultiplier: 123, id: "id_example", targetingSpecOperations: [TargetingSpecOperations(field: "field_example", operation: "operation_example", values: [nil], value: "value_example")], autoTargetingEnabled: true, bidInMicroCurrency: 123, bidStrategyType: nil, billableEvent: nil, budgetInMicroCurrency: 123, budgetType: nil, campaignId: "campaignId_example", endTime: 123, isCreativeOptimization: true, lifetimeFrequencyCap: 123, name: "name_example", optimizationGoalMetadata: 123, pacingDeliveryType: nil, placementGroup: nil, promotionApplicationLevel: "promotionApplicationLevel_example", promotionId: "promotionId_example", promotionIds: ["promotionIds_example"], startTime: 123, status: nil, targetingSpec: nil, targetingTemplateIds: ["targetingTemplateIds_example"], trackingUrls: 123)], ads: [AdUpdateRequest(id: "id_example", pinId: "pinId_example", adGroupId: "adGroupId_example", androidDeepLink: "androidDeepLink_example", carouselAndroidDeepLinks: ["carouselAndroidDeepLinks_example"], carouselDestinationUrls: ["carouselDestinationUrls_example"], carouselIosDeepLinks: ["carouselIosDeepLinks_example"], clickTrackingUrl: "clickTrackingUrl_example", creativeType: nil, customizableCtaType: nil, destinationUrl: "destinationUrl_example", disclosureType: nil, disclosureUrl: "disclosureUrl_example", gridClickType: nil, iosDeepLink: "iosDeepLink_example", isCarting: false, isPinDeleted: false, isRemovable: false, leadFormId: "leadFormId_example", name: "name_example", quizPinData: 123, status: nil, trackingUrls: 123, viewTrackingUrl: "viewTrackingUrl_example")], campaigns: [CampaignUpdateRequest(bidOptions: CampaignBidOptionsUpdate(ageBucketMultipliers: nil, appTypeMultipliers: nil, audienceMultipliers: nil, freqBidMultiplierTimeWindow: nil, frequencyMultipliers: nil, genderMultipliers: nil, placementMultipliers: nil, updateMask: [CampaignBidOptionsUpdateMaskItems()]), intendedPromotionType: nil, isLtvOptimized: false, isPerformancePlus: false, isTopOfSearch: false, objectiveType: nil, adAccountId: "adAccountId_example", dailySpendCap: 123, defaultAdGroupBudgetInMicroCurrency: 123, endTime: 123, id: "id_example", isAutomatedCampaign: false, isCampaignBudgetOptimization: false, isFlexibleDailyBudgets: false, lifetimeSpendCap: 123, name: "name_example", orderLineId: "orderLineId_example", startTime: 123, status: nil, trackingUrls: 123)], catalogProductGroups: [BulkUpsertRequestUpdateCatalogProductGroupsItems(description: "description_example", filters: nil, isFeatured: false, name: "name_example", catalogType: "catalogType_example", country: nil, locale: nil)], keywords: [KeywordUpdateGenerated(archived: false, bid: 123, id: "id_example")], labels: [LabelBulkUpdateRequest(id: "id_example", parentId: "parentId_example", status: LabelStatusBulkUpdate())], productGroups: [ProductGroupPromotionUpdateRequest(adGroupId: "adGroupId_example", productGroupPromotion: [nil])], schedules: [ScheduleUpdateRequest(entityId: "entityId_example", entityType: "entityType_example", id: "id_example", deltaValue: nil, endTimestamp: 123, name: "name_example", scheduleAction: nil, scheduleStatus: nil, scheduleType: nil, startTimestamp: 123)])) // BulkUpsertRequest | Parameters to get create/update ad entities in bulk

// Create/update ad entities in bulk
BulkAPI.bulkUpsertCreate(adAccountId: adAccountId, bulkUpsertRequest: bulkUpsertRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **bulkUpsertRequest** | [**BulkUpsertRequest**](BulkUpsertRequest.md) | Parameters to get create/update ad entities in bulk | 

### Return type

[**BulkUpsertResponse**](BulkUpsertResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

