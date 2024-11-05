# \TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targeting_template_slash_create**](TargetingTemplateApi.md#targeting_template_slash_create) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**targeting_template_slash_list**](TargetingTemplateApi.md#targeting_template_slash_list) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**targeting_template_slash_update**](TargetingTemplateApi.md#targeting_template_slash_update) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates



## targeting_template_slash_create

> models::TargetingTemplateGetResponseData targeting_template_slash_create(ad_account_id, targeting_template_create)
Create targeting templates

<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**targeting_template_create** | [**TargetingTemplateCreate**](TargetingTemplateCreate.md) | targeting template creation entity | [required] |

### Return type

[**models::TargetingTemplateGetResponseData**](TargetingTemplateGetResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## targeting_template_slash_list

> models::TargetingTemplateList200Response targeting_template_slash_list(ad_account_id, order, include_sizing, search_query, page_size, bookmark)
List targeting templates

Get a list of the targeting templates in the specified <code>ad_account_id</code>

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**order** | Option<**String**> | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. |  |
**include_sizing** | Option<**bool**> | Include audience sizing in result or not |  |[default to false]
**search_query** | Option<**String**> | Search keyword for targeting templates |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |

### Return type

[**models::TargetingTemplateList200Response**](targeting_template_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## targeting_template_slash_update

> targeting_template_slash_update(ad_account_id, targeting_template_update_request)
Update targeting templates

<p>Update the targeting template given advertiser ID and targeting template ID</p>

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**targeting_template_update_request** | [**TargetingTemplateUpdateRequest**](TargetingTemplateUpdateRequest.md) | Operation type and targeting template ID | [required] |

### Return type

 (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

