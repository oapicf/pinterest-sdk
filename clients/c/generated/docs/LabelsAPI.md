# LabelsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LabelsAPI_labelsApply**](LabelsAPI.md#LabelsAPI_labelsApply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**LabelsAPI_labelsCreate**](LabelsAPI.md#LabelsAPI_labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**LabelsAPI_labelsList**](LabelsAPI.md#LabelsAPI_labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**LabelsAPI_labelsRemove**](LabelsAPI.md#LabelsAPI_labelsRemove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**LabelsAPI_labelsUpdate**](LabelsAPI.md#LabelsAPI_labelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


# **LabelsAPI_labelsApply**
```c
// Apply label to entity
//
//   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.
//
labeled_entities_t* LabelsAPI_labelsApply(apiClient_t *apiClient, char *ad_account_id, char *label_id, labeled_entities_create_t *labeled_entities_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** |  | 
**label_id** | **char \*** | Label ID. | 
**labeled_entities_create** | **[labeled_entities_create_t](labeled_entities_create.md) \*** |  | 

### Return type

[labeled_entities_t](labeled_entities.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LabelsAPI_labelsCreate**
```c
// Create labels
//
// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
//
labels_response_t* LabelsAPI_labelsCreate(apiClient_t *apiClient, char *ad_account_id, label_create_request_t *label_create_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**label_create_request** | **[label_create_request_t](label_create_request.md) \*** |  | 

### Return type

[labels_response_t](labels_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LabelsAPI_labelsList**
```c
// List labels
//
// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.
//
labels_list_200_response_t* LabelsAPI_labelsList(apiClient_t *apiClient, char *ad_account_id, list_t *campaign_ids, list_t *label_ids, list_t *entity_statuses, list_t *label_types, char *bookmark, int *page_size);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**campaign_ids** | **[list_t](char.md) \*** | List of Campaign Ids to use to filter the results. | [optional] 
**label_ids** | **[list_t](char.md) \*** | List of Label Ids to use to filter the results. | [optional] 
**entity_statuses** | **[list_t](query_label_entity_statuses_items.md) \*** | Label entity status | [optional] 
**label_types** | **[list_t](query_label_types_items.md) \*** | Label type. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[labels_list_200_response_t](labels_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LabelsAPI_labelsRemove**
```c
// Remove label from entities
//
//   [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.
//
labeled_entities_t* LabelsAPI_labelsRemove(apiClient_t *apiClient, char *ad_account_id, char *label_id, labeled_entities_create_t *labeled_entities_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** |  | 
**label_id** | **char \*** | Label ID. | 
**labeled_entities_create** | **[labeled_entities_create_t](labeled_entities_create.md) \*** |  | 

### Return type

[labeled_entities_t](labeled_entities.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LabelsAPI_labelsUpdate**
```c
// Update labels
//
// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.
//
labels_response_t* LabelsAPI_labelsUpdate(apiClient_t *apiClient, char *ad_account_id, label_update_request_t *label_update_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**label_update_request** | **[label_update_request_t](label_update_request.md) \*** |  | 

### Return type

[labels_response_t](labels_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

