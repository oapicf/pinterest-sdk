# CatalogFeedsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**feed_processing_results_list**](CatalogFeedsApi.md#feed_processing_results_list) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
[**feeds_create**](CatalogFeedsApi.md#feeds_create) | **POST** /catalogs/feeds | Create feed
[**feeds_delete**](CatalogFeedsApi.md#feeds_delete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feeds_get**](CatalogFeedsApi.md#feeds_get) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feeds_ingest**](CatalogFeedsApi.md#feeds_ingest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
[**feeds_list**](CatalogFeedsApi.md#feeds_list) | **GET** /catalogs/feeds | List feeds
[**feeds_update**](CatalogFeedsApi.md#feeds_update) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**items_issues_list**](CatalogFeedsApi.md#items_issues_list) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues


# **feed_processing_results_list**
> `feed_processing_results_list`(req::`HTTP.Request`, `feed_id`::`String`; `ad_account_id`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `FeedProcessingResultsList200Response`

List feed processing results

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`feed_id`** | **`String`**| Unique identifier of a feed. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`FeedProcessingResultsList200Response`**](FeedProcessingResultsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_create**
> `feeds_create`(req::`HTTP.Request`, `catalogs_feed_create_request_schema`::`CatalogsFeedCreateRequestSchema`; `ad_account_id`=nothing,) -> `CatalogsFeed`

Create feed

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`catalogs_feed_create_request_schema`** | [**`CatalogsFeedCreateRequestSchema`**](CatalogsFeedCreateRequestSchema.md)|  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]

### Return type

[**`CatalogsFeed`**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_delete**
> `feeds_delete`(req::`HTTP.Request`, `feed_id`::`String`; `ad_account_id`=nothing,) -> `CatalogsFeed`

Delete feed

Delete a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`feed_id`** | **`String`**| Unique identifier of a feed. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]

### Return type

[**`CatalogsFeed`**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_get**
> `feeds_get`(req::`HTTP.Request`, `feed_id`::`String`; `ad_account_id`=nothing,) -> `CatalogsFeed`

Get feed

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`feed_id`** | **`String`**| Unique identifier of a feed. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]

### Return type

[**`CatalogsFeed`**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_ingest**
> `feeds_ingest`(req::`HTTP.Request`, `feed_id`::`String`; `ad_account_id`=nothing,) -> `CatalogsFeedIngestion`

Ingest feed items

Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`feed_id`** | **`String`**| Unique identifier of a feed. |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]

### Return type

[**`CatalogsFeedIngestion`**](CatalogsFeedIngestion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_list**
> `feeds_list`(req::`HTTP.Request`; `catalog_id`=nothing, `ad_account_id`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `FeedsList200Response`

List feeds

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`catalog_id`** | **`String`**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [default to nothing]
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`FeedsList200Response`**](FeedsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_update**
> `feeds_update`(req::`HTTP.Request`, `feed_id`::`String`, `catalogs_feed_update_request_schema`::`CatalogsFeedUpdateRequestSchema`; `ad_account_id`=nothing,) -> `CatalogsFeed`

Update feed

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to [Before you get started with Catalogs](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs). For Hotel partners, refer to [Pinterest API for shopping](/docs/api-features/shopping-overview/).  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`feed_id`** | **`String`**| Unique identifier of a feed. |
**`catalogs_feed_update_request_schema`** | [**`CatalogsFeedUpdateRequestSchema`**](CatalogsFeedUpdateRequestSchema.md)|  |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]

### Return type

[**`CatalogsFeed`**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_issues_list**
> `items_issues_list`(req::`HTTP.Request`, `processing_result_id`::`String`; `item_numbers`=nothing, `item_validation_issue`=nothing, `ad_account_id`=nothing, `bookmark`=nothing, `page_size`=nothing,) -> `ItemsIssuesList200Response`

List item issues

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to [Build catalogs report](/docs/api/v5/#operation/reports/create) and [Get catalogs report](/docs/api/v5/#operation/reports/get) endpoints. Moreover, they support multiple types of catalogs.  [Learn more](/docs/api-features/shopping-overview/)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`processing_result_id`** | **`String`**| Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`item_numbers`** | [**`Vector{Int64}`**](Int64.md)| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [default to nothing]
 **`item_validation_issue`** | [**`CatalogsItemValidationIssue`**](.md)| Filter item validation issues that have a given type of item validation issue. | [default to nothing]
 **`ad_account_id`** | **`String`**| Unique identifier of an ad account. | [default to nothing]
 **`bookmark`** | **`String`**| Cursor used to fetch the next page of items | [default to nothing]
 **`page_size`** | **`Int64`**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [default to 25]

### Return type

[**`ItemsIssuesList200Response`**](ItemsIssuesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

