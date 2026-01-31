# LabelsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labelsCreate**](LabelsApi.md#labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labelsList**](LabelsApi.md#labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labelsUpdate**](LabelsApi.md#labelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels



## labelsCreate

Create labels

<p>
<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>
This endpoint is not available to all users.
</p>
<p>
  Apply one or more labels to a campaign.
  Currently, you can apply brand and custom labels. Future releases will provide more options.

  <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.
 </p>

### Example

```bash
 labelsCreate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **labelCreateRequest** | [**LabelCreateRequest**](LabelCreateRequest.md) |  |

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## labelsList

List labels

<p>
  <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>
  This endpoint is not available to all users.
</p>
<p>
  See a list of labels for assets that your account owns, and filter the list by different criteria.
</p>

### Example

```bash
 labelsList ad_account_id=value  Specify as:  campaign_ids=value1 campaign_ids=value2 campaign_ids=...  Specify as:  label_ids=value1 label_ids=value2 label_ids=...  Specify as:  entity_statuses=value1 entity_statuses=value2 entity_statuses=...  Specify as:  label_types=value1 label_types=value2 label_types=...  page_size=value  bookmark=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **campaignIds** | [**array[string]**](string.md) | List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **labelIds** | [**array[string]**](string.md) | List of Label Ids to use to filter the results. | [optional] [default to null]
 **entityStatuses** | [**array[string]**](string.md) | Label entity status | [optional] [default to [&quot;ACTIVE&quot;]]
 **labelTypes** | [**array[string]**](string.md) | Label type. | [optional] [default to [&quot;BRAND&quot;,&quot;CUSTOM&quot;]]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. | [optional] [default to 25]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**LabelsList200Response**](LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## labelsUpdate

Update labels

<p>
  <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>
  This endpoint is not available to all users.
</p>
<p>
  Change the properties of one or more labels.
</p>

### Example

```bash
 labelsUpdate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **labelUpdateRequest** | [**LabelUpdateRequest**](LabelUpdateRequest.md) |  |

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

