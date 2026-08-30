# LeadFormsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LeadFormGet**](LeadFormsApi.md#LeadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**LeadFormTestCreate**](LeadFormsApi.md#LeadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**LeadFormsCreate**](LeadFormsApi.md#LeadFormsCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
[**LeadFormsList**](LeadFormsApi.md#LeadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
[**LeadFormsUpdate**](LeadFormsApi.md#LeadFormsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms


# **LeadFormGet**
> LeadForm LeadFormGet(lead_form_id, ad_account_id)

Get lead form by id

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```R
library(openapi)

# Get lead form by id
#
# prepare function argument(s)
var_lead_form_id <- "lead_form_id_example" # character | The ID of this lead form
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.

api_instance <- LeadFormsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LeadFormGet(var_lead_form_id, var_ad_account_iddata_file = "result.txt")
result <- api_instance$LeadFormGet(var_lead_form_id, var_ad_account_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lead_form_id** | **character**| The ID of this lead form | 
 **ad_account_id** | **character**| Unique identifier of an ad account. | 

### Return type

[**LeadForm**](LeadForm.md)

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
| **0** | An unexpected error response. |  -  |

# **LeadFormTestCreate**
> LeadFormTest LeadFormTestCreate(ad_account_id, lead_form_id, lead_form_test_create)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.

### Example
```R
library(openapi)

# Create lead form test data
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | 
var_lead_form_id <- "lead_form_id_example" # character | Unique identifier of a lead form.
var_lead_form_test_create <- LeadFormTestCreate$new(c("answers_example")) # LeadFormTestCreate | 

api_instance <- LeadFormsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LeadFormTestCreate(var_ad_account_id, var_lead_form_id, var_lead_form_test_createdata_file = "result.txt")
result <- api_instance$LeadFormTestCreate(var_ad_account_id, var_lead_form_id, var_lead_form_test_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**|  | 
 **lead_form_id** | **character**| Unique identifier of a lead form. | 
 **lead_form_test_create** | [**LeadFormTestCreate**](LeadFormTestCreate.md)|  | 

### Return type

[**LeadFormTest**](LeadFormTest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **0** | An unexpected error response. |  -  |

# **LeadFormsCreate**
> LeadFormsCreate200Response LeadFormsCreate(ad_account_id, lead_form_create)

Create lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```R
library(openapi)

# Create lead forms
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_lead_form_create <- c(LeadFormCreate$new("completion_message_example", "has_accepted_terms_example", "name_example", "privacy_policy_link_example", c(LeadFormQuestion$new(LeadFormQuestionFieldType$new(), "custom_question_label_example", c("custom_question_options_example"), LeadFormQuestionType$new())), "disclosure_language_example", c(LeadFormPolicyLink$new("label_example", "link_example")), LeadFormStatus$new())) # array[LeadFormCreate] | 

api_instance <- LeadFormsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LeadFormsCreate(var_ad_account_id, var_lead_form_createdata_file = "result.txt")
result <- api_instance$LeadFormsCreate(var_ad_account_id, var_lead_form_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **lead_form_create** | list( [**LeadFormCreate**](LeadFormCreate.md) )|  | 

### Return type

[**LeadFormsCreate200Response**](lead_forms_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
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
| **0** | An unexpected error response. |  -  |

# **LeadFormsList**
> LeadFormsList200Response LeadFormsList(ad_account_id, bookmark = var.bookmark, page_size = 25, order = var.order)

List lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```R
library(openapi)

# List lead forms
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)
var_order <- Pinterest.Lib.PaginationOrder$new() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (Optional)

api_instance <- LeadFormsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LeadFormsList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_orderdata_file = "result.txt")
result <- api_instance$LeadFormsList(var_ad_account_id, bookmark = var_bookmark, page_size = var_page_size, order = var_order)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **LeadFormsUpdate**
> LeadFormsCreate200Response LeadFormsUpdate(ad_account_id, lead_form_batch_update)

Update lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```R
library(openapi)

# Update lead forms
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_lead_form_batch_update <- c(LeadFormBatchUpdate$new("id_example", "completion_message_example", "disclosure_language_example", "has_accepted_terms_example", "name_example", c(LeadFormPolicyLink$new("label_example", "link_example")), "privacy_policy_link_example", c(LeadFormQuestion$new(LeadFormQuestionFieldType$new(), "custom_question_label_example", c("custom_question_options_example"), LeadFormQuestionType$new())), LeadFormStatus$new())) # array[LeadFormBatchUpdate] | 

api_instance <- LeadFormsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LeadFormsUpdate(var_ad_account_id, var_lead_form_batch_updatedata_file = "result.txt")
result <- api_instance$LeadFormsUpdate(var_ad_account_id, var_lead_form_batch_update)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **lead_form_batch_update** | list( [**LeadFormBatchUpdate**](LeadFormBatchUpdate.md) )|  | 

### Return type

[**LeadFormsCreate200Response**](lead_forms_create_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
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
| **0** | An unexpected error response. |  -  |

