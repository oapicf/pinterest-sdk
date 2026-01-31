# MsotEventsController

All URIs are relative to `"/v5"`

The controller class is defined in **[MsotEventsController.java](../../src/main/java/org/openapitools/controller/MsotEventsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**msotEventsCreate**](#msotEventsCreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events

<a id="msotEventsCreate"></a>
# **msotEventsCreate**
```java
Mono<Object> MsotEventsController.msotEventsCreate(adAccountIdconversionMSOTEvents)
```

Send Measurement Source Of Truth (MSOT) attributed conversion events

&lt;strong&gt;This feature is currently in beta and not available to all apps, if you&#39;re interested in joining the beta, please reach out to your Pinterest account manager.&lt;/strong&gt; &lt;br&gt; &lt;p&gt;Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &lt;code&gt;ad_account_id&lt;/code&gt;. The request body should be a JSON object.&lt;/p&gt; - These events will NOT be used in Reporting.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**conversionMSOTEvents** | [**ConversionMSOTEvents**](../../docs/models/ConversionMSOTEvents.md) | Attributed MSOT conversion events |


### Authorization
* **pinterest_oauth2**, scopes: `msot:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

