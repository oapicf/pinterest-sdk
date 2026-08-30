# LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**leadFormGet**](LeadFormsApi.md#leadformget) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id |
| [**leadFormTestCreate**](LeadFormsApi.md#leadformtestcreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data |
| [**leadFormsCreate**](LeadFormsApi.md#leadformscreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms |
| [**leadFormsList**](LeadFormsApi.md#leadformslist) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms |
| [**leadFormsUpdate**](LeadFormsApi.md#leadformsupdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms |



## leadFormGet

> LeadForm leadFormGet(leadFormId, adAccountId)

Get lead form by id

**This feature is currently in beta and not available to all apps, if you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it\&#39;s ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

```ts
import {
  Configuration,
  LeadFormsApi,
} from '';
import type { LeadFormGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new LeadFormsApi(config);

  const body = {
    // string | The ID of this lead form
    leadFormId: leadFormId_example,
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
  } satisfies LeadFormGetRequest;

  try {
    const data = await api.leadFormGet(body);
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
| **leadFormId** | `string` | The ID of this lead form | [Defaults to `undefined`] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |

### Return type

[**LeadForm**](LeadForm.md)

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


## leadFormTestCreate

> LeadFormTest leadFormTestCreate(adAccountId, leadFormId, leadFormTestCreate)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.

### Example

```ts
import {
  Configuration,
  LeadFormsApi,
} from '';
import type { LeadFormTestCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new LeadFormsApi(config);

  const body = {
    // string
    adAccountId: adAccountId_example,
    // string | Unique identifier of a lead form.
    leadFormId: leadFormId_example,
    // LeadFormTestCreate
    leadFormTestCreate: ...,
  } satisfies LeadFormTestCreateRequest;

  try {
    const data = await api.leadFormTestCreate(body);
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
| **adAccountId** | `string` |  | [Defaults to `undefined`] |
| **leadFormId** | `string` | Unique identifier of a lead form. | [Defaults to `undefined`] |
| **leadFormTestCreate** | [LeadFormTestCreate](LeadFormTestCreate.md) |  | |

### Return type

[**LeadFormTest**](LeadFormTest.md)

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
| **404** | The requested resource could not be found on this server. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## leadFormsCreate

> LeadFormsCreate200Response leadFormsCreate(adAccountId, leadFormCreate)

Create lead forms

**This feature is currently in beta and not available to all apps, if you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form\&#39;s description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

```ts
import {
  Configuration,
  LeadFormsApi,
} from '';
import type { LeadFormsCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new LeadFormsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<LeadFormCreate>
    leadFormCreate: ...,
  } satisfies LeadFormsCreateRequest;

  try {
    const data = await api.leadFormsCreate(body);
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
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **leadFormCreate** | `Array<LeadFormCreate>` |  | |

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

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


## leadFormsList

> LeadFormsList200Response leadFormsList(adAccountId, bookmark, pageSize, order)

List lead forms

**This feature is currently in beta and not available to all apps, if you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

```ts
import {
  Configuration,
  LeadFormsApi,
} from '';
import type { LeadFormsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new LeadFormsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
    // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    order: ...,
  } satisfies LeadFormsListRequest;

  try {
    const data = await api.leadFormsList(body);
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
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |
| **order** | `PinterestLibPaginationOrder` | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [Optional] [Defaults to `undefined`] [Enum: ASCENDING, DESCENDING] |

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

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


## leadFormsUpdate

> LeadFormsCreate200Response leadFormsUpdate(adAccountId, leadFormBatchUpdate)

Update lead forms

**This feature is currently in beta and not available to all apps, if you\&#39;re interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example

```ts
import {
  Configuration,
  LeadFormsApi,
} from '';
import type { LeadFormsUpdateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new LeadFormsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<LeadFormBatchUpdate>
    leadFormBatchUpdate: ...,
  } satisfies LeadFormsUpdateRequest;

  try {
    const data = await api.leadFormsUpdate(body);
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
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **leadFormBatchUpdate** | `Array<LeadFormBatchUpdate>` |  | |

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

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

