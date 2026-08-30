# Org.OpenAPITools.Model.MMMReportCreate
Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Columns** | [**List&lt;MMMReportingColumn&gt;**](MMMReportingColumn.md) | Metric and entity columns | 
**EndDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**Granularity** | **MMMReportGranularity** |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | 
**Level** | **MMMReportLevel** | Level of the report | 
**ReportName** | **string** | Name of the Marketing Mix Modeling (MMM) report | 
**StartDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**TargetingTypes** | [**List&lt;MMMReportingTargetingType&gt;**](MMMReportingTargetingType.md) | List of targeting types | 
**AdvertiserIds** | **List&lt;string&gt;** | Advertiser IDs for multi-advertiser report | [optional] 
**Countries** | [**List&lt;TargetingAdvertiserCountry&gt;**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 
**CustomColumnIds** | **List&lt;string&gt;** | List of custom column IDs | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

