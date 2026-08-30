# PSOpenAPITools.PSOpenAPITools\Api.CustomerSegmentApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-CustomerSegmentCreate**](CustomerSegmentApi.md#Invoke-CustomerSegmentCreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**Invoke-CustomerSegmentList**](CustomerSegmentApi.md#Invoke-CustomerSegmentList) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**Invoke-CustomerSegmentUpdate**](CustomerSegmentApi.md#Invoke-CustomerSegmentUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments


<a id="Invoke-CustomerSegmentCreate"></a>
# **Invoke-CustomerSegmentCreate**
> CustomerSegment Invoke-CustomerSegmentCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerSegmentCreate] <PSCustomObject><br>

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CustomerSegmentCreate = Initialize-CustomerSegmentCreate -AudienceIds "MyAudienceIds" -Name "MyName" # CustomerSegmentCreate | 

# Create customer segments
try {
    $Result = Invoke-CustomerSegmentCreate -AdAccountId $AdAccountId -CustomerSegmentCreate $CustomerSegmentCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-CustomerSegmentCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CustomerSegmentCreate** | [**CustomerSegmentCreate**](CustomerSegmentCreate.md)|  | 

### Return type

[**CustomerSegment**](CustomerSegment.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CustomerSegmentList"></a>
# **Invoke-CustomerSegmentList**
> CustomerSegmentList200Response Invoke-CustomerSegmentList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeSizing] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SearchQuery] <String><br>

List customer segments

Get a list of the customer segments in the specified `ad_account_id`.

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
$IncludeSizing = $true # Boolean | Include audience sizing in result or not (optional) (default to $false)
$SearchQuery = "MySearchQuery" # String | Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)

# List customer segments
try {
    $Result = Invoke-CustomerSegmentList -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize -Order $Order -IncludeSizing $IncludeSizing -SearchQuery $SearchQuery
} catch {
    Write-Host ("Exception occurred when calling Invoke-CustomerSegmentList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

[**CustomerSegmentList200Response**](CustomerSegmentList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CustomerSegmentUpdate"></a>
# **Invoke-CustomerSegmentUpdate**
> void Invoke-CustomerSegmentUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerSegmentUpdateRequestUpdateWithRequiredBody] <PSCustomObject><br>

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CustomerSegmentUpdateRequestUpdateWithRequiredBody = Initialize-CustomerSegmentUpdateRequestUpdateWithRequiredBody -AudienceIds "MyAudienceIds" -Id "MyId" -OperationType "UPDATE" # CustomerSegmentUpdateRequestUpdateWithRequiredBody | 

# Update customer segments
try {
    $Result = Invoke-CustomerSegmentUpdate -AdAccountId $AdAccountId -CustomerSegmentUpdateRequestUpdateWithRequiredBody $CustomerSegmentUpdateRequestUpdateWithRequiredBody
} catch {
    Write-Host ("Exception occurred when calling Invoke-CustomerSegmentUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CustomerSegmentUpdateRequestUpdateWithRequiredBody** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

