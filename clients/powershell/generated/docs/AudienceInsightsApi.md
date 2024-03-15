# PSOpenAPITools.PSOpenAPITools\Api.AudienceInsightsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AudienceInsightsScopeAndTypeGet**](AudienceInsightsApi.md#Invoke-AudienceInsightsScopeAndTypeGet) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type
[**Invoke-AudienceInsightsGet**](AudienceInsightsApi.md#Invoke-AudienceInsightsGet) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights


<a id="Invoke-AudienceInsightsScopeAndTypeGet"></a>
# **Invoke-AudienceInsightsScopeAndTypeGet**
> AudienceDefinitionResponse Invoke-AudienceInsightsScopeAndTypeGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.

# Get audience insights scope and type
try {
    $Result = Invoke-AudienceInsightsScopeAndTypeGet -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-AudienceInsightsScopeAndTypeGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 

### Return type

[**AudienceDefinitionResponse**](AudienceDefinitionResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AudienceInsightsGet"></a>
# **Invoke-AudienceInsightsGet**
> AudienceInsightsResponse Invoke-AudienceInsightsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AudienceInsightType] <PSCustomObject><br>

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=""https://help.pinterest.com/en/business/article/audience-insights"" target=""_blank"">Learn more about Audience Insights</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AudienceInsightType = "YOUR_TOTAL_AUDIENCE" # AudienceInsightType | Type of audience insights.

# Get audience insights
try {
    $Result = Invoke-AudienceInsightsGet -AdAccountId $AdAccountId -AudienceInsightType $AudienceInsightType
} catch {
    Write-Host ("Exception occurred when calling Invoke-AudienceInsightsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AudienceInsightType** | [**AudienceInsightType**](AudienceInsightType.md)| Type of audience insights. | 

### Return type

[**AudienceInsightsResponse**](AudienceInsightsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

