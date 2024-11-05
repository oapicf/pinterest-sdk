# TargetingTemplateApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targetingTemplateCreate**](TargetingTemplateApi.md#targetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**targetingTemplateList**](TargetingTemplateApi.md#targetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**targetingTemplateUpdate**](TargetingTemplateApi.md#targetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates



## targetingTemplateCreate

Create targeting templates

<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,
 keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>
 <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse
  performance targeting from prior campaigns for new campaigns.</p>

### Example

```bash
 targetingTemplateCreate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **targetingTemplateCreate** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md) | targeting template creation entity |

### Return type

[**TargetingTemplateGetResponseData**](TargetingTemplateGetResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## targetingTemplateList

List targeting templates

Get a list of the targeting templates in the specified <code>ad_account_id</code>

### Example

```bash
 targetingTemplateList ad_account_id=value  order=value  include_sizing=value  search_query=value  page_size=value  bookmark=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **order** | **string** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING”
by ID. Note that higher-value IDs are associated with more-recently added
items. | [optional] [default to null]
 **includeSizing** | **boolean** | Include audience sizing in result or not | [optional] [default to false]
 **searchQuery** | **string** | Search keyword for targeting templates | [optional] [default to null]
 **pageSize** | **integer** | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. | [optional] [default to 25]
 **bookmark** | **string** | Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**TargetingTemplateList200Response**](TargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## targetingTemplateUpdate

Update targeting templates

<p>Update the targeting template given advertiser ID and targeting template ID</p>

### Example

```bash
 targetingTemplateUpdate ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string** | Unique identifier of an ad account. | [default to null]
 **targetingTemplateUpdateRequest** | [**TargetingTemplateUpdateRequest**](TargetingTemplateUpdateRequest.md) | Operation type and targeting template ID |

### Return type

(empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

