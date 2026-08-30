# TargetingTemplateApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targeting_template_create**](TargetingTemplateApi.md#targeting_template_create) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**targeting_template_list**](TargetingTemplateApi.md#targeting_template_list) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**targeting_template_update**](TargetingTemplateApi.md#targeting_template_update) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


# **targeting_template_create**
> `targeting_template_create`(_api::`TargetingTemplateApi`, `ad_account_id`::`String`, `targeting_template_create_param`::`TargetingTemplateCreate`; _mediaType=nothing) -> `TargetingTemplate`, `OpenAPI.Clients.ApiResponse` <br/>
> `targeting_template_create`(_api::`TargetingTemplateApi`, response_stream::`Channel`, `ad_account_id`::`String`, `targeting_template_create_param`::`TargetingTemplateCreate`; _mediaType=nothing) -> `Channel`{ `TargetingTemplate` }, `OpenAPI.Clients.ApiResponse`

Create targeting templates

Targeting templates allow advertisers to save a set of targeting details including audience lists, keywords & interest, demographics, and placements to use more than once during the campaign creation process.  Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse performance targeting from prior campaigns for new campaigns.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`TargetingTemplateApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`targeting_template_create_param`** | [**`TargetingTemplateCreate`**](TargetingTemplateCreate.md) |  |

### Return type

[**`TargetingTemplate`**](TargetingTemplate.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **targeting_template_list**
> `targeting_template_list`(_api::`TargetingTemplateApi`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, `include_sizing`=nothing, `search_query`=nothing, _mediaType=nothing) -> `TargetingTemplateList200Response`, `OpenAPI.Clients.ApiResponse` <br/>
> `targeting_template_list`(_api::`TargetingTemplateApi`, response_stream::`Channel`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing, `include_sizing`=nothing, `search_query`=nothing, _mediaType=nothing) -> `Channel`{ `TargetingTemplateList200Response` }, `OpenAPI.Clients.ApiResponse`

List targeting templates

Get a list of the targeting templates in the specified `ad_account_id`

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`TargetingTemplateApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`** | Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **`order`** | [**`PinterestLibPaginationOrder`**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [default to nothing]
 **`include_sizing`** | **`Bool`** | Include audience sizing in result or not | [default to false]
 **`search_query`** | **`String`** | Search query. Can contain pin description keywords or comma-separated pin IDs. | [default to nothing]

### Return type

[**`TargetingTemplateList200Response`**](TargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **targeting_template_update**
> `targeting_template_update`(_api::`TargetingTemplateApi`, `ad_account_id`::`String`, `targeting_template_update_request_read_or_update`::`TargetingTemplateUpdateRequestReadOrUpdate`; _mediaType=nothing) -> `Nothing`, `OpenAPI.Clients.ApiResponse` <br/>
> `targeting_template_update`(_api::`TargetingTemplateApi`, response_stream::`Channel`, `ad_account_id`::`String`, `targeting_template_update_request_read_or_update`::`TargetingTemplateUpdateRequestReadOrUpdate`; _mediaType=nothing) -> `Channel`{ `Nothing` }, `OpenAPI.Clients.ApiResponse`

Update targeting templates

Update the targeting template given advertiser ID and targeting template ID

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`TargetingTemplateApi`** | API context | 
**`ad_account_id`** | **`String`** | Unique identifier of an ad account. |
**`targeting_template_update_request_read_or_update`** | [**`TargetingTemplateUpdateRequestReadOrUpdate`**](TargetingTemplateUpdateRequestReadOrUpdate.md) |  |

### Return type

`Nothing`

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

