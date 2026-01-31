# BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**brandAccountsCreate**](BusinessAccessRelationshipsApi.md#brandaccountscreateoperation) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account |
| [**brandAccountsUpdate**](BusinessAccessRelationshipsApi.md#brandaccountsupdateoperation) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account |
| [**deleteBusinessMembership**](BusinessAccessRelationshipsApi.md#deletebusinessmembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships |
| [**deleteBusinessPartners**](BusinessAccessRelationshipsApi.md#deletebusinesspartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships |
| [**getBusinessEmployers**](BusinessAccessRelationshipsApi.md#getbusinessemployers) | **GET** /businesses/employers | List business employers for user |
| [**getBusinessMembers**](BusinessAccessRelationshipsApi.md#getbusinessmembers) | **GET** /businesses/{business_id}/members | Get business members |
| [**getBusinessPartners**](BusinessAccessRelationshipsApi.md#getbusinesspartners) | **GET** /businesses/{business_id}/partners | Get business partners |
| [**systemUserUpdate**](BusinessAccessRelationshipsApi.md#systemuserupdateoperation) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information. |
| [**updateBusinessMemberships**](BusinessAccessRelationshipsApi.md#updatebusinessmemberships) | **PATCH** /businesses/{business_id}/members | Update member\&#39;s business role |



## brandAccountsCreate

> BrandAccountsCreate200Response brandAccountsCreate(businessHierarchyId, brandAccountsCreateRequest)

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Example

```ts
import {
  Configuration,
  BusinessAccessRelationshipsApi,
} from '';
import type { BrandAccountsCreateOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessRelationshipsApi(config);

  const body = {
    // string | business hierarchy node id
    businessHierarchyId: 7009386637860,
    // BrandAccountsCreateRequest
    brandAccountsCreateRequest: ...,
  } satisfies BrandAccountsCreateOperationRequest;

  try {
    const data = await api.brandAccountsCreate(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessHierarchyId** | `string` | business hierarchy node id | [Defaults to `undefined`] |
| **brandAccountsCreateRequest** | [BrandAccountsCreateRequest](BrandAccountsCreateRequest.md) |  | |

### Return type

[**BrandAccountsCreate200Response**](BrandAccountsCreate200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## brandAccountsUpdate

> BrandAccountsCreate200Response brandAccountsUpdate(businessHierarchyId, brandAccountId, brandAccountsUpdateRequest)

Update a Brand Account

Update an existing Brand Account

### Example

```ts
import {
  Configuration,
  BusinessAccessRelationshipsApi,
} from '';
import type { BrandAccountsUpdateOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessRelationshipsApi(config);

  const body = {
    // string | business hierarchy node id
    businessHierarchyId: 7009386637860,
    // string | Unique identifier of a brand account.
    brandAccountId: 729090764583391194,
    // BrandAccountsUpdateRequest
    brandAccountsUpdateRequest: ...,
  } satisfies BrandAccountsUpdateOperationRequest;

  try {
    const data = await api.brandAccountsUpdate(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessHierarchyId** | `string` | business hierarchy node id | [Defaults to `undefined`] |
| **brandAccountId** | `string` | Unique identifier of a brand account. | [Defaults to `undefined`] |
| **brandAccountsUpdateRequest** | [BrandAccountsUpdateRequest](BrandAccountsUpdateRequest.md) |  | |

### Return type

[**BrandAccountsCreate200Response**](BrandAccountsCreate200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **401** | Not authenticated to update Brand Account |  -  |
| **403** | Not authorized to update Brand Account |  -  |
| **404** | Brand account not found |  -  |
| **409** | This account is not a brand account. |  -  |
| **429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## deleteBusinessMembership

> DeletedMembersResponse deleteBusinessMembership(businessId, membersToDeleteBody)

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example

```ts
import {
  Configuration,
  BusinessAccessRelationshipsApi,
} from '';
import type { DeleteBusinessMembershipRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessRelationshipsApi(config);

  const body = {
    // string | Business id
    businessId: 729090764583391194,
    // MembersToDeleteBody | List of members with role to delete.
    membersToDeleteBody: ...,
  } satisfies DeleteBusinessMembershipRequest;

  try {
    const data = await api.deleteBusinessMembership(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Business id | [Defaults to `undefined`] |
| **membersToDeleteBody** | [MembersToDeleteBody](MembersToDeleteBody.md) | List of members with role to delete. | |

### Return type

[**DeletedMembersResponse**](DeletedMembersResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## deleteBusinessPartners

> DeletePartnersResponse deleteBusinessPartners(businessId, deletePartnersRequest)

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example

```ts
import {
  Configuration,
  BusinessAccessRelationshipsApi,
} from '';
import type { DeleteBusinessPartnersRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessRelationshipsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: 729090764583391194,
    // DeletePartnersRequest | An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 
    deletePartnersRequest: ...,
  } satisfies DeleteBusinessPartnersRequest;

  try {
    const data = await api.deleteBusinessPartners(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **deletePartnersRequest** | [DeletePartnersRequest](DeletePartnersRequest.md) | An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  | |

### Return type

[**DeletePartnersResponse**](DeletePartnersResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | A supplied partner id doesn\&#39;t exist |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getBusinessEmployers

> GetBusinessEmployers200Response getBusinessEmployers(pageSize, bookmark)

List business employers for user

Get all of the viewing user\&#39;s business employers.

### Example

```ts
import {
  Configuration,
  BusinessAccessRelationshipsApi,
} from '';
import type { GetBusinessEmployersRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessRelationshipsApi(config);

  const body = {
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
    pageSize: 56,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
  } satisfies GetBusinessEmployersRequest;

  try {
    const data = await api.getBusinessEmployers(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getBusinessMembers

> GetBusinessMembers200Response getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)

Get business members

Get all members of the specified business. The return response will include the member\&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE

### Example

```ts
import {
  Configuration,
  BusinessAccessRelationshipsApi,
} from '';
import type { GetBusinessMembersRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessRelationshipsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: 729090764583391194,
    // boolean | Fetches system users if True. Fetches regular user employees if False. (optional)
    fetchSystemUsers: true,
    // boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional)
    assetsSummary: true,
    // Array<MemberBusinessRole> | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
    businessRoles: ...,
    // string | A list of business members ids separated by comma. (optional)
    memberIds: 00101010101,2222220101,
    // number | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
    startIndex: 0,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
    pageSize: 56,
  } satisfies GetBusinessMembersRequest;

  try {
    const data = await api.getBusinessMembers(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **fetchSystemUsers** | `boolean` | Fetches system users if True. Fetches regular user employees if False. | [Optional] [Defaults to `false`] |
| **assetsSummary** | `boolean` | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [Optional] [Defaults to `false`] |
| **businessRoles** | `Array<MemberBusinessRole>` | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [Optional] |
| **memberIds** | `string` | A list of business members ids separated by comma. | [Optional] [Defaults to `undefined`] |
| **startIndex** | `number` | An index to start fetching the results from. Only the results starting from this index will be returned. | [Optional] [Defaults to `0`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |

### Return type

[**GetBusinessMembers200Response**](GetBusinessMembers200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getBusinessPartners

> GetBusinessPartners200Response getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark)

Get business partners

Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner\&#39;s business assets the partner has granted you   access to.

### Example

```ts
import {
  Configuration,
  BusinessAccessRelationshipsApi,
} from '';
import type { GetBusinessPartnersRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessRelationshipsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: 729090764583391194,
    // boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional)
    assetsSummary: true,
    // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner\'s business asset. (optional)
    partnerType: INTERNAL,
    // string | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
    partnerIds: 00101010101,2222220101,
    // number | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
    startIndex: 0,
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
    pageSize: 56,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
  } satisfies GetBusinessPartnersRequest;

  try {
    const data = await api.getBusinessPartners(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **assetsSummary** | `boolean` | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [Optional] [Defaults to `false`] |
| **partnerType** | `PartnerType` | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner\&#39;s business asset. | [Optional] [Defaults to `undefined`] [Enum: INTERNAL, EXTERNAL] |
| **partnerIds** | `string` | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [Optional] [Defaults to `undefined`] |
| **startIndex** | `number` | An index to start fetching the results from. Only the results starting from this index will be returned. | [Optional] [Defaults to `0`] |
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |

### Return type

[**GetBusinessPartners200Response**](GetBusinessPartners200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## systemUserUpdate

> systemUserUpdate(businessId, systemUserId, systemUserUpdateRequest)

Update a system user information.

Update a system user information such as name.

### Example

```ts
import {
  Configuration,
  BusinessAccessRelationshipsApi,
} from '';
import type { SystemUserUpdateOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessRelationshipsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: 729090764583391194,
    // string | Unique identifier of a system user.
    systemUserId: 729090764583391194,
    // SystemUserUpdateRequest
    systemUserUpdateRequest: ...,
  } satisfies SystemUserUpdateOperationRequest;

  try {
    const data = await api.systemUserUpdate(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **systemUserId** | `string` | Unique identifier of a system user. | [Defaults to `undefined`] |
| **systemUserUpdateRequest** | [SystemUserUpdateRequest](SystemUserUpdateRequest.md) |  | |

### Return type

`void` (Empty response body)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | System user updated successfully. |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## updateBusinessMemberships

> UpdateMemberResultsResponseArray updateBusinessMemberships(businessId, updateMemberBusinessRoleBody)

Update member\&#39;s business role

Update a member\&#39;s business role within the business.

### Example

```ts
import {
  Configuration,
  BusinessAccessRelationshipsApi,
} from '';
import type { UpdateBusinessMembershipsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessRelationshipsApi(config);

  const body = {
    // string | Business id
    businessId: 729090764583391194,
    // Array<UpdateMemberBusinessRoleBody> | List of objects with the member id and the business_role.
    updateMemberBusinessRoleBody: ...,
  } satisfies UpdateBusinessMembershipsRequest;

  try {
    const data = await api.updateBusinessMemberships(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **businessId** | `string` | Business id | [Defaults to `undefined`] |
| **updateMemberBusinessRoleBody** | `Array<UpdateMemberBusinessRoleBody>` | List of objects with the member id and the business_role. | |

### Return type

[**UpdateMemberResultsResponseArray**](UpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

