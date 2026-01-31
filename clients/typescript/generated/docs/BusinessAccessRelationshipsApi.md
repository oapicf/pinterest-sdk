# .BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBusinessMembership**](BusinessAccessRelationshipsApi.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**deleteBusinessPartners**](BusinessAccessRelationshipsApi.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**getBusinessEmployers**](BusinessAccessRelationshipsApi.md#getBusinessEmployers) | **GET** /businesses/employers | List business employers for user
[**getBusinessMembers**](BusinessAccessRelationshipsApi.md#getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
[**getBusinessPartners**](BusinessAccessRelationshipsApi.md#getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**updateBusinessMemberships**](BusinessAccessRelationshipsApi.md#updateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member\&#39;s business role


# **deleteBusinessMembership**
> DeletedMembersResponse deleteBusinessMembership(membersToDeleteBody)

Terminate memberships between the specified members and your business.

### Example


```typescript
import { createConfiguration, BusinessAccessRelationshipsApi } from '';
import type { BusinessAccessRelationshipsApiDeleteBusinessMembershipRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

const request: BusinessAccessRelationshipsApiDeleteBusinessMembershipRequest = {
    // Business id
  businessId: "729090764583391194",
    // List of members with role to delete.
  membersToDeleteBody: {
    members: [
      {
        memberId: "140943737684417",
        businessRole: "BIZ_ADMIN",
      },
    ],
  },
};

const data = await apiInstance.deleteBusinessMembership(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **membersToDeleteBody** | **MembersToDeleteBody**| List of members with role to delete. |
 **businessId** | [**string**] | Business id | defaults to undefined


### Return type

**DeletedMembersResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **deleteBusinessPartners**
> DeletePartnersResponse deleteBusinessPartners(deletePartnersRequest)

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example


```typescript
import { createConfiguration, BusinessAccessRelationshipsApi } from '';
import type { BusinessAccessRelationshipsApiDeleteBusinessPartnersRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

const request: BusinessAccessRelationshipsApiDeleteBusinessPartnersRequest = {
    // Unique identifier of the requesting business.
  businessId: "729090764583391194",
    // An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 
  deletePartnersRequest: {
    partnerIds: [
      "1234567890123",
    ],
    partnerType: "partnerType_example",
  },
};

const data = await apiInstance.deleteBusinessPartners(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deletePartnersRequest** | **DeletePartnersRequest**| An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  |
 **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined


### Return type

**DeletePartnersResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | A supplied partner id doesn\&#39;t exist |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getBusinessEmployers**
> GetBusinessEmployers200Response getBusinessEmployers()

Get all of the viewing user\'s business employers.

### Example


```typescript
import { createConfiguration, BusinessAccessRelationshipsApi } from '';
import type { BusinessAccessRelationshipsApiGetBusinessEmployersRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

const request: BusinessAccessRelationshipsApiGetBusinessEmployersRequest = {
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
};

const data = await apiInstance.getBusinessEmployers(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined


### Return type

**GetBusinessEmployers200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getBusinessMembers**
> GetBusinessMembers200Response getBusinessMembers()

Get all members of the specified business. The return response will include the member\'s business_role and assets they have access to if assets_summary=TRUE

### Example


```typescript
import { createConfiguration, BusinessAccessRelationshipsApi } from '';
import type { BusinessAccessRelationshipsApiGetBusinessMembersRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

const request: BusinessAccessRelationshipsApiGetBusinessMembersRequest = {
    // Unique identifier of the requesting business.
  businessId: "729090764583391194",
    // Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional)
  assetsSummary: false,
    // A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
  businessRoles: [
    "BIZ_ADMIN",
  ],
    // A list of business members ids separated by comma. (optional)
  memberIds: "00101010101,2222220101",
    // An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
  startIndex: 0,
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
};

const data = await apiInstance.getBusinessMembers(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined
 **assetsSummary** | [**boolean**] | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | (optional) defaults to false
 **businessRoles** | **Array&lt;MemberBusinessRole&gt;** | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | (optional) defaults to undefined
 **memberIds** | [**string**] | A list of business members ids separated by comma. | (optional) defaults to undefined
 **startIndex** | [**number**] | An index to start fetching the results from. Only the results starting from this index will be returned. | (optional) defaults to 0
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25


### Return type

**GetBusinessMembers200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **getBusinessPartners**
> GetBusinessPartners200Response getBusinessPartners()

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner\'s business assets the partner has granted you   access to.

### Example


```typescript
import { createConfiguration, BusinessAccessRelationshipsApi } from '';
import type { BusinessAccessRelationshipsApiGetBusinessPartnersRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

const request: BusinessAccessRelationshipsApiGetBusinessPartnersRequest = {
    // Unique identifier of the requesting business.
  businessId: "729090764583391194",
    // Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional)
  assetsSummary: false,
    // Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner\'s business asset. (optional)
  partnerType: "INTERNAL",
    // A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
  partnerIds: "00101010101,2222220101",
    // An index to start fetching the results from. Only the results starting from this index will be returned. (optional)
  startIndex: 0,
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
};

const data = await apiInstance.getBusinessPartners(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined
 **assetsSummary** | [**boolean**] | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | (optional) defaults to false
 **partnerType** | **PartnerType** | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner\&#39;s business asset. | (optional) defaults to undefined
 **partnerIds** | [**string**] | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | (optional) defaults to undefined
 **startIndex** | [**number**] | An index to start fetching the results from. Only the results starting from this index will be returned. | (optional) defaults to 0
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined


### Return type

**GetBusinessPartners200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **updateBusinessMemberships**
> UpdateMemberResultsResponseArray updateBusinessMemberships(updateMemberBusinessRoleBody)

Update a member\'s business role within the business.

### Example


```typescript
import { createConfiguration, BusinessAccessRelationshipsApi } from '';
import type { BusinessAccessRelationshipsApiUpdateBusinessMembershipsRequest } from '';

const configuration = createConfiguration();
const apiInstance = new BusinessAccessRelationshipsApi(configuration);

const request: BusinessAccessRelationshipsApiUpdateBusinessMembershipsRequest = {
    // Business id
  businessId: "729090764583391194",
    // List of objects with the member id and the business_role.
  updateMemberBusinessRoleBody: [
    {
      businessRole: "BIZ_ADMIN",
      memberId: "140943737684417",
    },
  ],
};

const data = await apiInstance.updateBusinessMemberships(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **updateMemberBusinessRoleBody** | **Array<UpdateMemberBusinessRoleBody>**| List of objects with the member id and the business_role. |
 **businessId** | [**string**] | Business id | defaults to undefined


### Return type

**UpdateMemberResultsResponseArray**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


