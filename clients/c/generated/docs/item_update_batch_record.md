# item_update_batch_record_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **char \*** | The catalog item id in the merchant namespace | [optional] 
**attributes** | [**updatable_item_attributes_t**](updatable_item_attributes.md) \* |  | [optional] 
**update_mask** | [**list_t**](update_mask_field_type.md) \* | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


