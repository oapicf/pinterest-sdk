# CatalogsCreativeAssetsBatchItem



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: CatalogsCreateCreativeAssetsItem, CatalogsDeleteCreativeAssetsItem, CatalogsUpdateCreativeAssetsItem, CatalogsUpsertCreativeAssetsItem | Creative assets batch item | [optional] 

The discriminator field is `operation` with the following mapping:
 - `CREATE`: `CatalogsCreateCreativeAssetsItem`
 - `DELETE`: `CatalogsDeleteCreativeAssetsItem`
 - `UPDATE`: `CatalogsUpdateCreativeAssetsItem`
 - `UPSERT`: `CatalogsUpsertCreativeAssetsItem`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


