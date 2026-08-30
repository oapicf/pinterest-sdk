# PSOpenAPITools.PSOpenAPITools\Api.CatalogFeedsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-FeedProcessingResultsList**](CatalogFeedsApi.md#Invoke-FeedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
[**Invoke-FeedsCreate**](CatalogFeedsApi.md#Invoke-FeedsCreate) | **POST** /catalogs/feeds | Create feed
[**Invoke-FeedsDelete**](CatalogFeedsApi.md#Invoke-FeedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**Invoke-FeedsGet**](CatalogFeedsApi.md#Invoke-FeedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**Invoke-FeedsIngest**](CatalogFeedsApi.md#Invoke-FeedsIngest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
[**Invoke-FeedsList**](CatalogFeedsApi.md#Invoke-FeedsList) | **GET** /catalogs/feeds | List feeds
[**Invoke-FeedsUpdate**](CatalogFeedsApi.md#Invoke-FeedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**Invoke-ItemsIssuesList**](CatalogFeedsApi.md#Invoke-ItemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues


<a id="Invoke-FeedProcessingResultsList"></a>
# **Invoke-FeedProcessingResultsList**
> FeedProcessingResultsList200Response Invoke-FeedProcessingResultsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FeedId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List feed processing results

Fetch a feed processing results owned by the ""operation user_account"". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$FeedId = "MyFeedId" # String | Unique identifier of a feed.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# List feed processing results
try {
    $Result = Invoke-FeedProcessingResultsList -FeedId $FeedId -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-FeedProcessingResultsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FeedId** | **String**| Unique identifier of a feed. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogsFeedCreateRequestSchema] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Create feed

Create a new feed owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Please, be aware that ""default_country"" and ""default_locale"" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogsFeedCredentials = Initialize-CatalogsFeedCredentials -Password "MyPassword" -Username "MyUsername"
$CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale = Initialize-CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale 
$CatalogsFeedProcessingSchedule = Initialize-CatalogsFeedProcessingSchedule -Time "MyTime" -Timezone "Africa/Abidjan"
$CatalogsFeedCreateRequestSchema = Initialize-CatalogsFeedCreateRequestSchema -CatalogId "MyCatalogId" -CatalogType "CREATIVE_ASSETS" -Credentials $CatalogsFeedCredentials -DefaultAvailability "IN_STOCK" -DefaultCountry "AD" -DefaultCurrency "AED" -DefaultLocale $CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale -Format "TSV" -Location "MyLocation" -Name "MyName" -PreferredProcessingSchedule $CatalogsFeedProcessingSchedule -Status "ACTIVE" # CatalogsFeedCreateRequestSchema | 
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Create feed
try {
    $Result = Invoke-FeedsCreate -CatalogsFeedCreateRequestSchema $CatalogsFeedCreateRequestSchema -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-FeedsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogsFeedCreateRequestSchema** | [**CatalogsFeedCreateRequestSchema**](CatalogsFeedCreateRequestSchema.md)|  | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-FeedsDelete"></a>
# **Invoke-FeedsDelete**
> CatalogsFeed Invoke-FeedsDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FeedId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Delete feed

Delete a feed owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$FeedId = "MyFeedId" # String | Unique identifier of a feed.
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
 **FeedId** | **String**| Unique identifier of a feed. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

Get a single feed owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$FeedId = "MyFeedId" # String | Unique identifier of a feed.
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
 **FeedId** | **String**| Unique identifier of a feed. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-FeedsIngest"></a>
# **Invoke-FeedsIngest**
> CatalogsFeedIngestion Invoke-FeedsIngest<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FeedId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Ingest feed items

Ingest items for a given feed owned by the ""operation user_account"".  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$FeedId = "MyFeedId" # String | Unique identifier of a feed.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Ingest feed items
try {
    $Result = Invoke-FeedsIngest -FeedId $FeedId -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-FeedsIngest: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FeedId** | **String**| Unique identifier of a feed. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeedIngestion**](CatalogsFeedIngestion.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-FeedsList"></a>
# **Invoke-FeedsList**
> FeedsList200Response Invoke-FeedsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List feeds

Fetch feeds owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$CatalogId = "MyCatalogId" # String | Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# List feeds
try {
    $Result = Invoke-FeedsList -CatalogId $CatalogId -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-FeedsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **CatalogId** | **String**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**FeedsList200Response**](FeedsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-FeedsUpdate"></a>
# **Invoke-FeedsUpdate**
> CatalogsFeed Invoke-FeedsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FeedId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CatalogsFeedUpdateRequestSchema] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>

Update feed

Update a feed owned by the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$FeedId = "MyFeedId" # String | Unique identifier of a feed.
$CatalogsFeedCredentials = Initialize-CatalogsFeedCredentials -Password "MyPassword" -Username "MyUsername"
$CatalogsFeedProcessingSchedule = Initialize-CatalogsFeedProcessingSchedule -Time "MyTime" -Timezone "Africa/Abidjan"
$CatalogsFeedUpdateRequestSchema = Initialize-CatalogsFeedUpdateRequestSchema -CatalogType "CREATIVE_ASSETS" -Credentials $CatalogsFeedCredentials -DefaultAvailability "IN_STOCK" -DefaultCurrency "AED" -Format "TSV" -Location "MyLocation" -Name "MyName" -PreferredProcessingSchedule $CatalogsFeedProcessingSchedule -Status "ACTIVE" # CatalogsFeedUpdateRequestSchema | 
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)

# Update feed
try {
    $Result = Invoke-FeedsUpdate -FeedId $FeedId -CatalogsFeedUpdateRequestSchema $CatalogsFeedUpdateRequestSchema -AdAccountId $AdAccountId
} catch {
    Write-Host ("Exception occurred when calling Invoke-FeedsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **FeedId** | **String**| Unique identifier of a feed. | 
 **CatalogsFeedUpdateRequestSchema** | [**CatalogsFeedUpdateRequestSchema**](CatalogsFeedUpdateRequestSchema.md)|  | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsFeed**](CatalogsFeed.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-ItemsIssuesList"></a>
# **Invoke-ItemsIssuesList**
> ItemsIssuesList200Response Invoke-ItemsIssuesList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ProcessingResultId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ItemNumbers] <System.Nullable[Int32][]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ItemValidationIssue] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List item issues

List item validation issues for a given feed processing result owned by the ""operation user_account"". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the ""operation user_account"" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the ""operation user_account"". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to [Build catalogs report](/docs/api/v5/#operation/reports/create) and [Get catalogs report](/docs/api/v5/#operation/reports/get) endpoints. Moreover, they support multiple types of catalogs.  [Learn more](/docs/api-features/shopping-overview/)

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ProcessingResultId = "MyProcessingResultId" # String | Unique identifier of a feed processing result. It can be acquired from the ""id"" field of the ""items"" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).
$ItemNumbers = 0 # Int32[] | Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. (optional)
$ItemValidationIssue = "AD_IMAGE_0_LINK_LENGTH_TOO_LONG" # CatalogsItemValidationIssue | Filter item validation issues that have a given type of item validation issue. (optional)
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# List item issues
try {
    $Result = Invoke-ItemsIssuesList -ProcessingResultId $ProcessingResultId -ItemNumbers $ItemNumbers -ItemValidationIssue $ItemValidationIssue -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-ItemsIssuesList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ProcessingResultId** | **String**| Unique identifier of a feed processing result. It can be acquired from the &quot;&quot;id&quot;&quot; field of the &quot;&quot;items&quot;&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). | 
 **ItemNumbers** | [**Int32[]**](Int32.md)| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional] 
 **ItemValidationIssue** | [**CatalogsItemValidationIssue**](CatalogsItemValidationIssue.md)| Filter item validation issues that have a given type of item validation issue. | [optional] 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**ItemsIssuesList200Response**](ItemsIssuesList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

