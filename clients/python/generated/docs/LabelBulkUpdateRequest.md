# LabelBulkUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Label ID. | 
**status** | **str** | Set status to &#x60;ARCHIVED&#x60; to remove the label from the parent entity. | [optional] 
**value** | **str** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; value field will be deprecated. Label name. 100-character limit. | [optional] 

## Example

```python
from pinterestsdk.models.label_bulk_update_request import LabelBulkUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LabelBulkUpdateRequest from a JSON string
label_bulk_update_request_instance = LabelBulkUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(LabelBulkUpdateRequest.to_json())

# convert the object into a dict
label_bulk_update_request_dict = label_bulk_update_request_instance.to_dict()
# create an instance of LabelBulkUpdateRequest from a dict
label_bulk_update_request_from_dict = LabelBulkUpdateRequest.from_dict(label_bulk_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


