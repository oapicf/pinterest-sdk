# TARGETINGTEMPLATE_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**targeting_template_create**](TARGETINGTEMPLATE_API.md#targeting_template_create) | **Post** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**targeting_template_list**](TARGETINGTEMPLATE_API.md#targeting_template_list) | **Get** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**targeting_template_update**](TARGETINGTEMPLATE_API.md#targeting_template_update) | **Patch** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


# **targeting_template_create**
> targeting_template_create (ad_account_id: STRING_32 ; targeting_template_create: TARGETING_TEMPLATE_CREATE ): detachable TARGETING_TEMPLATE_GET_RESPONSE_DATA


Create targeting templates

<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **targeting_template_create** | [**TARGETING_TEMPLATE_CREATE**](TARGETING_TEMPLATE_CREATE.md)| targeting template creation entity | 

### Return type

[**TARGETING_TEMPLATE_GET_RESPONSE_DATA**](TargetingTemplateGetResponseData.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targeting_template_list**
> targeting_template_list (ad_account_id: STRING_32 ; order:  detachable STRING_32 ; include_sizing:  detachable BOOLEAN ; search_query:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; bookmark:  detachable STRING_32 ): detachable TARGETING_TEMPLATE_LIST_200_RESPONSE


List targeting templates

Get a list of the targeting templates in the specified <code>ad_account_id</code>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **order** | **STRING_32**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **include_sizing** | **BOOLEAN**| Include audience sizing in result or not | [optional] [default to false]
 **search_query** | **STRING_32**| Search keyword for targeting templates | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]

### Return type

[**TARGETING_TEMPLATE_LIST_200_RESPONSE**](targeting_template_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targeting_template_update**
> targeting_template_update (ad_account_id: STRING_32 ; targeting_template_update_request: TARGETING_TEMPLATE_UPDATE_REQUEST )


Update targeting templates

<p>Update the targeting template given advertiser ID and targeting template ID</p>


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **targeting_template_update_request** | [**TARGETING_TEMPLATE_UPDATE_REQUEST**](TARGETING_TEMPLATE_UPDATE_REQUEST.md)| Operation type and targeting template ID | 

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

