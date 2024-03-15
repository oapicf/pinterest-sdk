# lead_ads_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**ad_accounts_subscriptions/del_by_id**](lead_ads_api.md#ad_accounts_subscriptions/del_by_id) | **DELETE** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
**ad_accounts_subscriptions/get_by_id**](lead_ads_api.md#ad_accounts_subscriptions/get_by_id) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription
**ad_accounts_subscriptions/get_list**](lead_ads_api.md#ad_accounts_subscriptions/get_list) | **GET** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
**ad_accounts_subscriptions/post**](lead_ads_api.md#ad_accounts_subscriptions/post) | **POST** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription


# **ad_accounts_subscriptions/del_by_id**
> ad_accounts_subscriptions/del_by_id(ctx, ad_account_id, subscription_id)
Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **subscription_id** | **String**| Unique identifier of a subscription. | 

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_subscriptions/get_by_id**
> models::AdAccountGetSubscriptionResponse ad_accounts_subscriptions/get_by_id(ctx, ad_account_id, subscription_id)
Get lead ads subscription

Get a specific lead ads subscription record. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **subscription_id** | **String**| Unique identifier of a subscription. | 

### Return type

[**models::AdAccountGetSubscriptionResponse**](AdAccountGetSubscriptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_subscriptions/get_list**
> models::AdAccountsSubscriptionsGetList200Response ad_accounts_subscriptions/get_list(ctx, ad_account_id, optional)
Get lead ads subscriptions

Get the advertiser's list of lead ads subscriptions. - Only requests for the OWNER or ADMIN of the ad_account will be allowed.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **page_size** | **i32**| Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. | [default to 25]
 **bookmark** | **String**| Cursor used to fetch the next page of items | 

### Return type

[**models::AdAccountsSubscriptionsGetList200Response**](ad_accounts_subscriptions_get_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_subscriptions/post**
> models::AdAccountCreateSubscriptionResponse ad_accounts_subscriptions/post(ctx, ad_account_id, ad_account_create_subscription_request)
Create lead ads subscription

Create a lead ads webhook subscription. - Only requests for the OWNER or ADMIN of the ad_account will be allowed. - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **ad_account_create_subscription_request** | [**AdAccountCreateSubscriptionRequest**](AdAccountCreateSubscriptionRequest.md)| Subscription to create. | 

### Return type

[**models::AdAccountCreateSubscriptionResponse**](AdAccountCreateSubscriptionResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

