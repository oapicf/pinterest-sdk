# CatalogsCreateReportResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**token** | **str** | Token to be used to get the report | [optional] 

## Example

```python
from openapi_client.models.catalogs_create_report_response import CatalogsCreateReportResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreateReportResponse from a JSON string
catalogs_create_report_response_instance = CatalogsCreateReportResponse.from_json(json)
# print the JSON string representation of the object
print CatalogsCreateReportResponse.to_json()

# convert the object into a dict
catalogs_create_report_response_dict = catalogs_create_report_response_instance.to_dict()
# create an instance of CatalogsCreateReportResponse from a dict
catalogs_create_report_response_from_dict = CatalogsCreateReportResponse.from_dict(catalogs_create_report_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


