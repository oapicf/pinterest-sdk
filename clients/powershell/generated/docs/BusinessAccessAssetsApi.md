# PSOpenAPITools.PSOpenAPITools\Api.BusinessAccessAssetsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AssetGroupCreate**](BusinessAccessAssetsApi.md#Invoke-AssetGroupCreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
[**Invoke-AssetGroupDelete**](BusinessAccessAssetsApi.md#Invoke-AssetGroupDelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
[**Invoke-AssetGroupUpdate**](BusinessAccessAssetsApi.md#Invoke-AssetGroupUpdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
[**Invoke-BusinessAssetMembersGet**](BusinessAccessAssetsApi.md#Invoke-BusinessAssetMembersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**Invoke-BusinessAssetPartnersGet**](BusinessAccessAssetsApi.md#Invoke-BusinessAssetPartnersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**Invoke-BusinessAssetsGet**](BusinessAccessAssetsApi.md#Invoke-BusinessAssetsGet) | **GET** /businesses/{business_id}/assets | List business assets
[**Invoke-BusinessMemberAssetsGet**](BusinessAccessAssetsApi.md#Invoke-BusinessMemberAssetsGet) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**Invoke-BusinessMembersAssetAccessDelete**](BusinessAccessAssetsApi.md#Invoke-BusinessMembersAssetAccessDelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**Invoke-BusinessMembersAssetAccessUpdate**](BusinessAccessAssetsApi.md#Invoke-BusinessMembersAssetAccessUpdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**Invoke-BusinessPartnerAssetAccessGet**](BusinessAccessAssetsApi.md#Invoke-BusinessPartnerAssetAccessGet) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**Invoke-DeletePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#Invoke-DeletePartnerAssetAccessHandlerImpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**Update-PartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#Update-PartnerAssetAccessHandlerImpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions


<a id="Invoke-AssetGroupCreate"></a>
# **Invoke-AssetGroupCreate**
> AssetGroupInput Invoke-AssetGroupCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssetGroupInputCreate] <PSCustomObject><br>

Create a new asset group.

Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$BusinessAccessUserSummary = Initialize-BusinessAccessUserSummary -Email "business0101@business.com" -Id "549755885175" -Username "business0101"
$AssetGroupBinding = Initialize-AssetGroupBinding -AdAccountsIds "MyAdAccountsIds" -AssetGroupDescription "Asset group that has ad accounts used in Canada" -AssetGroupName "Canada Ad Accounts" -AssetGroupTypes "MyAssetGroupTypes" -CatalogsIds "MyCatalogsIds" -CreatedBy $BusinessAccessUserSummary -CreatedTime 1646767577816 -Id "666791336903426391" -Owner $BusinessAccessUserSummary -ProfilesIds "MyProfilesIds" -UpdatedTime 1646767577816

$AssetGroupInputCreate = Initialize-AssetGroupInputCreate -AssetGroup $AssetGroupBinding -AssetGroupDescription "Asset groups that has ad accounts shared in Canada" -AssetGroupName "Canada Ad Accounts" -AssetGroupTypes "BRAND" # AssetGroupInputCreate | 

# Create a new asset group.
try {
    $Result = Invoke-AssetGroupCreate -BusinessId $BusinessId -AssetGroupInputCreate $AssetGroupInputCreate
} catch {
    Write-Host ("Exception occurred when calling Invoke-AssetGroupCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **AssetGroupInputCreate** | [**AssetGroupInputCreate**](AssetGroupInputCreate.md)|  | 

### Return type

[**AssetGroupInput**](AssetGroupInput.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AssetGroupDelete"></a>
# **Invoke-AssetGroupDelete**
> AssetGroupDeletion Invoke-AssetGroupDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssetGroupDeletionDelete] <PSCustomObject><br>

Delete asset groups.

Delete a batch of asset groups.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$AssetGroupDeletionDelete = Initialize-AssetGroupDeletionDelete -AssetGroupsToDelete "MyAssetGroupsToDelete" # AssetGroupDeletionDelete | 

# Delete asset groups.
try {
    $Result = Invoke-AssetGroupDelete -BusinessId $BusinessId -AssetGroupDeletionDelete $AssetGroupDeletionDelete
} catch {
    Write-Host ("Exception occurred when calling Invoke-AssetGroupDelete: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **AssetGroupDeletionDelete** | [**AssetGroupDeletionDelete**](AssetGroupDeletionDelete.md)|  | 

### Return type

[**AssetGroupDeletion**](AssetGroupDeletion.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-AssetGroupUpdate"></a>
# **Invoke-AssetGroupUpdate**
> AssetGroupModification Invoke-AssetGroupUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssetGroupModificationReadOrUpdate] <PSCustomObject><br>

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$AssetGroupUpdateItemReadOrUpdateItem = Initialize-AssetGroupUpdateItemReadOrUpdateItem -AssetGroupId "MyAssetGroupId" -AssetGroupTypes "BRAND" -AssetsToAdd "MyAssetsToAdd" -AssetsToRemove "MyAssetsToRemove" -Description "MyDescription" -Name "MyName"
$AssetGroupUpdateError = Initialize-AssetGroupUpdateError -AssetGroupId "MyAssetGroupId" -Code 0 -Message "MyMessage"

$BusinessAccessUserSummary = Initialize-BusinessAccessUserSummary -Email "business0101@business.com" -Id "549755885175" -Username "business0101"
$AssetGroupBinding = Initialize-AssetGroupBinding -AdAccountsIds "MyAdAccountsIds" -AssetGroupDescription "Asset group that has ad accounts used in Canada" -AssetGroupName "Canada Ad Accounts" -AssetGroupTypes "MyAssetGroupTypes" -CatalogsIds "MyCatalogsIds" -CreatedBy $BusinessAccessUserSummary -CreatedTime 1646767577816 -Id "666791336903426391" -Owner $BusinessAccessUserSummary -ProfilesIds "MyProfilesIds" -UpdatedTime 1646767577816

$AssetGroupModificationReadOrUpdate = Initialize-AssetGroupModificationReadOrUpdate -AssetGroupsToUpdate $AssetGroupUpdateItemReadOrUpdateItem -Exceptions $AssetGroupUpdateError -UpdatedAssetGroups $AssetGroupBinding # AssetGroupModificationReadOrUpdate | 

# Update asset groups.
try {
    $Result = Invoke-AssetGroupUpdate -BusinessId $BusinessId -AssetGroupModificationReadOrUpdate $AssetGroupModificationReadOrUpdate
} catch {
    Write-Host ("Exception occurred when calling Invoke-AssetGroupUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **AssetGroupModificationReadOrUpdate** | [**AssetGroupModificationReadOrUpdate**](AssetGroupModificationReadOrUpdate.md)|  | 

### Return type

[**AssetGroupModification**](AssetGroupModification.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BusinessAssetMembersGet"></a>
# **Invoke-BusinessAssetMembersGet**
> BusinessAssetMembersGet200Response Invoke-BusinessAssetMembersGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssetId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartIndex] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-FetchSystemUsers] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$AssetId = "MyAssetId" # String | Unique identifier of a business asset.
$StartIndex = 56 # Int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
$FetchSystemUsers = $true # Boolean | Fetches system users if True. Fetches regular user employees if False. (optional) (default to $false)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# Get members with access to asset
try {
    $Result = Invoke-BusinessAssetMembersGet -BusinessId $BusinessId -AssetId $AssetId -StartIndex $StartIndex -FetchSystemUsers $FetchSystemUsers -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-BusinessAssetMembersGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **AssetId** | **String**| Unique identifier of a business asset. | 
 **StartIndex** | **Int32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **FetchSystemUsers** | **Boolean**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to $false]
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BusinessAssetPartnersGet"></a>
# **Invoke-BusinessAssetPartnersGet**
> BusinessAssetMembersGet200Response Invoke-BusinessAssetPartnersGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssetId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartIndex] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$AssetId = "MyAssetId" # String | Unique identifier of a business asset.
$StartIndex = 56 # Int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# Get partners with access to asset
try {
    $Result = Invoke-BusinessAssetPartnersGet -BusinessId $BusinessId -AssetId $AssetId -StartIndex $StartIndex -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-BusinessAssetPartnersGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **AssetId** | **String**| Unique identifier of a business asset. | 
 **StartIndex** | **Int32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BusinessAssetsGet"></a>
# **Invoke-BusinessAssetsGet**
> BusinessAssetsGet200Response Invoke-BusinessAssetsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Permissions] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ChildAssetId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssetGroupId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssetType] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartIndex] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$Permissions = "ADMIN" # PermissionsWithOwner[] | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional)
$ChildAssetId = "MyChildAssetId" # String | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional)
$AssetGroupId = "MyAssetGroupId" # String | An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional)
$AssetType = "AD_ACCOUNT" # String | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to "AD_ACCOUNT")
$StartIndex = 56 # Int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# List business assets
try {
    $Result = Invoke-BusinessAssetsGet -BusinessId $BusinessId -Permissions $Permissions -ChildAssetId $ChildAssetId -AssetGroupId $AssetGroupId -AssetType $AssetType -StartIndex $StartIndex -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-BusinessAssetsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **Permissions** | [**PermissionsWithOwner[]**](PermissionsWithOwner.md)| A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] 
 **ChildAssetId** | **String**| A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] 
 **AssetGroupId** | **String**| An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] 
 **AssetType** | **String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &quot;AD_ACCOUNT&quot;]
 **StartIndex** | **Int32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetsGet200Response**](BusinessAssetsGet200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BusinessMemberAssetsGet"></a>
# **Invoke-BusinessMemberAssetsGet**
> BusinessMemberAssetsGetResponse Invoke-BusinessMemberAssetsGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-MemberId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssetType] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartIndex] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SortBy] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SortAscending] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SearchBy] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SearchValue] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssetPermissionType] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AdAccountStatuses] <PSCustomObject[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$MemberId = "MyMemberId" # String | The member id to fetch assets for.
$AssetType = "AD_ACCOUNT" # String | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to "AD_ACCOUNT")
$StartIndex = 56 # Int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
$SortBy = "NAME" # AssetSortBy | The field to sort member assets by (optional)
$SortAscending = $true # Boolean | Sort assets in ascending order (optional) (default to $true)
$SearchBy = "NAME" # AssetSearchBy | The field to search member assets by (optional)
$SearchValue = "MySearchValue" # String | The value to search for (optional)
$AssetPermissionType = "AGGREGATED_PERMISSION" # AssetPermissionType | The type of asset permission to filter by (optional)
$AdAccountStatuses = "ACTIVE" # NonDraftEntityStatus[] | A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# Get assets assigned to a member
try {
    $Result = Invoke-BusinessMemberAssetsGet -BusinessId $BusinessId -MemberId $MemberId -AssetType $AssetType -StartIndex $StartIndex -SortBy $SortBy -SortAscending $SortAscending -SearchBy $SearchBy -SearchValue $SearchValue -AssetPermissionType $AssetPermissionType -AdAccountStatuses $AdAccountStatuses -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-BusinessMemberAssetsGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **MemberId** | **String**| The member id to fetch assets for. | 
 **AssetType** | **String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &quot;AD_ACCOUNT&quot;]
 **StartIndex** | **Int32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **SortBy** | [**AssetSortBy**](AssetSortBy.md)| The field to sort member assets by | [optional] 
 **SortAscending** | **Boolean**| Sort assets in ascending order | [optional] [default to $true]
 **SearchBy** | [**AssetSearchBy**](AssetSearchBy.md)| The field to search member assets by | [optional] 
 **SearchValue** | **String**| The value to search for | [optional] 
 **AssetPermissionType** | [**AssetPermissionType**](AssetPermissionType.md)| The type of asset permission to filter by | [optional] 
 **AdAccountStatuses** | [**NonDraftEntityStatus[]**](NonDraftEntityStatus.md)| A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessMemberAssetsGetResponse**](BusinessMemberAssetsGetResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BusinessMembersAssetAccessDelete"></a>
# **Invoke-BusinessMembersAssetAccessDelete**
> DeleteMemberAccessResultsResponseArray Invoke-BusinessMembersAssetAccessDelete<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessMembersAssetAccessDeleteBody] <PSCustomObject><br>

