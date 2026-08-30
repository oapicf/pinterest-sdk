# labels_api

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
**labels/create**](labels_api.md#labels/create) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
**labels/list**](labels_api.md#labels/list) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
**labels/update**](labels_api.md#labels/update) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels
**labels/apply**](labels_api.md#labels/apply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
**labels/remove**](labels_api.md#labels/remove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities


# **labels/create**
> models::LabelsResponse labels/create(ctx, ad_account_id, label_create_request)
Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **label_create_request** | [**LabelCreateRequest**](LabelCreateRequest.md)|  | 

### Return type

[**models::LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels/list**
> models::LabelsList200Response labels/list(ctx, ad_account_id, optional)
List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **String**| Unique identifier of an ad account. | 
 **campaign_ids** | [**String**](String.md)| List of Campaign Ids to use to filter the results. | 
 **label_ids** | [**String**](String.md)| List of Label Ids to use to filter the results. | 
 **entity_statuses** | [**models::QueryLabelEntityStatusesItems**](models::QueryLabelEntityStatusesItems.md)| Label entity status | 
 **label_types** | [**models::QueryLabelTypesItems**](models::QueryLabelTypesItems.md)| Label type. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | 
 **page_size** | **u8**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**models::LabelsList200Response**](labels_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels/update**
> models::LabelsResponse labels/update(ctx, ad_account_id, label_update_request)
Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**| Unique identifier of an ad account. | 
  **label_update_request** | [**LabelUpdateRequest**](LabelUpdateRequest.md)|  | 

### Return type

[**models::LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels/apply**
> models::LabeledEntities labels/apply(ctx, ad_account_id, label_id, labeled_entities_create)
Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**|  | 
  **label_id** | **String**| Label ID. | 
  **labeled_entities_create** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  | 

### Return type

[**models::LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels/remove**
> models::LabeledEntities labels/remove(ctx, ad_account_id, label_id, labeled_entities_create)
Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **ad_account_id** | **String**|  | 
  **label_id** | **String**| Label ID. | 
  **labeled_entities_create** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md)|  | 

### Return type

[**models::LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

