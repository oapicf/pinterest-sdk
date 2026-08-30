# Org.OpenAPITools.Api.ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**AdvertiserDefinedEventsCreate**](ConversionsApi.md#advertiserdefinedeventscreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events |
| [**AdvertiserDefinedEventsDelete**](ConversionsApi.md#advertiserdefinedeventsdelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events |
| [**AdvertiserDefinedEventsGet**](ConversionsApi.md#advertiserdefinedeventsget) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events |
| [**AdvertiserDefinedEventsUpdate**](ConversionsApi.md#advertiserdefinedeventsupdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events |

<a id="advertiserdefinedeventscreate"></a>
# **AdvertiserDefinedEventsCreate**
> AdvertiserDefinedEventsCreate200Response AdvertiserDefinedEventsCreate (string adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest)

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md) |  |  |

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="advertiserdefinedeventsdelete"></a>
# **AdvertiserDefinedEventsDelete**
> AdvertiserDefinedEventsCreate200Response AdvertiserDefinedEventsDelete (string adAccountId, List<string> eventNames)

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **eventNames** | [**List&lt;string&gt;**](string.md) | List of event names to delete |  |

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="advertiserdefinedeventsget"></a>
# **AdvertiserDefinedEventsGet**
> AdvertiserDefinedEventsGet200Response AdvertiserDefinedEventsGet (string adAccountId)

Get advertiser defined events

Get advertiser defined events for the given ad account.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |

### Return type

[**AdvertiserDefinedEventsGet200Response**](AdvertiserDefinedEventsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="advertiserdefinedeventsupdate"></a>
# **AdvertiserDefinedEventsUpdate**
> AdvertiserDefinedEventsCreate200Response AdvertiserDefinedEventsUpdate (string adAccountId, AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest)

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md) |  |  |

### Return type

[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

