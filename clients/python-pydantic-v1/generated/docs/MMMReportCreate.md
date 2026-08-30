# MMMReportCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_ids** | **List[str]** | Advertiser IDs for multi-advertiser report | [optional] 
**columns** | [**List[MMMReportingColumn]**](MMMReportingColumn.md) | Metric and entity columns | 
**countries** | [**List[TargetingAdvertiserCountry]**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 
**custom_column_ids** | **List[str]** | List of custom column IDs | [optional] 
**end_date** | **str** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**MMMReportGranularity**](MMMReportGranularity.md) |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | 
**level** | [**MMMReportLevel**](MMMReportLevel.md) | Level of the report | 
**report_name** | **str** | Name of the Marketing Mix Modeling (MMM) report | 
**start_date** | **str** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**targeting_types** | [**List[MMMReportingTargetingType]**](MMMReportingTargetingType.md) | List of targeting types | 

## Example

```python
from openapi_client.models.mmm_report_create import MMMReportCreate

# TODO update the JSON string below
json = "{}"
# create an instance of MMMReportCreate from a JSON string
mmm_report_create_instance = MMMReportCreate.from_json(json)
# print the JSON string representation of the object
print MMMReportCreate.to_json()

# convert the object into a dict
mmm_report_create_dict = mmm_report_create_instance.to_dict()
# create an instance of MMMReportCreate from a dict
mmm_report_create_from_dict = MMMReportCreate.from_dict(mmm_report_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


