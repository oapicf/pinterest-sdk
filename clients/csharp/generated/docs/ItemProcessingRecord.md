
# Org.OpenAPITools.Model.ItemProcessingRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **string** | The catalog item id in the merchant namespace | [optional] 
**Errors** | [**List&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**Warnings** | [**List&lt;ItemValidationEvent&gt;**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 
**Status** | **ItemProcessingStatus** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to README]](../README.md)

