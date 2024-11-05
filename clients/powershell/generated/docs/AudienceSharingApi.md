# PSOpenAPITools.PSOpenAPITools\Api.AudienceSharingApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AdAccountsAudiencesSharedAccountsList**](AudienceSharingApi.md#Invoke-AdAccountsAudiencesSharedAccountsList) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account
[**Invoke-BusinessAccountAudiencesSharedAccountsList**](AudienceSharingApi.md#Invoke-BusinessAccountAudiencesSharedAccountsList) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business
[**Invoke-SharedAudiencesForBusinessList**](AudienceSharingApi.md#Invoke-SharedAudiencesForBusinessList) | **GET** /businesses/{business_id}/audiences | List received audiences for a business
[**Update-AdAccountToAdAccountSharedAudience**](AudienceSharingApi.md#Update-AdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts
[**Update-AdAccountToBusinessSharedAudience**](AudienceSharingApi.md#Update-AdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses
[**Update-BusinessToAdAccountSharedAudience**](AudienceSharingApi.md#Update-BusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts
[**Update-BusinessToBusinessSharedAudience**](AudienceSharingApi.md#Update-BusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses


<a id="Invoke-AdAccountsAudiencesSharedAccountsList"></a>
# **Invoke-AdAccountsAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response Invoke-AdAccountsAudiencesSharedAccountsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AudienceId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AccountType] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AudienceId = "MyAudienceId" # String | Unique identifier of the audience to use to filter the results.
$AccountType = "AD_ACCOUNT" # AudienceAccountType | Filter accounts by account type.
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)

# List accounts with access to an audience owned by an ad account
try {
    $Result = Invoke-AdAccountsAudiencesSharedAccountsList -AdAccountId $AdAccountId -AudienceId $AudienceId -AccountType $AccountType -PageSize $PageSize -Bookmark $Bookmark
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdAccountsAudiencesSharedAccountsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AudienceId** | **String**| Unique identifier of the audience to use to filter the results. | 
 **AccountType** | [**AudienceAccountType**](AudienceAccountType.md)| Filter accounts by account type. | 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BusinessAccountAudiencesSharedAccountsList"></a>
# **Invoke-BusinessAccountAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response Invoke-BusinessAccountAudiencesSharedAccountsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AudienceId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AccountType] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "729090764583391194" # String | Unique identifier of the requesting business.
$AudienceId = "MyAudienceId" # String | Unique identifier of the audience to use to filter the results.
$AccountType = "AD_ACCOUNT" # AudienceAccountType | Filter accounts by account type.
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)

# List accounts with access to an audience owned by a business
try {
    $Result = Invoke-BusinessAccountAudiencesSharedAccountsList -BusinessId $BusinessId -AudienceId $AudienceId -AccountType $AccountType -PageSize $PageSize -Bookmark $Bookmark
} catch {
    Write-Host ("Exception occurred when calling Invoke-BusinessAccountAudiencesSharedAccountsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **AudienceId** | **String**| Unique identifier of the audience to use to filter the results. | 
 **AccountType** | [**AudienceAccountType**](AudienceAccountType.md)| Filter accounts by account type. | 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-SharedAudiencesForBusinessList"></a>
# **Invoke-SharedAudiencesForBusinessList**
> AudiencesList200Response Invoke-SharedAudiencesForBusinessList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List received audiences for a business

Get a list of received audiences for the given business.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "729090764583391194" # String | Unique identifier of the requesting business.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$Order = "ASCENDING" # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

# List received audiences for a business
try {
    $Result = Invoke-SharedAudiencesForBusinessList -BusinessId $BusinessId -Bookmark $Bookmark -Order $Order -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-SharedAudiencesForBusinessList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **Order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Update-AdAccountToAdAccountSharedAudience"></a>
# **Update-AdAccountToAdAccountSharedAudience**
> SharedAudienceResponse Update-AdAccountToAdAccountSharedAudience<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SharedAudience] <PSCustomObject><br>

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$SharedAudience = Initialize-SharedAudience -AudienceId "2542621871096" -OperationType "SHARE" -RecipientAccountIds "MyRecipientAccountIds" # SharedAudience | 

# Update audience sharing between ad accounts
try {
    $Result = Update-AdAccountToAdAccountSharedAudience -AdAccountId $AdAccountId -SharedAudience $SharedAudience
} catch {
    Write-Host ("Exception occurred when calling Update-AdAccountToAdAccountSharedAudience: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **SharedAudience** | [**SharedAudience**](SharedAudience.md)|  | 

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Update-AdAccountToBusinessSharedAudience"></a>
# **Update-AdAccountToBusinessSharedAudience**
> BusinessSharedAudienceResponse Update-AdAccountToBusinessSharedAudience<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessSharedAudience] <PSCustomObject><br>

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$BusinessSharedAudience = Initialize-BusinessSharedAudience -AudienceId "2542621871096" -OperationType "SHARE" -RecipientBusinessIds "MyRecipientBusinessIds" # BusinessSharedAudience | 

# Update audience sharing from an ad account to businesses
try {
    $Result = Update-AdAccountToBusinessSharedAudience -AdAccountId $AdAccountId -BusinessSharedAudience $BusinessSharedAudience
} catch {
    Write-Host ("Exception occurred when calling Update-AdAccountToBusinessSharedAudience: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **BusinessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md)|  | 

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Update-BusinessToAdAccountSharedAudience"></a>
# **Update-BusinessToAdAccountSharedAudience**
> SharedAudienceResponse Update-BusinessToAdAccountSharedAudience<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SharedAudience] <PSCustomObject><br>

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "729090764583391194" # String | Unique identifier of the requesting business.
$SharedAudience = Initialize-SharedAudience -AudienceId "2542621871096" -OperationType "SHARE" -RecipientAccountIds "MyRecipientAccountIds" # SharedAudience | 

# Update audience sharing from a business to ad accounts
try {
    $Result = Update-BusinessToAdAccountSharedAudience -BusinessId $BusinessId -SharedAudience $SharedAudience
} catch {
    Write-Host ("Exception occurred when calling Update-BusinessToAdAccountSharedAudience: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **SharedAudience** | [**SharedAudience**](SharedAudience.md)|  | 

### Return type

[**SharedAudienceResponse**](SharedAudienceResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Update-BusinessToBusinessSharedAudience"></a>
# **Update-BusinessToBusinessSharedAudience**
> BusinessSharedAudienceResponse Update-BusinessToBusinessSharedAudience<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessSharedAudience] <PSCustomObject><br>

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "729090764583391194" # String | Unique identifier of the requesting business.
$BusinessSharedAudience = Initialize-BusinessSharedAudience -AudienceId "2542621871096" -OperationType "SHARE" -RecipientBusinessIds "MyRecipientBusinessIds" # BusinessSharedAudience | 

# Update audience sharing between businesses
try {
    $Result = Update-BusinessToBusinessSharedAudience -BusinessId $BusinessId -BusinessSharedAudience $BusinessSharedAudience
} catch {
    Write-Host ("Exception occurred when calling Update-BusinessToBusinessSharedAudience: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **BusinessSharedAudience** | [**BusinessSharedAudience**](BusinessSharedAudience.md)|  | 

### Return type

[**BusinessSharedAudienceResponse**](BusinessSharedAudienceResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

