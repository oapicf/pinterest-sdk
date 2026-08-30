# AudienceSharingApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adAccountsAudiencesSharedAccountsList**](AudienceSharingApi.md#adaccountsaudiencessharedaccountslist) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account |
| [**businessAccountAudiencesSharedAccountsList**](AudienceSharingApi.md#businessaccountaudiencessharedaccountslist) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business |
| [**sharedAudiencesForBusinessList**](AudienceSharingApi.md#sharedaudiencesforbusinesslist) | **GET** /businesses/{business_id}/audiences | List received audiences for a business |
| [**updateAdAccountToAdAccountSharedAudience**](AudienceSharingApi.md#updateadaccounttoadaccountsharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts |
| [**updateAdAccountToBusinessSharedAudience**](AudienceSharingApi.md#updateadaccounttobusinesssharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses |
| [**updateBusinessToAdAccountSharedAudience**](AudienceSharingApi.md#updatebusinesstoadaccountsharedaudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts |
| [**updateBusinessToBusinessSharedAudience**](AudienceSharingApi.md#updatebusinesstobusinesssharedaudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses |



## adAccountsAudiencesSharedAccountsList

> AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList(audienceId, accountType, adAccountId, bookmark, pageSize)

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example

```ts
import {
  Configuration,
  AudienceSharingApi,
} from '';
import type { AdAccountsAudiencesSharedAccountsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AudienceSharingApi(config);

  const body = {
    // string | Unique identifier of the audience to use to filter the results.
    audienceId: audienceId_example,
    // AudienceAccountType | Filter accounts by account type.
    accountType: ...,
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies AdAccountsAudiencesSharedAccountsListRequest;

  try {
    const data = await api.adAccountsAudiencesSharedAccountsList(body);
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
| **audienceId** | `string` | Unique identifier of the audience to use to filter the results. | [Defaults to `undefined`] |
| **accountType** | `AudienceAccountType` | Filter accounts by account type. | [Defaults to `undefined`] [Enum: AD_ACCOUNT, BUSINESS_ACCOUNT] |
| **adAccountId** | `string` | Unique identifier of an ad account. | [Defaults to `undefined`] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

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


## businessAccountAudiencesSharedAccountsList

> AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, bookmark, pageSize)

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example

```ts
import {
  Configuration,
  AudienceSharingApi,
} from '';
import type { BusinessAccountAudiencesSharedAccountsListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AudienceSharingApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // string | Unique identifier of the audience to use to filter the results.
    audienceId: audienceId_example,
    // AudienceAccountType | Filter accounts by account type.
    accountType: ...,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies BusinessAccountAudiencesSharedAccountsListRequest;

  try {
    const data = await api.businessAccountAudiencesSharedAccountsList(body);
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
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **audienceId** | `string` | Unique identifier of the audience to use to filter the results. | [Defaults to `undefined`] |
| **accountType** | `AudienceAccountType` | Filter accounts by account type. | [Defaults to `undefined`] [Enum: AD_ACCOUNT, BUSINESS_ACCOUNT] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**AdAccountsAudiencesSharedAccountsList200Response**](AdAccountsAudiencesSharedAccountsList200Response.md)

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


## sharedAudiencesForBusinessList

> SharedAudiencesForBusinessList200Response sharedAudiencesForBusinessList(businessId, order, bookmark, pageSize)

List received audiences for a business

Get a list of received audiences for the given business.

### Example

```ts
import {
  Configuration,
  AudienceSharingApi,
} from '';
import type { SharedAudiencesForBusinessListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AudienceSharingApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // Order | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    order: ...,
    // string | Cursor used to fetch the next page of items (optional)
    bookmark: bookmark_example,
    // number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional)
    pageSize: 56,
  } satisfies SharedAudiencesForBusinessListRequest;

  try {
    const data = await api.sharedAudiencesForBusinessList(body);
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
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **order** | `Order` | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [Optional] [Defaults to `undefined`] [Enum: ASCENDING, DESCENDING] |
| **bookmark** | `string` | Cursor used to fetch the next page of items | [Optional] [Defaults to `undefined`] |
| **pageSize** | `number` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [Optional] [Defaults to `25`] |

### Return type

[**SharedAudiencesForBusinessList200Response**](SharedAudiencesForBusinessList200Response.md)

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


## updateAdAccountToAdAccountSharedAudience

> AdAccountToAdAccountSharedAudience updateAdAccountToAdAccountSharedAudience(adAccountId, adAccountToAdAccountSharedAudienceUpdateWithRequiredBody)

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example

```ts
import {
  Configuration,
  AudienceSharingApi,
} from '';
import type { UpdateAdAccountToAdAccountSharedAudienceRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AudienceSharingApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
    adAccountToAdAccountSharedAudienceUpdateWithRequiredBody: ...,
  } satisfies UpdateAdAccountToAdAccountSharedAudienceRequest;

  try {
    const data = await api.updateAdAccountToAdAccountSharedAudience(body);
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
| **adAccountToAdAccountSharedAudienceUpdateWithRequiredBody** | [AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody](AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.md) |  | |

### Return type

[**AdAccountToAdAccountSharedAudience**](AdAccountToAdAccountSharedAudience.md)

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


## updateAdAccountToBusinessSharedAudience

> AdAccountToBusinessSharedAudience updateAdAccountToBusinessSharedAudience(adAccountId, adAccountToBusinessSharedAudienceUpdateWithRequiredBody)

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example

```ts
import {
  Configuration,
  AudienceSharingApi,
} from '';
import type { UpdateAdAccountToBusinessSharedAudienceRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AudienceSharingApi(config);

  const body = {
    // string | Unique identifier of an ad account.
    adAccountId: adAccountId_example,
    // AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
    adAccountToBusinessSharedAudienceUpdateWithRequiredBody: ...,
  } satisfies UpdateAdAccountToBusinessSharedAudienceRequest;

  try {
    const data = await api.updateAdAccountToBusinessSharedAudience(body);
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
| **adAccountToBusinessSharedAudienceUpdateWithRequiredBody** | [AdAccountToBusinessSharedAudienceUpdateWithRequiredBody](AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.md) |  | |

### Return type

[**AdAccountToBusinessSharedAudience**](AdAccountToBusinessSharedAudience.md)

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


## updateBusinessToAdAccountSharedAudience

> BusinessToAdAccountSharedAudience updateBusinessToAdAccountSharedAudience(businessId, businessToAdAccountSharedAudienceUpdateWithRequiredBody)

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example

```ts
import {
  Configuration,
  AudienceSharingApi,
} from '';
import type { UpdateBusinessToAdAccountSharedAudienceRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AudienceSharingApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
    businessToAdAccountSharedAudienceUpdateWithRequiredBody: ...,
  } satisfies UpdateBusinessToAdAccountSharedAudienceRequest;

  try {
    const data = await api.updateBusinessToAdAccountSharedAudience(body);
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
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **businessToAdAccountSharedAudienceUpdateWithRequiredBody** | [BusinessToAdAccountSharedAudienceUpdateWithRequiredBody](BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.md) |  | |

### Return type

[**BusinessToAdAccountSharedAudience**](BusinessToAdAccountSharedAudience.md)

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


## updateBusinessToBusinessSharedAudience

> BusinessToBusinessSharedAudience updateBusinessToBusinessSharedAudience(businessId, businessToBusinessSharedAudienceUpdateWithRequiredBody)

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example

```ts
import {
  Configuration,
  AudienceSharingApi,
} from '';
import type { UpdateBusinessToBusinessSharedAudienceRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new AudienceSharingApi(config);

  const body = {
    // string | Unique identifier of the requesting business.
    businessId: businessId_example,
    // BusinessToBusinessSharedAudienceUpdateWithRequiredBody
    businessToBusinessSharedAudienceUpdateWithRequiredBody: ...,
  } satisfies UpdateBusinessToBusinessSharedAudienceRequest;

  try {
    const data = await api.updateBusinessToBusinessSharedAudience(body);
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
| **businessId** | `string` | Unique identifier of the requesting business. | [Defaults to `undefined`] |
| **businessToBusinessSharedAudienceUpdateWithRequiredBody** | [BusinessToBusinessSharedAudienceUpdateWithRequiredBody](BusinessToBusinessSharedAudienceUpdateWithRequiredBody.md) |  | |

### Return type

[**BusinessToBusinessSharedAudience**](BusinessToBusinessSharedAudience.md)

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

