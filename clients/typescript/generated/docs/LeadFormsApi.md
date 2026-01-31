# .LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadFormGet**](LeadFormsApi.md#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**leadFormTestCreate**](LeadFormsApi.md#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**leadFormsCreate**](LeadFormsApi.md#leadFormsCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
[**leadFormsList**](LeadFormsApi.md#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
[**leadFormsUpdate**](LeadFormsApi.md#leadFormsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms


# **leadFormGet**
> LeadFormResponse leadFormGet()

<strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it\'s ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example


```typescript
import { createConfiguration, LeadFormsApi } from '';
import type { LeadFormsApiLeadFormGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new LeadFormsApi(configuration);

const request: LeadFormsApiLeadFormGetRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Unique identifier of a lead form.
  leadFormId: "1234567890123",
};

const data = await apiInstance.leadFormGet(request);
console.log('API called successfully. Returned data:', data);
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

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>

### Example


```typescript
import { createConfiguration, LeadFormsApi } from '';
import type { LeadFormsApiLeadFormTestCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new LeadFormsApi(configuration);

const request: LeadFormsApiLeadFormTestCreateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Unique identifier of a lead form.
  leadFormId: "1234567890123",
    // Subscription to create.
  leadFormTestRequest: {
    answers: ["John","Doe","abc@email.com","987654321"],
  },
};

const data = await apiInstance.leadFormTestCreate(request);
console.log('API called successfully. Returned data:', data);
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

# **leadFormsCreate**
> LeadFormArrayResponse leadFormsCreate(leadFormCreateRequest)

<strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example


```typescript
import { createConfiguration, LeadFormsApi } from '';
import type { LeadFormsApiLeadFormsCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new LeadFormsApi(configuration);

const request: LeadFormsApiLeadFormsCreateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // List of lead forms to create, size limit [1, 30].
  leadFormCreateRequest: [
    ,
  ],
};

const data = await apiInstance.leadFormsCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leadFormCreateRequest** | **Array<LeadFormCreateRequest>**| List of lead forms to create, size limit [1, 30]. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**LeadFormArrayResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account lead forms parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **leadFormsList**
> LeadFormsList200Response leadFormsList()

<strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example


```typescript
import { createConfiguration, LeadFormsApi } from '';
import type { LeadFormsApiLeadFormsListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new LeadFormsApi(configuration);

const request: LeadFormsApiLeadFormsListRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
  pageSize: 25,
    // The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
  order: "ASCENDING",
    // Cursor used to fetch the next page of items (optional)
  bookmark: "bookmark_example",
};

const data = await apiInstance.leadFormsList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25
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

# **leadFormsUpdate**
> LeadFormArrayResponse leadFormsUpdate(leadFormUpdateRequest)

<strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example


```typescript
import { createConfiguration, LeadFormsApi } from '';
import type { LeadFormsApiLeadFormsUpdateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new LeadFormsApi(configuration);

const request: LeadFormsApiLeadFormsUpdateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // List of lead forms to update, size limit [1, 30].
  leadFormUpdateRequest: [
    ,
  ],
};

const data = await apiInstance.leadFormsUpdate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leadFormUpdateRequest** | **Array<LeadFormUpdateRequest>**| List of lead forms to update, size limit [1, 30]. |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined


### Return type

**LeadFormArrayResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid ad account lead forms parameters. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


