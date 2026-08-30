# TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**targetingTemplate/create**](TargetingTemplateApi.md#targetingTemplate/create) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates |
| [**targetingTemplate/list**](TargetingTemplateApi.md#targetingTemplate/list) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates |
| [**targetingTemplate/update**](TargetingTemplateApi.md#targetingTemplate/update) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates |


<a name="targetingTemplate/create"></a>
# **targetingTemplate/create**
> TargetingTemplate targetingTemplate/create(ad\_account\_id, TargetingTemplateCreate)

Create targeting templates

    Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **TargetingTemplateCreate** | [**TargetingTemplateCreate**](../Models/TargetingTemplateCreate.md)|  | |

### Return type

[**TargetingTemplate**](../Models/TargetingTemplate.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="targetingTemplate/list"></a>
# **targetingTemplate/list**
> targeting_template_list_200_response targetingTemplate/list(ad\_account\_id, bookmark, page\_size, order, include\_sizing, search\_query)

List targeting templates

    Get a list of the targeting templates in the specified &#x60;ad_account_id&#x60;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**Pinterest.Lib.PaginationOrder**](../Models/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **include\_sizing** | **Boolean**| Include audience sizing in result or not | [optional] [default to false] |
| **search\_query** | **String**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] [default to null] |

### Return type

[**targeting_template_list_200_response**](../Models/targeting_template_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="targetingTemplate/update"></a>
# **targetingTemplate/update**
> targetingTemplate/update(ad\_account\_id, TargetingTemplateUpdateRequestReadOrUpdate)

Update targeting templates

    Update the targeting template given advertiser ID and targeting template ID

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **TargetingTemplateUpdateRequestReadOrUpdate** | [**TargetingTemplateUpdateRequestReadOrUpdate**](../Models/TargetingTemplateUpdateRequestReadOrUpdate.md)|  | |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

