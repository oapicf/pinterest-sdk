# ConversionsController

All URIs are relative to `"/v5"`

The controller class is defined in **[ConversionsController.java](../../src/main/java/org/openapitools/controller/ConversionsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserDefinedEventsCreate**](#advertiserDefinedEventsCreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**advertiserDefinedEventsDelete**](#advertiserDefinedEventsDelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**advertiserDefinedEventsGet**](#advertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**advertiserDefinedEventsUpdate**](#advertiserDefinedEventsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events

<a id="advertiserDefinedEventsCreate"></a>
# **advertiserDefinedEventsCreate**
```java
Mono<AdvertiserDefinedEventsCreate200Response> ConversionsController.advertiserDefinedEventsCreate(adAccountIdadvertiserDefinedEventsCreateRequest)
```

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](../../docs/models/AdvertiserDefinedEventsCreateRequest.md) |  |

### Return type
[**AdvertiserDefinedEventsCreate200Response**](../../docs/models/AdvertiserDefinedEventsCreate200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`
* **client_credentials**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="advertiserDefinedEventsDelete"></a>
# **advertiserDefinedEventsDelete**
```java
Mono<AdvertiserDefinedEventsCreate200Response> ConversionsController.advertiserDefinedEventsDelete(adAccountIdeventNames)
```

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**eventNames** | [**List&lt;String&gt;**](../../docs/models/String.md) | List of event names to delete |

### Return type
[**AdvertiserDefinedEventsCreate200Response**](../../docs/models/AdvertiserDefinedEventsCreate200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`
* **client_credentials**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="advertiserDefinedEventsGet"></a>
# **advertiserDefinedEventsGet**
```java
Mono<AdvertiserDefinedEventsGet200Response> ConversionsController.advertiserDefinedEventsGet(adAccountId)
```

Get advertiser defined events

Get advertiser defined events for the given ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |

### Return type
[**AdvertiserDefinedEventsGet200Response**](../../docs/models/AdvertiserDefinedEventsGet200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="advertiserDefinedEventsUpdate"></a>
# **advertiserDefinedEventsUpdate**
```java
Mono<AdvertiserDefinedEventsCreate200Response> ConversionsController.advertiserDefinedEventsUpdate(adAccountIdadvertiserDefinedEventsCreateRequest)
```

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](../../docs/models/AdvertiserDefinedEventsCreateRequest.md) |  |

### Return type
[**AdvertiserDefinedEventsCreate200Response**](../../docs/models/AdvertiserDefinedEventsCreate200Response.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:write`
* **client_credentials**, scopes: `ads:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

