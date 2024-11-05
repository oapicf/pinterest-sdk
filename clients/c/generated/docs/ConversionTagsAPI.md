# ConversionTagsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ConversionTagsAPI_conversionTagsCreate**](ConversionTagsAPI.md#ConversionTagsAPI_conversionTagsCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_tags | Create conversion tag
[**ConversionTagsAPI_conversionTagsGet**](ConversionTagsAPI.md#ConversionTagsAPI_conversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/{conversion_tag_id} | Get conversion tag
[**ConversionTagsAPI_conversionTagsList**](ConversionTagsAPI.md#ConversionTagsAPI_conversionTagsList) | **GET** /ad_accounts/{ad_account_id}/conversion_tags | Get conversion tags
[**ConversionTagsAPI_ocpmEligibleConversionTagsGet**](ConversionTagsAPI.md#ConversionTagsAPI_ocpmEligibleConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/ocpm_eligible | Get Ocpm eligible conversion tags
[**ConversionTagsAPI_pageVisitConversionTagsGet**](ConversionTagsAPI.md#ConversionTagsAPI_pageVisitConversionTagsGet) | **GET** /ad_accounts/{ad_account_id}/conversion_tags/page_visit | Get page visit conversion tags


# **ConversionTagsAPI_conversionTagsCreate**
```c
// Create conversion tag
//
// Create a conversion tag, also known as <a href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\" target=\"_blank\">Pinterest tag</a>, with the option to enable enhanced match.<p/> The Pinterest Tag tracks actions people take on the ad account’ s website after they view the ad account's ad on Pinterest. The advertiser needs to customize this tag to track conversions.<p/> For more information, see:<p/> <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-up-the-pinterest-tag\">Set up the Pinterest tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/\">Pinterest Tag</a><p/> <a class=\"reference external\" href=\"/docs/api-features/pinterest-tag/#enhanced-match\">Enhanced match</a>
//
conversion_tag_response_t* ConversionTagsAPI_conversionTagsCreate(apiClient_t *apiClient, char *ad_account_id, conversion_tag_create_t *conversion_tag_create);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**conversion_tag_create** | **[conversion_tag_create_t](conversion_tag_create.md) \*** | Conversion Tag to create | 

### Return type

[conversion_tag_response_t](conversion_tag_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConversionTagsAPI_conversionTagsGet**
```c
// Get conversion tag
//
// Get information about an existing conversion tag.
//
conversion_tag_response_t* ConversionTagsAPI_conversionTagsGet(apiClient_t *apiClient, char *ad_account_id, char *conversion_tag_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**conversion_tag_id** | **char \*** | Id of the conversion tag. | 

### Return type

[conversion_tag_response_t](conversion_tag_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConversionTagsAPI_conversionTagsList**
```c
// Get conversion tags
//
// List conversion tags associated with an ad account.
//
conversion_tag_list_response_t* ConversionTagsAPI_conversionTagsList(apiClient_t *apiClient, char *ad_account_id, int *filter_deleted);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**filter_deleted** | **int \*** | Filter out deleted tags. | [optional] [default to false]

### Return type

[conversion_tag_list_response_t](conversion_tag_list_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConversionTagsAPI_ocpmEligibleConversionTagsGet**
```c
// Get Ocpm eligible conversion tags
//
// Get Ocpm eligible conversion tag events for an ad account.
//
list_t* ConversionTagsAPI_ocpmEligibleConversionTagsGet(apiClient_t *apiClient, char *ad_account_id);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 

### Return type



list_t*



### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ConversionTagsAPI_pageVisitConversionTagsGet**
```c
// Get page visit conversion tags
//
// Get all page visit conversion tag events for an ad account.
//
page_visit_conversion_tags_get_200_response_t* ConversionTagsAPI_pageVisitConversionTagsGet(apiClient_t *apiClient, char *ad_account_id, int *page_size, pinterest_rest_api_pageVisitConversionTagsGet_order_e order, char *bookmark);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**ad_account_id** | **char \*** | Unique identifier of an ad account. | 
**page_size** | **int \*** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
**order** | **pinterest_rest_api_pageVisitConversionTagsGet_order_e** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
**bookmark** | **char \*** | Cursor used to fetch the next page of items | [optional] 

### Return type

[page_visit_conversion_tags_get_200_response_t](page_visit_conversion_tags_get_200_response.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

