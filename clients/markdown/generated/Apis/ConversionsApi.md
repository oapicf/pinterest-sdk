# ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**advertiserDefinedEvents/create**](ConversionsApi.md#advertiserDefinedEvents/create) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events |
| [**advertiserDefinedEvents/delete**](ConversionsApi.md#advertiserDefinedEvents/delete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events |
| [**advertiserDefinedEvents/get**](ConversionsApi.md#advertiserDefinedEvents/get) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events |
| [**advertiserDefinedEvents/update**](ConversionsApi.md#advertiserDefinedEvents/update) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events |


<a name="advertiserDefinedEvents/create"></a>
# **advertiserDefinedEvents/create**
> advertiser_defined_events_create_200_response advertiserDefinedEvents/create(ad\_account\_id, AdvertiserDefinedEventsCreateRequest)

Create advertiser defined events

    Map advertiser defined events to standard events for the given ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdvertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](../Models/AdvertiserDefinedEventsCreateRequest.md)|  | |

### Return type

[**advertiser_defined_events_create_200_response**](../Models/advertiser_defined_events_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="advertiserDefinedEvents/delete"></a>
# **advertiserDefinedEvents/delete**
> advertiser_defined_events_create_200_response advertiserDefinedEvents/delete(ad\_account\_id, event\_names)

Delete advertiser defined events

    Untrack advertiser defined events for the given ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **event\_names** | [**List**](../Models/String.md)| List of event names to delete | [default to null] |

### Return type

[**advertiser_defined_events_create_200_response**](../Models/advertiser_defined_events_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="advertiserDefinedEvents/get"></a>
# **advertiserDefinedEvents/get**
> advertiser_defined_events_get_200_response advertiserDefinedEvents/get(ad\_account\_id)

Get advertiser defined events

    Get advertiser defined events for the given ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |

### Return type

[**advertiser_defined_events_get_200_response**](../Models/advertiser_defined_events_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="advertiserDefinedEvents/update"></a>
# **advertiserDefinedEvents/update**
> advertiser_defined_events_create_200_response advertiserDefinedEvents/update(ad\_account\_id, AdvertiserDefinedEventsCreateRequest)

Update advertiser defined events

    Update advertiser defined event names or mappings for the given ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdvertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](../Models/AdvertiserDefinedEventsCreateRequest.md)|  | |

### Return type

[**advertiser_defined_events_create_200_response**](../Models/advertiser_defined_events_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

