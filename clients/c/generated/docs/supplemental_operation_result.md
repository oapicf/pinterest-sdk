# supplemental_operation_result_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**list_t**](supplemental_item_validation_event.md) \* | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**item_id** | **char \*** | Catalog item id in the merchant namespace | 
**status** | **supplemental_item_processing_status_t \*** | Status of the item processing record | 
**store_code** | **char \*** | Store code for the local inventory item | 
**supplemental_type** | **pinterest_rest_api_supplemental_operation_result_SUPPLEMENTALTYPE_e** |  | 
**warnings** | [**list_t**](supplemental_item_validation_event.md) \* | Array with the validation warnings for the item processing record | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


