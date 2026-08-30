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
> BrandAccount brandAccountsCreate(brandAccountCreate)

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

### Example

```typescript
import {
    BusinessAccessRelationshipsApi,
    Configuration,
    BrandAccountCreate
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

let businessHierarchyId: string; //business hierarchy node id (default to undefined)
let brandAccountCreate: BrandAccountCreate; //

const { status, data } = await apiInstance.brandAccountsCreate(
    businessHierarchyId,
    brandAccountCreate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **brandAccountCreate** | **BrandAccountCreate**|  | |
| **businessHierarchyId** | [**string**] | business hierarchy node id | defaults to undefined|


### Return type

**BrandAccount**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**201** | Resource create operation completed successfully. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **brandAccountsUpdate**
> BrandAccount brandAccountsUpdate(brandAccountUpdate)

Update an existing Brand Account

### Example

```typescript
import {
    BusinessAccessRelationshipsApi,
    Configuration,
    BrandAccountUpdate
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

let brandAccountId: string; // (default to undefined)
let businessHierarchyId: string; //business hierarchy node id (default to undefined)
let brandAccountUpdate: BrandAccountUpdate; //

const { status, data } = await apiInstance.brandAccountsUpdate(
    brandAccountId,
    businessHierarchyId,
    brandAccountUpdate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **brandAccountUpdate** | **BrandAccountUpdate**|  | |
| **brandAccountId** | [**string**] |  | defaults to undefined|
| **businessHierarchyId** | [**string**] | business hierarchy node id | defaults to undefined|


### Return type

**BrandAccount**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**409** | The request could not be processed because of a conflict in the current state of the resource. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteBusinessMembership**
> DeleteBusinessMembership200Response deleteBusinessMembership(deleteBusinessMembershipBody)

Terminate memberships between the specified members and your business.

### Example

```typescript
import {
    BusinessAccessRelationshipsApi,
    Configuration,
    DeleteBusinessMembershipBody
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

let businessId: string; //Business id (default to undefined)
let deleteBusinessMembershipBody: DeleteBusinessMembershipBody; //

const { status, data } = await apiInstance.deleteBusinessMembership(
    businessId,
    deleteBusinessMembershipBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **deleteBusinessMembershipBody** | **DeleteBusinessMembershipBody**|  | |
| **businessId** | [**string**] | Business id | defaults to undefined|


### Return type

**DeleteBusinessMembership200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteBusinessPartners**
> DeleteBusinessPartners deleteBusinessPartners(deleteBusinessPartnersDelete)

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example

```typescript
import {
    BusinessAccessRelationshipsApi,
    Configuration,
    DeleteBusinessPartnersDelete
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let deleteBusinessPartnersDelete: DeleteBusinessPartnersDelete; //

const { status, data } = await apiInstance.deleteBusinessPartners(
    businessId,
    deleteBusinessPartnersDelete
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **deleteBusinessPartnersDelete** | **DeleteBusinessPartnersDelete**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**DeleteBusinessPartners**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**0** | An unexpected error response. |  -  |

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

let assetsSummary: boolean; //Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to true)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.getBusinessEmployers(
    assetsSummary,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **assetsSummary** | [**boolean**] | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | (optional) defaults to true|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBusinessMembers**
> GetBusinessEmployers200Response getBusinessMembers()

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
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

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
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBusinessPartners**
> GetBusinessEmployers200Response getBusinessPartners()

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
let partnerType: PartnerType; //Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner\'s business asset. (optional) (default to undefined)
let partnerIds: string; //A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional) (default to undefined)
let startIndex: number; //An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let sortAscending: boolean; //Sort ascending. (optional) (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.getBusinessPartners(
    businessId,
    assetsSummary,
    partnerType,
    partnerIds,
    startIndex,
    sortAscending,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **assetsSummary** | [**boolean**] | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | (optional) defaults to false|
| **partnerType** | **PartnerType** | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner\&#39;s business asset. | (optional) defaults to undefined|
| **partnerIds** | [**string**] | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | (optional) defaults to undefined|
| **startIndex** | [**number**] | An index to start fetching the results from. Only the results starting from this index will be returned. | (optional) defaults to 0|
| **sortAscending** | [**boolean**] | Sort ascending. | (optional) defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **systemUserUpdate**
> systemUserUpdate(systemUserUpdateWithRequiredBody)

Update a system user information such as name.

### Example

```typescript
import {
    BusinessAccessRelationshipsApi,
    Configuration,
    SystemUserUpdateWithRequiredBody
} from './api';

const configuration = new Configuration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let systemUserId: string; //Unique identifier of a system user. (default to undefined)
let systemUserUpdateWithRequiredBody: SystemUserUpdateWithRequiredBody; //

const { status, data } = await apiInstance.systemUserUpdate(
    businessId,
    systemUserId,
    systemUserUpdateWithRequiredBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **systemUserUpdateWithRequiredBody** | **SystemUserUpdateWithRequiredBody**|  | |
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
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateBusinessMemberships**
> UpdateBusinessMembershipsResponse updateBusinessMemberships(businessMembershipMember)

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
let businessMembershipMember: Array<BusinessMembershipMember>; //

const { status, data } = await apiInstance.updateBusinessMemberships(
    businessId,
    businessMembershipMember
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessMembershipMember** | **Array<BusinessMembershipMember>**|  | |
| **businessId** | [**string**] | Business id | defaults to undefined|


### Return type

**UpdateBusinessMembershipsResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

