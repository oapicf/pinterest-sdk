# ConversionHealthSelectionItem

User selection of conversion health criteria for a single feature

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversion_type** | **object** | Status for conversion types | [optional] 
**criteria** | **object** | Status for criteria | [optional] 
**ingestion_source** | **object** | Status for ingestion sources | [optional] 
**status** | **object** | Overall status for this selection item | 

## Example

```python
from openapi_client.models.conversion_health_selection_item import ConversionHealthSelectionItem

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionHealthSelectionItem from a JSON string
conversion_health_selection_item_instance = ConversionHealthSelectionItem.from_json(json)
# print the JSON string representation of the object
print ConversionHealthSelectionItem.to_json()

# convert the object into a dict
conversion_health_selection_item_dict = conversion_health_selection_item_instance.to_dict()
# create an instance of ConversionHealthSelectionItem from a dict
conversion_health_selection_item_from_dict = ConversionHealthSelectionItem.from_dict(conversion_health_selection_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


