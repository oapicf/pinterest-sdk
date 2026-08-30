# LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labels_apply**](LabelsApi.md#labels_apply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**labels_create**](LabelsApi.md#labels_create) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labels_list**](LabelsApi.md#labels_list) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labels_remove**](LabelsApi.md#labels_remove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**labels_update**](LabelsApi.md#labels_update) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


# **labels_apply**
> `labels_apply`(req::`HTTP.Request`, `ad_account_id`::`String`, `label_id`::`String`, `labeled_entities_create`::`LabeledEntitiesCreate`;) -> `LabeledEntities`

Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**|  |
**`label_id`** | **`String`**| Label ID. |
**`labeled_entities_create`** | [**`LabeledEntitiesCreate`**](LabeledEntitiesCreate.md)|  |

### Return type

[**`LabeledEntities`**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_create**
> `labels_create`(req::`HTTP.Request`, `ad_account_id`::`String`, `label_create_request`::`LabelCreateRequest`;) -> `LabelsResponse`

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`label_create_request`** | [**`LabelCreateRequest`**](LabelCreateRequest.md)|  |

### Return type

[**`LabelsResponse`**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_list**
> `labels_list`(req::`HTTP.Request`, `ad_account_id`::`String`; `campaign_ids`=nothing, `label_ids`=nothing, `entity_statuses`=nothing, `label_types`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `LabelsList200Response`

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`campaign_ids`** | [**`Vector{String}`**](String.md)| List of Campaign Ids to use to filter the results. | [default to nothing]
 **`label_ids`** | [**`Vector{String}`**](String.md)| List of Label Ids to use to filter the results. | [default to nothing]
 **`entity_statuses`** | [**`Vector{QueryLabelEntityStatusesItems}`**](QueryLabelEntityStatusesItems.md)| Label entity status | [default to nothing]
 **`label_types`** | [**`Vector{QueryLabelTypesItems}`**](QueryLabelTypesItems.md)| Label type. | [default to nothing]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`LabelsList200Response`**](LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_remove**
> `labels_remove`(req::`HTTP.Request`, `ad_account_id`::`String`, `label_id`::`String`, `labeled_entities_create`::`LabeledEntitiesCreate`;) -> `LabeledEntities`

Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**|  |
**`label_id`** | **`String`**| Label ID. |
**`labeled_entities_create`** | [**`LabeledEntitiesCreate`**](LabeledEntitiesCreate.md)|  |

### Return type

[**`LabeledEntities`**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_update**
> `labels_update`(req::`HTTP.Request`, `ad_account_id`::`String`, `label_update_request`::`LabelUpdateRequest`;) -> `LabelsResponse`

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`label_update_request`** | [**`LabelUpdateRequest`**](LabelUpdateRequest.md)|  |

### Return type

[**`LabelsResponse`**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

