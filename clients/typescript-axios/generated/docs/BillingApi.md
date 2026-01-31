# BillingApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**adsCreditRedeem**](#adscreditredeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits|
|[**adsCreditsDiscountsGet**](#adscreditsdiscountsget) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts|
|[**billingInvoiceDownloadGet**](#billinginvoicedownloadget) | **GET** /ad_accounts/{ad_account_id}/billing_invoice/{billing_invoice_id}/download | Get download url for a billing invoice|
|[**billingInvoicesGet**](#billinginvoicesget) | **GET** /ad_accounts/{ad_account_id}/billing_invoices | Get billing invoices|
|[**billingProfilesGet**](#billingprofilesget) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles|
|[**ssioAccountsGet**](#ssioaccountsget) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.|
|[**ssioInsertionOrderCreate**](#ssioinsertionordercreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.|
|[**ssioInsertionOrderEdit**](#ssioinsertionorderedit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.|
|[**ssioInsertionOrdersStatusGetByAdAccount**](#ssioinsertionordersstatusgetbyadaccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.|
|[**ssioInsertionOrdersStatusGetByPinOrderId**](#ssioinsertionordersstatusgetbypinorderid) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.|
|[**ssioOrderLinesGetByAdAccount**](#ssioorderlinesgetbyadaccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.|

# **adsCreditRedeem**
> AdsCreditRedeemResponse adsCreditRedeem(adsCreditRedeemRequest)

Redeem ads credit on behalf of the ad account id and apply it towards billing.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>

### Example

```typescript
import {
    BillingApi,
    Configuration,
    AdsCreditRedeemRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new BillingApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let adsCreditRedeemRequest: AdsCreditRedeemRequest; //Redeem ad credits request.

const { status, data } = await apiInstance.adsCreditRedeem(
    adAccountId,
    adsCreditRedeemRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adsCreditRedeemRequest** | **AdsCreditRedeemRequest**| Redeem ad credits request. | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**AdsCreditRedeemResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Successfully redeemed ad credits. |  -  |
|**400** | Error thrown when unable to redeem offer code. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **adsCreditsDiscountsGet**
> AdsCreditsDiscountsGet200Response adsCreditsDiscountsGet()

Returns the list of discounts applied to the account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>

### Example

```typescript
import {
    BillingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BillingApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)

const { status, data } = await apiInstance.adsCreditsDiscountsGet(
    adAccountId,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|


### Return type

**AdsCreditsDiscountsGet200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billingInvoiceDownloadGet**
> BillingInvoiceDownloadResponse billingInvoiceDownloadGet()

Get download url for a billing invoice.

### Example

```typescript
import {
    BillingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BillingApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let billingInvoiceId: string; //Unique identifier of a billing invoice. (default to undefined)

const { status, data } = await apiInstance.billingInvoiceDownloadGet(
    adAccountId,
    billingInvoiceId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **billingInvoiceId** | [**string**] | Unique identifier of a billing invoice. | defaults to undefined|


### Return type

**BillingInvoiceDownloadResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Successfully fetched Billing invoice information for a given ad account |  -  |
|**400** | Invalid request parameter. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billingInvoicesGet**
> BillingInvoicesGet200Response billingInvoicesGet()

Get billing invoices in the advertiser account.

### Example

```typescript
import {
    BillingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BillingApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let sort: 'DUE_DATE' | 'BILLING_PERIOD' | 'DOCUMENT_TYPE' | 'TOTAL_AMOUNT' | 'INVOICE_NUMBER'; //Field of which to sort billing invoices (optional) (default to 'DUE_DATE')
let order: 'ASCENDING' | 'DESCENDING'; //The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional) (default to undefined)
let status: 'OPEN' | 'CLOSED'; //Status of billing invoices to filter by (optional) (default to undefined)
let documentType: 'INVOICE' | 'CREDIT_MEMO'; //Document type of billing invoices to filter by (optional) (default to undefined)
let startDueDate: string; //Starting point for due dates when searching for invoices. Format: YYYY-MM-DD (optional) (default to undefined)
let endDueDate: string; //Ending point for due dates when searching for invoices. Format: YYYY-MM-DD (optional) (default to undefined)

const { status, data } = await apiInstance.billingInvoicesGet(
    adAccountId,
    bookmark,
    pageSize,
    sort,
    order,
    status,
    documentType,
    startDueDate,
    endDueDate
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **sort** | [**&#39;DUE_DATE&#39; | &#39;BILLING_PERIOD&#39; | &#39;DOCUMENT_TYPE&#39; | &#39;TOTAL_AMOUNT&#39; | &#39;INVOICE_NUMBER&#39;**]**Array<&#39;DUE_DATE&#39; &#124; &#39;BILLING_PERIOD&#39; &#124; &#39;DOCUMENT_TYPE&#39; &#124; &#39;TOTAL_AMOUNT&#39; &#124; &#39;INVOICE_NUMBER&#39;>** | Field of which to sort billing invoices | (optional) defaults to 'DUE_DATE'|
| **order** | [**&#39;ASCENDING&#39; | &#39;DESCENDING&#39;**]**Array<&#39;ASCENDING&#39; &#124; &#39;DESCENDING&#39;>** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | (optional) defaults to undefined|
| **status** | [**&#39;OPEN&#39; | &#39;CLOSED&#39;**]**Array<&#39;OPEN&#39; &#124; &#39;CLOSED&#39;>** | Status of billing invoices to filter by | (optional) defaults to undefined|
| **documentType** | [**&#39;INVOICE&#39; | &#39;CREDIT_MEMO&#39;**]**Array<&#39;INVOICE&#39; &#124; &#39;CREDIT_MEMO&#39;>** | Document type of billing invoices to filter by | (optional) defaults to undefined|
| **startDueDate** | [**string**] | Starting point for due dates when searching for invoices. Format: YYYY-MM-DD | (optional) defaults to undefined|
| **endDueDate** | [**string**] | Ending point for due dates when searching for invoices. Format: YYYY-MM-DD | (optional) defaults to undefined|


### Return type

**BillingInvoicesGet200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid request parameter. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **billingProfilesGet**
> BillingProfilesGet200Response billingProfilesGet()

Get billing profiles in the advertiser account.  <strong>This endpoint might not be available to all apps. <a href=\'/docs/getting-started/using-beta-and-restricted-features/\'>Learn more</a>.</strong>

### Example

```typescript
import {
    BillingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BillingApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let isActive: boolean; //Return active billing profiles, if false return all billing profiles. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)

const { status, data } = await apiInstance.billingProfilesGet(
    adAccountId,
    isActive,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **isActive** | [**boolean**] | Return active billing profiles, if false return all billing profiles. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|


### Return type

**BillingProfilesGet200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioAccountsGet**
> SSIOAccountResponse ssioAccountsGet()

Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example

```typescript
import {
    BillingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BillingApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)

const { status, data } = await apiInstance.ssioAccountsGet(
    adAccountId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**SSIOAccountResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid request parameter. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioInsertionOrderCreate**
> SSIOCreateInsertionOrderResponse ssioInsertionOrderCreate(sSIOCreateInsertionOrderRequest)

Create insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example

```typescript
import {
    BillingApi,
    Configuration,
    SSIOCreateInsertionOrderRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new BillingApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let sSIOCreateInsertionOrderRequest: SSIOCreateInsertionOrderRequest; //Order line to create.

const { status, data } = await apiInstance.ssioInsertionOrderCreate(
    adAccountId,
    sSIOCreateInsertionOrderRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **sSIOCreateInsertionOrderRequest** | **SSIOCreateInsertionOrderRequest**| Order line to create. | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**SSIOCreateInsertionOrderResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid request. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioInsertionOrderEdit**
> SSIOEditInsertionOrderResponse ssioInsertionOrderEdit(sSIOEditInsertionOrderRequest)

Edit insertion order through SSIO for <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example

```typescript
import {
    BillingApi,
    Configuration,
    SSIOEditInsertionOrderRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new BillingApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let sSIOEditInsertionOrderRequest: SSIOEditInsertionOrderRequest; //Order line to create.

const { status, data } = await apiInstance.ssioInsertionOrderEdit(
    adAccountId,
    sSIOEditInsertionOrderRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **sSIOEditInsertionOrderRequest** | **SSIOEditInsertionOrderRequest**| Order line to create. | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**SSIOEditInsertionOrderResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid request. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioInsertionOrdersStatusGetByAdAccount**
> SsioInsertionOrdersStatusGetByAdAccount200Response ssioInsertionOrdersStatusGetByAdAccount()

Get insertion order status for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example

```typescript
import {
    BillingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BillingApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)

const { status, data } = await apiInstance.ssioInsertionOrdersStatusGetByAdAccount(
    adAccountId,
    bookmark,
    pageSize
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|


### Return type

**SsioInsertionOrdersStatusGetByAdAccount200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid request parameter. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioInsertionOrdersStatusGetByPinOrderId**
> SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatusGetByPinOrderId()

Get insertion order status for pin order id <code>pin_order_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example

```typescript
import {
    BillingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BillingApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let pinOrderId: string; //The pin order id associated with the ssio insertion order (default to undefined)

const { status, data } = await apiInstance.ssioInsertionOrdersStatusGetByPinOrderId(
    adAccountId,
    pinOrderId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **pinOrderId** | [**string**] | The pin order id associated with the ssio insertion order | defaults to undefined|


### Return type

**SSIOInsertionOrderStatusResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid request parameter. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ssioOrderLinesGetByAdAccount**
> SsioOrderLinesGetByAdAccount200Response ssioOrderLinesGetByAdAccount()

Get Salesforce order lines for account id <code>ad_account_id</code>. - The token\'s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example

```typescript
import {
    BillingApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BillingApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bookmark: string; //Cursor used to fetch the next page of items (optional) (default to undefined)
let pageSize: number; //Maximum number of items to include in a single page of the response. See documentation on <a href=\'/docs/reference/pagination/\'>Pagination</a> for more information. (optional) (default to 25)
let pinOrderId: string; //The pin order id associated with the ssio insertino order (optional) (default to undefined)

const { status, data } = await apiInstance.ssioOrderLinesGetByAdAccount(
    adAccountId,
    bookmark,
    pageSize,
    pinOrderId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **bookmark** | [**string**] | Cursor used to fetch the next page of items | (optional) defaults to undefined|
| **pageSize** | [**number**] | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;\&#39;/docs/reference/pagination/\&#39;&gt;Pagination&lt;/a&gt; for more information. | (optional) defaults to 25|
| **pinOrderId** | [**string**] | The pin order id associated with the ssio insertino order | (optional) defaults to undefined|


### Return type

**SsioOrderLinesGetByAdAccount200Response**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**400** | Invalid request parameter. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

