# PSOpenAPITools.PSOpenAPITools\Api.CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get-alogsAvailableFilterValues**](CatalogsApi.md#Get-alogsAvailableFilterValues) | **GET** /catalogs/available_filter_values | List available filter values
[**Get-alogsCreate**](CatalogsApi.md#Get-alogsCreate) | **POST** /catalogs | Create catalog
[**Get-alogsList**](CatalogsApi.md#Get-alogsList) | **GET** /catalogs | List catalogs


<a id="Get-alogsAvailableFilterValues"></a>
# **Get-alogsAvailableFilterValues**
> CatalogsAvailableFilterValues Get-alogsAvailableFilterValues<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FeedId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Country] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Language] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

List available filter values

Get the available filter attributes and values associated with a given feed or catalog owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account. - `country`, `language`, and `feed_id` are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogId = "MyCatalogId" # String | Filter entities for a given catalog_id.
$FeedId = "MyFeedId" # String | Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
$Country = "AD" # Country | Country for the Catalogs Items (optional)
$Language = "af-ZA" # CatalogsLocale | Language for the Catalogs Items (optional)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# List available filter values
try {
    $Result = Get-alogsAvailableFilterValues -CatalogId $CatalogId -FeedId $FeedId -Country $Country -Language $Language -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsAvailableFilterValues: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogId** | **String**| Filter entities for a given catalog_id. | 
 **FeedId** | **String**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **Country** | [**Country**](Country.md)| Country for the Catalogs Items | [optional] 
 **Language** | [**CatalogsLocale**](CatalogsLocale.md)| Language for the Catalogs Items | [optional] 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsAvailableFilterValues**](CatalogsAvailableFilterValues.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsCreate"></a>
# **Get-alogsCreate**
> Catalog Get-alogsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogCreate] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Create catalog

Create a new catalog owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogCreate = Initialize-CatalogCreate -CatalogType "RETAIL" -Name "MyName" # CatalogCreate | 
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Create catalog
try {
    $Result = Get-alogsCreate -CatalogCreate $CatalogCreate -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogCreate** | [**CatalogCreate**](CatalogCreate.md)|  | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**Catalog**](Catalog.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsList"></a>
# **Get-alogsList**
> CatalogsList200Response Get-alogsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List catalogs

Fetch catalogs owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# List catalogs
try {
    $Result = Get-alogsList -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Get-alogsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsList200Response**](CatalogsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

