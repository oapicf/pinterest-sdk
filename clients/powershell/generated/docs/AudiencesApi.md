# PSOpenAPITools.PSOpenAPITools\Api.AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AudiencesCreate**](AudiencesApi.md#Invoke-AudiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**Invoke-AudiencesCreateCustom**](AudiencesApi.md#Invoke-AudiencesCreateCustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
[**Invoke-AudiencesGet**](AudiencesApi.md#Invoke-AudiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**Invoke-AudiencesList**](AudiencesApi.md#Invoke-AudiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**Invoke-AudiencesUpdate**](AudiencesApi.md#Invoke-AudiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


<a id="Invoke-AudiencesCreate"></a>
# **Invoke-AudiencesCreate**
> Audience Invoke-AudiencesCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AudienceCreateRequest] <PSCustomObject><br>

Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=""reference external"" href=""https://help.pinterest.com/en/business/article/audience-targeting"" target=""_blank"">Audience targeting</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LineItem = Initialize-LineItem -ProductBrand "Parker" -ProductCategory "Shoes" -ProductId 1414 -ProductName "Parker Boots" -ProductPrice "99.99" -ProductQuantity 2 -ProductVariant "Red" -ProductVariantId "1414-34832"
$PinterestTagEventData = Initialize-PinterestTagEventData -Currency "UNK" -LeadType "Newsletter" -LineItems $LineItem -OrderId "X-151481" -OrderQuantity 1 -PageName "Our Favorite Pins on Pinterest." -PromoCode "WINTER10" -Property "Athleta" -SearchQuery "boots" -Value "199.98" -VideoTitle "How to style your Parker Boots"

$AudienceRule = Initialize-AudienceRule -Country "US" -CustomerListId "5497558859876" -EngagementDomain "MyEngagementDomain" -EngagementType "click" -VarEvent "checkout" -EventData $PinterestTagEventData -Percentage 3 -PinId "MyPinId" -Prefill $true -RetentionDays 30 -SeedId "MySeedId" -Url "MyUrl" -VisitorSourceId "549755885175" -EventSource  -IngestionSource  -EngagerType 1 -CampaignId "MyCampaignId" -AdId "MyAdId" -ObjectiveType "AWARENESS" -AdAccountId "549755885175"

$AudienceCreateRequest1AudienceType = Initialize-AudienceCreateRequest1AudienceType 
$AudienceCreateRequest = Initialize-AudienceCreateRequest -AdAccountId "549755885175" -Name "string" -Rule $AudienceRule -Description "string" -AudienceType $AudienceCreateRequest1AudienceType # AudienceCreateRequest | List of ads to create, size limit [1, 30]

