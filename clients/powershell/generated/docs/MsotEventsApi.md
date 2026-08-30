# PSOpenAPITools.PSOpenAPITools\Api.MsotEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-MsotEventsCreate**](MsotEventsApi.md#Invoke-MsotEventsCreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events


<a id="Invoke-MsotEventsCreate"></a>
# **Invoke-MsotEventsCreate**
> void Invoke-MsotEventsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ConversionMSOTEventsCreate] <PSCustomObject><br>

Send Measurement Source Of Truth (MSOT) attributed conversion events

**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$ConversionMSOTEventsCreate = Initialize-ConversionMSOTEventsCreate -ActionTimestamps 0 -AdGroupId "2680060704746" -AttributionModel "first_touch" -AttributionScope "view" -AttributionScore 0.5 -CampaignId "626736533506" -ClickWindow "MyClickWindow" -Currency "UNK" -EventId "eventId0001" -EventName "add_to_cart" -EventTimestamp 1451431341 -TotalEventTouchpoints 2 -TotalEvents 2 -TotalEventsFractional 0 -Value 123.45 -ViewWindow "MyViewWindow" # ConversionMSOTEventsCreate | 

# Send Measurement Source Of Truth (MSOT) attributed conversion events
try {
    $Result = Invoke-MsotEventsCreate -AdAccountId $AdAccountId -ConversionMSOTEventsCreate $ConversionMSOTEventsCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-MsotEventsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **ConversionMSOTEventsCreate** | [**ConversionMSOTEventsCreate**](ConversionMSOTEventsCreate.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

