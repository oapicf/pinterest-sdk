# MmmReportCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiser_ids** | Option<**Vec<String>**> | Advertiser IDs for multi-advertiser report | [optional]
**columns** | [**Vec<models::MmmReportingColumn>**](MMMReportingColumn.md) | Metric and entity columns | 
**countries** | Option<[**Vec<models::TargetingAdvertiserCountry>**](TargetingAdvertiserCountry.md)> | A List of countries for filtering | [optional]
**custom_column_ids** | Option<**Vec<String>**> | List of custom column IDs | [optional]
**end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**models::MmmReportGranularity**](MMMReportGranularity.md) |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | 
**level** | [**models::MmmReportLevel**](MMMReportLevel.md) | Level of the report | 
**report_name** | **String** | Name of the Marketing Mix Modeling (MMM) report | 
**start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**targeting_types** | [**Vec<models::MmmReportingTargetingType>**](MMMReportingTargetingType.md) | List of targeting types | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


