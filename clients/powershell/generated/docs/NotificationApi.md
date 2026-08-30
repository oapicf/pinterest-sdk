# PSOpenAPITools.PSOpenAPITools\Api.NotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-NotificationPost**](NotificationApi.md#Invoke-NotificationPost) | **POST** /notifications | Receive notifications from external partners.


<a id="Invoke-NotificationPost"></a>
# **Invoke-NotificationPost**
> NotificationResponse Invoke-NotificationPost<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-NotificationPostRequest] <PSCustomObject><br>

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$NotificationPostRequest = Initialize-NotificationPostRequest # NotificationPostRequest | 

# Receive notifications from external partners.
try {
    $Result = Invoke-NotificationPost -NotificationPostRequest $NotificationPostRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-NotificationPost: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **NotificationPostRequest** | [**NotificationPostRequest**](NotificationPostRequest.md)|  | 

### Return type

[**NotificationResponse**](NotificationResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

