# BulkAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDownloadCreate**](BulkAPI.md#bulkdownloadcreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**bulkRequestGet**](BulkAPI.md#bulkrequestget) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**bulkUpsertCreate**](BulkAPI.md#bulkupsertcreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk


# **bulkDownloadCreate**
```swift
    open class func bulkDownloadCreate(adAccountId: String, bulkDownloadRequest: BulkDownloadRequest, completion: @escaping (_ data: BulkDownloadResponse?, _ error: Error?) -> Void)
```

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bulkDownloadRequest = BulkDownloadRequest(campaignFilter: BulkDownloadRequest_campaign_filter(campaignStatus: [CampaignSummaryStatus()], endTime: "endTime_example", name: "name_example", objectiveType: [ObjectiveType()], startTime: "startTime_example"), entityIds: ["entityIds_example"], entityTypes: [BulkEntityType()], outputFormat: BulkOutputFormat(), updatedSince: "updatedSince_example") // BulkDownloadRequest | Parameters to get ad entities in bulk

// Get advertiser entities in bulk
BulkAPI.bulkDownloadCreate(adAccountId: adAccountId, bulkDownloadRequest: bulkDownloadRequest) { (response, error) in
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
 **bulkDownloadRequest** | [**BulkDownloadRequest**](BulkDownloadRequest.md) | Parameters to get ad entities in bulk | 

### Return type

[**BulkDownloadResponse**](BulkDownloadResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bulkRequestGet**
```swift
    open class func bulkRequestGet(adAccountId: String, bulkRequestId: String, includeDetails: Bool? = nil, completion: @escaping (_ data: BulkUpsertStatusResponse?, _ error: Error?) -> Void)
```

Download advertiser entities in bulk

Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bulkRequestId = "bulkRequestId_example" // String | Unique identifier of a bulk upsert request.
let includeDetails = true // Bool | if set to True then attach the errors/details to all the requests (optional) (default to false)

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
 **bulkRequestId** | **String** | Unique identifier of a bulk upsert request. | 
 **includeDetails** | **Bool** | if set to True then attach the errors/details to all the requests | [optional] [default to false]

### Return type

[**BulkUpsertStatusResponse**](BulkUpsertStatusResponse.md)

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

Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bulkUpsertRequest = BulkUpsertRequest(create: BulkUpsertRequestCreate(adGroups: [AdGroupCreateRequest(autoTargetingEnabled: true, bidInMicroCurrency: 123, bidStrategyType: "bidStrategyType_example", billableEvent: ActionType(), budgetInMicroCurrency: 123, budgetType: BudgetType(), campaignId: "campaignId_example", endTime: 123, isCreativeOptimization: true, lifetimeFrequencyCap: 123, name: "name_example", optimizationGoalMetadata: OptimizationGoalMetadata(conversionTagV3GoalMetadata: OptimizationGoalMetadata_conversion_tag_v3_goal_metadata(attributionWindows: OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows(clickWindowDays: 123, engagementWindowDays: 123, viewWindowDays: 123), conversionEvent: "conversionEvent_example", conversionTagId: "conversionTagId_example", cpaGoalValueInMicroCurrency: "cpaGoalValueInMicroCurrency_example", isRoasOptimized: false, learningModeType: "learningModeType_example", reportingEvent: "reportingEvent_example"), frequencyGoalMetadata: OptimizationGoalMetadata_frequency_goal_metadata(frequency: 123, timerange: "timerange_example"), scrollupGoalMetadata: OptimizationGoalMetadata_scrollup_goal_metadata(scrollupGoalValueInMicroCurrency: "scrollupGoalValueInMicroCurrency_example")), pacingDeliveryType: PacingDeliveryType(), placementGroup: PlacementGroupType(), promotionApplicationLevel: "promotionApplicationLevel_example", promotionId: "promotionId_example", startTime: 123, status: EntityStatus(), targetingSpec: TargetingSpec(AGE_BUCKET: [TargetingSpecAgeBucket()], APPTYPE: [TargetingSpecAppType()], AUDIENCE_EXCLUDE: ["AUDIENCE_EXCLUDE_example"], AUDIENCE_INCLUDE: ["AUDIENCE_INCLUDE_example"], GENDER: [TargetingSpecGender()], GEO: ["GEO_example"], INTEREST: ["INTEREST_example"], LOCALE: ["LOCALE_example"], LOCATION: ["LOCATION_example"], MAXIMUM_AGE: "MAXIMUM_AGE_example", MINIMUM_AGE: "MINIMUM_AGE_example", SHOPPING_RETARGETING: [TargetingSpecShoppingRetargeting(exclusionWindow: 123, lookbackWindow: 123, tagTypes: [123])], TARGETING_STRATEGY: ["TARGETING_STRATEGY_example"]), targetingTemplateIds: ["targetingTemplateIds_example"], trackingUrls: TrackingUrls(audienceVerification: ["audienceVerification_example"], buyableButton: ["buyableButton_example"], click: ["click_example"], engagement: ["engagement_example"], impression: ["impression_example"]), bidMultiplier: 123)], ads: [AdCreateRequest(adGroupId: "adGroupId_example", androidDeepLink: "androidDeepLink_example", carouselAndroidDeepLinks: ["carouselAndroidDeepLinks_example"], carouselDestinationUrls: ["carouselDestinationUrls_example"], carouselIosDeepLinks: ["carouselIosDeepLinks_example"], clickTrackingUrl: "clickTrackingUrl_example", creativeType: CreativeType(), customizableCtaType: CustomizableCTAType(), destinationUrl: "destinationUrl_example", disclosureType: DisclosureType(), disclosureUrl: "disclosureUrl_example", gridClickType: GridClickType(), iosDeepLink: "iosDeepLink_example", isPinDeleted: false, isRemovable: false, leadFormId: "leadFormId_example", name: "name_example", quizPinData: QuizPinData(questions: [QuizPinQuestion(options: [QuizPinOption(id: 123, text: "text_example")], questionId: 123, questionText: "questionText_example")], results: [QuizPinResult(androidDeepLink: "androidDeepLink_example", destinationUrl: "destinationUrl_example", iosDeepLink: "iosDeepLink_example", organicPinId: "organicPinId_example", resultId: 123)], tieBreakerCustomResult: nil, tieBreakerType: "tieBreakerType_example"), status: nil, trackingUrls: nil, viewTrackingUrl: "viewTrackingUrl_example", pinId: "pinId_example")], campaigns: [CampaignCreateRequest(adAccountId: "adAccountId_example", dailySpendCap: 123, endTime: 123, isAutomatedCampaign: true, isFlexibleDailyBudgets: true, lifetimeSpendCap: 123, name: "name_example", orderLineId: "orderLineId_example", startTime: 123, status: nil, trackingUrls: nil, defaultAdGroupBudgetInMicroCurrency: 123, isCampaignBudgetOptimization: true, bidOptions: CampaignBidOptionsCreate(appTypeMultipliers: AppTypeMultipliers(APP_TYPE: "APP_TYPE_example"), audienceMultipliers: CampaignAudienceMultipliers(AUDIENCE_ID: "AUDIENCE_ID_example"), placementMultipliers: PlacementMultipliers(PLACEMENT: "PLACEMENT_example")), isPerformancePlus: true, objectiveType: ObjectiveType())], catalogProductGroups: [multiple_product_groups_inner(description: "description_example", feedId: "feedId_example", filters: CatalogsCreativeAssetsProductGroupFilters(anyOf: [CatalogsCreativeAssetsProductGroupFilterKeys(CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria(negated: false, values: ["values_example"]), cUSTOMLABEL0: CatalogsProductGroupFilterOperatorTypeCriteria(filterOperatorType: "filterOperatorType_example", negated: false, values: ["values_example"]), cUSTOMLABEL1: nil, cUSTOMLABEL2: nil, cUSTOMLABEL3: nil, cUSTOMLABEL4: nil, gOOGLEPRODUCTCATEGORY6: CatalogsProductGroupMultipleStringListCriteria(negated: false, values: [["values_example"]]), gOOGLEPRODUCTCATEGORY5: nil, gOOGLEPRODUCTCATEGORY4: nil, gOOGLEPRODUCTCATEGORY3: nil, gOOGLEPRODUCTCATEGORY2: nil, gOOGLEPRODUCTCATEGORY1: nil, gOOGLEPRODUCTCATEGORY0: nil, MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria(negated: false, values: [MediaType()]), TITLE_KEYWORDS: nil)], allOf: [nil]), isFeatured: false, name: "name_example", catalogId: "catalogId_example", catalogType: "catalogType_example", country: Country(), locale: CatalogsLocale())], keywords: [KeywordsRequest(keywords: [KeywordsCommon(bid: 123, matchType: MatchTypeResponse(), value: "value_example")], parentId: "parentId_example")], labels: [LabelCreateRequest(labels: [LabelCreateRequest_labels_inner(labelType: LabelType(), value: "value_example")], parentId: "parentId_example")], productGroups: [ProductGroupPromotionCreateRequest(adGroupId: "adGroupId_example", productGroupPromotion: [ProductGroupPromotion(adGroupId: "adGroupId_example", bidInMicroCurrency: 123, catalogProductGroupId: "catalogProductGroupId_example", catalogProductGroupName: "catalogProductGroupName_example", collectionsHeaderType: "collectionsHeaderType_example", collectionsHeroDestinationUrl: "collectionsHeroDestinationUrl_example", collectionsHeroPinId: "collectionsHeroPinId_example", creativeType: nil, customizableCtaType: "customizableCtaType_example", definition: "definition_example", gridClickType: nil, id: "id_example", included: true, isGenerateBackground: true, isMdl: true, parentId: "parentId_example", preferredMediaType: "preferredMediaType_example", relativeDefinition: "relativeDefinition_example", selectedImageTag: "selectedImageTag_example", selectedVideoTag: "selectedVideoTag_example", slideshowCollectionsDescription: "slideshowCollectionsDescription_example", slideshowCollectionsTitle: "slideshowCollectionsTitle_example", status: nil, trackingUrl: "trackingUrl_example")])]), update: BulkUpsertRequestUpdate(adGroups: [AdGroupUpdateRequest(autoTargetingEnabled: true, bidInMicroCurrency: 123, bidStrategyType: "bidStrategyType_example", billableEvent: nil, budgetInMicroCurrency: 123, budgetType: nil, campaignId: "campaignId_example", endTime: 123, isCreativeOptimization: true, lifetimeFrequencyCap: 123, name: "name_example", optimizationGoalMetadata: nil, pacingDeliveryType: nil, placementGroup: nil, promotionApplicationLevel: "promotionApplicationLevel_example", promotionId: "promotionId_example", startTime: 123, status: nil, targetingSpec: nil, targetingTemplateIds: ["targetingTemplateIds_example"], trackingUrls: nil, bidMultiplier: 123, id: "id_example")], ads: [AdUpdateRequest(adGroupId: "adGroupId_example", androidDeepLink: "androidDeepLink_example", carouselAndroidDeepLinks: ["carouselAndroidDeepLinks_example"], carouselDestinationUrls: ["carouselDestinationUrls_example"], carouselIosDeepLinks: ["carouselIosDeepLinks_example"], clickTrackingUrl: "clickTrackingUrl_example", creativeType: nil, customizableCtaType: nil, destinationUrl: "destinationUrl_example", disclosureType: nil, disclosureUrl: "disclosureUrl_example", gridClickType: nil, iosDeepLink: "iosDeepLink_example", isPinDeleted: false, isRemovable: false, leadFormId: "leadFormId_example", name: "name_example", quizPinData: nil, status: nil, trackingUrls: nil, viewTrackingUrl: "viewTrackingUrl_example", id: "id_example", pinId: "pinId_example")], campaigns: [CampaignUpdateRequest(id: "id_example", adAccountId: "adAccountId_example", dailySpendCap: 123, endTime: 123, isAutomatedCampaign: true, isFlexibleDailyBudgets: true, lifetimeSpendCap: 123, name: "name_example", orderLineId: "orderLineId_example", startTime: 123, status: nil, trackingUrls: nil, defaultAdGroupBudgetInMicroCurrency: 123, isCampaignBudgetOptimization: true, bidOptions: CampaignBidOptionsUpdate(appTypeMultipliers: nil, audienceMultipliers: nil, placementMultipliers: nil, updateMask: ["updateMask_example"]), isPerformancePlus: true, objectiveType: nil)], catalogProductGroups: [catalogs_product_groups_update_request(description: "description_example", filters: nil, isFeatured: false, name: "name_example", catalogType: "catalogType_example", country: nil, locale: nil)], keywords: [KeywordUpdate(archived: false, bid: 123, id: "id_example")], labels: [LabelBulkUpdateRequest(id: "id_example", status: "status_example", value: "value_example")], productGroups: [ProductGroupPromotionUpdateRequest(adGroupId: "adGroupId_example", productGroupPromotion: [nil])])) // BulkUpsertRequest | Parameters to get create/update ad entities in bulk

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

