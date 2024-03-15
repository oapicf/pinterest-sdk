# CreateMMMReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportName** | **String** | Name of the Marketing Mix Modeling (MMM) report | 
**startDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | **String** | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | 
**level** | **String** | Level of the report | 
**targetingTypes** | [MMMReportingTargetingType] | List of targeting types | 
**columns** | [MMMReportingColumn] | Metric and entity columns | 
**countries** | [TargetingAdvertiserCountry] | A List of countries for filtering | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


