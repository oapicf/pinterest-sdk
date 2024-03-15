# TermsOfServiceController

All URIs are relative to `"/v5"`

The controller class is defined in **[TermsOfServiceController.java](../../src/main/java/org/openapitools/controller/TermsOfServiceController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsOfServiceGet**](#termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service

<a id="termsOfServiceGet"></a>
# **termsOfServiceGet**
```java
Mono<TermsOfService> TermsOfServiceController.termsOfServiceGet(adAccountIdincludeHtmltosType)
```

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**adAccountId** | `String` | Unique identifier of an ad account. |
**includeHtml** | `Boolean` | Return HTML in TOS text. | [optional parameter] [default to `false`]
**tosType** | `String` | Request type. | [optional parameter]

### Return type
[**TermsOfService**](../../docs/models/TermsOfService.md)

### Authorization
* **pinterest_oauth2**, scopes: `ads:read`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

