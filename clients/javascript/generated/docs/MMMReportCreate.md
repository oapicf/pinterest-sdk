# PinterestSdk.MMMReportCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advertiserIds** | **[String]** | Advertiser IDs for multi-advertiser report | [optional] 
**columns** | [**[MMMReportingColumn]**](MMMReportingColumn.md) | Metric and entity columns | 
**countries** | [**[TargetingAdvertiserCountry]**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] 
**customColumnIds** | **[String]** | List of custom column IDs | [optional] 
**endDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | [**MMMReportGranularity**](MMMReportGranularity.md) |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. | 
**level** | [**MMMReportLevel**](MMMReportLevel.md) | Level of the report | 
**reportName** | **String** | Name of the Marketing Mix Modeling (MMM) report | 
**startDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**targetingTypes** | [**[MMMReportingTargetingType]**](MMMReportingTargetingType.md) | List of targeting types | 


