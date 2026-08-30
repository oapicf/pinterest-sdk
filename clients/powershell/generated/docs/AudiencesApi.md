# PSOpenAPITools.PSOpenAPITools\Api.AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AudiencesCreate**](AudiencesApi.md#Invoke-AudiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**Invoke-AudiencesGet**](AudiencesApi.md#Invoke-AudiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**Invoke-AudiencesList**](AudiencesApi.md#Invoke-AudiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**Invoke-AudiencesUpdate**](AudiencesApi.md#Invoke-AudiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


<a id="Invoke-AudiencesCreate"></a>
# **Invoke-AudiencesCreate**
> AdAccountsAudience Invoke-AudiencesCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountsAudienceCreate] <PSCustomObject><br>

Create audience

Create a new audience for the ad account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LineItem = Initialize-LineItem -ProductBrand "Parker" -ProductCategory "Shoes" -ProductId 1414 -ProductName "Parker Boots" -ProductPrice "99.99" -ProductQuantity 2 -ProductVariant "Red" -ProductVariantId "1414-34832"
$EventData = Initialize-EventData -Currency "UNK" -LeadType "Newsletter" -LineItems $LineItem -OrderId "X-151481" -OrderQuantity 1 -PageName "Our Favorite Pins on Pinterest" -PromoCode "WINTER10" -Property "Athleta" -SearchQuery "boots" -Value "199.98" -VideoTitle "How to style your Parker Boots"

$AdAccountsAudienceRule = Initialize-AdAccountsAudienceRule -AdAccountId "MyAdAccountId" -AdId "MyAdId" -CampaignId "MyCampaignId" -Country "MyCountry" -CustomerListId "MyCustomerListId" -EngagementDomain "MyEngagementDomain" -EngagementType "MyEngagementType" -EngagerType 0 -VarEvent "MyVarEvent" -EventData $EventData -EventSource  -IngestionSource  -ObjectiveType "AWARENESS" -Percentage 0 -PinId "MyPinId" -Prefill $false -RetentionDays 0 -SeedId "MySeedId" -Url "MyUrl" -VisitorSourceId "MyVisitorSourceId"

$AdAccountsAudienceCreate = Initialize-AdAccountsAudienceCreate -AdAccountId "MyAdAccountId" -AudienceType "CUSTOMER_LIST" -Description "MyDescription" -Name "MyName" -Rule $AdAccountsAudienceRule # AdAccountsAudienceCreate | 

# Create audience
try {
    $Result = Invoke-AudiencesCreate -AdAccountId $AdAccountId -AdAccountsAudienceCreate $AdAccountsAudienceCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-AudiencesCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdAccountsAudienceCreate** | [**AdAccountsAudienceCreate**](AdAccountsAudienceCreate.md)|  | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AudiencesGet"></a>
# **Invoke-AudiencesGet**
> AdAccountsAudience Invoke-AudiencesGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AudienceId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get audience

Get a specific audience given the audience ID.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AudienceId = "MyAudienceId" # String | Audience ID.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.

# Get audience
try {
    $Result = Invoke-AudiencesGet -AudienceId $AudienceId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-AudiencesGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AudienceId** | **String**| Audience ID. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AudiencesList"></a>
# **Invoke-AudiencesList**
> AudiencesList200Response Invoke-AudiencesList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-OwnershipType] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ExcludeNca] <System.Nullable[Boolean]><br>

List audiences

Get list of audiences for the ad account.

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
$OwnershipType = "OWNED" # AudienceOwnershipType |  (optional)
$ExcludeNca = $true # Boolean | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). (optional) (default to $false)

# List audiences
try {
    $Result = Invoke-AudiencesList -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize -Order $Order -OwnershipType $OwnershipType -ExcludeNca $ExcludeNca
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
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **Order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md)| The order in which to sort the items returned: &quot;&quot;ASCENDING&quot;&quot; or &quot;&quot;DESCENDING&quot;&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **OwnershipType** | [**AudienceOwnershipType**](AudienceOwnershipType.md)|  | [optional] 
 **ExcludeNca** | **Boolean**| When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional] [default to $false]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AudiencesUpdate"></a>
# **Invoke-AudiencesUpdate**
> AdAccountsAudience Invoke-AudiencesUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AudienceId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountsAudienceUpdate] <PSCustomObject><br>

Update audience

Update an existing audience for the ad account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AudienceId = "MyAudienceId" # String | Audience ID.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LineItem = Initialize-LineItem -ProductBrand "Parker" -ProductCategory "Shoes" -ProductId 1414 -ProductName "Parker Boots" -ProductPrice "99.99" -ProductQuantity 2 -ProductVariant "Red" -ProductVariantId "1414-34832"
$EventData = Initialize-EventData -Currency "UNK" -LeadType "Newsletter" -LineItems $LineItem -OrderId "X-151481" -OrderQuantity 1 -PageName "Our Favorite Pins on Pinterest" -PromoCode "WINTER10" -Property "Athleta" -SearchQuery "boots" -Value "199.98" -VideoTitle "How to style your Parker Boots"

$AdAccountsAudienceRule = Initialize-AdAccountsAudienceRule -AdAccountId "MyAdAccountId" -AdId "MyAdId" -CampaignId "MyCampaignId" -Country "MyCountry" -CustomerListId "MyCustomerListId" -EngagementDomain "MyEngagementDomain" -EngagementType "MyEngagementType" -EngagerType 0 -VarEvent "MyVarEvent" -EventData $EventData -EventSource  -IngestionSource  -ObjectiveType "AWARENESS" -Percentage 0 -PinId "MyPinId" -Prefill $false -RetentionDays 0 -SeedId "MySeedId" -Url "MyUrl" -VisitorSourceId "MyVisitorSourceId"

$AdAccountsAudienceUpdate = Initialize-AdAccountsAudienceUpdate -AdAccountId "MyAdAccountId" -AudienceType "CUSTOMER_LIST" -Description "MyDescription" -Name "MyName" -OperationType "UPDATE" -Rule $AdAccountsAudienceRule # AdAccountsAudienceUpdate | 

# Update audience
try {
    $Result = Invoke-AudiencesUpdate -AudienceId $AudienceId -AdAccountId $AdAccountId -AdAccountsAudienceUpdate $AdAccountsAudienceUpdate
} catch {
    Write-Host ("Exception occurred when calling Invoke-AudiencesUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AudienceId** | **String**| Audience ID. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdAccountsAudienceUpdate** | [**AdAccountsAudienceUpdate**](AdAccountsAudienceUpdate.md)|  | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

