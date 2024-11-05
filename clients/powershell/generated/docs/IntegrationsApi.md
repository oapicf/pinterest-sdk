# PSOpenAPITools.PSOpenAPITools\Api.IntegrationsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConvertTo-tegrationsCommerceDel**](IntegrationsApi.md#ConvertTo-tegrationsCommerceDel) | **DELETE** /integrations/commerce/{external_business_id} | Delete commerce integration
[**ConvertTo-tegrationsCommerceGet**](IntegrationsApi.md#ConvertTo-tegrationsCommerceGet) | **GET** /integrations/commerce/{external_business_id} | Get commerce integration
[**ConvertTo-tegrationsCommercePatch**](IntegrationsApi.md#ConvertTo-tegrationsCommercePatch) | **PATCH** /integrations/commerce/{external_business_id} | Update commerce integration
[**ConvertTo-tegrationsCommercePost**](IntegrationsApi.md#ConvertTo-tegrationsCommercePost) | **POST** /integrations/commerce | Create commerce integration
[**ConvertTo-tegrationsLogsPost**](IntegrationsApi.md#ConvertTo-tegrationsLogsPost) | **POST** /integrations/logs | Receives batched logs from integration applications.
[**ConvertTo-tegrationsGetById**](IntegrationsApi.md#ConvertTo-tegrationsGetById) | **GET** /integrations/{id} | Get integration metadata
[**ConvertTo-tegrationsGetList**](IntegrationsApi.md#ConvertTo-tegrationsGetList) | **GET** /integrations | Get integration metadata list


<a id="ConvertTo-tegrationsCommerceDel"></a>
# **ConvertTo-tegrationsCommerceDel**
> void ConvertTo-tegrationsCommerceDel<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ExternalBusinessId] <String><br>

Delete commerce integration

Delete commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ExternalBusinessId = "MyExternalBusinessId" # String | External business ID for the integration.

# Delete commerce integration
try {
    $Result = ConvertTo-tegrationsCommerceDel -ExternalBusinessId $ExternalBusinessId
} catch {
    Write-Host ("Exception occurred when calling ConvertTo-tegrationsCommerceDel: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ExternalBusinessId** | **String**| External business ID for the integration. | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="ConvertTo-tegrationsCommerceGet"></a>
# **ConvertTo-tegrationsCommerceGet**
> IntegrationMetadata ConvertTo-tegrationsCommerceGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ExternalBusinessId] <String><br>

Get commerce integration

Get commerce integration metadata associated with the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ExternalBusinessId = "MyExternalBusinessId" # String | External business ID for the integration.

# Get commerce integration
try {
    $Result = ConvertTo-tegrationsCommerceGet -ExternalBusinessId $ExternalBusinessId
} catch {
    Write-Host ("Exception occurred when calling ConvertTo-tegrationsCommerceGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ExternalBusinessId** | **String**| External business ID for the integration. | 

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="ConvertTo-tegrationsCommercePatch"></a>
# **ConvertTo-tegrationsCommercePatch**
> IntegrationMetadata ConvertTo-tegrationsCommercePatch<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ExternalBusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IntegrationRequestPatch] <PSCustomObject><br>

Update commerce integration

Update commerce integration metadata for the given external business ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ExternalBusinessId = "MyExternalBusinessId" # String | External business ID for the integration.
$IntegrationRequestPatch = Initialize-IntegrationRequestPatch -ConnectedMerchantId "MyConnectedMerchantId" -ConnectedAdvertiserId "MyConnectedAdvertiserId" -ConnectedLbaId "MyConnectedLbaId" -ConnectedTagId "MyConnectedTagId" -PartnerAccessToken "MyPartnerAccessToken" -PartnerRefreshToken "MyPartnerRefreshToken" -PartnerPrimaryEmail "MyPartnerPrimaryEmail" -PartnerAccessTokenExpiry 0 -PartnerRefreshTokenExpiry 0 -Scopes "MyScopes" -AdditionalId1 "MyAdditionalId1" -PartnerMetadata "MyPartnerMetadata" # IntegrationRequestPatch | Parameters to get create/update the Integration Metadata (optional)

# Update commerce integration
try {
    $Result = ConvertTo-tegrationsCommercePatch -ExternalBusinessId $ExternalBusinessId -IntegrationRequestPatch $IntegrationRequestPatch
} catch {
    Write-Host ("Exception occurred when calling ConvertTo-tegrationsCommercePatch: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ExternalBusinessId** | **String**| External business ID for the integration. | 
 **IntegrationRequestPatch** | [**IntegrationRequestPatch**](IntegrationRequestPatch.md)| Parameters to get create/update the Integration Metadata | [optional] 

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="ConvertTo-tegrationsCommercePost"></a>
# **ConvertTo-tegrationsCommercePost**
> IntegrationMetadata ConvertTo-tegrationsCommercePost<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IntegrationRequest] <PSCustomObject><br>

Create commerce integration

Create commerce integration metadata to link an external business ID with a Pinterest merchant & ad account. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$IntegrationRequest = Initialize-IntegrationRequest -ExternalBusinessId "MyExternalBusinessId" -ConnectedMerchantId "MyConnectedMerchantId" -ConnectedAdvertiserId "MyConnectedAdvertiserId" -ConnectedLbaId "MyConnectedLbaId" -ConnectedTagId "MyConnectedTagId" -PartnerAccessToken "MyPartnerAccessToken" -PartnerRefreshToken "MyPartnerRefreshToken" -PartnerPrimaryEmail "MyPartnerPrimaryEmail" -PartnerAccessTokenExpiry 0 -PartnerRefreshTokenExpiry 0 -Scopes "MyScopes" -AdditionalId1 "MyAdditionalId1" -PartnerMetadata "MyPartnerMetadata" # IntegrationRequest | Parameters to get create/update the Integration Metadata (optional)

# Create commerce integration
try {
    $Result = ConvertTo-tegrationsCommercePost -IntegrationRequest $IntegrationRequest
} catch {
    Write-Host ("Exception occurred when calling ConvertTo-tegrationsCommercePost: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **IntegrationRequest** | [**IntegrationRequest**](IntegrationRequest.md)| Parameters to get create/update the Integration Metadata | [optional] 

### Return type

[**IntegrationMetadata**](IntegrationMetadata.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="ConvertTo-tegrationsLogsPost"></a>
# **ConvertTo-tegrationsLogsPost**
> IntegrationLogsSuccessResponse ConvertTo-tegrationsLogsPost<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IntegrationLogsRequest] <PSCustomObject><br>

Receives batched logs from integration applications.

This endpoint receives batched logs from integration applications on partner platforms. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$IntegrationLogClientError = Initialize-IntegrationLogClientError -Cause "MyCause" -ColumnNumber 0 -FileName "MyFileName" -LineNumber 0 -Message "MyMessage" -MessageDetail "MyMessageDetail" -Name "MyName" -Number 0 -VarStackTrace "MyVarStackTrace"
$IntegrationLogClientRequest = Initialize-IntegrationLogClientRequest -Method "GET" -VarHost "MyVarHost" -Path "MyPath" -RequestHeaders @{ key_example = "MyInner" } -ResponseHeaders @{ key_example = "MyInner" } -ResponseStatusCode 0
$IntegrationLog = Initialize-IntegrationLog -ClientTimestamp 0 -EventType "APP" -LogLevel "INFO" -ExternalBusinessId "MyExternalBusinessId" -AdvertiserId "MyAdvertiserId" -MerchantId "MyMerchantId" -TagId "MyTagId" -FeedProfileId "MyFeedProfileId" -Message "MyMessage" -AppVersionNumber "MyAppVersionNumber" -PlatformVersionNumber "MyPlatformVersionNumber" -VarError $IntegrationLogClientError -Request $IntegrationLogClientRequest

$IntegrationLogsRequest = Initialize-IntegrationLogsRequest -Logs $IntegrationLog # IntegrationLogsRequest | Ingest log information from external integration application.

# Receives batched logs from integration applications.
try {
    $Result = ConvertTo-tegrationsLogsPost -IntegrationLogsRequest $IntegrationLogsRequest
} catch {
    Write-Host ("Exception occurred when calling ConvertTo-tegrationsLogsPost: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **IntegrationLogsRequest** | [**IntegrationLogsRequest**](IntegrationLogsRequest.md)| Ingest log information from external integration application. | 

### Return type

[**IntegrationLogsSuccessResponse**](IntegrationLogsSuccessResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="ConvertTo-tegrationsGetById"></a>
# **ConvertTo-tegrationsGetById**
> IntegrationRecord ConvertTo-tegrationsGetById<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <String><br>

Get integration metadata

Get integration metadata by ID. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Id = "MyId" # String | Integration ID.

# Get integration metadata
try {
    $Result = ConvertTo-tegrationsGetById -Id $Id
} catch {
    Write-Host ("Exception occurred when calling ConvertTo-tegrationsGetById: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **String**| Integration ID. | 

### Return type

[**IntegrationRecord**](IntegrationRecord.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="ConvertTo-tegrationsGetList"></a>
# **ConvertTo-tegrationsGetList**
> IntegrationsGetList200Response ConvertTo-tegrationsGetList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

Get integration metadata list

Get integration metadata list. Note: If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

# Get integration metadata list
try {
    $Result = ConvertTo-tegrationsGetList -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling ConvertTo-tegrationsGetList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**IntegrationsGetList200Response**](IntegrationsGetList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

