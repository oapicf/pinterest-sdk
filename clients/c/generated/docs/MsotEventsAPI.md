# MsotEventsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MsotEventsAPI_msotEventsCreate**](MsotEventsAPI.md#MsotEventsAPI_msotEventsCreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events


# **MsotEventsAPI_msotEventsCreate**
```c
// Send Measurement Source Of Truth (MSOT) attributed conversion events
//
// **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.
//
void MsotEventsAPI_msotEventsCreate(apiClient_t *apiClient, char *ad_account_id, conversion_msot_events_create_t *conversion_msot_events_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**conversion_msot_events_create** | **[conversion_msot_events_create_t](conversion_msot_events_create.md) \*** |  | 

### Return type

void

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

