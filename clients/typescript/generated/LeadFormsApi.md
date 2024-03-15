# .LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadFormGet**](LeadFormsApi.md#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**leadFormTestCreate**](LeadFormsApi.md#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**leadFormsList**](LeadFormsApi.md#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms


# **leadFormGet**
> LeadFormResponse leadFormGet()

Gets a lead form given it\'s ID. It must also be associated with the provided ad account ID. Retrieving an advertiser\'s lead form will only contain results if you\'re a part of the Lead ads beta. If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .LeadFormsApi(configuration);

let body:.LeadFormsApiLeadFormGetRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Unique identifier of a lead form.
  leadFormId: "1234567890123",
};

apiInstance.leadFormGet(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **leadFormId** | [**string**] | Unique identifier of a lead form. | defaults to undefined


### Return type

**LeadFormResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account lead forms parameters. |  -  |
**404** | The lead form ID for the given ad account ID does not exist. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **leadFormTestCreate**
> LeadFormTestResponse leadFormTestCreate(leadFormTestRequest)

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/new/about-beta-access/\'>Learn more</a>.</strong>

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .LeadFormsApi(configuration);

let body:.LeadFormsApiLeadFormTestCreateRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // string | Unique identifier of a lead form.
  leadFormId: "1234567890123",
  // LeadFormTestRequest | Subscription to create.
  leadFormTestRequest: {
    answers: ["John","Doe","abc@email.com","987654321"],
  },
};

apiInstance.leadFormTestCreate(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leadFormTestRequest** | **LeadFormTestRequest**| Subscription to create. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **leadFormId** | [**string**] | Unique identifier of a lead form. | defaults to undefined


### Return type

**LeadFormTestResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameters. |  -  |
**404** | Lead not found. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **leadFormsList**
> LeadFormsList200Response leadFormsList()

Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser\'s list of lead forms will only contain results if you\'re a part of the Lead ads beta.  If you\'re interested in joining the beta, please reach out to your Pinterest account manager.

### Example


```typescript
import {  } from '';
import * as fs from 'fs';

const configuration = .createConfiguration();
const apiInstance = new .LeadFormsApi(configuration);

let body:.LeadFormsApiLeadFormsListRequest = {
  // string | Unique identifier of an ad account.
  adAccountId: "4",
  // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/getting-started/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
  // 'ASCENDING' | 'DESCENDING' | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
  order: "ASCENDING",
  // string | Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
};

apiInstance.leadFormsList(body).then((data:any) => {
  console.log('API called successfully. Returned data: ' + data);
}).catch((error:any) => console.error(error));
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/getting-started/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
 **order** | [**&#39;ASCENDING&#39; | &#39;DESCENDING&#39;**]**Array<&#39;ASCENDING&#39; &#124; &#39;DESCENDING&#39;>** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined
 **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined


### Return type

**LeadFormsList200Response**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account lead forms parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


