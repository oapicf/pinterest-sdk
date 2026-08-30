# QualityComponentDetails

Metrics for a specific event type within a quality component.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**coverage** | **float** | Coverage percentage for this event type. | 
**issues** | [**List[QualityComponentIssue]**](QualityComponentIssue.md) | List of issues detected for this event type, if any. | [optional] 
**overlap** | **float** | Overlap percentage for this event type. Only populated for external_event_id | [optional] 

## Example

```python
from openapi_client.models.quality_component_details import QualityComponentDetails

# TODO update the JSON string below
json = "{}"
# create an instance of QualityComponentDetails from a JSON string
quality_component_details_instance = QualityComponentDetails.from_json(json)
# print the JSON string representation of the object
print QualityComponentDetails.to_json()

# convert the object into a dict
quality_component_details_dict = quality_component_details_instance.to_dict()
# create an instance of QualityComponentDetails from a dict
quality_component_details_from_dict = QualityComponentDetails.from_dict(quality_component_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


