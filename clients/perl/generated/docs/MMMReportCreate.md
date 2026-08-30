# WWW::OpenAPIClient::Object::MMMReportCreate

## Load the model package
```perl
use WWW::OpenAPIClient::Object::MMMReportCreate;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_ids** | **ARRAY[string]** | Advertiser IDs for multi-advertiser report | [optional] 
**columns** | [**ARRAY[MMMReportingColumn]**](MMMReportingColumn.md) | Metric and entity columns | 
**countries** | [**ARRAY[TargetingAdvertiserCountry]**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 
**custom_column_ids** | **ARRAY[string]** | List of custom column IDs | [optional] 
**end_date** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**MMMReportGranularity**](MMMReportGranularity.md) |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | 
**level** | [**MMMReportLevel**](MMMReportLevel.md) | Level of the report | 
**report_name** | **string** | Name of the Marketing Mix Modeling (MMM) report | 
**start_date** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**targeting_types** | [**ARRAY[MMMReportingTargetingType]**](MMMReportingTargetingType.md) | List of targeting types | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


