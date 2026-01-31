# ConversionEqsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**conversionEqsList**](ConversionEqsApi.md#conversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS) |


## Creating ConversionEqsApi

To initiate an instance of `ConversionEqsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.ConversionEqsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(ConversionEqsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    ConversionEqsApi conversionEqsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="conversionEqsList"></a>
# **conversionEqsList**
```java
Mono<List<EventQualityScore>> ConversionEqsApi.conversionEqsList(lookbackPeriodadAccountIdsourcePlatformingestionSource)
```

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lookbackPeriod** | [**LookbackPeriodOptions**](.md)| Lookback window (number of days). | [enum: `1d`, `14d`] |
| **adAccountId** | `String`| Unique identifier of an ad account. | |
| **sourcePlatform** | [**SourcePlatformOptions**](.md)| Source platform of event. | [optional parameter] [enum: `WEB`, `MOBILE`, `MOBILE_ANDROID`, `MOBILE_IOS`, `OFFLINE`, `PINTEREST_WEB`, `PINTEREST_ANDROID`, `PINTEREST_IOS`, `POINT_OF_SALE`] |
| **ingestionSource** | [**IngestionSourceOptions**](.md)| Ingestion source of event. | [optional parameter] [enum: `TAG`, `MMP`, `FILE_UPLOAD`, `CONVERSIONS_API`, `NATIVE`] |


### Return type
[**List&lt;EventQualityScore&gt;**](EventQualityScore.md)

### Authorization
* **[pinterest_oauth2](auth.md#pinterest_oauth2)**, scopes: `ads:read`
* **[client_credentials](auth.md#client_credentials)**, scopes: `ads:read`

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

