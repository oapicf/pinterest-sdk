# WWW::OpenAPIClient::Object::CreativeAssetsProcessingRecord

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CreativeAssetsProcessingRecord;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creative_assets_id** | **string** | The catalog creative assets id in the merchant namespace | [optional] 
**errors** | [**ARRAY[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**warnings** | [**ARRAY[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 
**status** | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


