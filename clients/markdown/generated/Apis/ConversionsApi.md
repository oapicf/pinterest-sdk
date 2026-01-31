# ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**advertiserDefinedEvents/get**](ConversionsApi.md#advertiserDefinedEvents/get) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events |


<a name="advertiserDefinedEvents/get"></a>
# **advertiserDefinedEvents/get**
> AdvertiserDefinedEventsResponse advertiserDefinedEvents/get(ad\_account\_id)

Get advertiser defined events

    &lt;p&gt;Get advertiser defined events for the given ad account.&lt;/p&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |

### Return type

[**AdvertiserDefinedEventsResponse**](../Models/AdvertiserDefinedEventsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

