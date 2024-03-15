# CreateMmmReportRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_name** | **String** | Name of the Marketing Mix Modeling (MMM) report | 
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | **String** | DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly. | 
**level** | **String** | Level of the report | 
**targeting_types** | [**Vec<models::MmmReportingTargetingType>**](MMMReportingTargetingType.md) | List of targeting types | 
**columns** | [**Vec<models::MmmReportingColumn>**](MMMReportingColumn.md) | Metric and entity columns | 
**countries** | Option<[**Vec<models::TargetingAdvertiserCountry>**](TargetingAdvertiserCountry.md)> | A List of countries for filtering | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


