# LeadsExportsCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_id** | **str** | ID for the ad collecting leads. | 
**end_date** | **str** | Export leads collected on and before end date (UTC). Format: YYYY-MM-DD. | 
**start_date** | **str** | Export leads collected on and after start date (UTC). Format: YYYY-MM-DD. | 

## Example

```python
from pinterestsdk.models.leads_exports_create import LeadsExportsCreate

# TODO update the JSON string below
json = "{}"
# create an instance of LeadsExportsCreate from a JSON string
leads_exports_create_instance = LeadsExportsCreate.from_json(json)
# print the JSON string representation of the object
print(LeadsExportsCreate.to_json())

# convert the object into a dict
leads_exports_create_dict = leads_exports_create_instance.to_dict()
# create an instance of LeadsExportsCreate from a dict
leads_exports_create_from_dict = LeadsExportsCreate.from_dict(leads_exports_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


