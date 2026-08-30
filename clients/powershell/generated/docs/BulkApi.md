# PSOpenAPITools.PSOpenAPITools\Api.BulkApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-BulkDownloadCreate**](BulkApi.md#Invoke-BulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**Invoke-BulkRequestGet**](BulkApi.md#Invoke-BulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**Invoke-BulkUpsertCreate**](BulkApi.md#Invoke-BulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk


<a id="Invoke-BulkDownloadCreate"></a>
# **Invoke-BulkDownloadCreate**
> BulkDownload Invoke-BulkDownloadCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BulkDownloadCreate] <PSCustomObject><br>

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, keywords, schedules,and/or labels; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$BulkDownloadCampaignFilter = Initialize-BulkDownloadCampaignFilter -CampaignStatus "RUNNING" -EndTime "1622848072" -Name "campaign name" -ObjectiveType "AWARENESS" -StartTime "1622848072"
$BulkDownloadCreate = Initialize-BulkDownloadCreate -CampaignFilter $BulkDownloadCampaignFilter -EntityIds "MyEntityIds" -EntityTypes "CAMPAIGN" -OutputFormat "CSV" -UpdatedSince "1622848072" # BulkDownloadCreate | 

# Get advertiser entities in bulk
try {
    $Result = Invoke-BulkDownloadCreate -AdAccountId $AdAccountId -BulkDownloadCreate $BulkDownloadCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-BulkDownloadCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **BulkDownloadCreate** | [**BulkDownloadCreate**](BulkDownloadCreate.md)|  | 

### Return type

[**BulkDownload**](BulkDownload.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BulkRequestGet"></a>
# **Invoke-BulkRequestGet**
> BulkJobData Invoke-BulkRequestGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BulkRequestId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeDetails] <System.Nullable[Boolean]><br>

Download advertiser entities in bulk

Get the status of a bulk request by `request_id`, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, schedules, or keywords).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$BulkRequestId = "MyBulkRequestId" # String | Bulk request ID that is from one of the entities bulk endpoints
$IncludeDetails = $true # Boolean | If set to True then attach the errors/details to all the requests (optional) (default to $false)

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
 **BulkRequestId** | **String**| Bulk request ID that is from one of the entities bulk endpoints | 
 **IncludeDetails** | **Boolean**| If set to True then attach the errors/details to all the requests | [optional] [default to $false]

### Return type

[**BulkJobData**](BulkJobData.md) (PSCustomObject)

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

Either create or update any combination of campaigns, ad groups, product groups, ads, keywords, schedules, or labels. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$TargetingSpecShoppingRetargeting = Initialize-TargetingSpecShoppingRetargeting -ExclusionWindow 14 -LookbackWindow 30 -TagTypes 0
"CHOOSE_YOUR_OWN"$TargetingSpec = Initialize-TargetingSpec -AGEBUCKET "18-24" -APPTYPE "android_mobile" -AUDIENCEEXCLUDE "MyAUDIENCEEXCLUDE" -AUDIENCEINCLUDE "MyAUDIENCEINCLUDE" -GENDER "unknown" -GEO "MyGEO" -GEOEXCLUDE "MyGEOEXCLUDE" -INTEREST "MyINTEREST" -LOCALE "MyLOCALE" -LOCATION "MyLOCATION" -LOCATIONEXCLUDE "MyLOCATIONEXCLUDE" -MAXIMUMAGE "65+" -MINIMUMAGE "18" -SHOPPINGRETARGETING $TargetingSpecShoppingRetargeting -TARGETINGSTRATEGY 
$TargetingSpecShoppingRetargeting = Initialize-TargetingSpecShoppingRetargeting -ExclusionWindow 14 -LookbackWindow 30 -TagTypes 0
"CHOOSE_YOUR_OWN"

$AdGroupCreateRequest = Initialize-AdGroupCreateRequest -AutoTargetingEnabled $false -BidMultiplier 0 -BudgetType "DAILY" -PacingDeliveryType "STANDARD" -BidInMicroCurrency 5000000 -BidStrategyType "AUTOMATIC_BID" -BillableEvent "CLICKTHROUGH" -BudgetInMicroCurrency 5000000 -CampaignId "626736533506" -EndTime 5705424000 -IsCreativeOptimization $true -LifetimeFrequencyCap 100 -Name "Ad Group For Pin: 687195905986" -OptimizationGoalMetadata  -PlacementGroup "ALL" -PromotionApplicationLevel "NONE" -PromotionId "7834020347906" -PromotionIds "MyPromotionIds" -StartTime 5686848000 -Status "ACTIVE" -TargetingSpec $TargetingSpec -TargetingTemplateIds "MyTargetingTemplateIds" -TrackingUrls 

