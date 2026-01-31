# LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**labelsCreate**](LabelsApi.md#labelscreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels |
| [**labelsList**](LabelsApi.md#labelslist) | **GET** /ad_accounts/{ad_account_id}/labels | List labels |
| [**labelsUpdate**](LabelsApi.md#labelsupdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels |



## labelsCreate

> LabelsResponse labelsCreate(adAccountId, labelCreateRequest)

Create labels

&lt;p&gt; &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  &lt;/p&gt;

### Example

```ts
import {
  Configuration,
  LabelsApi,
} from '';
import type { LabelsCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new LabelsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // LabelCreateRequest
    labelCreateRequest: ...,
  } satisfies LabelsCreateRequest;

  try {
    const data = await api.labelsCreate(body);
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
| **labelCreateRequest** | [LabelCreateRequest](LabelCreateRequest.md) |  | |

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## labelsList

> LabelsList200Response labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, pageSize, bookmark)

List labels

&lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   See a list of labels for assets that your account owns, and filter the list by different criteria. &lt;/p&gt;

### Example

```ts
import {
  Configuration,
  LabelsApi,
} from '';
import type { LabelsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new LabelsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // Array<string> | List of Campaign Ids to use to filter the results. (optional)
    campaignIds: ...,
    // Array<string> | List of Label Ids to use to filter the results. (optional)
    labelIds: ...,
    // Array<'ACTIVE' | 'ARCHIVED'> | Label entity status (optional)
    entityStatuses: ...,
    // Array<'BRAND' | 'CUSTOM'> | Label type. (optional)
    labelTypes: ["BRAND","CUSTOM"],
    // number | Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional)
    pageSize: 56,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
  } satisfies LabelsListRequest;

  try {
    const data = await api.labelsList(body);
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
| **campaignIds** | `Array<string>` | List of Campaign Ids to use to filter the results. | [Optional] |
| **labelIds** | `Array<string>` | List of Label Ids to use to filter the results. | [Optional] |
| **entityStatuses** | `ACTIVE`, `ARCHIVED` | Label entity status | [Optional] [Enum: ACTIVE, ARCHIVED] |
| **labelTypes** | `BRAND`, `CUSTOM` | Label type. | [Optional] [Enum: BRAND, CUSTOM] |
| **pageSize** | `number` | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | [Optional] [Defaults to `25`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |

### Return type

[**LabelsList200Response**](LabelsList200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads parameters. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## labelsUpdate

> LabelsResponse labelsUpdate(adAccountId, labelUpdateRequest)

Update labels

&lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Change the properties of one or more labels. &lt;/p&gt;

### Example

```ts
import {
  Configuration,
  LabelsApi,
} from '';
import type { LabelsUpdateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new LabelsApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // LabelUpdateRequest
    labelUpdateRequest: ...,
  } satisfies LabelsUpdateRequest;

  try {
    const data = await api.labelsUpdate(body);
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
| **labelUpdateRequest** | [LabelUpdateRequest](LabelUpdateRequest.md) |  | |

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

