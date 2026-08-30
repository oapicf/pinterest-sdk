# MsotEventsController

All URIs are relative to `"/v5"`

The controller class is defined in **[MsotEventsController.java](../../src/main/java/org/openapitools/controller/MsotEventsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**msotEventsCreate**](#msotEventsCreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events

<a id="msotEventsCreate"></a>
# **msotEventsCreate**
```java
Mono<Object> MsotEventsController.msotEventsCreate(adAccountIdconversionMSOTEventsCreate)
```

Send Measurement Source Of Truth (MSOT) attributed conversion events

**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**conversionMSOTEventsCreate** | [**ConversionMSOTEventsCreate**](../../docs/models/ConversionMSOTEventsCreate.md) |  |


### Authorization
* **pinterest_oauth2**, scopes: `msot:write`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

