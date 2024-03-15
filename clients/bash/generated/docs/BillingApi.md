# BillingApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adsCreditRedeem**](BillingApi.md#adsCreditRedeem) | **POST** /ad_accounts/{ad_account_id}/ads_credit/redeem | Redeem ad credits
[**adsCreditsDiscountsGet**](BillingApi.md#adsCreditsDiscountsGet) | **GET** /ad_accounts/{ad_account_id}/ads_credit/discounts | Get ads credit discounts
[**billingProfilesGet**](BillingApi.md#billingProfilesGet) | **GET** /ad_accounts/{ad_account_id}/billing_profiles | Get billing profiles
[**ssioAccountsGet**](BillingApi.md#ssioAccountsGet) | **GET** /ad_accounts/{ad_account_id}/ssio/accounts | Get Salesforce account details including bill-to information.
[**ssioInsertionOrderCreate**](BillingApi.md#ssioInsertionOrderCreate) | **POST** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Create insertion order through SSIO.
[**ssioInsertionOrderEdit**](BillingApi.md#ssioInsertionOrderEdit) | **PATCH** /ad_accounts/{ad_account_id}/ssio/insertion_orders | Edit insertion order through SSIO.
[**ssioInsertionOrdersStatusGetByAdAccount**](BillingApi.md#ssioInsertionOrdersStatusGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/status | Get insertion order status by ad account id.
[**ssioInsertionOrdersStatusGetByPinOrderId**](BillingApi.md#ssioInsertionOrdersStatusGetByPinOrderId) | **GET** /ad_accounts/{ad_account_id}/ssio/insertion_orders/{pin_order_id}/status | Get insertion order status by pin order id.
[**ssioOrderLinesGetByAdAccount**](BillingApi.md#ssioOrderLinesGetByAdAccount) | **GET** /ad_accounts/{ad_account_id}/ssio/order_lines | Get Salesforce order lines by ad account id.



## adsCreditRedeem

Redeem ad credits

Redeem ads credit on behalf of the ad account id and apply it towards billing.

<strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example

```bash
 adsCreditRedeem ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **adsCreditRedeemRequest** | [**AdsCreditRedeemRequest**](AdsCreditRedeemRequest.md) | Redeem ad credits request. |

### Return type

[**AdsCreditRedeemResponse**](AdsCreditRedeemResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adsCreditsDiscountsGet

Get ads credit discounts

Returns the list of discounts applied to the account.

<strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example

```bash
 adsCreditsDiscountsGet ad_account_id=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [optional] [default to 25]

### Return type

[**AdsCreditsDiscountsGet200Response**](AdsCreditsDiscountsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## billingProfilesGet

Get billing profiles

Get billing profiles in the advertiser account.

<strong>This endpoint might not be available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example

```bash
 billingProfilesGet ad_account_id=value  is_active=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **isActive** | **boolean** | Return active billing profiles, if false return all billing profiles. | [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [optional] [default to 25]

### Return type

[**BillingProfilesGet200Response**](BillingProfilesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ssioAccountsGet

Get Salesforce account details including bill-to information.

Get Salesforce account details including bill-to information to be used in insertion orders process for <code>ad_account_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example

```bash
 ssioAccountsGet ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]

### Return type

[**SSIOAccountResponse**](SSIOAccountResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ssioInsertionOrderCreate

Create insertion order through SSIO.

Create insertion order through SSIO for <code>ad_account_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example

```bash
 ssioInsertionOrderCreate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **sSIOCreateInsertionOrderRequest** | [**SSIOCreateInsertionOrderRequest**](SSIOCreateInsertionOrderRequest.md) | Order line to create. |

### Return type

[**SSIOCreateInsertionOrderResponse**](SSIOCreateInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ssioInsertionOrderEdit

Edit insertion order through SSIO.

Edit insertion order through SSIO for <code>ad_account_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example

```bash
 ssioInsertionOrderEdit ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **sSIOEditInsertionOrderRequest** | [**SSIOEditInsertionOrderRequest**](SSIOEditInsertionOrderRequest.md) | Order line to create. |

### Return type

[**SSIOEditInsertionOrderResponse**](SSIOEditInsertionOrderResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ssioInsertionOrdersStatusGetByAdAccount

Get insertion order status by ad account id.

Get insertion order status for account id <code>ad_account_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example

```bash
 ssioInsertionOrdersStatusGetByAdAccount ad_account_id=value  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [optional] [default to 25]

### Return type

[**SsioInsertionOrdersStatusGetByAdAccount200Response**](SsioInsertionOrdersStatusGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ssioInsertionOrdersStatusGetByPinOrderId

Get insertion order status by pin order id.

Get insertion order status for pin order id <code>pin_order_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example

```bash
 ssioInsertionOrdersStatusGetByPinOrderId ad_account_id=value pin_order_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **pinOrderId** | **string** | The pin order id associated with the ssio insertion order | [default to null]

### Return type

[**SSIOInsertionOrderStatusResponse**](SSIOInsertionOrderStatusResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ssioOrderLinesGetByAdAccount

Get Salesforce order lines by ad account id.

Get Salesforce order lines for account id <code>ad_account_id</code>.
- The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Finance, Campaign.

### Example

```bash
 ssioOrderLinesGetByAdAccount ad_account_id=value  bookmark=value  page_size=value  pin_order_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [optional] [default to 25]
 **pinOrderId** | **string** | The pin order id associated with the ssio insertino order | [optional] [default to null]

### Return type

[**SsioOrderLinesGetByAdAccount200Response**](SsioOrderLinesGetByAdAccount200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

