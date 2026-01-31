# CreateMMMReportResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **float** |  | [optional] 
**data** | [**CreateMMMReportResponseData**](CreateMMMReportResponseData.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.create_mmm_report_response import CreateMMMReportResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateMMMReportResponse from a JSON string
create_mmm_report_response_instance = CreateMMMReportResponse.from_json(json)
# print the JSON string representation of the object
print(CreateMMMReportResponse.to_json())

# convert the object into a dict
create_mmm_report_response_dict = create_mmm_report_response_instance.to_dict()
# create an instance of CreateMMMReportResponse from a dict
create_mmm_report_response_from_dict = CreateMMMReportResponse.from_dict(create_mmm_report_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


