# LabelsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**labels/create**](LabelsApi.md#labels/create) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels |
| [**labels/list**](LabelsApi.md#labels/list) | **GET** /ad_accounts/{ad_account_id}/labels | List labels |
| [**labels/update**](LabelsApi.md#labels/update) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels |


<a name="labels/create"></a>
# **labels/create**
> LabelsResponse labels/create(ad\_account\_id, LabelCreateRequest)

Create labels

    &lt;p&gt; &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt; This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    &lt;b&gt;Note:&lt;/b&gt; You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  &lt;/p&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **LabelCreateRequest** | [**LabelCreateRequest**](../Models/LabelCreateRequest.md)|  | |

### Return type

[**LabelsResponse**](../Models/LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="labels/list"></a>
# **labels/list**
> labels_list_200_response labels/list(ad\_account\_id, campaign\_ids, label\_ids, entity\_statuses, label\_types, page\_size, bookmark)

List labels

    &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   See a list of labels for assets that your account owns, and filter the list by different criteria. &lt;/p&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **campaign\_ids** | [**List**](../Models/String.md)| List of Campaign Ids to use to filter the results. | [optional] [default to null] |
| **label\_ids** | [**List**](../Models/String.md)| List of Label Ids to use to filter the results. | [optional] [default to null] |
| **entity\_statuses** | [**List**](../Models/String.md)| Label entity status | [optional] [default to [&quot;ACTIVE&quot;]] [enum: ACTIVE, ARCHIVED] |
| **label\_types** | [**List**](../Models/String.md)| Label type. | [optional] [default to [&quot;BRAND&quot;,&quot;CUSTOM&quot;]] [enum: BRAND, CUSTOM] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |

### Return type

[**labels_list_200_response**](../Models/labels_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="labels/update"></a>
# **labels/update**
> LabelsResponse labels/update(ad\_account\_id, LabelUpdateRequest)

Update labels

    &lt;p&gt;   &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank\&quot; target&#x3D;\&quot;blank\&quot;&gt;Closed beta&lt;/a&gt;   This endpoint is not available to all users. &lt;/p&gt; &lt;p&gt;   Change the properties of one or more labels. &lt;/p&gt;

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **LabelUpdateRequest** | [**LabelUpdateRequest**](../Models/LabelUpdateRequest.md)|  | |

### Return type

[**LabelsResponse**](../Models/LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

