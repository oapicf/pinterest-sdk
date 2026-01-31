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

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$BulkDownloadRequestCampaignFilter = Initialize-BulkDownloadRequestCampaignFilter -CampaignStatus "RUNNING" -EndTime "1622848072" -Name "campaign name" -ObjectiveType "AWARENESS" -StartTime "1622848072"
$BulkDownloadRequest = Initialize-BulkDownloadRequest -CampaignFilter $BulkDownloadRequestCampaignFilter -EntityIds "MyEntityIds" -EntityTypes "CAMPAIGN" -OutputFormat "CSV" -UpdatedSince "1622848072" # BulkDownloadRequest | Parameters to get ad entities in bulk

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

# Configure OAuth2 access token for authorization: client_credentials
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

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows = Initialize-OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows -ClickWindowDays 0 -EngagementWindowDays 0 -ViewWindowDays 0
$OptimizationGoalMetadataConversionTagV3GoalMetadata = Initialize-OptimizationGoalMetadataConversionTagV3GoalMetadata -AttributionWindows $OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows -ConversionEvent "PAGE_VISIT" -ConversionTagId "MyConversionTagId" -CpaGoalValueInMicroCurrency "MyCpaGoalValueInMicroCurrency" -IsRoasOptimized $false -LearningModeType "NOT_ACTIVE" -ReportingEvent "INITIATE_CHECKOUT"

$OptimizationGoalMetadataFrequencyGoalMetadata = Initialize-OptimizationGoalMetadataFrequencyGoalMetadata -Frequency 0 -Timerange "THIRTY_DAY"
$OptimizationGoalMetadataScrollupGoalMetadata = Initialize-OptimizationGoalMetadataScrollupGoalMetadata -ScrollupGoalValueInMicroCurrency "MyScrollupGoalValueInMicroCurrency"
$OptimizationGoalMetadata = Initialize-OptimizationGoalMetadata -ConversionTagV3GoalMetadata $OptimizationGoalMetadataConversionTagV3GoalMetadata -FrequencyGoalMetadata $OptimizationGoalMetadataFrequencyGoalMetadata -ScrollupGoalMetadata $OptimizationGoalMetadataScrollupGoalMetadata

$TargetingSpecShoppingRetargeting = Initialize-TargetingSpecShoppingRetargeting -ExclusionWindow 14 -LookbackWindow 30 -TagTypes 0
"CHOOSE_YOUR_OWN"$TargetingSpec = Initialize-TargetingSpec -AGEBUCKET "18-24" -APPTYPE "android_mobile" -AUDIENCEEXCLUDE "MyAUDIENCEEXCLUDE" -AUDIENCEINCLUDE "MyAUDIENCEINCLUDE" -GENDER "unknown" -GEO "MyGEO" -INTEREST "MyINTEREST" -LOCALE "MyLOCALE" -LOCATION "MyLOCATION" -MAXIMUMAGE "65+" -MINIMUMAGE "18" -SHOPPINGRETARGETING $TargetingSpecShoppingRetargeting -TARGETINGSTRATEGY 
$TargetingSpecShoppingRetargeting = Initialize-TargetingSpecShoppingRetargeting -ExclusionWindow 14 -LookbackWindow 30 -TagTypes 0
"CHOOSE_YOUR_OWN"

$TrackingUrls = Initialize-TrackingUrls -AudienceVerification "MyAudienceVerification" -BuyableButton "MyBuyableButton" -Click "MyClick" -Engagement "MyEngagement" -Impression "MyImpression"
$AdGroupCreateRequest = Initialize-AdGroupCreateRequest -AutoTargetingEnabled $true -BidInMicroCurrency 5000000 -BidStrategyType "AUTOMATIC_BID" -BillableEvent "CLICKTHROUGH" -BudgetInMicroCurrency 5000000 -BudgetType "DAILY" -CampaignId "626736533506" -EndTime 5705424000 -IsCreativeOptimization $true -LifetimeFrequencyCap 100 -Name "Ad Group For Pin: 687195905986" -OptimizationGoalMetadata $OptimizationGoalMetadata -PacingDeliveryType "STANDARD" -PlacementGroup "ALL" -PromotionApplicationLevel "NONE" -PromotionId "7834020347906" -StartTime 5686848000 -Status "ACTIVE" -TargetingSpec $TargetingSpec -TargetingTemplateIds "643" -TrackingUrls $TrackingUrls -BidMultiplier 1

$QuizPinOption = Initialize-QuizPinOption -Id 0 -Text "MyText"
$QuizPinQuestion = Initialize-QuizPinQuestion -Options $QuizPinOption -QuestionId 0 -QuestionText "MyQuestionText"

$QuizPinResult = Initialize-QuizPinResult -AndroidDeepLink "MyAndroidDeepLink" -DestinationUrl "MyDestinationUrl" -IosDeepLink "MyIosDeepLink" -OrganicPinId "MyOrganicPinId" -ResultId 0
$QuizPinData = Initialize-QuizPinData -Questions $QuizPinQuestion -Results $QuizPinResult -TieBreakerCustomResult $QuizPinResult -TieBreakerType "RANDOM"