Delete member access to asset

Terminate multiple members' access to an asset.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$DeleteMemberAssetAccessItem = Initialize-DeleteMemberAssetAccessItem -AssetId "MyAssetId" -MemberId "MyMemberId"
$BusinessMembersAssetAccessDeleteBody = Initialize-BusinessMembersAssetAccessDeleteBody -Accesses $DeleteMemberAssetAccessItem # BusinessMembersAssetAccessDeleteBody | 

# Delete member access to asset
try {
    $Result = Invoke-BusinessMembersAssetAccessDelete -BusinessId $BusinessId -BusinessMembersAssetAccessDeleteBody $BusinessMembersAssetAccessDeleteBody
} catch {
    Write-Host ("Exception occurred when calling Invoke-BusinessMembersAssetAccessDelete: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **BusinessMembersAssetAccessDeleteBody** | [**BusinessMembersAssetAccessDeleteBody**](BusinessMembersAssetAccessDeleteBody.md)|  | 

### Return type

[**DeleteMemberAccessResultsResponseArray**](DeleteMemberAccessResultsResponseArray.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BusinessMembersAssetAccessUpdate"></a>
# **Invoke-BusinessMembersAssetAccessUpdate**
> UpdateMemberAssetsResultsResponseArray Invoke-BusinessMembersAssetAccessUpdate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UpdateMemberAssetAccessBody] <PSCustomObject><br>

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$UpdateMemberAssetAccessItem = Initialize-UpdateMemberAssetAccessItem -AssetId "MyAssetId" -MemberId "MyMemberId" -Permissions "ADMIN"
$UpdateMemberAssetAccessBody = Initialize-UpdateMemberAssetAccessBody -Accesses $UpdateMemberAssetAccessItem # UpdateMemberAssetAccessBody | 

# Assign/Update member asset permissions
try {
    $Result = Invoke-BusinessMembersAssetAccessUpdate -BusinessId $BusinessId -UpdateMemberAssetAccessBody $UpdateMemberAssetAccessBody
} catch {
    Write-Host ("Exception occurred when calling Invoke-BusinessMembersAssetAccessUpdate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **UpdateMemberAssetAccessBody** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md)|  | 

### Return type

[**UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-BusinessPartnerAssetAccessGet"></a>
# **Invoke-BusinessPartnerAssetAccessGet**
> BusinessPartnerAssetAccessGet200Response Invoke-BusinessPartnerAssetAccessGet<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PartnerId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PartnerType] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AssetType] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-StartIndex] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SortBy] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SortAscending] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SearchBy] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-SearchValue] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$PartnerId = "MyPartnerId" # String | The partner id to be bound to the Business
$PartnerType = "INTERNAL" # String | Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional) (default to "INTERNAL")
$AssetType = "AD_ACCOUNT" # String | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to "AD_ACCOUNT")
$StartIndex = 56 # Int32 | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
$SortBy = "NAME" # AssetSortBy | The field to sort member assets by (optional)
$SortAscending = $true # Boolean | Sort assets in ascending order (optional) (default to $true)
$SearchBy = "NAME" # AssetSearchBy | The field to search member assets by (optional)
$SearchValue = "MySearchValue" # String | The value to search for (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