$AdCreateRequest = Initialize-AdCreateRequest -AdGroupId "MyAdGroupId" -AndroidDeepLink "MyAndroidDeepLink" -CarouselAndroidDeepLinks "MyCarouselAndroidDeepLinks" -CarouselDestinationUrls "MyCarouselDestinationUrls" -CarouselIosDeepLinks "MyCarouselIosDeepLinks" -ClickTrackingUrl "MyClickTrackingUrl" -CreativeType "REGULAR" -CustomizableCtaType "GET_OFFER" -DestinationUrl "MyDestinationUrl" -DisclosureType "NO_DISCLOSURE" -DisclosureUrl "MyDisclosureUrl" -GridClickType "CLOSEUP" -IosDeepLink "MyIosDeepLink" -IsCarting $false -IsPinDeleted $false -IsRemovable $false -LeadFormId "MyLeadFormId" -Name "MyName" -PinId "394205773611545468" -QuizPinData  -Status "ACTIVE" -TrackingUrls  -ViewTrackingUrl "MyViewTrackingUrl"

$CampaignBidOptionsCreate = Initialize-CampaignBidOptionsCreate -AgeBucketMultipliers  -AppTypeMultipliers  -AudienceMultipliers  -FreqBidMultiplierTimeWindow "WEEK" -FrequencyMultipliers  -GenderMultipliers  -PlacementMultipliers 
$CampaignCreateRequest = Initialize-CampaignCreateRequest -BidOptions $CampaignBidOptionsCreate -IntendedPromotionType "LEGACY" -IsAutomatedCampaign $false -IsCampaignBudgetOptimization $false -IsFlexibleDailyBudgets $false -IsLtvOptimized $false -IsPerformancePlus $false -IsTopOfSearch $false -ObjectiveType "AWARENESS" -Status "ACTIVE" -AdAccountId "549755885175" -DailySpendCap 1432744744 -DefaultAdGroupBudgetInMicroCurrency 0 -EndTime 1644023526 -LifetimeSpendCap 1432744744 -Name "ACME Tools" -OrderLineId "549755885175" -StartTime 1580865126 -TrackingUrls 

$CatalogsProductGroupMultipleStringCriteria = Initialize-CatalogsProductGroupMultipleStringCriteria -Negated $false -Values "MyValues"
$CatalogsProductGroupFilterOperatorTypeCriteria = Initialize-CatalogsProductGroupFilterOperatorTypeCriteria -FilterOperatorType "IS" -Negated $false -Values "MyValues"
$CatalogsProductGroupMultipleStringListCriteria = Initialize-CatalogsProductGroupMultipleStringListCriteria -Negated $false -Values "MyValues"
$CatalogsProductGroupMultipleMediaTypesCriteria = Initialize-CatalogsProductGroupMultipleMediaTypesCriteria -Negated $false -Values "IMAGE"
$CatalogsCreativeAssetsProductGroupFilterKeys = Initialize-CatalogsCreativeAssetsProductGroupFilterKeys -CREATIVEASSETSID $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL0 $CatalogsProductGroupFilterOperatorTypeCriteria -CUSTOMLABEL1 $CatalogsProductGroupFilterOperatorTypeCriteria -CUSTOMLABEL2 $CatalogsProductGroupFilterOperatorTypeCriteria -CUSTOMLABEL3 $CatalogsProductGroupFilterOperatorTypeCriteria -CUSTOMLABEL4 $CatalogsProductGroupFilterOperatorTypeCriteria -GOOGLEPRODUCTCATEGORY6 $CatalogsProductGroupMultipleStringListCriteria -GOOGLEPRODUCTCATEGORY5 $CatalogsProductGroupMultipleStringListCriteria -GOOGLEPRODUCTCATEGORY4 $CatalogsProductGroupMultipleStringListCriteria -GOOGLEPRODUCTCATEGORY3 $CatalogsProductGroupMultipleStringListCriteria -GOOGLEPRODUCTCATEGORY2 $CatalogsProductGroupMultipleStringListCriteria -GOOGLEPRODUCTCATEGORY1 $CatalogsProductGroupMultipleStringListCriteria -GOOGLEPRODUCTCATEGORY0 $CatalogsProductGroupMultipleStringListCriteria -MEDIATYPE $CatalogsProductGroupMultipleMediaTypesCriteria -TITLEKEYWORDS $CatalogsProductGroupMultipleStringCriteria -LINK $CatalogsProductGroupFilterOperatorTypeCriteria

