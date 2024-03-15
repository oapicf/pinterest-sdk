# PinterestSdk.LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadFormGet**](LeadFormsApi.md#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**leadFormTestCreate**](LeadFormsApi.md#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**leadFormsList**](LeadFormsApi.md#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms



## leadFormGet

> LeadFormResponse leadFormGet(adAccountId, leadFormId)

Get lead form by id

Gets a lead form given it&#39;s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser&#39;s lead form will only contain results if you&#39;re a part of the Lead ads beta. If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.LeadFormsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let leadFormId = 1234567890123; // String | Unique identifier of a lead form.
apiInstance.leadFormGet(adAccountId, leadFormId, (error, data, response) => {
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
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **leadFormId** | **String**| Unique identifier of a lead form. | 

### Return type

[**LeadFormResponse**](LeadFormResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## leadFormTestCreate

> LeadFormTestResponse leadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.LeadFormsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let leadFormId = 1234567890123; // String | Unique identifier of a lead form.
let leadFormTestRequest = new PinterestSdk.LeadFormTestRequest(); // LeadFormTestRequest | Subscription to create.
apiInstance.leadFormTestCreate(adAccountId, leadFormId, leadFormTestRequest, (error, data, response) => {
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
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **leadFormId** | **String**| Unique identifier of a lead form. | 
 **leadFormTestRequest** | [**LeadFormTestRequest**](LeadFormTestRequest.md)| Subscription to create. | 

### Return type

[**LeadFormTestResponse**](LeadFormTestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## leadFormsList

> LeadFormsList200Response leadFormsList(adAccountId, opts)

Get lead forms

Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser&#39;s list of lead forms will only contain results if you&#39;re a part of the Lead ads beta.  If you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.LeadFormsApi();
let adAccountId = "adAccountId_example"; // String | Unique identifier of an ad account.
let opts = {
  'pageSize': 25, // Number | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
  'order': ASCENDING, // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
  'bookmark': "bookmark_example" // String | Cursor used to fetch the next page of items
};
apiInstance.leadFormsList(adAccountId, opts, (error, data, response) => {
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
 **adAccountId** | **String**| Unique identifier of an ad account. | 
 **pageSize** | **Number**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

