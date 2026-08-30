# OAIMMMReportCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserIds** | **NSArray&lt;NSString*&gt;*** | Advertiser IDs for multi-advertiser report | [optional] 
**columns** | [**NSArray&lt;OAIMMMReportingColumn&gt;***](OAIMMMReportingColumn.md) | Metric and entity columns | 
**countries** | [**NSArray&lt;OAITargetingAdvertiserCountry&gt;***](OAITargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 
**customColumnIds** | **NSArray&lt;NSString*&gt;*** | List of custom column IDs | [optional] 
**endDate** | **NSString*** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**OAIMMMReportGranularity***](OAIMMMReportGranularity.md) |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | 
**level** | [**OAIMMMReportLevel***](OAIMMMReportLevel.md) | Level of the report | 
**reportName** | **NSString*** | Name of the Marketing Mix Modeling (MMM) report | 
**startDate** | **NSString*** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**targetingTypes** | [**NSArray&lt;OAIMMMReportingTargetingType&gt;***](OAIMMMReportingTargetingType.md) | List of targeting types | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


