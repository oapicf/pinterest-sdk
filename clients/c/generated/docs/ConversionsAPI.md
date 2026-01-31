# ConversionsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConversionsAPI_advertiserDefinedEventsGet**](ConversionsAPI.md#ConversionsAPI_advertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events


# **ConversionsAPI_advertiserDefinedEventsGet**
```c
// Get advertiser defined events
//
// <p>Get advertiser defined events for the given ad account.</p>
//
advertiser_defined_events_response_t* ConversionsAPI_advertiserDefinedEventsGet(apiClient_t *apiClient, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type

[advertiser_defined_events_response_t](advertiser_defined_events_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

