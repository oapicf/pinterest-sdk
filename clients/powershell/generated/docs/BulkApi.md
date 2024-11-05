# PSOpenAPITools.PSOpenAPITools\Api.BulkApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-BulkDownloadCreate**](BulkApi.md#Invoke-BulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**Invoke-BulkRequestGet**](BulkApi.md#Invoke-BulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**Invoke-BulkUpsertCreate**](BulkApi.md#Invoke-BulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk


<a id="Invoke-BulkDownloadCreate"></a>
# **Invoke-BulkDownloadCreate**
> BulkDownloadResponse Invoke-BulkDownloadCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BulkDownloadRequest] <PSCustomObject><br>

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$BulkDownloadRequestCampaignFilter = Initialize-BulkDownloadRequestCampaignFilter -StartTime "1622848072" -EndTime "1622848072" -Name "campaign name" -CampaignStatus "RUNNING" -ObjectiveType "AWARENESS"
$BulkDownloadRequest = Initialize-BulkDownloadRequest -EntityTypes "CAMPAIGN" -EntityIds "MyEntityIds" -UpdatedSince "1622848072" -CampaignFilter $BulkDownloadRequestCampaignFilter -OutputFormat "CSV" # BulkDownloadRequest | Parameters to get ad entities in bulk

