# LeadsExportCreateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**leads_export_id** | **str** | ID for the leads export job | [optional] 

## Example

```python
from pinterestsdk.models.leads_export_create_response import LeadsExportCreateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of LeadsExportCreateResponse from a JSON string
leads_export_create_response_instance = LeadsExportCreateResponse.from_json(json)
# print the JSON string representation of the object
print(LeadsExportCreateResponse.to_json())

# convert the object into a dict
leads_export_create_response_dict = leads_export_create_response_instance.to_dict()
# create an instance of LeadsExportCreateResponse from a dict
leads_export_create_response_from_dict = LeadsExportCreateResponse.from_dict(leads_export_create_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


