# PinterestSdk.BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteBusinessMembership**](BusinessAccessRelationshipsApi.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships
[**deleteBusinessPartners**](BusinessAccessRelationshipsApi.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships
[**getBusinessEmployers**](BusinessAccessRelationshipsApi.md#getBusinessEmployers) | **GET** /businesses/employers | List business employers for user
[**getBusinessMembers**](BusinessAccessRelationshipsApi.md#getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members
[**getBusinessPartners**](BusinessAccessRelationshipsApi.md#getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners
[**updateBusinessMemberships**](BusinessAccessRelationshipsApi.md#updateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role



## deleteBusinessMembership

> DeletedMembersResponse deleteBusinessMembership(businessId, membersToDeleteBody)

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessRelationshipsApi();
let businessId = "729090764583391194"; // String | Business id
let membersToDeleteBody = new PinterestSdk.MembersToDeleteBody(); // MembersToDeleteBody | List of members with role to delete.
apiInstance.deleteBusinessMembership(businessId, membersToDeleteBody, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Business id | 
 **membersToDeleteBody** | [**MembersToDeleteBody**](MembersToDeleteBody.md)| List of members with role to delete. | 

### Return type

[**DeletedMembersResponse**](DeletedMembersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## deleteBusinessPartners

> DeletePartnersResponse deleteBusinessPartners(businessId, deletePartnersRequest)

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessRelationshipsApi();
let businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
let deletePartnersRequest = new PinterestSdk.DeletePartnersRequest(); // DeletePartnersRequest | An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 
apiInstance.deleteBusinessPartners(businessId, deletePartnersRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | 
 **deletePartnersRequest** | [**DeletePartnersRequest**](DeletePartnersRequest.md)| An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  | 

### Return type

[**DeletePartnersResponse**](DeletePartnersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getBusinessEmployers

> GetBusinessEmployers200Response getBusinessEmployers(opts)

List business employers for user

Get all of the viewing user&#39;s business employers.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessRelationshipsApi();
let opts = {
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  'bookmark': "bookmark_example" // String | Cursor used to fetch the next page of items
};
apiInstance.getBusinessEmployers(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBusinessMembers

> GetBusinessMembers200Response getBusinessMembers(businessId, opts)

Get business members

Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessRelationshipsApi();
let businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
let opts = {
  'assetsSummary': false, // Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
  'businessRoles': [new PinterestSdk.MemberBusinessRole()], // [MemberBusinessRole] | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
  'memberIds': "00101010101,2222220101", // String | A list of business members ids separated by comma.
  'startIndex': 0, // Number | An index to start fetching the results from. Only the results starting from this index will be returned.
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25 // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
};
apiInstance.getBusinessMembers(businessId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | 
 **assetsSummary** | **Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **businessRoles** | [**[MemberBusinessRole]**](MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] 
 **memberIds** | **String**| A list of business members ids separated by comma. | [optional] 
 **startIndex** | **Number**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**GetBusinessMembers200Response**](GetBusinessMembers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getBusinessPartners

> GetBusinessPartners200Response getBusinessPartners(businessId, opts)

Get business partners

Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessRelationshipsApi();
let businessId = "729090764583391194"; // String | Unique identifier of the requesting business.
let opts = {
  'assetsSummary': false, // Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
  'partnerType': new PinterestSdk.PartnerType(), // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
  'partnerIds': "00101010101,2222220101", // String | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
  'startIndex': 0, // Number | An index to start fetching the results from. Only the results starting from this index will be returned.
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  'bookmark': "bookmark_example" // String | Cursor used to fetch the next page of items
};
apiInstance.getBusinessPartners(businessId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Unique identifier of the requesting business. | 
 **assetsSummary** | **Boolean**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false]
 **partnerType** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **partnerIds** | **String**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] 
 **startIndex** | **Number**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**GetBusinessPartners200Response**](GetBusinessPartners200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## updateBusinessMemberships

> UpdateMemberResultsResponseArray updateBusinessMemberships(businessId, updateMemberBusinessRoleBody)

Update member&#39;s business role

Update a member&#39;s business role within the business.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.BusinessAccessRelationshipsApi();
let businessId = "729090764583391194"; // String | Business id
let updateMemberBusinessRoleBody = [new PinterestSdk.UpdateMemberBusinessRoleBody()]; // [UpdateMemberBusinessRoleBody] | List of objects with the member id and the business_role.
apiInstance.updateBusinessMemberships(businessId, updateMemberBusinessRoleBody, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **String**| Business id | 
 **updateMemberBusinessRoleBody** | [**[UpdateMemberBusinessRoleBody]**](UpdateMemberBusinessRoleBody.md)| List of objects with the member id and the business_role. | 

### Return type

[**UpdateMemberResultsResponseArray**](UpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

