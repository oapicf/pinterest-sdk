# PSOpenAPITools.PSOpenAPITools\Api.CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get-alogsProductGroupPinsList**](CatalogsApi.md#Get-alogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products for a Product Group
[**Get-alogsProductGroupsCreate**](CatalogsApi.md#Get-alogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**Get-alogsProductGroupsDelete**](CatalogsApi.md#Get-alogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**Get-alogsProductGroupsGet**](CatalogsApi.md#Get-alogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**Get-alogsProductGroupsList**](CatalogsApi.md#Get-alogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
[**Get-alogsProductGroupsProductCountsGet**](CatalogsApi.md#Get-alogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts for a Product Group
[**Get-alogsProductGroupsUpdate**](CatalogsApi.md#Get-alogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**Get-alogsList**](CatalogsApi.md#Get-alogsList) | **GET** /catalogs | List catalogs
[**Invoke-FeedProcessingResultsList**](CatalogsApi.md#Invoke-FeedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**Invoke-FeedsCreate**](CatalogsApi.md#Invoke-FeedsCreate) | **POST** /catalogs/feeds | Create feed
[**Invoke-FeedsDelete**](CatalogsApi.md#Invoke-FeedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**Invoke-FeedsGet**](CatalogsApi.md#Invoke-FeedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**Invoke-FeedsList**](CatalogsApi.md#Invoke-FeedsList) | **GET** /catalogs/feeds | List feeds
[**Invoke-FeedsUpdate**](CatalogsApi.md#Invoke-FeedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**Invoke-ItemsBatchGet**](CatalogsApi.md#Invoke-ItemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs item batch status
[**Invoke-ItemsBatchPost**](CatalogsApi.md#Invoke-ItemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
[**Invoke-ItemsIssuesList**](CatalogsApi.md#Invoke-ItemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues for a given processing result
[**Invoke-ItemsGet**](CatalogsApi.md#Invoke-ItemsGet) | **GET** /catalogs/items | Get catalogs items
[**Invoke-ProductsByProductGroupFilterList**](CatalogsApi.md#Invoke-ProductsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List filtered products


<a id="Get-alogsProductGroupPinsList"></a>
# **Get-alogsProductGroupPinsList**
> CatalogsProductGroupPinsList200Response Get-alogsProductGroupPinsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductGroupId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

List products for a Product Group

Get a list of product pins for a given Catalogs Product Group Id owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ProductGroupId = "MyProductGroupId" # String | Unique identifier of a product group
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# List products for a Product Group
try {
    $Result = Get-alogsProductGroupPinsList -ProductGroupId $ProductGroupId -Bookmark $Bookmark -PageSize $PageSize -AdAccountId $AdAccountId
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
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

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
> CatalogsProductGroupsCreate201Response Get-alogsProductGroupsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogsProductGroupsCreateRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Create product group

Create product group to use in Catalogs owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogsProductGroupPricingCurrencyCriteria = Initialize-CatalogsProductGroupPricingCurrencyCriteria -Operator "GREATER_THAN" -Value 0 -Currency "AED" -Negated $false
$CatalogsProductGroupMultipleStringCriteria = Initialize-CatalogsProductGroupMultipleStringCriteria -Values "MyValues" -Negated $false
$CatalogsProductGroupMultipleCountriesCriteria = Initialize-CatalogsProductGroupMultipleCountriesCriteria -Values "AD" -Negated $false
$CatalogsHotelProductGroupFilterKeys = Initialize-CatalogsHotelProductGroupFilterKeys -PRICE $CatalogsProductGroupPricingCurrencyCriteria -HOTELID $CatalogsProductGroupMultipleStringCriteria -BRAND $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL0 $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL1 $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL2 $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL3 $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL4 $CatalogsProductGroupMultipleStringCriteria -COUNTRY $CatalogsProductGroupMultipleCountriesCriteria

$CatalogsHotelProductGroupFilters = Initialize-CatalogsHotelProductGroupFilters -AnyOf $CatalogsHotelProductGroupFilterKeys -AllOf $CatalogsHotelProductGroupFilterKeys

$CatalogsProductGroupsCreateRequest = Initialize-CatalogsProductGroupsCreateRequest -Name "MyName" -Description "MyDescription" -IsFeatured $false -Filters $CatalogsHotelProductGroupFilters -FeedId "2680059592705" -CatalogType "HOTEL" -CatalogId "2680059592705" # CatalogsProductGroupsCreateRequest | Request object used to created a catalogs product group.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Create product group
try {
    $Result = Get-alogsProductGroupsCreate -CatalogsProductGroupsCreateRequest $CatalogsProductGroupsCreateRequest -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsProductGroupsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogsProductGroupsCreateRequest** | [**CatalogsProductGroupsCreateRequest**](CatalogsProductGroupsCreateRequest.md)| Request object used to created a catalogs product group. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md) (PSCustomObject)

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

Delete a product group owned by the ""operation user_account"" from being in use in Catalogs. - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

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

<a id="Get-alogsProductGroupsGet"></a>
# **Get-alogsProductGroupsGet**
> CatalogsProductGroupsCreate201Response Get-alogsProductGroupsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductGroupId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get product group

Get a singe product group for a given Catalogs Product Group Id owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

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

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsProductGroupsList"></a>
# **Get-alogsProductGroupsList**
> CatalogsProductGroupsList200Response Get-alogsProductGroupsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FeedId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$FeedId = "MyFeedId" # String | Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
$CatalogId = "MyCatalogId" # String | Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# List product groups
try {
    $Result = Get-alogsProductGroupsList -FeedId $FeedId -CatalogId $CatalogId -Bookmark $Bookmark -PageSize $PageSize -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsProductGroupsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FeedId** | **String**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **CatalogId** | **String**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
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
> CatalogsProductGroupProductCounts Get-alogsProductGroupsProductCountsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductGroupId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get product counts for a Product Group

Get a product counts for a given Catalogs Product Group owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ProductGroupId = "MyProductGroupId" # String | Unique identifier of a product group
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get product counts for a Product Group
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

[**CatalogsProductGroupProductCounts**](CatalogsProductGroupProductCounts.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsProductGroupsUpdate"></a>
# **Get-alogsProductGroupsUpdate**
> CatalogsProductGroupsCreate201Response Get-alogsProductGroupsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProductGroupId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogsProductGroupsUpdateRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Update product group

Update product group owned by the ""operation user_account"" to use in Catalogs. - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ProductGroupId = "MyProductGroupId" # String | Unique identifier of a product group
$CatalogsProductGroupPricingCurrencyCriteria = Initialize-CatalogsProductGroupPricingCurrencyCriteria -Operator "GREATER_THAN" -Value 0 -Currency "AED" -Negated $false
$CatalogsProductGroupMultipleStringCriteria = Initialize-CatalogsProductGroupMultipleStringCriteria -Values "MyValues" -Negated $false
$CatalogsProductGroupMultipleCountriesCriteria = Initialize-CatalogsProductGroupMultipleCountriesCriteria -Values "AD" -Negated $false
$CatalogsHotelProductGroupFilterKeys = Initialize-CatalogsHotelProductGroupFilterKeys -PRICE $CatalogsProductGroupPricingCurrencyCriteria -HOTELID $CatalogsProductGroupMultipleStringCriteria -BRAND $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL0 $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL1 $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL2 $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL3 $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL4 $CatalogsProductGroupMultipleStringCriteria -COUNTRY $CatalogsProductGroupMultipleCountriesCriteria

$CatalogsHotelProductGroupFilters = Initialize-CatalogsHotelProductGroupFilters -AnyOf $CatalogsHotelProductGroupFilterKeys -AllOf $CatalogsHotelProductGroupFilterKeys

$CatalogsProductGroupsUpdateRequest = Initialize-CatalogsProductGroupsUpdateRequest -Name "MyName" -Description "MyDescription" -IsFeatured $false -Filters $CatalogsHotelProductGroupFilters -CatalogType "HOTEL" # CatalogsProductGroupsUpdateRequest | Request object used to Update a catalogs product group.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Update product group
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

[**CatalogsProductGroupsCreate201Response**](CatalogsProductGroupsCreate201Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-alogsList"></a>
# **Get-alogsList**
> CatalogsList200Response Get-alogsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

List catalogs

Fetch catalogs owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# List catalogs
try {
    $Result = Get-alogsList -Bookmark $Bookmark -PageSize $PageSize -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Get-alogsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsList200Response**](CatalogsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-FeedProcessingResultsList"></a>
# **Invoke-FeedProcessingResultsList**
> FeedProcessingResultsList200Response Invoke-FeedProcessingResultsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FeedId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

List processing results for a given feed

Fetch a feed processing results owned by the ""operation user_account"". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$FeedId = "MyFeedId" # String | Unique identifier of a feed
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# List processing results for a given feed
try {
    $Result = Invoke-FeedProcessingResultsList -FeedId $FeedId -Bookmark $Bookmark -PageSize $PageSize -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-FeedProcessingResultsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FeedId** | **String**| Unique identifier of a feed | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**FeedProcessingResultsList200Response**](FeedProcessingResultsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-FeedsCreate"></a>
# **Invoke-FeedsCreate**
> CatalogsFeed Invoke-FeedsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FeedsCreateRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Create feed

Create a new feed owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Please, be aware that ""default_country"" and ""default_locale"" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogsFeedsCreateRequestDefaultLocale = Initialize-CatalogsFeedsCreateRequestDefaultLocale 
$CatalogsFeedCredentials = Initialize-CatalogsFeedCredentials -Password "MyPassword" -Username "MyUsername"
$CatalogsFeedProcessingSchedule = Initialize-CatalogsFeedProcessingSchedule -Time "02:59" -Timezone "Africa/Abidjan"
$FeedsCreateRequest = Initialize-FeedsCreateRequest -DefaultCurrency "AED" -Name "MyName" -Format "TSV" -DefaultLocale $CatalogsFeedsCreateRequestDefaultLocale -Credentials $CatalogsFeedCredentials -Location "MyLocation" -PreferredProcessingSchedule $CatalogsFeedProcessingSchedule -CatalogType "RETAIL" -DefaultCountry "AD" -DefaultAvailability "IN_STOCK" -CatalogId "MyCatalogId" # FeedsCreateRequest | Request object used to created a feed.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Create feed
try {
    $Result = Invoke-FeedsCreate -FeedsCreateRequest $FeedsCreateRequest -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-FeedsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FeedsCreateRequest** | [**FeedsCreateRequest**](FeedsCreateRequest.md)| Request object used to created a feed. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-FeedsDelete"></a>
# **Invoke-FeedsDelete**
> void Invoke-FeedsDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FeedId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Delete feed

Delete a feed owned by the ""operating user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$FeedId = "MyFeedId" # String | Unique identifier of a feed
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Delete feed
try {
    $Result = Invoke-FeedsDelete -FeedId $FeedId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-FeedsDelete: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FeedId** | **String**| Unique identifier of a feed | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-FeedsGet"></a>
# **Invoke-FeedsGet**
> CatalogsFeed Invoke-FeedsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FeedId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get feed

Get a single feed owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$FeedId = "MyFeedId" # String | Unique identifier of a feed
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get feed
try {
    $Result = Invoke-FeedsGet -FeedId $FeedId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-FeedsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FeedId** | **String**| Unique identifier of a feed | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-FeedsList"></a>
# **Invoke-FeedsList**
> FeedsList200Response Invoke-FeedsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

List feeds

Fetch feeds owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$CatalogId = "MyCatalogId" # String | Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# List feeds
try {
    $Result = Invoke-FeedsList -Bookmark $Bookmark -PageSize $PageSize -CatalogId $CatalogId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-FeedsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **CatalogId** | **String**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**FeedsList200Response**](FeedsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-FeedsUpdate"></a>
# **Invoke-FeedsUpdate**
> CatalogsFeed Invoke-FeedsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FeedId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FeedsUpdateRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Update feed

Update a feed owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/shopping/catalog/'>Pinterest API for shopping</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$FeedId = "MyFeedId" # String | Unique identifier of a feed
$CatalogsFeedCredentials = Initialize-CatalogsFeedCredentials -Password "MyPassword" -Username "MyUsername"
$CatalogsFeedProcessingSchedule = Initialize-CatalogsFeedProcessingSchedule -Time "02:59" -Timezone "Africa/Abidjan"
$FeedsUpdateRequest = Initialize-FeedsUpdateRequest -DefaultCurrency "AED" -Name "MyName" -Format "TSV" -Credentials $CatalogsFeedCredentials -Location "MyLocation" -PreferredProcessingSchedule $CatalogsFeedProcessingSchedule -Status "ACTIVE" -CatalogType "RETAIL" -DefaultAvailability "IN_STOCK" # FeedsUpdateRequest | Request object used to update a feed.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Update feed
try {
    $Result = Invoke-FeedsUpdate -FeedId $FeedId -FeedsUpdateRequest $FeedsUpdateRequest -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-FeedsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FeedId** | **String**| Unique identifier of a feed | 
 **FeedsUpdateRequest** | [**FeedsUpdateRequest**](FeedsUpdateRequest.md)| Request object used to update a feed. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ItemsBatchGet"></a>
# **Invoke-ItemsBatchGet**
> CatalogsItemsBatch Invoke-ItemsBatchGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BatchId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Get catalogs item batch status

Get a single catalogs items batch owned by the ""operating user_account"". <a href=""/docs/shopping/catalog/#Update%20items%20in%20batch"" target=""_blank"">See detailed documentation here.</a> - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BatchId = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e" # String | Id of a catalogs items batch to fetch
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Get catalogs item batch status
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

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ItemsBatchPost"></a>
# **Invoke-ItemsBatchPost**
> CatalogsItemsBatch Invoke-ItemsBatchPost<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ItemsBatchPostRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the ""operation user_account"". <a href=""/docs/shopping/catalog/#Update%20items%20in%20batch"" target=""_blank"">See detailed documentation here.</a> - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ItemDeleteBatchRecord = Initialize-ItemDeleteBatchRecord -ItemId "DS0294-M"
$ItemsBatchPostRequest = Initialize-ItemsBatchPostRequest -CatalogType "RETAIL" -Country "AD" -Language "AM" -Items $ItemDeleteBatchRecord -CatalogId "2680059592705" -Operation "UPDATE" # ItemsBatchPostRequest | Request object used to create catalogs items in a batch
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Operate on item batch
try {
    $Result = Invoke-ItemsBatchPost -ItemsBatchPostRequest $ItemsBatchPostRequest -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-ItemsBatchPost: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ItemsBatchPostRequest** | [**ItemsBatchPostRequest**](ItemsBatchPostRequest.md)| Request object used to create catalogs items in a batch | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ItemsIssuesList"></a>
# **Invoke-ItemsIssuesList**
> ItemsIssuesList200Response Invoke-ItemsIssuesList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProcessingResultId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ItemNumbers] <System.Nullable[Int32][]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ItemValidationIssue] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

List item issues for a given processing result

List item validation issues for a given feed processing result owned by the ""operation user_account"". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ProcessingResultId = "5224831246441439241" # String | Unique identifier of a feed processing result. It can be acquired from the ""id"" field of the ""items"" array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list).
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$ItemNumbers = 0 # Int32[] | Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. (optional)
$ItemValidationIssue = "AD_LINK_FORMAT_WARNING" # CatalogsItemValidationIssue | Filter item validation issues that have a given type of item validation issue. (optional)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# List item issues for a given processing result
try {
    $Result = Invoke-ItemsIssuesList -ProcessingResultId $ProcessingResultId -Bookmark $Bookmark -PageSize $PageSize -ItemNumbers $ItemNumbers -ItemValidationIssue $ItemValidationIssue -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-ItemsIssuesList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProcessingResultId** | **String**| Unique identifier of a feed processing result. It can be acquired from the &quot;&quot;id&quot;&quot; field of the &quot;&quot;items&quot;&quot; array within the response of the [List processing results for a given feed](https://developers.pinterest.com/docs/api/v5/#operation/feed_processing_results/list). | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ItemNumbers** | [**Int32[]**](Int32.md)| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] 
 **ItemValidationIssue** | [**CatalogsItemValidationIssue**](CatalogsItemValidationIssue.md)| Filter item validation issues that have a given type of item validation issue. | [optional] 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**ItemsIssuesList200Response**](ItemsIssuesList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ItemsGet"></a>
# **Invoke-ItemsGet**
> CatalogsItems Invoke-ItemsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Country] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Language] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ItemIds] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Filters] <PSCustomObject><br>

Get catalogs items

Get the items of the catalog owned by the ""operation user_account"". <a href=""/docs/shopping/catalog/#Update%20items%20in%20batch"" target=""_blank"">See detailed documentation here.</a> - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Country = "US" # String | Country for the Catalogs Items
$Language = "EN" # String | Language for the Catalogs Items
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$ItemIds = "MyItemIds" # String[] | This parameter is deprecated. Use filters instead. (optional)
$CatalogsItemsFilters = Initialize-CatalogsItemsFilters -CatalogType "RETAIL" -ItemIds "MyItemIds" -CatalogId "MyCatalogId" -HotelIds "MyHotelIds" # CatalogsItemsFilters | Identifies items to be retrieved. This is a required parameter. (optional)

# Get catalogs items
try {
    $Result = Invoke-ItemsGet -Country $Country -Language $Language -AdAccountId $AdAccountId -ItemIds $ItemIds -Filters $Filters
} catch {
    Write-Host ("Exception occurred when calling Invoke-ItemsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Country** | **String**| Country for the Catalogs Items | 
 **Language** | **String**| Language for the Catalogs Items | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **ItemIds** | [**String[]**](String.md)| This parameter is deprecated. Use filters instead. | [optional] 
 **Filters** | [**CatalogsItemsFilters**](CatalogsItemsFilters.md)| Identifies items to be retrieved. This is a required parameter. | [optional] 

### Return type

[**CatalogsItems**](CatalogsItems.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ProductsByProductGroupFilterList"></a>
# **Invoke-ProductsByProductGroupFilterList**
> CatalogsProductGroupPinsList200Response Invoke-ProductsByProductGroupFilterList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogsListProductsByFilterRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

List filtered products

List products Pins owned by the ""operation user_account"" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following <a href=""https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts"">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/shopping/catalog/'>Learn more</a>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogsProductGroupPricingCriteria = Initialize-CatalogsProductGroupPricingCriteria -Inclusion $false -Values 0 -Negated $false
$CatalogsProductGroupCurrencyCriteria = Initialize-CatalogsProductGroupCurrencyCriteria -Values "AED" -Negated $false
$CatalogsProductGroupMultipleStringCriteria = Initialize-CatalogsProductGroupMultipleStringCriteria -Values "MyValues" -Negated $false
$CatalogsProductGroupMultipleGenderCriteria = Initialize-CatalogsProductGroupMultipleGenderCriteria -Values "FEMALE" -Negated $false
$CatalogsProductGroupMultipleStringListCriteria = Initialize-CatalogsProductGroupMultipleStringListCriteria -Values "MyValues" -Negated $false
$CatalogsProductGroupFilterKeys = Initialize-CatalogsProductGroupFilterKeys -MINPRICE $CatalogsProductGroupPricingCriteria -MAXPRICE $CatalogsProductGroupPricingCriteria -CURRENCY $CatalogsProductGroupCurrencyCriteria -ITEMID $CatalogsProductGroupMultipleStringCriteria -AVAILABILITY $CatalogsProductGroupMultipleStringCriteria -BRAND $CatalogsProductGroupMultipleStringCriteria -CONDITION $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL0 $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL1 $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL2 $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL3 $CatalogsProductGroupMultipleStringCriteria -CUSTOMLABEL4 $CatalogsProductGroupMultipleStringCriteria -ITEMGROUPID $CatalogsProductGroupMultipleStringCriteria -GENDER $CatalogsProductGroupMultipleGenderCriteria -PRODUCTTYPE4 $CatalogsProductGroupMultipleStringListCriteria -PRODUCTTYPE3 $CatalogsProductGroupMultipleStringListCriteria -PRODUCTTYPE2 $CatalogsProductGroupMultipleStringListCriteria -PRODUCTTYPE1 $CatalogsProductGroupMultipleStringListCriteria -PRODUCTTYPE0 $CatalogsProductGroupMultipleStringListCriteria -GOOGLEPRODUCTCATEGORY6 $CatalogsProductGroupMultipleStringListCriteria -GOOGLEPRODUCTCATEGORY5 $CatalogsProductGroupMultipleStringListCriteria -GOOGLEPRODUCTCATEGORY4 $CatalogsProductGroupMultipleStringListCriteria -GOOGLEPRODUCTCATEGORY3 $CatalogsProductGroupMultipleStringListCriteria -GOOGLEPRODUCTCATEGORY2 $CatalogsProductGroupMultipleStringListCriteria -GOOGLEPRODUCTCATEGORY1 $CatalogsProductGroupMultipleStringListCriteria -GOOGLEPRODUCTCATEGORY0 $CatalogsProductGroupMultipleStringListCriteria

$CatalogsProductGroupFilters = Initialize-CatalogsProductGroupFilters -AnyOf $CatalogsProductGroupFilterKeys -AllOf $CatalogsProductGroupFilterKeys

$CatalogsListProductsByFilterRequest = Initialize-CatalogsListProductsByFilterRequest -FeedId "2680059592705" -Filters $CatalogsProductGroupFilters # CatalogsListProductsByFilterRequest | Object holding a group of filters for a catalog product group
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# List filtered products
try {
    $Result = Invoke-ProductsByProductGroupFilterList -CatalogsListProductsByFilterRequest $CatalogsListProductsByFilterRequest -Bookmark $Bookmark -PageSize $PageSize -AdAccountId $AdAccountId
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
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

