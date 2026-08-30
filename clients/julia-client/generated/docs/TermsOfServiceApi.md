# TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**terms_of_service_get**](TermsOfServiceApi.md#terms_of_service_get) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service


# **terms_of_service_get**
> `terms_of_service_get`(_api::`TermsOfServiceApi`, `ad_account_id`::`String`; `include_html`=nothing, `tos_type`=nothing, _mediaType=nothing) -> `TermsOfService`, `OpenAPI.Clients.ApiResponse` <br/>
> `terms_of_service_get`(_api::`TermsOfServiceApi`, response_stream::`Channel`, `ad_account_id`::`String`; `include_html`=nothing, `tos_type`=nothing, _mediaType=nothing) -> `Channel`{ `TermsOfService` }, `OpenAPI.Clients.ApiResponse`

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`TermsOfServiceApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`include_html`** | **`Bool`** | Return HTML in TOS text. | [default to false]
 **`tos_type`** | **`String`** | Request type. | [default to nothing]

### Return type

[**`TermsOfService`**](TermsOfService.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

