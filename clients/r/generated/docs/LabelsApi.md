# LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LabelsApply**](LabelsApi.md#LabelsApply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**LabelsCreate**](LabelsApi.md#LabelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**LabelsList**](LabelsApi.md#LabelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**LabelsRemove**](LabelsApi.md#LabelsRemove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**LabelsUpdate**](LabelsApi.md#LabelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


# **LabelsApply**
> LabeledEntities LabelsApply(ad_account_id, label_id, labeled_entities_create)

Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Example
```R
library(openapi)

# Apply label to entity
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | 
var_label_id <- "label_id_example" # character | Label ID.
var_labeled_entities_create <- LabeledEntitiesCreate$new(c("entity_ids_example")) # LabeledEntitiesCreate | 

api_instance <- LabelsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LabelsApply(var_ad_account_id, var_label_id, var_labeled_entities_createdata_file = "result.txt")
result <- api_instance$LabelsApply(var_ad_account_id, var_label_id, var_labeled_entities_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**|  | 
 **label_id** | **character**| Label ID. | 
 **labeled_entities_create** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  | 

### Return type

[**LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **LabelsCreate**
> LabelsResponse LabelsCreate(ad_account_id, label_create_request)

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

### Example
```R
library(openapi)

# Create labels
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_label_create_request <- LabelCreateRequest$new(c(LabelCreateItem$new(LabelType$new(), "value_example"))) # LabelCreateRequest | 

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **LabelsList**
> LabelsList200Response LabelsList(ad_account_id, campaign_ids = var.campaign_ids, label_ids = var.label_ids, entity_statuses = ["ACTIVE"], label_types = ["BRAND","CUSTOM"], bookmark = var.bookmark, page_size = 25)

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Example
```R
library(openapi)

# List labels
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_campaign_ids <- c("inner_example") # array[character] | List of Campaign Ids to use to filter the results. (Optional)
var_label_ids <- c("inner_example") # array[character] | List of Label Ids to use to filter the results. (Optional)
var_entity_statuses <- c(QueryLabelEntityStatusesItems$new()) # array[QueryLabelEntityStatusesItems] | Label entity status (Optional)
var_label_types <- c(QueryLabelTypesItems$new()) # array[QueryLabelTypesItems] | Label type. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- LabelsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LabelsList(var_ad_account_id, campaign_ids = var_campaign_ids, label_ids = var_label_ids, entity_statuses = var_entity_statuses, label_types = var_label_types, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$LabelsList(var_ad_account_id, campaign_ids = var_campaign_ids, label_ids = var_label_ids, entity_statuses = var_entity_statuses, label_types = var_label_types, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**| Unique identifier of an ad account. | 
 **campaign_ids** | list( **character** )| List of Campaign Ids to use to filter the results. | [optional] 
 **label_ids** | list( **character** )| List of Label Ids to use to filter the results. | [optional] 
 **entity_statuses** | list( [**QueryLabelEntityStatusesItems**](QueryLabelEntityStatusesItems.md) )| Label entity status | [optional] [default to [&quot;ACTIVE&quot;]]
 **label_types** | list( [**QueryLabelTypesItems**](QueryLabelTypesItems.md) )| Label type. | [optional] [default to [&quot;BRAND&quot;,&quot;CUSTOM&quot;]]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **LabelsRemove**
> LabeledEntities LabelsRemove(ad_account_id, label_id, labeled_entities_create)

Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Example
```R
library(openapi)

# Remove label from entities
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | 
var_label_id <- "label_id_example" # character | Label ID.
var_labeled_entities_create <- LabeledEntitiesCreate$new(c("entity_ids_example")) # LabeledEntitiesCreate | 

api_instance <- LabelsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LabelsRemove(var_ad_account_id, var_label_id, var_labeled_entities_createdata_file = "result.txt")
result <- api_instance$LabelsRemove(var_ad_account_id, var_label_id, var_labeled_entities_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **character**|  | 
 **label_id** | **character**| Label ID. | 
 **labeled_entities_create** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  | 

### Return type

[**LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **LabelsUpdate**
> LabelsResponse LabelsUpdate(ad_account_id, label_update_request)

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

### Example
```R
library(openapi)

# Update labels
#
# prepare function argument(s)
var_ad_account_id <- "ad_account_id_example" # character | Unique identifier of an ad account.
var_label_update_request <- LabelUpdateRequest$new(c(LabelUpdateItem$new("id_example", LabelStatus$new(), "value_example"))) # LabelUpdateRequest | 

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

