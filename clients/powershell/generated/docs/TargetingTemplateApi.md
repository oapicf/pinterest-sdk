# PSOpenAPITools.PSOpenAPITools\Api.TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-TargetingTemplateCreate**](TargetingTemplateApi.md#Invoke-TargetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**Invoke-TargetingTemplateList**](TargetingTemplateApi.md#Invoke-TargetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**Invoke-TargetingTemplateUpdate**](TargetingTemplateApi.md#Invoke-TargetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


<a id="Invoke-TargetingTemplateCreate"></a>
# **Invoke-TargetingTemplateCreate**
> TargetingTemplate Invoke-TargetingTemplateCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TargetingTemplateCreate] <PSCustomObject><br>

Create targeting templates

Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$TargetingTemplateKeyword = Initialize-TargetingTemplateKeyword -MatchType "BROAD" -Value "couples halloween costumes"

$TargetingSpecShoppingRetargeting = Initialize-TargetingSpecShoppingRetargeting -ExclusionWindow 14 -LookbackWindow 30 -TagTypes 0
$TargetingSpecOptimal = Initialize-TargetingSpecOptimal -AGEBUCKET "18-24" -APPTYPE "android_mobile" -AUDIENCEEXCLUDE "MyAUDIENCEEXCLUDE" -AUDIENCEINCLUDE "MyAUDIENCEINCLUDE" -GENDER "unknown" -GEO "MyGEO" -GEOEXCLUDE "MyGEOEXCLUDE" -INTEREST "MyINTEREST" -LOCALE "MyLOCALE" -LOCATION "MyLOCATION" -LOCATIONEXCLUDE "MyLOCATIONEXCLUDE" -MAXIMUMAGE "MyMAXIMUMAGE" -MINIMUMAGE "MyMINIMUMAGE" -SHOPPINGRETARGETING $TargetingSpecShoppingRetargeting -TARGETINGSTRATEGY "CHOOSE_YOUR_OWN"

$TrackingUrls = Initialize-TrackingUrls -AudienceVerification "MyAudienceVerification" -BuyableButton "MyBuyableButton" -Click "MyClick" -Engagement "MyEngagement" -Impression "MyImpression"
$TargetingTemplateCreate = Initialize-TargetingTemplateCreate -AutoTargetingEnabled $false -Keywords $TargetingTemplateKeyword -Name "MyName" -PlacementGroup "ALL" -TargetingAttributes $TargetingSpecOptimal -TrackingUrls $TrackingUrls # TargetingTemplateCreate | 

# Create targeting templates
try {
    $Result = Invoke-TargetingTemplateCreate -AdAccountId $AdAccountId -TargetingTemplateCreate $TargetingTemplateCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-TargetingTemplateCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **TargetingTemplateCreate** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md)|  | 

### Return type

[**TargetingTemplate**](TargetingTemplate.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-TargetingTemplateList"></a>
# **Invoke-TargetingTemplateList**
> TargetingTemplateList200Response Invoke-TargetingTemplateList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeSizing] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SearchQuery] <String><br>

List targeting templates

Get a list of the targeting templates in the specified `ad_account_id`

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
$Order = "ASCENDING" # PinterestLibPaginationOrder | The order in which to sort the items returned: ""ASCENDING"" or ""DESCENDING"" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
$IncludeSizing = $true # Boolean | Include audience sizing in result or not (optional) (default to $false)
$SearchQuery = "MySearchQuery" # String | Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)

# List targeting templates
try {
    $Result = Invoke-TargetingTemplateList -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize -Order $Order -IncludeSizing $IncludeSizing -SearchQuery $SearchQuery
} catch {
    Write-Host ("Exception occurred when calling Invoke-TargetingTemplateList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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
 **IncludeSizing** | **Boolean**| Include audience sizing in result or not | [optional] [default to $false]
 **SearchQuery** | **String**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-TargetingTemplateUpdate"></a>
# **Invoke-TargetingTemplateUpdate**
> void Invoke-TargetingTemplateUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TargetingTemplateUpdateRequestReadOrUpdate] <PSCustomObject><br>

Update targeting templates

Update the targeting template given advertiser ID and targeting template ID

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$TargetingSpecShoppingRetargeting = Initialize-TargetingSpecShoppingRetargeting -ExclusionWindow 14 -LookbackWindow 30 -TagTypes 0
$TargetingSpecOptimal = Initialize-TargetingSpecOptimal -AGEBUCKET "18-24" -APPTYPE "android_mobile" -AUDIENCEEXCLUDE "MyAUDIENCEEXCLUDE" -AUDIENCEINCLUDE "MyAUDIENCEINCLUDE" -GENDER "unknown" -GEO "MyGEO" -GEOEXCLUDE "MyGEOEXCLUDE" -INTEREST "MyINTEREST" -LOCALE "MyLOCALE" -LOCATION "MyLOCATION" -LOCATIONEXCLUDE "MyLOCATIONEXCLUDE" -MAXIMUMAGE "MyMAXIMUMAGE" -MINIMUMAGE "MyMINIMUMAGE" -SHOPPINGRETARGETING $TargetingSpecShoppingRetargeting -TARGETINGSTRATEGY "CHOOSE_YOUR_OWN"

$TargetingTemplateUpdateRequestReadOrUpdate = Initialize-TargetingTemplateUpdateRequestReadOrUpdate -Id "643" -OperationType "UPDATE" -TargetingAttributes $TargetingSpecOptimal # TargetingTemplateUpdateRequestReadOrUpdate | 

# Update targeting templates
try {
    $Result = Invoke-TargetingTemplateUpdate -AdAccountId $AdAccountId -TargetingTemplateUpdateRequestReadOrUpdate $TargetingTemplateUpdateRequestReadOrUpdate
} catch {
    Write-Host ("Exception occurred when calling Invoke-TargetingTemplateUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **TargetingTemplateUpdateRequestReadOrUpdate** | [**TargetingTemplateUpdateRequestReadOrUpdate**](TargetingTemplateUpdateRequestReadOrUpdate.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

