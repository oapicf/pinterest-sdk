# ConversionsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**advertiserDefinedEventsCreate**](ConversionsApi.md#advertiserDefinedEventsCreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events |
| [**advertiserDefinedEventsDelete**](ConversionsApi.md#advertiserDefinedEventsDelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events |
| [**advertiserDefinedEventsGet**](ConversionsApi.md#advertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events |
| [**advertiserDefinedEventsUpdate**](ConversionsApi.md#advertiserDefinedEventsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events |


## Creating ConversionsApi

To initiate an instance of `ConversionsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.ConversionsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(ConversionsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    ConversionsApi conversionsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="advertiserDefinedEventsCreate"></a>
# **advertiserDefinedEventsCreate**
```java
Mono<AdvertiserDefinedEventsCreate200Response> ConversionsApi.advertiserDefinedEventsCreate(adAccountIdadvertiserDefinedEventsCreateRequest)
```

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  | |


### Return type
[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

<a id="advertiserDefinedEventsDelete"></a>
# **advertiserDefinedEventsDelete**
```java
Mono<AdvertiserDefinedEventsCreate200Response> ConversionsApi.advertiserDefinedEventsDelete(adAccountIdeventNames)
```

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **eventNames** | [**List&lt;String&gt;**](String.md)| List of event names to delete | |


### Return type
[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="advertiserDefinedEventsGet"></a>
# **advertiserDefinedEventsGet**
```java
Mono<AdvertiserDefinedEventsGet200Response> ConversionsApi.advertiserDefinedEventsGet(adAccountId)
```

Get advertiser defined events

Get advertiser defined events for the given ad account.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |


### Return type
[**AdvertiserDefinedEventsGet200Response**](AdvertiserDefinedEventsGet200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="advertiserDefinedEventsUpdate"></a>
# **advertiserDefinedEventsUpdate**
```java
Mono<AdvertiserDefinedEventsCreate200Response> ConversionsApi.advertiserDefinedEventsUpdate(adAccountIdadvertiserDefinedEventsCreateRequest)
```

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **advertiserDefinedEventsCreateRequest** | [**AdvertiserDefinedEventsCreateRequest**](AdvertiserDefinedEventsCreateRequest.md)|  | |


### Return type
[**AdvertiserDefinedEventsCreate200Response**](AdvertiserDefinedEventsCreate200Response.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:write`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

