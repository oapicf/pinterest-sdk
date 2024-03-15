# OAICreateMMMReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportName** | **NSString*** | Name of the Marketing Mix Modeling (MMM) report | 
**startDate** | **NSString*** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **NSString*** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | **NSString*** | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | 
**level** | **NSString*** | Level of the report | 
**targetingTypes** | [**NSArray&lt;OAIMMMReportingTargetingType&gt;***](OAIMMMReportingTargetingType.md) | List of targeting types | 
**columns** | [**NSArray&lt;OAIMMMReportingColumn&gt;***](OAIMMMReportingColumn.md) | Metric and entity columns | 
**countries** | [**NSArray&lt;OAITargetingAdvertiserCountry&gt;***](OAITargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


