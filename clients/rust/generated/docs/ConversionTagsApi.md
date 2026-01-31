# \ConversionTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversion_tags_slash_create**](ConversionTagsApi.md#conversion_tags_slash_create) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
[**conversion_tags_slash_get**](ConversionTagsApi.md#conversion_tags_slash_get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
[**conversion_tags_slash_list**](ConversionTagsApi.md#conversion_tags_slash_list) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags
[**ocpm_eligible_conversion_tags_slash_get**](ConversionTagsApi.md#ocpm_eligible_conversion_tags_slash_get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
[**page_visit_conversion_tags_slash_get**](ConversionTagsApi.md#page_visit_conversion_tags_slash_get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags



## conversion_tags_slash_create

> models::ConversionTag conversion_tags_slash_create(ad_account_id, conversion_tag_create)
Create conversion tag

Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account's website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**conversion_tag_create** | [**ConversionTagCreate**](ConversionTagCreate.md) |  | [required] |

### Return type

[**models::ConversionTag**](ConversionTag.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## conversion_tags_slash_get

> models::ConversionTag conversion_tags_slash_get(ad_account_id, conversion_tag_id)
Get conversion tag

Get information about an existing conversion tag.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**conversion_tag_id** | **String** | Id of the conversion tag. | [required] |

### Return type

[**models::ConversionTag**](ConversionTag.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## conversion_tags_slash_list

> models::ConversionTagsList200Response conversion_tags_slash_list(ad_account_id, filter_deleted)
List conversion tags

List conversion tags associated with an ad account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**filter_deleted** | Option<**bool**> | Filter by deleted status |  |[default to false]

### Return type

[**models::ConversionTagsList200Response**](conversion_tags_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## ocpm_eligible_conversion_tags_slash_get

> std::collections::HashMap<String, Vec<models::ConversionEventResponse>> ocpm_eligible_conversion_tags_slash_get(ad_account_id)
Get Ocpm eligible conversion tags

Get Ocpm eligible conversion tag events for an ad account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |

### Return type

[**std::collections::HashMap<String, Vec<models::ConversionEventResponse>>**](Vec.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## page_visit_conversion_tags_slash_get

> models::PageVisitConversionTagsGet200Response page_visit_conversion_tags_slash_get(ad_account_id, page_size, order, bookmark)
Get page visit conversion tags

Get all page visit conversion tag events for an ad account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. |  |[default to 25]
**order** | Option<**String**> | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. |  |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |

### Return type

[**models::PageVisitConversionTagsGet200Response**](page_visit_conversion_tags_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

