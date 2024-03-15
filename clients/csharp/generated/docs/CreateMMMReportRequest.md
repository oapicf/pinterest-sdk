# Org.OpenAPITools.Model.CreateMMMReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ReportName** | **string** | Name of the Marketing Mix Modeling (MMM) report | 
**StartDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**EndDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**Granularity** | **string** | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | 
**Level** | **string** | Level of the report | 
**TargetingTypes** | [**List&lt;MMMReportingTargetingType&gt;**](MMMReportingTargetingType.md) | List of targeting types | 
**Columns** | [**List&lt;MMMReportingColumn&gt;**](MMMReportingColumn.md) | Metric and entity columns | 
**Countries** | [**List&lt;TargetingAdvertiserCountry&gt;**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

