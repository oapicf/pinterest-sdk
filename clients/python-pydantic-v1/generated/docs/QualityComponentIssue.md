# QualityComponentIssue

Details of an issue with a quality component.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier for the issue check. | 
**name** | **str** | Human-readable name of the issue. | 
**reason** | **str** | Detailed reason for the issue. | 

## Example

```python
from openapi_client.models.quality_component_issue import QualityComponentIssue

# TODO update the JSON string below
json = "{}"
# create an instance of QualityComponentIssue from a JSON string
quality_component_issue_instance = QualityComponentIssue.from_json(json)
# print the JSON string representation of the object
print QualityComponentIssue.to_json()

# convert the object into a dict
quality_component_issue_dict = quality_component_issue_instance.to_dict()
# create an instance of QualityComponentIssue from a dict
quality_component_issue_from_dict = QualityComponentIssue.from_dict(quality_component_issue_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


