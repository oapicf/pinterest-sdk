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
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AudienceId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AccountType] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AudienceId = "MyAudienceId" # String | Unique identifier of the audience to use to filter the results.
$AccountType = "AD_ACCOUNT" # AudienceAccountType | Filter accounts by account type.
$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# List accounts with access to an audience owned by an ad account
try {
    $Result = Invoke-AdAccountsAudiencesSharedAccountsList -AudienceId $AudienceId -AccountType $AccountType -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-AdAccountsAudiencesSharedAccountsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AudienceId** | **String**| Unique identifier of the audience to use to filter the results. | 
 **AccountType** | [**AudienceAccountType**](AudienceAccountType.md)| Filter accounts by account type. | 
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$AudienceId = "MyAudienceId" # String | Unique identifier of the audience to use to filter the results.
$AccountType = "AD_ACCOUNT" # AudienceAccountType | Filter accounts by account type.
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# List accounts with access to an audience owned by a business
try {
    $Result = Invoke-BusinessAccountAudiencesSharedAccountsList -BusinessId $BusinessId -AudienceId $AudienceId -AccountType $AccountType -Bookmark $Bookmark -PageSize $PageSize
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
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
> SharedAudiencesForBusinessList200Response Invoke-SharedAudiencesForBusinessList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List received audiences for a business

Get a list of received audiences for the given business.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$Order = "ASCENDING" # Order | The order in which to sort the items returned: ""ASCENDING"" or ""DESCENDING"" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# List received audiences for a business
try {
    $Result = Invoke-SharedAudiencesForBusinessList -BusinessId $BusinessId -Order $Order -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-SharedAudiencesForBusinessList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **Order** | [**Order**](Order.md)| The order in which to sort the items returned: &quot;&quot;ASCENDING&quot;&quot; or &quot;&quot;DESCENDING&quot;&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**SharedAudiencesForBusinessList200Response**](SharedAudiencesForBusinessList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Update-AdAccountToAdAccountSharedAudience"></a>
# **Update-AdAccountToAdAccountSharedAudience**
> AdAccountToAdAccountSharedAudience Update-AdAccountToAdAccountSharedAudience<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody] <PSCustomObject><br>

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody = Initialize-AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody -AudienceId "2542621871096" -OperationType "SHARE" -RecipientAccountIds "MyRecipientAccountIds" # AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody | 

# Update audience sharing between ad accounts
try {
    $Result = Update-AdAccountToAdAccountSharedAudience -AdAccountId $AdAccountId -AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody $AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
} catch {
    Write-Host ("Exception occurred when calling Update-AdAccountToAdAccountSharedAudience: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody** | [**AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody**](AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.md)|  | 

### Return type

[**AdAccountToAdAccountSharedAudience**](AdAccountToAdAccountSharedAudience.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Update-AdAccountToBusinessSharedAudience"></a>
# **Update-AdAccountToBusinessSharedAudience**
> AdAccountToBusinessSharedAudience Update-AdAccountToBusinessSharedAudience<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountToBusinessSharedAudienceUpdateWithRequiredBody] <PSCustomObject><br>

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$AdAccountToBusinessSharedAudienceUpdateWithRequiredBody = Initialize-AdAccountToBusinessSharedAudienceUpdateWithRequiredBody -AudienceId "2542621871096" -OperationType "SHARE" -RecipientBusinessIds "MyRecipientBusinessIds" # AdAccountToBusinessSharedAudienceUpdateWithRequiredBody | 

# Update audience sharing from an ad account to businesses
try {
    $Result = Update-AdAccountToBusinessSharedAudience -AdAccountId $AdAccountId -AdAccountToBusinessSharedAudienceUpdateWithRequiredBody $AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
} catch {
    Write-Host ("Exception occurred when calling Update-AdAccountToBusinessSharedAudience: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **AdAccountToBusinessSharedAudienceUpdateWithRequiredBody** | [**AdAccountToBusinessSharedAudienceUpdateWithRequiredBody**](AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.md)|  | 

### Return type

[**AdAccountToBusinessSharedAudience**](AdAccountToBusinessSharedAudience.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Update-BusinessToAdAccountSharedAudience"></a>
# **Update-BusinessToAdAccountSharedAudience**
> BusinessToAdAccountSharedAudience Update-BusinessToAdAccountSharedAudience<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessToAdAccountSharedAudienceUpdateWithRequiredBody] <PSCustomObject><br>

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$BusinessToAdAccountSharedAudienceUpdateWithRequiredBody = Initialize-BusinessToAdAccountSharedAudienceUpdateWithRequiredBody -AudienceId "2542621871096" -OperationType "SHARE" -RecipientAccountIds "MyRecipientAccountIds" # BusinessToAdAccountSharedAudienceUpdateWithRequiredBody | 

# Update audience sharing from a business to ad accounts
try {
    $Result = Update-BusinessToAdAccountSharedAudience -BusinessId $BusinessId -BusinessToAdAccountSharedAudienceUpdateWithRequiredBody $BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
} catch {
    Write-Host ("Exception occurred when calling Update-BusinessToAdAccountSharedAudience: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **BusinessToAdAccountSharedAudienceUpdateWithRequiredBody** | [**BusinessToAdAccountSharedAudienceUpdateWithRequiredBody**](BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.md)|  | 

### Return type

[**BusinessToAdAccountSharedAudience**](BusinessToAdAccountSharedAudience.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Update-BusinessToBusinessSharedAudience"></a>
# **Update-BusinessToBusinessSharedAudience**
> BusinessToBusinessSharedAudience Update-BusinessToBusinessSharedAudience<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessToBusinessSharedAudienceUpdateWithRequiredBody] <PSCustomObject><br>

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$BusinessToBusinessSharedAudienceUpdateWithRequiredBody = Initialize-BusinessToBusinessSharedAudienceUpdateWithRequiredBody -AudienceId "2542621871096" -OperationType "SHARE" -RecipientBusinessIds "MyRecipientBusinessIds" # BusinessToBusinessSharedAudienceUpdateWithRequiredBody | 

# Update audience sharing between businesses
try {
    $Result = Update-BusinessToBusinessSharedAudience -BusinessId $BusinessId -BusinessToBusinessSharedAudienceUpdateWithRequiredBody $BusinessToBusinessSharedAudienceUpdateWithRequiredBody
} catch {
    Write-Host ("Exception occurred when calling Update-BusinessToBusinessSharedAudience: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **BusinessToBusinessSharedAudienceUpdateWithRequiredBody** | [**BusinessToBusinessSharedAudienceUpdateWithRequiredBody**](BusinessToBusinessSharedAudienceUpdateWithRequiredBody.md)|  | 

### Return type

[**BusinessToBusinessSharedAudience**](BusinessToBusinessSharedAudience.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

