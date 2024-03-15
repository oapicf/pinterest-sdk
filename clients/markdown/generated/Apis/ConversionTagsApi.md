# ConversionTagsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**conversionTags/create**](ConversionTagsApi.md#conversionTags/create) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag |
| [**conversionTags/get**](ConversionTagsApi.md#conversionTags/get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag |
| [**conversionTags/list**](ConversionTagsApi.md#conversionTags/list) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags |
| [**ocpmEligibleConversionTags/get**](ConversionTagsApi.md#ocpmEligibleConversionTags/get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags |
| [**pageVisitConversionTags/get**](ConversionTagsApi.md#pageVisitConversionTags/get) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags |


<a name="conversionTags/create"></a>
# **conversionTags/create**
> ConversionTagResponse conversionTags/create(ad\_account\_id, ConversionTagCreate)

Create conversion tag

    Create a conversion tag, also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest tag&lt;/a&gt;, with the option to enable enhanced match.&lt;p/&gt; The Pinterest Tag tracks actions people take on the ad account’s website after they view the ad account&#39;s ad on Pinterest. The advertiser needs to customize this tag to track conversions.&lt;p/&gt; For more information, see:&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\&quot;&gt;Set up the Pinterest tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://developers.pinterest.com/docs/conversions/pinterest-tag/\&quot;&gt;Pinterest Tag&lt;/a&gt;&lt;p/&gt; &lt;a class&#x3D;\&quot;reference external\&quot; href&#x3D;\&quot;https://developers.pinterest.com/docs/conversions/enhanced-match/\&quot;&gt;Enhanced match&lt;/a&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **ConversionTagCreate** | [**ConversionTagCreate**](../Models/ConversionTagCreate.md)| Conversion Tag to create | |

### Return type

[**ConversionTagResponse**](../Models/ConversionTagResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="conversionTags/get"></a>
# **conversionTags/get**
> ConversionTagResponse conversionTags/get(ad\_account\_id, conversion\_tag\_id)

Get conversion tag

    Get information about an existing conversion tag.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **conversion\_tag\_id** | **String**| Id of the conversion tag. | [default to null] |

### Return type

[**ConversionTagResponse**](../Models/ConversionTagResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="conversionTags/list"></a>
# **conversionTags/list**
> ConversionTagListResponse conversionTags/list(ad\_account\_id, filter\_deleted)

Get conversion tags

    List conversion tags associated with an ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **filter\_deleted** | **Boolean**| Filter out deleted tags. | [optional] [default to false] |

### Return type

[**ConversionTagListResponse**](../Models/ConversionTagListResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

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

[pinterest_oauth2](../README.md#pinterest_oauth2)

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
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |

### Return type

[**page_visit_conversion_tags_get_200_response**](../Models/page_visit_conversion_tags_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

