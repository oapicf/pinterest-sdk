# LEADADS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**ad_accounts_subscriptions_del_by_id**](LEADADS_API.md#ad_accounts_subscriptions_del_by_id) | **Delete** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Delete lead ads subscription
[**ad_accounts_subscriptions_get_by_id**](LEADADS_API.md#ad_accounts_subscriptions_get_by_id) | **Get** /ad_accounts/{ad_account_id}/leads/subscriptions/{subscription_id} | Get lead ads subscription by ID
[**ad_accounts_subscriptions_get_list**](LEADADS_API.md#ad_accounts_subscriptions_get_list) | **Get** /ad_accounts/{ad_account_id}/leads/subscriptions | Get lead ads subscriptions
[**ad_accounts_subscriptions_post**](LEADADS_API.md#ad_accounts_subscriptions_post) | **Post** /ad_accounts/{ad_account_id}/leads/subscriptions | Create lead ads subscription


# **ad_accounts_subscriptions_del_by_id**
> ad_accounts_subscriptions_del_by_id (ad_account_id: STRING_32 ; subscription_id: STRING_32 ): detachable LEAD_SUBSCRIPTION


Delete lead ads subscription

Delete an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **subscription_id** | **STRING_32**| Unique identifier of a subscription. | [default to null]

### Return type

[**LEAD_SUBSCRIPTION**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_subscriptions_get_by_id**
> ad_accounts_subscriptions_get_by_id (ad_account_id: STRING_32 ; subscription_id: STRING_32 ): detachable LEAD_SUBSCRIPTION


Get lead ads subscription by ID

Get an existing lead ads webhook subscription by ID.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.'


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **subscription_id** | **STRING_32**| Unique identifier of a subscription. | [default to null]

### Return type

[**LEAD_SUBSCRIPTION**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_subscriptions_get_list**
> ad_accounts_subscriptions_get_list (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable AD_ACCOUNTS_SUBSCRIPTIONS_GET_LIST_200_RESPONSE


Get lead ads subscriptions

Get the advertiser's list of lead ads subscriptions. Only requests for the OWNER or ADMIN of the ad_account will be allowed.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**AD_ACCOUNTS_SUBSCRIPTIONS_GET_LIST_200_RESPONSE**](ad_accounts_subscriptions_get_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ad_accounts_subscriptions_post**
> ad_accounts_subscriptions_post (ad_account_id: STRING_32 ; lead_subscription_post_params_create: LEAD_SUBSCRIPTION_POST_PARAMS_CREATE ): detachable LEAD_SUBSCRIPTION


Create lead ads subscription

Create a lead ads webhook subscription. Subscriptions allow Pinterest to deliver lead data from Ads Manager directly to the subscriber. Subscriptions can exist for a specific lead form or at ad account level.   - Only requests for the OWNER or ADMIN of the ad_account will be allowed.   - Advertisers can set up multiple integrations using ad_account_id + lead_form_id but only one integration per unique records.   - For data security, egress lead data is encrypted with AES-256-GCM.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **lead_subscription_post_params_create** | [**LEAD_SUBSCRIPTION_POST_PARAMS_CREATE**](LEAD_SUBSCRIPTION_POST_PARAMS_CREATE.md)|  | 

### Return type

[**LEAD_SUBSCRIPTION**](LeadSubscription.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

