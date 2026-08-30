# ConversionTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversion_tags_create**](ConversionTagsApi.md#conversion_tags_create) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
[**conversion_tags_get**](ConversionTagsApi.md#conversion_tags_get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
[**conversion_tags_list**](ConversionTagsApi.md#conversion_tags_list) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags
[**ocpm_eligible_conversion_tags_get**](ConversionTagsApi.md#ocpm_eligible_conversion_tags_get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
[**page_visit_conversion_tags_get**](ConversionTagsApi.md#page_visit_conversion_tags_get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags


# **conversion_tags_create**
> `conversion_tags_create`(req::`HTTP.Request`, `ad_account_id`::`String`, `conversion_tag_create`::`ConversionTagCreate`;) -> `ConversionTag`

Create conversion tag

Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`conversion_tag_create`** | [**`ConversionTagCreate`**](ConversionTagCreate.md)|  |

### Return type

[**`ConversionTag`**](ConversionTag.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversion_tags_get**
> `conversion_tags_get`(req::`HTTP.Request`, `ad_account_id`::`String`, `conversion_tag_id`::`String`;) -> `ConversionTag`

Get conversion tag

Get information about an existing conversion tag.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |
**`conversion_tag_id`** | **`String`**| Id of the conversion tag. |

### Return type

[**`ConversionTag`**](ConversionTag.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversion_tags_list**
> `conversion_tags_list`(req::`HTTP.Request`, `ad_account_id`::`String`; `filter_deleted`=nothing,) -> `ConversionTagsList200Response`

List conversion tags

List conversion tags associated with an ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`filter_deleted`** | **`Bool`**| Filter by deleted status | [default to false]

### Return type

[**`ConversionTagsList200Response`**](ConversionTagsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ocpm_eligible_conversion_tags_get**
> `ocpm_eligible_conversion_tags_get`(req::`HTTP.Request`, `ad_account_id`::`String`;) -> `Dict{String, Vector{ConversionEventResponse}}`

Get Ocpm eligible conversion tags

Get Ocpm eligible conversion tag events for an ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Return type

**`Dict{String, Vector{ConversionEventResponse}}`**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **page_visit_conversion_tags_get**
> `page_visit_conversion_tags_get`(req::`HTTP.Request`, `ad_account_id`::`String`; `bookmark`=nothing, `page_size`=nothing, `order`=nothing,) -> `PageVisitConversionTagsGet200Response`

Get page visit conversion tags

Get all page visit conversion tag events for an ad account.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`ad_account_id`** | **`String`**| Unique identifier of an ad account. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]
 **`order`** | [**`PinterestLibPaginationOrder`**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [default to nothing]

### Return type

[**`PageVisitConversionTagsGet200Response`**](PageVisitConversionTagsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

