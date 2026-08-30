# LabelBulkCreateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labels** | [**List[LabelCreateItem]**](LabelCreateItem.md) | Labels that you are applying to the campaign. | 
**parent_id** | **str** | Unique identifier of the asset you are labelling. Currently, you can only label campaigns. | 

## Example

```python
from openapi_client.models.label_bulk_create_request import LabelBulkCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LabelBulkCreateRequest from a JSON string
label_bulk_create_request_instance = LabelBulkCreateRequest.from_json(json)
# print the JSON string representation of the object
print LabelBulkCreateRequest.to_json()

# convert the object into a dict
label_bulk_create_request_dict = label_bulk_create_request_instance.to_dict()
# create an instance of LabelBulkCreateRequest from a dict
label_bulk_create_request_from_dict = LabelBulkCreateRequest.from_dict(label_bulk_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