$CatalogsCreativeAssetsProductGroupFilters = Initialize-CatalogsCreativeAssetsProductGroupFilters -AnyOf $CatalogsCreativeAssetsProductGroupFilterKeys -AllOf $CatalogsCreativeAssetsProductGroupFilterKeys

$BulkUpsertRequestCreateCatalogProductGroupsItems = Initialize-BulkUpsertRequestCreateCatalogProductGroupsItems -Description "MyDescription" -FeedId "2680059592705" -Filters $CatalogsCreativeAssetsProductGroupFilters -IsFeatured $false -Name "MyName" -CatalogId "2680059592705" -CatalogType "CREATIVE_ASSETS" -Country "AD" -Locale "af-ZA"

$KeywordsCommon = Initialize-KeywordsCommon -Bid 0 -MatchType "BROAD" -Value "MyValue"
$KeywordsRequest = Initialize-KeywordsRequest -Keywords $KeywordsCommon -ParentId "MyParentId"

$LabelCreateItem = Initialize-LabelCreateItem -LabelType "BRAND" -Value "MyValue"
$LabelBulkCreateRequest = Initialize-LabelBulkCreateRequest -Labels $LabelCreateItem -ParentId "MyParentId"

$ProductGroupPromotion = Initialize-ProductGroupPromotion -AdGroupId "2680059592705" -BidInMicroCurrency 14000000 -CatalogProductGroupId "1231235" -CatalogProductGroupName "catalogProductGroupName" -CollectionsHeaderType "SHOP_THIS_COLLECTION" -CollectionsHeroDestinationUrl "http://www.pinterest.com" -CollectionsHeroPinId "123123" -CreativeType "REGULAR" -CustomizableCtaType "GET_OFFER" -Definition "*/product_type_0='kitchen'/product_type_1='beverage appliances'" -GridClickType "CLOSEUP" -Id "2680059592705" -Included $true -IsGenerateBackground $true -IsImageAutoResizing $true -IsMdl $true -ParentId "1231234" -PreferredMediaType "VIDEO" -RelativeDefinition "product_type_1='beverage appliances'" -SelectedImageTag "holiday_sale" -SelectedVideoTag "holiday_sale" -SlideshowCollectionsDescription "slideshow description" -SlideshowCollectionsTitle "slideshow title" -Status "ACTIVE" -TrackingUrl "https://www.pinterest.com"
$ProductGroupPromotionCreateRequest = Initialize-ProductGroupPromotionCreateRequest -AdGroupId "MyAdGroupId" -ProductGroupPromotion $ProductGroupPromotion

$ScheduleBidOptionsPlacementMultipliers = Initialize-ScheduleBidOptionsPlacementMultipliers -Browse 0 -RelatedPins 0 -Search 0
$ScheduleCommonDeltaValue = Initialize-ScheduleCommonDeltaValue -AgeBucketMultipliers  -AppTypeMultipliers  -AudienceMultipliers  -GenderMultipliers  -PlacementMultipliers $ScheduleBidOptionsPlacementMultipliers

$ScheduleCreateRequest = Initialize-ScheduleCreateRequest -EntityId "MyEntityId" -EntityType "MyEntityType" -DeltaValue $ScheduleCommonDeltaValue -EndTimestamp 0 -Name "MyName" -ScheduleAction "INCREASE_BY_VALUE" -ScheduleStatus "DRAFT" -ScheduleType "CAMPAIGN_BUDGET_CHANGE" -StartTimestamp 0

$BulkUpsertRequestCreate = Initialize-BulkUpsertRequestCreate -AdGroups $AdGroupCreateRequest -Ads $AdCreateRequest -Campaigns $CampaignCreateRequest -CatalogProductGroups $BulkUpsertRequestCreateCatalogProductGroupsItems -Keywords $KeywordsRequest -Labels $LabelBulkCreateRequest -ProductGroups $ProductGroupPromotionCreateRequest -Schedules $ScheduleCreateRequest

$TargetingSpecOperations = Initialize-TargetingSpecOperations -Field "MINIMUM_AGE" -Operation "SET" -Values $TargetingSpecShoppingRetargeting -Value "MyValue"

