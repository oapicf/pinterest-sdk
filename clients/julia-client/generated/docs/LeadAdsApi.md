# LeadAdsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ad_accounts_subscriptions_del_by_id**](LeadAdsApi.md#ad_accounts_subscriptions_del_by_id) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**ad_accounts_subscriptions_get_by_id**](LeadAdsApi.md#ad_accounts_subscriptions_get_by_id) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
[**ad_accounts_subscriptions_get_list**](LeadAdsApi.md#ad_accounts_subscriptions_get_list) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**ad_accounts_subscriptions_post**](LeadAdsApi.md#ad_accounts_subscriptions_post) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription


# **ad_accounts_subscriptions_del_by_id**
> `ad_accounts_subscriptions_del_by_id`(_api::`LeadAdsApi`, `ad_account_id`::`String`, `subscription_id`::`String`; _mediaType=nothing) -> `LeadSubscription`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_accounts_subscriptions_del_by_id`(_api::`LeadAdsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `subscription_id`::`String`; _mediaType=nothing) -> `Channel`{ `LeadSubscription` }, `OpenAPI.Clients.ApiResponse`

Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LeadAdsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`subscription_id`** | **`String`** | Unique identifier of a subscription. |

### Return type

[**`LeadSubscription`**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **ad_accounts_subscriptions_get_by_id**
> `ad_accounts_subscriptions_get_by_id`(_api::`LeadAdsApi`, `ad_account_id`::`String`, `subscription_id`::`String`; _mediaType=nothing) -> `LeadSubscription`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_accounts_subscriptions_get_by_id`(_api::`LeadAdsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `subscription_id`::`String`; _mediaType=nothing) -> `Channel`{ `LeadSubscription` }, `OpenAPI.Clients.ApiResponse`

Get lead ads subscription by ID

Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LeadAdsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`subscription_id`** | **`String`** | Unique identifier of a subscription. |

### Return type

[**`LeadSubscription`**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **ad_accounts_subscriptions_get_list**
> `ad_accounts_subscriptions_get_list`(_api::`LeadAdsApi`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `AdAccountsSubscriptionsGetList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_accounts_subscriptions_get_list`(_api::`LeadAdsApi`, response_stream::`Channel`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `AdAccountsSubscriptionsGetList200Response` }, `OpenAPI.Clients.ApiResponse`

Get lead ads subscriptions

Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LeadAdsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`AdAccountsSubscriptionsGetList200Response`**](AdAccountsSubscriptionsGetList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **ad_accounts_subscriptions_post**
> `ad_accounts_subscriptions_post`(_api::`LeadAdsApi`, `ad_account_id`::`String`, `lead_subscription_post_params_create`::`LeadSubscriptionPostParamsCreate`; _mediaType=nothing) -> `LeadSubscription`, `OpenAPI.Clients.ApiResponse` <br/>
> `ad_accounts_subscriptions_post`(_api::`LeadAdsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `lead_subscription_post_params_create`::`LeadSubscriptionPostParamsCreate`; _mediaType=nothing) -> `Channel`{ `LeadSubscription` }, `OpenAPI.Clients.ApiResponse`

Create lead ads subscription

Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LeadAdsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`lead_subscription_post_params_create`** | [**`LeadSubscriptionPostParamsCreate`**](LeadSubscriptionPostParamsCreate.md) |  |

### Return type

[**`LeadSubscription`**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

