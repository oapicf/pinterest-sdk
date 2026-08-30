# LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**labels/apply**](LabelsApi.md#labels/apply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity |
| [**labels/create**](LabelsApi.md#labels/create) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels |
| [**labels/list**](LabelsApi.md#labels/list) | **GET** /ad_accounts/{ad_account_id}/labels | List labels |
| [**labels/remove**](LabelsApi.md#labels/remove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities |
| [**labels/update**](LabelsApi.md#labels/update) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels |


<a name="labels/apply"></a>
# **labels/apply**
> LabeledEntities labels/apply(ad\_account\_id, label\_id, LabeledEntitiesCreate)

Apply label to entity

      [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **label\_id** | **String**| Label ID. | [default to null] |
| **LabeledEntitiesCreate** | [**LabeledEntitiesCreate**](../Models/LabeledEntitiesCreate.md)|  | |

### Return type

[**LabeledEntities**](../Models/LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="labels/create"></a>
# **labels/create**
> LabelsResponse labels/create(ad\_account\_id, LabelCreateRequest)

Create labels

    [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **LabelCreateRequest** | [**LabelCreateRequest**](../Models/LabelCreateRequest.md)|  | |

### Return type

[**LabelsResponse**](../Models/LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="labels/list"></a>
# **labels/list**
> labels_list_200_response labels/list(ad\_account\_id, campaign\_ids, label\_ids, entity\_statuses, label\_types, bookmark, page\_size)

List labels

    [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **campaign\_ids** | [**List**](../Models/String.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null] |
| **label\_ids** | [**List**](../Models/String.md)| List of Label Ids to use to filter the results. | [optional] [default to null] |
| **entity\_statuses** | [**List**](../Models/QueryLabelEntityStatusesItems.md)| Label entity status | [optional] [default to [&quot;ACTIVE&quot;]] |
| **label\_types** | [**List**](../Models/QueryLabelTypesItems.md)| Label type. | [optional] [default to [&quot;BRAND&quot;,&quot;CUSTOM&quot;]] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**labels_list_200_response**](../Models/labels_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="labels/remove"></a>
# **labels/remove**
> LabeledEntities labels/remove(ad\_account\_id, label\_id, LabeledEntitiesCreate)

Remove label from entities

      [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**|  | [default to null] |
| **label\_id** | **String**| Label ID. | [default to null] |
| **LabeledEntitiesCreate** | [**LabeledEntitiesCreate**](../Models/LabeledEntitiesCreate.md)|  | |

### Return type

[**LabeledEntities**](../Models/LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="labels/update"></a>
# **labels/update**
> LabelsResponse labels/update(ad\_account\_id, LabelUpdateRequest)

Update labels

    [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **LabelUpdateRequest** | [**LabelUpdateRequest**](../Models/LabelUpdateRequest.md)|  | |

### Return type

[**LabelsResponse**](../Models/LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

