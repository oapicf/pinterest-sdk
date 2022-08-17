# AdsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**adPreviews/create**](AdsApi.md#adPreviews/create) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image |
| [**ads/create**](AdsApi.md#ads/create) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads |
| [**ads/get**](AdsApi.md#ads/get) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad |
| [**ads/list**](AdsApi.md#ads/list) | **GET** /ad_accounts/{ad_account_id}/ads | List ads |
| [**ads/update**](AdsApi.md#ads/update) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads |


<a name="adPreviews/create"></a>
# **adPreviews/create**
> AdPreviewURLResponse adPreviews/create(ad\_account\_id, AdPreviewRequest)

Create ad preview with pin or image

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/ads-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt; &lt;p/&gt; Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. &lt;p/&gt; If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/promoted-pins-overview\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Ads Overview&lt;/a&gt;.) &lt;p/&gt; You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdPreviewRequest** | [**AdPreviewRequest**](../Models/AdPreviewRequest.md)| Create ad preview with pin or image. | |

### Return type

[**AdPreviewURLResponse**](../Models/AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="ads/create"></a>
# **ads/create**
> AdArrayResponse ads/create(ad\_account\_id, AdCreateRequest\_inner)

Create ads

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/ads-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt; &lt;p/&gt; Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdCreateRequest\_inner** | [**List**](../Models/AdCreateRequest_inner.md)| List of ads to create, size limit [1, 30]. | |

### Return type

[**AdArrayResponse**](../Models/AdArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="ads/get"></a>
# **ads/get**
> AdResponse ads/get(ad\_account\_id, ad\_id)

Get ad

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/ads-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt; &lt;p/&gt; Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the &lt;a href&#x3D;\&quot;https://www.pinterest.com/_/_/policy/advertising-guidelines/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **ad\_id** | **String**| Unique identifier of an ad. | [default to null] |

### Return type

[**AdResponse**](../Models/AdResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="ads/list"></a>
# **ads/list**
> ads_list_200_response ads/list(ad\_account\_id, campaign\_ids, ad\_group\_ids, ad\_ids, entity\_statuses, page\_size, order, bookmark)

List ads

    List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses &lt;p/&gt; If no filter is provided, all ads in the ad account are returned. &lt;p/&gt; &lt;strong&gt;Note:&lt;/strong&gt;&lt;p/&gt; Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. &lt;p/&gt; Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see &lt;a href&#x3D;\&quot;https://policy.pinterest.com/en/advertising-guidelines\&quot;&gt;Pinterest advertising standards&lt;/a&gt;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **campaign\_ids** | [**List**](../Models/String.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null] |
| **ad\_group\_ids** | [**List**](../Models/String.md)| List of Ad group Ids to use to filter the results. | [optional] [default to null] |
| **ad\_ids** | [**List**](../Models/String.md)| List of Ad Ids to use to filter the results. | [optional] [default to null] |
| **entity\_statuses** | [**List**](../Models/String.md)| Entity status | [optional] [default to null] [enum: ACTIVE, PAUSED, ARCHIVED] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |

### Return type

[**ads_list_200_response**](../Models/ads_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="ads/update"></a>
# **ads/update**
> AdArrayResponse ads/update(ad\_account\_id, AdUpdateRequest\_inner)

Update ads

    &lt;strong&gt;This endpoint is currently in beta and not available to all apps. &lt;a href&#x3D;&#39;/docs/features/ads-management/&#39;&gt;Learn more&lt;/a&gt;.&lt;/strong&gt; &lt;p/&gt; Update multiple existing ads

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AdUpdateRequest\_inner** | [**List**](../Models/AdUpdateRequest_inner.md)| List of ads to update, size limit [1, 30] | |

### Return type

[**AdArrayResponse**](../Models/AdArrayResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

