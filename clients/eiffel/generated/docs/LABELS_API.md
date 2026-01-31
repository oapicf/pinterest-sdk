# LABELS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**labels_create**](LABELS_API.md#labels_create) | **Post** /ad_accounts/{ad_account_id}/labels | Create labels
[**labels_list**](LABELS_API.md#labels_list) | **Get** /ad_accounts/{ad_account_id}/labels | List labels
[**labels_update**](LABELS_API.md#labels_update) | **Patch** /ad_accounts/{ad_account_id}/labels | Update labels


# **labels_create**
> labels_create (ad_account_id: STRING_32 ; label_create_request: LABEL_CREATE_REQUEST ): detachable LABELS_RESPONSE


Create labels

<p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>


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
> labels_list (ad_account_id: STRING_32 ; campaign_ids:  detachable LIST [STRING_32] ; label_ids:  detachable LIST [STRING_32] ; entity_statuses:  detachable LIST [STRING_32] ; label_types:  detachable LIST [STRING_32] ; page_size:  detachable INTEGER_32 ; bookmark:  detachable STRING_32 ): detachable LABELS_LIST_200_RESPONSE


List labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **campaign_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **label_ids** | [**LIST [STRING_32]**](STRING_32.md)| List of Label Ids to use to filter the results. | [optional] [default to null]
 **entity_statuses** | [**LIST [STRING_32]**](STRING_32.md)| Label entity status | [optional] [default to [&quot;ACTIVE&quot;]]
 **label_types** | [**LIST [STRING_32]**](STRING_32.md)| Label type. | [optional] [default to [&quot;BRAND&quot;,&quot;CUSTOM&quot;]]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**LABELS_LIST_200_RESPONSE**](labels_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labels_update**
> labels_update (ad_account_id: STRING_32 ; label_update_request: LABEL_UPDATE_REQUEST ): detachable LABELS_RESPONSE


Update labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>


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

