# LeadsExportCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_id** | **str** | ID for the ad collecting leads | 
**end_date** | **str** | Export leads collected on and before end date (UTC). Format: YYYY-MM-DD | 
**start_date** | **str** | Export leads collected on and after start date (UTC). Format: YYYY-MM-DD | 

## Example

```python
from pinterestsdk.models.leads_export_create_request import LeadsExportCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LeadsExportCreateRequest from a JSON string
leads_export_create_request_instance = LeadsExportCreateRequest.from_json(json)
# print the JSON string representation of the object
print(LeadsExportCreateRequest.to_json())

# convert the object into a dict
leads_export_create_request_dict = leads_export_create_request_instance.to_dict()
# create an instance of LeadsExportCreateRequest from a dict
leads_export_create_request_from_dict = LeadsExportCreateRequest.from_dict(leads_export_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


