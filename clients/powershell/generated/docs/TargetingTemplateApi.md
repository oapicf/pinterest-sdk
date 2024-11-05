# PSOpenAPITools.PSOpenAPITools\Api.TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-TargetingTemplateCreate**](TargetingTemplateApi.md#Invoke-TargetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**Invoke-TargetingTemplateList**](TargetingTemplateApi.md#Invoke-TargetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**Invoke-TargetingTemplateUpdate**](TargetingTemplateApi.md#Invoke-TargetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


<a id="Invoke-TargetingTemplateCreate"></a>
# **Invoke-TargetingTemplateCreate**
> TargetingTemplateGetResponseData Invoke-TargetingTemplateCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TargetingTemplateCreate] <PSCustomObject><br>

Create targeting templates

<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
"18-24""android_mobile""unknown"
$TargetingSpecSHOPPINGRETARGETING = Initialize-TargetingSpecSHOPPINGRETARGETING -LookbackWindow 30 -TagTypes 0 -ExclusionWindow 14
"CHOOSE_YOUR_OWN"$TargetingSpec = Initialize-TargetingSpec -AGEBUCKET "18-24" -APPTYPE "18-24""android_mobile" -AUDIENCEEXCLUDE "MyAUDIENCEEXCLUDE" -AUDIENCEINCLUDE "MyAUDIENCEINCLUDE" -GENDER "18-24""android_mobile""unknown" -GEO "MyGEO" -INTEREST "MyINTEREST" -LOCALE "MyLOCALE" -LOCATION "MyLOCATION" -SHOPPINGRETARGETING $TargetingSpecSHOPPINGRETARGETING -TARGETINGSTRATEGY "18-24""android_mobile""unknown"
$TargetingSpecSHOPPINGRETARGETING = Initialize-TargetingSpecSHOPPINGRETARGETING -LookbackWindow 30 -TagTypes 0 -ExclusionWindow 14
"CHOOSE_YOUR_OWN"

$TargetingTemplateKeyword = Initialize-TargetingTemplateKeyword -MatchType "BROAD" -Value "couples halloween costumes"
$TrackingUrls = Initialize-TrackingUrls -Impression "MyImpression" -Click "MyClick" -Engagement "MyEngagement" -BuyableButton "MyBuyableButton" -AudienceVerification "MyAudienceVerification"
$TargetingTemplateCreate = Initialize-TargetingTemplateCreate -Name "Gaming" -AutoTargetingEnabled $false -TargetingAttributes $TargetingSpec -PlacementGroup "ALL" -Keywords $TargetingTemplateKeyword -TrackingUrls $TrackingUrls # TargetingTemplateCreate | targeting template creation entity

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
 **TargetingTemplateCreate** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md)| targeting template creation entity | 

### Return type

[**TargetingTemplateGetResponseData**](TargetingTemplateGetResponseData.md) (PSCustomObject)

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
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeSizing] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SearchQuery] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>

List targeting templates

Get a list of the targeting templates in the specified <code>ad_account_id</code>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$Order = "ASCENDING" # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
$IncludeSizing = $true # Boolean | Include audience sizing in result or not (optional) (default to $false)
$SearchQuery = "gaming" # String | Search keyword for targeting templates (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)

# List targeting templates
try {
    $Result = Invoke-TargetingTemplateList -AdAccountId $AdAccountId -Order $Order -IncludeSizing $IncludeSizing -SearchQuery $SearchQuery -PageSize $PageSize -Bookmark $Bookmark
} catch {
    Write-Host ("Exception occurred when calling Invoke-TargetingTemplateList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **Order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **IncludeSizing** | **Boolean**| Include audience sizing in result or not | [optional] [default to $false]
 **SearchQuery** | **String**| Search keyword for targeting templates | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-TargetingTemplateUpdate"></a>
# **Invoke-TargetingTemplateUpdate**
> void Invoke-TargetingTemplateUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TargetingTemplateUpdateRequest] <PSCustomObject><br>

Update targeting templates

<p>Update the targeting template given advertiser ID and targeting template ID</p>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$TargetingTemplateUpdateRequest = Initialize-TargetingTemplateUpdateRequest -OperationType "REMOVE" -Id "643" # TargetingTemplateUpdateRequest | Operation type and targeting template ID

# Update targeting templates
try {
    $Result = Invoke-TargetingTemplateUpdate -AdAccountId $AdAccountId -TargetingTemplateUpdateRequest $TargetingTemplateUpdateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-TargetingTemplateUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **TargetingTemplateUpdateRequest** | [**TargetingTemplateUpdateRequest**](TargetingTemplateUpdateRequest.md)| Operation type and targeting template ID | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