# Get assets assigned to a partner or assets assigned by a partner
try {
    $Result = Invoke-BusinessPartnerAssetAccessGet -BusinessId $BusinessId -PartnerId $PartnerId -PartnerType $PartnerType -AssetType $AssetType -StartIndex $StartIndex -SortBy $SortBy -SortAscending $SortAscending -SearchBy $SearchBy -SearchValue $SearchValue -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Invoke-BusinessPartnerAssetAccessGet: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **PartnerId** | **String**| The partner id to be bound to the Business | 
 **PartnerType** | **String**| Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [default to &quot;INTERNAL&quot;]
 **AssetType** | **String**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &quot;AD_ACCOUNT&quot;]
 **StartIndex** | **Int32**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **SortBy** | [**AssetSortBy**](AssetSortBy.md)| The field to sort member assets by | [optional] 
 **SortAscending** | **Boolean**| Sort assets in ascending order | [optional] [default to $true]
 **SearchBy** | [**AssetSearchBy**](AssetSearchBy.md)| The field to search member assets by | [optional] 
 **SearchValue** | **String**| The value to search for | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessPartnerAssetAccessGet200Response**](BusinessPartnerAssetAccessGet200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-DeletePartnerAssetAccessHandlerImpl"></a>
# **Invoke-DeletePartnerAssetAccessHandlerImpl**
> DeletePartnerAssetAccessResultsResponseArray Invoke-DeletePartnerAssetAccessHandlerImpl<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-DeletePartnerAssetAccessBody] <PSCustomObject><br>

Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$DeletePartnerAssetAccessItem = Initialize-DeletePartnerAssetAccessItem -AssetId "MyAssetId" -PartnerId "MyPartnerId" -PartnerType "INTERNAL"
$DeletePartnerAssetAccessBody = Initialize-DeletePartnerAssetAccessBody -Accesses $DeletePartnerAssetAccessItem # DeletePartnerAssetAccessBody | 

