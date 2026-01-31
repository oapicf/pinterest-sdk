# CreateMMMReportResponseData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] 
**report_status** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] 
**status** | **str** |  | [optional] 
**token** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.create_mmm_report_response_data import CreateMMMReportResponseData

# TODO update the JSON string below
json = "{}"
# create an instance of CreateMMMReportResponseData from a JSON string
create_mmm_report_response_data_instance = CreateMMMReportResponseData.from_json(json)
# print the JSON string representation of the object
print(CreateMMMReportResponseData.to_json())

# convert the object into a dict
create_mmm_report_response_data_dict = create_mmm_report_response_data_instance.to_dict()
# create an instance of CreateMMMReportResponseData from a dict
create_mmm_report_response_data_from_dict = CreateMMMReportResponseData.from_dict(create_mmm_report_response_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


