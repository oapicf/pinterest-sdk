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
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListRequest] <PSCustomObject><br>

Create customer lists

<p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=""https://help.pinterest.com/en/business/article/audience-targeting"" target=""_blank"">Audience targeting</a> or the <a href=""/docs/api-features/targeting-overview/"" target=""_blank"">Audiences</a> section of the ads management guide.<p/>  <p><b>Please review our <u><a href=""https://help.pinterest.com/en/business/article/audience-targeting#section-13341"" target=""_blank"">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “ CUSTOMER_LIST” type) using the <a href=""#operation/create_audience_handler"">create audience endpoint</a> before it can be used.</p>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CustomerListRequest = Initialize-CustomerListRequest -Name "The Glengarry Glen Ross leads" -Records "email1@pinterest.com,email2@pinterest.com,..<more records>" -ListType "EMAIL" -Exceptions # CustomerListRequest | Parameters to get Customer lists info

# Create customer lists
try {
    $Result = Invoke-CustomerListsCreate -AdAccountId $AdAccountId -CustomerListRequest $CustomerListRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-CustomerListsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CustomerListRequest** | [**CustomerListRequest**](CustomerListRequest.md)| Parameters to get Customer lists info | 

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

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CustomerListId = "MyCustomerListId" # String | Unique identifier of a customer list

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
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CustomerListId** | **String**| Unique identifier of a customer list | 

### Return type

[**CustomerList**](CustomerList.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-CustomerListsList"></a>
# **Invoke-CustomerListsList**
> CustomerListsList200Response Invoke-CustomerListsList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Order] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>

Get customer lists

<p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=""https://help.pinterest.com/en/business/article/audience-targeting"" target=""_blank"">Audience targeting</a>  or the <a href=""/docs/api-features/targeting-overview/"" target=""_blank"">Audiences</a> section of the ads management guide.</p>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$Order = "ASCENDING" # String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)

# Get customer lists
try {
    $Result = Invoke-CustomerListsList -AdAccountId $AdAccountId -PageSize $PageSize -Order $Order -Bookmark $Bookmark
} catch {
    Write-Host ("Exception occurred when calling Invoke-CustomerListsList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **Order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

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
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CustomerListUpdateRequest] <PSCustomObject><br>

Update customer list

<p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records  to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=""https://help.pinterest.com/en/business/article/audience-targeting"" target=""_blank"">Audience targeting</a> or the <a href=""/docs/api-features/targeting-overview/"" target=""_blank"">Audiences</a> section of the ads management guide.</p>

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AdAccountId = "MyAdAccountId" # String | Unique identifier of an ad account.
$CustomerListId = "MyCustomerListId" # String | Unique identifier of a customer list
$CustomerListUpdateRequest = Initialize-CustomerListUpdateRequest -Records "email2@pinterest.com,email6@pinterest.com," -OperationType "ADD" -Exceptions # CustomerListUpdateRequest | 

# Update customer list
try {
    $Result = Invoke-CustomerListsUpdate -AdAccountId $AdAccountId -CustomerListId $CustomerListId -CustomerListUpdateRequest $CustomerListUpdateRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-CustomerListsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AdAccountId** | **String**| Unique identifier of an ad account. | 
 **CustomerListId** | **String**| Unique identifier of a customer list | 
 **CustomerListUpdateRequest** | [**CustomerListUpdateRequest**](CustomerListUpdateRequest.md)|  | 

### Return type

[**CustomerList**](CustomerList.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

