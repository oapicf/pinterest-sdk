# PSOpenAPITools.PSOpenAPITools\Api.CustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-CustomerListUploadsCreate**](CustomerListUploadsApi.md#Invoke-CustomerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**Invoke-CustomerListUploadsGet**](CustomerListUploadsApi.md#Invoke-CustomerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**Invoke-CustomerListUploadsRun**](CustomerListUploadsApi.md#Invoke-CustomerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload


<a id="Invoke-CustomerListUploadsCreate"></a>
# **Invoke-CustomerListUploadsCreate**
> CustomerListUploadCreateResponse Invoke-CustomerListUploadsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListUploadCreateRequest] <PSCustomObject><br>

Create customer list upload

<a href=""/docs/getting-started/using-beta-and-restricted-features/"" target=""_blank"">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=""/docs/api/v5/customer_lists-update/"" target=""_blank"">update customer list endpoint</a></u> documentation for additional information.</b></p>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CustomerListId = "MyCustomerListId" # String | Unique identifier of a customer list
$CustomerListUploadCreateRequest = Initialize-CustomerListUploadCreateRequest -Operation "ADD" -TotalParts 2 # CustomerListUploadCreateRequest | Parameters to create a customer list upload request

# Create customer list upload
try {
    $Result = Invoke-CustomerListUploadsCreate -AdAccountId $AdAccountId -CustomerListId $CustomerListId -CustomerListUploadCreateRequest $CustomerListUploadCreateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-CustomerListUploadsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CustomerListId** | **String**| Unique identifier of a customer list | 
 **CustomerListUploadCreateRequest** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md)| Parameters to create a customer list upload request | 

### Return type

[**CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CustomerListUploadsGet"></a>
# **Invoke-CustomerListUploadsGet**
> CustomerListUploadResponse Invoke-CustomerListUploadsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListUploadId] <String><br>

Get customer list upload

<a href=""/docs/getting-started/using-beta-and-restricted-features/"" target=""_blank"">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CustomerListId = "MyCustomerListId" # String | Unique identifier of a customer list
$CustomerListUploadId = "MyCustomerListUploadId" # String | Unique identifier of a customer list upload

# Get customer list upload
try {
    $Result = Invoke-CustomerListUploadsGet -AdAccountId $AdAccountId -CustomerListId $CustomerListId -CustomerListUploadId $CustomerListUploadId
} catch {
    Write-Host ("Exception occurred when calling Invoke-CustomerListUploadsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CustomerListId** | **String**| Unique identifier of a customer list | 
 **CustomerListUploadId** | **String**| Unique identifier of a customer list upload | 

### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CustomerListUploadsRun"></a>
# **Invoke-CustomerListUploadsRun**
> CustomerListUploadResponse Invoke-CustomerListUploadsRun<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListUploadId] <String><br>

Run customer list upload

<a href=""/docs/getting-started/using-beta-and-restricted-features/"" target=""_blank"">Closed beta</a> <p>Begin processing a customer list upload.</p>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CustomerListId = "MyCustomerListId" # String | Unique identifier of a customer list
$CustomerListUploadId = "MyCustomerListUploadId" # String | Unique identifier of a customer list upload

# Run customer list upload
try {
    $Result = Invoke-CustomerListUploadsRun -AdAccountId $AdAccountId -CustomerListId $CustomerListId -CustomerListUploadId $CustomerListUploadId
} catch {
    Write-Host ("Exception occurred when calling Invoke-CustomerListUploadsRun: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CustomerListId** | **String**| Unique identifier of a customer list | 
 **CustomerListUploadId** | **String**| Unique identifier of a customer list upload | 

### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