# Create audience
try {
    $Result = Invoke-AudiencesCreate -AdAccountId $AdAccountId -AudienceCreateRequest $AudienceCreateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-AudiencesCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AudienceCreateRequest** | [**AudienceCreateRequest**](AudienceCreateRequest.md)| List of ads to create, size limit [1, 30] | 

### Return type

[**Audience**](Audience.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AudiencesCreateCustom"></a>
# **Invoke-AudiencesCreateCustom**
> Audience Invoke-AudiencesCreateCustom<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AudienceCreateCustomRequest] <PSCustomObject><br>

Create custom audience

Create a custom audience and find the audiences you want your ads to reach.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LineItem = Initialize-LineItem -ProductBrand "Parker" -ProductCategory "Shoes" -ProductId 1414 -ProductName "Parker Boots" -ProductPrice "99.99" -ProductQuantity 2 -ProductVariant "Red" -ProductVariantId "1414-34832"
$PinterestTagEventData = Initialize-PinterestTagEventData -Currency "UNK" -LeadType "Newsletter" -LineItems $LineItem -OrderId "X-151481" -OrderQuantity 1 -PageName "Our Favorite Pins on Pinterest." -PromoCode "WINTER10" -Property "Athleta" -SearchQuery "boots" -Value "199.98" -VideoTitle "How to style your Parker Boots"

$AudienceRule = Initialize-AudienceRule -Country "US" -CustomerListId "5497558859876" -EngagementDomain "MyEngagementDomain" -EngagementType "click" -VarEvent "checkout" -EventData $PinterestTagEventData -Percentage 3 -PinId "MyPinId" -Prefill $true -RetentionDays 30 -SeedId "MySeedId" -Url "MyUrl" -VisitorSourceId "549755885175" -EventSource  -IngestionSource  -EngagerType 1 -CampaignId "MyCampaignId" -AdId "MyAdId" -ObjectiveType "AWARENESS" -AdAccountId "549755885175"

$AudienceCreateCustomRequest = Initialize-AudienceCreateCustomRequest -AdAccountId "549755885175" -Name "string" -Rule $AudienceRule -SharingType "CUSTOM" -DataParty "1p" -Category "DLX Demographics" # AudienceCreateCustomRequest | Custom audience to create.

# Create custom audience
try {
    $Result = Invoke-AudiencesCreateCustom -AdAccountId $AdAccountId -AudienceCreateCustomRequest $AudienceCreateCustomRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-AudiencesCreateCustom: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AudienceCreateCustomRequest** | [**AudienceCreateCustomRequest**](AudienceCreateCustomRequest.md)| Custom audience to create. | 

### Return type

[**Audience**](Audience.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AudiencesGet"></a>
# **Invoke-AudiencesGet**
> Audience Invoke-AudiencesGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AudienceId] <String><br>

Get audience

Get a specific audience given the audience ID.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AudienceId = "MyAudienceId" # String | Unique identifier of an audience

# Get audience
try {
    $Result = Invoke-AudiencesGet -AdAccountId $AdAccountId -AudienceId $AudienceId
} catch {
    Write-Host ("Exception occurred when calling Invoke-AudiencesGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AudienceId** | **String**| Unique identifier of an audience | 

### Return type

[**Audience**](Audience.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AudiencesList"></a>
# **Invoke-AudiencesList**
> AudiencesList200Response Invoke-AudiencesList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OwnershipType] <String><br>

List audiences

Get list of audiences for the ad account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$Order = "ASCENDING" # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$OwnershipType = "OWNED" # String | Filter audiences by ownership type. (optional) (default to "OWNED")

# List audiences
try {
    $Result = Invoke-AudiencesList -AdAccountId $AdAccountId -Bookmark $Bookmark -Order $Order -PageSize $PageSize -OwnershipType $OwnershipType
} catch {
    Write-Host ("Exception occurred when calling Invoke-AudiencesList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **Order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **OwnershipType** | **String**| Filter audiences by ownership type. | [optional] [default to &quot;OWNED&quot;]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AudiencesUpdate"></a>
# **Invoke-AudiencesUpdate**
> Audience Invoke-AudiencesUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AudienceId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AudienceUpdateRequest] <PSCustomObject><br>

Update audience

Update (edit or remove) an existing targeting audience.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AudienceId = "MyAudienceId" # String | Unique identifier of an audience
$LineItem = Initialize-LineItem -ProductBrand "Parker" -ProductCategory "Shoes" -ProductId 1414 -ProductName "Parker Boots" -ProductPrice "99.99" -ProductQuantity 2 -ProductVariant "Red" -ProductVariantId "1414-34832"
$PinterestTagEventData = Initialize-PinterestTagEventData -Currency "UNK" -LeadType "Newsletter" -LineItems $LineItem -OrderId "X-151481" -OrderQuantity 1 -PageName "Our Favorite Pins on Pinterest." -PromoCode "WINTER10" -Property "Athleta" -SearchQuery "boots" -Value "199.98" -VideoTitle "How to style your Parker Boots"

$AudienceRule = Initialize-AudienceRule -Country "US" -CustomerListId "5497558859876" -EngagementDomain "MyEngagementDomain" -EngagementType "click" -VarEvent "checkout" -EventData $PinterestTagEventData -Percentage 3 -PinId "MyPinId" -Prefill $true -RetentionDays 30 -SeedId "MySeedId" -Url "MyUrl" -VisitorSourceId "549755885175" -EventSource  -IngestionSource  -EngagerType 1 -CampaignId "MyCampaignId" -AdId "MyAdId" -ObjectiveType "AWARENESS" -AdAccountId "549755885175"

$AudienceUpdateRequest = Initialize-AudienceUpdateRequest -AdAccountId "549755885175" -Name "string" -Rule $AudienceRule -Description "string" -OperationType "UPDATE" # AudienceUpdateRequest | The audience to be updated. (optional)

# Update audience
try {
    $Result = Invoke-AudiencesUpdate -AdAccountId $AdAccountId -AudienceId $AudienceId -AudienceUpdateRequest $AudienceUpdateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-AudiencesUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AudienceId** | **String**| Unique identifier of an audience | 
 **AudienceUpdateRequest** | [**AudienceUpdateRequest**](AudienceUpdateRequest.md)| The audience to be updated. | [optional] 

### Return type

[**Audience**](Audience.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

