# LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**leadFormGet**](#leadformget) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id|
|[**leadFormTestCreate**](#leadformtestcreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data|
|[**leadFormsCreate**](#leadformscreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms|
|[**leadFormsList**](#leadformslist) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms|
|[**leadFormsUpdate**](#leadformsupdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms|

# **leadFormGet**
> LeadFormResponse leadFormGet()

<strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Gets a lead form given it\'s ID. It must also be associated with the provided ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example

```typescript
import {
    LeadFormsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LeadFormsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let leadFormId: string; //Unique identifier of a lead form. (default to undefined)

const { status, data } = await apiInstance.leadFormGet(
    adAccountId,
    leadFormId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **leadFormId** | [**string**] | Unique identifier of a lead form. | defaults to undefined|


### Return type

**LeadFormResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid ad account lead forms parameters. |  -  |
|**404** | The lead form ID for the given ad account ID does not exist. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormTestCreate**
> LeadFormTestResponse leadFormTestCreate(leadFormTestRequest)

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href=\'/docs/getting-started/beta-and-advanced-access/\'>Learn more</a>.</strong>

### Example

```typescript
import {
    LeadFormsApi,
    Configuration,
    LeadFormTestRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new LeadFormsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let leadFormId: string; //Unique identifier of a lead form. (default to undefined)
let leadFormTestRequest: LeadFormTestRequest; //Subscription to create.

const { status, data } = await apiInstance.leadFormTestCreate(
    adAccountId,
    leadFormId,
    leadFormTestRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **leadFormTestRequest** | **LeadFormTestRequest**| Subscription to create. | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **leadFormId** | [**string**] | Unique identifier of a lead form. | defaults to undefined|


### Return type

**LeadFormTestResponse**

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
|**404** | Lead not found. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormsCreate**
> LeadFormArrayResponse leadFormsCreate(leadFormCreateRequest)

<strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form’ s description, questions and confirmation sections.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example

```typescript
import {
    LeadFormsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LeadFormsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let leadFormCreateRequest: Array<LeadFormCreateRequest>; //List of lead forms to create, size limit [1, 30].

const { status, data } = await apiInstance.leadFormsCreate(
    adAccountId,
    leadFormCreateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **leadFormCreateRequest** | **Array<LeadFormCreateRequest>**| List of lead forms to create, size limit [1, 30]. | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**LeadFormArrayResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid ad account lead forms parameters. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormsList**
> LeadFormsList200Response leadFormsList()

<strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  List lead forms associated with an ad account ID.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example

```typescript
import {
    LeadFormsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LeadFormsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let order: 'ASCENDING' | 'DESCENDING'; //The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional) (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)

const { status, data } = await apiInstance.leadFormsList(
    adAccountId,
    pageSize,
    order,
    bookmark
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **order** | [**&#39;ASCENDING&#39; | &#39;DESCENDING&#39;**]**Array<&#39;ASCENDING&#39; &#124; &#39;DESCENDING&#39;>** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|


### Return type

**LeadFormsList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid ad account lead forms parameters. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormsUpdate**
> LeadFormArrayResponse leadFormsUpdate(leadFormUpdateRequest)

<strong>This feature is currently in beta and not available to all apps, if you\'re interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example

```typescript
import {
    LeadFormsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LeadFormsApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let leadFormUpdateRequest: Array<LeadFormUpdateRequest>; //List of lead forms to update, size limit [1, 30].

const { status, data } = await apiInstance.leadFormsUpdate(
    adAccountId,
    leadFormUpdateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **leadFormUpdateRequest** | **Array<LeadFormUpdateRequest>**| List of lead forms to update, size limit [1, 30]. | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**LeadFormArrayResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid ad account lead forms parameters. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

