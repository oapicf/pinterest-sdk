# PSOpenAPITools.PSOpenAPITools\Api.BusinessAccessInviteApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-AssetAccessRequestsCreate**](BusinessAccessInviteApi.md#Invoke-AssetAccessRequestsCreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
[**Stop-InvitesOrRequests**](BusinessAccessInviteApi.md#Stop-InvitesOrRequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
[**New-AssetInvites**](BusinessAccessInviteApi.md#New-AssetInvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
[**New-MembershipOrPartnershipInvites**](BusinessAccessInviteApi.md#New-MembershipOrPartnershipInvites) | **POST** /businesses/{business_id}/invites | Create invites or requests
[**Get-Invites**](BusinessAccessInviteApi.md#Get-Invites) | **GET** /businesses/{business_id}/invites | Get invites/requests
[**Invoke-RespondBusinessAccessInvites**](BusinessAccessInviteApi.md#Invoke-RespondBusinessAccessInvites) | **PATCH** /businesses/invites | Accept or decline an invite/request


<a id="Invoke-AssetAccessRequestsCreate"></a>
# **Invoke-AssetAccessRequestsCreate**
> CreateAssetAccessRequestResponse Invoke-AssetAccessRequestsCreate<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateAssetAccessRequestBody] <PSCustomObject><br>

Create a request to access an existing partner's assets.

Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "729090764583391194" # String | Unique identifier of the requesting business.
$CreateAssetAccessRequestBodyAssetRequestsInner = Initialize-CreateAssetAccessRequestBodyAssetRequestsInner -PartnerId "809944451643622187" -AssetIdToPermissions @{ key_example = "ADMIN" }
$CreateAssetAccessRequestBody = Initialize-CreateAssetAccessRequestBody -AssetRequests $CreateAssetAccessRequestBodyAssetRequestsInner # CreateAssetAccessRequestBody | 

# Create a request to access an existing partner's assets.
try {
    $Result = Invoke-AssetAccessRequestsCreate -BusinessId $BusinessId -CreateAssetAccessRequestBody $CreateAssetAccessRequestBody
} catch {
    Write-Host ("Exception occurred when calling Invoke-AssetAccessRequestsCreate: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **CreateAssetAccessRequestBody** | [**CreateAssetAccessRequestBody**](CreateAssetAccessRequestBody.md)|  | 

### Return type

[**CreateAssetAccessRequestResponse**](CreateAssetAccessRequestResponse.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Stop-InvitesOrRequests"></a>
# **Stop-InvitesOrRequests**
> DeleteInvitesResultsResponseArray Stop-InvitesOrRequests<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CancelInvitesBody] <PSCustomObject><br>

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "729090764583391194" # String | Business id
$CancelInvitesBody = Initialize-CancelInvitesBody -InviteIds "MyInviteIds" # CancelInvitesBody | A list with invite ids

# Cancel invites/requests
try {
    $Result = Stop-InvitesOrRequests -BusinessId $BusinessId -CancelInvitesBody $CancelInvitesBody
} catch {
    Write-Host ("Exception occurred when calling Stop-InvitesOrRequests: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Business id | 
 **CancelInvitesBody** | [**CancelInvitesBody**](CancelInvitesBody.md)| A list with invite ids | 

### Return type

[**DeleteInvitesResultsResponseArray**](DeleteInvitesResultsResponseArray.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-AssetInvites"></a>
# **New-AssetInvites**
> UpdateInvitesResultsResponseArray New-AssetInvites<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateAssetInvitesRequest] <PSCustomObject><br>

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use ""Create a request to access an existing partner's assets"" to request access to your   partner's assets.     - invite_type=""PARTNER_REQUEST"" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use ""Assign/Update partner asset permissions"" to assign a partner access to   new assets.     - invite_type=""PARTNER_INVITE"" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use ""Assign/Update member asset permissions"" to assign a member access to new   assets.     - invite_type=""MEMBER_INVITE""  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "729090764583391194" # String | Unique identifier of the requesting business.
$CreateAssetInvitesRequestItem = Initialize-CreateAssetInvitesRequestItem -InviteId "1234567890123" -InviteType "MEMBER_INVITE" -AssetIdToPermissions @{ key_example = "ADMIN" }
$CreateAssetInvitesRequest = Initialize-CreateAssetInvitesRequest -Invites $CreateAssetInvitesRequestItem # CreateAssetInvitesRequest | A list of invites/requests together with the asset permissions to be assigned to the invite/request. 

# Update invite/request with an asset permission
try {
    $Result = New-AssetInvites -BusinessId $BusinessId -CreateAssetInvitesRequest $CreateAssetInvitesRequest
} catch {
    Write-Host ("Exception occurred when calling New-AssetInvites: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **CreateAssetInvitesRequest** | [**CreateAssetInvitesRequest**](CreateAssetInvitesRequest.md)| A list of invites/requests together with the asset permissions to be assigned to the invite/request.  | 

### Return type

[**UpdateInvitesResultsResponseArray**](UpdateInvitesResultsResponseArray.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-MembershipOrPartnershipInvites"></a>
# **New-MembershipOrPartnershipInvites**
> CreateInvitesResultsResponseArray New-MembershipOrPartnershipInvites<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-CreateMembershipOrPartnershipInvitesBody] <PSCustomObject><br>

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=""MEMBER_INVITE""     - business_role=""EMPLOYEE"" OR business_role=""BIZ_ADMIN"" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=""PARTNER_INVITE""     - business_role=""PARTNER""     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=""PARTNER_REQUEST""     - business_role=""PARTNER""     - partners

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "729090764583391194" # String | Business id
$CreateMembershipOrPartnershipInvitesBody = Initialize-CreateMembershipOrPartnershipInvitesBody -BusinessRole "EMPLOYEE" -InviteType "MEMBER_INVITE" -Members "MyMembers" -Partners "MyPartners" # CreateMembershipOrPartnershipInvitesBody | An object with the properties: invite_type, partners, members, business_role

# Create invites or requests
try {
    $Result = New-MembershipOrPartnershipInvites -BusinessId $BusinessId -CreateMembershipOrPartnershipInvitesBody $CreateMembershipOrPartnershipInvitesBody
} catch {
    Write-Host ("Exception occurred when calling New-MembershipOrPartnershipInvites: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Business id | 
 **CreateMembershipOrPartnershipInvitesBody** | [**CreateMembershipOrPartnershipInvitesBody**](CreateMembershipOrPartnershipInvitesBody.md)| An object with the properties: invite_type, partners, members, business_role | 

### Return type

[**CreateInvitesResultsResponseArray**](CreateInvitesResultsResponseArray.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-Invites"></a>
# **Get-Invites**
> GetInvites200Response Get-Invites<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-BusinessId] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-IsMember] <System.Nullable[Boolean]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-InviteStatus] <String[]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-InviteType] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Bookmark] <String><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-PageSize] <System.Nullable[Int32]><br>

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$BusinessId = "729090764583391194" # String | Unique identifier of the requesting business.
$IsMember = $true # Boolean | A boolean field to indicate whether the invite is to create a partnership or a membership. (optional) (default to $true)
$InviteStatus = "PENDING" # String[] | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. (optional)
$InviteType = "MEMBER_INVITE" # InviteType | Invite type to filter invites by. Only invites of the specified type will be returned. (optional)
$Bookmark = "MyBookmark" # String | Cursor used to fetch the next page of items (optional)
$PageSize = 56 # Int32 | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

# Get invites/requests
try {
    $Result = Get-Invites -BusinessId $BusinessId -IsMember $IsMember -InviteStatus $InviteStatus -InviteType $InviteType -Bookmark $Bookmark -PageSize $PageSize
} catch {
    Write-Host ("Exception occurred when calling Get-Invites: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **BusinessId** | **String**| Unique identifier of the requesting business. | 
 **IsMember** | **Boolean**| A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional] [default to $true]
 **InviteStatus** | [**String[]**](String.md)| A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional] 
 **InviteType** | [**InviteType**](InviteType.md)| Invite type to filter invites by. Only invites of the specified type will be returned. | [optional] 
 **Bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **PageSize** | **Int32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**GetInvites200Response**](GetInvites200Response.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Invoke-RespondBusinessAccessInvites"></a>
# **Invoke-RespondBusinessAccessInvites**
> RespondToInvitesResponseArray Invoke-RespondBusinessAccessInvites<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-AuthRespondInvitesBody] <PSCustomObject><br>

Accept or decline an invite/request

Accept or decline invites or requests.

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: pinterest_oauth2
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$AuthRespondInvitesBodyInvitesInnerAction = Initialize-AuthRespondInvitesBodyInvitesInnerAction -AcceptInvite $false -AssetIdToPermissions @{ key_example = "ADMIN" }
$AuthRespondInvitesBodyInvitesInner = Initialize-AuthRespondInvitesBodyInvitesInner -Action $AuthRespondInvitesBodyInvitesInnerAction -InviteId "MyInviteId"

$AuthRespondInvitesBody = Initialize-AuthRespondInvitesBody -Invites $AuthRespondInvitesBodyInvitesInner # AuthRespondInvitesBody | 

# Accept or decline an invite/request
try {
    $Result = Invoke-RespondBusinessAccessInvites -AuthRespondInvitesBody $AuthRespondInvitesBody
} catch {
    Write-Host ("Exception occurred when calling Invoke-RespondBusinessAccessInvites: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **AuthRespondInvitesBody** | [**AuthRespondInvitesBody**](AuthRespondInvitesBody.md)|  | 

### Return type

[**RespondToInvitesResponseArray**](RespondToInvitesResponseArray.md) (PSCustomObject)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

