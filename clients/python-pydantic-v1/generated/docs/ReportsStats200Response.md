# ReportsStats200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[CatalogsReportStats]**](CatalogsReportStats.md) |  | 

## Example

```python
from openapi_client.models.reports_stats200_response import ReportsStats200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ReportsStats200Response from a JSON string
reports_stats200_response_instance = ReportsStats200Response.from_json(json)
# print the JSON string representation of the object
print ReportsStats200Response.to_json()

# convert the object into a dict
reports_stats200_response_dict = reports_stats200_response_instance.to_dict()
# create an instance of ReportsStats200Response from a dict
reports_stats200_response_from_dict = ReportsStats200Response.from_dict(reports_stats200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


