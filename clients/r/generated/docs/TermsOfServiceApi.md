# TermsOfServiceApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TermsOfServiceGet**](TermsOfServiceApi.md#TermsOfServiceGet) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service


# **TermsOfServiceGet**
> TermsOfService TermsOfServiceGet(ad_account_id, include_html = FALSE, tos_type = var.tos_type)

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example
```R
library(openapi)

# Get terms of service
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_include_html <- FALSE # character | Return HTML in TOS text. (Optional)
var_tos_type <- "tos_type_example" # character | Request type. (Optional)

api_instance <- TermsOfServiceApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$TermsOfServiceGet(var_ad_account_id, include_html = var_include_html, tos_type = var_tos_typedata_file = "result.txt")
result <- api_instance$TermsOfServiceGet(var_ad_account_id, include_html = var_include_html, tos_type = var_tos_type)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **include_html** | **character**| Return HTML in TOS text. | [optional] [default to FALSE]
 **tos_type** | **character**| Request type. | [optional] 

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

