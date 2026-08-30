# PSOpenAPITools.PSOpenAPITools\Api.LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-LabelsApply**](LabelsApi.md#Invoke-LabelsApply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**Invoke-LabelsCreate**](LabelsApi.md#Invoke-LabelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**Invoke-LabelsList**](LabelsApi.md#Invoke-LabelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**Invoke-LabelsRemove**](LabelsApi.md#Invoke-LabelsRemove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**Invoke-LabelsUpdate**](LabelsApi.md#Invoke-LabelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


<a id="Invoke-LabelsApply"></a>
# **Invoke-LabelsApply**
> LabeledEntities Invoke-LabelsApply<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LabelId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LabeledEntitiesCreate] <PSCustomObject><br>

Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | 
$LabelId = "MyLabelId" # String | Label ID.
$LabeledEntitiesCreate = Initialize-LabeledEntitiesCreate -EntityIds "MyEntityIds" # LabeledEntitiesCreate | 

# Apply label to entity
try {
    $Result = Invoke-LabelsApply -AdAccountId $AdAccountId -LabelId $LabelId -LabeledEntitiesCreate $LabeledEntitiesCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-LabelsApply: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**|  | 
 **LabelId** | **String**| Label ID. | 
 **LabeledEntitiesCreate** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  | 

### Return type

[**LabeledEntities**](LabeledEntities.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-LabelsCreate"></a>
# **Invoke-LabelsCreate**
> LabelsResponse Invoke-LabelsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LabelCreateRequest] <PSCustomObject><br>

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LabelCreateItem = Initialize-LabelCreateItem -LabelType "BRAND" -Value "MyValue"
$LabelCreateRequest = Initialize-LabelCreateRequest -Labels $LabelCreateItem # LabelCreateRequest | 

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
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EntityStatuses] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LabelTypes] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CampaignIds = "MyCampaignIds" # String[] | List of Campaign Ids to use to filter the results. (optional)
$LabelIds = "MyLabelIds" # String[] | List of Label Ids to use to filter the results. (optional)
$EntityStatuses = "ACTIVE" # QueryLabelEntityStatusesItems[] | Label entity status (optional)
$LabelTypes = "BRAND" # QueryLabelTypesItems[] | Label type. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# List labels
try {
    $Result = Invoke-LabelsList -AdAccountId $AdAccountId -CampaignIds $CampaignIds -LabelIds $LabelIds -EntityStatuses $EntityStatuses -LabelTypes $LabelTypes -Bookmark $Bookmark -PageSize $PageSize
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
 **EntityStatuses** | [**QueryLabelEntityStatusesItems[]**](QueryLabelEntityStatusesItems.md)| Label entity status | [optional] 
 **LabelTypes** | [**QueryLabelTypesItems[]**](QueryLabelTypesItems.md)| Label type. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**LabelsList200Response**](LabelsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-LabelsRemove"></a>
# **Invoke-LabelsRemove**
> LabeledEntities Invoke-LabelsRemove<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LabelId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LabeledEntitiesCreate] <PSCustomObject><br>

Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | 
$LabelId = "MyLabelId" # String | Label ID.
$LabeledEntitiesCreate = Initialize-LabeledEntitiesCreate -EntityIds "MyEntityIds" # LabeledEntitiesCreate | 

# Remove label from entities
try {
    $Result = Invoke-LabelsRemove -AdAccountId $AdAccountId -LabelId $LabelId -LabeledEntitiesCreate $LabeledEntitiesCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-LabelsRemove: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**|  | 
 **LabelId** | **String**| Label ID. | 
 **LabeledEntitiesCreate** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  | 

### Return type

[**LabeledEntities**](LabeledEntities.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-LabelsUpdate"></a>
# **Invoke-LabelsUpdate**
> LabelsResponse Invoke-LabelsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LabelUpdateRequest] <PSCustomObject><br>

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LabelUpdateItem = Initialize-LabelUpdateItem -Id "1106385754497" -Status "ACTIVE" -Value "MyValue"
$LabelUpdateRequest = Initialize-LabelUpdateRequest -Labels $LabelUpdateItem # LabelUpdateRequest | 

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

