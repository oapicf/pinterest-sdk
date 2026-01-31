# \LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labels_slash_create**](LabelsApi.md#labels_slash_create) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labels_slash_list**](LabelsApi.md#labels_slash_list) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labels_slash_update**](LabelsApi.md#labels_slash_update) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels



## labels_slash_create

> models::LabelsResponse labels_slash_create(ad_account_id, label_create_request)
Create labels

<p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>

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

> models::LabelsList200Response labels_slash_list(ad_account_id, campaign_ids, label_ids, entity_statuses, label_types, page_size, bookmark)
List labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**campaign_ids** | Option<[**Vec<String>**](String.md)> | List of Campaign Ids to use to filter the results. |  |
**label_ids** | Option<[**Vec<String>**](String.md)> | List of Label Ids to use to filter the results. |  |
**entity_statuses** | Option<[**Vec<String>**](String.md)> | Label entity status |  |[default to ["ACTIVE"]]
**label_types** | Option<[**Vec<String>**](String.md)> | Label type. |  |[default to ["BRAND","CUSTOM"]]
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |

### Return type

[**models::LabelsList200Response**](labels_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## labels_slash_update

> models::LabelsResponse labels_slash_update(ad_account_id, label_update_request)
Update labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>

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

