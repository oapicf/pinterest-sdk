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

Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | 
$CustomerListId = "MyCustomerListId" # String | Customer list ID.
$CustomerListUploadCreateRequest = Initialize-CustomerListUploadCreateRequest -Operation "ADD" -TotalParts 2 # CustomerListUploadCreateRequest | 

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
 **AdAccountId** | **String**|  | 
 **CustomerListId** | **String**| Customer list ID. | 
 **CustomerListUploadCreateRequest** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md)|  | 

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
> CustomerListUpload Invoke-CustomerListUploadsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListUploadId] <String><br>

Get customer list upload

Get the metadata for a given upload by its ID.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | 
$CustomerListId = "MyCustomerListId" # String | Customer list ID.
$CustomerListUploadId = "MyCustomerListUploadId" # String | Customer List Upload ID.

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
 **AdAccountId** | **String**|  | 
 **CustomerListId** | **String**| Customer list ID. | 
 **CustomerListUploadId** | **String**| Customer List Upload ID. | 

### Return type

[**CustomerListUpload**](CustomerListUpload.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CustomerListUploadsRun"></a>
# **Invoke-CustomerListUploadsRun**
> CustomerListUpload Invoke-CustomerListUploadsRun<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListUploadId] <String><br>

Run customer list upload

Begin processing a customer list upload.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | 
$CustomerListId = "MyCustomerListId" # String | Customer list ID.
$CustomerListUploadId = "MyCustomerListUploadId" # String | Customer List Upload ID.

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
 **AdAccountId** | **String**|  | 
 **CustomerListId** | **String**| Customer list ID. | 
 **CustomerListUploadId** | **String**| Customer List Upload ID. | 

### Return type

[**CustomerListUpload**](CustomerListUpload.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

