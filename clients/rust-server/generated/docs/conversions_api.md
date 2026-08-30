# conversions_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**advertiser_defined_events/create**](conversions_api.md#advertiser_defined_events/create) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
**advertiser_defined_events/delete**](conversions_api.md#advertiser_defined_events/delete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
**advertiser_defined_events/get**](conversions_api.md#advertiser_defined_events/get) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
**advertiser_defined_events/update**](conversions_api.md#advertiser_defined_events/update) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events


# **advertiser_defined_events/create**
> models::AdvertiserDefinedEventsCreate200Response advertiser_defined_events/create(ctx, ctx, ad_account_id, advertiser_defined_events_create_request)
Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **advertiser_defined_events_create_request** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  | 

### Return type

[**models::AdvertiserDefinedEventsCreate200Response**](advertiser_defined_events_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiser_defined_events/delete**
> models::AdvertiserDefinedEventsCreate200Response advertiser_defined_events/delete(ctx, ctx, ad_account_id, event_names)
Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **event_names** | [**String**](String.md)| List of event names to delete | 

### Return type

[**models::AdvertiserDefinedEventsCreate200Response**](advertiser_defined_events_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiser_defined_events/get**
> models::AdvertiserDefinedEventsGet200Response advertiser_defined_events/get(ctx, ctx, ad_account_id)
Get advertiser defined events

Get advertiser defined events for the given ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 

### Return type

[**models::AdvertiserDefinedEventsGet200Response**](advertiser_defined_events_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiser_defined_events/update**
> models::AdvertiserDefinedEventsCreate200Response advertiser_defined_events/update(ctx, ctx, ad_account_id, advertiser_defined_events_create_request)
Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **advertiser_defined_events_create_request** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  | 

### Return type

[**models::AdvertiserDefinedEventsCreate200Response**](advertiser_defined_events_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

