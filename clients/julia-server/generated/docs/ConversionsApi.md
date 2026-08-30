# ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiser_defined_events_create**](ConversionsApi.md#advertiser_defined_events_create) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**advertiser_defined_events_delete**](ConversionsApi.md#advertiser_defined_events_delete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**advertiser_defined_events_get**](ConversionsApi.md#advertiser_defined_events_get) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**advertiser_defined_events_update**](ConversionsApi.md#advertiser_defined_events_update) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events


# **advertiser_defined_events_create**
> `advertiser_defined_events_create`(req::`HTTP.Request`, `ad_account_id`::`String`, `advertiser_defined_events_create_request`::`AdvertiserDefinedEventsCreateRequest`;) -> `AdvertiserDefinedEventsCreate200Response`

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`advertiser_defined_events_create_request`** | [**`AdvertiserDefinedEventsCreateRequest`**](AdvertiserDefinedEventsCreateRequest.md)|  |

### Return type

[**`AdvertiserDefinedEventsCreate200Response`**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiser_defined_events_delete**
> `advertiser_defined_events_delete`(req::`HTTP.Request`, `ad_account_id`::`String`, `event_names`::`Vector{String}`;) -> `AdvertiserDefinedEventsCreate200Response`

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`event_names`** | [**`Vector{String}`**](String.md)| List of event names to delete |

### Return type

[**`AdvertiserDefinedEventsCreate200Response`**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiser_defined_events_get**
> `advertiser_defined_events_get`(req::`HTTP.Request`, `ad_account_id`::`String`;) -> `AdvertiserDefinedEventsGet200Response`

Get advertiser defined events

Get advertiser defined events for the given ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Return type

[**`AdvertiserDefinedEventsGet200Response`**](AdvertiserDefinedEventsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **advertiser_defined_events_update**
> `advertiser_defined_events_update`(req::`HTTP.Request`, `ad_account_id`::`String`, `advertiser_defined_events_create_request`::`AdvertiserDefinedEventsCreateRequest`;) -> `AdvertiserDefinedEventsCreate200Response`

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`advertiser_defined_events_create_request`** | [**`AdvertiserDefinedEventsCreateRequest`**](AdvertiserDefinedEventsCreateRequest.md)|  |

### Return type

[**`AdvertiserDefinedEventsCreate200Response`**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

