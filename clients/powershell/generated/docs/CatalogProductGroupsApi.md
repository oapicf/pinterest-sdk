# PSOpenAPITools.PSOpenAPITools\Api.CatalogProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get-alogsProductGroupPinsList**](CatalogProductGroupsApi.md#Get-alogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**Get-alogsProductGroupsCreate**](CatalogProductGroupsApi.md#Get-alogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**Get-alogsProductGroupsCreateMany**](CatalogProductGroupsApi.md#Get-alogsProductGroupsCreateMany) | **POST** /catalogs/product_groups/multiple | Create product groups
[**Get-alogsProductGroupsDelete**](CatalogProductGroupsApi.md#Get-alogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**Get-alogsProductGroupsDeleteMany**](CatalogProductGroupsApi.md#Get-alogsProductGroupsDeleteMany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
[**Get-alogsProductGroupsGet**](CatalogProductGroupsApi.md#Get-alogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**Get-alogsProductGroupsList**](CatalogProductGroupsApi.md#Get-alogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
[**Get-alogsProductGroupsProductCountsGet**](CatalogProductGroupsApi.md#Get-alogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**Get-alogsProductGroupsUpdate**](CatalogProductGroupsApi.md#Get-alogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
[**Invoke-ProductsByProductGroupFilterList**](CatalogProductGroupsApi.md#Invoke-ProductsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter


<a id="Get-alogsProductGroupPinsList"></a>
# **Get-alogsProductGroupPinsList**
> CatalogsProductGroupPinsList200Response Get-alogsProductGroupPinsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductGroupId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinMetrics] <System.Nullable[Boolean]><br>

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ProductGroupId = "MyProductGroupId" # String | Unique identifier of a product group
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$PinMetrics = $true # Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to $false)

# List products by product group
try {
    $Result = Get-alogsProductGroupPinsList -ProductGroupId $ProductGroupId -Bookmark $Bookmark -PageSize $PageSize -AdAccountId $AdAccountId -PinMetrics $PinMetrics
} catch {
    Write-Host ("Exception occurred when calling Get-alogsProductGroupPinsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProductGroupId** | **String**| Unique identifier of a product group | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **PinMetrics** | **Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to $false]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsProductGroupsCreate"></a>
# **Get-alogsProductGroupsCreate**
> CatalogsVerticalProductGroup Get-alogsProductGroupsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MultipleProductGroupsInner] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Create product group

Create product group to use in Catalogs owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. ""Catalog-based product groups"" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the ""retail feed-based"" option. <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogsCreativeAssetsProductGroupFilterKeys = Initialize-CatalogsCreativeAssetsProductGroupFilterKeys -CREATIVEASSETSID  -CUSTOMLABEL0  -CUSTOMLABEL1  -CUSTOMLABEL2  -CUSTOMLABEL3  -CUSTOMLABEL4  -GOOGLEPRODUCTCATEGORY6  -GOOGLEPRODUCTCATEGORY5  -GOOGLEPRODUCTCATEGORY4  -GOOGLEPRODUCTCATEGORY3  -GOOGLEPRODUCTCATEGORY2  -GOOGLEPRODUCTCATEGORY1  -GOOGLEPRODUCTCATEGORY0  -MEDIATYPE  -TITLEKEYWORDS 
$CatalogsCreativeAssetsProductGroupFilters = Initialize-CatalogsCreativeAssetsProductGroupFilters -AnyOf $CatalogsCreativeAssetsProductGroupFilterKeys -AllOf $CatalogsCreativeAssetsProductGroupFilterKeys

$MultipleProductGroupsInner = Initialize-MultipleProductGroupsInner -Description "MyDescription" -FeedId "2680059592705" -Filters $CatalogsCreativeAssetsProductGroupFilters -IsFeatured $false -Name "MyName" -CatalogId "2680059592705" -CatalogType "CREATIVE_ASSETS" -Country "AD" -Locale "af-ZA" # MultipleProductGroupsInner | Request object used to create a single catalogs product groups.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Create product group
try {
    $Result = Get-alogsProductGroupsCreate -MultipleProductGroupsInner $MultipleProductGroupsInner -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsProductGroupsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **MultipleProductGroupsInner** | [**MultipleProductGroupsInner**](MultipleProductGroupsInner.md)| Request object used to create a single catalogs product groups. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsProductGroupsCreateMany"></a>
# **Get-alogsProductGroupsCreateMany**
> String[] Get-alogsProductGroupsCreateMany<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MultipleProductGroupsInner] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Create product groups

Create product group to use in Catalogs owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogsCreativeAssetsProductGroupFilterKeys = Initialize-CatalogsCreativeAssetsProductGroupFilterKeys -CREATIVEASSETSID  -CUSTOMLABEL0  -CUSTOMLABEL1  -CUSTOMLABEL2  -CUSTOMLABEL3  -CUSTOMLABEL4  -GOOGLEPRODUCTCATEGORY6  -GOOGLEPRODUCTCATEGORY5  -GOOGLEPRODUCTCATEGORY4  -GOOGLEPRODUCTCATEGORY3  -GOOGLEPRODUCTCATEGORY2  -GOOGLEPRODUCTCATEGORY1  -GOOGLEPRODUCTCATEGORY0  -MEDIATYPE  -TITLEKEYWORDS 
$CatalogsCreativeAssetsProductGroupFilters = Initialize-CatalogsCreativeAssetsProductGroupFilters -AnyOf $CatalogsCreativeAssetsProductGroupFilterKeys -AllOf $CatalogsCreativeAssetsProductGroupFilterKeys

$MultipleProductGroupsInner = Initialize-MultipleProductGroupsInner -Description "MyDescription" -FeedId "2680059592705" -Filters $CatalogsCreativeAssetsProductGroupFilters -IsFeatured $false -Name "MyName" -CatalogId "2680059592705" -CatalogType "CREATIVE_ASSETS" -Country "AD" -Locale "af-ZA" # MultipleProductGroupsInner[] | Request object used to create one or more catalogs product groups.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Create product groups
try {
    $Result = Get-alogsProductGroupsCreateMany -MultipleProductGroupsInner $MultipleProductGroupsInner -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsProductGroupsCreateMany: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **MultipleProductGroupsInner** | [**MultipleProductGroupsInner[]**](MultipleProductGroupsInner.md)| Request object used to create one or more catalogs product groups. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

**String[]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsProductGroupsDelete"></a>
# **Get-alogsProductGroupsDelete**
> void Get-alogsProductGroupsDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductGroupId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Delete product group

Delete a product group owned by the ""operation user_account"" from being in use in Catalogs. - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ProductGroupId = "MyProductGroupId" # String | Unique identifier of a product group
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Delete product group
try {
    $Result = Get-alogsProductGroupsDelete -ProductGroupId $ProductGroupId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsProductGroupsDelete: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProductGroupId** | **String**| Unique identifier of a product group | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsProductGroupsDeleteMany"></a>
# **Get-alogsProductGroupsDeleteMany**
> void Get-alogsProductGroupsDeleteMany<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <System.Nullable[Int32][]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Delete product groups

Delete product groups owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Id = 0 # Int32[] | Comma-separated list of product group ids
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Delete product groups
try {
    $Result = Get-alogsProductGroupsDeleteMany -Id $Id -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsProductGroupsDeleteMany: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | [**Int32[]**](Int32.md)| Comma-separated list of product group ids | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsProductGroupsGet"></a>
# **Get-alogsProductGroupsGet**
> CatalogsVerticalProductGroup Get-alogsProductGroupsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductGroupId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ProductGroupId = "MyProductGroupId" # String | Unique identifier of a product group
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get product group
try {
    $Result = Get-alogsProductGroupsGet -ProductGroupId $ProductGroupId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsProductGroupsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProductGroupId** | **String**| Unique identifier of a product group | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsProductGroupsList"></a>
# **Get-alogsProductGroupsList**
> CatalogsProductGroupsList200Response Get-alogsProductGroupsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <System.Nullable[Int32][]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FeedId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Id = 0 # Int32[] | Comma-separated list of product group ids (optional)
$FeedId = "MyFeedId" # String | Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
$CatalogId = "MyCatalogId" # String | Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# List product groups
try {
    $Result = Get-alogsProductGroupsList -Id $Id -FeedId $FeedId -CatalogId $CatalogId -Bookmark $Bookmark -PageSize $PageSize -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsProductGroupsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | [**Int32[]**](Int32.md)| Comma-separated list of product group ids | [optional] 
 **FeedId** | **String**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **CatalogId** | **String**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupsList200Response**](CatalogsProductGroupsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsProductGroupsProductCountsGet"></a>
# **Get-alogsProductGroupsProductCountsGet**
> CatalogsProductGroupProductCountsVertical Get-alogsProductGroupsProductCountsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductGroupId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get product counts

Get a product counts for a given Catalogs Product Group owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ProductGroupId = "MyProductGroupId" # String | Unique identifier of a product group
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get product counts
try {
    $Result = Get-alogsProductGroupsProductCountsGet -ProductGroupId $ProductGroupId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsProductGroupsProductCountsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProductGroupId** | **String**| Unique identifier of a product group | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupProductCountsVertical**](CatalogsProductGroupProductCountsVertical.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsProductGroupsUpdate"></a>
# **Get-alogsProductGroupsUpdate**
> CatalogsVerticalProductGroup Get-alogsProductGroupsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductGroupId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogsProductGroupsUpdateRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Update single product group

Update product group owned by the ""operation user_account"" to use in Catalogs. - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager. ""Catalog-based product groups"" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the ""retail feed-based"" option. <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ProductGroupId = "MyProductGroupId" # String | Unique identifier of a product group
$CatalogsCreativeAssetsProductGroupFilterKeys = Initialize-CatalogsCreativeAssetsProductGroupFilterKeys -CREATIVEASSETSID  -CUSTOMLABEL0  -CUSTOMLABEL1  -CUSTOMLABEL2  -CUSTOMLABEL3  -CUSTOMLABEL4  -GOOGLEPRODUCTCATEGORY6  -GOOGLEPRODUCTCATEGORY5  -GOOGLEPRODUCTCATEGORY4  -GOOGLEPRODUCTCATEGORY3  -GOOGLEPRODUCTCATEGORY2  -GOOGLEPRODUCTCATEGORY1  -GOOGLEPRODUCTCATEGORY0  -MEDIATYPE  -TITLEKEYWORDS 
$CatalogsCreativeAssetsProductGroupFilters = Initialize-CatalogsCreativeAssetsProductGroupFilters -AnyOf $CatalogsCreativeAssetsProductGroupFilterKeys -AllOf $CatalogsCreativeAssetsProductGroupFilterKeys

$CatalogsProductGroupsUpdateRequest = Initialize-CatalogsProductGroupsUpdateRequest -Description "MyDescription" -Filters $CatalogsCreativeAssetsProductGroupFilters -IsFeatured $false -Name "MyName" -CatalogType "CREATIVE_ASSETS" -Country "AD" -Locale "af-ZA" # CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Update single product group
try {
    $Result = Get-alogsProductGroupsUpdate -ProductGroupId $ProductGroupId -CatalogsProductGroupsUpdateRequest $CatalogsProductGroupsUpdateRequest -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsProductGroupsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProductGroupId** | **String**| Unique identifier of a product group | 
 **CatalogsProductGroupsUpdateRequest** | [**CatalogsProductGroupsUpdateRequest**](CatalogsProductGroupsUpdateRequest.md)| Request object used to Update a catalogs product group. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ProductsByProductGroupFilterList"></a>
# **Invoke-ProductsByProductGroupFilterList**
> CatalogsProductGroupPinsList200Response Invoke-ProductsByProductGroupFilterList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogsListProductsByFilterRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PinMetrics] <System.Nullable[Boolean]><br>

List products by filter

List products Pins owned by the ""operation user_account"" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogsCreativeAssetsProductGroupFilterKeys = Initialize-CatalogsCreativeAssetsProductGroupFilterKeys -CREATIVEASSETSID  -CUSTOMLABEL0  -CUSTOMLABEL1  -CUSTOMLABEL2  -CUSTOMLABEL3  -CUSTOMLABEL4  -GOOGLEPRODUCTCATEGORY6  -GOOGLEPRODUCTCATEGORY5  -GOOGLEPRODUCTCATEGORY4  -GOOGLEPRODUCTCATEGORY3  -GOOGLEPRODUCTCATEGORY2  -GOOGLEPRODUCTCATEGORY1  -GOOGLEPRODUCTCATEGORY0  -MEDIATYPE  -TITLEKEYWORDS 
$CatalogsCreativeAssetsProductGroupFilters = Initialize-CatalogsCreativeAssetsProductGroupFilters -AnyOf $CatalogsCreativeAssetsProductGroupFilterKeys -AllOf $CatalogsCreativeAssetsProductGroupFilterKeys

$CatalogsListProductsByFilterRequest = Initialize-CatalogsListProductsByFilterRequest -FeedId "2680059592705" -Filters $CatalogsCreativeAssetsProductGroupFilters -CatalogId "2680059592705" -CatalogType "CREATIVE_ASSETS" -Country "AD" -Locale "af-ZA" # CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$PinMetrics = $true # Boolean | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to $false)

# List products by filter
try {
    $Result = Invoke-ProductsByProductGroupFilterList -CatalogsListProductsByFilterRequest $CatalogsListProductsByFilterRequest -Bookmark $Bookmark -PageSize $PageSize -AdAccountId $AdAccountId -PinMetrics $PinMetrics
} catch {
    Write-Host ("Exception occurred when calling Invoke-ProductsByProductGroupFilterList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogsListProductsByFilterRequest** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md)| Object holding a group of filters for a catalog product group | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **PinMetrics** | **Boolean**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to $false]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

