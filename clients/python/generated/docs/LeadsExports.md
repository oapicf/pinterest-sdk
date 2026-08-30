# LeadsExports


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leads_export_id** | **str** | ID for the leads export job. | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.leads_exports import LeadsExports

# TODO update the JSON string below
json = "{}"
# create an instance of LeadsExports from a JSON string
leads_exports_instance = LeadsExports.from_json(json)
# print the JSON string representation of the object
print(LeadsExports.to_json())

# convert the object into a dict
leads_exports_dict = leads_exports_instance.to_dict()
# create an instance of LeadsExports from a dict
leads_exports_from_dict = LeadsExports.from_dict(leads_exports_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


