# MsotEventsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**msotEventsCreate**](MsotEventsApi.md#msotEventsCreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events |


## Creating MsotEventsApi

To initiate an instance of `MsotEventsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.MsotEventsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(MsotEventsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    MsotEventsApi msotEventsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="msotEventsCreate"></a>
# **msotEventsCreate**
```java
Mono<Void> MsotEventsApi.msotEventsCreate(adAccountIdconversionMSOTEventsCreate)
```

Send Measurement Source Of Truth (MSOT) attributed conversion events

**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their &#x60;ad_account_id&#x60;. The request body should be a JSON object.  - These events will not be used in Reporting.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **conversionMSOTEventsCreate** | [**ConversionMSOTEventsCreate**](ConversionMSOTEventsCreate.md)|  | |




### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `msot:write`

### HTTP request headers
 - **Content-Type**: `application/json`
 - **Accept**: `application/json`

