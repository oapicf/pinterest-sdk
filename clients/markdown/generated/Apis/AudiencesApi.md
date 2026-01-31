# AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**audiences/create**](AudiencesApi.md#audiences/create) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience |
| [**audiences/get**](AudiencesApi.md#audiences/get) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience |
| [**audiences/list**](AudiencesApi.md#audiences/list) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences |
| [**audiences/update**](AudiencesApi.md#audiences/update) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience |


<a name="audiences/create"></a>
# **audiences/create**
> Audience audiences/create(ad\_account\_id, AudienceCreateRequest)

Create audience

    Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific &#x60;audience_ids&#x60; when you create an ad group. &lt;p/&gt; Learn about &lt;a href&#x3D;\&quot;/docs/work-with-targets-and-audiences/create-audiences/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;creating different kinds of audiences&lt;/a&gt;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **AudienceCreateRequest** | [**AudienceCreateRequest**](../Models/AudienceCreateRequest.md)| List of ads to create, size limit [1, 30] | |

### Return type

[**Audience**](../Models/Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="audiences/get"></a>
# **audiences/get**
> Audience audiences/get(ad\_account\_id, audience\_id)

Get audience

    Get a specific audience given the audience ID.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **audience\_id** | **String**| Unique identifier of an audience | [default to null] |

### Return type

[**Audience**](../Models/Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="audiences/list"></a>
# **audiences/list**
> audiences_list_200_response audiences/list(ad\_account\_id, bookmark, order, page\_size, ownership\_type)

List audiences

    Get list of audiences for the ad account.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] [default to null] |
| **order** | **String**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional] [default to null] [enum: ASCENDING, DESCENDING] |
| **page\_size** | **Integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **ownership\_type** | **String**| Filter audiences by ownership type. | [optional] [default to OWNED] [enum: OWNED, RECEIVED] |

### Return type

[**audiences_list_200_response**](../Models/audiences_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="audiences/update"></a>
# **audiences/update**
> Audience audiences/update(ad\_account\_id, audience\_id, AudienceUpdateRequest)

Update audience

    Update (edit or remove) an existing targeting audience.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **ad\_account\_id** | **String**| Unique identifier of an ad account. | [default to null] |
| **audience\_id** | **String**| Unique identifier of an audience | [default to null] |
| **AudienceUpdateRequest** | [**AudienceUpdateRequest**](../Models/AudienceUpdateRequest.md)| The audience to be updated. | |

### Return type

[**Audience**](../Models/Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

