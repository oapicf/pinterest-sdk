# TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**termsOfServiceGet**](TermsOfServiceApi.md#termsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service |



## termsOfServiceGet

> TermsOfService termsOfServiceGet(adAccountId, includeHtml, tosType)

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | **String**| Unique identifier of an ad account. | |
| **includeHtml** | **Boolean**| Return HTML in TOS text. | [optional] [default to false] |
| **tosType** | **String**| Request type. | [optional] |

### Return type

[**TermsOfService**](TermsOfService.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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
| **200** | An unexpected error response. |  -  |

