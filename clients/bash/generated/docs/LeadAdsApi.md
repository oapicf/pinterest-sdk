# LeadAdsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsSubscriptionsDelById**](LeadAdsApi.md#adAccountsSubscriptionsDelById) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**adAccountsSubscriptionsGetById**](LeadAdsApi.md#adAccountsSubscriptionsGetById) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription
[**adAccountsSubscriptionsGetList**](LeadAdsApi.md#adAccountsSubscriptionsGetList) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**adAccountsSubscriptionsPost**](LeadAdsApi.md#adAccountsSubscriptionsPost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription



## adAccountsSubscriptionsDelById

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example

```bash
 adAccountsSubscriptionsDelById ad_account_id=value subscription_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **subscriptionId** | **string** | Unique identifier of a subscription. | [default to null]

### Return type

(empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adAccountsSubscriptionsGetById

Get lead ads subscription

Get a specific lead ads subscription record.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example

```bash
 adAccountsSubscriptionsGetById ad_account_id=value subscription_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **subscriptionId** | **string** | Unique identifier of a subscription. | [default to null]

### Return type

[**AdAccountGetSubscriptionResponse**](AdAccountGetSubscriptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adAccountsSubscriptionsGetList

Get lead ads subscriptions

Get the advertiser's list of lead ads subscriptions.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example

```bash
 adAccountsSubscriptionsGetList ad_account_id=value  page_size=value  bookmark=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [optional] [default to 25]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**AdAccountsSubscriptionsGetList200Response**](AdAccountsSubscriptionsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## adAccountsSubscriptionsPost

Create lead ads subscription

Create a lead ads webhook subscription.
- Only requests for the OWNER or ADMIN of the ad_account will be allowed.
- Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example

```bash
 adAccountsSubscriptionsPost ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **adAccountCreateSubscriptionRequest** | [**AdAccountCreateSubscriptionRequest**](AdAccountCreateSubscriptionRequest.md) | Subscription to create. |

### Return type

[**AdAccountCreateSubscriptionResponse**](AdAccountCreateSubscriptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

