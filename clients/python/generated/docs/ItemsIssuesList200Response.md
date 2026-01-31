# ItemsIssuesList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[CatalogsItemValidationIssues]**](CatalogsItemValidationIssues.md) |  | 

## Example

```python
from pinterestsdk.models.items_issues_list200_response import ItemsIssuesList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ItemsIssuesList200Response from a JSON string
items_issues_list200_response_instance = ItemsIssuesList200Response.from_json(json)
# print the JSON string representation of the object
print(ItemsIssuesList200Response.to_json())

# convert the object into a dict
items_issues_list200_response_dict = items_issues_list200_response_instance.to_dict()
# create an instance of ItemsIssuesList200Response from a dict
items_issues_list200_response_from_dict = ItemsIssuesList200Response.from_dict(items_issues_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