# Get advertiser entities in bulk
try {
    $Result = Invoke-BulkDownloadCreate -AdAccountId $AdAccountId -BulkDownloadRequest $BulkDownloadRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-BulkDownloadCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **BulkDownloadRequest** | [**BulkDownloadRequest**](BulkDownloadRequest.md)| Parameters to get ad entities in bulk | 

### Return type

[**BulkDownloadResponse**](BulkDownloadResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BulkRequestGet"></a>
# **Invoke-BulkRequestGet**
> BulkUpsertStatusResponse Invoke-BulkRequestGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BulkRequestId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeDetails] <System.Nullable[Boolean]><br>

Download advertiser entities in bulk

Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$BulkRequestId = "MyBulkRequestId" # String | Unique identifier of a bulk upsert request.
$IncludeDetails = $true # Boolean | if set to True then attach the errors/details to all the requests (optional) (default to $false)

# Download advertiser entities in bulk
try {
    $Result = Invoke-BulkRequestGet -AdAccountId $AdAccountId -BulkRequestId $BulkRequestId -IncludeDetails $IncludeDetails
} catch {
    Write-Host ("Exception occurred when calling Invoke-BulkRequestGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **BulkRequestId** | **String**| Unique identifier of a bulk upsert request. | 
 **IncludeDetails** | **Boolean**| if set to True then attach the errors/details to all the requests | [optional] [default to $false]

### Return type

[**BulkUpsertStatusResponse**](BulkUpsertStatusResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BulkUpsertCreate"></a>
# **Invoke-BulkUpsertCreate**
> BulkUpsertResponse Invoke-BulkUpsertCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BulkUpsertRequest] <PSCustomObject><br>

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$TrackingUrls = Initialize-TrackingUrls -Impression "MyImpression" -Click "MyClick" -Engagement "MyEngagement" -BuyableButton "MyBuyableButton" -AudienceVerification "MyAudienceVerification"
$CampaignCreateRequest = Initialize-CampaignCreateRequest -AdAccountId "549755885175" -Name "ACME Tools" -Status "ACTIVE" -LifetimeSpendCap 1432744744 -DailySpendCap 1432744744 -OrderLineId "549755885175" -TrackingUrls $TrackingUrls -StartTime 1580865126 -EndTime 1644023526 -IsFlexibleDailyBudgets $true -DefaultAdGroupBudgetInMicroCurrency 0 -IsAutomatedCampaign $true -ObjectiveType "AWARENESS"

$OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows = Initialize-OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows -ClickWindowDays 0 -EngagementWindowDays 0 -ViewWindowDays 0
$OptimizationGoalMetadataConversionTagV3GoalMetadata = Initialize-OptimizationGoalMetadataConversionTagV3GoalMetadata -AttributionWindows $OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows -ConversionEvent "PAGE_VISIT" -ConversionTagId "MyConversionTagId" -CpaGoalValueInMicroCurrency "MyCpaGoalValueInMicroCurrency" -IsRoasOptimized $false -LearningModeType "NOT_ACTIVE"

$OptimizationGoalMetadataFrequencyGoalMetadata = Initialize-OptimizationGoalMetadataFrequencyGoalMetadata -Frequency 0 -Timerange "THIRTY_DAY"
$OptimizationGoalMetadataScrollupGoalMetadata = Initialize-OptimizationGoalMetadataScrollupGoalMetadata -ScrollupGoalValueInMicroCurrency "MyScrollupGoalValueInMicroCurrency"
$OptimizationGoalMetadata = Initialize-OptimizationGoalMetadata -ConversionTagV3GoalMetadata $OptimizationGoalMetadataConversionTagV3GoalMetadata -FrequencyGoalMetadata $OptimizationGoalMetadataFrequencyGoalMetadata -ScrollupGoalMetadata $OptimizationGoalMetadataScrollupGoalMetadata

"18-24""android_mobile""unknown"
$TargetingSpecSHOPPINGRETARGETING = Initialize-TargetingSpecSHOPPINGRETARGETING -LookbackWindow 30 -TagTypes 0 -ExclusionWindow 14
"CHOOSE_YOUR_OWN"$TargetingSpec = Initialize-TargetingSpec -AGEBUCKET "18-24" -APPTYPE "18-24""android_mobile" -AUDIENCEEXCLUDE "MyAUDIENCEEXCLUDE" -AUDIENCEINCLUDE "MyAUDIENCEINCLUDE" -GENDER "18-24""android_mobile""unknown" -GEO "MyGEO" -INTEREST "MyINTEREST" -LOCALE "MyLOCALE" -LOCATION "MyLOCATION" -SHOPPINGRETARGETING $TargetingSpecSHOPPINGRETARGETING -TARGETINGSTRATEGY "18-24""android_mobile""unknown"
$TargetingSpecSHOPPINGRETARGETING = Initialize-TargetingSpecSHOPPINGRETARGETING -LookbackWindow 30 -TagTypes 0 -ExclusionWindow 14
"CHOOSE_YOUR_OWN"

$AdGroupCreateRequest = Initialize-AdGroupCreateRequest -Name "Ad Group For Pin: 687195905986" -Status "ACTIVE" -BudgetInMicroCurrency 5000000 -BidInMicroCurrency 5000000 -OptimizationGoalMetadata $OptimizationGoalMetadata -BudgetType "DAILY" -StartTime 5686848000 -EndTime 5705424000 -TargetingSpec $TargetingSpec -LifetimeFrequencyCap 100 -TrackingUrls $TrackingUrls -AutoTargetingEnabled $true -PlacementGroup "ALL" -PacingDeliveryType "STANDARD" -CampaignId "626736533506" -BillableEvent "CLICKTHROUGH" -BidStrategyType "AUTOMATIC_BID" -TargetingTemplateIds "643"

$QuizPinOption = Initialize-QuizPinOption -Id 0 -Text "MyText"
$QuizPinQuestion = Initialize-QuizPinQuestion -QuestionId 0 -QuestionText "MyQuestionText" -Options $QuizPinOption

$QuizPinResult = Initialize-QuizPinResult -OrganicPinId "MyOrganicPinId" -AndroidDeepLink "MyAndroidDeepLink" -IosDeepLink "MyIosDeepLink" -DestinationUrl "MyDestinationUrl" -ResultId 0
$QuizPinData = Initialize-QuizPinData -Questions $QuizPinQuestion -Results $QuizPinResult -TieBreakerType "RANDOM" -TieBreakerCustomResult $QuizPinResult

$AdCreateRequest = Initialize-AdCreateRequest -AdGroupId "2680059592705" -AndroidDeepLink "MyAndroidDeepLink" -CarouselAndroidDeepLinks "MyCarouselAndroidDeepLinks" -CarouselDestinationUrls "MyCarouselDestinationUrls" -CarouselIosDeepLinks "MyCarouselIosDeepLinks" -ClickTrackingUrl "MyClickTrackingUrl" -CreativeType "REGULAR" -DestinationUrl "MyDestinationUrl" -IosDeepLink "MyIosDeepLink" -IsPinDeleted $false -IsRemovable $false -Name "MyName" -Status "ACTIVE" -TrackingUrls $TrackingUrls -ViewTrackingUrl "MyViewTrackingUrl" -LeadFormId "MyLeadFormId" -GridClickType "CLOSEUP" -CustomizableCtaType "GET_OFFER" -QuizPinData $QuizPinData -PinId "394205773611545468"

$ProductGroupPromotionCreateRequestElement = Initialize-ProductGroupPromotionCreateRequestElement -Id "2680059592705" -AdGroupId "2680059592705" -BidInMicroCurrency 14000000 -Included $true -Definition "*/product_type_0='kitchen'/product_type_1='beverage appliances'" -RelativeDefinition "product_type_1='beverage appliances'" -ParentId "1231234" -SlideshowCollectionsTitle "slideshow title" -SlideshowCollectionsDescription "slideshow description" -IsMdl $true -Status "ACTIVE" -TrackingUrl "https://www.pinterest.com" -CatalogProductGroupId "1231235" -CatalogProductGroupName "catalogProductGroupName" -CollectionsHeroPinId "123123" -CollectionsHeroDestinationUrl "http://www.pinterest.com" -GridClickType "CLOSEUP" -CreativeType "REGULAR"
$ProductGroupPromotionCreateRequest = Initialize-ProductGroupPromotionCreateRequest -AdGroupId "2680059592705" -ProductGroupPromotion $ProductGroupPromotionCreateRequestElement

$KeywordsCommon = Initialize-KeywordsCommon -Bid 0 -MatchType "BROAD" -Value "MyValue"
$KeywordsRequest = Initialize-KeywordsRequest -Keywords $KeywordsCommon -ParentId "383791336903426391"

$BulkUpsertRequestCreate = Initialize-BulkUpsertRequestCreate -Campaigns $CampaignCreateRequest -AdGroups $AdGroupCreateRequest -Ads $AdCreateRequest -ProductGroups $ProductGroupPromotionCreateRequest -Keywords $KeywordsRequest

$CampaignUpdateRequest = Initialize-CampaignUpdateRequest -Id "549755885175" -AdAccountId "549755885175" -Name "ACME Tools" -Status "ACTIVE" -LifetimeSpendCap 1432744744 -DailySpendCap 1432744744 -OrderLineId "549755885175" -TrackingUrls $TrackingUrls -StartTime 1580865126 -EndTime 1644023526 -IsFlexibleDailyBudgets $true -DefaultAdGroupBudgetInMicroCurrency 0 -IsAutomatedCampaign $true -IsCampaignBudgetOptimization $true -ObjectiveType "AWARENESS"

$AdGroupUpdateRequest = Initialize-AdGroupUpdateRequest -Name "Ad Group For Pin: 687195905986" -Status "ACTIVE" -BudgetInMicroCurrency 5000000 -BidInMicroCurrency 5000000 -OptimizationGoalMetadata $OptimizationGoalMetadata -BudgetType "DAILY" -StartTime 5686848000 -EndTime 5705424000 -TargetingSpec $TargetingSpec -LifetimeFrequencyCap 100 -TrackingUrls $TrackingUrls -AutoTargetingEnabled $true -PlacementGroup "ALL" -PacingDeliveryType "STANDARD" -CampaignId "626736533506" -BillableEvent "CLICKTHROUGH" -BidStrategyType "AUTOMATIC_BID" -TargetingTemplateIds "643" -Id "2680060704746"

$AdUpdateRequest = Initialize-AdUpdateRequest -AdGroupId "2680059592705" -AndroidDeepLink "MyAndroidDeepLink" -CarouselAndroidDeepLinks "MyCarouselAndroidDeepLinks" -CarouselDestinationUrls "MyCarouselDestinationUrls" -CarouselIosDeepLinks "MyCarouselIosDeepLinks" -ClickTrackingUrl "MyClickTrackingUrl" -CreativeType "REGULAR" -DestinationUrl "MyDestinationUrl" -IosDeepLink "MyIosDeepLink" -IsPinDeleted $false -IsRemovable $false -Name "MyName" -Status "ACTIVE" -TrackingUrls $TrackingUrls -ViewTrackingUrl "MyViewTrackingUrl" -LeadFormId "MyLeadFormId" -GridClickType "CLOSEUP" -CustomizableCtaType "GET_OFFER" -QuizPinData $QuizPinData -Id "687195134316" -PinId "394205773611545468"

$ProductGroupPromotion = Initialize-ProductGroupPromotion -Id "2680059592705" -AdGroupId "2680059592705" -BidInMicroCurrency 14000000 -Included $true -Definition "*/product_type_0='kitchen'/product_type_1='beverage appliances'" -RelativeDefinition "product_type_1='beverage appliances'" -ParentId "1231234" -SlideshowCollectionsTitle "slideshow title" -SlideshowCollectionsDescription "slideshow description" -IsMdl $true -Status "ACTIVE" -TrackingUrl "https://www.pinterest.com" -CatalogProductGroupId "1231235" -CatalogProductGroupName "catalogProductGroupName" -CollectionsHeroPinId "123123" -CollectionsHeroDestinationUrl "http://www.pinterest.com" -GridClickType "CLOSEUP"
$ProductGroupPromotionUpdateRequest = Initialize-ProductGroupPromotionUpdateRequest -AdGroupId "2680059592705" -ProductGroupPromotion $ProductGroupPromotion

$KeywordUpdate = Initialize-KeywordUpdate -Id "2886364308355" -Archived $false -Bid 0
$BulkUpsertRequestUpdate = Initialize-BulkUpsertRequestUpdate -Campaigns $CampaignUpdateRequest -AdGroups $AdGroupUpdateRequest -Ads $AdUpdateRequest -ProductGroups $ProductGroupPromotionUpdateRequest -Keywords $KeywordUpdate

$BulkUpsertRequest = Initialize-BulkUpsertRequest -Create $BulkUpsertRequestCreate -Update $BulkUpsertRequestUpdate # BulkUpsertRequest | Parameters to get create/update ad entities in bulk

# Create/update ad entities in bulk
try {
    $Result = Invoke-BulkUpsertCreate -AdAccountId $AdAccountId -BulkUpsertRequest $BulkUpsertRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-BulkUpsertCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **BulkUpsertRequest** | [**BulkUpsertRequest**](BulkUpsertRequest.md)| Parameters to get create/update ad entities in bulk | 

### Return type

[**BulkUpsertResponse**](BulkUpsertResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

