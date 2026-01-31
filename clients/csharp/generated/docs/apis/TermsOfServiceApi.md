# Org.OpenAPITools.Api.TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**TermsOfServiceGet**](TermsOfServiceApi.md#termsofserviceget) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service |

<a id="termsofserviceget"></a>
# **TermsOfServiceGet**
> TermsOfService TermsOfServiceGet (string adAccountId, bool includeHtml = null, string tosType = null)

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **adAccountId** | **string** | Unique identifier of an ad account. |  |
| **includeHtml** | **bool** | Return HTML in TOS text. | [optional] [default to false] |
| **tosType** | **string** | Request type. | [optional]  |

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

