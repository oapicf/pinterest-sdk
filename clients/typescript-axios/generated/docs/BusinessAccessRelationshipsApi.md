# BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**brandAccountsCreate**](#brandaccountscreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account|
|[**brandAccountsUpdate**](#brandaccountsupdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account|
|[**deleteBusinessMembership**](#deletebusinessmembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships|
|[**deleteBusinessPartners**](#deletebusinesspartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships|
|[**getBusinessEmployers**](#getbusinessemployers) | **GET** /businesses/employers | List business employers for user|
|[**getBusinessMembers**](#getbusinessmembers) | **GET** /businesses/{business_id}/members | Get business members|
|[**getBusinessPartners**](#getbusinesspartners) | **GET** /businesses/{business_id}/partners | Get business partners|
|[**systemUserUpdate**](#systemuserupdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information.|
|[**updateBusinessMemberships**](#updatebusinessmemberships) | **PATCH** /businesses/{business_id}/members | Update member\&#39;s business role|

# **brandAccountsCreate**
> BrandAccountsCreate200Response brandAccountsCreate(brandAccountsCreateRequest)

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Example

```typescript
import {
    BusinessAccessRelationshipsApi,
    Configuration,
    BrandAccountsCreateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

let businessHierarchyId: string; //business hierarchy node id (default to undefined)
let brandAccountsCreateRequest: BrandAccountsCreateRequest; //

const { status, data } = await apiInstance.brandAccountsCreate(
    businessHierarchyId,
    brandAccountsCreateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **brandAccountsCreateRequest** | **BrandAccountsCreateRequest**|  | |
| **businessHierarchyId** | [**string**] | business hierarchy node id | defaults to undefined|


### Return type

**BrandAccountsCreate200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid parameters. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **brandAccountsUpdate**
> BrandAccountsCreate200Response brandAccountsUpdate(brandAccountsUpdateRequest)

Update an existing Brand Account

### Example

```typescript
import {
    BusinessAccessRelationshipsApi,
    Configuration,
    BrandAccountsUpdateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

let businessHierarchyId: string; //business hierarchy node id (default to undefined)
let brandAccountId: string; //Unique identifier of a brand account. (default to undefined)
let brandAccountsUpdateRequest: BrandAccountsUpdateRequest; //

const { status, data } = await apiInstance.brandAccountsUpdate(
    businessHierarchyId,
    brandAccountId,
    brandAccountsUpdateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **brandAccountsUpdateRequest** | **BrandAccountsUpdateRequest**|  | |
| **businessHierarchyId** | [**string**] | business hierarchy node id | defaults to undefined|
| **brandAccountId** | [**string**] | Unique identifier of a brand account. | defaults to undefined|


### Return type

**BrandAccountsCreate200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid parameters. |  -  |
|**401** | Not authenticated to update Brand Account |  -  |
|**403** | Not authorized to update Brand Account |  -  |
|**404** | Brand account not found |  -  |
|**409** | This account is not a brand account. |  -  |
|**429** | This request exceeded a rate limit. This can happen if the client exceeds one of the published rate limits within a short time window. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteBusinessMembership**
> DeletedMembersResponse deleteBusinessMembership(membersToDeleteBody)

Terminate memberships between the specified members and your business.

### Example

```typescript
import {
    BusinessAccessRelationshipsApi,
    Configuration,
    MembersToDeleteBody
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

let businessId: string; //Business id (default to undefined)
let membersToDeleteBody: MembersToDeleteBody; //List of members with role to delete.

const { status, data } = await apiInstance.deleteBusinessMembership(
    businessId,
    membersToDeleteBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **membersToDeleteBody** | **MembersToDeleteBody**| List of members with role to delete. | |
| **businessId** | [**string**] | Business id | defaults to undefined|


### Return type

**DeletedMembersResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteBusinessPartners**
> DeletePartnersResponse deleteBusinessPartners(deletePartnersRequest)

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example

```typescript
import {
    BusinessAccessRelationshipsApi,
    Configuration,
    DeletePartnersRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let deletePartnersRequest: DeletePartnersRequest; //An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 

const { status, data } = await apiInstance.deleteBusinessPartners(
    businessId,
    deletePartnersRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **deletePartnersRequest** | **DeletePartnersRequest**| An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**DeletePartnersResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**404** | A supplied partner id doesn\&#39;t exist |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBusinessEmployers**
> GetBusinessEmployers200Response getBusinessEmployers()

Get all of the viewing user\'s business employers.

### Example

```typescript
import {
    BusinessAccessRelationshipsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)

const { status, data } = await apiInstance.getBusinessEmployers(
    pageSize,
    bookmark
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|


### Return type

**GetBusinessEmployers200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBusinessMembers**
> GetBusinessMembers200Response getBusinessMembers()

Get all members of the specified business. The return response will include the member\'s business_role and assets they have access to if assets_summary=TRUE

### Example

```typescript
import {
    BusinessAccessRelationshipsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let fetchSystemUsers: boolean; //Fetches system users if True. Fetches regular user employees if False. (optional) (default to false)
let assetsSummary: boolean; //Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to false)
let businessRoles: Array<MemberBusinessRole>; //A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional) (default to undefined)
let memberIds: string; //A list of business members ids separated by comma. (optional) (default to undefined)
let startIndex: number; //An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)

const { status, data } = await apiInstance.getBusinessMembers(
    businessId,
    fetchSystemUsers,
    assetsSummary,
    businessRoles,
    memberIds,
    startIndex,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **fetchSystemUsers** | [**boolean**] | Fetches system users if True. Fetches regular user employees if False. | (optional) defaults to false|
| **assetsSummary** | [**boolean**] | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | (optional) defaults to false|
| **businessRoles** | **Array&lt;MemberBusinessRole&gt;** | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | (optional) defaults to undefined|
| **memberIds** | [**string**] | A list of business members ids separated by comma. | (optional) defaults to undefined|
| **startIndex** | [**number**] | An index to start fetching the results from. Only the results starting from this index will be returned. | (optional) defaults to 0|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|


### Return type

**GetBusinessMembers200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBusinessPartners**
> GetBusinessPartners200Response getBusinessPartners()

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner\'s business assets the partner has granted you   access to.

### Example

```typescript
import {
    BusinessAccessRelationshipsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let assetsSummary: boolean; //Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to false)
let partnerType: PartnerType; //Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner\'s business asset. (optional) (default to undefined)
let partnerIds: string; //A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional) (default to undefined)
let startIndex: number; //An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)

const { status, data } = await apiInstance.getBusinessPartners(
    businessId,
    assetsSummary,
    partnerType,
    partnerIds,
    startIndex,
    pageSize,
    bookmark
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **assetsSummary** | [**boolean**] | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | (optional) defaults to false|
| **partnerType** | **PartnerType** | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner\&#39;s business asset. | (optional) defaults to undefined|
| **partnerIds** | [**string**] | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | (optional) defaults to undefined|
| **startIndex** | [**number**] | An index to start fetching the results from. Only the results starting from this index will be returned. | (optional) defaults to 0|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|


### Return type

**GetBusinessPartners200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **systemUserUpdate**
> systemUserUpdate(systemUserUpdateRequest)

Update a system user information such as name.

### Example

```typescript
import {
    BusinessAccessRelationshipsApi,
    Configuration,
    SystemUserUpdateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let systemUserId: string; //Unique identifier of a system user. (default to undefined)
let systemUserUpdateRequest: SystemUserUpdateRequest; //

const { status, data } = await apiInstance.systemUserUpdate(
    businessId,
    systemUserId,
    systemUserUpdateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **systemUserUpdateRequest** | **SystemUserUpdateRequest**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **systemUserId** | [**string**] | Unique identifier of a system user. | defaults to undefined|


### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | System user updated successfully. |  -  |
|**400** | Invalid parameters. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateBusinessMemberships**
> UpdateMemberResultsResponseArray updateBusinessMemberships(updateMemberBusinessRoleBody)

Update a member\'s business role within the business.

### Example

```typescript
import {
    BusinessAccessRelationshipsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

let businessId: string; //Business id (default to undefined)
let updateMemberBusinessRoleBody: Array<UpdateMemberBusinessRoleBody>; //List of objects with the member id and the business_role.

const { status, data } = await apiInstance.updateBusinessMemberships(
    businessId,
    updateMemberBusinessRoleBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **updateMemberBusinessRoleBody** | **Array<UpdateMemberBusinessRoleBody>**| List of objects with the member id and the business_role. | |
| **businessId** | [**string**] | Business id | defaults to undefined|


### Return type

**UpdateMemberResultsResponseArray**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | response |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

