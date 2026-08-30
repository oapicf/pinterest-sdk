# MsotEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**msotEvents/create**](MsotEventsApi.md#msotEvents/create) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events |


<a name="msotEvents/create"></a>
# **msotEvents/create**
> msotEvents/create(ad\_account\_id, ConversionMSOTEventsCreate)

Send Measurement Source Of Truth (MSOT) attributed conversion events

    **This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **ConversionMSOTEventsCreate** | [**ConversionMSOTEventsCreate**](../Models/ConversionMSOTEventsCreate.md)|  | |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

