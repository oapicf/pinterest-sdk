# LeadsExportResponseData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**download_url** | **str** |  | [optional] 
**export_status** | [**LeadsExportStatus**](LeadsExportStatus.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.leads_export_response_data import LeadsExportResponseData

# TODO update the JSON string below
json = "{}"
# create an instance of LeadsExportResponseData from a JSON string
leads_export_response_data_instance = LeadsExportResponseData.from_json(json)
# print the JSON string representation of the object
print(LeadsExportResponseData.to_json())

# convert the object into a dict
leads_export_response_data_dict = leads_export_response_data_instance.to_dict()
# create an instance of LeadsExportResponseData from a dict
leads_export_response_data_from_dict = LeadsExportResponseData.from_dict(leads_export_response_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


