# BillingApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adsCredit/redeem**](BillingApi.md#adsCredit/redeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits |
| [**adsCreditsDiscounts/get**](BillingApi.md#adsCreditsDiscounts/get) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts |
| [**billingProfiles/get**](BillingApi.md#billingProfiles/get) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles |
| [**ssioAccounts/get**](BillingApi.md#ssioAccounts/get) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information. |
| [**ssioInsertionOrder/create**](BillingApi.md#ssioInsertionOrder/create) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO. |
| [**ssioInsertionOrder/edit**](BillingApi.md#ssioInsertionOrder/edit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO. |
| [**ssioInsertionOrdersStatus/getByAdAccount**](BillingApi.md#ssioInsertionOrdersStatus/getByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id. |
| [**ssioInsertionOrdersStatus/getByPinOrderId**](BillingApi.md#ssioInsertionOrdersStatus/getByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id. |
| [**ssioOrderLines/getByAdAccount**](BillingApi.md#ssioOrderLines/getByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id. |


<a name="adsCredit/redeem"></a>
# **adsCredit/redeem**
> AdsCreditRedeemResponse adsCredit/redeem(ad\_account\_id, AdsCreditRedeemRequest)

Redeem ad credits

    Redeem ads credit on behalf of the ad account id and apply it towards billing.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdsCreditRedeemRequest** | [**AdsCreditRedeemRequest**](../Models/AdsCreditRedeemRequest.md)| Redeem ad credits request. | |

### Return type

[**AdsCreditRedeemResponse**](../Models/AdsCreditRedeemResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="adsCreditsDiscounts/get"></a>
# **adsCreditsDiscounts/get**
> ads_credits_discounts_get_200_response adsCreditsDiscounts/get(ad\_account\_id, bookmark, page\_size)

Get ads credit discounts

    Returns the list of discounts applied to the account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**ads_credits_discounts_get_200_response**](../Models/ads_credits_discounts_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="billingProfiles/get"></a>
# **billingProfiles/get**
> billing_profiles_get_200_response billingProfiles/get(ad\_account\_id, is\_active, bookmark, page\_size)

Get billing profiles

    Get billing profiles in the advertiser account.  &lt;strong&gt;This endpoint might not be available to all apps. &lt;a href&#x3D;&#39;/docs/new/about-beta-access/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **is\_active** | **Boolean**| Return active billing profiles, if false return all billing profiles. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**billing_profiles_get_200_response**](../Models/billing_profiles_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="ssioAccounts/get"></a>
# **ssioAccounts/get**
> SSIOAccountResponse ssioAccounts/get(ad\_account\_id)

Get Salesforce account details including bill-to information.

    Get Salesforce account details including bill-to information to be used in insertion orders process for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |

### Return type

[**SSIOAccountResponse**](../Models/SSIOAccountResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="ssioInsertionOrder/create"></a>
# **ssioInsertionOrder/create**
> SSIOCreateInsertionOrderResponse ssioInsertionOrder/create(ad\_account\_id, SSIOCreateInsertionOrderRequest)

Create insertion order through SSIO.

    Create insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **SSIOCreateInsertionOrderRequest** | [**SSIOCreateInsertionOrderRequest**](../Models/SSIOCreateInsertionOrderRequest.md)| Order line to create. | |

### Return type

[**SSIOCreateInsertionOrderResponse**](../Models/SSIOCreateInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="ssioInsertionOrder/edit"></a>
# **ssioInsertionOrder/edit**
> SSIOEditInsertionOrderResponse ssioInsertionOrder/edit(ad\_account\_id, SSIOEditInsertionOrderRequest)

Edit insertion order through SSIO.

    Edit insertion order through SSIO for &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **SSIOEditInsertionOrderRequest** | [**SSIOEditInsertionOrderRequest**](../Models/SSIOEditInsertionOrderRequest.md)| Order line to create. | |

### Return type

[**SSIOEditInsertionOrderResponse**](../Models/SSIOEditInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="ssioInsertionOrdersStatus/getByAdAccount"></a>
# **ssioInsertionOrdersStatus/getByAdAccount**
> ssio_insertion_orders_status_get_by_ad_account_200_response ssioInsertionOrdersStatus/getByAdAccount(ad\_account\_id, bookmark, page\_size)

Get insertion order status by ad account id.

    Get insertion order status for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**ssio_insertion_orders_status_get_by_ad_account_200_response**](../Models/ssio_insertion_orders_status_get_by_ad_account_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="ssioInsertionOrdersStatus/getByPinOrderId"></a>
# **ssioInsertionOrdersStatus/getByPinOrderId**
> SSIOInsertionOrderStatusResponse ssioInsertionOrdersStatus/getByPinOrderId(ad\_account\_id, pin\_order\_id)

Get insertion order status by pin order id.

    Get insertion order status for pin order id &lt;code&gt;pin_order_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **pin\_order\_id** | **String**| The pin order id associated with the ssio insertion order | [default to null] |

### Return type

[**SSIOInsertionOrderStatusResponse**](../Models/SSIOInsertionOrderStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="ssioOrderLines/getByAdAccount"></a>
# **ssioOrderLines/getByAdAccount**
> ssio_order_lines_get_by_ad_account_200_response ssioOrderLines/getByAdAccount(ad\_account\_id, bookmark, page\_size, pin\_order\_id)

Get Salesforce order lines by ad account id.

    Get Salesforce order lines for account id &lt;code&gt;ad_account_id&lt;/code&gt;. - The token&#39;s user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\&quot;&gt;Business Access&lt;/a&gt;: Admin, Finance, Campaign.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **pin\_order\_id** | **String**| The pin order id associated with the ssio insertino order | [optional] [default to null] |

### Return type

[**ssio_order_lines_get_by_ad_account_200_response**](../Models/ssio_order_lines_get_by_ad_account_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

