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
> `labels_apply`(_api::`LabelsApi`, `ad_account_id`::`String`, `label_id`::`String`, `labeled_entities_create`::`LabeledEntitiesCreate`; _mediaType=nothing) -> `LabeledEntities`, `OpenAPI.Clients.ApiResponse` <br/>
> `labels_apply`(_api::`LabelsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `label_id`::`String`, `labeled_entities_create`::`LabeledEntitiesCreate`; _mediaType=nothing) -> `Channel`{ `LabeledEntities` }, `OpenAPI.Clients.ApiResponse`

Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LabelsApi`** | API context | 
**`ad_account_id`** | **`String`** |  |
**`label_id`** | **`String`** | Label ID. |
**`labeled_entities_create`** | [**`LabeledEntitiesCreate`**](LabeledEntitiesCreate.md) |  |

### Return type

[**`LabeledEntities`**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **labels_create**
> `labels_create`(_api::`LabelsApi`, `ad_account_id`::`String`, `label_create_request`::`LabelCreateRequest`; _mediaType=nothing) -> `LabelsResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `labels_create`(_api::`LabelsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `label_create_request`::`LabelCreateRequest`; _mediaType=nothing) -> `Channel`{ `LabelsResponse` }, `OpenAPI.Clients.ApiResponse`

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LabelsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`label_create_request`** | [**`LabelCreateRequest`**](LabelCreateRequest.md) |  |

### Return type

[**`LabelsResponse`**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **labels_list**
> `labels_list`(_api::`LabelsApi`, `ad_account_id`::`String`; `campaign_ids`=nothing, `label_ids`=nothing, `entity_statuses`=nothing, `label_types`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `LabelsList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `labels_list`(_api::`LabelsApi`, response_stream::`Channel`, `ad_account_id`::`String`; `campaign_ids`=nothing, `label_ids`=nothing, `entity_statuses`=nothing, `label_types`=nothing, `bookmark`=nothing, `page_size`=nothing, _mediaType=nothing) -> `Channel`{ `LabelsList200Response` }, `OpenAPI.Clients.ApiResponse`

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LabelsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`campaign_ids`** | [**`Vector{String}`**](String.md) | List of Campaign Ids to use to filter the results. | [default to nothing]
 **`label_ids`** | [**`Vector{String}`**](String.md) | List of Label Ids to use to filter the results. | [default to nothing]
 **`entity_statuses`** | [**`Vector{QueryLabelEntityStatusesItems}`**](QueryLabelEntityStatusesItems.md) | Label entity status | [default to nothing]
 **`label_types`** | [**`Vector{QueryLabelTypesItems}`**](QueryLabelTypesItems.md) | Label type. | [default to nothing]
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`LabelsList200Response`**](LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **labels_remove**
> `labels_remove`(_api::`LabelsApi`, `ad_account_id`::`String`, `label_id`::`String`, `labeled_entities_create`::`LabeledEntitiesCreate`; _mediaType=nothing) -> `LabeledEntities`, `OpenAPI.Clients.ApiResponse` <br/>
> `labels_remove`(_api::`LabelsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `label_id`::`String`, `labeled_entities_create`::`LabeledEntitiesCreate`; _mediaType=nothing) -> `Channel`{ `LabeledEntities` }, `OpenAPI.Clients.ApiResponse`

Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LabelsApi`** | API context | 
**`ad_account_id`** | **`String`** |  |
**`label_id`** | **`String`** | Label ID. |
**`labeled_entities_create`** | [**`LabeledEntitiesCreate`**](LabeledEntitiesCreate.md) |  |

### Return type

[**`LabeledEntities`**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **labels_update**
> `labels_update`(_api::`LabelsApi`, `ad_account_id`::`String`, `label_update_request`::`LabelUpdateRequest`; _mediaType=nothing) -> `LabelsResponse`, `OpenAPI.Clients.ApiResponse` <br/>
> `labels_update`(_api::`LabelsApi`, response_stream::`Channel`, `ad_account_id`::`String`, `label_update_request`::`LabelUpdateRequest`; _mediaType=nothing) -> `Channel`{ `LabelsResponse` }, `OpenAPI.Clients.ApiResponse`

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`LabelsApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`label_update_request`** | [**`LabelUpdateRequest`**](LabelUpdateRequest.md) |  |

### Return type

[**`LabelsResponse`**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

