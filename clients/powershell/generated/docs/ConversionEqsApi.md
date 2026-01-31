# PSOpenAPITools.PSOpenAPITools\Api.ConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-ConversionEqsList**](ConversionEqsApi.md#Invoke-ConversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)


<a id="Invoke-ConversionEqsList"></a>
# **Invoke-ConversionEqsList**
> EventQualityScore[] Invoke-ConversionEqsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LookbackPeriod] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SourcePlatform] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IngestionSource] <PSCustomObject><br>

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$LookbackPeriod = "1d" # LookbackPeriodOptions | Lookback window (number of days).
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$SourcePlatform = "WEB" # SourcePlatformOptions | Source platform of event. (optional)
$IngestionSource = "TAG" # IngestionSourceOptions | Ingestion source of event. (optional)

# Get event quality score (EQS)
try {
    $Result = Invoke-ConversionEqsList -LookbackPeriod $LookbackPeriod -AdAccountId $AdAccountId -SourcePlatform $SourcePlatform -IngestionSource $IngestionSource
} catch {
    Write-Host ("Exception occurred when calling Invoke-ConversionEqsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **LookbackPeriod** | [**LookbackPeriodOptions**](LookbackPeriodOptions.md)| Lookback window (number of days). | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **SourcePlatform** | [**SourcePlatformOptions**](SourcePlatformOptions.md)| Source platform of event. | [optional] 
 **IngestionSource** | [**IngestionSourceOptions**](IngestionSourceOptions.md)| Ingestion source of event. | [optional] 

### Return type

[**EventQualityScore[]**](EventQualityScore.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

