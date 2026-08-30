# CatalogItemsApi

All URIs are relative to */v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemsBatchGet**](CatalogItemsApi.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
[**itemsBatchPost**](CatalogItemsApi.md#itemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
[**itemsPost**](CatalogItemsApi.md#itemsPost) | **POST** /catalogs/items | Get catalogs items (POST)



## itemsBatchGet

Get item batch status

Get a single catalogs items batch owned by the \"operating user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch)
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an 'ad_account_id' (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

```bash
 itemsBatchGet batch_id=value  ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **string** | Id of a catalogs items batch to fetch | [default to null]
 **adAccountId** | **string** | Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## itemsBatchPost

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/)
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an 'ad_account_id' (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

Note:
- Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.
- The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.

### Example

```bash
 itemsBatchPost  ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsBatchPostRequest** | [**CatalogsItemsBatchPostRequest**](CatalogsItemsBatchPostRequest.md) |  |
 **adAccountId** | **string** | Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## itemsPost

Get catalogs items (POST)

Get the items of the catalog owned by the \"operation user_account\". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch)
- By default, the \"operation user_account\" is the token user_account.

Optional: Business Access: Specify an 'ad_account_id' (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.

### Example

```bash
 itemsPost  ad_account_id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsRequest** | [**CatalogsItemsRequest**](CatalogsItemsRequest.md) |  |
 **adAccountId** | **string** | Unique identifier of an ad account. | [optional] [default to null]

### Return type

[**ItemsPost200Response**](ItemsPost200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

