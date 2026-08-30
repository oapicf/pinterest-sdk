# TARGETINGTEMPLATE_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**targeting_template_create**](TARGETINGTEMPLATE_API.md#targeting_template_create) | **Post** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**targeting_template_list**](TARGETINGTEMPLATE_API.md#targeting_template_list) | **Get** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**targeting_template_update**](TARGETINGTEMPLATE_API.md#targeting_template_update) | **Patch** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


# **targeting_template_create**
> targeting_template_create (ad_account_id: STRING_32 ; targeting_template_create: TARGETING_TEMPLATE_CREATE ): detachable TARGETING_TEMPLATE


Create targeting templates

Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **targeting_template_create** | [**TARGETING_TEMPLATE_CREATE**](TARGETING_TEMPLATE_CREATE.md)|  | 

### Return type

[**TARGETING_TEMPLATE**](TargetingTemplate.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targeting_template_list**
> targeting_template_list (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable PINTEREST_LIB_PAGINATION_ORDER ; include_sizing:  detachable BOOLEAN ; search_query:  detachable STRING_32 ): detachable TARGETING_TEMPLATE_LIST_200_RESPONSE


List targeting templates

Get a list of the targeting templates in the specified `ad_account_id`


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PINTEREST_LIB_PAGINATION_ORDER**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]
 **include_sizing** | **BOOLEAN**| Include audience sizing in result or not | [optional] [default to false]
 **search_query** | **STRING_32**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] [default to null]

### Return type

[**TARGETING_TEMPLATE_LIST_200_RESPONSE**](targeting_template_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **targeting_template_update**
> targeting_template_update (ad_account_id: STRING_32 ; targeting_template_update_request_read_or_update: TARGETING_TEMPLATE_UPDATE_REQUEST_READ_OR_UPDATE )


Update targeting templates

Update the targeting template given advertiser ID and targeting template ID


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **targeting_template_update_request_read_or_update** | [**TARGETING_TEMPLATE_UPDATE_REQUEST_READ_OR_UPDATE**](TARGETING_TEMPLATE_UPDATE_REQUEST_READ_OR_UPDATE.md)|  | 

### Return type

{empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

