# CreateMMMReportRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countries** | [**List[TargetingAdvertiserCountry]**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 
**columns** | [**List[MMMReportingColumn]**](MMMReportingColumn.md) | Metric and entity columns | 
**end_date** | **str** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | **str** | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | 
**level** | **str** | Level of the report | 
**report_name** | **str** | Name of the Marketing Mix Modeling (MMM) report | 
**start_date** | **str** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**targeting_types** | [**List[MMMReportingTargetingType]**](MMMReportingTargetingType.md) | List of targeting types | 

## Example

```python
from pinterestsdk.models.create_mmm_report_request import CreateMMMReportRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateMMMReportRequest from a JSON string
create_mmm_report_request_instance = CreateMMMReportRequest.from_json(json)
# print the JSON string representation of the object
print(CreateMMMReportRequest.to_json())

# convert the object into a dict
create_mmm_report_request_dict = create_mmm_report_request_instance.to_dict()
# create an instance of CreateMMMReportRequest from a dict
create_mmm_report_request_from_dict = CreateMMMReportRequest.from_dict(create_mmm_report_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


