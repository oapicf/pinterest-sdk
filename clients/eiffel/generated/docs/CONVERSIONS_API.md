# CONVERSIONS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**advertiser_defined_events_get**](CONVERSIONS_API.md#advertiser_defined_events_get) | **Get** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events


# **advertiser_defined_events_get**
> advertiser_defined_events_get (ad_account_id: STRING_32 ): detachable ADVERTISER_DEFINED_EVENTS_RESPONSE


Get advertiser defined events

<p>Get advertiser defined events for the given ad account.</p>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]

### Return type

[**ADVERTISER_DEFINED_EVENTS_RESPONSE**](AdvertiserDefinedEventsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

