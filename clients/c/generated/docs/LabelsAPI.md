# LabelsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LabelsAPI_labelsCreate**](LabelsAPI.md#LabelsAPI_labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**LabelsAPI_labelsList**](LabelsAPI.md#LabelsAPI_labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**LabelsAPI_labelsUpdate**](LabelsAPI.md#LabelsAPI_labelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


# **LabelsAPI_labelsCreate**
```c
// Create labels
//
// <p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>
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
// <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>
//
labels_list_200_response_t* LabelsAPI_labelsList(apiClient_t *apiClient, char *ad_account_id, list_t *campaign_ids, list_t *label_ids, list_t *entity_statuses, list_t *label_types, int *page_size, char *bookmark);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**campaign_ids** | **[list_t](char.md) \*** | List of Campaign Ids to use to filter the results. | [optional] 
**label_ids** | **[list_t](char.md) \*** | List of Label Ids to use to filter the results. | [optional] 
**entity_statuses** | **[list_t](char.md) \*** | Label entity status | [optional] 
**label_types** | **[list_t](char.md) \*** | Label type. | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 

### Return type

[labels_list_200_response_t](labels_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **LabelsAPI_labelsUpdate**
```c
// Update labels
//
// <p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>
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

