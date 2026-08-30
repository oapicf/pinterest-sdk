# PSOpenAPITools.PSOpenAPITools\Api.CustomerListsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-CustomerListsCreate**](CustomerListsApi.md#Invoke-CustomerListsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
[**Invoke-CustomerListsGet**](CustomerListsApi.md#Invoke-CustomerListsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
[**Invoke-CustomerListsList**](CustomerListsApi.md#Invoke-CustomerListsList) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
[**Invoke-CustomerListsUpdate**](CustomerListsApi.md#Invoke-CustomerListsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list


<a id="Invoke-CustomerListsCreate"></a>
# **Invoke-CustomerListsCreate**
> CustomerList Invoke-CustomerListsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListCreate] <PSCustomObject><br>

Create customer lists

Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | 
$CustomerListRecordRow = Initialize-CustomerListRecordRow -Email "MyEmail" -ExternalId "MyExternalId" -HashedPhoneNumber "MyHashedPhoneNumber" -HashedPinnerId "MyHashedPinnerId" -IpAddress "MyIpAddress" -LiverampEnvelope "MyLiverampEnvelope" -Maid "MyMaid" -UserAgent "MyUserAgent"
$CustomerListCreate = Initialize-CustomerListCreate -IsNca $false -ListType "EMAIL" -Name "The Glengarry Glen Ross leads" -Records "email1@pinterest.com,email2@pinterest.com,..<more records>" -RecordsV2 $CustomerListRecordRow # CustomerListCreate | 

# Create customer lists
try {
    $Result = Invoke-CustomerListsCreate -AdAccountId $AdAccountId -CustomerListCreate $CustomerListCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-CustomerListsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**|  | 
 **CustomerListCreate** | [**CustomerListCreate**](CustomerListCreate.md)|  | 

### Return type

[**CustomerList**](CustomerList.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CustomerListsGet"></a>
# **Invoke-CustomerListsGet**
> CustomerList Invoke-CustomerListsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListId] <String><br>

Get customer list

Gets a specific customer list given the customer list ID.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

# Configure OAuth2 access token for authorization: client_credentials
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | 
$CustomerListId = "MyCustomerListId" # String | Customer list ID.

# Get customer list
try {
    $Result = Invoke-CustomerListsGet -AdAccountId $AdAccountId -CustomerListId $CustomerListId
} catch {
    Write-Host ("Exception occurred when calling Invoke-CustomerListsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**|  | 
 **CustomerListId** | **String**| Customer list ID. | 

### Return type

[**CustomerList**](CustomerList.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CustomerListsList"></a>
# **Invoke-CustomerListsList**
> CustomerListsList200Response Invoke-CustomerListsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ExcludeNca] <System.Nullable[Boolean]><br>

Get customer lists

Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | 
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
$Order = "ASCENDING" # PinterestLibPaginationOrder | The order in which to sort the items returned: ""ASCENDING"" or ""DESCENDING"" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
$ExcludeNca = $true # Boolean | When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). (optional) (default to $false)

# Get customer lists
try {
    $Result = Invoke-CustomerListsList -AdAccountId $AdAccountId -Bookmark $Bookmark -PageSize $PageSize -Order $Order -ExcludeNca $ExcludeNca
} catch {
    Write-Host ("Exception occurred when calling Invoke-CustomerListsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**|  | 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **Order** | [**PinterestLibPaginationOrder**](PinterestLibPaginationOrder.md)| The order in which to sort the items returned: &quot;&quot;ASCENDING&quot;&quot; or &quot;&quot;DESCENDING&quot;&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **ExcludeNca** | **Boolean**| When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). | [optional] [default to $false]

### Return type

[**CustomerListsList200Response**](CustomerListsList200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CustomerListsUpdate"></a>
# **Invoke-CustomerListsUpdate**
> CustomerList Invoke-CustomerListsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListUpdateWithRequiredBody] <PSCustomObject><br>

Update customer list

Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your ""CUSTOMER_LIST"" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | 
$CustomerListId = "MyCustomerListId" # String | Customer list ID.
$CustomerListRecordRow = Initialize-CustomerListRecordRow -Email "MyEmail" -ExternalId "MyExternalId" -HashedPhoneNumber "MyHashedPhoneNumber" -HashedPinnerId "MyHashedPinnerId" -IpAddress "MyIpAddress" -LiverampEnvelope "MyLiverampEnvelope" -Maid "MyMaid" -UserAgent "MyUserAgent"
$CustomerListUpdateWithRequiredBody = Initialize-CustomerListUpdateWithRequiredBody -OperationType "ADD" -Records "email1@pinterest.com,email2@pinterest.com,..<more records>" -RecordsV2 $CustomerListRecordRow # CustomerListUpdateWithRequiredBody | 

# Update customer list
try {
    $Result = Invoke-CustomerListsUpdate -AdAccountId $AdAccountId -CustomerListId $CustomerListId -CustomerListUpdateWithRequiredBody $CustomerListUpdateWithRequiredBody
} catch {
    Write-Host ("Exception occurred when calling Invoke-CustomerListsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**|  | 
 **CustomerListId** | **String**| Customer list ID. | 
 **CustomerListUpdateWithRequiredBody** | [**CustomerListUpdateWithRequiredBody**](CustomerListUpdateWithRequiredBody.md)|  | 

### Return type

[**CustomerList**](CustomerList.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

