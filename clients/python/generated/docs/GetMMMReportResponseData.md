# GetMMMReportResponseData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_status** | **str** |  | [optional] 
**size** | **float** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.get_mmm_report_response_data import GetMMMReportResponseData

# TODO update the JSON string below
json = "{}"
# create an instance of GetMMMReportResponseData from a JSON string
get_mmm_report_response_data_instance = GetMMMReportResponseData.from_json(json)
# print the JSON string representation of the object
print(GetMMMReportResponseData.to_json())

# convert the object into a dict
get_mmm_report_response_data_dict = get_mmm_report_response_data_instance.to_dict()
# create an instance of GetMMMReportResponseData from a dict
get_mmm_report_response_data_from_dict = GetMMMReportResponseData.from_dict(get_mmm_report_response_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


