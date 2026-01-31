# CreateMMMReportRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**countries** | [**OpenAPI\Server\Model\TargetingAdvertiserCountry**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 
**reportName** | **string** | Name of the Marketing Mix Modeling (MMM) report | 
**startDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | **string** | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. | 
**level** | **string** | Level of the report | 
**targetingTypes** | [**OpenAPI\Server\Model\MMMReportingTargetingType**](MMMReportingTargetingType.md) | List of targeting types | 
**columns** | [**OpenAPI\Server\Model\MMMReportingColumn**](MMMReportingColumn.md) | Metric and entity columns | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


