# \LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labels_slash_apply**](LabelsApi.md#labels_slash_apply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**labels_slash_create**](LabelsApi.md#labels_slash_create) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labels_slash_list**](LabelsApi.md#labels_slash_list) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labels_slash_remove**](LabelsApi.md#labels_slash_remove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**labels_slash_update**](LabelsApi.md#labels_slash_update) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels



## labels_slash_apply

> models::LabeledEntities labels_slash_apply(ad_account_id, label_id, labeled_entities_create)
Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** |  | [required] |
**label_id** | **String** | Label ID. | [required] |
**labeled_entities_create** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md) |  | [required] |

### Return type

[**models::LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## labels_slash_create

> models::LabelsResponse labels_slash_create(ad_account_id, label_create_request)
Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**label_create_request** | [**LabelCreateRequest**](LabelCreateRequest.md) |  | [required] |

### Return type

[**models::LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## labels_slash_list

> models::LabelsList200Response labels_slash_list(ad_account_id, campaign_ids, label_ids, entity_statuses, label_types, bookmark, page_size)
List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**campaign_ids** | Option<[**Vec<String>**](String.md)> | List of Campaign Ids to use to filter the results. |  |
**label_ids** | Option<[**Vec<String>**](String.md)> | List of Label Ids to use to filter the results. |  |
**entity_statuses** | Option<[**Vec<models::QueryLabelEntityStatusesItems>**](Models__QueryLabelEntityStatusesItems.md)> | Label entity status |  |[default to ["ACTIVE"]]
**label_types** | Option<[**Vec<models::QueryLabelTypesItems>**](Models__QueryLabelTypesItems.md)> | Label type. |  |[default to ["BRAND","CUSTOM"]]
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. |  |[default to 25]

### Return type

[**models::LabelsList200Response**](labels_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## labels_slash_remove

> models::LabeledEntities labels_slash_remove(ad_account_id, label_id, labeled_entities_create)
Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** |  | [required] |
**label_id** | **String** | Label ID. | [required] |
**labeled_entities_create** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md) |  | [required] |

### Return type

[**models::LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## labels_slash_update

> models::LabelsResponse labels_slash_update(ad_account_id, label_update_request)
Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**label_update_request** | [**LabelUpdateRequest**](LabelUpdateRequest.md) |  | [required] |

### Return type

[**models::LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

