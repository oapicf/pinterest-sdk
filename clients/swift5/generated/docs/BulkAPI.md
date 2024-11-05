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

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bulkDownloadRequest = BulkDownloadRequest(entityTypes: [BulkEntityType()], entityIds: ["entityIds_example"], updatedSince: "updatedSince_example", campaignFilter: BulkDownloadRequest_campaign_filter(startTime: "startTime_example", endTime: "endTime_example", name: "name_example", campaignStatus: [CampaignSummaryStatus()], objectiveType: [ObjectiveType()]), outputFormat: BulkOutputFormat()) // BulkDownloadRequest | Parameters to get ad entities in bulk

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

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bulkUpsertCreate**
```swift
    open class func bulkUpsertCreate(adAccountId: String, bulkUpsertRequest: BulkUpsertRequest, completion: @escaping (_ data: BulkUpsertResponse?, _ error: Error?) -> Void)
```

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bulkUpsertRequest = BulkUpsertRequest(create: BulkUpsertRequestCreate(campaigns: [CampaignCreateRequest(adAccountId: "adAccountId_example", name: "name_example", status: EntityStatus(), lifetimeSpendCap: 123, dailySpendCap: 123, orderLineId: "orderLineId_example", trackingUrls: TrackingUrls(impression: ["impression_example"], click: ["click_example"], engagement: ["engagement_example"], buyableButton: ["buyableButton_example"], audienceVerification: ["audienceVerification_example"]), startTime: 123, endTime: 123, isFlexibleDailyBudgets: true, defaultAdGroupBudgetInMicroCurrency: 123, isAutomatedCampaign: true, objectiveType: ObjectiveType())], adGroups: [AdGroupCreateRequest(name: "name_example", status: nil, budgetInMicroCurrency: 123, bidInMicroCurrency: 123, optimizationGoalMetadata: OptimizationGoalMetadata(conversionTagV3GoalMetadata: OptimizationGoalMetadata_conversion_tag_v3_goal_metadata(attributionWindows: OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows(clickWindowDays: 123, engagementWindowDays: 123, viewWindowDays: 123), conversionEvent: "conversionEvent_example", conversionTagId: "conversionTagId_example", cpaGoalValueInMicroCurrency: "cpaGoalValueInMicroCurrency_example", isRoasOptimized: false, learningModeType: "learningModeType_example"), frequencyGoalMetadata: OptimizationGoalMetadata_frequency_goal_metadata(frequency: 123, timerange: "timerange_example"), scrollupGoalMetadata: OptimizationGoalMetadata_scrollup_goal_metadata(scrollupGoalValueInMicroCurrency: "scrollupGoalValueInMicroCurrency_example")), budgetType: BudgetType(), startTime: 123, endTime: 123, targetingSpec: TargetingSpec(AGE_BUCKET: ["AGE_BUCKET_example"], APPTYPE: ["APPTYPE_example"], AUDIENCE_EXCLUDE: ["AUDIENCE_EXCLUDE_example"], AUDIENCE_INCLUDE: ["AUDIENCE_INCLUDE_example"], GENDER: ["GENDER_example"], GEO: ["GEO_example"], INTEREST: ["INTEREST_example"], LOCALE: ["LOCALE_example"], LOCATION: ["LOCATION_example"], SHOPPING_RETARGETING: [TargetingSpec_SHOPPING_RETARGETING(lookbackWindow: 123, tagTypes: [123], exclusionWindow: 123)], TARGETING_STRATEGY: ["TARGETING_STRATEGY_example"]), lifetimeFrequencyCap: 123, trackingUrls: nil, autoTargetingEnabled: true, placementGroup: PlacementGroupType(), pacingDeliveryType: PacingDeliveryType(), campaignId: "campaignId_example", billableEvent: ActionType(), bidStrategyType: "bidStrategyType_example", targetingTemplateIds: ["targetingTemplateIds_example"])], ads: [AdCreateRequest(adGroupId: "adGroupId_example", androidDeepLink: "androidDeepLink_example", carouselAndroidDeepLinks: ["carouselAndroidDeepLinks_example"], carouselDestinationUrls: ["carouselDestinationUrls_example"], carouselIosDeepLinks: ["carouselIosDeepLinks_example"], clickTrackingUrl: "clickTrackingUrl_example", creativeType: CreativeType(), destinationUrl: "destinationUrl_example", iosDeepLink: "iosDeepLink_example", isPinDeleted: false, isRemovable: false, name: "name_example", status: nil, trackingUrls: nil, viewTrackingUrl: "viewTrackingUrl_example", leadFormId: "leadFormId_example", gridClickType: GridClickType(), customizableCtaType: "customizableCtaType_example", quizPinData: QuizPinData(questions: [QuizPinQuestion(questionId: 123, questionText: "questionText_example", options: [QuizPinOption(id: 123, text: "text_example")])], results: [QuizPinResult(organicPinId: "organicPinId_example", androidDeepLink: "androidDeepLink_example", iosDeepLink: "iosDeepLink_example", destinationUrl: "destinationUrl_example", resultId: 123)], tieBreakerType: "tieBreakerType_example", tieBreakerCustomResult: nil), pinId: "pinId_example")], productGroups: [ProductGroupPromotionCreateRequest(adGroupId: "adGroupId_example", productGroupPromotion: [ProductGroupPromotionCreateRequestElement(id: "id_example", adGroupId: "adGroupId_example", bidInMicroCurrency: 123, included: true, definition: "definition_example", relativeDefinition: "relativeDefinition_example", parentId: "parentId_example", slideshowCollectionsTitle: "slideshowCollectionsTitle_example", slideshowCollectionsDescription: "slideshowCollectionsDescription_example", isMdl: true, status: nil, trackingUrl: "trackingUrl_example", catalogProductGroupId: "catalogProductGroupId_example", catalogProductGroupName: "catalogProductGroupName_example", collectionsHeroPinId: "collectionsHeroPinId_example", collectionsHeroDestinationUrl: "collectionsHeroDestinationUrl_example", gridClickType: nil, creativeType: nil)])], keywords: [KeywordsRequest(keywords: [KeywordsCommon(bid: 123, matchType: MatchTypeResponse(), value: "value_example")], parentId: "parentId_example")]), update: BulkUpsertRequestUpdate(campaigns: [CampaignUpdateRequest(id: "id_example", adAccountId: "adAccountId_example", name: "name_example", status: nil, lifetimeSpendCap: 123, dailySpendCap: 123, orderLineId: "orderLineId_example", trackingUrls: nil, startTime: 123, endTime: 123, isFlexibleDailyBudgets: true, defaultAdGroupBudgetInMicroCurrency: 123, isAutomatedCampaign: true, isCampaignBudgetOptimization: true, objectiveType: nil)], adGroups: [AdGroupUpdateRequest(name: "name_example", status: nil, budgetInMicroCurrency: 123, bidInMicroCurrency: 123, optimizationGoalMetadata: nil, budgetType: nil, startTime: 123, endTime: 123, targetingSpec: nil, lifetimeFrequencyCap: 123, trackingUrls: nil, autoTargetingEnabled: true, placementGroup: nil, pacingDeliveryType: nil, campaignId: "campaignId_example", billableEvent: nil, bidStrategyType: "bidStrategyType_example", targetingTemplateIds: ["targetingTemplateIds_example"], id: "id_example")], ads: [AdUpdateRequest(adGroupId: "adGroupId_example", androidDeepLink: "androidDeepLink_example", carouselAndroidDeepLinks: ["carouselAndroidDeepLinks_example"], carouselDestinationUrls: ["carouselDestinationUrls_example"], carouselIosDeepLinks: ["carouselIosDeepLinks_example"], clickTrackingUrl: "clickTrackingUrl_example", creativeType: nil, destinationUrl: "destinationUrl_example", iosDeepLink: "iosDeepLink_example", isPinDeleted: false, isRemovable: false, name: "name_example", status: nil, trackingUrls: nil, viewTrackingUrl: "viewTrackingUrl_example", leadFormId: "leadFormId_example", gridClickType: nil, customizableCtaType: "customizableCtaType_example", quizPinData: nil, id: "id_example", pinId: "pinId_example")], productGroups: [ProductGroupPromotionUpdateRequest(adGroupId: "adGroupId_example", productGroupPromotion: [ProductGroupPromotion(id: "id_example", adGroupId: "adGroupId_example", bidInMicroCurrency: 123, included: true, definition: "definition_example", relativeDefinition: "relativeDefinition_example", parentId: "parentId_example", slideshowCollectionsTitle: "slideshowCollectionsTitle_example", slideshowCollectionsDescription: "slideshowCollectionsDescription_example", isMdl: true, status: nil, trackingUrl: "trackingUrl_example", catalogProductGroupId: "catalogProductGroupId_example", catalogProductGroupName: "catalogProductGroupName_example", collectionsHeroPinId: "collectionsHeroPinId_example", collectionsHeroDestinationUrl: "collectionsHeroDestinationUrl_example", gridClickType: nil)])], keywords: [KeywordUpdate(id: "id_example", archived: false, bid: 123)])) // BulkUpsertRequest | Parameters to get create/update ad entities in bulk

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

