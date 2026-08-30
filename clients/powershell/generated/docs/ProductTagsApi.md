# PSOpenAPITools.PSOpenAPITools\Api.ProductTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-ProductTagsBulkAdd**](ProductTagsApi.md#Invoke-ProductTagsBulkAdd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
[**Invoke-ProductTagsBulkDelete**](ProductTagsApi.md#Invoke-ProductTagsBulkDelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
[**Invoke-ProductTagsList**](ProductTagsApi.md#Invoke-ProductTagsList) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin


<a id="Invoke-ProductTagsBulkAdd"></a>
# **Invoke-ProductTagsBulkAdd**
> ProductTagsResponse Invoke-ProductTagsBulkAdd<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductTagsBulkAddRequest] <PSCustomObject><br>

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$PinId = "MyPinId" # String | Unique identifier of the hero pin that will receive product tags.
$ProductTagItem = Initialize-ProductTagItem -PinId "MyPinId"
$ProductTagsBulkAddRequest = Initialize-ProductTagsBulkAddRequest -ProductTags $ProductTagItem # ProductTagsBulkAddRequest | 

# Add product tags to pin
try {
    $Result = Invoke-ProductTagsBulkAdd -PinId $PinId -ProductTagsBulkAddRequest $ProductTagsBulkAddRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-ProductTagsBulkAdd: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PinId** | **String**| Unique identifier of the hero pin that will receive product tags. | 
 **ProductTagsBulkAddRequest** | [**ProductTagsBulkAddRequest**](ProductTagsBulkAddRequest.md)|  | 

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ProductTagsBulkDelete"></a>
# **Invoke-ProductTagsBulkDelete**
> void Invoke-ProductTagsBulkDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductTagsBulkDeleteRequest] <PSCustomObject><br>

Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$PinId = "MyPinId" # String | Unique identifier of the hero pin that will receive product tags.
$ProductTagItem = Initialize-ProductTagItem -PinId "MyPinId"
$ProductTagsBulkDeleteRequest = Initialize-ProductTagsBulkDeleteRequest -ProductTags $ProductTagItem # ProductTagsBulkDeleteRequest | 

# Delete product tags from pin
try {
    $Result = Invoke-ProductTagsBulkDelete -PinId $PinId -ProductTagsBulkDeleteRequest $ProductTagsBulkDeleteRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-ProductTagsBulkDelete: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PinId** | **String**| Unique identifier of the hero pin that will receive product tags. | 
 **ProductTagsBulkDeleteRequest** | [**ProductTagsBulkDeleteRequest**](ProductTagsBulkDeleteRequest.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ProductTagsList"></a>
# **Invoke-ProductTagsList**
> ProductTagsResponse Invoke-ProductTagsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinId] <String><br>

Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$PinId = "MyPinId" # String | Unique identifier of the hero pin that will receive product tags.

# Get product tags for pin
try {
    $Result = Invoke-ProductTagsList -PinId $PinId
} catch {
    Write-Host ("Exception occurred when calling Invoke-ProductTagsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PinId** | **String**| Unique identifier of the hero pin that will receive product tags. | 

### Return type

[**ProductTagsResponse**](ProductTagsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

