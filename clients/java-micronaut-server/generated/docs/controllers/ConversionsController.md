# ConversionsController

All URIs are relative to `"/v5"`

The controller class is defined in **[ConversionsController.java](../../src/main/java/org/openapitools/controller/ConversionsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserDefinedEventsGet**](#advertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events

<a id="advertiserDefinedEventsGet"></a>
# **advertiserDefinedEventsGet**
```java
Mono<AdvertiserDefinedEventsResponse> ConversionsController.advertiserDefinedEventsGet(adAccountId)
```

Get advertiser defined events

&lt;p&gt;Get advertiser defined events for the given ad account.&lt;/p&gt;

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |

### Return type
[**AdvertiserDefinedEventsResponse**](../../docs/models/AdvertiserDefinedEventsResponse.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

