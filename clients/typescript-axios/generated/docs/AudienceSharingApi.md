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

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let audienceId: string; //Unique identifier of the audience to use to filter the results. (default to undefined)
let accountType: AudienceAccountType; //Filter accounts by account type. (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)

const { status, data } = await apiInstance.adAccountsAudiencesSharedAccountsList(
    adAccountId,
    audienceId,
    accountType,
    pageSize,
    bookmark
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **audienceId** | [**string**] | Unique identifier of the audience to use to filter the results. | defaults to undefined|
| **accountType** | **AudienceAccountType** | Filter accounts by account type. | defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|


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
|**200** | Success |  -  |
|**400** | Invalid ad account audiences shared accounts parameters. |  -  |
|**404** | Shared accounts not found. |  -  |
|**0** | Unexpected error. |  -  |

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
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)

const { status, data } = await apiInstance.businessAccountAudiencesSharedAccountsList(
    businessId,
    audienceId,
    accountType,
    pageSize,
    bookmark
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **audienceId** | [**string**] | Unique identifier of the audience to use to filter the results. | defaults to undefined|
| **accountType** | **AudienceAccountType** | Filter accounts by account type. | defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|


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
|**200** | Success |  -  |
|**400** | Invalid business audiences shared accounts parameters. |  -  |
|**404** | Shared accounts not found. |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sharedAudiencesForBusinessList**
> AudiencesList200Response sharedAudiencesForBusinessList()

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
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let order: 'ASCENDING' | 'DESCENDING'; //The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)

const { status, data } = await apiInstance.sharedAudiencesForBusinessList(
    businessId,
    bookmark,
    order,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **order** | [**&#39;ASCENDING&#39; | &#39;DESCENDING&#39;**]**Array<&#39;ASCENDING&#39; &#124; &#39;DESCENDING&#39;>** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|


### Return type

**AudiencesList200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid parameters. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateAdAccountToAdAccountSharedAudience**
> SharedAudienceResponse updateAdAccountToAdAccountSharedAudience(sharedAudience)

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href=\'https://help.pinterest.com/en/business/article/create-and-manage-accounts\'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.

### Example

```typescript
import {
    AudienceSharingApi,
    Configuration,
    SharedAudience
} from './api';

const configuration = new Configuration();
const apiInstance = new AudienceSharingApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let sharedAudience: SharedAudience; //

const { status, data } = await apiInstance.updateAdAccountToAdAccountSharedAudience(
    adAccountId,
    sharedAudience
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **sharedAudience** | **SharedAudience**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**SharedAudienceResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid ad account id. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateAdAccountToBusinessSharedAudience**
> BusinessSharedAudienceResponse updateAdAccountToBusinessSharedAudience(businessSharedAudience)

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.

### Example

```typescript
import {
    AudienceSharingApi,
    Configuration,
    BusinessSharedAudience
} from './api';

const configuration = new Configuration();
const apiInstance = new AudienceSharingApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let businessSharedAudience: BusinessSharedAudience; //

const { status, data } = await apiInstance.updateAdAccountToBusinessSharedAudience(
    adAccountId,
    businessSharedAudience
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessSharedAudience** | **BusinessSharedAudience**|  | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**BusinessSharedAudienceResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid ad account id. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateBusinessToAdAccountSharedAudience**
> SharedAudienceResponse updateBusinessToAdAccountSharedAudience(sharedAudience)

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.

### Example

```typescript
import {
    AudienceSharingApi,
    Configuration,
    SharedAudience
} from './api';

const configuration = new Configuration();
const apiInstance = new AudienceSharingApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let sharedAudience: SharedAudience; //

const { status, data } = await apiInstance.updateBusinessToAdAccountSharedAudience(
    businessId,
    sharedAudience
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **sharedAudience** | **SharedAudience**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**SharedAudienceResponse**

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
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateBusinessToBusinessSharedAudience**
> BusinessSharedAudienceResponse updateBusinessToBusinessSharedAudience(businessSharedAudience)

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.

### Example

```typescript
import {
    AudienceSharingApi,
    Configuration,
    BusinessSharedAudience
} from './api';

const configuration = new Configuration();
const apiInstance = new AudienceSharingApi(configuration);

let businessId: string; //Unique identifier of the requesting business. (default to undefined)
let businessSharedAudience: BusinessSharedAudience; //

const { status, data } = await apiInstance.updateBusinessToBusinessSharedAudience(
    businessId,
    businessSharedAudience
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **businessSharedAudience** | **BusinessSharedAudience**|  | |
| **businessId** | [**string**] | Unique identifier of the requesting business. | defaults to undefined|


### Return type

**BusinessSharedAudienceResponse**

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
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

