# ConversionTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**conversionTags/create**](ConversionTagsApi.md#conversionTags/create) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag |
| [**conversionTags/get**](ConversionTagsApi.md#conversionTags/get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag |
| [**conversionTags/list**](ConversionTagsApi.md#conversionTags/list) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | List conversion tags |
| [**ocpmEligibleConversionTags/get**](ConversionTagsApi.md#ocpmEligibleConversionTags/get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags |
| [**pageVisitConversionTags/get**](ConversionTagsApi.md#pageVisitConversionTags/get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags |


<a name="conversionTags/create"></a>
# **conversionTags/create**
> ConversionTag conversionTags/create(ad\_account\_id, ConversionTagCreate)

Create conversion tag

    Create a conversion tag, also known as [Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag), with the option to enable enhanced match.  The Pinterest Tag tracks actions people take on the ad account&#39;s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.  For more information, see:  [Set up the Pinterest tag](https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag)  [Pinterest Tag](/docs/track-conversions/pinterest-tag/)  [Enhanced match](/docs/track-conversions/pinterest-tag/#enhanced-match)

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **ConversionTagCreate** | [**ConversionTagCreate**](../Models/ConversionTagCreate.md)|  | |

### Return type

[**ConversionTag**](../Models/ConversionTag.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="conversionTags/get"></a>
# **conversionTags/get**
> ConversionTag conversionTags/get(ad\_account\_id, conversion\_tag\_id)

Get conversion tag

    Get information about an existing conversion tag.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **conversion\_tag\_id** | **String**| Id of the conversion tag. | [default to null] |

### Return type

[**ConversionTag**](../Models/ConversionTag.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="conversionTags/list"></a>
# **conversionTags/list**
> conversion_tags_list_200_response conversionTags/list(ad\_account\_id, filter\_deleted)

List conversion tags

    List conversion tags associated with an ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **filter\_deleted** | **Boolean**| Filter by deleted status | [optional] [default to false] |

### Return type

[**conversion_tags_list_200_response**](../Models/conversion_tags_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="ocpmEligibleConversionTags/get"></a>
# **ocpmEligibleConversionTags/get**
> Map ocpmEligibleConversionTags/get(ad\_account\_id)

Get Ocpm eligible conversion tags

    Get Ocpm eligible conversion tag events for an ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |

### Return type

[**Map**](../Models/array.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pageVisitConversionTags/get"></a>
# **pageVisitConversionTags/get**
> page_visit_conversion_tags_get_200_response pageVisitConversionTags/get(ad\_account\_id, page\_size, order, bookmark)

Get page visit conversion tags

    Get all page visit conversion tag events for an ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |

### Return type

[**page_visit_conversion_tags_get_200_response**](../Models/page_visit_conversion_tags_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

