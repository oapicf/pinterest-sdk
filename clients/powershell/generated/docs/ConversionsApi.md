# PSOpenAPITools.PSOpenAPITools\Api.ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AdvertiserDefinedEventsCreate**](ConversionsApi.md#Invoke-AdvertiserDefinedEventsCreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**Invoke-AdvertiserDefinedEventsDelete**](ConversionsApi.md#Invoke-AdvertiserDefinedEventsDelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**Invoke-AdvertiserDefinedEventsGet**](ConversionsApi.md#Invoke-AdvertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**Invoke-AdvertiserDefinedEventsUpdate**](ConversionsApi.md#Invoke-AdvertiserDefinedEventsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events


<a id="Invoke-AdvertiserDefinedEventsCreate"></a>
# **Invoke-AdvertiserDefinedEventsCreate**
> AdvertiserDefinedEventsCreate200Response Invoke-AdvertiserDefinedEventsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdvertiserDefinedEventsCreateRequest] <PSCustomObject><br>

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdvertiserDefinedEventInput = Initialize-AdvertiserDefinedEventInput -MappedConversionType "SIGNUP" -Name "newsletter_signup"
$AdvertiserDefinedEventsCreateRequest = Initialize-AdvertiserDefinedEventsCreateRequest -Items $AdvertiserDefinedEventInput # AdvertiserDefinedEventsCreateRequest | 

# Create advertiser defined events
try {
    $Result = Invoke-AdvertiserDefinedEventsCreate -AdAccountId $AdAccountId -AdvertiserDefinedEventsCreateRequest $AdvertiserDefinedEventsCreateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdvertiserDefinedEventsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdvertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdvertiserDefinedEventsDelete"></a>
# **Invoke-AdvertiserDefinedEventsDelete**
> AdvertiserDefinedEventsCreate200Response Invoke-AdvertiserDefinedEventsDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-EventNames] <String[]><br>

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$EventNames = "MyEventNames" # String[] | List of event names to delete

# Delete advertiser defined events
try {
    $Result = Invoke-AdvertiserDefinedEventsDelete -AdAccountId $AdAccountId -EventNames $EventNames
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdvertiserDefinedEventsDelete: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **EventNames** | [**String[]**](String.md)| List of event names to delete | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdvertiserDefinedEventsGet"></a>
# **Invoke-AdvertiserDefinedEventsGet**
> AdvertiserDefinedEventsGet200Response Invoke-AdvertiserDefinedEventsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get advertiser defined events

Get advertiser defined events for the given ad account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.

# Get advertiser defined events
try {
    $Result = Invoke-AdvertiserDefinedEventsGet -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdvertiserDefinedEventsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 

### Return type

[**AdvertiserDefinedEventsGet200Response**](AdvertiserDefinedEventsGet200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AdvertiserDefinedEventsUpdate"></a>
# **Invoke-AdvertiserDefinedEventsUpdate**
> AdvertiserDefinedEventsCreate200Response Invoke-AdvertiserDefinedEventsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdvertiserDefinedEventsCreateRequest] <PSCustomObject><br>

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdvertiserDefinedEventInput = Initialize-AdvertiserDefinedEventInput -MappedConversionType "SIGNUP" -Name "newsletter_signup"
$AdvertiserDefinedEventsCreateRequest = Initialize-AdvertiserDefinedEventsCreateRequest -Items $AdvertiserDefinedEventInput # AdvertiserDefinedEventsCreateRequest | 

# Update advertiser defined events
try {
    $Result = Invoke-AdvertiserDefinedEventsUpdate -AdAccountId $AdAccountId -AdvertiserDefinedEventsCreateRequest $AdvertiserDefinedEventsCreateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdvertiserDefinedEventsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdvertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  | 

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

