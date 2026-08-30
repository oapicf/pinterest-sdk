# CatalogsHotelBatchItem



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: CatalogsCreateHotelItem, CatalogsDeleteHotelItem, CatalogsUpdateHotelItem, CatalogsUpsertHotelItem | Hotel batch item | [optional] 

The discriminator field is `operation` with the following mapping:
 - `CREATE`: `CatalogsCreateHotelItem`
 - `DELETE`: `CatalogsDeleteHotelItem`
 - `UPDATE`: `CatalogsUpdateHotelItem`
 - `UPSERT`: `CatalogsUpsertHotelItem`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


