# # ItemsBatchPostRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **string** |  |
**country** | [**\OpenAPI\Client\Model\Country**](Country.md) |  |
**language** | **string** | We recommend using the CatalogsLocale values. |
**items** | [**\OpenAPI\Client\Model\ItemDeleteBatchRecord[]**](ItemDeleteBatchRecord.md) | Array with catalogs items |
**catalog_id** | **string** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional]
**operation** | [**\OpenAPI\Client\Model\BatchOperation**](BatchOperation.md) |  |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
