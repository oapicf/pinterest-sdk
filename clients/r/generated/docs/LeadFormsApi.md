# LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeadFormGet**](LeadFormsApi.md#LeadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**LeadFormTestCreate**](LeadFormsApi.md#LeadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**LeadFormsList**](LeadFormsApi.md#LeadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms


# **LeadFormGet**
> LeadFormResponse LeadFormGet(ad_account_id, lead_form_id)

Get lead form by id

Gets a lead form given it's ID. It must also be associated with the provided ad account ID. Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```R
library(openapi)

# Get lead form by id
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_lead_form_id <- "1234567890123" # character | Unique identifier of a lead form.

api_instance <- LeadFormsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LeadFormGet(var_ad_account_id, var_lead_form_iddata_file = "result.txt")
result <- api_instance$LeadFormGet(var_ad_account_id, var_lead_form_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **lead_form_id** | **character**| Unique identifier of a lead form. | 

### Return type

[**LeadFormResponse**](LeadFormResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account lead forms parameters. |  -  |
| **404** | The lead form ID for the given ad account ID does not exist. |  -  |
| **0** | Unexpected error |  -  |

# **LeadFormTestCreate**
> LeadFormTestResponse LeadFormTestCreate(ad_account_id, lead_form_id, lead_form_test_request)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```R
library(openapi)

# Create lead form test data
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_lead_form_id <- "1234567890123" # character | Unique identifier of a lead form.
var_lead_form_test_request <- LeadFormTestRequest$new(c("answers_example")) # LeadFormTestRequest | Subscription to create.

api_instance <- LeadFormsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LeadFormTestCreate(var_ad_account_id, var_lead_form_id, var_lead_form_test_requestdata_file = "result.txt")
result <- api_instance$LeadFormTestCreate(var_ad_account_id, var_lead_form_id, var_lead_form_test_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **lead_form_id** | **character**| Unique identifier of a lead form. | 
 **lead_form_test_request** | [**LeadFormTestRequest**](LeadFormTestRequest.md)| Subscription to create. | 

### Return type

[**LeadFormTestResponse**](LeadFormTestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **404** | Lead not found. |  -  |
| **0** | Unexpected error |  -  |

# **LeadFormsList**
> LeadFormsList200Response LeadFormsList(ad_account_id, page_size = 25, order = var.order, bookmark = var.bookmark)

Get lead forms

Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```R
library(openapi)

# Get lead forms
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (Optional)
var_order <- "ASCENDING" # character | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)

api_instance <- LeadFormsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LeadFormsList(var_ad_account_id, page_size = var_page_size, order = var_order, bookmark = var_bookmarkdata_file = "result.txt")
result <- api_instance$LeadFormsList(var_ad_account_id, page_size = var_page_size, order = var_order, bookmark = var_bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | Enum [ASCENDING, DESCENDING] | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**LeadFormsList200Response**](lead_forms_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account lead forms parameters. |  -  |
| **0** | Unexpected error |  -  |

