# CreativeAssetsProcessingRecord

Object describing an item processing record

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creative_assets_id** | **str** | The catalog creative assets id in the merchant namespace | [optional] 
**errors** | [**List[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**status** | [**ItemProcessingStatus**](ItemProcessingStatus.md) |  | [optional] 
**warnings** | [**List[ItemValidationEvent]**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 

## Example

```python
from openapi_client.models.creative_assets_processing_record import CreativeAssetsProcessingRecord

# TODO update the JSON string below
json = "{}"
# create an instance of CreativeAssetsProcessingRecord from a JSON string
creative_assets_processing_record_instance = CreativeAssetsProcessingRecord.from_json(json)
# print the JSON string representation of the object
print CreativeAssetsProcessingRecord.to_json()

# convert the object into a dict
creative_assets_processing_record_dict = creative_assets_processing_record_instance.to_dict()
# create an instance of CreativeAssetsProcessingRecord from a dict
creative_assets_processing_record_from_dict = CreativeAssetsProcessingRecord.from_dict(creative_assets_processing_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


