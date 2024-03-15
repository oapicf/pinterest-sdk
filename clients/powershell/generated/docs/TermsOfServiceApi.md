# PSOpenAPITools.PSOpenAPITools\Api.TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-TermsOfServiceGet**](TermsOfServiceApi.md#Invoke-TermsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service


<a id="Invoke-TermsOfServiceGet"></a>
# **Invoke-TermsOfServiceGet**
> TermsOfService Invoke-TermsOfServiceGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IncludeHtml] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-TosType] <String><br>

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$IncludeHtml = $true # Boolean | Return HTML in TOS text. (optional) (default to $false)
$TosType = "MyTosType" # String | Request type. (optional)

# Get terms of service
try {
    $Result = Invoke-TermsOfServiceGet -AdAccountId $AdAccountId -IncludeHtml $IncludeHtml -TosType $TosType
} catch {
    Write-Host ("Exception occurred when calling Invoke-TermsOfServiceGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **IncludeHtml** | **Boolean**| Return HTML in TOS text. | [optional] [default to $false]
 **TosType** | **String**| Request type. | [optional] 

### Return type

[**TermsOfService**](TermsOfService.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

