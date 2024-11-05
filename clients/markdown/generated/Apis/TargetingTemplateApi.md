# TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**targetingTemplate/create**](TargetingTemplateApi.md#targetingTemplate/create) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates |
| [**targetingTemplate/list**](TargetingTemplateApi.md#targetingTemplate/list) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates |
| [**targetingTemplate/update**](TargetingTemplateApi.md#targetingTemplate/update) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates |


<a name="targetingTemplate/create"></a>
# **targetingTemplate/create**
> TargetingTemplateGetResponseData targetingTemplate/create(ad\_account\_id, TargetingTemplateCreate)

Create targeting templates

    &lt;p&gt;Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords &amp; interest, demographics, and placements to use more than once during the campaign creation process.&lt;/p&gt;  &lt;p&gt;Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.&lt;/p&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **TargetingTemplateCreate** | [**TargetingTemplateCreate**](../Models/TargetingTemplateCreate.md)| targeting template creation entity | |

### Return type

[**TargetingTemplateGetResponseData**](../Models/TargetingTemplateGetResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="targetingTemplate/list"></a>
# **targetingTemplate/list**
> targeting_template_list_200_response targetingTemplate/list(ad\_account\_id, order, include\_sizing, search\_query, page\_size, bookmark)

List targeting templates

    Get a list of the targeting templates in the specified &lt;code&gt;ad_account_id&lt;/code&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **include\_sizing** | **Boolean**| Include audience sizing in result or not | [optional] [default to false] |
| **search\_query** | **String**| Search keyword for targeting templates | [optional] [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |

### Return type

[**targeting_template_list_200_response**](../Models/targeting_template_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="targetingTemplate/update"></a>
# **targetingTemplate/update**
> targetingTemplate/update(ad\_account\_id, TargetingTemplateUpdateRequest)

Update targeting templates

    &lt;p&gt;Update the targeting template given advertiser ID and targeting template ID&lt;/p&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **TargetingTemplateUpdateRequest** | [**TargetingTemplateUpdateRequest**](../Models/TargetingTemplateUpdateRequest.md)| Operation type and targeting template ID | |

### Return type

null (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

