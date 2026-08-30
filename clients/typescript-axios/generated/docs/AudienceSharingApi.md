# AudienceSharingApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**adAccountsAudiencesSharedAccountsList**](#adaccountsaudiencessharedaccountslist) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account|
|[**businessAccountAudiencesSharedAccountsList**](#businessaccountaudiencessharedaccountslist) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business|
|[**sharedAudiencesForBusinessList**](#sharedaudiencesforbusinesslist) | **GET** /businesses/{business_id}/audiences | List received audiences for a business|
|[**updateAdAccountToAdAccountSharedAudience**](#updateadaccounttoadaccountsharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts|
|[**updateAdAccountToBusinessSharedAudience**](#updateadaccounttobusinesssharedaudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses|
|[**updateBusinessToAdAccountSharedAudience**](#updatebusinesstoadaccountsharedaudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts|
|[**updateBusinessToBusinessSharedAudience**](#updatebusinesstobusinesssharedaudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses|

# **adAccountsAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response adAccountsAudiencesSharedAccountsList()

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example

```typescript
import {
    AudienceSharingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AudienceSharingApi(configuration);

let audienceId: string; //Unique identifier of the audience to use to filter the results. (default to undefined)
let accountType: AudienceAccountType; //Filter accounts by account type. (default to undefined)
let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.adAccountsAudiencesSharedAccountsList(
    audienceId,
    accountType,
    adAccountId,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **audienceId** | [**string**] | Unique identifier of the audience to use to filter the results. | defaults to undefined|
| **accountType** | **AudienceAccountType** | Filter accounts by account type. | defaults to undefined|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


### Return type

**AdAccountsAudiencesSharedAccountsList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **businessAccountAudiencesSharedAccountsList**
> AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList()

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example

```typescript
import {
    AudienceSharingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AudienceSharingApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let audienceId: string; //Unique identifier of the audience to use to filter the results. (default to undefined)
let accountType: AudienceAccountType; //Filter accounts by account type. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.businessAccountAudiencesSharedAccountsList(
    businessId,
    audienceId,
    accountType,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **audienceId** | [**string**] | Unique identifier of the audience to use to filter the results. | defaults to undefined|
| **accountType** | **AudienceAccountType** | Filter accounts by account type. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


### Return type

**AdAccountsAudiencesSharedAccountsList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sharedAudiencesForBusinessList**
> SharedAudiencesForBusinessList200Response sharedAudiencesForBusinessList()

Get a list of received audiences for the given business.

### Example

```typescript
import {
    AudienceSharingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new AudienceSharingApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let order: Order; //The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional) (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

const { status, data } = await apiInstance.sharedAudiencesForBusinessList(
    businessId,
    order,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **order** | **Order** | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | (optional) defaults to 25|


### Return type

**SharedAudiencesForBusinessList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateAdAccountToAdAccountSharedAudience**
> AdAccountToAdAccountSharedAudience updateAdAccountToAdAccountSharedAudience(adAccountToAdAccountSharedAudienceUpdateWithRequiredBody)

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example

```typescript
import {
    AudienceSharingApi,
    Configuration,
    AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody
} from './api';

const configuration = new Configuration();
const apiInstance = new AudienceSharingApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adAccountToAdAccountSharedAudienceUpdateWithRequiredBody: AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody; //

const { status, data } = await apiInstance.updateAdAccountToAdAccountSharedAudience(
    adAccountId,
    adAccountToAdAccountSharedAudienceUpdateWithRequiredBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountToAdAccountSharedAudienceUpdateWithRequiredBody** | **AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdAccountToAdAccountSharedAudience**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateAdAccountToBusinessSharedAudience**
> AdAccountToBusinessSharedAudience updateAdAccountToBusinessSharedAudience(adAccountToBusinessSharedAudienceUpdateWithRequiredBody)

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example

```typescript
import {
    AudienceSharingApi,
    Configuration,
    AdAccountToBusinessSharedAudienceUpdateWithRequiredBody
} from './api';

const configuration = new Configuration();
const apiInstance = new AudienceSharingApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adAccountToBusinessSharedAudienceUpdateWithRequiredBody: AdAccountToBusinessSharedAudienceUpdateWithRequiredBody; //

const { status, data } = await apiInstance.updateAdAccountToBusinessSharedAudience(
    adAccountId,
    adAccountToBusinessSharedAudienceUpdateWithRequiredBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountToBusinessSharedAudienceUpdateWithRequiredBody** | **AdAccountToBusinessSharedAudienceUpdateWithRequiredBody**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdAccountToBusinessSharedAudience**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateBusinessToAdAccountSharedAudience**
> BusinessToAdAccountSharedAudience updateBusinessToAdAccountSharedAudience(businessToAdAccountSharedAudienceUpdateWithRequiredBody)

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example

```typescript
import {
    AudienceSharingApi,
    Configuration,
    BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
} from './api';

const configuration = new Configuration();
const apiInstance = new AudienceSharingApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let businessToAdAccountSharedAudienceUpdateWithRequiredBody: BusinessToAdAccountSharedAudienceUpdateWithRequiredBody; //

const { status, data } = await apiInstance.updateBusinessToAdAccountSharedAudience(
    businessId,
    businessToAdAccountSharedAudienceUpdateWithRequiredBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessToAdAccountSharedAudienceUpdateWithRequiredBody** | **BusinessToAdAccountSharedAudienceUpdateWithRequiredBody**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**BusinessToAdAccountSharedAudience**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateBusinessToBusinessSharedAudience**
> BusinessToBusinessSharedAudience updateBusinessToBusinessSharedAudience(businessToBusinessSharedAudienceUpdateWithRequiredBody)

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example

```typescript
import {
    AudienceSharingApi,
    Configuration,
    BusinessToBusinessSharedAudienceUpdateWithRequiredBody
} from './api';

const configuration = new Configuration();
const apiInstance = new AudienceSharingApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let businessToBusinessSharedAudienceUpdateWithRequiredBody: BusinessToBusinessSharedAudienceUpdateWithRequiredBody; //

const { status, data } = await apiInstance.updateBusinessToBusinessSharedAudience(
    businessId,
    businessToBusinessSharedAudienceUpdateWithRequiredBody
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessToBusinessSharedAudienceUpdateWithRequiredBody** | **BusinessToBusinessSharedAudienceUpdateWithRequiredBody**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**BusinessToBusinessSharedAudience**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

