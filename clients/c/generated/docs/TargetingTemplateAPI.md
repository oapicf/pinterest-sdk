# TargetingTemplateAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TargetingTemplateAPI_targetingTemplateCreate**](TargetingTemplateAPI.md#TargetingTemplateAPI_targetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**TargetingTemplateAPI_targetingTemplateList**](TargetingTemplateAPI.md#TargetingTemplateAPI_targetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**TargetingTemplateAPI_targetingTemplateUpdate**](TargetingTemplateAPI.md#TargetingTemplateAPI_targetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


# **TargetingTemplateAPI_targetingTemplateCreate**
```c
// Create targeting templates
//
// <p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>
//
targeting_template_get_response_data_t* TargetingTemplateAPI_targetingTemplateCreate(apiClient_t *apiClient, char *ad_account_id, targeting_template_create_t *targeting_template_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**targeting_template_create** | **[targeting_template_create_t](targeting_template_create.md) \*** | targeting template creation entity | 

### Return type

[targeting_template_get_response_data_t](targeting_template_get_response_data.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TargetingTemplateAPI_targetingTemplateList**
```c
// List targeting templates
//
// Get a list of the targeting templates in the specified <code>ad_account_id</code>
//
targeting_template_list_200_response_t* TargetingTemplateAPI_targetingTemplateList(apiClient_t *apiClient, char *ad_account_id, pinterest_rest_api_targetingTemplateList_order_e order, int *include_sizing, char *search_query, int *page_size, char *bookmark);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**order** | **pinterest_rest_api_targetingTemplateList_order_e** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
**include_sizing** | **int \*** | Include audience sizing in result or not | [optional] [default to false]
**search_query** | **char \*** | Search keyword for targeting templates | [optional] 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 

### Return type

[targeting_template_list_200_response_t](targeting_template_list_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TargetingTemplateAPI_targetingTemplateUpdate**
```c
// Update targeting templates
//
// <p>Update the targeting template given advertiser ID and targeting template ID</p>
//
void TargetingTemplateAPI_targetingTemplateUpdate(apiClient_t *apiClient, char *ad_account_id, targeting_template_update_request_t *targeting_template_update_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**targeting_template_update_request** | **[targeting_template_update_request_t](targeting_template_update_request.md) \*** | Operation type and targeting template ID | 

### Return type

void

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

