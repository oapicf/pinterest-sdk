# \ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiser_defined_events_slash_get**](ConversionsApi.md#advertiser_defined_events_slash_get) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events



## advertiser_defined_events_slash_get

> models::AdvertiserDefinedEventsResponse advertiser_defined_events_slash_get(ad_account_id)
Get advertiser defined events

<p>Get advertiser defined events for the given ad account.</p>

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |

### Return type

[**models::AdvertiserDefinedEventsResponse**](AdvertiserDefinedEventsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