$AdCreateRequest = Initialize-AdCreateRequest -AdGroupId "2680059592705" -AndroidDeepLink "MyAndroidDeepLink" -CarouselAndroidDeepLinks "MyCarouselAndroidDeepLinks" -CarouselDestinationUrls "MyCarouselDestinationUrls" -CarouselIosDeepLinks "MyCarouselIosDeepLinks" -ClickTrackingUrl "MyClickTrackingUrl" -CreativeType "REGULAR" -CustomizableCtaType "GET_OFFER" -DestinationUrl "MyDestinationUrl" -DisclosureType "NO_DISCLOSURE" -DisclosureUrl "MyDisclosureUrl" -GridClickType "CLOSEUP" -IosDeepLink "MyIosDeepLink" -IsPinDeleted $false -IsRemovable $false -LeadFormId "MyLeadFormId" -Name "MyName" -QuizPinData $QuizPinData -Status "ACTIVE" -TrackingUrls $TrackingUrls -ViewTrackingUrl "MyViewTrackingUrl" -PinId "394205773611545468"

$CampaignBidOptionsCreate = Initialize-CampaignBidOptionsCreate -AppTypeMultipliers  -AudienceMultipliers  -PlacementMultipliers 
$CampaignCreateRequest = Initialize-CampaignCreateRequest -AdAccountId "549755885175" -DailySpendCap 1432744744 -EndTime 1644023526 -IsAutomatedCampaign $true -IsFlexibleDailyBudgets $true -LifetimeSpendCap 1432744744 -Name "ACME Tools" -OrderLineId "549755885175" -StartTime 1580865126 -Status "ACTIVE" -TrackingUrls $TrackingUrls -DefaultAdGroupBudgetInMicroCurrency 0 -IsCampaignBudgetOptimization $true -BidOptions $CampaignBidOptionsCreate -IsPerformancePlus $true -ObjectiveType "AWARENESS"

$CatalogsCreativeAssetsProductGroupFilterKeys = Initialize-CatalogsCreativeAssetsProductGroupFilterKeys -CREATIVEASSETSID  -CUSTOMLABEL0  -CUSTOMLABEL1  -CUSTOMLABEL2  -CUSTOMLABEL3  -CUSTOMLABEL4  -GOOGLEPRODUCTCATEGORY6  -GOOGLEPRODUCTCATEGORY5  -GOOGLEPRODUCTCATEGORY4  -GOOGLEPRODUCTCATEGORY3  -GOOGLEPRODUCTCATEGORY2  -GOOGLEPRODUCTCATEGORY1  -GOOGLEPRODUCTCATEGORY0  -MEDIATYPE  -TITLEKEYWORDS 
$CatalogsCreativeAssetsProductGroupFilters = Initialize-CatalogsCreativeAssetsProductGroupFilters -AnyOf $CatalogsCreativeAssetsProductGroupFilterKeys -AllOf $CatalogsCreativeAssetsProductGroupFilterKeys

$MultipleProductGroupsInner = Initialize-MultipleProductGroupsInner -Description "MyDescription" -FeedId "2680059592705" -Filters $CatalogsCreativeAssetsProductGroupFilters -IsFeatured $false -Name "MyName" -CatalogId "2680059592705" -CatalogType "CREATIVE_ASSETS" -Country "AD" -Locale "af-ZA"

$KeywordsCommon = Initialize-KeywordsCommon -Bid 0 -MatchType "BROAD" -Value "MyValue"
$KeywordsRequest = Initialize-KeywordsRequest -Keywords $KeywordsCommon -ParentId "383791336903426391"

$LabelCreateRequestLabelsInner = Initialize-LabelCreateRequestLabelsInner -LabelType "BRAND" -Value "MyValue"
$LabelCreateRequest = Initialize-LabelCreateRequest -Labels $LabelCreateRequestLabelsInner -ParentId "626753052072"

$ProductGroupPromotion = Initialize-ProductGroupPromotion -AdGroupId "2680059592705" -BidInMicroCurrency 14000000 -CatalogProductGroupId "1231235" -CatalogProductGroupName "catalogProductGroupName" -CollectionsHeaderType "SHOP_THIS_COLLECTION" -CollectionsHeroDestinationUrl "http://www.pinterest.com" -CollectionsHeroPinId "123123" -CreativeType "REGULAR" -CustomizableCtaType "SHOP_NOW" -Definition "*/product_type_0='kitchen'/product_type_1='beverage appliances'" -GridClickType "CLOSEUP" -Id "2680059592705" -Included $true -IsGenerateBackground $true -IsMdl $true -ParentId "1231234" -PreferredMediaType "VIDEO" -RelativeDefinition "product_type_1='beverage appliances'" -SelectedImageTag "holiday_sale" -SelectedVideoTag "holiday_sale" -SlideshowCollectionsDescription "slideshow description" -SlideshowCollectionsTitle "slideshow title" -Status "ACTIVE" -TrackingUrl "https://www.pinterest.com"
$ProductGroupPromotionCreateRequest = Initialize-ProductGroupPromotionCreateRequest -AdGroupId "2680059592705" -ProductGroupPromotion $ProductGroupPromotion

