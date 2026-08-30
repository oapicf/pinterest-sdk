# CONVERSIONTAGS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**conversion_tags_create**](CONVERSIONTAGS_API.md#conversion_tags_create) | **Post** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
[**conversion_tags_get**](CONVERSIONTAGS_API.md#conversion_tags_get) | **Get** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
[**conversion_tags_list**](CONVERSIONTAGS_API.md#conversion_tags_list) | **Get** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags
[**ocpm_eligible_conversion_tags_get**](CONVERSIONTAGS_API.md#ocpm_eligible_conversion_tags_get) | **Get** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
[**page_visit_conversion_tags_get**](CONVERSIONTAGS_API.md#page_visit_conversion_tags_get) | **Get** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags


# **conversion_tags_create**
> conversion_tags_create (ad_account_id: STRING_32 ; conversion_tag_create: CONVERSION_TAG_CREATE ): detachable CONVERSION_TAG


Create conversion tag

Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **conversion_tag_create** | [**CONVERSION_TAG_CREATE**](CONVERSION_TAG_CREATE.md)|  | 

### Return type

[**CONVERSION_TAG**](ConversionTag.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversion_tags_get**
> conversion_tags_get (ad_account_id: STRING_32 ; conversion_tag_id: STRING_32 ): detachable CONVERSION_TAG


Get conversion tag

Get information about an existing conversion tag.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **conversion_tag_id** | **STRING_32**| Id of the conversion tag. | [default to null]

### Return type

[**CONVERSION_TAG**](ConversionTag.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **conversion_tags_list**
> conversion_tags_list (ad_account_id: STRING_32 ; filter_deleted:  detachable BOOLEAN ): detachable CONVERSION_TAGS_LIST_200_RESPONSE


List conversion tags

List conversion tags associated with an ad account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **filter_deleted** | **BOOLEAN**| Filter by deleted status | [optional] [default to false]

### Return type

[**CONVERSION_TAGS_LIST_200_RESPONSE**](conversion_tags_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ocpm_eligible_conversion_tags_get**
> ocpm_eligible_conversion_tags_get (ad_account_id: STRING_32 ): detachable STRING_TABLE [LIST [CONVERSION_EVENT_RESPONSE]]


Get Ocpm eligible conversion tags

Get Ocpm eligible conversion tag events for an ad account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]

### Return type

[**STRING_TABLE [LIST [CONVERSION_EVENT_RESPONSE]]**](LIST.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **page_visit_conversion_tags_get**
> page_visit_conversion_tags_get (ad_account_id: STRING_32 ; bookmark:  detachable STRING_32 ; page_size:  detachable INTEGER_32 ; order:  detachable PINTEREST_LIB_PAGINATION_ORDER ): detachable PAGE_VISIT_CONVERSION_TAGS_GET_200_RESPONSE


Get page visit conversion tags

Get all page visit conversion tag events for an ad account.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [default to null]
 **bookmark** | **STRING_32**| Cursor used to fetch the next page of items | [optional] [default to null]
 **page_size** | **INTEGER_32**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PINTEREST_LIB_PAGINATION_ORDER**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null]

### Return type

[**PAGE_VISIT_CONVERSION_TAGS_GET_200_RESPONSE**](page_visit_conversion_tags_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

