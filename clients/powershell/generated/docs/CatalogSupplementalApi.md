# PSOpenAPITools.PSOpenAPITools\Api.CatalogSupplementalApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get-alogsLocalInventoryItemsBatchOperate**](CatalogSupplementalApi.md#Get-alogsLocalInventoryItemsBatchOperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**Get-alogsLocalInventoryItemsPost**](CatalogSupplementalApi.md#Get-alogsLocalInventoryItemsPost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**Get-alogsLocalStoresCreate**](CatalogSupplementalApi.md#Get-alogsLocalStoresCreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
[**Get-alogsLocalStoresDelete**](CatalogSupplementalApi.md#Get-alogsLocalStoresDelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
[**Get-alogsLocalStoresList**](CatalogSupplementalApi.md#Get-alogsLocalStoresList) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
[**Get-alogsLocalStoresUpdate**](CatalogSupplementalApi.md#Get-alogsLocalStoresUpdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
[**Get-alogsSupplementalItemsBatchGet**](CatalogSupplementalApi.md#Get-alogsSupplementalItemsBatchGet) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status


<a id="Get-alogsLocalInventoryItemsBatchOperate"></a>
# **Get-alogsLocalInventoryItemsBatchOperate**
> SupplementalItemsBatchResponse Get-alogsLocalInventoryItemsBatchOperate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LocalInventoryItemsBatchCreate] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogId = "MyCatalogId" # String | Unique identifier of a catalog.
$RetailLocalInventoryItemAttributes = Initialize-RetailLocalInventoryItemAttributes -AdLink "https://examplelink.com" -Availability "in stock" -Price "49.99 USD" -SalePrice "24.99 USD"
$LocalInventoryOperation = Initialize-LocalInventoryOperation -Attributes $RetailLocalInventoryItemAttributes -ItemId "item_id_1" -Operation "DELETE" -StoreCode "store_1"

$LocalInventoryItemsBatchCreate = Initialize-LocalInventoryItemsBatchCreate -Operations $LocalInventoryOperation # LocalInventoryItemsBatchCreate | 
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Operate on local inventory item batch
try {
    $Result = Get-alogsLocalInventoryItemsBatchOperate -CatalogId $CatalogId -LocalInventoryItemsBatchCreate $LocalInventoryItemsBatchCreate -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsLocalInventoryItemsBatchOperate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogId** | **String**| Unique identifier of a catalog. | 
 **LocalInventoryItemsBatchCreate** | [**LocalInventoryItemsBatchCreate**](LocalInventoryItemsBatchCreate.md)|  | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsLocalInventoryItemsPost"></a>
# **Get-alogsLocalInventoryItemsPost**
> LocalInventoryItemsGet Get-alogsLocalInventoryItemsPost<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LocalInventoryItemsGetCreate] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get local inventory items (POST)

Get local inventory items for a catalog owned by the ""operation user_account"".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogId = "MyCatalogId" # String | Unique identifier of a catalog.
$ItemIdStoreCodePair = Initialize-ItemIdStoreCodePair -ItemId "item_id_1" -StoreCode "store_1"
$LocalInventoryItemsGetCreate = Initialize-LocalInventoryItemsGetCreate -ItemFilters $ItemIdStoreCodePair # LocalInventoryItemsGetCreate | 
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get local inventory items (POST)
try {
    $Result = Get-alogsLocalInventoryItemsPost -CatalogId $CatalogId -LocalInventoryItemsGetCreate $LocalInventoryItemsGetCreate -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsLocalInventoryItemsPost: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogId** | **String**| Unique identifier of a catalog. | 
 **LocalInventoryItemsGetCreate** | [**LocalInventoryItemsGetCreate**](LocalInventoryItemsGetCreate.md)|  | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**LocalInventoryItemsGet**](LocalInventoryItemsGet.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsLocalStoresCreate"></a>
# **Get-alogsLocalStoresCreate**
> CatalogsLocalStoresCreate200ResponseInner[] Get-alogsLocalStoresCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LocalStoreCreate] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Create local stores

Create a local store for a catalog owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogId = "MyCatalogId" # String | Unique identifier of a catalog.
$LocalStoreCreate = Initialize-LocalStoreCreate -AddressPrimary "123 Johnson St" -AddressSecondary "Suite 100" -City "Sunnyvale" -Country "AD" -Latitude -30.21 -Longitude 50.45 -Name "Sunnyvale Store" -PostalCode "94043" -Region "CA" -StoreCode "store_1" # LocalStoreCreate[] | 
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Create local stores
try {
    $Result = Get-alogsLocalStoresCreate -CatalogId $CatalogId -LocalStoreCreate $LocalStoreCreate -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsLocalStoresCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogId** | **String**| Unique identifier of a catalog. | 
 **LocalStoreCreate** | [**LocalStoreCreate[]**](LocalStoreCreate.md)|  | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsLocalStoresCreate200ResponseInner[]**](CatalogsLocalStoresCreate200ResponseInner.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsLocalStoresDelete"></a>
# **Get-alogsLocalStoresDelete**
> CatalogsLocalStoresDelete200ResponseInner[] Get-alogsLocalStoresDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Ids] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Delete local stores

  Delete multiple local stores for a catalog owned by the ""operation user_account"".   - By default, the ""operation user_account"" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogId = "MyCatalogId" # String | Unique identifier of a catalog.
$Ids = "MyIds" # String[] | List of local store IDs to filter by.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Delete local stores
try {
    $Result = Get-alogsLocalStoresDelete -CatalogId $CatalogId -Ids $Ids -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsLocalStoresDelete: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogId** | **String**| Unique identifier of a catalog. | 
 **Ids** | [**String[]**](String.md)| List of local store IDs to filter by. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsLocalStoresDelete200ResponseInner[]**](CatalogsLocalStoresDelete200ResponseInner.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsLocalStoresList"></a>
# **Get-alogsLocalStoresList**
> CatalogsLocalStoresList200Response Get-alogsLocalStoresList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Ids] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List local stores

Fetch local stores for a catalog owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogId = "MyCatalogId" # String | Unique identifier of a catalog.
$Ids = "MyIds" # String[] | List of local store IDs to filter by. (optional)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# List local stores
try {
    $Result = Get-alogsLocalStoresList -CatalogId $CatalogId -Ids $Ids -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Get-alogsLocalStoresList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogId** | **String**| Unique identifier of a catalog. | 
 **Ids** | [**String[]**](String.md)| List of local store IDs to filter by. | [optional] 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsLocalStoresList200Response**](CatalogsLocalStoresList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsLocalStoresUpdate"></a>
# **Get-alogsLocalStoresUpdate**
> CatalogsLocalStoresCreate200ResponseInner[] Get-alogsLocalStoresUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-LocalStoreBatchUpdate] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Update local stores

  Update a local store for a catalog owned by the ""operation user_account"".   - By default, the ""operation user_account"" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogId = "MyCatalogId" # String | Unique identifier of a catalog.
$LocalStoreBatchUpdate = Initialize-LocalStoreBatchUpdate -AddressPrimary "123 Johnson St" -AddressSecondary "Suite 100" -City "Sunnyvale" -Country "AD" -Id "1234567890" -Latitude -30.21 -Longitude 50.45 -Name "Sunnyvale Store" -PostalCode "94043" -Region "CA" -StoreCode "store_1" # LocalStoreBatchUpdate[] | 
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Update local stores
try {
    $Result = Get-alogsLocalStoresUpdate -CatalogId $CatalogId -LocalStoreBatchUpdate $LocalStoreBatchUpdate -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsLocalStoresUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogId** | **String**| Unique identifier of a catalog. | 
 **LocalStoreBatchUpdate** | [**LocalStoreBatchUpdate[]**](LocalStoreBatchUpdate.md)|  | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsLocalStoresCreate200ResponseInner[]**](CatalogsLocalStoresCreate200ResponseInner.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsSupplementalItemsBatchGet"></a>
# **Get-alogsSupplementalItemsBatchGet**
> SupplementalItemsBatchResponse Get-alogsSupplementalItemsBatchGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BatchId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogId = "MyCatalogId" # String | Unique identifier of a catalog.
$BatchId = "MyBatchId" # String | Unique identifier of an items batch operation.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get supplemental items batch status
try {
    $Result = Get-alogsSupplementalItemsBatchGet -CatalogId $CatalogId -BatchId $BatchId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsSupplementalItemsBatchGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogId** | **String**| Unique identifier of a catalog. | 
 **BatchId** | **String**| Unique identifier of an items batch operation. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