$BulkUpsertRequestCreate = Initialize-BulkUpsertRequestCreate -AdGroups $AdGroupCreateRequest -Ads $AdCreateRequest -Campaigns $CampaignCreateRequest -CatalogProductGroups $MultipleProductGroupsInner -Keywords $KeywordsRequest -Labels $LabelCreateRequest -ProductGroups $ProductGroupPromotionCreateRequest

$AdGroupUpdateRequest = Initialize-AdGroupUpdateRequest -AutoTargetingEnabled $true -BidInMicroCurrency 5000000 -BidStrategyType "AUTOMATIC_BID" -BillableEvent "CLICKTHROUGH" -BudgetInMicroCurrency 5000000 -BudgetType "DAILY" -CampaignId "626736533506" -EndTime 5705424000 -IsCreativeOptimization $true -LifetimeFrequencyCap 100 -Name "Ad Group For Pin: 687195905986" -OptimizationGoalMetadata $OptimizationGoalMetadata -PacingDeliveryType "STANDARD" -PlacementGroup "ALL" -PromotionApplicationLevel "NONE" -PromotionId "7834020347906" -StartTime 5686848000 -Status "ACTIVE" -TargetingSpec $TargetingSpec -TargetingTemplateIds "643" -TrackingUrls $TrackingUrls -BidMultiplier 1 -Id "2680060704746"

$AdUpdateRequest = Initialize-AdUpdateRequest -AdGroupId "2680059592705" -AndroidDeepLink "MyAndroidDeepLink" -CarouselAndroidDeepLinks "MyCarouselAndroidDeepLinks" -CarouselDestinationUrls "MyCarouselDestinationUrls" -CarouselIosDeepLinks "MyCarouselIosDeepLinks" -ClickTrackingUrl "MyClickTrackingUrl" -CreativeType "REGULAR" -CustomizableCtaType "GET_OFFER" -DestinationUrl "MyDestinationUrl" -DisclosureType "NO_DISCLOSURE" -DisclosureUrl "MyDisclosureUrl" -GridClickType "CLOSEUP" -IosDeepLink "MyIosDeepLink" -IsPinDeleted $false -IsRemovable $false -LeadFormId "MyLeadFormId" -Name "MyName" -QuizPinData $QuizPinData -Status "ACTIVE" -TrackingUrls $TrackingUrls -ViewTrackingUrl "MyViewTrackingUrl" -Id "687195134316" -PinId "394205773611545468"

"AUDIENCE"$CampaignBidOptionsUpdate = Initialize-CampaignBidOptionsUpdate -AppTypeMultipliers  -AudienceMultipliers  -PlacementMultipliers  -UpdateMask "AUDIENCE"
$CampaignUpdateRequest = Initialize-CampaignUpdateRequest -Id "549755885175" -AdAccountId "549755885175" -DailySpendCap 1432744744 -EndTime 1644023526 -IsAutomatedCampaign $true -IsFlexibleDailyBudgets $true -LifetimeSpendCap 1432744744 -Name "ACME Tools" -OrderLineId "549755885175" -StartTime 1580865126 -Status "ACTIVE" -TrackingUrls $TrackingUrls -DefaultAdGroupBudgetInMicroCurrency 0 -IsCampaignBudgetOptimization $true -BidOptions $CampaignBidOptionsUpdate -IsPerformancePlus $true -ObjectiveType "AWARENESS"

$CatalogsProductGroupsUpdateRequest = Initialize-CatalogsProductGroupsUpdateRequest -Description "MyDescription" -Filters $CatalogsCreativeAssetsProductGroupFilters -IsFeatured $false -Name "MyName" -CatalogType "CREATIVE_ASSETS" -Country "AD" -Locale "af-ZA"

$KeywordUpdate = Initialize-KeywordUpdate -Archived $false -Bid 0 -Id "2886364308355"
$LabelBulkUpdateRequest = Initialize-LabelBulkUpdateRequest -Id "1106385754497" -Status "ARCHIVED" -Value "MyValue"

$ProductGroupPromotionUpdateRequest = Initialize-ProductGroupPromotionUpdateRequest -AdGroupId "2680059592705" -ProductGroupPromotion $ProductGroupPromotion

$BulkUpsertRequestUpdate = Initialize-BulkUpsertRequestUpdate -AdGroups $AdGroupUpdateRequest -Ads $AdUpdateRequest -Campaigns $CampaignUpdateRequest -CatalogProductGroups $CatalogsProductGroupsUpdateRequest -Keywords $KeywordUpdate -Labels $LabelBulkUpdateRequest -ProductGroups $ProductGroupPromotionUpdateRequest

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