$AdGroupUpdateRequest = Initialize-AdGroupUpdateRequest -BidMultiplier 0 -Id "MyId" -TargetingSpecOperations $TargetingSpecOperations -AutoTargetingEnabled $true -BidInMicroCurrency 5000000 -BidStrategyType "AUTOMATIC_BID" -BillableEvent "CLICKTHROUGH" -BudgetInMicroCurrency 5000000 -BudgetType "DAILY" -CampaignId "626736533506" -EndTime 5705424000 -IsCreativeOptimization $true -LifetimeFrequencyCap 100 -Name "Ad Group For Pin: 687195905986" -OptimizationGoalMetadata  -PacingDeliveryType "STANDARD" -PlacementGroup "ALL" -PromotionApplicationLevel "NONE" -PromotionId "7834020347906" -PromotionIds "MyPromotionIds" -StartTime 5686848000 -Status "ACTIVE" -TargetingSpec $TargetingSpec -TargetingTemplateIds "MyTargetingTemplateIds" -TrackingUrls 

$AdUpdateRequest = Initialize-AdUpdateRequest -Id "MyId" -PinId "MyPinId" -AdGroupId "MyAdGroupId" -AndroidDeepLink "MyAndroidDeepLink" -CarouselAndroidDeepLinks "MyCarouselAndroidDeepLinks" -CarouselDestinationUrls "MyCarouselDestinationUrls" -CarouselIosDeepLinks "MyCarouselIosDeepLinks" -ClickTrackingUrl "MyClickTrackingUrl" -CreativeType "REGULAR" -CustomizableCtaType "GET_OFFER" -DestinationUrl "MyDestinationUrl" -DisclosureType "NO_DISCLOSURE" -DisclosureUrl "MyDisclosureUrl" -GridClickType "CLOSEUP" -IosDeepLink "MyIosDeepLink" -IsCarting $false -IsPinDeleted $false -IsRemovable $false -LeadFormId "MyLeadFormId" -Name "MyName" -QuizPinData  -Status "ACTIVE" -TrackingUrls  -ViewTrackingUrl "MyViewTrackingUrl"

$CampaignBidOptionsUpdate = Initialize-CampaignBidOptionsUpdate -AgeBucketMultipliers  -AppTypeMultipliers  -AudienceMultipliers  -FreqBidMultiplierTimeWindow "WEEK" -FrequencyMultipliers  -GenderMultipliers  -PlacementMultipliers  -UpdateMask "AUDIENCE"
$CampaignUpdateRequest = Initialize-CampaignUpdateRequest -BidOptions $CampaignBidOptionsUpdate -IntendedPromotionType "LEGACY" -IsLtvOptimized $false -IsPerformancePlus $false -IsTopOfSearch $false -ObjectiveType "AWARENESS" -AdAccountId "549755885175" -DailySpendCap 1432744744 -DefaultAdGroupBudgetInMicroCurrency 0 -EndTime 1644023526 -Id "549755885175" -IsAutomatedCampaign $false -IsCampaignBudgetOptimization $false -IsFlexibleDailyBudgets $false -LifetimeSpendCap 1432744744 -Name "ACME Tools" -OrderLineId "549755885175" -StartTime 1580865126 -Status "ACTIVE" -TrackingUrls 

$BulkUpsertRequestUpdateCatalogProductGroupsItems = Initialize-BulkUpsertRequestUpdateCatalogProductGroupsItems -Description "MyDescription" -Filters $CatalogsCreativeAssetsProductGroupFilters -IsFeatured $false -Name "Most Popular" -CatalogType "CREATIVE_ASSETS" -Country "AD" -Locale "af-ZA"

$KeywordUpdateGenerated = Initialize-KeywordUpdateGenerated -Archived $false -Bid 0 -Id "MyId"
$LabelBulkUpdateRequest = Initialize-LabelBulkUpdateRequest -Id "MyId" -ParentId "MyParentId" -Status "ARCHIVED"

$ProductGroupPromotionUpdateRequest = Initialize-ProductGroupPromotionUpdateRequest -AdGroupId "MyAdGroupId" -ProductGroupPromotion $ProductGroupPromotion

$ScheduleUpdateRequest = Initialize-ScheduleUpdateRequest -EntityId "MyEntityId" -EntityType "MyEntityType" -Id "MyId" -DeltaValue $ScheduleCommonDeltaValue -EndTimestamp 0 -Name "MyName" -ScheduleAction "INCREASE_BY_VALUE" -ScheduleStatus "DRAFT" -ScheduleType "CAMPAIGN_BUDGET_CHANGE" -StartTimestamp 0

$BulkUpsertRequestUpdate = Initialize-BulkUpsertRequestUpdate -AdGroups $AdGroupUpdateRequest -Ads $AdUpdateRequest -Campaigns $CampaignUpdateRequest -CatalogProductGroups $BulkUpsertRequestUpdateCatalogProductGroupsItems -Keywords $KeywordUpdateGenerated -Labels $LabelBulkUpdateRequest -ProductGroups $ProductGroupPromotionUpdateRequest -Schedules $ScheduleUpdateRequest

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

