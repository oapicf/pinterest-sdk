# PSOpenAPITools.PSOpenAPITools\Api.LeadsExportApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-LeadsExportCreate**](LeadsExportApi.md#Invoke-LeadsExportCreate) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad
[**Invoke-LeadsExportGet**](LeadsExportApi.md#Invoke-LeadsExportGet) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call


<a id="Invoke-LeadsExportCreate"></a>
# **Invoke-LeadsExportCreate**
> LeadsExportCreateResponse Invoke-LeadsExportCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LeadsExportCreateRequest] <PSCustomObject><br>

Create a request to export leads collected from a lead ad

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=""reference external"" href=""https://help.pinterest.com/en/business/article/lead-ads"">Lead ads</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LeadsExportCreateRequest = Initialize-LeadsExportCreateRequest -StartDate "2020-12-20" -EndDate "2020-12-20" -AdId "687201361754" # LeadsExportCreateRequest | 

# Create a request to export leads collected from a lead ad
try {
    $Result = Invoke-LeadsExportCreate -AdAccountId $AdAccountId -LeadsExportCreateRequest $LeadsExportCreateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-LeadsExportCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **LeadsExportCreateRequest** | [**LeadsExportCreateRequest**](LeadsExportCreateRequest.md)|  | 

### Return type

[**LeadsExportCreateResponse**](LeadsExportCreateResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-LeadsExportGet"></a>
# **Invoke-LeadsExportGet**
> LeadsExportResponseData Invoke-LeadsExportGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LeadsExportId] <String><br>

Get the lead export from the lead export create call

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=""reference external"" href=""https://help.pinterest.com/en/business/article/lead-ads"">Lead ads</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$LeadsExportId = "123755885175" # String | lead_export_id token returned from the create a lead export endpoint

# Get the lead export from the lead export create call
try {
    $Result = Invoke-LeadsExportGet -AdAccountId $AdAccountId -LeadsExportId $LeadsExportId
} catch {
    Write-Host ("Exception occurred when calling Invoke-LeadsExportGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **LeadsExportId** | **String**| lead_export_id token returned from the create a lead export endpoint | 

### Return type

[**LeadsExportResponseData**](LeadsExportResponseData.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

