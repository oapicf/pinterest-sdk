# CONVERSIONS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**advertiser_defined_events_create**](CONVERSIONS_API.md#advertiser_defined_events_create) | **Post** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**advertiser_defined_events_delete**](CONVERSIONS_API.md#advertiser_defined_events_delete) | **Delete** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**advertiser_defined_events_get**](CONVERSIONS_API.md#advertiser_defined_events_get) | **Get** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**advertiser_defined_events_update**](CONVERSIONS_API.md#advertiser_defined_events_update) | **Patch** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events


# **advertiser_defined_events_create**
> advertiser_defined_events_create (ad_account_id: STRING_32 ; advertiser_defined_events_create_request: ADVERTISER_DEFINED_EVENTS_CREATE_REQUEST ): detachable ADVERTISER_DEFINED_EVENTS_CREATE_200_RESPONSE


Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **advertiser_defined_events_create_request** | [**ADVERTISER_DEFINED_EVENTS_CREATE_REQUEST**](ADVERTISER_DEFINED_EVENTS_CREATE_REQUEST.md)|  | 

### Return type

[**ADVERTISER_DEFINED_EVENTS_CREATE_200_RESPONSE**](advertiser_defined_events_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiser_defined_events_delete**
> advertiser_defined_events_delete (ad_account_id: STRING_32 ; event_names: LIST [STRING_32] ): detachable ADVERTISER_DEFINED_EVENTS_CREATE_200_RESPONSE


Delete advertiser defined events

Untrack advertiser defined events for the given ad account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **event_names** | [**LIST [STRING_32]**](STRING_32.md)| List of event names to delete | [default to null]

### Return type

[**ADVERTISER_DEFINED_EVENTS_CREATE_200_RESPONSE**](advertiser_defined_events_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiser_defined_events_get**
> advertiser_defined_events_get (ad_account_id: STRING_32 ): detachable ADVERTISER_DEFINED_EVENTS_GET_200_RESPONSE


Get advertiser defined events

Get advertiser defined events for the given ad account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]

### Return type

[**ADVERTISER_DEFINED_EVENTS_GET_200_RESPONSE**](advertiser_defined_events_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiser_defined_events_update**
> advertiser_defined_events_update (ad_account_id: STRING_32 ; advertiser_defined_events_create_request: ADVERTISER_DEFINED_EVENTS_CREATE_REQUEST ): detachable ADVERTISER_DEFINED_EVENTS_CREATE_200_RESPONSE


Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **advertiser_defined_events_create_request** | [**ADVERTISER_DEFINED_EVENTS_CREATE_REQUEST**](ADVERTISER_DEFINED_EVENTS_CREATE_REQUEST.md)|  | 

### Return type

[**ADVERTISER_DEFINED_EVENTS_CREATE_200_RESPONSE**](advertiser_defined_events_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

