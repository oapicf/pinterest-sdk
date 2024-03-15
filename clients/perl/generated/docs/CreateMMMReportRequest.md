# WWW::OpenAPIClient::Object::CreateMMMReportRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CreateMMMReportRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_name** | **string** | Name of the Marketing Mix Modeling (MMM) report | 
**start_date** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**end_date** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | **string** | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | 
**level** | **string** | Level of the report | 
**targeting_types** | [**ARRAY[MMMReportingTargetingType]**](MMMReportingTargetingType.md) | List of targeting types | 
**columns** | [**ARRAY[MMMReportingColumn]**](MMMReportingColumn.md) | Metric and entity columns | 
**countries** | [**ARRAY[TargetingAdvertiserCountry]**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


