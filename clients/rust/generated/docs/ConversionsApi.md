# \ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiser_defined_events_slash_create**](ConversionsApi.md#advertiser_defined_events_slash_create) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**advertiser_defined_events_slash_delete**](ConversionsApi.md#advertiser_defined_events_slash_delete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**advertiser_defined_events_slash_get**](ConversionsApi.md#advertiser_defined_events_slash_get) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**advertiser_defined_events_slash_update**](ConversionsApi.md#advertiser_defined_events_slash_update) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events



## advertiser_defined_events_slash_create

> models::AdvertiserDefinedEventsCreate200Response advertiser_defined_events_slash_create(ad_account_id, advertiser_defined_events_create_request)
Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**advertiser_defined_events_create_request** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md) |  | [required] |

### Return type

[**models::AdvertiserDefinedEventsCreate200Response**](advertiser_defined_events_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## advertiser_defined_events_slash_delete

> models::AdvertiserDefinedEventsCreate200Response advertiser_defined_events_slash_delete(ad_account_id, event_names)
Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**event_names** | [**Vec<String>**](String.md) | List of event names to delete | [required] |

### Return type

[**models::AdvertiserDefinedEventsCreate200Response**](advertiser_defined_events_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## advertiser_defined_events_slash_get

> models::AdvertiserDefinedEventsGet200Response advertiser_defined_events_slash_get(ad_account_id)
Get advertiser defined events

Get advertiser defined events for the given ad account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |

### Return type

[**models::AdvertiserDefinedEventsGet200Response**](advertiser_defined_events_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## advertiser_defined_events_slash_update

> models::AdvertiserDefinedEventsCreate200Response advertiser_defined_events_slash_update(ad_account_id, advertiser_defined_events_create_request)
Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**advertiser_defined_events_create_request** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md) |  | [required] |

### Return type

[**models::AdvertiserDefinedEventsCreate200Response**](advertiser_defined_events_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

