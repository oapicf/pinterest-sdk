# PSOpenAPITools.PSOpenAPITools\Api.BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-DeleteBusinessMembership**](BusinessAccessRelationshipsApi.md#Invoke-DeleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**Invoke-DeleteBusinessPartners**](BusinessAccessRelationshipsApi.md#Invoke-DeleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**Get-BusinessEmployers**](BusinessAccessRelationshipsApi.md#Get-BusinessEmployers) | **GET** /businesses/employers | List business employers for user
[**Get-BusinessMembers**](BusinessAccessRelationshipsApi.md#Get-BusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
[**Get-BusinessPartners**](BusinessAccessRelationshipsApi.md#Get-BusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**Update-BusinessMemberships**](BusinessAccessRelationshipsApi.md#Update-BusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role


<a id="Invoke-DeleteBusinessMembership"></a>
# **Invoke-DeleteBusinessMembership**
> DeletedMembersResponse Invoke-DeleteBusinessMembership<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MembersToDeleteBody] <PSCustomObject><br>

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "729090764583391194" # String | Business id
$MembersToDeleteBodyMembersInner = Initialize-MembersToDeleteBodyMembersInner -MemberId "140943737684417" -BusinessRole "EMPLOYEE"
$MembersToDeleteBody = Initialize-MembersToDeleteBody -Members $MembersToDeleteBodyMembersInner # MembersToDeleteBody | List of members with role to delete.

# Terminate business memberships
try {
    $Result = Invoke-DeleteBusinessMembership -BusinessId $BusinessId -MembersToDeleteBody $MembersToDeleteBody
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteBusinessMembership: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Business id | 
 **MembersToDeleteBody** | [**MembersToDeleteBody**](MembersToDeleteBody.md)| List of members with role to delete. | 

### Return type

[**DeletedMembersResponse**](DeletedMembersResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeleteBusinessPartners"></a>
# **Invoke-DeleteBusinessPartners**
> DeletePartnersResponse Invoke-DeleteBusinessPartners<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DeletePartnersRequest] <PSCustomObject><br>

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "729090764583391194" # String | Unique identifier of the requesting business.
"MyPartnerType"
$DeletePartnersRequest = Initialize-DeletePartnersRequest -PartnerIds "1234567890123" -PartnerType $String # DeletePartnersRequest | An object containing a ""partner_ids"" property composed of a list of partner IDs and a ""partners_type"" property specifying the type of partners to delete. 

# Terminate business partnerships
try {
    $Result = Invoke-DeleteBusinessPartners -BusinessId $BusinessId -DeletePartnersRequest $DeletePartnersRequest
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteBusinessPartners: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **DeletePartnersRequest** | [**DeletePartnersRequest**](DeletePartnersRequest.md)| An object containing a &quot;&quot;partner_ids&quot;&quot; property composed of a list of partner IDs and a &quot;&quot;partners_type&quot;&quot; property specifying the type of partners to delete.  | 

### Return type

[**DeletePartnersResponse**](DeletePartnersResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-BusinessEmployers"></a>
# **Get-BusinessEmployers**
> GetBusinessEmployers200Response Get-BusinessEmployers<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>

List business employers for user

Get all of the viewing user's business employers.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)

# List business employers for user
try {
    $Result = Get-BusinessEmployers -PageSize $PageSize -Bookmark $Bookmark
} catch {
    Write-Host ("Exception occurred when calling Get-BusinessEmployers: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-BusinessMembers"></a>
# **Get-BusinessMembers**
> GetBusinessMembers200Response Get-BusinessMembers<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssetsSummary] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessRoles] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MemberIds] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartIndex] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "729090764583391194" # String | Unique identifier of the requesting business.
$AssetsSummary = $true # Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to $false)
$BusinessRoles = "EMPLOYEE" # MemberBusinessRole[] | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
$MemberIds = "00101010101,2222220101" # String | A list of business members ids separated by comma. (optional)
$StartIndex = 0 # Int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

# Get business members
try {
    $Result = Get-BusinessMembers -BusinessId $BusinessId -AssetsSummary $AssetsSummary -BusinessRoles $BusinessRoles -MemberIds $MemberIds -StartIndex $StartIndex -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Get-BusinessMembers: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **AssetsSummary** | **Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to $false]
 **BusinessRoles** | [**MemberBusinessRole[]**](MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] 
 **MemberIds** | **String**| A list of business members ids separated by comma. | [optional] 
 **StartIndex** | **Int32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**GetBusinessMembers200Response**](GetBusinessMembers200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-BusinessPartners"></a>
# **Get-BusinessPartners**
> GetBusinessPartners200Response Get-BusinessPartners<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssetsSummary] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PartnerType] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PartnerIds] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartIndex] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>

Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "729090764583391194" # String | Unique identifier of the requesting business.
$AssetsSummary = $true # Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to $false)
$PartnerType = "INTERNAL" # PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
$PartnerIds = "00101010101,2222220101" # String | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
$StartIndex = 0 # Int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)

# Get business partners
try {
    $Result = Get-BusinessPartners -BusinessId $BusinessId -AssetsSummary $AssetsSummary -PartnerType $PartnerType -PartnerIds $PartnerIds -StartIndex $StartIndex -PageSize $PageSize -Bookmark $Bookmark
} catch {
    Write-Host ("Exception occurred when calling Get-BusinessPartners: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **AssetsSummary** | **Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to $false]
 **PartnerType** | [**PartnerType**](PartnerType.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **PartnerIds** | **String**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] 
 **StartIndex** | **Int32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**GetBusinessPartners200Response**](GetBusinessPartners200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Update-BusinessMemberships"></a>
# **Update-BusinessMemberships**
> UpdateMemberResultsResponseArray Update-BusinessMemberships<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UpdateMemberBusinessRoleBody] <PSCustomObject[]><br>

Update member's business role

Update a member's business role within the business.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "729090764583391194" # String | Business id
$UpdateMemberBusinessRoleBody = Initialize-UpdateMemberBusinessRoleBody -BusinessRole "EMPLOYEE" -MemberId "140943737684417" # UpdateMemberBusinessRoleBody[] | List of objects with the member id and the business_role.

# Update member's business role
try {
    $Result = Update-BusinessMemberships -BusinessId $BusinessId -UpdateMemberBusinessRoleBody $UpdateMemberBusinessRoleBody
} catch {
    Write-Host ("Exception occurred when calling Update-BusinessMemberships: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Business id | 
 **UpdateMemberBusinessRoleBody** | [**UpdateMemberBusinessRoleBody[]**](UpdateMemberBusinessRoleBody.md)| List of objects with the member id and the business_role. | 

### Return type

[**UpdateMemberResultsResponseArray**](UpdateMemberResultsResponseArray.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

