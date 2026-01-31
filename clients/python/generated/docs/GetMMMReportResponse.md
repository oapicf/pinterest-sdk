# GetMMMReportResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **float** |  | [optional] 
**data** | [**GetMMMReportResponseData**](GetMMMReportResponseData.md) |  | [optional] 
**message** | **str** |  | [optional] 
**status** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.get_mmm_report_response import GetMMMReportResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetMMMReportResponse from a JSON string
get_mmm_report_response_instance = GetMMMReportResponse.from_json(json)
# print the JSON string representation of the object
print(GetMMMReportResponse.to_json())

# convert the object into a dict
get_mmm_report_response_dict = get_mmm_report_response_instance.to_dict()
# create an instance of GetMMMReportResponse from a dict
get_mmm_report_response_from_dict = GetMMMReportResponse.from_dict(get_mmm_report_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


