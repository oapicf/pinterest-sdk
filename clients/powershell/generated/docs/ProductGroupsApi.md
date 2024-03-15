# PSOpenAPITools.PSOpenAPITools\Api.ProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AdAccountsCatalogsProductGroupsList**](ProductGroupsApi.md#Invoke-AdAccountsCatalogsProductGroupsList) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups


<a id="Invoke-AdAccountsCatalogsProductGroupsList"></a>
# **Invoke-AdAccountsCatalogsProductGroupsList**
> AdAccountsCatalogsProductGroupsList200Response Invoke-AdAccountsCatalogsProductGroupsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FeedProfileId] <String><br>

Get catalog product groups

This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$FeedProfileId = "MyFeedProfileId" # String | The feed profile id whose catalog product groups we want to return. (optional)

# Get catalog product groups
try {
    $Result = Invoke-AdAccountsCatalogsProductGroupsList -AdAccountId $AdAccountId -FeedProfileId $FeedProfileId
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdAccountsCatalogsProductGroupsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **FeedProfileId** | **String**| The feed profile id whose catalog product groups we want to return. | [optional] 

### Return type

[**AdAccountsCatalogsProductGroupsList200Response**](AdAccountsCatalogsProductGroupsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

