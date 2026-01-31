# LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LabelsCreate**](LabelsApi.md#LabelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**LabelsList**](LabelsApi.md#LabelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**LabelsUpdate**](LabelsApi.md#LabelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


# **LabelsCreate**
> LabelsResponse LabelsCreate(ad_account_id, label_create_request)

Create labels

<p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>

### Example
```R
library(openapi)

# Create labels
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_label_create_request <- LabelCreateRequest$new(c(LabelCreateRequest_labels_inner$new(LabelType$new(), "value_example")), "parent_id_example") # LabelCreateRequest | 

api_instance <- LabelsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LabelsCreate(var_ad_account_id, var_label_create_requestdata_file = "result.txt")
result <- api_instance$LabelsCreate(var_ad_account_id, var_label_create_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **label_create_request** | [**LabelCreateRequest**](LabelCreateRequest.md)|  | 

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **LabelsList**
> LabelsList200Response LabelsList(ad_account_id, campaign_ids = var.campaign_ids, label_ids = var.label_ids, entity_statuses = ["ACTIVE"], label_types = ["BRAND","CUSTOM"], page_size = 25, bookmark = var.bookmark)

List labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>

### Example
```R
library(openapi)

# List labels
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_campaign_ids <- c("inner_example") # array[character] | List of Campaign Ids to use to filter the results. (Optional)
var_label_ids <- c("inner_example") # array[character] | List of Label Ids to use to filter the results. (Optional)
var_entity_statuses <- c("ACTIVE") # array[character] | Label entity status (Optional)
var_label_types <- c("BRAND") # array[character] | Label type. (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)

api_instance <- LabelsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LabelsList(var_ad_account_id, campaign_ids = var_campaign_ids, label_ids = var_label_ids, entity_statuses = var_entity_statuses, label_types = var_label_types, page_size = var_page_size, bookmark = var_bookmarkdata_file = "result.txt")
result <- api_instance$LabelsList(var_ad_account_id, campaign_ids = var_campaign_ids, label_ids = var_label_ids, entity_statuses = var_entity_statuses, label_types = var_label_types, page_size = var_page_size, bookmark = var_bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **campaign_ids** | list( **character** )| List of Campaign Ids to use to filter the results. | [optional] 
 **label_ids** | list( **character** )| List of Label Ids to use to filter the results. | [optional] 
 **entity_statuses** | Enum [ACTIVE, ARCHIVED] | Label entity status | [optional] [default to [&quot;ACTIVE&quot;]]
 **label_types** | Enum [BRAND, CUSTOM] | Label type. | [optional] [default to [&quot;BRAND&quot;,&quot;CUSTOM&quot;]]
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**LabelsList200Response**](labels_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid ad account ads parameters. |  -  |
| **0** | Unexpected error |  -  |

# **LabelsUpdate**
> LabelsResponse LabelsUpdate(ad_account_id, label_update_request)

Update labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>

### Example
```R
library(openapi)

# Update labels
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_label_update_request <- LabelUpdateRequest$new(c(LabelUpdateRequest_labels_inner$new("id_example", LabelStatus$new(), "value_example"))) # LabelUpdateRequest | 

api_instance <- LabelsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LabelsUpdate(var_ad_account_id, var_label_update_requestdata_file = "result.txt")
result <- api_instance$LabelsUpdate(var_ad_account_id, var_label_update_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **label_update_request** | [**LabelUpdateRequest**](LabelUpdateRequest.md)|  | 

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

