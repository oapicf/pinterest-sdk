# PSOpenAPITools.PSOpenAPITools\Api.CatalogItemsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-ItemsBatchGet**](CatalogItemsApi.md#Invoke-ItemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
[**Invoke-ItemsBatchPost**](CatalogItemsApi.md#Invoke-ItemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
[**Invoke-ItemsPost**](CatalogItemsApi.md#Invoke-ItemsPost) | **POST** /catalogs/items | Get catalogs items (POST)


<a id="Invoke-ItemsBatchGet"></a>
# **Invoke-ItemsBatchGet**
> CatalogsItemsBatch Invoke-ItemsBatchGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BatchId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get item batch status

Get a single catalogs items batch owned by the ""operating user_account"". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BatchId = "MyBatchId" # String | Id of a catalogs items batch to fetch
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get item batch status
try {
    $Result = Invoke-ItemsBatchGet -BatchId $BatchId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-ItemsBatchGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BatchId** | **String**| Id of a catalogs items batch to fetch | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ItemsBatchPost"></a>
# **Invoke-ItemsBatchPost**
> CatalogsItemsBatch Invoke-ItemsBatchPost<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogsItemsBatchPostRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the ""operation user_account"". [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ItemDeleteBatchRecord = Initialize-ItemDeleteBatchRecord -ItemId "DS0294-M"
$CatalogsItemsBatchPostRequest = Initialize-CatalogsItemsBatchPostRequest -CatalogId "2680059592705" -CatalogType "CREATIVE_ASSETS" -Country "AD" -Items $ItemDeleteBatchRecord -Language "af-ZA" -Operation "DELETE" # CatalogsItemsBatchPostRequest | 
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Operate on item batch
try {
    $Result = Invoke-ItemsBatchPost -CatalogsItemsBatchPostRequest $CatalogsItemsBatchPostRequest -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-ItemsBatchPost: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogsItemsBatchPostRequest** | [**CatalogsItemsBatchPostRequest**](CatalogsItemsBatchPostRequest.md)|  | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ItemsPost"></a>
# **Invoke-ItemsPost**
> ItemsPost200Response Invoke-ItemsPost<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogsItemsRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get catalogs items (POST)

Get the items of the catalog owned by the ""operation user_account"". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogsItemsPostFilters = Initialize-CatalogsItemsPostFilters -CatalogId "MyCatalogId" -CatalogType "CREATIVE_ASSETS" -ItemIds "MyItemIds" -HotelIds "MyHotelIds" -CreativeAssetsIds "MyCreativeAssetsIds"
"af-ZA"
$CatalogsItemsRequest = Initialize-CatalogsItemsRequest -Country "AD" -Filters $CatalogsItemsPostFilters -Language $String # CatalogsItemsRequest | 
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get catalogs items (POST)
try {
    $Result = Invoke-ItemsPost -CatalogsItemsRequest $CatalogsItemsRequest -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-ItemsPost: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogsItemsRequest** | [**CatalogsItemsRequest**](CatalogsItemsRequest.md)|  | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**ItemsPost200Response**](ItemsPost200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

