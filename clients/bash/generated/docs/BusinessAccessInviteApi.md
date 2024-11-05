# BusinessAccessInviteApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetAccessRequestsCreate**](BusinessAccessInviteApi.md#assetAccessRequestsCreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets.
[**cancelInvitesOrRequests**](BusinessAccessInviteApi.md#cancelInvitesOrRequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests
[**createAssetInvites**](BusinessAccessInviteApi.md#createAssetInvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission
[**createMembershipOrPartnershipInvites**](BusinessAccessInviteApi.md#createMembershipOrPartnershipInvites) | **POST** /businesses/{business_id}/invites | Create invites or requests
[**getInvites**](BusinessAccessInviteApi.md#getInvites) | **GET** /businesses/{business_id}/invites | Get invites/requests
[**respondBusinessAccessInvites**](BusinessAccessInviteApi.md#respondBusinessAccessInvites) | **PATCH** /businesses/invites | Accept or decline an invite/request



## assetAccessRequestsCreate

Create a request to access an existing partner's assets.

Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Example

```bash
 assetAccessRequestsCreate business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **createAssetAccessRequestBody** | [**CreateAssetAccessRequestBody**](CreateAssetAccessRequestBody.md) |  |

### Return type

[**CreateAssetAccessRequestResponse**](CreateAssetAccessRequestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## cancelInvitesOrRequests

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Example

```bash
 cancelInvitesOrRequests business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Business id | [default to null]
 **cancelInvitesBody** | [**CancelInvitesBody**](CancelInvitesBody.md) | A list with invite ids |

### Return type

[**DeleteInvitesResultsResponseArray**](DeleteInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createAssetInvites

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to:
- Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing
  partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your
  partner's assets.
    - invite_type=\"PARTNER_REQUEST\"
- Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.
  If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to
  new assets.
    - invite_type=\"PARTNER_INVITE\"
- Invite a member to access your business assets. Note: This is only for when there is no existing membership.
  If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new
  assets.
    - invite_type=\"MEMBER_INVITE\"

To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Example

```bash
 createAssetInvites business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **createAssetInvitesRequest** | [**CreateAssetInvitesRequest**](CreateAssetInvitesRequest.md) | A list of invites/requests together with the asset permissions to be assigned to the invite/request. |

### Return type

[**UpdateInvitesResultsResponseArray**](UpdateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## createMembershipOrPartnershipInvites

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below.
- Invite members to join the business. This would required specifying the following:
    - invite_type=\"MEMBER_INVITE\"
    - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit
    https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)
    - members
- Invite partners to access your business assets. This would require specifying the following:
    - invite_type=\"PARTNER_INVITE\"
    - business_role=\"PARTNER\"
    - partners
- Request to be a partner so you can access their assets. This would require specifying the following:
    - invite_type=\"PARTNER_REQUEST\"
    - business_role=\"PARTNER\"
    - partners

### Example

```bash
 createMembershipOrPartnershipInvites business_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Business id | [default to null]
 **createMembershipOrPartnershipInvitesBody** | [**CreateMembershipOrPartnershipInvitesBody**](CreateMembershipOrPartnershipInvitesBody.md) | An object with the properties: invite_type, partners, members, business_role |

### Return type

[**CreateInvitesResultsResponseArray**](CreateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getInvites

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Example

```bash
 getInvites business_id=value  is_member=value  Specify as:  invite_status=value1 invite_status=value2 invite_status=...  invite_type=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **string** | Unique identifier of the requesting business. | [default to null]
 **isMember** | **boolean** | A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional] [default to true]
 **inviteStatus** | [**array[string]**](string.md) | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional] [default to null]
 **inviteType** | [**InviteType**](.md) | Invite type to filter invites by. Only invites of the specified type will be returned. | [optional] [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. | [optional] [default to 25]

### Return type

[**GetInvites200Response**](GetInvites200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## respondBusinessAccessInvites

Accept or decline an invite/request

Accept or decline invites or requests.

### Example

```bash
 respondBusinessAccessInvites
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authRespondInvitesBody** | [**AuthRespondInvitesBody**](AuthRespondInvitesBody.md) |  |

### Return type

[**RespondToInvitesResponseArray**](RespondToInvitesResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

