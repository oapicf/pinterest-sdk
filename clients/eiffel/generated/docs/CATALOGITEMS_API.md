# CATALOGITEMS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**items_batch_get**](CATALOGITEMS_API.md#items_batch_get) | **Get** /catalogs/items/batch/{batch_id} | Get item batch status
[**items_batch_post**](CATALOGITEMS_API.md#items_batch_post) | **Post** /catalogs/items/batch | Operate on item batch
[**items_post**](CATALOGITEMS_API.md#items_post) | **Post** /catalogs/items | Get catalogs items (POST)


# **items_batch_get**
> items_batch_get (batch_id: STRING_32 ; ad_account_id:  detachable STRING_32 ): detachable CATALOGS_ITEMS_BATCH


Get item batch status

Get a single catalogs items batch owned by the \"operating user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **STRING_32**| Id of a catalogs items batch to fetch | [default to null]
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CATALOGS_ITEMS_BATCH**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_batch_post**
> items_batch_post (catalogs_items_batch_post_request: CATALOGS_ITEMS_BATCH_POST_REQUEST ; ad_account_id:  detachable STRING_32 ): detachable CATALOGS_ITEMS_BATCH


Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_items_batch_post_request** | [**CATALOGS_ITEMS_BATCH_POST_REQUEST**](CATALOGS_ITEMS_BATCH_POST_REQUEST.md)|  | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CATALOGS_ITEMS_BATCH**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_post**
> items_post (catalogs_items_request: CATALOGS_ITEMS_REQUEST ; ad_account_id:  detachable STRING_32 ): detachable ITEMS_POST_200_RESPONSE


Get catalogs items (POST)

Get the items of the catalog owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch) - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_items_request** | [**CATALOGS_ITEMS_REQUEST**](CATALOGS_ITEMS_REQUEST.md)|  | 
 **ad_account_id** | **STRING_32**| Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**ITEMS_POST_200_RESPONSE**](items_post_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

