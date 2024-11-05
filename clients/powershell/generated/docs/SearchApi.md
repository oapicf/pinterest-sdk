# PSOpenAPITools.PSOpenAPITools\Api.SearchApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Search-PartnerPins**](SearchApi.md#Search-PartnerPins) | **GET** /search/partner/pins | Search pins by a given search term
[**Search-UserBoardsGet**](SearchApi.md#Search-UserBoardsGet) | **GET** /search/boards | Search user&#39;s boards
[**Search-UserPinsList**](SearchApi.md#Search-UserPinsList) | **GET** /search/pins | Search user&#39;s Pins


<a id="Search-PartnerPins"></a>
# **Search-PartnerPins**
> SearchPartnerPins200Response Search-PartnerPins<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Term] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CountryCode] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Locale] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>

Search pins by a given search term

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Term = "MyTerm" # String | Search term to look up pins.
$CountryCode = "US" # String | Two letter country code (ISO 3166-1 alpha-2)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$Locale = "MyLocale" # String | Search locale. (optional)
$Limit = 4 # Int32 | Max search result size (optional) (default to 10)

# Search pins by a given search term
try {
    $Result = Search-PartnerPins -Term $Term -CountryCode $CountryCode -Bookmark $Bookmark -Locale $Locale -Limit $Limit
} catch {
    Write-Host ("Exception occurred when calling Search-PartnerPins: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Term** | **String**| Search term to look up pins. | 
 **CountryCode** | **String**| Two letter country code (ISO 3166-1 alpha-2) | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **Locale** | **String**| Search locale. | [optional] 
 **Limit** | **Int32**| Max search result size | [optional] [default to 10]

### Return type

[**SearchPartnerPins200Response**](SearchPartnerPins200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Search-UserBoardsGet"></a>
# **Search-UserBoardsGet**
> SearchUserBoardsGet200Response Search-UserBoardsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Query] <String><br>

Search user's boards

Search for boards for the ""operation user_account"". This includes boards of all board types. - By default, the ""operation user_account"" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$Query = "MyQuery" # String | Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)

# Search user's boards
try {
    $Result = Search-UserBoardsGet -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize -Query $Query
} catch {
    Write-Host ("Exception occurred when calling Search-UserBoardsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **Query** | **String**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[**SearchUserBoardsGet200Response**](SearchUserBoardsGet200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Search-UserPinsList"></a>
# **Search-UserPinsList**
> PinsList200Response Search-UserPinsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Query] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>

Search user's Pins

Search for pins for the ""operation user_account"". - By default, the ""operation user_account"" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the ""operation user_account"". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$Query = "Plants" # String | Search query. Can contain pin description keywords or comma-separated pin IDs.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)

# Search user's Pins
try {
    $Result = Search-UserPinsList -Query $Query -AdAccountId $AdAccountId -Bookmark $Bookmark
} catch {
    Write-Host ("Exception occurred when calling Search-UserPinsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Query** | **String**| Search query. Can contain pin description keywords or comma-separated pin IDs. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**PinsList200Response**](PinsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

