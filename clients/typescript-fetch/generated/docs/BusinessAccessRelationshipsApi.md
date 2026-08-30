# BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**brandAccountsCreate**](BusinessAccessRelationshipsApi.md#brandaccountscreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account |
| [**brandAccountsUpdate**](BusinessAccessRelationshipsApi.md#brandaccountsupdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account |
| [**deleteBusinessMembership**](BusinessAccessRelationshipsApi.md#deletebusinessmembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships |
| [**deleteBusinessPartners**](BusinessAccessRelationshipsApi.md#deletebusinesspartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships |
| [**getBusinessEmployers**](BusinessAccessRelationshipsApi.md#getbusinessemployers) | **GET** /businesses/employers | List business employers for user |
| [**getBusinessMembers**](BusinessAccessRelationshipsApi.md#getbusinessmembers) | **GET** /businesses/{business_id}/members | Get business members |
| [**getBusinessPartners**](BusinessAccessRelationshipsApi.md#getbusinesspartners) | **GET** /businesses/{business_id}/partners | Get business partners |
| [**systemUserUpdate**](BusinessAccessRelationshipsApi.md#systemuserupdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information. |
| [**updateBusinessMemberships**](BusinessAccessRelationshipsApi.md#updatebusinessmemberships) | **PATCH** /businesses/{business_id}/members | Update member\&#39;s business role |



## brandAccountsCreate

> BrandAccount brandAccountsCreate(businessHierarchyId, brandAccountCreate)

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Example

```ts
import {
  Configuration,
  BusinessAccessRelationshipsApi,
} from '';
import type { BrandAccountsCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessRelationshipsApi(config);

  const body = {
    // string | business hierarchy node id
    businessHierarchyId: businessHierarchyId_example,
    // BrandAccountCreate
    brandAccountCreate: ...,
  } satisfies BrandAccountsCreateRequest;

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
| **brandAccountCreate** | [BrandAccountCreate](BrandAccountCreate.md) |  | |

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## brandAccountsUpdate

> BrandAccount brandAccountsUpdate(brandAccountId, businessHierarchyId, brandAccountUpdate)

Update a Brand Account

Update an existing Brand Account

### Example

```ts
import {
  Configuration,
  BusinessAccessRelationshipsApi,
} from '';
import type { BrandAccountsUpdateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessRelationshipsApi(config);

  const body = {
    // string
    brandAccountId: brandAccountId_example,
    // string | business hierarchy node id
    businessHierarchyId: businessHierarchyId_example,
    // BrandAccountUpdate
    brandAccountUpdate: ...,
  } satisfies BrandAccountsUpdateRequest;

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
| **brandAccountId** | `string` |  | [Defaults to `undefined`] |
| **businessHierarchyId** | `string` | business hierarchy node id | [Defaults to `undefined`] |
| **brandAccountUpdate** | [BrandAccountUpdate](BrandAccountUpdate.md) |  | |

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **409** | The request could not be processed because of a conflict in the current state of the resource. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## deleteBusinessMembership

> DeleteBusinessMembership200Response deleteBusinessMembership(businessId, deleteBusinessMembershipBody)

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
    businessId: businessId_example,
    // DeleteBusinessMembershipBody
    deleteBusinessMembershipBody: ...,
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
| **deleteBusinessMembershipBody** | [DeleteBusinessMembershipBody](DeleteBusinessMembershipBody.md) |  | |

### Return type

[**DeleteBusinessMembership200Response**](DeleteBusinessMembership200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## deleteBusinessPartners

> DeleteBusinessPartners deleteBusinessPartners(businessId, deleteBusinessPartnersDelete)

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
    businessId: businessId_example,
    // DeleteBusinessPartnersDelete
    deleteBusinessPartnersDelete: ...,
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
| **deleteBusinessPartnersDelete** | [DeleteBusinessPartnersDelete](DeleteBusinessPartnersDelete.md) |  | |

### Return type

[**DeleteBusinessPartners**](DeleteBusinessPartners.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getBusinessEmployers

> GetBusinessEmployers200Response getBusinessEmployers(assetsSummary, bookmark, pageSize)

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
    // boolean | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional)
    assetsSummary: true,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
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
| **assetsSummary** | `boolean` | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [Optional] [Defaults to `true`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getBusinessMembers

> GetBusinessEmployers200Response getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)

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
    businessId: businessId_example,
    // boolean | Fetches system users if True. Fetches regular user employees if False. (optional)
    fetchSystemUsers: true,
    // boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional)
    assetsSummary: true,
    // Array<MemberBusinessRole> | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
    businessRoles: ...,
    // string | A list of business members ids separated by comma. (optional)
    memberIds: memberIds_example,
    // number | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
    startIndex: 56,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
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
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getBusinessPartners

> GetBusinessEmployers200Response getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize)

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
    businessId: businessId_example,
    // boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional)
    assetsSummary: true,
    // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner\'s business asset. (optional)
    partnerType: ...,
    // string | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
    partnerIds: partnerIds_example,
    // number | An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
    startIndex: 56,
    // boolean | Sort ascending. (optional)
    sortAscending: true,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
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
| **partnerType** | `PartnerType` | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner\&#39;s business asset. | [Optional] [Defaults to `undefined`] [Enum: INTERNAL, EXTERNAL] |
| **partnerIds** | `string` | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [Optional] [Defaults to `undefined`] |
| **startIndex** | `number` | An index to start fetching the results from. Only the results starting from this index will be returned. | [Optional] [Defaults to `0`] |
| **sortAscending** | `boolean` | Sort ascending. | [Optional] [Defaults to `undefined`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## systemUserUpdate

> systemUserUpdate(businessId, systemUserId, systemUserUpdateWithRequiredBody)

Update a system user information.

Update a system user information such as name.

### Example

```ts
import {
  Configuration,
  BusinessAccessRelationshipsApi,
} from '';
import type { SystemUserUpdateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new BusinessAccessRelationshipsApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // string | Unique identifier of a system user.
    systemUserId: systemUserId_example,
    // SystemUserUpdateWithRequiredBody
    systemUserUpdateWithRequiredBody: ...,
  } satisfies SystemUserUpdateRequest;

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
| **systemUserUpdateWithRequiredBody** | [SystemUserUpdateWithRequiredBody](SystemUserUpdateWithRequiredBody.md) |  | |

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## updateBusinessMemberships

> UpdateBusinessMembershipsResponse updateBusinessMemberships(businessId, businessMembershipMember)

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
    businessId: businessId_example,
    // Array<BusinessMembershipMember>
    businessMembershipMember: ...,
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
| **businessMembershipMember** | `Array<BusinessMembershipMember>` |  | |

### Return type

[**UpdateBusinessMembershipsResponse**](UpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

