# MMMReport


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message** | **str** |  | [optional] [readonly] 
**report_status** | [**BulkReportingJobStatus**](BulkReportingJobStatus.md) |  | [optional] [readonly] 
**size** | **float** |  | [optional] [readonly] 
**status** | **str** |  | [optional] [readonly] 
**token** | **str** |  | [optional] [readonly] 
**url** | **str** |  | [optional] [readonly] 

## Example

```python
from pinterestsdk.models.mmm_report import MMMReport

# TODO update the JSON string below
json = "{}"
# create an instance of MMMReport from a JSON string
mmm_report_instance = MMMReport.from_json(json)
# print the JSON string representation of the object
print(MMMReport.to_json())

# convert the object into a dict
mmm_report_dict = mmm_report_instance.to_dict()
# create an instance of MMMReport from a dict
mmm_report_from_dict = MMMReport.from_dict(mmm_report_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


