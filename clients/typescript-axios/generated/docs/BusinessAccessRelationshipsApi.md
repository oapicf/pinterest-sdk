# BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**deleteBusinessMembership**](#deletebusinessmembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships|
|[**deleteBusinessPartners**](#deletebusinesspartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships|
|[**getBusinessEmployers**](#getbusinessemployers) | **GET** /businesses/employers | List business employers for user|
|[**getBusinessMembers**](#getbusinessmembers) | **GET** /businesses/{business_id}/members | Get business members|
|[**getBusinessPartners**](#getbusinesspartners) | **GET** /businesses/{business_id}/partners | Get business partners|
|[**updateBusinessMemberships**](#updatebusinessmemberships) | **PATCH** /businesses/{business_id}/members | Update member\&#39;s business role|

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
let assetsSummary: boolean; //Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional) (default to false)
let businessRoles: Array<MemberBusinessRole>; //A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional) (default to undefined)
let memberIds: string; //A list of business members ids separated by comma. (optional) (default to undefined)
let startIndex: number; //An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)

const { status, data } = await apiInstance.getBusinessMembers(
    businessId,
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

