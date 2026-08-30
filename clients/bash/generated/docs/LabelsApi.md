# LabelsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labelsApply**](LabelsApi.md#labelsApply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**labelsCreate**](LabelsApi.md#labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labelsList**](LabelsApi.md#labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labelsRemove**](LabelsApi.md#labelsRemove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**labelsUpdate**](LabelsApi.md#labelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels



## labelsApply

Apply label to entity

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)

  Apply a label to one or more campaigns.
  Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.
  Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.

  **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Example

```bash
 labelsApply ad_account_id=value label_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** |  | [default to null]
 **labelId** | **string** | Label ID. | [default to null]
 **labeledEntitiesCreate** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md) |  |

### Return type

[**LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## labelsCreate

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)

Apply one or more labels to a campaign.
Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/).
Currently, you can apply brand and custom labels. Future releases will provide more options.

**Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

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

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)

See a list of labels for assets that your account owns, and filter the list by different criteria.
If no filter is provided, it will default to labels associated with the ad account id.

### Example

```bash
 labelsList ad_account_id=value  Specify as:  campaign_ids=value1 campaign_ids=value2 campaign_ids=...  Specify as:  label_ids=value1 label_ids=value2 label_ids=...  Specify as:  entity_statuses=value1 entity_statuses=value2 entity_statuses=...  Specify as:  label_types=value1 label_types=value2 label_types=...  bookmark=value  page_size=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **campaignIds** | [**array[string]**](string.md) | List of Campaign Ids to use to filter the results. | [optional] [default to null]
 **labelIds** | [**array[string]**](string.md) | List of Label Ids to use to filter the results. | [optional] [default to null]
 **entityStatuses** | [**array[QueryLabelEntityStatusesItems]**](QueryLabelEntityStatusesItems.md) | Label entity status | [optional] [default to [&quot;ACTIVE&quot;]]
 **labelTypes** | [**array[QueryLabelTypesItems]**](QueryLabelTypesItems.md) | Label type. | [optional] [default to [&quot;BRAND&quot;,&quot;CUSTOM&quot;]]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page.
See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**LabelsList200Response**](LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## labelsRemove

Remove label from entities

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)

  Remove a label from one or more entities.

### Example

```bash
 labelsRemove ad_account_id=value label_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** |  | [default to null]
 **labelId** | **string** | Label ID. | [default to null]
 **labeledEntitiesCreate** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md) |  |

### Return type

[**LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## labelsUpdate

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)

Change the properties of one or more labels.

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

