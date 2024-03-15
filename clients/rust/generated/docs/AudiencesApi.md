# \AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiences_slash_create**](AudiencesApi.md#audiences_slash_create) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiences_slash_create_custom**](AudiencesApi.md#audiences_slash_create_custom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
[**audiences_slash_get**](AudiencesApi.md#audiences_slash_get) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiences_slash_list**](AudiencesApi.md#audiences_slash_list) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiences_slash_update**](AudiencesApi.md#audiences_slash_update) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience



## audiences_slash_create

> models::Audience audiences_slash_create(ad_account_id, audience_create_request)
Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**audience_create_request** | [**AudienceCreateRequest**](AudienceCreateRequest.md) | List of ads to create, size limit [1, 30] | [required] |

### Return type

[**models::Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## audiences_slash_create_custom

> models::Audience audiences_slash_create_custom(ad_account_id, audience_create_custom_request)
Create custom audience

Create a custom audience and find the audiences you want your ads to reach.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**audience_create_custom_request** | [**AudienceCreateCustomRequest**](AudienceCreateCustomRequest.md) | Custom audience to create. | [required] |

### Return type

[**models::Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## audiences_slash_get

> models::Audience audiences_slash_get(ad_account_id, audience_id)
Get audience

Get a specific audience given the audience ID.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**audience_id** | **String** | Unique identifier of an audience | [required] |

### Return type

[**models::Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## audiences_slash_list

> models::AudiencesList200Response audiences_slash_list(ad_account_id, bookmark, order, page_size, ownership_type)
List audiences

Get list of audiences for the ad account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**bookmark** | Option<**String**> | Cursor used to fetch the next page of items |  |
**order** | Option<**String**> | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. |  |
**page_size** | Option<**i32**> | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. |  |[default to 25]
**ownership_type** | Option<**String**> | <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type. |  |[default to OWNED]

### Return type

[**models::AudiencesList200Response**](audiences_list_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## audiences_slash_update

> models::Audience audiences_slash_update(ad_account_id, audience_id, audience_update_request)
Update audience

Update (edit or remove) an existing targeting audience.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**ad_account_id** | **String** | Unique identifier of an ad account. | [required] |
**audience_id** | **String** | Unique identifier of an audience | [required] |
**audience_update_request** | Option<[**AudienceUpdateRequest**](AudienceUpdateRequest.md)> | The audience to be updated. |  |

### Return type

[**models::Audience**](Audience.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

