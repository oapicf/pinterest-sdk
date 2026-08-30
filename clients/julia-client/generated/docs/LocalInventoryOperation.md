# LocalInventoryOperation



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: LocalInventoryCreateOperation, LocalInventoryDeleteOperation, LocalInventoryUpdateOperation, LocalInventoryUpsertOperation |  | [optional] 

The discriminator field is `operation` with the following mapping:
 - `CREATE`: `LocalInventoryCreateOperation`
 - `DELETE`: `LocalInventoryDeleteOperation`
 - `UPDATE`: `LocalInventoryUpdateOperation`
 - `UPSERT`: `LocalInventoryUpsertOperation`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


