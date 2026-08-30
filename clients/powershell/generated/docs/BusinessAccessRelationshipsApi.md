# PSOpenAPITools.PSOpenAPITools\Api.BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-BrandAccountsCreate**](BusinessAccessRelationshipsApi.md#Invoke-BrandAccountsCreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account
[**Invoke-BrandAccountsUpdate**](BusinessAccessRelationshipsApi.md#Invoke-BrandAccountsUpdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account
[**Invoke-DeleteBusinessMembership**](BusinessAccessRelationshipsApi.md#Invoke-DeleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**Invoke-DeleteBusinessPartners**](BusinessAccessRelationshipsApi.md#Invoke-DeleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**Get-BusinessEmployers**](BusinessAccessRelationshipsApi.md#Get-BusinessEmployers) | **GET** /businesses/employers | List business employers for user
[**Get-BusinessMembers**](BusinessAccessRelationshipsApi.md#Get-BusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
[**Get-BusinessPartners**](BusinessAccessRelationshipsApi.md#Get-BusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**Invoke-SystemUserUpdate**](BusinessAccessRelationshipsApi.md#Invoke-SystemUserUpdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.
[**Update-BusinessMemberships**](BusinessAccessRelationshipsApi.md#Update-BusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role


<a id="Invoke-BrandAccountsCreate"></a>
# **Invoke-BrandAccountsCreate**
> BrandAccount Invoke-BrandAccountsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessHierarchyId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BrandAccountCreate] <PSCustomObject><br>

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessHierarchyId = "MyBusinessHierarchyId" # String | business hierarchy node id
$BrandAccountProfileImage = Initialize-BrandAccountProfileImage -ContentType "image/jpeg" -VarData "MyVarData"
$BrandAccountCreate = Initialize-BrandAccountCreate -About "MyAbout" -Country "AD" -Name "MyName" -ProfileImage $BrandAccountProfileImage -Username "MyUsername" -Website "MyWebsite" # BrandAccountCreate | 

# Create a Brand Account
try {
    $Result = Invoke-BrandAccountsCreate -BusinessHierarchyId $BusinessHierarchyId -BrandAccountCreate $BrandAccountCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-BrandAccountsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessHierarchyId** | **String**| business hierarchy node id | 
 **BrandAccountCreate** | [**BrandAccountCreate**](BrandAccountCreate.md)|  | 

### Return type

[**BrandAccount**](BrandAccount.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BrandAccountsUpdate"></a>
# **Invoke-BrandAccountsUpdate**
> BrandAccount Invoke-BrandAccountsUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BrandAccountId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessHierarchyId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BrandAccountUpdate] <PSCustomObject><br>

Update a Brand Account

Update an existing Brand Account

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BrandAccountId = "MyBrandAccountId" # String | 
$BusinessHierarchyId = "MyBusinessHierarchyId" # String | business hierarchy node id
$BrandAccountProfileImageUpdate = Initialize-BrandAccountProfileImageUpdate -ContentType "image/jpeg" -VarData "MyVarData"
$BrandAccountUpdate = Initialize-BrandAccountUpdate -About "MyAbout" -Country "AD" -Name "MyName" -ProfileImage $BrandAccountProfileImageUpdate -Username "MyUsername" -Website "MyWebsite" # BrandAccountUpdate | 

# Update a Brand Account
try {
    $Result = Invoke-BrandAccountsUpdate -BrandAccountId $BrandAccountId -BusinessHierarchyId $BusinessHierarchyId -BrandAccountUpdate $BrandAccountUpdate
} catch {
    Write-Host ("Exception occurred when calling Invoke-BrandAccountsUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BrandAccountId** | **String**|  | 
 **BusinessHierarchyId** | **String**| business hierarchy node id | 
 **BrandAccountUpdate** | [**BrandAccountUpdate**](BrandAccountUpdate.md)|  | 

### Return type

[**BrandAccount**](BrandAccount.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeleteBusinessMembership"></a>
# **Invoke-DeleteBusinessMembership**
> DeleteBusinessMembership200Response Invoke-DeleteBusinessMembership<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DeleteBusinessMembershipBody] <PSCustomObject><br>

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Business id
$DeleteBusinessMembershipMember = Initialize-DeleteBusinessMembershipMember -BusinessRole "EMPLOYEE" -MemberId "140943737684417"
$DeleteBusinessMembershipBody = Initialize-DeleteBusinessMembershipBody -Members $DeleteBusinessMembershipMember # DeleteBusinessMembershipBody | 

# Terminate business memberships
try {
    $Result = Invoke-DeleteBusinessMembership -BusinessId $BusinessId -DeleteBusinessMembershipBody $DeleteBusinessMembershipBody
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteBusinessMembership: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Business id | 
 **DeleteBusinessMembershipBody** | [**DeleteBusinessMembershipBody**](DeleteBusinessMembershipBody.md)|  | 

### Return type

[**DeleteBusinessMembership200Response**](DeleteBusinessMembership200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeleteBusinessPartners"></a>
# **Invoke-DeleteBusinessPartners**
> DeleteBusinessPartners Invoke-DeleteBusinessPartners<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DeleteBusinessPartnersDelete] <PSCustomObject><br>

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$DeleteBusinessPartnersDelete = Initialize-DeleteBusinessPartnersDelete -PartnerIds "MyPartnerIds" -PartnerType "INTERNAL" # DeleteBusinessPartnersDelete | 

# Terminate business partnerships
try {
    $Result = Invoke-DeleteBusinessPartners -BusinessId $BusinessId -DeleteBusinessPartnersDelete $DeleteBusinessPartnersDelete
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeleteBusinessPartners: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **DeleteBusinessPartnersDelete** | [**DeleteBusinessPartnersDelete**](DeleteBusinessPartnersDelete.md)|  | 

### Return type

[**DeleteBusinessPartners**](DeleteBusinessPartners.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-BusinessEmployers"></a>
# **Get-BusinessEmployers**
> GetBusinessEmployers200Response Get-BusinessEmployers<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssetsSummary] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List business employers for user

Get all of the viewing user's business employers.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AssetsSummary = $true # Boolean | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to $true)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# List business employers for user
try {
    $Result = Get-BusinessEmployers -AssetsSummary $AssetsSummary -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Get-BusinessEmployers: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AssetsSummary** | **Boolean**| Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to $true]
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
> GetBusinessEmployers200Response Get-BusinessMembers<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FetchSystemUsers] <System.Nullable[Boolean]><br>
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

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$FetchSystemUsers = $true # Boolean | Fetches system users if True. Fetches regular user employees if False. (optional) (default to $false)
$AssetsSummary = $true # Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to $false)
$BusinessRoles = "EMPLOYEE" # MemberBusinessRole[] | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
$MemberIds = "MyMemberIds" # String | A list of business members ids separated by comma. (optional)
$StartIndex = 56 # Int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# Get business members
try {
    $Result = Get-BusinessMembers -BusinessId $BusinessId -FetchSystemUsers $FetchSystemUsers -AssetsSummary $AssetsSummary -BusinessRoles $BusinessRoles -MemberIds $MemberIds -StartIndex $StartIndex -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Get-BusinessMembers: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **FetchSystemUsers** | **Boolean**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to $false]
 **AssetsSummary** | **Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to $false]
 **BusinessRoles** | [**MemberBusinessRole[]**](MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] 
 **MemberIds** | **String**| A list of business members ids separated by comma. | [optional] 
 **StartIndex** | **Int32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-BusinessPartners"></a>
# **Get-BusinessPartners**
> GetBusinessEmployers200Response Get-BusinessPartners<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssetsSummary] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PartnerType] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PartnerIds] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartIndex] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SortAscending] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$AssetsSummary = $true # Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to $false)
$PartnerType = "INTERNAL" # PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional)
$PartnerIds = "MyPartnerIds" # String | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
$StartIndex = 56 # Int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
$SortAscending = $true # Boolean | Sort ascending. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# Get business partners
try {
    $Result = Get-BusinessPartners -BusinessId $BusinessId -AssetsSummary $AssetsSummary -PartnerType $PartnerType -PartnerIds $PartnerIds -StartIndex $StartIndex -SortAscending $SortAscending -Bookmark $Bookmark -PageSize $PageSize
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
 **PartnerType** | [**PartnerType**](PartnerType.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **PartnerIds** | **String**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] 
 **StartIndex** | **Int32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **SortAscending** | **Boolean**| Sort ascending. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-SystemUserUpdate"></a>
# **Invoke-SystemUserUpdate**
> void Invoke-SystemUserUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SystemUserId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SystemUserUpdateWithRequiredBody] <PSCustomObject><br>

Update a system user information.

Update a system user information such as name.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$SystemUserId = "MySystemUserId" # String | Unique identifier of a system user.
$SystemUserUpdateWithRequiredBody = Initialize-SystemUserUpdateWithRequiredBody -Name "MyName" # SystemUserUpdateWithRequiredBody | 

# Update a system user information.
try {
    $Result = Invoke-SystemUserUpdate -BusinessId $BusinessId -SystemUserId $SystemUserId -SystemUserUpdateWithRequiredBody $SystemUserUpdateWithRequiredBody
} catch {
    Write-Host ("Exception occurred when calling Invoke-SystemUserUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **SystemUserId** | **String**| Unique identifier of a system user. | 
 **SystemUserUpdateWithRequiredBody** | [**SystemUserUpdateWithRequiredBody**](SystemUserUpdateWithRequiredBody.md)|  | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Update-BusinessMemberships"></a>
# **Update-BusinessMemberships**
> UpdateBusinessMembershipsResponse Update-BusinessMemberships<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessMembershipMember] <PSCustomObject[]><br>

Update member's business role

Update a member's business role within the business.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Business id
$BusinessMembershipMember = Initialize-BusinessMembershipMember -BusinessRole "EMPLOYEE" -MemberId "140943737684417" # BusinessMembershipMember[] | 

# Update member's business role
try {
    $Result = Update-BusinessMemberships -BusinessId $BusinessId -BusinessMembershipMember $BusinessMembershipMember
} catch {
    Write-Host ("Exception occurred when calling Update-BusinessMemberships: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Business id | 
 **BusinessMembershipMember** | [**BusinessMembershipMember[]**](BusinessMembershipMember.md)|  | 

### Return type

[**UpdateBusinessMembershipsResponse**](UpdateBusinessMembershipsResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

