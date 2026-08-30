# LeadAdsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeadAdsAPI_adAccountsSubscriptionsDelById**](LeadAdsAPI.md#LeadAdsAPI_adAccountsSubscriptionsDelById) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**LeadAdsAPI_adAccountsSubscriptionsGetById**](LeadAdsAPI.md#LeadAdsAPI_adAccountsSubscriptionsGetById) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
[**LeadAdsAPI_adAccountsSubscriptionsGetList**](LeadAdsAPI.md#LeadAdsAPI_adAccountsSubscriptionsGetList) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**LeadAdsAPI_adAccountsSubscriptionsPost**](LeadAdsAPI.md#LeadAdsAPI_adAccountsSubscriptionsPost) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription


# **LeadAdsAPI_adAccountsSubscriptionsDelById**
```c
// Delete lead ads subscription
//
// Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
//
lead_subscription_t* LeadAdsAPI_adAccountsSubscriptionsDelById(apiClient_t *apiClient, char *ad_account_id, char *subscription_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**subscription_id** | **char \*** | Unique identifier of a subscription. | 

### Return type

[lead_subscription_t](lead_subscription.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LeadAdsAPI_adAccountsSubscriptionsGetById**
```c
// Get lead ads subscription by ID
//
// Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'
//
lead_subscription_t* LeadAdsAPI_adAccountsSubscriptionsGetById(apiClient_t *apiClient, char *ad_account_id, char *subscription_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**subscription_id** | **char \*** | Unique identifier of a subscription. | 

### Return type

[lead_subscription_t](lead_subscription.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LeadAdsAPI_adAccountsSubscriptionsGetList**
```c
// Get lead ads subscriptions
//
// Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.
//
ad_accounts_subscriptions_get_list_200_response_t* LeadAdsAPI_adAccountsSubscriptionsGetList(apiClient_t *apiClient, char *ad_account_id, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[ad_accounts_subscriptions_get_list_200_response_t](ad_accounts_subscriptions_get_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LeadAdsAPI_adAccountsSubscriptionsPost**
```c
// Create lead ads subscription
//
// Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.
//
lead_subscription_t* LeadAdsAPI_adAccountsSubscriptionsPost(apiClient_t *apiClient, char *ad_account_id, lead_subscription_post_params_create_t *lead_subscription_post_params_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**lead_subscription_post_params_create** | **[lead_subscription_post_params_create_t](lead_subscription_post_params_create.md) \*** |  | 

### Return type

[lead_subscription_t](lead_subscription.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

