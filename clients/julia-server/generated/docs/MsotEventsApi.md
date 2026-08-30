# MsotEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**msot_events_create**](MsotEventsApi.md#msot_events_create) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events


# **msot_events_create**
> `msot_events_create`(req::`HTTP.Request`, `ad_account_id`::`String`, `conversion_m_s_o_t_events_create`::`ConversionMSOTEventsCreate`;) -> `Nothing`

Send Measurement Source Of Truth (MSOT) attributed conversion events

**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`conversion_m_s_o_t_events_create`** | [**`ConversionMSOTEventsCreate`**](ConversionMSOTEventsCreate.md)|  |

### Return type

`Nothing`

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

