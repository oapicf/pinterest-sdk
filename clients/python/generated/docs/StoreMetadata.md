# StoreMetadata

Store metadata for a specific store location

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**geohash** | **str** | Geohash of the store location | [optional] 
**latitude** | **float** | Geographic latitude coordinate of the store | [optional] 
**longitude** | **float** | Geographic longitude coordinate of the store | [optional] 
**store_code** | **str** | Merchant provided store code | 
**store_id** | **str** | Internal store code | 
**store_name** | **str** | Store name | [optional] 

## Example

```python
from pinterestsdk.models.store_metadata import StoreMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of StoreMetadata from a JSON string
store_metadata_instance = StoreMetadata.from_json(json)
# print the JSON string representation of the object
print(StoreMetadata.to_json())

# convert the object into a dict
store_metadata_dict = store_metadata_instance.to_dict()
# create an instance of StoreMetadata from a dict
store_metadata_from_dict = StoreMetadata.from_dict(store_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


