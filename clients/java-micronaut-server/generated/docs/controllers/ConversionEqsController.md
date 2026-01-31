# ConversionEqsController

All URIs are relative to `"/v5"`

The controller class is defined in **[ConversionEqsController.java](../../src/main/java/org/openapitools/controller/ConversionEqsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionEqsList**](#conversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)

<a id="conversionEqsList"></a>
# **conversionEqsList**
```java
Mono<List<EventQualityScore>> ConversionEqsController.conversionEqsList(lookbackPeriodadAccountIdsourcePlatformingestionSource)
```

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**lookbackPeriod** | [**LookbackPeriodOptions**](../../docs/models/.md) | Lookback window (number of days). | [enum: `1d`, `14d`]
**adAccountId** | `String` | Unique identifier of an ad account. |
**sourcePlatform** | [**SourcePlatformOptions**](../../docs/models/.md) | Source platform of event. | [optional parameter] [enum: `WEB`, `MOBILE`, `MOBILE_ANDROID`, `MOBILE_IOS`, `OFFLINE`, `PINTEREST_WEB`, `PINTEREST_ANDROID`, `PINTEREST_IOS`, `POINT_OF_SALE`]
**ingestionSource** | [**IngestionSourceOptions**](../../docs/models/.md) | Ingestion source of event. | [optional parameter] [enum: `TAG`, `MMP`, `FILE_UPLOAD`, `CONVERSIONS_API`, `NATIVE`]

### Return type
[**List&lt;EventQualityScore&gt;**](../../docs/models/EventQualityScore.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`
* **client_credentials**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

