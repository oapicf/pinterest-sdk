# PSOpenAPITools.PSOpenAPITools\Api.ProductGroupPromotionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-ProductGroupPromotionsCreate**](ProductGroupPromotionsApi.md#Invoke-ProductGroupPromotionsCreate) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
[**Invoke-ProductGroupPromotionsGet**](ProductGroupPromotionsApi.md#Invoke-ProductGroupPromotionsGet) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
[**Invoke-ProductGroupPromotionsList**](ProductGroupPromotionsApi.md#Invoke-ProductGroupPromotionsList) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
[**Invoke-ProductGroupPromotionsUpdate**](ProductGroupPromotionsApi.md#Invoke-ProductGroupPromotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
[**Invoke-ProductGroupsAnalytics**](ProductGroupPromotionsApi.md#Invoke-ProductGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


<a id="Invoke-ProductGroupPromotionsCreate"></a>
# **Invoke-ProductGroupPromotionsCreate**
> ProductGroupPromotions Invoke-ProductGroupPromotionsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductGroupPromotionsCreate] <PSCustomObject><br>

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$ProductGroupPromotion = Initialize-ProductGroupPromotion -AdGroupId "2680059592705" -BidInMicroCurrency 14000000 -CatalogProductGroupId "1231235" -CatalogProductGroupName "catalogProductGroupName" -CollectionsHeaderType "SHOP_THIS_COLLECTION" -CollectionsHeroDestinationUrl "http://www.pinterest.com" -CollectionsHeroPinId "123123" -CreativeType "REGULAR" -CustomizableCtaType "GET_OFFER" -Definition "*/product_type_0='kitchen'/product_type_1='beverage appliances'" -GridClickType "CLOSEUP" -Id "2680059592705" -Included $true -IsGenerateBackground $true -IsImageAutoResizing $true -IsMdl $true -ParentId "1231234" -PreferredMediaType "VIDEO" -RelativeDefinition "product_type_1='beverage appliances'" -SelectedImageTag "holiday_sale" -SelectedVideoTag "holiday_sale" -SlideshowCollectionsDescription "slideshow description" -SlideshowCollectionsTitle "slideshow title" -Status "ACTIVE" -TrackingUrl "https://www.pinterest.com"
$ProductGroupPromotionsCreate = Initialize-ProductGroupPromotionsCreate -AdGroupId "2680059592705" -ProductGroupPromotion $ProductGroupPromotion # ProductGroupPromotionsCreate | 

# Create product group promotions
try {
    $Result = Invoke-ProductGroupPromotionsCreate -AdAccountId $AdAccountId -ProductGroupPromotionsCreate $ProductGroupPromotionsCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-ProductGroupPromotionsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **ProductGroupPromotionsCreate** | [**ProductGroupPromotionsCreate**](ProductGroupPromotionsCreate.md)|  | 

### Return type

[**ProductGroupPromotions**](ProductGroupPromotions.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ProductGroupPromotionsGet"></a>
# **Invoke-ProductGroupPromotionsGet**
> ProductGroupPromotion Invoke-ProductGroupPromotionsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductGroupPromotionId] <String><br>

Get a product group promotion by id

Get a product group promotion by id

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$ProductGroupPromotionId = "MyProductGroupPromotionId" # String | Unique identifier of a product group promotion

# Get a product group promotion by id
try {
    $Result = Invoke-ProductGroupPromotionsGet -AdAccountId $AdAccountId -ProductGroupPromotionId $ProductGroupPromotionId
} catch {
    Write-Host ("Exception occurred when calling Invoke-ProductGroupPromotionsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **ProductGroupPromotionId** | **String**| Unique identifier of a product group promotion | 

### Return type

[**ProductGroupPromotion**](ProductGroupPromotion.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ProductGroupPromotionsList"></a>
# **Invoke-ProductGroupPromotionsList**
> ProductGroupPromotionsList200Response Invoke-ProductGroupPromotionsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductGroupPromotionIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EntityStatuses] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdGroupId] <String><br>

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
$Order = "ASCENDING" # PinterestLibPaginationOrder | The order in which to sort the items returned: ""ASCENDING"" or ""DESCENDING"" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
$ProductGroupPromotionIds = "MyProductGroupPromotionIds" # String[] | List of Product group promotion Ids. (optional)
$EntityStatuses = "ACTIVE" # EntityStatus[] | Entity status (optional)
$AdGroupId = "MyAdGroupId" # String | Ad group Id. (optional)

# Get product group promotions
try {
    $Result = Invoke-ProductGroupPromotionsList -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize -Order $Order -ProductGroupPromotionIds $ProductGroupPromotionIds -EntityStatuses $EntityStatuses -AdGroupId $AdGroupId
} catch {
    Write-Host ("Exception occurred when calling Invoke-ProductGroupPromotionsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **Order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md)| The order in which to sort the items returned: &quot;&quot;ASCENDING&quot;&quot; or &quot;&quot;DESCENDING&quot;&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **ProductGroupPromotionIds** | [**String[]**](String.md)| List of Product group promotion Ids. | [optional] 
 **EntityStatuses** | [**EntityStatus[]**](EntityStatus.md)| Entity status | [optional] 
 **AdGroupId** | **String**| Ad group Id. | [optional] 

### Return type

[**ProductGroupPromotionsList200Response**](ProductGroupPromotionsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ProductGroupPromotionsUpdate"></a>
# **Invoke-ProductGroupPromotionsUpdate**
> ProductGroupPromotions Invoke-ProductGroupPromotionsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductGroupPromotionsUpdateWithRequiredBody] <PSCustomObject><br>

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$ProductGroupPromotion = Initialize-ProductGroupPromotion -AdGroupId "2680059592705" -BidInMicroCurrency 14000000 -CatalogProductGroupId "1231235" -CatalogProductGroupName "catalogProductGroupName" -CollectionsHeaderType "SHOP_THIS_COLLECTION" -CollectionsHeroDestinationUrl "http://www.pinterest.com" -CollectionsHeroPinId "123123" -CreativeType "REGULAR" -CustomizableCtaType "GET_OFFER" -Definition "*/product_type_0='kitchen'/product_type_1='beverage appliances'" -GridClickType "CLOSEUP" -Id "2680059592705" -Included $true -IsGenerateBackground $true -IsImageAutoResizing $true -IsMdl $true -ParentId "1231234" -PreferredMediaType "VIDEO" -RelativeDefinition "product_type_1='beverage appliances'" -SelectedImageTag "holiday_sale" -SelectedVideoTag "holiday_sale" -SlideshowCollectionsDescription "slideshow description" -SlideshowCollectionsTitle "slideshow title" -Status "ACTIVE" -TrackingUrl "https://www.pinterest.com"
$ProductGroupPromotionsUpdateWithRequiredBody = Initialize-ProductGroupPromotionsUpdateWithRequiredBody -AdGroupId "2680059592705" -ProductGroupPromotion $ProductGroupPromotion # ProductGroupPromotionsUpdateWithRequiredBody | 

# Update product group promotions
try {
    $Result = Invoke-ProductGroupPromotionsUpdate -AdAccountId $AdAccountId -ProductGroupPromotionsUpdateWithRequiredBody $ProductGroupPromotionsUpdateWithRequiredBody
} catch {
    Write-Host ("Exception occurred when calling Invoke-ProductGroupPromotionsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **ProductGroupPromotionsUpdateWithRequiredBody** | [**ProductGroupPromotionsUpdateWithRequiredBody**](ProductGroupPromotionsUpdateWithRequiredBody.md)|  | 

### Return type

[**ProductGroupPromotions**](ProductGroupPromotions.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ProductGroupsAnalytics"></a>
# **Invoke-ProductGroupsAnalytics**
> ProductGroupAnalyticsItems[] Invoke-ProductGroupsAnalytics<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EndDate] <System.DateTime><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductGroupIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Columns] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Granularity] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ClickWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EngagementWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ViewWindowDays] <System.Nullable[Decimal]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConversionReportTime] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ReportingTimezone] <PSCustomObject><br>

Get product group analytics

Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$StartDate = (Get-Date) # System.DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$EndDate = (Get-Date) # System.DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$ProductGroupIds = "MyProductGroupIds" # String[] | List of Product group Ids to use to filter the results.
$Columns = "SPEND_IN_MICRO_DOLLAR" # ReportingColumnSync[] | Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile's currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it's microdollars. Otherwise, it's in microunits of the advertiser's currency.  For example, if the advertiser's currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned.
$Granularity = "TOTAL" # Granularity |   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$ClickWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. (optional) (default to 30)
$EngagementWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. (optional) (default to 30)
$ViewWindowDays = "0" # Decimal | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day. (optional) (default to 1)
$ConversionReportTime = "TIME_OF_AD_ACTION" # String | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. (optional) (default to "TIME_OF_AD_ACTION")
$ReportingTimezone = "PINTEREST_TIME_ZONE" # ReportingTimeZone | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. (optional)

# Get product group analytics
try {
    $Result = Invoke-ProductGroupsAnalytics -StartDate $StartDate -EndDate $EndDate -ProductGroupIds $ProductGroupIds -Columns $Columns -Granularity $Granularity -AdAccountId $AdAccountId -ClickWindowDays $ClickWindowDays -EngagementWindowDays $EngagementWindowDays -ViewWindowDays $ViewWindowDays -ConversionReportTime $ConversionReportTime -ReportingTimezone $ReportingTimezone
} catch {
    Write-Host ("Exception occurred when calling Invoke-ProductGroupsAnalytics: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **StartDate** | **System.DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **EndDate** | **System.DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **ProductGroupIds** | [**String[]**](String.md)| List of Product group Ids to use to filter the results. | 
 **Columns** | [**ReportingColumnSync[]**](ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. | 
 **Granularity** | [**Granularity**](Granularity.md)|   TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **ClickWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **EngagementWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **ViewWindowDays** | **Decimal**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **ConversionReportTime** | **String**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &quot;TIME_OF_AD_ACTION&quot;]
 **ReportingTimezone** | [**ReportingTimeZone**](ReportingTimeZone.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 

### Return type

[**ProductGroupAnalyticsItems[]**](ProductGroupAnalyticsItems.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

