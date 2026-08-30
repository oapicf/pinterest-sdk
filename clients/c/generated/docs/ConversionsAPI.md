# ConversionsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConversionsAPI_advertiserDefinedEventsCreate**](ConversionsAPI.md#ConversionsAPI_advertiserDefinedEventsCreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**ConversionsAPI_advertiserDefinedEventsDelete**](ConversionsAPI.md#ConversionsAPI_advertiserDefinedEventsDelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**ConversionsAPI_advertiserDefinedEventsGet**](ConversionsAPI.md#ConversionsAPI_advertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**ConversionsAPI_advertiserDefinedEventsUpdate**](ConversionsAPI.md#ConversionsAPI_advertiserDefinedEventsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events


# **ConversionsAPI_advertiserDefinedEventsCreate**
```c
// Create advertiser defined events
//
// Map advertiser defined events to standard events for the given ad account.
//
advertiser_defined_events_create_200_response_t* ConversionsAPI_advertiserDefinedEventsCreate(apiClient_t *apiClient, char *ad_account_id, advertiser_defined_events_create_request_t *advertiser_defined_events_create_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**advertiser_defined_events_create_request** | **[advertiser_defined_events_create_request_t](advertiser_defined_events_create_request.md) \*** |  | 

### Return type

[advertiser_defined_events_create_200_response_t](advertiser_defined_events_create_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConversionsAPI_advertiserDefinedEventsDelete**
```c
// Delete advertiser defined events
//
// Untrack advertiser defined events for the given ad account.
//
advertiser_defined_events_create_200_response_t* ConversionsAPI_advertiserDefinedEventsDelete(apiClient_t *apiClient, char *ad_account_id, list_t *event_names);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**event_names** | **[list_t](char.md) \*** | List of event names to delete | 

### Return type

[advertiser_defined_events_create_200_response_t](advertiser_defined_events_create_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConversionsAPI_advertiserDefinedEventsGet**
```c
// Get advertiser defined events
//
// Get advertiser defined events for the given ad account.
//
advertiser_defined_events_get_200_response_t* ConversionsAPI_advertiserDefinedEventsGet(apiClient_t *apiClient, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type

[advertiser_defined_events_get_200_response_t](advertiser_defined_events_get_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConversionsAPI_advertiserDefinedEventsUpdate**
```c
// Update advertiser defined events
//
// Update advertiser defined event names or mappings for the given ad account.
//
advertiser_defined_events_create_200_response_t* ConversionsAPI_advertiserDefinedEventsUpdate(apiClient_t *apiClient, char *ad_account_id, advertiser_defined_events_create_request_t *advertiser_defined_events_create_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**advertiser_defined_events_create_request** | **[advertiser_defined_events_create_request_t](advertiser_defined_events_create_request.md) \*** |  | 

### Return type

[advertiser_defined_events_create_200_response_t](advertiser_defined_events_create_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

