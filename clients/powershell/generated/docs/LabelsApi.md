# PSOpenAPITools.PSOpenAPITools\Api.LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-LabelsCreate**](LabelsApi.md#Invoke-LabelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**Invoke-LabelsList**](LabelsApi.md#Invoke-LabelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**Invoke-LabelsUpdate**](LabelsApi.md#Invoke-LabelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


<a id="Invoke-LabelsCreate"></a>
# **Invoke-LabelsCreate**
> LabelsResponse Invoke-LabelsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LabelCreateRequest] <PSCustomObject><br>

Create labels

<p> <a href=""/docs/getting-started/using-beta-and-restricted-features/"" target=""blank"" target=""blank"">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LabelCreateRequestLabelsInner = Initialize-LabelCreateRequestLabelsInner -LabelType "BRAND" -Value "MyValue"
$LabelCreateRequest = Initialize-LabelCreateRequest -Labels $LabelCreateRequestLabelsInner -ParentId "626753052072" # LabelCreateRequest | 

# Create labels
try {
    $Result = Invoke-LabelsCreate -AdAccountId $AdAccountId -LabelCreateRequest $LabelCreateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-LabelsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **LabelCreateRequest** | [**LabelCreateRequest**](LabelCreateRequest.md)|  | 

### Return type

[**LabelsResponse**](LabelsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-LabelsList"></a>
# **Invoke-LabelsList**
> LabelsList200Response Invoke-LabelsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CampaignIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LabelIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EntityStatuses] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LabelTypes] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>

List labels

<p>   <a href=""/docs/getting-started/using-beta-and-restricted-features/"" target=""blank"" target=""blank"">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CampaignIds = "MyCampaignIds" # String[] | List of Campaign Ids to use to filter the results. (optional)
$LabelIds = "MyLabelIds" # String[] | List of Label Ids to use to filter the results. (optional)
$EntityStatuses = "ACTIVE" # String[] | Label entity status (optional)
$LabelTypes = "BRAND" # String[] | Label type. (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)

# List labels
try {
    $Result = Invoke-LabelsList -AdAccountId $AdAccountId -CampaignIds $CampaignIds -LabelIds $LabelIds -EntityStatuses $EntityStatuses -LabelTypes $LabelTypes -PageSize $PageSize -Bookmark $Bookmark
} catch {
    Write-Host ("Exception occurred when calling Invoke-LabelsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CampaignIds** | [**String[]**](String.md)| List of Campaign Ids to use to filter the results. | [optional] 
 **LabelIds** | [**String[]**](String.md)| List of Label Ids to use to filter the results. | [optional] 
 **EntityStatuses** | [**String[]**](String.md)| Label entity status | [optional] 
 **LabelTypes** | [**String[]**](String.md)| Label type. | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**LabelsList200Response**](LabelsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-LabelsUpdate"></a>
# **Invoke-LabelsUpdate**
> LabelsResponse Invoke-LabelsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LabelUpdateRequest] <PSCustomObject><br>

Update labels

<p>   <a href=""/docs/getting-started/using-beta-and-restricted-features/"" target=""blank"" target=""blank"">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LabelUpdateRequestLabelsInner = Initialize-LabelUpdateRequestLabelsInner -Id "1106385754497" -Status "ACTIVE" -Value "MyValue"
$LabelUpdateRequest = Initialize-LabelUpdateRequest -Labels $LabelUpdateRequestLabelsInner # LabelUpdateRequest | 

# Update labels
try {
    $Result = Invoke-LabelsUpdate -AdAccountId $AdAccountId -LabelUpdateRequest $LabelUpdateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-LabelsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **LabelUpdateRequest** | [**LabelUpdateRequest**](LabelUpdateRequest.md)|  | 

### Return type

[**LabelsResponse**](LabelsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

