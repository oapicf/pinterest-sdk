# CatalogsReport


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_status** | **str** |  | [optional] 
**size** | **float** | Size of the report in bytes | [optional] 
**url** | **str** | URL to download the report | [optional] 

## Example

```python
from openapi_client.models.catalogs_report import CatalogsReport

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsReport from a JSON string
catalogs_report_instance = CatalogsReport.from_json(json)
# print the JSON string representation of the object
print CatalogsReport.to_json()

# convert the object into a dict
catalogs_report_dict = catalogs_report_instance.to_dict()
# create an instance of CatalogsReport from a dict
catalogs_report_from_dict = CatalogsReport.from_dict(catalogs_report_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


