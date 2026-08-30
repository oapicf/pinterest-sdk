# LeadAdsController

All URIs are relative to `"/v5"`

The controller class is defined in **[LeadAdsController.java](../../src/main/java/org/openapitools/controller/LeadAdsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsSubscriptionsDelById**](#adAccountsSubscriptionsDelById) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**adAccountsSubscriptionsGetById**](#adAccountsSubscriptionsGetById) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
[**adAccountsSubscriptionsGetList**](#adAccountsSubscriptionsGetList) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**adAccountsSubscriptionsPost**](#adAccountsSubscriptionsPost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription

<a id="adAccountsSubscriptionsDelById"></a>
# **adAccountsSubscriptionsDelById**
```java
Mono<LeadSubscription> LeadAdsController.adAccountsSubscriptionsDelById(adAccountIdsubscriptionId)
```

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**subscriptionId** | `String` | Unique identifier of a subscription. |

### Return type
[**LeadSubscription**](../../docs/models/LeadSubscription.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="adAccountsSubscriptionsGetById"></a>
# **adAccountsSubscriptionsGetById**
```java
Mono<LeadSubscription> LeadAdsController.adAccountsSubscriptionsGetById(adAccountIdsubscriptionId)
```

Get lead ads subscription by ID

Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.&#39;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**subscriptionId** | `String` | Unique identifier of a subscription. |

### Return type
[**LeadSubscription**](../../docs/models/LeadSubscription.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="adAccountsSubscriptionsGetList"></a>
# **adAccountsSubscriptionsGetList**
```java
Mono<AdAccountsSubscriptionsGetList200Response> LeadAdsController.adAccountsSubscriptionsGetList(adAccountIdbookmarkpageSize)
```

Get lead ads subscriptions

Get the advertiser&#39;s list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**bookmark** | `String` | Cursor used to fetch the next page of items | [optional parameter]
**pageSize** | `Integer` | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional parameter] [default to `25`]

### Return type
[**AdAccountsSubscriptionsGetList200Response**](../../docs/models/AdAccountsSubscriptionsGetList200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="adAccountsSubscriptionsPost"></a>
# **adAccountsSubscriptionsPost**
```java
Mono<LeadSubscription> LeadAdsController.adAccountsSubscriptionsPost(adAccountIdleadSubscriptionPostParamsCreate)
```

Create lead ads subscription

Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**leadSubscriptionPostParamsCreate** | [**LeadSubscriptionPostParamsCreate**](../../docs/models/LeadSubscriptionPostParamsCreate.md) |  |

### Return type
[**LeadSubscription**](../../docs/models/LeadSubscription.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