# Delete partner access to asset
try {
    $Result = Invoke-DeletePartnerAssetAccessHandlerImpl -BusinessId $BusinessId -DeletePartnerAssetAccessBody $DeletePartnerAssetAccessBody
} catch {
    Write-Host ("Exception occurred when calling Invoke-DeletePartnerAssetAccessHandlerImpl: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **DeletePartnerAssetAccessBody** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md)|  | 

### Return type

[**DeletePartnerAssetAccessResultsResponseArray**](DeletePartnerAssetAccessResultsResponseArray.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Update-PartnerAssetAccessHandlerImpl"></a>
# **Update-PartnerAssetAccessHandlerImpl**
> UpdatePartnerAssetsResultsResponseArray Update-PartnerAssetAccessHandlerImpl<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-UpdatePartnerAssetAccessBody] <PSCustomObject><br>

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "MyBusinessId" # String | Unique identifier of the requesting business.
$UpdatePartnerAssetAccessItem = Initialize-UpdatePartnerAssetAccessItem -AssetId "MyAssetId" -PartnerId "MyPartnerId" -Permissions "ADMIN"
$UpdatePartnerAssetAccessBody = Initialize-UpdatePartnerAssetAccessBody -Accesses $UpdatePartnerAssetAccessItem # UpdatePartnerAssetAccessBody | 

# Assign/Update partner asset permissions
try {
    $Result = Update-PartnerAssetAccessHandlerImpl -BusinessId $BusinessId -UpdatePartnerAssetAccessBody $UpdatePartnerAssetAccessBody
} catch {
    Write-Host ("Exception occurred when calling Update-PartnerAssetAccessHandlerImpl: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **UpdatePartnerAssetAccessBody** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md)|  | 

### Return type

[**UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

