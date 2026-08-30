# LABELS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**labels_apply**](LABELS_API.md#labels_apply) | **Post** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**labels_create**](LABELS_API.md#labels_create) | **Post** /ad_accounts/{ad_account_id}/labels | Create labels
[**labels_list**](LABELS_API.md#labels_list) | **Get** /ad_accounts/{ad_account_id}/labels | List labels
[**labels_remove**](LABELS_API.md#labels_remove) | **Post** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**labels_update**](LABELS_API.md#labels_update) | **Patch** /ad_accounts/{ad_account_id}/labels | Update labels


# **labels_apply**
> labels_apply (ad_account_id: STRING_32 ; label_id: STRING_32 ; labeled_entities_create: LABELED_ENTITIES_CREATE ): detachable LABELED_ENTITIES


Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**|  | [default to null]
 **label_id** | **STRING_32**| Label ID. | [default to null]
 **labeled_entities_create** | [**LABELED_ENTITIES_CREATE**](LABELED_ENTITIES_CREATE.md)|  | 

### Return type

[**LABELED_ENTITIES**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_create**
> labels_create (ad_account_id: STRING_32 ; label_create_request: LABEL_CREATE_REQUEST ): detachable LABELS_RESPONSE


Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **label_create_request** | [**LABEL_CREATE_REQUEST**](LABEL_CREATE_REQUEST.md)|  | 

### Return type

[**LABELS_RESPONSE**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_list**
> labels_list (ad_account_id: STRING_32 ; campaign_ids:  detachable LIST [STRING_32] ; label_ids:  detachable LIST [STRING_32] ; entity_statuses:  detachable LIST [QUERY_LABEL_ENTITY_STATUSES_ITEMS] ; label_types:  detachable LIST [QUERY_LABEL_TYPES_ITEMS] ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ): detachable LABELS_LIST_200_RESPONSE


List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **label_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Label Ids to use to filter the results. | [optional] [default to null]
 **entity_statuses** | [**LIST [QUERY_LABEL_ENTITY_STATUSES_ITEMS]**](QUERY_LABEL_ENTITY_STATUSES_ITEMS.md)| Label entity status | [optional] [default to [&quot;ACTIVE&quot;]]
 **label_types** | [**LIST [QUERY_LABEL_TYPES_ITEMS]**](QUERY_LABEL_TYPES_ITEMS.md)| Label type. | [optional] [default to [&quot;BRAND&quot;,&quot;CUSTOM&quot;]]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**LABELS_LIST_200_RESPONSE**](labels_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_remove**
> labels_remove (ad_account_id: STRING_32 ; label_id: STRING_32 ; labeled_entities_create: LABELED_ENTITIES_CREATE ): detachable LABELED_ENTITIES


Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**|  | [default to null]
 **label_id** | **STRING_32**| Label ID. | [default to null]
 **labeled_entities_create** | [**LABELED_ENTITIES_CREATE**](LABELED_ENTITIES_CREATE.md)|  | 

### Return type

[**LABELED_ENTITIES**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_update**
> labels_update (ad_account_id: STRING_32 ; label_update_request: LABEL_UPDATE_REQUEST ): detachable LABELS_RESPONSE


Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **label_update_request** | [**LABEL_UPDATE_REQUEST**](LABEL_UPDATE_REQUEST.md)|  | 

### Return type

[**LABELS_RESPONSE**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

